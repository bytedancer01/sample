package org.achartengine.model;

import java.util.Date;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/TimeSeries.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/TimeSeries.class */
public class TimeSeries extends XYSeries {
    public TimeSeries(String str) {
        super(str);
    }

    public void add(Date date, double d10) {
        synchronized (this) {
            super.add(date.getTime(), d10);
        }
    }

    @Override // org.achartengine.model.XYSeries
    public double getPadding(double d10) {
        return 1.0d;
    }
}
