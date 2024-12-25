package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/PieChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/PieChart.class */
public class PieChart extends RoundChart {
    private PieMapper mPieMapper;

    public PieChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        super(categorySeries, defaultRenderer);
        this.mPieMapper = new PieMapper();
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i10, int i11, int i12, int i13, Paint paint) {
        paint.setAntiAlias(this.mRenderer.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.mRenderer.getLabelsTextSize());
        int legendSize = getLegendSize(this.mRenderer, i13 / 5, 0.0f);
        int i14 = i10 + i12;
        int itemCount = this.mDataset.getItemCount();
        String[] strArr = new String[itemCount];
        double d10 = 0.0d;
        for (int i15 = 0; i15 < itemCount; i15++) {
            d10 += this.mDataset.getValue(i15);
            strArr[i15] = this.mDataset.getCategory(i15);
        }
        int drawLegend = this.mRenderer.isFitLegend() ? drawLegend(canvas, this.mRenderer, strArr, i10, i14, i11, i12, i13, legendSize, paint, true) : legendSize;
        int i16 = (i11 + i13) - drawLegend;
        drawBackground(this.mRenderer, canvas, i10, i11, i12, i13, paint, false, 0);
        float startAngle = this.mRenderer.getStartAngle();
        int min = (int) (Math.min(Math.abs(i14 - i10), Math.abs(i16 - i11)) * 0.35d * this.mRenderer.getScale());
        if (this.mCenterX == Integer.MAX_VALUE) {
            this.mCenterX = (i10 + i14) / 2;
        }
        if (this.mCenterY == Integer.MAX_VALUE) {
            this.mCenterY = (i16 + i11) / 2;
        }
        this.mPieMapper.setDimensions(min, this.mCenterX, this.mCenterY);
        boolean z10 = !this.mPieMapper.areAllSegmentPresent(itemCount);
        if (z10) {
            this.mPieMapper.clearPieSegments();
        }
        float f10 = min;
        float f11 = f10 * 0.9f;
        float f12 = f10 * 1.1f;
        float f13 = this.mCenterX - min;
        int i17 = this.mCenterY;
        RectF rectF = new RectF(f13, i17 - min, r0 + min, i17 + min);
        ArrayList arrayList = new ArrayList();
        for (int i18 = 0; i18 < itemCount; i18++) {
            SimpleSeriesRenderer seriesRendererAt = this.mRenderer.getSeriesRendererAt(i18);
            if (seriesRendererAt.isGradientEnabled()) {
                paint.setShader(new RadialGradient(this.mCenterX, this.mCenterY, f12, seriesRendererAt.getGradientStartColor(), seriesRendererAt.getGradientStopColor(), Shader.TileMode.MIRROR));
            } else {
                paint.setColor(seriesRendererAt.getColor());
            }
            float value = (float) this.mDataset.getValue(i18);
            float f14 = (float) ((value / d10) * 360.0d);
            if (seriesRendererAt.isHighlighted()) {
                double radians = Math.toRadians(90.0f - ((f14 / 2.0f) + startAngle));
                double d11 = min * 0.1d;
                float sin = (float) (d11 * Math.sin(radians));
                float cos = (float) (d11 * Math.cos(radians));
                rectF.offset(sin, cos);
                canvas.drawArc(rectF, startAngle, f14, true, paint);
                rectF.offset(-sin, -cos);
            } else {
                canvas.drawArc(rectF, startAngle, f14, true, paint);
            }
            paint.setColor(seriesRendererAt.getColor());
            paint.setShader(null);
            String category = this.mDataset.getCategory(i18);
            DefaultRenderer defaultRenderer = this.mRenderer;
            drawLabel(canvas, category, defaultRenderer, arrayList, this.mCenterX, this.mCenterY, f11, f12, startAngle, f14, i10, i14, defaultRenderer.getLabelsColor(), paint, true, false);
            if (this.mRenderer.isDisplayValues()) {
                String label = getLabel(this.mRenderer.getSeriesRendererAt(i18).getChartValuesFormat(), this.mDataset.getValue(i18));
                DefaultRenderer defaultRenderer2 = this.mRenderer;
                drawLabel(canvas, label, defaultRenderer2, arrayList, this.mCenterX, this.mCenterY, f11 / 2.0f, f12 / 2.0f, startAngle, f14, i10, i14, defaultRenderer2.getLabelsColor(), paint, false, true);
            }
            if (z10) {
                this.mPieMapper.addPieSegment(i18, value, startAngle, f14);
            }
            startAngle += f14;
        }
        arrayList.clear();
        drawLegend(canvas, this.mRenderer, strArr, i10, i14, i11, i12, i13, drawLegend, paint, false);
        drawTitle(canvas, i10, i11, i12, paint);
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return this.mPieMapper.getSeriesAndPointForScreenCoordinate(point);
    }
}
