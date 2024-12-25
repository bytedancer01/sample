package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/XYMultipleSeriesRenderer.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/XYMultipleSeriesRenderer.class */
public class XYMultipleSeriesRenderer extends DefaultRenderer {
    private Map<Integer, double[]> initialRange;
    private float mAxisTitleTextSize;
    private double mBarSpacing;
    private float mBarWidth;
    private int[] mGridColors;
    private int mMarginsColor;
    private double[] mMaxX;
    private double[] mMaxY;
    private double[] mMinX;
    private double[] mMinY;
    private Orientation mOrientation;
    private double[] mPanLimits;
    private boolean mPanXEnabled;
    private boolean mPanYEnabled;
    private float mPointSize;
    private NumberFormat mXLabelFormat;
    private int mXLabels;
    private float mXLabelsAngle;
    private int mXLabelsColor;
    private float mXLabelsPadding;
    private boolean mXRoundedLabels;
    private Map<Double, String> mXTextLabels;
    private String mXTitle;
    private NumberFormat[] mYLabelFormat;
    private int mYLabels;
    private float mYLabelsAngle;
    private int[] mYLabelsColor;
    private float mYLabelsPadding;
    private float mYLabelsVerticalPadding;
    private Map<Integer, Map<Double, String>> mYTextLabels;
    private String[] mYTitle;
    private double mZoomInLimitX;
    private double mZoomInLimitY;
    private double[] mZoomLimits;
    private boolean mZoomXEnabled;
    private boolean mZoomYEnabled;
    private int scalesCount;
    private Paint.Align xLabelsAlign;
    private Paint.Align[] yAxisAlign;
    private Paint.Align[] yLabelsAlign;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/renderer/XYMultipleSeriesRenderer$Orientation.class
     */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/XYMultipleSeriesRenderer$Orientation.class */
    public enum Orientation {
        HORIZONTAL(0),
        VERTICAL(90);

        private int mAngle;

        Orientation(int i10) {
            this.mAngle = i10;
        }

        public int getAngle() {
            return this.mAngle;
        }
    }

    public XYMultipleSeriesRenderer() {
        this(1);
    }

    public XYMultipleSeriesRenderer(int i10) {
        this.mXTitle = "";
        this.mAxisTitleTextSize = 12.0f;
        this.mXLabels = 5;
        this.mYLabels = 5;
        this.mOrientation = Orientation.HORIZONTAL;
        this.mXTextLabels = new HashMap();
        this.mYTextLabels = new LinkedHashMap();
        this.mPanXEnabled = true;
        this.mPanYEnabled = true;
        this.mZoomXEnabled = true;
        this.mZoomYEnabled = true;
        this.mBarSpacing = 0.0d;
        this.mMarginsColor = 0;
        this.initialRange = new LinkedHashMap();
        this.mPointSize = 3.0f;
        this.xLabelsAlign = Paint.Align.CENTER;
        this.mXLabelsPadding = 0.0f;
        this.mYLabelsPadding = 0.0f;
        this.mYLabelsVerticalPadding = 2.0f;
        this.mXLabelsColor = DefaultRenderer.TEXT_COLOR;
        this.mYLabelsColor = new int[]{DefaultRenderer.TEXT_COLOR};
        this.mXRoundedLabels = true;
        this.mBarWidth = -1.0f;
        this.mZoomInLimitX = 0.0d;
        this.mZoomInLimitY = 0.0d;
        this.scalesCount = i10;
        initAxesRange(i10);
    }

    public void addTextLabel(double d10, String str) {
        addXTextLabel(d10, str);
    }

    public void addXTextLabel(double d10, String str) {
        synchronized (this) {
            this.mXTextLabels.put(Double.valueOf(d10), str);
        }
    }

    public void addYTextLabel(double d10, String str) {
        addYTextLabel(d10, str, 0);
    }

    public void addYTextLabel(double d10, String str, int i10) {
        synchronized (this) {
            this.mYTextLabels.get(Integer.valueOf(i10)).put(Double.valueOf(d10), str);
        }
    }

    public void clearTextLabels() {
        clearXTextLabels();
    }

    public void clearXTextLabels() {
        synchronized (this) {
            this.mXTextLabels.clear();
        }
    }

    public void clearYTextLabels() {
        clearYTextLabels(0);
    }

