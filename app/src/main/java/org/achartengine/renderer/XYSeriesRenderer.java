package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.chart.PointStyle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/XYSeriesRenderer.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/XYSeriesRenderer.class */
public class XYSeriesRenderer extends SimpleSeriesRenderer {
    private int mAnnotationsColor;
    private Paint.Align mAnnotationsTextAlign;
    private float mAnnotationsTextSize;
    private float mChartValuesSpacing;
    private Paint.Align mChartValuesTextAlign;
    private boolean mDisplayChartValues;
    private boolean mFillPoints = false;
    private List<FillOutsideLine> mFillBelowLine = new ArrayList();
    private PointStyle mPointStyle = PointStyle.POINT;
    private float mPointStrokeWidth = 1.0f;
    private float mLineWidth = 1.0f;
    private int mDisplayChartValuesDistance = 100;
    private float mChartValuesTextSize = 10.0f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/renderer/XYSeriesRenderer$FillOutsideLine.class
     */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/XYSeriesRenderer$FillOutsideLine.class */
    public static class FillOutsideLine implements Serializable {
        private int mColor = Color.argb(125, 0, 0, 200);
        private int[] mFillRange;
        private final Type mType;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:org/achartengine/renderer/XYSeriesRenderer$FillOutsideLine$Type.class
         */
        /* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/XYSeriesRenderer$FillOutsideLine$Type.class */
        public enum Type {
            NONE,
            BOUNDS_ALL,
            BOUNDS_BELOW,
            BOUNDS_ABOVE,
            BELOW,
            ABOVE
        }

        public FillOutsideLine(Type type) {
            this.mType = type;
        }

        public int getColor() {
            return this.mColor;
        }

        public int[] getFillRange() {
            return this.mFillRange;
        }

        public Type getType() {
            return this.mType;
        }

        public void setColor(int i10) {
            this.mColor = i10;
        }

        public void setFillRange(int[] iArr) {
            this.mFillRange = iArr;
        }
    }

    public XYSeriesRenderer() {
        Paint.Align align = Paint.Align.CENTER;
        this.mChartValuesTextAlign = align;
        this.mChartValuesSpacing = 5.0f;
        this.mAnnotationsTextSize = 10.0f;
        this.mAnnotationsTextAlign = align;
        this.mAnnotationsColor = DefaultRenderer.TEXT_COLOR;
    }

    public void addFillOutsideLine(FillOutsideLine fillOutsideLine) {
        this.mFillBelowLine.add(fillOutsideLine);
    }

    public int getAnnotationsColor() {
        return this.mAnnotationsColor;
    }

    public Paint.Align getAnnotationsTextAlign() {
        return this.mAnnotationsTextAlign;
    }

    public float getAnnotationsTextSize() {
        return this.mAnnotationsTextSize;
    }

    public float getChartValuesSpacing() {
        return this.mChartValuesSpacing;
    }

    public Paint.Align getChartValuesTextAlign() {
        return this.mChartValuesTextAlign;
    }

    public float getChartValuesTextSize() {
        return this.mChartValuesTextSize;
    }

    public int getDisplayChartValuesDistance() {
        return this.mDisplayChartValuesDistance;
    }

    public FillOutsideLine[] getFillOutsideLine() {
        return (FillOutsideLine[]) this.mFillBelowLine.toArray(new FillOutsideLine[0]);
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public float getPointStrokeWidth() {
        return this.mPointStrokeWidth;
    }

    public PointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public boolean isDisplayChartValues() {
        return this.mDisplayChartValues;
    }

    @Deprecated
    public boolean isFillBelowLine() {
        return this.mFillBelowLine.size() > 0;
    }

    public boolean isFillPoints() {
        return this.mFillPoints;
    }

    public void setAnnotationsColor(int i10) {
        this.mAnnotationsColor = i10;
    }

    public void setAnnotationsTextAlign(Paint.Align align) {
        this.mAnnotationsTextAlign = align;
    }

    public void setAnnotationsTextSize(float f10) {
        this.mAnnotationsTextSize = f10;
    }

    public void setChartValuesSpacing(float f10) {
        this.mChartValuesSpacing = f10;
    }

    public void setChartValuesTextAlign(Paint.Align align) {
        this.mChartValuesTextAlign = align;
    }

    public void setChartValuesTextSize(float f10) {
        this.mChartValuesTextSize = f10;
    }

    public void setDisplayChartValues(boolean z10) {
        this.mDisplayChartValues = z10;
    }

    public void setDisplayChartValuesDistance(int i10) {
        this.mDisplayChartValuesDistance = i10;
    }

    @Deprecated
    public void setFillBelowLine(boolean z10) {
        List<FillOutsideLine> list;
        FillOutsideLine fillOutsideLine;
        this.mFillBelowLine.clear();
        if (z10) {
            list = this.mFillBelowLine;
            fillOutsideLine = new FillOutsideLine(FillOutsideLine.Type.BOUNDS_ALL);
        } else {
            list = this.mFillBelowLine;
            fillOutsideLine = new FillOutsideLine(FillOutsideLine.Type.NONE);
        }
        list.add(fillOutsideLine);
    }

    @Deprecated
    public void setFillBelowLineColor(int i10) {
        if (this.mFillBelowLine.size() > 0) {
            this.mFillBelowLine.get(0).setColor(i10);
        }
    }

    public void setFillPoints(boolean z10) {
        this.mFillPoints = z10;
    }

    public void setLineWidth(float f10) {
        this.mLineWidth = f10;
    }

    public void setPointStrokeWidth(float f10) {
        this.mPointStrokeWidth = f10;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.mPointStyle = pointStyle;
    }
}
