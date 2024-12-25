package org.achartengine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.amazonaws.services.p045s3.internal.Constants;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.tools.FitZoom;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.Zoom;
import org.achartengine.tools.ZoomListener;
import org.apache.commons.net.ftp.FTPReply;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/achartengine/GraphicalView.class
 */
/* loaded from: combined.jar:classes2.jar:org/achartengine/GraphicalView.class */
public class GraphicalView extends View {
    private static final int ZOOM_BUTTONS_COLOR = Color.argb(175, FTPReply.FILE_STATUS_OK, FTPReply.FILE_STATUS_OK, FTPReply.FILE_STATUS_OK);
    private Bitmap fitZoomImage;
    private AbstractChart mChart;
    private boolean mDrawn;
    private FitZoom mFitZoom;
    private Handler mHandler;
    private Paint mPaint;
    private Rect mRect;
    private DefaultRenderer mRenderer;
    private ITouchHandler mTouchHandler;
    private Zoom mZoomIn;
    private Zoom mZoomOut;
    private RectF mZoomR;
    private float oldX;
    private float oldY;
    private Bitmap zoomInImage;
    private Bitmap zoomOutImage;
    private int zoomSize;

    public GraphicalView(Context context, AbstractChart abstractChart) {
        super(context);
        int i10;
        this.mRect = new Rect();
        this.mZoomR = new RectF();
        this.zoomSize = 50;
        this.mPaint = new Paint();
        this.mChart = abstractChart;
        this.mHandler = new Handler();
        AbstractChart abstractChart2 = this.mChart;
        this.mRenderer = abstractChart2 instanceof XYChart ? ((XYChart) abstractChart2).getRenderer() : ((RoundChart) abstractChart2).getRenderer();
        if (this.mRenderer.isZoomButtonsVisible()) {
            this.zoomInImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom_in.png"));
            this.zoomOutImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom_out.png"));
            this.fitZoomImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom-1.png"));
        }
        DefaultRenderer defaultRenderer = this.mRenderer;
        if ((defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getMarginsColor() == 0) {
            ((XYMultipleSeriesRenderer) this.mRenderer).setMarginsColor(this.mPaint.getColor());
        }
        if ((this.mRenderer.isZoomEnabled() && this.mRenderer.isZoomButtonsVisible()) || this.mRenderer.isExternalZoomEnabled()) {
            this.mZoomIn = new Zoom(this.mChart, true, this.mRenderer.getZoomRate());
            this.mZoomOut = new Zoom(this.mChart, false, this.mRenderer.getZoomRate());
            this.mFitZoom = new FitZoom(this.mChart);
        }
        try {
            i10 = Integer.valueOf(Build.VERSION.SDK).intValue();
        } catch (Exception e10) {
            i10 = 7;
        }
        this.mTouchHandler = i10 < 7 ? new TouchHandlerOld(this, this.mChart) : new TouchHandler(this, this.mChart);
    }

    public void addPanListener(PanListener panListener) {
        this.mTouchHandler.addPanListener(panListener);
    }

    public void addZoomListener(ZoomListener zoomListener, boolean z10, boolean z11) {
        Zoom zoom;
        if (z10 && (zoom = this.mZoomIn) != null) {
            zoom.addZoomListener(zoomListener);
            this.mZoomOut.addZoomListener(zoomListener);
        }
        if (z11) {
            this.mTouchHandler.addZoomListener(zoomListener);
        }
    }

    public AbstractChart getChart() {
        return this.mChart;
    }

    public SeriesSelection getCurrentSeriesAndPoint() {
        return this.mChart.getSeriesAndPointForScreenCoordinate(new Point(this.oldX, this.oldY));
    }

    public RectF getZoomRectangle() {
        return this.mZoomR;
    }

    public boolean isChartDrawn() {
        return this.mDrawn;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.mRect);
        Rect rect = this.mRect;
        int i10 = rect.top;
        int i11 = rect.left;
        int width = rect.width();
        int height = this.mRect.height();
        if (this.mRenderer.isInScroll()) {
            width = getMeasuredWidth();
            height = getMeasuredHeight();
            i10 = 0;
            i11 = 0;
        }
        this.mChart.draw(canvas, i11, i10, width, height, this.mPaint);
        DefaultRenderer defaultRenderer = this.mRenderer;
        if (defaultRenderer != null && defaultRenderer.isZoomEnabled() && this.mRenderer.isZoomButtonsVisible()) {
            this.mPaint.setColor(ZOOM_BUTTONS_COLOR);
            int max = Math.max(this.zoomSize, Math.min(width, height) / 7);
            this.zoomSize = max;
            int i12 = i11 + width;
            float f10 = i12 - (max * 3);
            float f11 = i10 + height;
            float f12 = max;
            float f13 = i12;
            this.mZoomR.set(f10, f11 - (f12 * 0.775f), f13, f11);
            RectF rectF = this.mZoomR;
            int i13 = this.zoomSize;
            canvas.drawRoundRect(rectF, i13 / 3, i13 / 3, this.mPaint);
            int i14 = this.zoomSize;
            float f14 = f11 - (i14 * 0.625f);
            canvas.drawBitmap(this.zoomInImage, f13 - (i14 * 2.75f), f14, (Paint) null);
            canvas.drawBitmap(this.zoomOutImage, f13 - (this.zoomSize * 1.75f), f14, (Paint) null);
            canvas.drawBitmap(this.fitZoomImage, f13 - (this.zoomSize * 0.75f), f14, (Paint) null);
        }
        this.mDrawn = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.oldX = motionEvent.getX();
            this.oldY = motionEvent.getY();
        }
        DefaultRenderer defaultRenderer = this.mRenderer;
        if (defaultRenderer != null && this.mDrawn && ((defaultRenderer.isPanEnabled() || this.mRenderer.isZoomEnabled()) && this.mTouchHandler.handleTouch(motionEvent))) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removePanListener(PanListener panListener) {
        this.mTouchHandler.removePanListener(panListener);
    }