    public void clearYTextLabels(int i10) {
        synchronized (this) {
            this.mYTextLabels.get(Integer.valueOf(i10)).clear();
        }
    }

    public float getAxisTitleTextSize() {
        return this.mAxisTitleTextSize;
    }

    public double getBarSpacing() {
        return this.mBarSpacing;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public double getBarsSpacing() {
        return getBarSpacing();
    }

    public int getGridColor(int i10) {
        return this.mGridColors[i10];
    }

    public double[] getInitialRange() {
        return getInitialRange(0);
    }

    public double[] getInitialRange(int i10) {
        return this.initialRange.get(Integer.valueOf(i10));
    }

    public NumberFormat getLabelFormat() {
        return getXLabelFormat();
    }

    public int getMarginsColor() {
        return this.mMarginsColor;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public double[] getPanLimits() {
        return this.mPanLimits;
    }

    public float getPointSize() {
        return this.mPointSize;
    }

    public int getScalesCount() {
        return this.scalesCount;
    }

    public double getXAxisMax() {
        return getXAxisMax(0);
    }

    public double getXAxisMax(int i10) {
        return this.mMaxX[i10];
    }

    public double getXAxisMin() {
        return getXAxisMin(0);
    }

    public double getXAxisMin(int i10) {
        return this.mMinX[i10];
    }

    public NumberFormat getXLabelFormat() {
        return this.mXLabelFormat;
    }

    public int getXLabels() {
        return this.mXLabels;
    }

    public Paint.Align getXLabelsAlign() {
        return this.xLabelsAlign;
    }

    public float getXLabelsAngle() {
        return this.mXLabelsAngle;
    }

    public int getXLabelsColor() {
        return this.mXLabelsColor;
    }

    public float getXLabelsPadding() {
        return this.mXLabelsPadding;
    }

    public String getXTextLabel(Double d10) {
        String str;
        synchronized (this) {
            str = this.mXTextLabels.get(d10);
        }
        return str;
    }

    public Double[] getXTextLabelLocations() {
        Double[] dArr;
        synchronized (this) {
            dArr = (Double[]) this.mXTextLabels.keySet().toArray(new Double[0]);
        }
        return dArr;
    }

    public String getXTitle() {
        return this.mXTitle;
    }

    public Paint.Align getYAxisAlign(int i10) {
        return this.yAxisAlign[i10];
    }

    public double getYAxisMax() {
        return getYAxisMax(0);
    }

    public double getYAxisMax(int i10) {
        return this.mMaxY[i10];
    }

    public double getYAxisMin() {
        return getYAxisMin(0);
    }

    public double getYAxisMin(int i10) {
        return this.mMinY[i10];
    }

    public NumberFormat getYLabelFormat(int i10) {
        return this.mYLabelFormat[i10];
    }

    public int getYLabels() {
        return this.mYLabels;
    }

    public Paint.Align getYLabelsAlign(int i10) {
        return this.yLabelsAlign[i10];
    }

    public float getYLabelsAngle() {
        return this.mYLabelsAngle;
    }

    public int getYLabelsColor(int i10) {
        return this.mYLabelsColor[i10];
    }

    public float getYLabelsPadding() {
        return this.mYLabelsPadding;
    }

    public float getYLabelsVerticalPadding() {
        return this.mYLabelsVerticalPadding;
    }

    public String getYTextLabel(Double d10) {
        return getYTextLabel(d10, 0);
    }

    public String getYTextLabel(Double d10, int i10) {
        String str;
        synchronized (this) {
            str = this.mYTextLabels.get(Integer.valueOf(i10)).get(d10);
        }
        return str;
    }

    public Double[] getYTextLabelLocations() {
        return getYTextLabelLocations(0);
    }

    public Double[] getYTextLabelLocations(int i10) {
        Double[] dArr;
        synchronized (this) {
            dArr = (Double[]) this.mYTextLabels.get(Integer.valueOf(i10)).keySet().toArray(new Double[0]);
        }
        return dArr;
    }

    public String getYTitle() {
        return getYTitle(0);
    }

    public String getYTitle(int i10) {
        return this.mYTitle[i10];
    }

    public double getZoomInLimitX() {
        return this.mZoomInLimitX;
    }

    public double getZoomInLimitY() {
        return this.mZoomInLimitY;
    }

    public double[] getZoomLimits() {
        return this.mZoomLimits;
    }

    public void initAxesRange(int i10) {
        this.mYTitle = new String[i10];
        this.yLabelsAlign = new Paint.Align[i10];
        this.yAxisAlign = new Paint.Align[i10];
        this.mYLabelsColor = new int[i10];
        this.mYLabelFormat = new NumberFormat[i10];
        this.mMinX = new double[i10];
        this.mMaxX = new double[i10];
        this.mMinY = new double[i10];
        this.mMaxY = new double[i10];
        this.mGridColors = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.mYLabelsColor[i11] = -3355444;
            this.mYLabelFormat[i11] = NumberFormat.getNumberInstance();
            this.mGridColors[i11] = Color.argb(75, 200, 200, 200);
            initAxesRangeForScale(i11);
        }
    }

    public void initAxesRangeForScale(int i10) {
        double[] dArr = this.mMinX;
        dArr[i10] = Double.MAX_VALUE;
        double[] dArr2 = this.mMaxX;
        dArr2[i10] = -1.7976931348623157E308d;
        double[] dArr3 = this.mMinY;
        dArr3[i10] = Double.MAX_VALUE;
        double[] dArr4 = this.mMaxY;
        dArr4[i10] = -1.7976931348623157E308d;
        this.initialRange.put(Integer.valueOf(i10), new double[]{dArr[i10], dArr2[i10], dArr3[i10], dArr4[i10]});
        this.mYTitle[i10] = "";
        this.mYTextLabels.put(Integer.valueOf(i10), new HashMap());
        this.yLabelsAlign[i10] = Paint.Align.CENTER;
        this.yAxisAlign[i10] = Paint.Align.LEFT;
    }

    public boolean isInitialRangeSet() {
        return isInitialRangeSet(0);
    }

    public boolean isInitialRangeSet(int i10) {
        return this.initialRange.get(Integer.valueOf(i10)) != null;
    }

    public boolean isMaxXSet() {
        return isMaxXSet(0);
    }

    public boolean isMaxXSet(int i10) {
        return this.mMaxX[i10] != -1.7976931348623157E308d;
    }

    public boolean isMaxYSet() {
        return isMaxYSet(0);
    }

    public boolean isMaxYSet(int i10) {
        return this.mMaxY[i10] != -1.7976931348623157E308d;
    }

    public boolean isMinXSet() {
        return isMinXSet(0);
    }

    public boolean isMinXSet(int i10) {
        return this.mMinX[i10] != Double.MAX_VALUE;
    }

    public boolean isMinYSet() {
        return isMinYSet(0);
    }

    public boolean isMinYSet(int i10) {
        return this.mMinY[i10] != Double.MAX_VALUE;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isPanEnabled() {
        return isPanXEnabled() || isPanYEnabled();
    }

    public boolean isPanXEnabled() {
        return this.mPanXEnabled;
    }

    public boolean isPanYEnabled() {
        return this.mPanYEnabled;
    }

    public boolean isXRoundedLabels() {
        return this.mXRoundedLabels;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isZoomEnabled() {
        return isZoomXEnabled() || isZoomYEnabled();
    }

    public boolean isZoomXEnabled() {
        return this.mZoomXEnabled;
    }

    public boolean isZoomYEnabled() {
        return this.mZoomYEnabled;
    }

    public void removeXTextLabel(double d10) {
        synchronized (this) {
            this.mXTextLabels.remove(Double.valueOf(d10));
        }
    }

    public void removeYTextLabel(double d10) {
        removeYTextLabel(d10, 0);
    }

    public void removeYTextLabel(double d10, int i10) {
        synchronized (this) {
            this.mYTextLabels.get(Integer.valueOf(i10)).remove(Double.valueOf(d10));
        }
    }

    public void setAxisTitleTextSize(float f10) {
        this.mAxisTitleTextSize = f10;
    }

    public void setBarSpacing(double d10) {
        this.mBarSpacing = d10;
    }

    public void setBarWidth(float f10) {
        this.mBarWidth = f10;
    }

    public void setGridColor(int i10) {
        setGridColor(i10, 0);
    }

    public void setGridColor(int i10, int i11) {
        this.mGridColors[i11] = i10;
    }

    public void setInitialRange(double[] dArr) {
        setInitialRange(dArr, 0);
    }

    public void setInitialRange(double[] dArr, int i10) {
        this.initialRange.put(Integer.valueOf(i10), dArr);
    }

    public void setLabelFormat(NumberFormat numberFormat) {
        setXLabelFormat(numberFormat);
    }

    public void setMarginsColor(int i10) {
        this.mMarginsColor = i10;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public void setPanEnabled(boolean z10) {
        setPanEnabled(z10, z10);
    }

    public void setPanEnabled(boolean z10, boolean z11) {
        this.mPanXEnabled = z10;
        this.mPanYEnabled = z11;
    }

    public void setPanLimits(double[] dArr) {
        this.mPanLimits = dArr;
    }

    public void setPointSize(float f10) {
        this.mPointSize = f10;
    }

    public void setRange(double[] dArr) {
        setRange(dArr, 0);
    }

    public void setRange(double[] dArr, int i10) {
        setXAxisMin(dArr[0], i10);
        setXAxisMax(dArr[1], i10);
        setYAxisMin(dArr[2], i10);
        setYAxisMax(dArr[3], i10);
    }

    public void setXAxisMax(double d10) {
        setXAxisMax(d10, 0);
    }

    public void setXAxisMax(double d10, int i10) {
        if (!isMaxXSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[1] = d10;
        }
        this.mMaxX[i10] = d10;
    }

    public void setXAxisMin(double d10) {
        setXAxisMin(d10, 0);
    }

    public void setXAxisMin(double d10, int i10) {
        if (!isMinXSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[0] = d10;
        }
        this.mMinX[i10] = d10;
    }

    public void setXLabelFormat(NumberFormat numberFormat) {
        this.mXLabelFormat = numberFormat;
    }

    public void setXLabels(int i10) {
        this.mXLabels = i10;
    }

    public void setXLabelsAlign(Paint.Align align) {
        this.xLabelsAlign = align;
    }

    public void setXLabelsAngle(float f10) {
        this.mXLabelsAngle = f10;
    }

    public void setXLabelsColor(int i10) {
        this.mXLabelsColor = i10;
    }

    public void setXLabelsPadding(float f10) {
        this.mXLabelsPadding = f10;
    }

    public void setXRoundedLabels(boolean z10) {
        this.mXRoundedLabels = z10;
    }

    public void setXTitle(String str) {
        this.mXTitle = str;
    }

    public void setYAxisAlign(Paint.Align align, int i10) {
        this.yAxisAlign[i10] = align;
    }

    public void setYAxisMax(double d10) {
        setYAxisMax(d10, 0);
    }

    public void setYAxisMax(double d10, int i10) {
        if (!isMaxYSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[3] = d10;
        }
        this.mMaxY[i10] = d10;
    }

    public void setYAxisMin(double d10) {
        setYAxisMin(d10, 0);
    }

    public void setYAxisMin(double d10, int i10) {
        if (!isMinYSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[2] = d10;
        }
        this.mMinY[i10] = d10;
    }

    public void setYLabelFormat(NumberFormat numberFormat, int i10) {
        this.mYLabelFormat[i10] = numberFormat;
    }

    public void setYLabels(int i10) {
        this.mYLabels = i10;
    }

    public void setYLabelsAlign(Paint.Align align) {
        setYLabelsAlign(align, 0);
    }

    public void setYLabelsAlign(Paint.Align align, int i10) {
        this.yLabelsAlign[i10] = align;
    }

    public void setYLabelsAngle(float f10) {
        this.mYLabelsAngle = f10;
    }

    public void setYLabelsColor(int i10, int i11) {
        this.mYLabelsColor[i10] = i11;
    }

    public void setYLabelsPadding(float f10) {
        this.mYLabelsPadding = f10;
    }

    public void setYLabelsVerticalPadding(float f10) {
        this.mYLabelsVerticalPadding = f10;
    }

    public void setYTitle(String str) {
        setYTitle(str, 0);
    }

    public void setYTitle(String str, int i10) {
        this.mYTitle[i10] = str;
    }

    public void setZoomEnabled(boolean z10, boolean z11) {
        this.mZoomXEnabled = z10;
        this.mZoomYEnabled = z11;
    }

    public void setZoomInLimitX(double d10) {
        this.mZoomInLimitX = d10;
    }

    public void setZoomInLimitY(double d10) {
        this.mZoomInLimitY = d10;
    }

    public void setZoomLimits(double[] dArr) {
        this.mZoomLimits = dArr;
    }
}
