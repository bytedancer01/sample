package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.achartengine.model.MultipleCategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/DoughnutChart.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/DoughnutChart.class */
public class DoughnutChart extends RoundChart {
    private MultipleCategorySeries mDataset;
    private int mStep;

    public DoughnutChart(MultipleCategorySeries multipleCategorySeries, DefaultRenderer defaultRenderer) {
        super(null, defaultRenderer);
        this.mDataset = multipleCategorySeries;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i10, int i11, int i12, int i13, Paint paint) {
        paint.setAntiAlias(this.mRenderer.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.mRenderer.getLabelsTextSize());
        int legendSize = getLegendSize(this.mRenderer, i13 / 5, 0.0f);
        int i14 = i10 + i12;
        int categoriesCount = this.mDataset.getCategoriesCount();
        String[] strArr = new String[categoriesCount];
        for (int i15 = 0; i15 < categoriesCount; i15++) {
            strArr[i15] = this.mDataset.getCategory(i15);
        }
        if (this.mRenderer.isFitLegend()) {
            legendSize = drawLegend(canvas, this.mRenderer, strArr, i10, i14, i11, i12, i13, legendSize, paint, true);
        }
        int i16 = (i11 + i13) - legendSize;
        drawBackground(this.mRenderer, canvas, i10, i11, i12, i13, paint, false, 0);
        this.mStep = 7;
        int min = Math.min(Math.abs(i14 - i10), Math.abs(i16 - i11));
        double d10 = 0.2d / categoriesCount;
        double d11 = min;
        int scale = (int) (this.mRenderer.getScale() * 0.35d * d11);
        if (this.mCenterX == Integer.MAX_VALUE) {
            this.mCenterX = (i10 + i14) / 2;
        }
        if (this.mCenterY == Integer.MAX_VALUE) {
            this.mCenterY = (i16 + i11) / 2;
        }
        float f10 = scale;
        ArrayList arrayList = new ArrayList();
        float f11 = 0.9f * f10;
        for (int i17 = 0; i17 < categoriesCount; i17++) {
            int itemCount = this.mDataset.getItemCount(i17);
            String[] strArr2 = new String[itemCount];
            double d12 = 0.0d;
            for (int i18 = 0; i18 < itemCount; i18++) {
                d12 += this.mDataset.getValues(i17)[i18];
                strArr2[i18] = this.mDataset.getTitles(i17)[i18];
            }
            float startAngle = this.mRenderer.getStartAngle();
            float f12 = this.mCenterX - scale;
            int i19 = this.mCenterY;
            RectF rectF = new RectF(f12, i19 - scale, r0 + scale, i19 + scale);
            for (int i20 = 0; i20 < itemCount; i20++) {
                paint.setColor(this.mRenderer.getSeriesRendererAt(i20).getColor());
                float f13 = (float) ((((float) this.mDataset.getValues(i17)[i20]) / d12) * 360.0d);
                canvas.drawArc(rectF, startAngle, f13, true, paint);
                String str = this.mDataset.getTitles(i17)[i20];
                DefaultRenderer defaultRenderer = this.mRenderer;
                drawLabel(canvas, str, defaultRenderer, arrayList, this.mCenterX, this.mCenterY, f11, f10 * 1.1f, startAngle, f13, i10, i14, defaultRenderer.getLabelsColor(), paint, true, false);
                startAngle += f13;
            }
            double d13 = d11 * d10;
            int i21 = (int) (scale - d13);
            f11 = (float) (f11 - (d13 - 2.0d));
            if (this.mRenderer.getBackgroundColor() != 0) {
                paint.setColor(this.mRenderer.getBackgroundColor());
            } else {
                paint.setColor(-1);
            }
            paint.setStyle(Paint.Style.FILL);
            float f14 = this.mCenterX - i21;
            int i22 = this.mCenterY;
            canvas.drawArc(new RectF(f14, i22 - i21, r0 + i21, i22 + i21), 0.0f, 360.0f, true, paint);
            scale = i21 - 1;
        }
        arrayList.clear();
        drawLegend(canvas, this.mRenderer, strArr, i10, i14, i11, i12, i13, legendSize, paint, false);
        drawTitle(canvas, i10, i11, i12, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f10, float f11, int i10, Paint paint) {
        int i11 = this.mStep - 1;
        this.mStep = i11;
        canvas.drawCircle((f10 + 10.0f) - i11, f11, i11, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i10) {
        return 10;
    }
}
