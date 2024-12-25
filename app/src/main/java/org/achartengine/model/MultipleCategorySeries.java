package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/MultipleCategorySeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/MultipleCategorySeries.class */
public class MultipleCategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<String[]> mTitles = new ArrayList();
    private List<double[]> mValues = new ArrayList();

    public MultipleCategorySeries(String str) {
        this.mTitle = str;
    }

    public void add(String str, String[] strArr, double[] dArr) {
        this.mCategories.add(str);
        this.mTitles.add(strArr);
        this.mValues.add(dArr);
    }

    public void add(String[] strArr, double[] dArr) {
        add(this.mCategories.size() + "", strArr, dArr);
    }

    public void clear() {
        this.mCategories.clear();
        this.mTitles.clear();
        this.mValues.clear();
    }

    public int getCategoriesCount() {
        return this.mCategories.size();
    }

    public String getCategory(int i10) {
        return this.mCategories.get(i10);
    }

    public int getItemCount(int i10) {
        return this.mValues.get(i10).length;
    }

    public String[] getTitles(int i10) {
        return this.mTitles.get(i10);
    }

    public double[] getValues(int i10) {
        return this.mValues.get(i10);
    }

    public void remove(int i10) {
        this.mCategories.remove(i10);
        this.mTitles.remove(i10);
        this.mValues.remove(i10);
    }

    public XYSeries toXYSeries() {
        return new XYSeries(this.mTitle);
    }
}
