package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import org.achartengine.chart.BarChart;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/RangeBarChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/RangeBarChart.class */
public class RangeBarChart extends BarChart {
    public static final String TYPE = "RangeBar";

    public RangeBarChart() {
    }

    public RangeBarChart(BarChart.Type type) {
        super(type);
    }

    public RangeBarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, BarChart.Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer, type);
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i10, int i11) {
        int i12;
        int i13;
        int seriesCount = this.mDataset.getSeriesCount();
        float halfDiffX = getHalfDiffX(list, list.size(), seriesCount);
        for (int i14 = i11 > 0 ? 2 : 0; i14 < list.size(); i14 += 4) {
            int i15 = i11 + (i14 / 2);
            float floatValue = list.get(i14).floatValue();
            float f10 = floatValue;
            if (this.mType == BarChart.Type.DEFAULT) {
                f10 = floatValue + (((i10 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX));
            }
            int i16 = i15 + 1;
            if (!isNullValue(xYSeries.getY(i16)) && list.size() > (i13 = i14 + 3)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i16)), f10, list.get(i13).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            if (!isNullValue(xYSeries.getY(i15)) && list.size() > (i12 = i14 + 1)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i15)), f10, ((list.get(i12).floatValue() + xYSeriesRenderer.getChartValuesTextSize()) + xYSeriesRenderer.getChartValuesSpacing()) - 3.0f, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i12 = i11 > 0 ? 2 : 0; i12 < size; i12 += 4) {
            int i13 = i12 + 3;
            if (list.size() > i13) {
                drawBar(canvas, list.get(i12).floatValue(), list.get(i12 + 1).floatValue(), list.get(i12 + 2).floatValue(), list.get(i13).floatValue(), halfDiffX, seriesCount, i10, paint);
            }
        }
        paint.setColor(xYSeriesRenderer.getColor());
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.BarChart
    public float getCoeficient() {
        return 0.5f;
    }
}
