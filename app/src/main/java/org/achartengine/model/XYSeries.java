package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.achartengine.util.IndexXYMap;
import org.achartengine.util.XYEntry;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/XYSeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/XYSeries.class */
public class XYSeries implements Serializable {
    private List<String> mAnnotations;
    private double mMaxX;
    private double mMaxY;
    private double mMinX;
    private double mMinY;
    private final int mScaleNumber;
    private final IndexXYMap<Double, Double> mStringXY;
    private String mTitle;
    private final IndexXYMap<Double, Double> mXY;

    public XYSeries(String str) {
        this(str, 0);
    }

    public XYSeries(String str, int i10) {
        this.mXY = new IndexXYMap<>();
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        this.mAnnotations = new ArrayList();
        this.mStringXY = new IndexXYMap<>();
        this.mTitle = str;
        this.mScaleNumber = i10;
        initRange();
    }

    private void initRange() {
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            updateRange(getX(i10), getY(i10));
        }
    }

    private void updateRange(double d10, double d11) {
        this.mMinX = Math.min(this.mMinX, d10);
        this.mMaxX = Math.max(this.mMaxX, d10);
        this.mMinY = Math.min(this.mMinY, d11);
        this.mMaxY = Math.max(this.mMaxY, d11);
    }

    public void add(double d10, double d11) {
        synchronized (this) {
            while (this.mXY.get(Double.valueOf(d10)) != null) {
                d10 += getPadding(d10);
            }
            this.mXY.put(Double.valueOf(d10), Double.valueOf(d11));
            updateRange(d10, d11);
        }
    }

    public void add(int i10, double d10, double d11) {
        synchronized (this) {
            while (this.mXY.get(Double.valueOf(d10)) != null) {
                d10 += getPadding(d10);
            }
            this.mXY.put(i10, Double.valueOf(d10), Double.valueOf(d11));
            updateRange(d10, d11);
        }
    }

    public void addAnnotation(String str, double d10, double d11) {
        this.mAnnotations.add(str);
        while (this.mStringXY.get(Double.valueOf(d10)) != null) {
            d10 += getPadding(d10);
        }
        this.mStringXY.put(Double.valueOf(d10), Double.valueOf(d11));
    }

    public void clear() {
        synchronized (this) {
            clearAnnotations();
            clearSeriesValues();
        }
    }

    public void clearAnnotations() {
        synchronized (this) {
            this.mAnnotations.clear();
            this.mStringXY.clear();
        }
    }

    public void clearSeriesValues() {
        synchronized (this) {
            this.mXY.clear();
            initRange();
        }
    }

    public String getAnnotationAt(int i10) {
        return this.mAnnotations.get(i10);
    }

    public int getAnnotationCount() {
        return this.mAnnotations.size();
    }

    public double getAnnotationX(int i10) {
        return this.mStringXY.getXByIndex(i10).doubleValue();
    }

    public double getAnnotationY(int i10) {
        return this.mStringXY.getYByIndex(i10).doubleValue();
    }

    public int getIndexForKey(double d10) {
        return this.mXY.getIndexForKey(Double.valueOf(d10));
    }

    public int getItemCount() {
        int size;
        synchronized (this) {
            size = this.mXY.size();
        }
        return size;
    }

    public double getMaxX() {
        return this.mMaxX;
    }

    public double getMaxY() {
        return this.mMaxY;
    }

    public double getMinX() {
        return this.mMinX;
    }

    public double getMinY() {
        return this.mMinY;
    }

    public double getPadding(double d10) {
        return Math.ulp(d10);
    }

    public SortedMap<Double, Double> getRange(double d10, double d11, boolean z10) {
        synchronized (this) {
            double d12 = d10;
            double d13 = d11;
            if (z10) {
                SortedMap<Double, Double> headMap = this.mXY.headMap(Double.valueOf(d10));
                if (!headMap.isEmpty()) {
                    d10 = headMap.lastKey().doubleValue();
                }
                SortedMap<Double, Double> tailMap = this.mXY.tailMap(Double.valueOf(d11));
                d12 = d10;
                d13 = d11;
                if (!tailMap.isEmpty()) {
                    Iterator<Double> it = tailMap.keySet().iterator();
                    Double next = it.next();
                    if (it.hasNext()) {
                        d13 = it.next().doubleValue();
                        d12 = d10;
                    } else {
                        d13 = d11 + next.doubleValue();
                        d12 = d10;
                    }
                }
            }
            if (d12 <= d13) {
                return this.mXY.subMap(Double.valueOf(d12), Double.valueOf(d13));
            }
            return new TreeMap();
        }
    }

    public int getScaleNumber() {
        return this.mScaleNumber;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public double getX(int i10) {
        double doubleValue;
        synchronized (this) {
            doubleValue = this.mXY.getXByIndex(i10).doubleValue();
        }
        return doubleValue;
    }

    public IndexXYMap<Double, Double> getXYMap() {
        IndexXYMap<Double, Double> indexXYMap;
        synchronized (this) {
            indexXYMap = this.mXY;
        }
        return indexXYMap;
    }

    public double getY(int i10) {
        double doubleValue;
        synchronized (this) {
            doubleValue = this.mXY.getYByIndex(i10).doubleValue();
        }
        return doubleValue;
    }

    public void remove(int i10) {
        synchronized (this) {
            XYEntry<Double, Double> removeByIndex = this.mXY.removeByIndex(i10);
            double doubleValue = removeByIndex.getKey().doubleValue();
            double doubleValue2 = removeByIndex.getValue().doubleValue();
            if (doubleValue == this.mMinX || doubleValue == this.mMaxX || doubleValue2 == this.mMinY || doubleValue2 == this.mMaxY) {
                initRange();
            }
        }
    }

    public void removeAnnotation(int i10) {
        this.mAnnotations.remove(i10);
        this.mStringXY.removeByIndex(i10);
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
