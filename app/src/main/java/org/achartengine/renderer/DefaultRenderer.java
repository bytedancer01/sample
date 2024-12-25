package org.achartengine.renderer;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/DefaultRenderer.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/DefaultRenderer.class */
public class DefaultRenderer implements Serializable {
    public static final int BACKGROUND_COLOR = -16777216;
    public static final int NO_COLOR = 0;
    private static final Typeface REGULAR_TEXT_FONT = Typeface.create(Typeface.SERIF, 0);
    public static final int TEXT_COLOR = -3355444;
    private boolean mApplyBackgroundColor;
    private int mBackgroundColor;
    private boolean mDisplayValues;
    private float mGridLineWidth;
    private boolean mInScroll;
    private Typeface mTextTypeface;
    private String mChartTitle = "";
    private float mChartTitleTextSize = 15.0f;
    private String mTextTypefaceName = REGULAR_TEXT_FONT.toString();
    private int mTextTypefaceStyle = 0;
    private boolean mShowAxes = true;
    private int mYAxisColor = TEXT_COLOR;
    private int mXAxisColor = TEXT_COLOR;
    private boolean mShowXLabels = true;
    private boolean mShowYLabels = true;
    private boolean mShowTickMarks = true;
    private int mLabelsColor = TEXT_COLOR;
    private float mLabelsTextSize = 10.0f;
    private boolean mShowLegend = true;
    private float mLegendTextSize = 12.0f;
    private boolean mFitLegend = false;
    private boolean mShowGridX = false;
    private boolean mShowGridY = false;
    private boolean mShowCustomTextGridX = false;
    private boolean mShowCustomTextGridY = false;
    private List<SimpleSeriesRenderer> mRenderers = new ArrayList();
    private boolean mAntialiasing = true;
    private int mLegendHeight = 0;
    private int[] mMargins = {20, 30, 10, 20};
    private float mScale = 1.0f;
    private boolean mPanEnabled = true;
    private boolean mZoomEnabled = true;
    private boolean mZoomButtonsVisible = false;
    private float mZoomRate = 1.5f;
    private boolean mExternalZoomEnabled = false;
    private float mOriginalScale = 1.0f;
    private boolean mClickEnabled = false;
    private int selectableBuffer = 15;
    private float mStartAngle = 0.0f;

    public void addSeriesRenderer(int i10, SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(i10, simpleSeriesRenderer);
    }

