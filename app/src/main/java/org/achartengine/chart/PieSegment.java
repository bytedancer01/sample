package org.achartengine.chart;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/PieSegment.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/PieSegment.class */
public class PieSegment implements Serializable {
    private int mDataIndex;
    private float mEndAngle;
    private float mStartAngle;
    private float mValue;

    public PieSegment(int i10, float f10, float f11, float f12) {
        this.mStartAngle = f11;
        this.mEndAngle = f12 + f11;
        this.mDataIndex = i10;
        this.mValue = f10;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public float getEndAngle() {
        return this.mEndAngle;
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public float getValue() {
        return this.mValue;
    }

    public boolean isInSegment(double d10) {
        double d11;
        float f10 = this.mStartAngle;
        boolean z10 = true;
        if (d10 >= f10 && d10 <= this.mEndAngle) {
            return true;
        }
        double d12 = d10 % 360.0d;
        double d13 = f10;
        double d14 = this.mEndAngle;
        while (true) {
            d11 = d14;
            if (d11 <= 360.0d) {
                break;
            }
            d13 -= 360.0d;
            d14 = d11 - 360.0d;
        }
        if (d12 < d13 || d12 > d11) {
            z10 = false;
        }
        return z10;
    }

    public String toString() {
        return "mDataIndex=" + this.mDataIndex + ",mValue=" + this.mValue + ",mStartAngle=" + this.mStartAngle + ",mEndAngle=" + this.mEndAngle;
    }
}
