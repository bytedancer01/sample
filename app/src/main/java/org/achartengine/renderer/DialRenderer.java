package org.achartengine.renderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/renderer/DialRenderer.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/DialRenderer.class */
public class DialRenderer extends DefaultRenderer {
    private double mAngleMin = 330.0d;
    private double mAngleMax = 30.0d;
    private double mMinValue = Double.MAX_VALUE;
    private double mMaxValue = -1.7976931348623157E308d;
    private double mMinorTickSpacing = Double.MAX_VALUE;
    private double mMajorTickSpacing = Double.MAX_VALUE;
    private List<Type> mVisualTypes = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/achartengine/renderer/DialRenderer$Type.class
     */
    /* loaded from: combined.jar:classes2.jar:org/achartengine/renderer/DialRenderer$Type.class */
    public enum Type {
        NEEDLE,
        ARROW
    }

    public double getAngleMax() {
        return this.mAngleMax;
    }

    public double getAngleMin() {
        return this.mAngleMin;
    }

    public double getMajorTicksSpacing() {
        return this.mMajorTickSpacing;
    }

    public double getMaxValue() {
        return this.mMaxValue;
    }

    public double getMinValue() {
        return this.mMinValue;
    }

    public double getMinorTicksSpacing() {
        return this.mMinorTickSpacing;
    }

    public Type getVisualTypeForIndex(int i10) {
        return i10 < this.mVisualTypes.size() ? this.mVisualTypes.get(i10) : Type.NEEDLE;
    }

    public boolean isMaxValueSet() {
        return this.mMaxValue != -1.7976931348623157E308d;
    }

    public boolean isMinValueSet() {
        return this.mMinValue != Double.MAX_VALUE;
    }

    public void setAngleMax(double d10) {
        this.mAngleMax = d10;
    }

    public void setAngleMin(double d10) {
        this.mAngleMin = d10;
    }

    public void setMajorTicksSpacing(double d10) {
        this.mMajorTickSpacing = d10;
    }

    public void setMaxValue(double d10) {
        this.mMaxValue = d10;
    }

    public void setMinValue(double d10) {
        this.mMinValue = d10;
    }

    public void setMinorTicksSpacing(double d10) {
        this.mMinorTickSpacing = d10;
    }

    public void setVisualTypes(Type[] typeArr) {
        this.mVisualTypes.clear();
        this.mVisualTypes.addAll(Arrays.asList(typeArr));
    }
}
