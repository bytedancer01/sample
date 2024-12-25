package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/ScatterChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/ScatterChart.class */
public class ScatterChart extends XYChart {
    private static final int SHAPE_WIDTH = 10;
    private static final float SIZE = 3.0f;
    public static final String TYPE = "Scatter";
    private float size;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/chart/ScatterChart$1.class
     */
    /* renamed from: org.achartengine.chart.ScatterChart$1 */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/chart/ScatterChart$1.class */
    public static /* synthetic */ class C69921 {
        public static final int[] $SwitchMap$org$achartengine$chart$PointStyle;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.achartengine.chart.PointStyle[] r0 = org.achartengine.chart.PointStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle = r0
                r0 = r4
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.X     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.CIRCLE     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.TRIANGLE     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.SQUARE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.DIAMOND     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = org.achartengine.chart.ScatterChart.C69921.$SwitchMap$org$achartengine$chart$PointStyle     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                org.achartengine.chart.PointStyle r1 = org.achartengine.chart.PointStyle.POINT     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L4c:
                return
            L4d:
                r4 = move-exception
                goto L14
            L51:
                r4 = move-exception
                goto L1f
            L55:
                r4 = move-exception
                goto L2a
            L59:
                r4 = move-exception
                goto L35
            L5d:
                r4 = move-exception
                goto L40
            L61:
                r4 = move-exception
                goto L4c
            */
            throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.ScatterChart.C69921.m45186clinit():void");
        }
    }

    public ScatterChart() {
        this.size = SIZE;
    }

    public ScatterChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = SIZE;
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }

    private void drawCircle(Canvas canvas, Paint paint, float f10, float f11) {
        canvas.drawCircle(f10, f11, this.size, paint);
    }

    private void drawDiamond(Canvas canvas, Paint paint, float[] fArr, float f10, float f11) {
        fArr[0] = f10;
        float f12 = this.size;
        fArr[1] = f11 - f12;
        fArr[2] = f10 - f12;
        fArr[3] = f11;
        fArr[4] = f10;
        fArr[5] = f11 + f12;
        fArr[6] = f10 + f12;
        fArr[7] = f11;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawSquare(Canvas canvas, Paint paint, float f10, float f11) {
        float f12 = this.size;
        canvas.drawRect(f10 - f12, f11 - f12, f10 + f12, f11 + f12, paint);
    }

    private void drawTriangle(Canvas canvas, Paint paint, float[] fArr, float f10, float f11) {
        fArr[0] = f10;
        float f12 = this.size;
        fArr[1] = (f11 - f12) - (f12 / 2.0f);
        fArr[2] = f10 - f12;
        float f13 = f11 + f12;
        fArr[3] = f13;
        fArr[4] = f10 + f12;
        fArr[5] = f13;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawX(Canvas canvas, Paint paint, float f10, float f11) {
        float f12 = this.size;
        canvas.drawLine(f10 - f12, f11 - f12, f10 + f12, f11 + f12, paint);
        float f13 = this.size;
        canvas.drawLine(f10 + f13, f11 - f13, f10 - f13, f11 + f13, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f10, int i10, int i11) {
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i12 = 0; i12 < size; i12 += 2) {
            float selectableBuffer = this.mRenderer.getSelectableBuffer();
            int i13 = i12 + 1;
            clickableAreaArr[i12 / 2] = new ClickableArea(new RectF(list.get(i12).floatValue() - selectableBuffer, list.get(i13).floatValue() - selectableBuffer, list.get(i12).floatValue() + selectableBuffer, list.get(i13).floatValue() + selectableBuffer), list2.get(i12).doubleValue(), list2.get(i13).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        paint.setStyle(xYSeriesRenderer.isFillPoints() ? Paint.Style.FILL : Paint.Style.STROKE);
        switch (C69921.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                drawX(canvas, paint, f10 + 10.0f, f11);
                break;
            case 2:
                drawCircle(canvas, paint, f10 + 10.0f, f11);
                break;
            case 3:
                drawTriangle(canvas, paint, new float[6], f10 + 10.0f, f11);
                break;
            case 4:
                drawSquare(canvas, paint, f10 + 10.0f, f11);
                break;
            case 5:
                drawDiamond(canvas, paint, new float[8], f10 + 10.0f, f11);
                break;
            case 6:
                canvas.drawPoint(f10 + 10.0f, f11, paint);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        Paint.Style style;
        paint.setColor(xYSeriesRenderer.getColor());
        float strokeWidth = paint.getStrokeWidth();
        if (xYSeriesRenderer.isFillPoints()) {
            style = Paint.Style.FILL;
        } else {
            paint.setStrokeWidth(xYSeriesRenderer.getPointStrokeWidth());
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        int size = list.size();
        switch (C69921.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                paint.setStrokeWidth(xYSeriesRenderer.getPointStrokeWidth());
                for (int i12 = 0; i12 < size; i12 += 2) {
                    drawX(canvas, paint, list.get(i12).floatValue(), list.get(i12 + 1).floatValue());
                }
                break;
            case 2:
                for (int i13 = 0; i13 < size; i13 += 2) {
                    drawCircle(canvas, paint, list.get(i13).floatValue(), list.get(i13 + 1).floatValue());
                }
                break;
            case 3:
                float[] fArr = new float[6];
                for (int i14 = 0; i14 < size; i14 += 2) {
                    drawTriangle(canvas, paint, fArr, list.get(i14).floatValue(), list.get(i14 + 1).floatValue());
                }
                break;
            case 4:
                for (int i15 = 0; i15 < size; i15 += 2) {
                    drawSquare(canvas, paint, list.get(i15).floatValue(), list.get(i15 + 1).floatValue());
                }
                break;
            case 5:
                float[] fArr2 = new float[8];
                for (int i16 = 0; i16 < size; i16 += 2) {
                    drawDiamond(canvas, paint, fArr2, list.get(i16).floatValue(), list.get(i16 + 1).floatValue());
                }
                break;
            case 6:
                for (int i17 = 0; i17 < size; i17 += 2) {
                    canvas.drawPoint(list.get(i17).floatValue(), list.get(i17 + 1).floatValue(), paint);
                }
                break;
        }
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 10;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }
}
