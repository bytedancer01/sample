package org.achartengine;

import android.graphics.RectF;
import android.view.MotionEvent;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.tools.Pan;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.ZoomListener;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/TouchHandlerOld.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/TouchHandlerOld.class */
public class TouchHandlerOld implements ITouchHandler {
    private GraphicalView graphicalView;
    private Pan mPan;
    private DefaultRenderer mRenderer;
    private float oldX;
    private float oldY;
    private RectF zoomR;

    public TouchHandlerOld(GraphicalView graphicalView, AbstractChart abstractChart) {
        this.zoomR = new RectF();
        this.graphicalView = graphicalView;
        this.zoomR = graphicalView.getZoomRectangle();
        this.mRenderer = abstractChart instanceof XYChart ? ((XYChart) abstractChart).getRenderer() : ((RoundChart) abstractChart).getRenderer();
        if (this.mRenderer.isPanEnabled()) {
            this.mPan = new Pan(abstractChart);
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
    }

    @Override // org.achartengine.ITouchHandler
    public boolean handleTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mRenderer == null || action != 2) {
            if (action == 0) {
                this.oldX = motionEvent.getX();
                this.oldY = motionEvent.getY();
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
            } else if (action == 1) {
                this.oldX = 0.0f;
                this.oldY = 0.0f;
            }
        } else if (this.oldX >= 0.0f || this.oldY >= 0.0f) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.mRenderer.isPanEnabled()) {
                this.mPan.apply(this.oldX, this.oldY, x10, y10);
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
    }
}
