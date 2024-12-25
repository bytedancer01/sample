package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/XYValueSeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/XYValueSeries.class */
public class XYValueSeries extends XYSeries {
    private double mMaxValue;
    private double mMinValue;
    private List<Double> mValue;

    public XYValueSeries(String str) {
        super(str);
        this.mValue = new ArrayList();
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
    }

    private void initRange() {
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            updateRange(getValue(i10));
        }
    }

    private void updateRange(double d10) {
        this.mMinValue = Math.min(this.mMinValue, d10);
        this.mMaxValue = Math.max(this.mMaxValue, d10);
    }

    @Override // org.achartengine.model.XYSeries
    public void add(double d10, double d11) {
        synchronized (this) {
            add(d10, d11, 0.0d);
        }
    }

    public void add(double d10, double d11, double d12) {
        synchronized (this) {
            super.add(d10, d11);
            this.mValue.add(Double.valueOf(d12));
            updateRange(d12);
        }
    }

    @Override // org.achartengine.model.XYSeries
    public void clear() {
        synchronized (this) {
            super.clear();
            this.mValue.clear();
            initRange();
        }
    }

    public double getMaxValue() {
        return this.mMaxValue;
    }

    public double getMinValue() {
        return this.mMinValue;
    }

    public double getValue(int i10) {
        double doubleValue;
        synchronized (this) {
            doubleValue = this.mValue.get(i10).doubleValue();
        }
        return doubleValue;
    }

    @Override // org.achartengine.model.XYSeries
    public void remove(int i10) {
        synchronized (this) {
            super.remove(i10);
            double doubleValue = this.mValue.remove(i10).doubleValue();
            if (doubleValue == this.mMinValue || doubleValue == this.mMaxValue) {
                initRange();
            }
        }
    }
}