    public void removeZoomListener(ZoomListener zoomListener) {
        synchronized (this) {
            Zoom zoom = this.mZoomIn;
            if (zoom != null) {
                zoom.removeZoomListener(zoomListener);
                this.mZoomOut.removeZoomListener(zoomListener);
            }
            this.mTouchHandler.removeZoomListener(zoomListener);
        }
    }

    public void repaint() {
        this.mHandler.post(new Runnable(this) { // from class: org.achartengine.GraphicalView.1
            public final GraphicalView this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.invalidate();
            }
        });
    }

    public void repaint(int i10, int i11, int i12, int i13) {
        this.mHandler.post(new Runnable(this, i10, i11, i12, i13) { // from class: org.achartengine.GraphicalView.2
            public final GraphicalView this$0;
            public final int val$bottom;
            public final int val$left;
            public final int val$right;
            public final int val$top;

            {
                this.this$0 = this;
                this.val$left = i10;
                this.val$top = i11;
                this.val$right = i12;
                this.val$bottom = i13;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.invalidate(this.val$left, this.val$top, this.val$right, this.val$bottom);
            }
        });
    }

    public void setZoomRate(float f10) {
        Zoom zoom = this.mZoomIn;
        if (zoom == null || this.mZoomOut == null) {
            return;
        }
        zoom.setZoomRate(f10);
        this.mZoomOut.setZoomRate(f10);
    }

    public Bitmap toBitmap() {
        setDrawingCacheEnabled(false);
        if (!isDrawingCacheEnabled()) {
            setDrawingCacheEnabled(true);
        }
        if (this.mRenderer.isApplyBackgroundColor()) {
            setDrawingCacheBackgroundColor(this.mRenderer.getBackgroundColor());
        }
        setDrawingCacheQuality(Constants.f7590MB);
        return getDrawingCache(true);
    }

    public double[] toRealPoint(int i10) {
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            return ((XYChart) abstractChart).toRealPoint(this.oldX, this.oldY, i10);
        }
        return null;
    }

    public void zoomIn() {
        Zoom zoom = this.mZoomIn;
        if (zoom != null) {
            zoom.apply(0);
            repaint();
        }
    }

    public void zoomOut() {
        Zoom zoom = this.mZoomOut;
        if (zoom != null) {
            zoom.apply(0);
            repaint();
        }
    }

    public void zoomReset() {
        FitZoom fitZoom = this.mFitZoom;
        if (fitZoom != null) {
            fitZoom.apply();
            this.mZoomIn.notifyZoomResetListeners();
            repaint();
        }
    }
}
