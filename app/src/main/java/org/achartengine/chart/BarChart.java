package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/BarChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/BarChart.class */
public class BarChart extends XYChart {
    private static final int SHAPE_WIDTH = 12;
    public static final String TYPE = "Bar";
    private List<Float> mPreviousSeriesPoints;
    public Type mType;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/chart/BarChart$Type.class
     */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/chart/BarChart$Type.class */
    public enum Type {
        DEFAULT,
        STACKED,
        HEAPED
    }

    public BarChart() {
        this.mType = Type.DEFAULT;
    }

    public BarChart(Type type) {
        Type type2 = Type.DEFAULT;
        this.mType = type;
    }

    public BarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        Type type2 = Type.DEFAULT;
        this.mType = type;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f10, int i10, int i11) {
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i12 = 0; i12 < size; i12 += 2) {
            float floatValue = list.get(i12).floatValue();
            int i13 = i12 + 1;
            float floatValue2 = list.get(i13).floatValue();
            Type type = this.mType;
            if (type == Type.STACKED || type == Type.HEAPED) {
                clickableAreaArr[i12 / 2] = new ClickableArea(new RectF(floatValue - halfDiffX, Math.min(floatValue2, f10), floatValue + halfDiffX, Math.max(floatValue2, f10)), list2.get(i12).doubleValue(), list2.get(i13).doubleValue());
            } else {
                float f11 = (floatValue - (seriesCount * halfDiffX)) + (i10 * 2 * halfDiffX);
                clickableAreaArr[i12 / 2] = new ClickableArea(new RectF(f11, Math.min(floatValue2, f10), (2.0f * halfDiffX) + f11, Math.max(floatValue2, f10)), list2.get(i12).doubleValue(), list2.get(i13).doubleValue());
            }
        }
        return clickableAreaArr;
    }

    public void drawBar(Canvas canvas, float f10, float f11, float f12, float f13, float f14, int i10, int i11, Paint paint) {
        float f15;
        float f16;
        int scaleNumber = this.mDataset.getSeriesAt(i11).getScaleNumber();
        Type type = this.mType;
        if (type == Type.STACKED || type == Type.HEAPED) {
            f15 = f10 - f14;
            f16 = f12 + f14;
        } else {
            f15 = (f10 - (i10 * f14)) + (i11 * 2 * f14);
            f16 = f15 + (2.0f * f14);
        }
        drawBar(canvas, f15, f13, f16, f11, scaleNumber, i11, paint);
    }

    public void drawBar(Canvas canvas, float f10, float f11, float f12, float f13, int i10, int i11, Paint paint) {
        float f14;
        float f15;
        int gradientPartialColor;
        int gradientPartialColor2;
        if (f10 > f12) {
            f14 = f10;
        } else {
            f14 = f12;
            f12 = f10;
        }
        if (f11 > f13) {
            f15 = f11;
        } else {
            f15 = f13;
            f13 = f11;
        }
        SimpleSeriesRenderer seriesRendererAt = this.mRenderer.getSeriesRendererAt(i11);
        if (!seriesRendererAt.isGradientEnabled()) {
            float f16 = f15;
            if (Math.abs(f13 - f15) < 1.0f) {
                f16 = f13 < f15 ? f13 + 1.0f : f13 - 1.0f;
            }
            canvas.drawRect(Math.round(f12), Math.round(f13), Math.round(f14), Math.round(f16), paint);
            return;
        }
        float f17 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStopValue()}, i10)[1];
        float f18 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStartValue()}, i10)[1];
        float max = Math.max(f17, Math.min(f13, f15));
        float min = Math.min(f18, Math.max(f13, f15));
        int gradientStopColor = seriesRendererAt.getGradientStopColor();
        int gradientStartColor = seriesRendererAt.getGradientStartColor();
        if (f13 < f17) {
            paint.setColor(gradientStopColor);
            canvas.drawRect(Math.round(f12), Math.round(f13), Math.round(f14), Math.round(max), paint);
            gradientPartialColor = gradientStopColor;
        } else {
            gradientPartialColor = getGradientPartialColor(gradientStopColor, gradientStartColor, (f18 - max) / (f18 - f17));
        }
        if (f15 > f18) {
            paint.setColor(gradientStartColor);
            canvas.drawRect(Math.round(f12), Math.round(min), Math.round(f14), Math.round(f15), paint);
            gradientPartialColor2 = gradientStartColor;
        } else {
            gradientPartialColor2 = getGradientPartialColor(gradientStartColor, gradientStopColor, (min - f17) / (f18 - f17));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{gradientPartialColor2, gradientPartialColor});
        gradientDrawable.setBounds(Math.round(f12), Math.round(max), Math.round(f14), Math.round(min));
        gradientDrawable.draw(canvas);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i10, int i11) {
        String label;
        float floatValue;
        float f10;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i12 = 0; i12 < size; i12 += 2) {
            double y10 = xYSeries.getY(i11 + (i12 / 2));
            if (!isNullValue(y10)) {
                float floatValue2 = list.get(i12).floatValue();
                float f11 = floatValue2;
                if (this.mType == Type.DEFAULT) {
                    f11 = floatValue2 + (((i10 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX));
                }
                if (y10 >= 0.0d) {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y10);
                    floatValue = list.get(i12 + 1).floatValue();
                    f10 = xYSeriesRenderer.getChartValuesSpacing();
                } else {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y10);
                    floatValue = list.get(i12 + 1).floatValue() + xYSeriesRenderer.getChartValuesTextSize() + xYSeriesRenderer.getChartValuesSpacing();
                    f10 = 3.0f;
                }
                drawText(canvas, label, f11, floatValue - f10, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        canvas.drawRect(f10, f11 - 6.0f, f10 + 12.0f, f11 + 6.0f, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        float f11;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i12 = 0; i12 < size; i12 += 2) {
            float floatValue = list.get(i12).floatValue();
            int i13 = i12 + 1;
            float floatValue2 = list.get(i13).floatValue();
            if (this.mType != Type.HEAPED || i10 <= 0) {
                f11 = f10;
            } else {
                f11 = this.mPreviousSeriesPoints.get(i13).floatValue();
                floatValue2 += f11 - f10;
                list.set(i13, Float.valueOf(floatValue2));
            }
            drawBar(canvas, floatValue, f11, floatValue, floatValue2, halfDiffX, seriesCount, i10, paint);
        }
        paint.setColor(xYSeriesRenderer.getColor());
        this.mPreviousSeriesPoints = list;
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public float getCoeficient() {
        return 1.0f;
    }

    @Override // org.achartengine.chart.XYChart
    public double getDefaultMinimum() {
        return 0.0d;
    }

    public int getGradientPartialColor(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i11) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i11) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i11) * f11)), Math.round((f10 * Color.blue(i10)) + (f11 * Color.blue(i11))));
    }

    public float getHalfDiffX(List<Float> list, int i10, int i11) {
        float barWidth = this.mRenderer.getBarWidth();
        if (barWidth > 0.0f) {
            return barWidth / 2.0f;
        }
        float floatValue = (list.get(i10 - 2).floatValue() - list.get(0).floatValue()) / (i10 > 2 ? i10 - 2 : i10);
        float f10 = floatValue;
        if (floatValue == 0.0f) {
            f10 = 10.0f;
        }
        Type type = this.mType;
        float f11 = f10;
        if (type != Type.STACKED) {
            f11 = f10;
            if (type != Type.HEAPED) {
                f11 = f10 / i11;
            }
        }
        return (float) (f11 / (getCoeficient() * (this.mRenderer.getBarSpacing() + 1.0d)));
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 12;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderNullValues() {
        return true;
    }
}
