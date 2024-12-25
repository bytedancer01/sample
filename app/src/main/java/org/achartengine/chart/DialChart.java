package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DialRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/DialChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/DialChart.class */
public class DialChart extends RoundChart {
    private static final int NEEDLE_RADIUS = 10;
    private DialRenderer mRenderer;

    public DialChart(CategorySeries categorySeries, DialRenderer dialRenderer) {
        super(categorySeries, dialRenderer);
        this.mRenderer = dialRenderer;
    }

    private void drawNeedle(Canvas canvas, double d10, int i10, int i11, double d11, boolean z10, Paint paint) {
        float[] fArr;
        double radians = d10 - Math.toRadians(90.0d);
        int sin = (int) (Math.sin(radians) * 10.0d);
        int cos = (int) (Math.cos(radians) * 10.0d);
        int sin2 = ((int) (Math.sin(d10) * d11)) + i10;
        int cos2 = ((int) (Math.cos(d10) * d11)) + i11;
        if (z10) {
            double d12 = 0.85d * d11;
            int sin3 = ((int) (d12 * Math.sin(d10))) + i10;
            int cos3 = ((int) (d12 * Math.cos(d10))) + i11;
            float f10 = sin2;
            float f11 = cos2;
            fArr = new float[]{sin3 - sin, cos3 - cos, f10, f11, sin3 + sin, cos3 + cos};
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(5.0f);
            canvas.drawLine(i10, i11, f10, f11, paint);
            paint.setStrokeWidth(strokeWidth);
        } else {
            fArr = new float[]{i10 - sin, i11 - cos, sin2, cos2, i10 + sin, i11 + cos};
        }
        drawPath(canvas, fArr, paint, true);
    }

    private void drawTicks(Canvas canvas, double d10, double d11, double d12, double d13, int i10, int i11, double d14, double d15, double d16, Paint paint, boolean z10) {
        double d17 = d10;
        while (true) {
            double d18 = d17;
            if (d18 > d11) {
                return;
            }
            double angleForValue = getAngleForValue(d18, d12, d13, d10, d11);
            double sin = Math.sin(angleForValue);
            double cos = Math.cos(angleForValue);
            float f10 = i10;
            int round = Math.round(((float) (d15 * sin)) + f10);
            float f11 = i11;
            int round2 = Math.round(((float) (d15 * cos)) + f11);
            int round3 = Math.round(f10 + ((float) (sin * d14)));
            int round4 = Math.round(f11 + ((float) (cos * d14)));
            float f12 = round;
            float f13 = round2;
            canvas.drawLine(f12, f13, round3, round4, paint);
            if (z10) {
                paint.setTextAlign(Paint.Align.LEFT);
                if (round <= round3) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                }
                String str = d18 + "";
                long j10 = (long) d18;
                if (Math.round(d18) == j10) {
                    str = j10 + "";
                }
                canvas.drawText(str, f12, f13, paint);
            }
            d17 = d18 + d16;
        }
    }

    private double getAngleForValue(double d10, double d11, double d12, double d13, double d14) {
        return Math.toRadians(d11 + (((d10 - d13) * (d12 - d11)) / (d14 - d13)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0134, code lost:
    
        if (r21.mRenderer.isMaxValueSet() == false) goto L20;
     */
    @Override // org.achartengine.chart.AbstractChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22, int r23, int r24, int r25, int r26, android.graphics.Paint r27) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.DialChart.draw(android.graphics.Canvas, int, int, int, int, android.graphics.Paint):void");
    }
}
