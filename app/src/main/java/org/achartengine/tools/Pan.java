package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/tools/Pan.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/tools/Pan.class */
public class Pan extends AbstractTool {
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private List<PanListener> mPanListeners;

    public Pan(AbstractChart abstractChart) {
        super(abstractChart);
        this.mPanListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
    }

    private double getAxisRatio(double[] dArr) {
        return Math.abs(dArr[1] - dArr[0]) / Math.abs(dArr[3] - dArr[2]);
    }

    private void notifyPanListeners() {
        synchronized (this) {
            Iterator<PanListener> it = this.mPanListeners.iterator();
            while (it.hasNext()) {
                it.next().panApplied();
            }
        }
    }

    public void addPanListener(PanListener panListener) {
        synchronized (this) {
            this.mPanListeners.add(panListener);
        }
    }

    public void apply(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            double[] panLimits = this.mRenderer.getPanLimits();
            boolean z12 = panLimits != null && panLimits.length == 4;
            XYChart xYChart = (XYChart) this.mChart;
            boolean z13 = true;
            boolean z14 = true;
            int i10 = 0;
            boolean z15 = true;
            boolean z16 = true;
            while (true) {
                boolean z17 = z16;
                if (i10 >= scalesCount) {
                    break;
                }
                double[] range = getRange(i10);
                double[] calcRange = xYChart.getCalcRange(i10);
                if (this.limitsReachedX && this.limitsReachedY) {
                    if (range[0] == range[1] && calcRange[0] == calcRange[1]) {
                        return;
                    }
                    if (range[2] == range[3] && calcRange[2] == calcRange[3]) {
                        return;
                    }
                }
                checkRange(range, i10);
                double[] realPoint = xYChart.toRealPoint(f10, f11, i10);
                double[] realPoint2 = xYChart.toRealPoint(f12, f13, i10);
                double d10 = realPoint[0] - realPoint2[0];
                double d11 = realPoint[1] - realPoint2[1];
                double axisRatio = getAxisRatio(range);
                double d12 = d11;
                double d13 = d10;
                if (xYChart.isVertical(this.mRenderer)) {
                    d12 = d10 / axisRatio;
                    d13 = (-d11) * axisRatio;
                }
                if (this.mRenderer.isPanXEnabled()) {
                    boolean z18 = z13;
                    boolean z19 = z14;
                    if (panLimits != null) {
                        boolean z20 = z13;
                        if (z13) {
                            z20 = panLimits[0] <= range[0] + d13;
                        }
                        z18 = z20;
                        z19 = z14;
                        if (z14) {
                            if (panLimits[1] >= range[1] + d13) {
                                z19 = true;
                                z18 = z20;
                            } else {
                                z19 = false;
                                z18 = z20;
                            }
                        }
                    }
                    z10 = z18;
                    z14 = z19;
                    if (!z12 || (z10 && z14)) {
                        setXRange(range[0] + d13, range[1] + d13, i10);
                        this.limitsReachedX = false;
                    } else {
                        this.limitsReachedX = true;
                    }
                } else {
                    z10 = z13;
                }
                if (this.mRenderer.isPanYEnabled()) {
                    boolean z21 = z15;
                    z11 = z17;
                    if (panLimits != null) {
                        boolean z22 = z15;
                        if (z15) {
                            z22 = panLimits[2] <= range[2] + d12;
                        }
                        z21 = z22;
                        z11 = z17;
                        if (z17) {
                            z11 = panLimits[3] >= range[3] + d12;
                            z21 = z22;
                        }
                    }
                    if (!z12 || (z21 && z11)) {
                        setYRange(range[2] + d12, range[3] + d12, i10);
                        this.limitsReachedY = false;
                        z15 = z21;
                    } else {
                        this.limitsReachedY = true;
                        z15 = z21;
                    }
                } else {
                    z11 = z17;
                }
                i10++;
                z13 = z10;
                z16 = z11;
            }
        } else {
            RoundChart roundChart = (RoundChart) abstractChart;
            roundChart.setCenterX(roundChart.getCenterX() + ((int) (f12 - f10)));
            roundChart.setCenterY(roundChart.getCenterY() + ((int) (f13 - f11)));
        }
        notifyPanListeners();
    }

    public void removePanListener(PanListener panListener) {
        synchronized (this) {
            this.mPanListeners.remove(panListener);
        }
    }
}
