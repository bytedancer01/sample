package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/XYMultipleSeriesDataset.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/XYMultipleSeriesDataset.class */
public class XYMultipleSeriesDataset implements Serializable {
    private List<XYSeries> mSeries = new ArrayList();

    public void addAllSeries(List<XYSeries> list) {
        synchronized (this) {
            this.mSeries.addAll(list);
        }
    }

    public void addSeries(int i10, XYSeries xYSeries) {
        synchronized (this) {
            this.mSeries.add(i10, xYSeries);
        }
    }

    public void addSeries(XYSeries xYSeries) {
        synchronized (this) {
            this.mSeries.add(xYSeries);
        }
    }

    public void clear() {
        synchronized (this) {
            this.mSeries.clear();
        }
    }

    public XYSeries[] getSeries() {
        XYSeries[] xYSeriesArr;
        synchronized (this) {
            xYSeriesArr = (XYSeries[]) this.mSeries.toArray(new XYSeries[0]);
        }
        return xYSeriesArr;
    }

    public XYSeries getSeriesAt(int i10) {
        XYSeries xYSeries;
        synchronized (this) {
            xYSeries = this.mSeries.get(i10);
        }
        return xYSeries;
    }

    public int getSeriesCount() {
        int size;
        synchronized (this) {
            size = this.mSeries.size();
        }
        return size;
    }

    public void removeSeries(int i10) {
        synchronized (this) {
            this.mSeries.remove(i10);
        }
    }

    public void removeSeries(XYSeries xYSeries) {
        synchronized (this) {
            this.mSeries.remove(xYSeries);
        }
    }
}
