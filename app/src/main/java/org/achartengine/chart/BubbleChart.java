package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/BubbleChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/BubbleChart.class */
public class BubbleChart extends XYChart {
    private static final int MAX_BUBBLE_SIZE = 20;
    private static final int MIN_BUBBLE_SIZE = 2;
    private static final int SHAPE_WIDTH = 10;
    public static final String TYPE = "Bubble";

    public BubbleChart() {
    }

    public BubbleChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private void drawCircle(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.drawCircle(f10, f11, f12, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f10, int i10, int i11) {
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i10);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i12 = 0; i12 < size; i12 += 2) {
            int i13 = i12 / 2;
            float value = (float) ((xYValueSeries.getValue(i11 + i13) * maxValue) + 2.0d);
            int i14 = i12 + 1;
            clickableAreaArr[i13] = new ClickableArea(new RectF(list.get(i12).floatValue() - value, list.get(i14).floatValue() - value, list.get(i12).floatValue() + value, list.get(i14).floatValue() + value), list2.get(i12).doubleValue(), list2.get(i14).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        drawCircle(canvas, paint, f10 + 10.0f, f11, 3.0f);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i10);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        for (int i12 = 0; i12 < size; i12 += 2) {
            drawCircle(canvas, paint, list.get(i12).floatValue(), list.get(i12 + 1).floatValue(), (float) ((xYValueSeries.getValue(i11 + (i12 / 2)) * maxValue) + 2.0d));
        }
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 10;
    }
}
