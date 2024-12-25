package org.achartengine.tools;

import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/tools/FitZoom.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/tools/FitZoom.class */
public class FitZoom extends AbstractTool {
    public FitZoom(AbstractChart abstractChart) {
        super(abstractChart);
    }

    public void apply() {
        AbstractChart abstractChart = this.mChart;
        if (!(abstractChart instanceof XYChart)) {
            DefaultRenderer renderer = ((RoundChart) abstractChart).getRenderer();
            renderer.setScale(renderer.getOriginalScale());
            return;
        }
        if (((XYChart) abstractChart).getDataset() == null) {
            return;
        }
        int scalesCount = this.mRenderer.getScalesCount();
        if (this.mRenderer.isInitialRangeSet()) {
            for (int i10 = 0; i10 < scalesCount; i10++) {
                if (this.mRenderer.isInitialRangeSet(i10)) {
                    XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.mRenderer;
                    xYMultipleSeriesRenderer.setRange(xYMultipleSeriesRenderer.getInitialRange(i10), i10);
                }
            }
            return;
        }
        XYSeries[] series = ((XYChart) this.mChart).getDataset().getSeries();
        int length = series.length;
        if (length > 0) {
            for (int i11 = 0; i11 < scalesCount; i11++) {
                double[] dArr = {Double.MAX_VALUE, -1.7976931348623157E308d, Double.MAX_VALUE, -1.7976931348623157E308d};
                for (int i12 = 0; i12 < length; i12++) {
                    if (i11 == series[i12].getScaleNumber()) {
                        dArr[0] = Math.min(dArr[0], series[i12].getMinX());
                        dArr[1] = Math.max(dArr[1], series[i12].getMaxX());
                        dArr[2] = Math.min(dArr[2], series[i12].getMinY());
                        dArr[3] = Math.max(dArr[3], series[i12].getMaxY());
                    }
                }
                double abs = Math.abs(dArr[1] - dArr[0]) / 40.0d;
                double abs2 = Math.abs(dArr[3] - dArr[2]) / 40.0d;
                this.mRenderer.setRange(new double[]{dArr[0] - abs, dArr[1] + abs, dArr[2] - abs2, dArr[3] + abs2}, i11);
            }
        }
    }
}
