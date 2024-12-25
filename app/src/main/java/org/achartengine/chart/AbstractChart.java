package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/AbstractChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/AbstractChart.class */
public abstract class AbstractChart implements Serializable {
    private static float[] calculateDrawPoints(float f10, float f11, float f12, float f13, int i10, int i11) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22 = i10;
        if (f11 > f22) {
            f17 = (f13 - f11) / (f12 - f10);
            f18 = f17 * f10;
            float f23 = ((f22 - f11) + f18) / f17;
            if (f23 < 0.0f) {
                f16 = f18;
                f15 = f11 - f16;
                f14 = 0.0f;
            } else {
                float f24 = i11;
                if (f23 > f24) {
                    f19 = f24;
                    f15 = ((f17 * f19) + f11) - f18;
                    f14 = f19;
                } else {
                    f15 = f22;
                    f14 = f23;
                }
            }
        } else if (f11 < 0.0f) {
            float f25 = (f13 - f11) / (f12 - f10);
            f16 = f25 * f10;
            f14 = ((-f11) + f16) / f25;
            if (f14 >= 0.0f) {
                float f26 = i11;
                if (f14 > f26) {
                    f17 = f25;
                    f18 = f16;
                    f19 = f26;
                    f15 = ((f17 * f19) + f11) - f18;
                    f14 = f19;
                } else {
                    f15 = 0.0f;
                }
            }
            f15 = f11 - f16;
            f14 = 0.0f;
        } else {
            f14 = f10;
            f15 = f11;
        }
        if (f13 > f22) {
            float f27 = (f13 - f11) / (f12 - f10);
            float f28 = f10 * f27;
            float f29 = ((f22 - f11) + f28) / f27;
            if (f29 < 0.0f) {
                f21 = f28;
                f22 = f11 - f21;
                f20 = 0.0f;
            } else {
                f20 = i11;
                if (f29 > f20) {
                    f22 = ((f27 * f20) + f11) - f28;
                } else {
                    f20 = f29;
                }
            }
        } else {
            f20 = f12;
            f22 = f13;
            if (f13 < 0.0f) {
                float f30 = (f13 - f11) / (f12 - f10);
                f21 = f10 * f30;
                f20 = ((-f11) + f21) / f30;
                if (f20 >= 0.0f) {
                    float f31 = i11;
                    if (f20 > f31) {
                        f22 = ((f30 * f31) + f11) - f21;
                        f20 = f31;
                    } else {
                        f22 = 0.0f;
                    }
                }
                f22 = f11 - f21;
                f20 = 0.0f;
            }
        }
        return new float[]{f14, f15, f20, f22};
    }

    private String getFitText(String str, float f10, Paint paint) {
        int length = str.length();
        String str2 = str;
        int i10 = 0;
        while (paint.measureText(str2) > f10 && i10 < length) {
            i10++;
            str2 = str.substring(0, length - i10) + "...";
        }
        if (i10 == length) {
            str2 = "...";
        }
        return str2;
    }

    public abstract void draw(Canvas canvas, int i10, int i11, int i12, int i13, Paint paint);

    public void drawBackground(DefaultRenderer defaultRenderer, Canvas canvas, int i10, int i11, int i12, int i13, Paint paint, boolean z10, int i14) {
        if (defaultRenderer.isApplyBackgroundColor() || z10) {
            if (z10) {
                paint.setColor(i14);
            } else {
                paint.setColor(defaultRenderer.getBackgroundColor());
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i10, i11, i10 + i12, i11 + i13, paint);
        }
    }

    public void drawLabel(Canvas canvas, String str, DefaultRenderer defaultRenderer, List<RectF> list, int i10, int i11, float f10, float f11, float f12, float f13, int i12, int i13, int i14, Paint paint, boolean z10, boolean z11) {
        boolean z12;
        if (defaultRenderer.isShowLabels() || z11) {
            paint.setColor(i14);
            double radians = Math.toRadians(90.0f - (f12 + (f13 / 2.0f)));
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            float f14 = i10;
            double d10 = f10;
            int round = Math.round(((float) (d10 * sin)) + f14);
            float f15 = i11;
            int round2 = Math.round(((float) (d10 * cos)) + f15);
            double d11 = f11;
            int round3 = Math.round(f14 + ((float) (sin * d11)));
            int round4 = Math.round(f15 + ((float) (d11 * cos)));
            float labelsTextSize = defaultRenderer.getLabelsTextSize();
            float f16 = labelsTextSize / 2.0f;
            float max = Math.max(f16, 10.0f);
            paint.setTextAlign(Paint.Align.LEFT);
            float f17 = max;
            if (round > round3) {
                f17 = -max;
                paint.setTextAlign(Paint.Align.RIGHT);
            }
            float f18 = round3;
            float f19 = f17 + f18;
            float f20 = round4;
            float f21 = i13 - f19;
            if (round > round3) {
                f21 = f19 - i12;
            }
            String fitText = getFitText(str, f21, paint);
            float measureText = paint.measureText(fitText);
            float f22 = f20;
            for (boolean z13 = false; !z13 && z10; z13 = !z12) {
                int size = list.size();
                int i15 = 0;
                z12 = false;
                while (i15 < size && !z12) {
                    RectF rectF = list.get(i15);
                    float f23 = f22;
                    if (rectF.intersects(f19, f22, f19 + measureText, f22 + labelsTextSize)) {
                        f23 = Math.max(f22, rectF.bottom);
                        z12 = true;
                    }
                    i15++;
                    f22 = f23;
                }
            }
            if (z10) {
                int i16 = (int) (f22 - f16);
                float f24 = round;
                float f25 = round2;
                float f26 = i16;
                canvas.drawLine(f24, f25, f18, f26, paint);
                canvas.drawLine(f18, f26, f19, f26, paint);
            } else {
                paint.setTextAlign(Paint.Align.CENTER);
            }
            canvas.drawText(fitText, f19, f22, paint);
            if (z10) {
                list.add(new RectF(f19, f22, measureText + f19, labelsTextSize + f22));
            }
        }
    }

    public int drawLegend(Canvas canvas, DefaultRenderer defaultRenderer, String[] strArr, int i10, int i11, int i12, int i13, int i14, int i15, Paint paint, boolean z10) {
        float f10 = 32.0f;
        float f11 = 32.0f;
        if (defaultRenderer.isShowLegend()) {
            float f12 = i10;
            float f13 = ((i12 + i14) - i15) + 32.0f;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(defaultRenderer.getLegendTextSize());
            int min = Math.min(strArr.length, defaultRenderer.getSeriesRendererCount());
            float f14 = f12;
            int i16 = 0;
            while (true) {
                f11 = f10;
                if (i16 >= min) {
                    break;
                }
                SimpleSeriesRenderer seriesRendererAt = defaultRenderer.getSeriesRendererAt(i16);
                float legendShapeWidth = getLegendShapeWidth(i16);
                if (seriesRendererAt.isShowLegendItem()) {
                    String str = strArr[i16];
                    paint.setColor(strArr.length == defaultRenderer.getSeriesRendererCount() ? seriesRendererAt.getColor() : -3355444);
                    int length = str.length();
                    float[] fArr = new float[length];
                    paint.getTextWidths(str, fArr);
                    float f15 = 0.0f;
                    for (int i17 = 0; i17 < length; i17++) {
                        f15 += fArr[i17];
                    }
                    float f16 = legendShapeWidth + 10.0f + f15;
                    float f17 = f14 + f16;
                    if (i16 > 0 && getExceed(f17, defaultRenderer, i11, i13)) {
                        f13 += defaultRenderer.getLegendTextSize();
                        f17 = f12 + f16;
                        f10 += defaultRenderer.getLegendTextSize();
                        f14 = f12;
                    }
                    if (getExceed(f17, defaultRenderer, i11, i13)) {
                        float f18 = ((i11 - f14) - legendShapeWidth) - 10.0f;
                        if (isVertical(defaultRenderer)) {
                            f18 = ((i13 - f14) - legendShapeWidth) - 10.0f;
                        }
                        str = str.substring(0, paint.breakText(str, true, f18, fArr)) + "...";
                    }
                    if (!z10) {
                        drawLegendShape(canvas, seriesRendererAt, f14, f13, i16, paint);
                        drawString(canvas, str, f14 + legendShapeWidth + 5.0f, f13 + 5.0f, paint);
                    }
                    f14 += f16;
                }
                i16++;
            }
        }
        return Math.round(f11 + defaultRenderer.getLegendTextSize());
    }

    public abstract void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint);

    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z10) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (list.size() < 4) {
            return;
        }
        float[] calculateDrawPoints = calculateDrawPoints(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), height, width);
        path.moveTo(calculateDrawPoints[0], calculateDrawPoints[1]);
        path.lineTo(calculateDrawPoints[2], calculateDrawPoints[3]);
        int size = list.size();
        for (int i10 = 4; i10 < size; i10 += 2) {
            int i11 = i10 - 1;
            if (list.get(i11).floatValue() >= 0.0f || list.get(i10 + 1).floatValue() >= 0.0f) {
                float floatValue = list.get(i11).floatValue();
                float f10 = height;
                if (floatValue <= f10 || list.get(i10 + 1).floatValue() <= f10) {
                    float[] calculateDrawPoints2 = calculateDrawPoints(list.get(i10 - 2).floatValue(), list.get(i11).floatValue(), list.get(i10).floatValue(), list.get(i10 + 1).floatValue(), height, width);
                    if (!z10) {
                        path.moveTo(calculateDrawPoints2[0], calculateDrawPoints2[1]);
                    }
                    path.lineTo(calculateDrawPoints2[2], calculateDrawPoints2[3]);
                }
            }
        }
        if (z10) {
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    public void drawPath(Canvas canvas, float[] fArr, Paint paint, boolean z10) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (fArr.length < 4) {
            return;
        }
        float[] calculateDrawPoints = calculateDrawPoints(fArr[0], fArr[1], fArr[2], fArr[3], height, width);
        path.moveTo(calculateDrawPoints[0], calculateDrawPoints[1]);
        path.lineTo(calculateDrawPoints[2], calculateDrawPoints[3]);
        int length = fArr.length;
        for (int i10 = 4; i10 < length; i10 += 2) {
            float f10 = fArr[i10 - 1];
            if (f10 >= 0.0f || fArr[i10 + 1] >= 0.0f) {
                float f11 = height;
                if (f10 <= f11 || fArr[i10 + 1] <= f11) {
                    float[] calculateDrawPoints2 = calculateDrawPoints(fArr[i10 - 2], f10, fArr[i10], fArr[i10 + 1], height, width);
                    if (!z10) {
                        path.moveTo(calculateDrawPoints2[0], calculateDrawPoints2[1]);
                    }
                    path.lineTo(calculateDrawPoints2[2], calculateDrawPoints2[3]);
                }
            }
        }
        if (z10) {
            path.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(path, paint);
    }

    public void drawString(Canvas canvas, String str, float f10, float f11, Paint paint) {
        if (str != null) {
            String[] split = str.split("\n");
            Rect rect = new Rect();
            int i10 = 0;
            for (int i11 = 0; i11 < split.length; i11++) {
                canvas.drawText(split[i11], f10, i10 + f11, paint);
                String str2 = split[i11];
                paint.getTextBounds(str2, 0, str2.length(), rect);
                i10 = i10 + rect.height() + 5;
            }
        }
    }

    public boolean getExceed(float f10, DefaultRenderer defaultRenderer, int i10, int i11) {
        boolean z10 = f10 > ((float) i10);
        if (isVertical(defaultRenderer)) {
            z10 = f10 > ((float) i11);
        }
        return z10;
    }

    public String getLabel(NumberFormat numberFormat, double d10) {
        StringBuilder sb2;
        String sb3;
        if (numberFormat != null) {
            sb3 = numberFormat.format(d10);
        } else {
            if (d10 == Math.round(d10)) {
                sb2 = new StringBuilder();
                sb2.append(Math.round(d10));
            } else {
                sb2 = new StringBuilder();
                sb2.append(d10);
            }
            sb2.append("");
            sb3 = sb2.toString();
        }
        return sb3;
    }

    public abstract int getLegendShapeWidth(int i10);

    public int getLegendSize(DefaultRenderer defaultRenderer, int i10, float f10) {
        int legendHeight = defaultRenderer.getLegendHeight();
        if (!defaultRenderer.isShowLegend() || legendHeight != 0) {
            i10 = legendHeight;
        }
        int i11 = i10;
        if (!defaultRenderer.isShowLegend()) {
            i11 = i10;
            if (defaultRenderer.isShowXLabels()) {
                i11 = (int) (((defaultRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f10);
            }
        }
        return i11;
    }

    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return null;
    }

    public boolean isNullValue(double d10) {
        return Double.isNaN(d10) || Double.isInfinite(d10) || d10 == Double.MAX_VALUE;
    }

    public boolean isVertical(DefaultRenderer defaultRenderer) {
        return (defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getOrientation() == XYMultipleSeriesRenderer.Orientation.VERTICAL;
    }
}
