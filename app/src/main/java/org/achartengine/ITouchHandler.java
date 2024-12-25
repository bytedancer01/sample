package org.achartengine;

import android.view.MotionEvent;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.ZoomListener;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/ITouchHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/ITouchHandler.class */
public interface ITouchHandler {
    void addPanListener(PanListener panListener);

    void addZoomListener(ZoomListener zoomListener);

    boolean handleTouch(MotionEvent motionEvent);

    void removePanListener(PanListener panListener);

    void removeZoomListener(ZoomListener zoomListener);
}
