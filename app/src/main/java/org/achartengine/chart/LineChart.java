package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/LineChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/LineChart.class */
public class LineChart extends XYChart {
    private static final int SHAPE_WIDTH = 30;
    public static final String TYPE = "Line";
    private ScatterChart pointsChart;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/chart/LineChart$1.class
     */
    /* renamed from: org.achartengine.chart.LineChart$1 */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/chart/LineChart$1.class */
    public static /* synthetic */ class C69911 {

        /* renamed from: $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type */
        public static final int[] f36113x6d3783d5;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type[] r0 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.achartengine.chart.LineChart.C69911.f36113x6d3783d5 = r0
                r0 = r4
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type r1 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ALL     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = org.achartengine.chart.LineChart.C69911.f36113x6d3783d5     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type r1 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = org.achartengine.chart.LineChart.C69911.f36113x6d3783d5     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type r1 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = org.achartengine.chart.LineChart.C69911.f36113x6d3783d5     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type r1 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.BELOW     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = org.achartengine.chart.LineChart.C69911.f36113x6d3783d5     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                org.achartengine.renderer.XYSeriesRenderer$FillOutsideLine$Type r1 = org.achartengine.renderer.XYSeriesRenderer.FillOutsideLine.Type.ABOVE     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.LineChart.C69911.m45184clinit():void");
        }
    }

    public LineChart() {
    }

    public LineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
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
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(((XYSeriesRenderer) simpleSeriesRenderer).getLineWidth());
        canvas.drawLine(f10, f11, f10 + 30.0f, f11, paint);
        paint.setStrokeWidth(strokeWidth);
        if (isRenderPoints(simpleSeriesRenderer)) {
            this.pointsChart.drawLegendShape(canvas, simpleSeriesRenderer, f10 + 5.0f, f11, i10, paint);
        }
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f10, int i10, int i11) {
        float f11;
        boolean z10;
        XYSeriesRenderer.FillOutsideLine[] fillOutsideLineArr;
        int i12;
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(xYSeriesRenderer.getLineWidth());
        XYSeriesRenderer.FillOutsideLine[] fillOutsideLine = xYSeriesRenderer.getFillOutsideLine();
        int length = fillOutsideLine.length;
        for (int i13 = 0; i13 < length; i13++) {
            XYSeriesRenderer.FillOutsideLine fillOutsideLine2 = fillOutsideLine[i13];
            if (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.NONE) {
                paint.setColor(fillOutsideLine2.getColor());
                ArrayList arrayList = new ArrayList();
                int[] fillRange = fillOutsideLine2.getFillRange();
                if (fillRange == null) {
                    arrayList.addAll(list);
                } else if (list.size() > fillRange[0] * 2) {
                    int size = list.size();
                    int i14 = fillRange[1];
                    if (size > i14 * 2) {
                        arrayList.addAll(list.subList(fillRange[0] * 2, i14 * 2));
                    }
                }
                int i15 = C69911.f36113x6d3783d5[fillOutsideLine2.getType().ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    f11 = f10;
                } else if (i15 == 4) {
                    f11 = canvas.getHeight();
                } else {
                    if (i15 != 5) {
                        throw new RuntimeException("You have added a new type of filling but have not implemented.");
                    }
                    f11 = 0.0f;
                }
                XYSeriesRenderer.FillOutsideLine.Type type = fillOutsideLine2.getType();
                XYSeriesRenderer.FillOutsideLine.Type type2 = XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE;
                if (type == type2 || fillOutsideLine2.getType() == XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList.size();
                    if ((size2 <= 0 || fillOutsideLine2.getType() != type2 || ((Float) arrayList.get(1)).floatValue() >= f11) && (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW || ((Float) arrayList.get(1)).floatValue() <= f11)) {
                        z10 = false;
                    } else {
                        arrayList2.add(arrayList.get(0));
                        arrayList2.add(arrayList.get(1));
                        z10 = true;
                    }
                    int i16 = 3;
                    while (true) {
                        int i17 = i16;
                        boolean z11 = z10;
                        if (i17 >= size2) {
                            break;
                        }
                        float floatValue = ((Float) arrayList.get(i17 - 2)).floatValue();
                        float floatValue2 = ((Float) arrayList.get(i17)).floatValue();
                        if ((floatValue >= f11 || floatValue2 <= f11) && (floatValue <= f11 || floatValue2 >= f11)) {
                            if (!z11 && (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE || floatValue2 >= f11)) {
                                z10 = z11;
                                i12 = i17;
                                if (fillOutsideLine2.getType() == XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW) {
                                    z10 = z11;
                                    i12 = i17;
                                    if (floatValue2 <= f11) {
                                    }
                                }
                            }
                            arrayList2.add(arrayList.get(i17 - 1));
                            arrayList2.add(Float.valueOf(floatValue2));
                            i12 = i17;
                            z10 = z11;
                        } else {
                            float floatValue3 = ((Float) arrayList.get(i17 - 3)).floatValue();
                            float floatValue4 = ((Float) arrayList.get(i17 - 1)).floatValue();
                            arrayList2.add(Float.valueOf(floatValue3 + (((floatValue4 - floatValue3) * (f11 - floatValue)) / (floatValue2 - floatValue))));
                            arrayList2.add(Float.valueOf(f11));
                            if ((fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE || floatValue2 <= f11) && (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW || floatValue2 >= f11)) {
                                arrayList2.add(Float.valueOf(floatValue4));
                                arrayList2.add(Float.valueOf(floatValue2));
                                z10 = true;
                            } else {
                                i17 += 2;
                                z10 = false;
                            }
                            i12 = i17;
                        }
                        i16 = i12 + 2;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                    fillOutsideLineArr = fillOutsideLine;
                } else {
                    fillOutsideLineArr = fillOutsideLine;
                }
                int size3 = arrayList.size();
                fillOutsideLine = fillOutsideLineArr;
                if (size3 > 0) {
                    arrayList.set(0, Float.valueOf(((Float) arrayList.get(0)).floatValue() + 1.0f));
                    arrayList.add(arrayList.get(size3 - 2));
                    arrayList.add(Float.valueOf(f11));
                    arrayList.add(arrayList.get(0));
                    arrayList.add(arrayList.get(size3 + 1));
                    for (int i18 = 0; i18 < size3 + 4; i18 += 2) {
                        int i19 = i18 + 1;
                        if (((Float) arrayList.get(i19)).floatValue() < 0.0f) {
                            arrayList.set(i19, Float.valueOf(0.0f));
                        }
                    }
                    paint.setStyle(Paint.Style.FILL);
                    drawPath(canvas, (List<Float>) arrayList, paint, true);
                    fillOutsideLine = fillOutsideLineArr;
                }
            }
        }
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.STROKE);
        drawPath(canvas, list, paint, false);
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 30;
    }

    @Override // org.achartengine.chart.XYChart
    public ScatterChart getPointsChart() {
        return this.pointsChart;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return ((XYSeriesRenderer) simpleSeriesRenderer).getPointStyle() != PointStyle.POINT;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }
}
