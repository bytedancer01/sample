package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.BasicStroke;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import org.achartengine.util.MathHelper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/XYChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/XYChart.class */
public abstract class XYChart extends AbstractChart {
    private Point mCenter;
    public XYMultipleSeriesDataset mDataset;
    public transient Paint mGridPaint;
    public XYMultipleSeriesRenderer mRenderer;
    private float mScale;
    private Rect mScreenR;
    private float mTranslate;
    private final Map<Integer, double[]> mCalcRange = new HashMap();
    private Map<Integer, List<ClickableArea>> clickableAreas = new HashMap();

    public XYChart() {
    }

    public XYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    private int getLabelLinePos(Paint.Align align) {
        return align == Paint.Align.LEFT ? -4 : 4;
    }

    private List<Double> getValidLabels(List<Double> list) {
        ArrayList arrayList = new ArrayList(list);
        for (Double d10 : list) {
            if (d10.isNaN()) {
                arrayList.remove(d10);
            }
        }
        return arrayList;
    }

    private void setStroke(Paint.Cap cap, Paint.Join join, float f10, Paint.Style style, PathEffect pathEffect, Paint paint) {
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f10);
        paint.setPathEffect(pathEffect);
        paint.setStyle(style);
    }

    private void transform(Canvas canvas, float f10, boolean z10) {
        if (z10) {
            float f11 = this.mScale;
            canvas.scale(1.0f / f11, f11);
            float f12 = this.mTranslate;
            canvas.translate(f12, -f12);
            canvas.rotate(-f10, this.mCenter.getX(), this.mCenter.getY());
            return;
        }
        canvas.rotate(f10, this.mCenter.getX(), this.mCenter.getY());
        float f13 = this.mTranslate;
        canvas.translate(-f13, f13);
        float f14 = this.mScale;
        canvas.scale(f14, 1.0f / f14);
    }

    public abstract ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f10, int i10, int i11);

    /* JADX WARN: Code restructure failed: missing block: B:138:0x06f1, code lost:
    
        if (isRenderNullValues() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0fc1, code lost:
    
        if (r18 != false) goto L277;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0ece  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ef6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0eb5  */
    @Override // org.achartengine.chart.AbstractChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r16, int r17, int r18, int r19, int r20, android.graphics.Paint r21) {
        /*
            Method dump skipped, instructions count: 4081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.draw(android.graphics.Canvas, int, int, int, int, android.graphics.Paint):void");
    }

    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i10, int i11) {
        float f10;
        float f11;
        int i12;
        Float f12;
        if (list.size() <= 2) {
            for (int i13 = 0; i13 < list.size(); i13 += 2) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i13 / 2) + i11)), list.get(i13).floatValue(), list.get(i13 + 1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            return;
        }
        float floatValue = list.get(0).floatValue();
        float floatValue2 = list.get(1).floatValue();
        int i14 = 0;
        while (i14 < list.size()) {
            if (i14 == 2) {
                i12 = 3;
                if (Math.abs(list.get(2).floatValue() - list.get(0).floatValue()) <= xYSeriesRenderer.getDisplayChartValuesDistance()) {
                    f10 = floatValue;
                    f11 = floatValue2;
                    if (Math.abs(list.get(3).floatValue() - list.get(1).floatValue()) <= xYSeriesRenderer.getDisplayChartValuesDistance()) {
                    }
                }
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i11)), list.get(0).floatValue(), list.get(1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i11 + 1)), list.get(2).floatValue(), list.get(3).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                f12 = list.get(2);
                f10 = f12.floatValue();
                f11 = list.get(i12).floatValue();
            } else {
                f10 = floatValue;
                f11 = floatValue2;
                if (i14 > 2) {
                    if (Math.abs(list.get(i14).floatValue() - floatValue) <= xYSeriesRenderer.getDisplayChartValuesDistance()) {
                        f10 = floatValue;
                        f11 = floatValue2;
                        if (Math.abs(list.get(i14 + 1).floatValue() - floatValue2) <= xYSeriesRenderer.getDisplayChartValuesDistance()) {
                        }
                    }
                    i12 = i14 + 1;
                    drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i14 / 2) + i11)), list.get(i14).floatValue(), list.get(i12).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    f12 = list.get(i14);
                    f10 = f12.floatValue();
                    f11 = list.get(i12).floatValue();
                }
            }
            i14 += 2;
            floatValue = f10;
            floatValue2 = f11;
        }
    }

    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f10, i10, i11);
    }

    public abstract void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11);

    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, XYMultipleSeriesRenderer.Orientation orientation, int i11) {
        BasicStroke stroke = xYSeriesRenderer.getStroke();
        Paint.Cap strokeCap = paint.getStrokeCap();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Paint.Style style = paint.getStyle();
        if (stroke != null) {
            DashPathEffect dashPathEffect = null;
            if (stroke.getIntervals() != null) {
                dashPathEffect = new DashPathEffect(stroke.getIntervals(), stroke.getPhase());
            }
            setStroke(stroke.getCap(), stroke.getJoin(), stroke.getMiter(), Paint.Style.FILL_AND_STROKE, dashPathEffect, paint);
        }
        drawSeries(canvas, paint, list, xYSeriesRenderer, f10, i10, i11);
        drawPoints(canvas, paint, list, xYSeriesRenderer, f10, i10, i11);
        paint.setTextSize(xYSeriesRenderer.getChartValuesTextSize());
        paint.setTextAlign(orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL ? Paint.Align.CENTER : Paint.Align.LEFT);
        if (xYSeriesRenderer.isDisplayChartValues()) {
            paint.setTextAlign(xYSeriesRenderer.getChartValuesTextAlign());
            drawChartValuesText(canvas, xYSeries, xYSeriesRenderer, paint, list, i10, i11);
        }
        if (stroke != null) {
            setStroke(strokeCap, strokeJoin, strokeMiter, style, pathEffect, paint);
        }
    }

    public void drawText(Canvas canvas, String str, float f10, float f11, Paint paint, float f12) {
        float f13 = (-this.mRenderer.getOrientation().getAngle()) + f12;
        if (f13 != 0.0f) {
            canvas.rotate(f13, f10, f11);
        }
        drawString(canvas, str, f10, f11, paint);
        if (f13 != 0.0f) {
            canvas.rotate(-f13, f10, f11);
        }
    }

    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i10, int i11, int i12, double d10, double d11, double d12) {
        int size = list.size();
        boolean isShowXLabels = this.mRenderer.isShowXLabels();
        boolean isShowGridY = this.mRenderer.isShowGridY();
        if (isShowGridY) {
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
        }
        boolean isShowTickMarks = this.mRenderer.isShowTickMarks();
        for (int i13 = 0; i13 < size; i13++) {
            double doubleValue = list.get(i13).doubleValue();
            float f10 = (float) (i10 + ((doubleValue - d11) * d10));
            if (isShowXLabels) {
                paint.setColor(this.mRenderer.getXLabelsColor());
                if (isShowTickMarks) {
                    float f11 = i12;
                    canvas.drawLine(f10, f11, f10, f11 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                }
                drawText(canvas, getLabel(this.mRenderer.getXLabelFormat(), doubleValue), f10, i12 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
            }
            if (isShowGridY) {
                this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                canvas.drawLine(f10, i12, f10, i11, this.mGridPaint);
            }
        }
        drawXTextLabels(dArr, canvas, paint, isShowXLabels, i10, i11, i12, d10, d11, d12);
    }

    public void drawXTextLabels(Double[] dArr, Canvas canvas, Paint paint, boolean z10, int i10, int i11, int i12, double d10, double d11, double d12) {
        boolean isShowCustomTextGridX = this.mRenderer.isShowCustomTextGridX();
        boolean isShowTickMarks = this.mRenderer.isShowTickMarks();
        if (z10) {
            paint.setColor(this.mRenderer.getXLabelsColor());
            for (Double d13 : dArr) {
                if (d11 <= d13.doubleValue() && d13.doubleValue() <= d12) {
                    float doubleValue = (float) (i10 + ((d13.doubleValue() - d11) * d10));
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    if (isShowTickMarks) {
                        float f10 = i12;
                        canvas.drawLine(doubleValue, f10, doubleValue, f10 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                    }
                    String xTextLabel = this.mRenderer.getXTextLabel(d13);
                    float f11 = i12;
                    drawText(canvas, xTextLabel, doubleValue, ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f11 + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
                    if (isShowCustomTextGridX) {
                        paint.setColor(this.mRenderer.getGridColor(0));
                        canvas.drawLine(doubleValue, f11, doubleValue, i11, paint);
                    }
                }
            }
        }
    }

    public void drawYLabels(Map<Integer, List<Double>> map, Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, double[] dArr, double[] dArr2) {
        float f10;
        float f11;
        XYMultipleSeriesRenderer.Orientation orientation = this.mRenderer.getOrientation();
        boolean isShowGridX = this.mRenderer.isShowGridX();
        if (isShowGridX) {
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
        }
        boolean isShowYLabels = this.mRenderer.isShowYLabels();
        boolean isShowTickMarks = this.mRenderer.isShowTickMarks();
        for (int i14 = 0; i14 < i10; i14++) {
            paint.setTextAlign(this.mRenderer.getYLabelsAlign(i14));
            List<Double> list = map.get(Integer.valueOf(i14));
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                double doubleValue = list.get(i15).doubleValue();
                Paint.Align yAxisAlign = this.mRenderer.getYAxisAlign(i14);
                boolean z10 = this.mRenderer.getYTextLabel(Double.valueOf(doubleValue), i14) != null;
                float f12 = (float) (i13 - (dArr[i14] * (doubleValue - dArr2[i14])));
                if (orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL) {
                    if (isShowYLabels && !z10) {
                        paint.setColor(this.mRenderer.getYLabelsColor(i14));
                        if (yAxisAlign == Paint.Align.LEFT) {
                            if (isShowTickMarks) {
                                canvas.drawLine(getLabelLinePos(yAxisAlign) + i11, f12, i11, f12, paint);
                            }
                            drawText(canvas, getLabel(this.mRenderer.getYLabelFormat(i14), doubleValue), i11 - this.mRenderer.getYLabelsPadding(), f12 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                        } else {
                            if (isShowTickMarks) {
                                canvas.drawLine(i12, f12, getLabelLinePos(yAxisAlign) + i12, f12, paint);
                            }
                            drawText(canvas, getLabel(this.mRenderer.getYLabelFormat(i14), doubleValue), i12 + this.mRenderer.getYLabelsPadding(), f12 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                        }
                    }
                    if (isShowGridX) {
                        this.mGridPaint.setColor(this.mRenderer.getGridColor(i14));
                        f10 = i11;
                        f11 = i12;
                        canvas.drawLine(f10, f12, f11, f12, this.mGridPaint);
                    }
                } else {
                    if (orientation == XYMultipleSeriesRenderer.Orientation.VERTICAL) {
                        if (isShowYLabels && !z10) {
                            paint.setColor(this.mRenderer.getYLabelsColor(i14));
                            if (isShowTickMarks) {
                                canvas.drawLine(i12 - getLabelLinePos(yAxisAlign), f12, i12, f12, paint);
                            }
                            drawText(canvas, getLabel(this.mRenderer.getLabelFormat(), doubleValue), i12 + 10 + this.mRenderer.getYLabelsPadding(), f12 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                        }
                        if (isShowGridX) {
                            this.mGridPaint.setColor(this.mRenderer.getGridColor(i14));
                            if (isShowTickMarks) {
                                f10 = i12;
                                f11 = i11;
                                canvas.drawLine(f10, f12, f11, f12, this.mGridPaint);
                            }
                        }
                    }
                }
            }
        }
    }

    public double[] getCalcRange(int i10) {
        return this.mCalcRange.get(Integer.valueOf(i10));
    }

    public abstract String getChartType();

    public XYMultipleSeriesDataset getDataset() {
        return this.mDataset;
    }

    public double getDefaultMinimum() {
        return Double.MAX_VALUE;
    }

    public ScatterChart getPointsChart() {
        return null;
    }

    public XYMultipleSeriesRenderer getRenderer() {
        return this.mRenderer;
    }

    public Rect getScreenR() {
        return this.mScreenR;
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        RectF rect;
        Map<Integer, List<ClickableArea>> map = this.clickableAreas;
        if (map != null) {
            for (int size = map.size() - 1; size >= 0; size--) {
                if (this.clickableAreas.get(Integer.valueOf(size)) != null) {
                    int i10 = 0;
                    for (ClickableArea clickableArea : this.clickableAreas.get(Integer.valueOf(size))) {
                        if (clickableArea != null && (rect = clickableArea.getRect()) != null && rect.contains(point.getX(), point.getY())) {
                            return new SeriesSelection(size, i10, clickableArea.getX(), clickableArea.getY());
                        }
                        i10++;
                    }
                }
            }
        }
        return super.getSeriesAndPointForScreenCoordinate(point);
    }

    public List<Double> getXLabels(double d10, double d11, int i10) {
        return MathHelper.getLabels(d10, d11, i10);
    }

    public Map<Integer, List<Double>> getYLabels(double[] dArr, double[] dArr2, int i10) {
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            hashMap.put(Integer.valueOf(i11), getValidLabels(MathHelper.getLabels(dArr[i11], dArr2[i11], this.mRenderer.getYLabels())));
        }
        return hashMap;
    }

    public boolean isRenderNullValues() {
        return false;
    }

    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return false;
    }

    public void setCalcRange(double[] dArr, int i10) {
        this.mCalcRange.put(Integer.valueOf(i10), dArr);
    }

    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    public void setScreenR(Rect rect) {
        this.mScreenR = rect;
    }

    public double[] toRealPoint(float f10, float f11) {
        return toRealPoint(f10, f11, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r10.mRenderer.isMaxYSet(r13) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double[] toRealPoint(float r11, float r12, int r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.toRealPoint(float, float, int):double[]");
    }

    public double[] toScreenPoint(double[] dArr) {
        return toScreenPoint(dArr, 0);
    }

    public double[] toScreenPoint(double[] dArr, int i10) {
        double xAxisMin = this.mRenderer.getXAxisMin(i10);
        double xAxisMax = this.mRenderer.getXAxisMax(i10);
        double yAxisMin = this.mRenderer.getYAxisMin(i10);
        double yAxisMax = this.mRenderer.getYAxisMax(i10);
        if (!this.mRenderer.isMinXSet(i10) || !this.mRenderer.isMaxXSet(i10) || !this.mRenderer.isMinYSet(i10) || !this.mRenderer.isMaxYSet(i10)) {
            double[] calcRange = getCalcRange(i10);
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        if (this.mScreenR == null) {
            return dArr;
        }
        double width = ((dArr[0] - xAxisMin) * r0.width()) / (xAxisMax - xAxisMin);
        Rect rect = this.mScreenR;
        return new double[]{width + rect.left, (((yAxisMax - dArr[1]) * rect.height()) / (yAxisMax - yAxisMin)) + this.mScreenR.top};
    }
}
