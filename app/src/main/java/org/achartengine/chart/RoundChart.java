package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/RoundChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/RoundChart.class */
public abstract class RoundChart extends AbstractChart {
    public static final int NO_VALUE = Integer.MAX_VALUE;
    public static final int SHAPE_WIDTH = 10;
    public int mCenterX = Integer.MAX_VALUE;
    public int mCenterY = Integer.MAX_VALUE;
    public CategorySeries mDataset;
    public DefaultRenderer mRenderer;

    public RoundChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        this.mDataset = categorySeries;
        this.mRenderer = defaultRenderer;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        canvas.drawRect(f10, f11 - 5.0f, f10 + 10.0f, f11 + 5.0f, paint);
    }

    public void drawTitle(Canvas canvas, int i10, int i11, int i12, Paint paint) {
        if (this.mRenderer.isShowLabels()) {
            paint.setColor(this.mRenderer.getLabelsColor());
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(this.mRenderer.getChartTitleTextSize());
            drawString(canvas, this.mRenderer.getChartTitle(), i10 + (i12 / 2), i11 + this.mRenderer.getChartTitleTextSize(), paint);
        }
    }

    public int getCenterX() {
        return this.mCenterX;
    }

    public int getCenterY() {
        return this.mCenterY;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 10;
    }

    public DefaultRenderer getRenderer() {
        return this.mRenderer;
    }

    public void setCenterX(int i10) {
        this.mCenterX = i10;
    }

    public void setCenterY(int i10) {
        this.mCenterY = i10;
    }
}
