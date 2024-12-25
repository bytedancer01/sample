package org.achartengine.model;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/SeriesSelection.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/SeriesSelection.class */
public class SeriesSelection {
    private int mPointIndex;
    private int mSeriesIndex;
    private double mValue;
    private double mXValue;

    public SeriesSelection(int i10, int i11, double d10, double d11) {
        this.mSeriesIndex = i10;
        this.mPointIndex = i11;
        this.mXValue = d10;
        this.mValue = d11;
    }

    public int getPointIndex() {
        return this.mPointIndex;
    }

    public int getSeriesIndex() {
        return this.mSeriesIndex;
    }

    public double getValue() {
        return this.mValue;
    }

    public double getXValue() {
        return this.mXValue;
    }
}
