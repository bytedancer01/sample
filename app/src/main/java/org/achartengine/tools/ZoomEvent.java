package org.achartengine.tools;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/tools/ZoomEvent.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/tools/ZoomEvent.class */
public class ZoomEvent {
    private boolean mZoomIn;
    private float mZoomRate;

    public ZoomEvent(boolean z10, float f10) {
        this.mZoomIn = z10;
        this.mZoomRate = f10;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isZoomIn() {
        return this.mZoomIn;
    }
}
