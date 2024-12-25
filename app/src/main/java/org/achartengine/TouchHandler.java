package org.achartengine;

import android.graphics.RectF;
import android.view.MotionEvent;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.tools.Pan;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.Zoom;
import org.achartengine.tools.ZoomListener;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/TouchHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/TouchHandler.class */
public class TouchHandler implements ITouchHandler {
    private GraphicalView graphicalView;
    private Pan mPan;
    private Zoom mPinchZoom;
    private DefaultRenderer mRenderer;
    private float oldX;
    private float oldX2;
    private float oldY;
    private float oldY2;
    private RectF zoomR;

    public TouchHandler(GraphicalView graphicalView, AbstractChart abstractChart) {
        this.zoomR = new RectF();
        this.graphicalView = graphicalView;
        this.zoomR = graphicalView.getZoomRectangle();
        this.mRenderer = abstractChart instanceof XYChart ? ((XYChart) abstractChart).getRenderer() : ((RoundChart) abstractChart).getRenderer();
        if (this.mRenderer.isPanEnabled()) {
            this.mPan = new Pan(abstractChart);
        }
        if (this.mRenderer.isZoomEnabled()) {
            this.mPinchZoom = new Zoom(abstractChart, true, 1.0f);
        }
    }

    private void applyZoom(float f10, int i10) {
        float min = Math.min(Math.max(f10, 0.9f), 1.1f);
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            double d10 = min;
            if (d10 <= 0.9d || d10 >= 1.1d) {
                return;
            }
            zoom.setZoomRate(min);
            this.mPinchZoom.apply(i10);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addPanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.addPanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.addZoomListener(zoomListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public boolean handleTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mRenderer == null || action != 2) {
            if (action == 0) {
                this.oldX = motionEvent.getX(0);
                this.oldY = motionEvent.getY(0);
                DefaultRenderer defaultRenderer = this.mRenderer;
                if (defaultRenderer != null && defaultRenderer.isZoomEnabled() && this.zoomR.contains(this.oldX, this.oldY)) {
                    float f10 = this.oldX;
                    RectF rectF = this.zoomR;
                    if (f10 < rectF.left + (rectF.width() / 3.0f)) {
                        this.graphicalView.zoomIn();
                        return true;
                    }
                    float f11 = this.oldX;
                    RectF rectF2 = this.zoomR;
                    if (f11 < rectF2.left + ((rectF2.width() * 2.0f) / 3.0f)) {
                        this.graphicalView.zoomOut();
                        return true;
                    }
                    this.graphicalView.zoomReset();
                    return true;
                }
            } else if (action == 1 || action == 6) {
                this.oldX = 0.0f;
                this.oldY = 0.0f;
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
                if (action == 6) {
                    this.oldX = -1.0f;
                    this.oldY = -1.0f;
                }
            }
        } else if (this.oldX >= 0.0f || this.oldY >= 0.0f) {
            float x10 = motionEvent.getX(0);
            float y10 = motionEvent.getY(0);
            if (motionEvent.getPointerCount() > 1 && ((this.oldX2 >= 0.0f || this.oldY2 >= 0.0f) && this.mRenderer.isZoomEnabled())) {
                float x11 = motionEvent.getX(1);
                float y11 = motionEvent.getY(1);
                float abs = Math.abs(x10 - x11);
                float abs2 = Math.abs(y10 - y11);
                float abs3 = Math.abs(this.oldX - this.oldX2);
                float abs4 = Math.abs(this.oldY - this.oldY2);
                float abs5 = Math.abs(y10 - this.oldY) / Math.abs(x10 - this.oldX);
                float abs6 = Math.abs(y11 - this.oldY2) / Math.abs(x11 - this.oldX2);
                double d10 = abs5;
                if (d10 <= 0.25d && abs6 <= 0.25d) {
                    applyZoom(abs / abs3, 1);
                } else if (d10 < 3.73d || abs6 < 3.73d) {
                    applyZoom(Math.abs(x10 - this.oldX) >= Math.abs(y10 - this.oldY) ? abs / abs3 : abs2 / abs4, 0);
                } else {
                    applyZoom(abs2 / abs4, 2);
                }
                this.oldX2 = x11;
                this.oldY2 = y11;
            } else if (this.mRenderer.isPanEnabled()) {
                this.mPan.apply(this.oldX, this.oldY, x10, y10);
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
            }
            this.oldX = x10;
            this.oldY = y10;
            this.graphicalView.repaint();
            return true;
        }
        return !this.mRenderer.isClickEnabled();
    }

    @Override // org.achartengine.ITouchHandler
    public void removePanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.removePanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void removeZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.removeZoomListener(zoomListener);
        }
    }
}
