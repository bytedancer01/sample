package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/RangeCategorySeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/RangeCategorySeries.class */
public class RangeCategorySeries extends CategorySeries {
    private List<Double> mMaxValues;

    public RangeCategorySeries(String str) {
        super(str);
        this.mMaxValues = new ArrayList();
    }

    public void add(double d10, double d11) {
        synchronized (this) {
            super.add(d10);
            this.mMaxValues.add(Double.valueOf(d11));
        }
    }

    public void add(String str, double d10, double d11) {
        synchronized (this) {
            super.add(str, d10);
            this.mMaxValues.add(Double.valueOf(d11));
        }
    }

    @Override // org.achartengine.model.CategorySeries
    public void clear() {
        synchronized (this) {
            super.clear();
            this.mMaxValues.clear();
        }
    }

    public double getMaximumValue(int i10) {
        return this.mMaxValues.get(i10).doubleValue();
    }

    public double getMinimumValue(int i10) {
        return getValue(i10);
    }

    @Override // org.achartengine.model.CategorySeries
    public void remove(int i10) {
        synchronized (this) {
            super.remove(i10);
            this.mMaxValues.remove(i10);
        }
    }

    @Override // org.achartengine.model.CategorySeries
    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(getTitle());
        int itemCount = getItemCount();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= itemCount) {
                return xYSeries;
            }
            int i12 = i11 + 1;
            xYSeries.add(i12, getMinimumValue(i11));
            xYSeries.add(i11 + 1.000001d, getMaximumValue(i11));
            i10 = i12;
        }
    }
}
