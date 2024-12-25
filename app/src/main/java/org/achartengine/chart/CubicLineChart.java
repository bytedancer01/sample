package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/CubicLineChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/CubicLineChart.class */
public class CubicLineChart extends LineChart {
    public static final String TYPE = "Cubic";
    private float mFirstMultiplier;
    private PathMeasure mPathMeasure;
    private float mSecondMultiplier;

    public CubicLineChart() {
        this.mFirstMultiplier = 0.33f;
        this.mSecondMultiplier = 1.0f - 0.33f;
    }

    public CubicLineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, float f10) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.mFirstMultiplier = f10;
        this.mSecondMultiplier = 1.0f - f10;
    }

    private void calc(List<Float> list, Point point, int i10, int i11, float f10) {
        float floatValue = list.get(i10).floatValue();
        float floatValue2 = list.get(i10 + 1).floatValue();
        float floatValue3 = list.get(i11).floatValue();
        float floatValue4 = list.get(i11 + 1).floatValue();
        point.setX(floatValue + ((floatValue3 - floatValue) * f10));
        point.setY(floatValue2 + ((floatValue4 - floatValue2) * f10));
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z10) {
        Path path = new Path();
        path.moveTo(list.get(0).floatValue(), list.get(1).floatValue());
        int size = list.size();
        int i10 = size;
        if (z10) {
            i10 = size - 4;
        }
        Point point = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= i10) {
                break;
            }
            int i13 = i12 + 2;
            int i14 = i13 < i10 ? i13 : i12;
            int i15 = i12 + 4;
            if (i15 >= i10) {
                i15 = i14;
            }
            calc(list, point, i12, i14, this.mSecondMultiplier);
            point2.setX(list.get(i14).floatValue());
            point2.setY(list.get(i14 + 1).floatValue());
            calc(list, point3, i14, i15, this.mFirstMultiplier);
            path.cubicTo(point.getX(), point.getY(), point2.getX(), point2.getY(), point3.getX(), point3.getY());
            i11 = i13;
        }
        this.mPathMeasure = new PathMeasure(path, false);
        if (z10) {
            for (int i16 = i10; i16 < i10 + 4; i16 += 2) {
                path.lineTo(list.get(i16).floatValue(), list.get(i16 + 1).floatValue());
            }
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        int length = (int) this.mPathMeasure.getLength();
        int size = list.size();
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < length; i12++) {
            this.mPathMeasure.getPosTan(i12, fArr, null);
            double d10 = Double.MAX_VALUE;
            boolean z10 = true;
            for (int i13 = 0; i13 < size && z10; i13 += 2) {
                double abs = Math.abs(list.get(i13).floatValue() - fArr[0]);
                if (abs < 1.0d) {
                    list.set(i13 + 1, Float.valueOf(fArr[1]));
                    d10 = abs;
                }
                z10 = d10 > abs;
            }
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f10, i10, i11);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }
}
