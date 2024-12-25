package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/CategorySeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/CategorySeries.class */
public class CategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<Double> mValues = new ArrayList();

    public CategorySeries(String str) {
        this.mTitle = str;
    }

    public void add(double d10) {
        synchronized (this) {
            add(this.mCategories.size() + "", d10);
        }
    }

    public void add(String str, double d10) {
        synchronized (this) {
            this.mCategories.add(str);
            this.mValues.add(Double.valueOf(d10));
        }
    }

    public void clear() {
        synchronized (this) {
            this.mCategories.clear();
            this.mValues.clear();
        }
    }

    public String getCategory(int i10) {
        String str;
        synchronized (this) {
            str = this.mCategories.get(i10);
        }
        return str;
    }

    public int getItemCount() {
        int size;
        synchronized (this) {
            size = this.mCategories.size();
        }
        return size;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public double getValue(int i10) {
        double doubleValue;
        synchronized (this) {
            doubleValue = this.mValues.get(i10).doubleValue();
        }
        return doubleValue;
    }

    public void remove(int i10) {
        synchronized (this) {
            this.mCategories.remove(i10);
            this.mValues.remove(i10);
        }
    }

    public void set(int i10, String str, double d10) {
        synchronized (this) {
            this.mCategories.set(i10, str);
            this.mValues.set(i10, Double.valueOf(d10));
        }
    }

    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(this.mTitle);
        Iterator<Double> it = this.mValues.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            xYSeries.add(i10, it.next().doubleValue());
        }
        return xYSeries;
    }
}
