package org.achartengine.renderer;

import java.io.Serializable;
import java.text.NumberFormat;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/SimpleSeriesRenderer.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/SimpleSeriesRenderer.class */
public class SimpleSeriesRenderer implements Serializable {
    private NumberFormat mChartValuesFormat;
    private int mGradientStartColor;
    private double mGradientStartValue;
    private int mGradientStopColor;
    private double mGradientStopValue;
    private boolean mHighlighted;
    private BasicStroke mStroke;
    private int mColor = -16776961;
    private boolean mGradientEnabled = false;
    private boolean mShowLegendItem = true;
    private boolean mDisplayBoundingPoints = true;

    public NumberFormat getChartValuesFormat() {
        return this.mChartValuesFormat;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getGradientStartColor() {
        return this.mGradientStartColor;
    }

    public double getGradientStartValue() {
        return this.mGradientStartValue;
    }

    public int getGradientStopColor() {
        return this.mGradientStopColor;
    }

    public double getGradientStopValue() {
        return this.mGradientStopValue;
    }

    public BasicStroke getStroke() {
        return this.mStroke;
    }

    public boolean isDisplayBoundingPoints() {
        return this.mDisplayBoundingPoints;
    }

    public boolean isGradientEnabled() {
        return this.mGradientEnabled;
    }

    public boolean isHighlighted() {
        return this.mHighlighted;
    }

    public boolean isShowLegendItem() {
        return this.mShowLegendItem;
    }

    public void setChartValuesFormat(NumberFormat numberFormat) {
        this.mChartValuesFormat = numberFormat;
    }

    public void setColor(int i10) {
        this.mColor = i10;
    }

    public void setDisplayBoundingPoints(boolean z10) {
        this.mDisplayBoundingPoints = z10;
    }

    public void setGradientEnabled(boolean z10) {
        this.mGradientEnabled = z10;
    }

    public void setGradientStart(double d10, int i10) {
        this.mGradientStartValue = d10;
        this.mGradientStartColor = i10;
    }

    public void setGradientStop(double d10, int i10) {
        this.mGradientStopValue = d10;
        this.mGradientStopColor = i10;
    }

    public void setHighlighted(boolean z10) {
        this.mHighlighted = z10;
    }

    public void setShowLegendItem(boolean z10) {
        this.mShowLegendItem = z10;
    }

    public void setStroke(BasicStroke basicStroke) {
        this.mStroke = basicStroke;
    }
}
