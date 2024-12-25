package org.achartengine.chart;

import android.graphics.RectF;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/chart/ClickableArea.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/chart/ClickableArea.class */
public class ClickableArea {
    private RectF rect;

    /* renamed from: x */
    private double f36111x;

    /* renamed from: y */
    private double f36112y;

    public ClickableArea(RectF rectF, double d10, double d11) {
        this.rect = rectF;
        this.f36111x = d10;
        this.f36112y = d11;
    }

    public RectF getRect() {
        return this.rect;
    }

    public double getX() {
        return this.f36111x;
    }

    public double getY() {
        return this.f36112y;
    }
}
