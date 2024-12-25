package org.achartengine.model;

import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/model/Point.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/model/Point.class */
public final class Point implements Serializable {

    /* renamed from: mX */
    private float f36115mX;

    /* renamed from: mY */
    private float f36116mY;

    public Point() {
    }

    public Point(float f10, float f11) {
        this.f36115mX = f10;
        this.f36116mY = f11;
    }

    public float getX() {
        return this.f36115mX;
    }

    public float getY() {
        return this.f36116mY;
    }

    public void setX(float f10) {
        this.f36115mX = f10;
    }

    public void setY(float f10) {
        this.f36116mY = f10;
    }
}