    public void addSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(simpleSeriesRenderer);
    }

    public int getAxesColor() {
        int i10 = this.mXAxisColor;
        return i10 != -3355444 ? i10 : this.mYAxisColor;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getChartTitle() {
        return this.mChartTitle;
    }

    public float getChartTitleTextSize() {
        return this.mChartTitleTextSize;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public int getLabelsColor() {
        return this.mLabelsColor;
    }

    public float getLabelsTextSize() {
        return this.mLabelsTextSize;
    }

    public int getLegendHeight() {
        return this.mLegendHeight;
    }

    public float getLegendTextSize() {
        return this.mLegendTextSize;
    }

    public int[] getMargins() {
        return this.mMargins;
    }

    public float getOriginalScale() {
        return this.mOriginalScale;
    }

    public float getScale() {
        return this.mScale;
    }

    public int getSelectableBuffer() {
        return this.selectableBuffer;
    }

    public SimpleSeriesRenderer getSeriesRendererAt(int i10) {
        return this.mRenderers.get(i10);
    }

    public int getSeriesRendererCount() {
        return this.mRenderers.size();
    }

    public SimpleSeriesRenderer[] getSeriesRenderers() {
        return (SimpleSeriesRenderer[]) this.mRenderers.toArray(new SimpleSeriesRenderer[0]);
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public Typeface getTextTypeface() {
        return this.mTextTypeface;
    }

    public String getTextTypefaceName() {
        return this.mTextTypefaceName;
    }

    public int getTextTypefaceStyle() {
        return this.mTextTypefaceStyle;
    }

    public int getXAxisColor() {
        return this.mXAxisColor;
    }

    public int getYAxisColor() {
        return this.mYAxisColor;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isAntialiasing() {
        return this.mAntialiasing;
    }

    public boolean isApplyBackgroundColor() {
        return this.mApplyBackgroundColor;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isDisplayValues() {
        return this.mDisplayValues;
    }

    public boolean isExternalZoomEnabled() {
        return this.mExternalZoomEnabled;
    }

    public boolean isFitLegend() {
        return this.mFitLegend;
    }

    public boolean isInScroll() {
        return this.mInScroll;
    }

    public boolean isPanEnabled() {
        return this.mPanEnabled;
    }

    public boolean isShowAxes() {
        return this.mShowAxes;
    }

    public boolean isShowCustomTextGridX() {
        return this.mShowCustomTextGridX;
    }

    public boolean isShowCustomTextGridY() {
        return this.mShowCustomTextGridY;
    }

    public boolean isShowGridX() {
        return this.mShowGridX;
    }

    public boolean isShowGridY() {
        return this.mShowGridY;
    }

    public boolean isShowLabels() {
        return this.mShowXLabels || this.mShowYLabels;
    }

    public boolean isShowLegend() {
        return this.mShowLegend;
    }

    public boolean isShowTickMarks() {
        return this.mShowTickMarks;
    }

    public boolean isShowXLabels() {
        return this.mShowXLabels;
    }

    public boolean isShowYLabels() {
        return this.mShowYLabels;
    }

    public boolean isZoomButtonsVisible() {
        return this.mZoomButtonsVisible;
    }

    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public void removeAllRenderers() {
        this.mRenderers.clear();
    }

    public void removeSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.remove(simpleSeriesRenderer);
    }

    public void setAntialiasing(boolean z10) {
        this.mAntialiasing = z10;
    }

    public void setApplyBackgroundColor(boolean z10) {
        this.mApplyBackgroundColor = z10;
    }

    public void setAxesColor(int i10) {
        setXAxisColor(i10);
        setYAxisColor(i10);
    }

    public void setBackgroundColor(int i10) {
        this.mBackgroundColor = i10;
    }

    public void setChartTitle(String str) {
        this.mChartTitle = str;
    }

    public void setChartTitleTextSize(float f10) {
        this.mChartTitleTextSize = f10;
    }

    public void setClickEnabled(boolean z10) {
        this.mClickEnabled = z10;
    }

    public void setDisplayValues(boolean z10) {
        this.mDisplayValues = z10;
    }

    public void setExternalZoomEnabled(boolean z10) {
        this.mExternalZoomEnabled = z10;
    }

    public void setFitLegend(boolean z10) {
        this.mFitLegend = z10;
    }

    public void setGridLineWidth(float f10) {
        this.mGridLineWidth = f10;
    }

    public void setInScroll(boolean z10) {
        this.mInScroll = z10;
    }

    public void setLabelsColor(int i10) {
        this.mLabelsColor = i10;
    }

    public void setLabelsTextSize(float f10) {
        this.mLabelsTextSize = f10;
    }

    public void setLegendHeight(int i10) {
        this.mLegendHeight = i10;
    }

    public void setLegendTextSize(float f10) {
        this.mLegendTextSize = f10;
    }

    public void setMargins(int[] iArr) {
        this.mMargins = iArr;
    }

    public void setPanEnabled(boolean z10) {
        this.mPanEnabled = z10;
    }

    public void setScale(float f10) {
        this.mScale = f10;
    }

    public void setSelectableBuffer(int i10) {
        this.selectableBuffer = i10;
    }

    public void setShowAxes(boolean z10) {
        this.mShowAxes = z10;
    }

    public void setShowCustomTextGrid(boolean z10) {
        setShowCustomTextGridX(z10);
        setShowCustomTextGridY(z10);
    }

    public void setShowCustomTextGridX(boolean z10) {
        this.mShowCustomTextGridX = z10;
    }

    public void setShowCustomTextGridY(boolean z10) {
        this.mShowCustomTextGridY = z10;
    }

    public void setShowGrid(boolean z10) {
        setShowGridX(z10);
        setShowGridY(z10);
    }

    public void setShowGridX(boolean z10) {
        this.mShowGridX = z10;
    }

    public void setShowGridY(boolean z10) {
        this.mShowGridY = z10;
    }

    public void setShowLabels(boolean z10) {
        this.mShowXLabels = z10;
        this.mShowYLabels = z10;
    }

    public void setShowLabels(boolean z10, boolean z11) {
        this.mShowXLabels = z10;
        this.mShowYLabels = z11;
    }

    public void setShowLegend(boolean z10) {
        this.mShowLegend = z10;
    }

    public void setShowTickMarks(boolean z10) {
        this.mShowTickMarks = z10;
    }

    public void setStartAngle(float f10) {
        while (f10 < 0.0f) {
            f10 += 360.0f;
        }
        this.mStartAngle = f10;
    }

    public void setTextTypeface(Typeface typeface) {
        this.mTextTypeface = typeface;
    }

    public void setTextTypeface(String str, int i10) {
        this.mTextTypefaceName = str;
        this.mTextTypefaceStyle = i10;
    }

    public void setXAxisColor(int i10) {
        this.mXAxisColor = i10;
    }

    public void setYAxisColor(int i10) {
        this.mYAxisColor = i10;
    }

    public void setZoomButtonsVisible(boolean z10) {
        this.mZoomButtonsVisible = z10;
    }

    public void setZoomEnabled(boolean z10) {
        this.mZoomEnabled = z10;
    }

    public void setZoomRate(float f10) {
        this.mZoomRate = f10;
    }
}
