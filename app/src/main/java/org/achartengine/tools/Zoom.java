package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/tools/Zoom.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/tools/Zoom.class */
public class Zoom extends AbstractTool {
    public static final int ZOOM_AXIS_X = 1;
    public static final int ZOOM_AXIS_XY = 0;
    public static final int ZOOM_AXIS_Y = 2;
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private boolean mZoomIn;
    private List<ZoomListener> mZoomListeners;
    private float mZoomRate;

    public Zoom(AbstractChart abstractChart, boolean z10, float f10) {
        super(abstractChart);
        this.mZoomListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
        this.mZoomIn = z10;
        setZoomRate(f10);
    }

    private void notifyZoomListeners(ZoomEvent zoomEvent) {
        synchronized (this) {
            Iterator<ZoomListener> it = this.mZoomListeners.iterator();
            while (it.hasNext()) {
                it.next().zoomApplied(zoomEvent);
            }
        }
    }

    public void addZoomListener(ZoomListener zoomListener) {
        synchronized (this) {
            this.mZoomListeners.add(zoomListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013c, code lost:
    
        if (r9 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0189, code lost:
    
        if (r9 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        if (r9 == 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void apply(int r9) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.tools.Zoom.apply(int):void");
    }

    public void notifyZoomResetListeners() {
        synchronized (this) {
            Iterator<ZoomListener> it = this.mZoomListeners.iterator();
            while (it.hasNext()) {
                it.next().zoomReset();
            }
        }
    }

    public void removeZoomListener(ZoomListener zoomListener) {
        synchronized (this) {
            this.mZoomListeners.remove(zoomListener);
        }
    }

    public void setZoomRate(float f10) {
        this.mZoomRate = f10;
    }
}
