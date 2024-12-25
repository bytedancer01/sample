package org.achartengine.tools;

import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/tools/AbstractTool.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/tools/AbstractTool.class */
public abstract class AbstractTool {
    public AbstractChart mChart;
    public XYMultipleSeriesRenderer mRenderer;

    public AbstractTool(AbstractChart abstractChart) {
        this.mChart = abstractChart;
        if (abstractChart instanceof XYChart) {
            this.mRenderer = ((XYChart) abstractChart).getRenderer();
        }
    }

    public void checkRange(double[] dArr, int i10) {
        double[] calcRange;
        AbstractChart abstractChart = this.mChart;
        if (!(abstractChart instanceof XYChart) || (calcRange = ((XYChart) abstractChart).getCalcRange(i10)) == null) {
            return;
        }
        if (!this.mRenderer.isMinXSet(i10)) {
            double d10 = calcRange[0];
            dArr[0] = d10;
            this.mRenderer.setXAxisMin(d10, i10);
        }
        if (!this.mRenderer.isMaxXSet(i10)) {
            double d11 = calcRange[1];
            dArr[1] = d11;
            this.mRenderer.setXAxisMax(d11, i10);
        }
        if (!this.mRenderer.isMinYSet(i10)) {
            double d12 = calcRange[2];
            dArr[2] = d12;
            this.mRenderer.setYAxisMin(d12, i10);
        }
        if (this.mRenderer.isMaxYSet(i10)) {
            return;
        }
        double d13 = calcRange[3];
        dArr[3] = d13;
        this.mRenderer.setYAxisMax(d13, i10);
    }

    public double[] getRange(int i10) {
        return new double[]{this.mRenderer.getXAxisMin(i10), this.mRenderer.getXAxisMax(i10), this.mRenderer.getYAxisMin(i10), this.mRenderer.getYAxisMax(i10)};
    }

    public void setXRange(double d10, double d11, int i10) {
        this.mRenderer.setXAxisMin(d10, i10);
        this.mRenderer.setXAxisMax(d11, i10);
    }

    public void setYRange(double d10, double d11, int i10) {
        this.mRenderer.setYAxisMin(d10, i10);
        this.mRenderer.setYAxisMax(d11, i10);
    }
}
