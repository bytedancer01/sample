package org.achartengine.renderer;

import android.graphics.Paint;
import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/BasicStroke.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/BasicStroke.class */
public class BasicStroke implements Serializable {
    private Paint.Cap mCap;
    private float[] mIntervals;
    private Paint.Join mJoin;
    private float mMiter;
    private float mPhase;
    public static final BasicStroke SOLID = new BasicStroke(Paint.Cap.BUTT, Paint.Join.MITER, 4.0f, null, 0.0f);
    public static final BasicStroke DASHED = new BasicStroke(Paint.Cap.ROUND, Paint.Join.BEVEL, 10.0f, new float[]{10.0f, 10.0f}, 1.0f);
    public static final BasicStroke DOTTED = new BasicStroke(Paint.Cap.ROUND, Paint.Join.BEVEL, 5.0f, new float[]{2.0f, 10.0f}, 1.0f);

    public BasicStroke(Paint.Cap cap, Paint.Join join, float f10, float[] fArr, float f11) {
        this.mCap = cap;
        this.mJoin = join;
        this.mMiter = f10;
        this.mIntervals = fArr;
    }

    public Paint.Cap getCap() {
        return this.mCap;
    }

    public float[] getIntervals() {
        return this.mIntervals;
    }

    public Paint.Join getJoin() {
        return this.mJoin;
    }

    public float getMiter() {
        return this.mMiter;
    }

    public float getPhase() {
        return this.mPhase;
    }
}
