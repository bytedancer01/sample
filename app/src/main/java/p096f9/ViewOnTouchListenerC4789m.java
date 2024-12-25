package p096f9;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p096f9.C4780d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/m.class
 */
/* renamed from: f9.m */
/* loaded from: combined.jar:classes2.jar:f9/m.class */
public final class ViewOnTouchListenerC4789m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C4780d.a {

    /* renamed from: d */
    public final a f28229d;

    /* renamed from: e */
    public final float f28230e;

    /* renamed from: f */
    public final GestureDetector f28231f;

    /* renamed from: b */
    public final PointF f28227b = new PointF();

    /* renamed from: c */
    public final PointF f28228c = new PointF();

    /* renamed from: g */
    public volatile float f28232g = 3.1415927f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:f9/m$a.class
     */
    /* renamed from: f9.m$a */
    /* loaded from: combined.jar:classes2.jar:f9/m$a.class */
    public interface a {
        /* renamed from: b */
        void mo24235b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public ViewOnTouchListenerC4789m(Context context, a aVar, float f10) {
        this.f28229d = aVar;
        this.f28230e = f10;
        this.f28231f = new GestureDetector(context, this);
    }

    @Override // p096f9.C4780d.a
    /* renamed from: a */
    public void mo24198a(float[] fArr, float f10) {
        this.f28232g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f28227b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f28227b.x) / this.f28230e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f28227b;
        float f12 = (y10 - pointF.y) / this.f28230e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f28232g;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f28228c;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f28229d.mo24235b(this.f28228c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f28229d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f28231f.onTouchEvent(motionEvent);
    }
}
