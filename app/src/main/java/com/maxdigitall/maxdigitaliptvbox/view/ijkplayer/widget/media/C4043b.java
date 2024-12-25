package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pf.C7708d;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b.class
 */
/* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.b */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b.class */
public class C4043b extends SurfaceView implements InterfaceC4042a {

    /* renamed from: b */
    public C7708d f24894b;

    /* renamed from: c */
    public b f24895c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.b$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b$a.class */
    public static final class a implements InterfaceC4042a.b {

        /* renamed from: a */
        public C4043b f24896a;

        /* renamed from: b */
        public SurfaceHolder f24897b;

        public a(C4043b c4043b, SurfaceHolder surfaceHolder) {
            this.f24896a = c4043b;
            this.f24897b = surfaceHolder;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        /* renamed from: a */
        public InterfaceC4042a mo19699a() {
            return this.f24896a;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        /* renamed from: b */
        public void mo19700b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (iMediaPlayer instanceof ISurfaceTextureHolder) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f24897b);
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        /* renamed from: c */
        public SurfaceHolder mo19701c() {
            return this.f24897b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.b$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/b$b.class */
    public static final class b implements SurfaceHolder.Callback {

        /* renamed from: b */
        public SurfaceHolder f24898b;

        /* renamed from: c */
        public boolean f24899c;

        /* renamed from: d */
        public int f24900d;

        /* renamed from: e */
        public int f24901e;

        /* renamed from: f */
        public int f24902f;

        /* renamed from: g */
        public WeakReference<C4043b> f24903g;

        /* renamed from: h */
        public Map<InterfaceC4042a.a, Object> f24904h = new ConcurrentHashMap();

        public b(C4043b c4043b) {
            this.f24903g = new WeakReference<>(c4043b);
        }

        /* renamed from: a */
        public void m19705a(InterfaceC4042a.a aVar) {
            a aVar2;
            this.f24904h.put(aVar, aVar);
            if (this.f24898b != null) {
                aVar2 = new a(this.f24903g.get(), this.f24898b);
                aVar.mo18796c(aVar2, this.f24901e, this.f24902f);
            } else {
                aVar2 = null;
            }
            if (this.f24899c) {
                a aVar3 = aVar2;
                if (aVar2 == null) {
                    aVar3 = new a(this.f24903g.get(), this.f24898b);
                }
                aVar.mo18794a(aVar3, this.f24900d, this.f24901e, this.f24902f);
            }
        }

        /* renamed from: b */
        public void m19706b(InterfaceC4042a.a aVar) {
            this.f24904h.remove(aVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            this.f24898b = surfaceHolder;
            this.f24899c = true;
            this.f24900d = i10;
            this.f24901e = i11;
            this.f24902f = i12;
            a aVar = new a(this.f24903g.get(), this.f24898b);
            Iterator<InterfaceC4042a.a> it = this.f24904h.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18794a(aVar, i10, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f24898b = surfaceHolder;
            this.f24899c = false;
            this.f24900d = 0;
            this.f24901e = 0;
            this.f24902f = 0;
            a aVar = new a(this.f24903g.get(), this.f24898b);
            Iterator<InterfaceC4042a.a> it = this.f24904h.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18796c(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f24898b = null;
            this.f24899c = false;
            this.f24900d = 0;
            this.f24901e = 0;
            this.f24902f = 0;
            a aVar = new a(this.f24903g.get(), this.f24898b);
            Iterator<InterfaceC4042a.a> it = this.f24904h.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18795b(aVar);
            }
        }
    }

    public C4043b(Context context) {
        super(context);
        m19704g(context);
    }

    /* renamed from: f */
    public static String m19702f() {
        return "U";
    }

    /* renamed from: h */
    public static String m19703h() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: a */
    public void mo19694a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f24894b.m33678g(i10, i11);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: b */
    public void mo19695b(InterfaceC4042a.a aVar) {
        this.f24895c.m19706b(aVar);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: c */
    public void mo19696c(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f24894b.m33679h(i10, i11);
        getHolder().setFixedSize(i10, i11);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: d */
    public boolean mo19697d() {
        return true;
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: e */
    public void mo19698e(InterfaceC4042a.a aVar) {
        this.f24895c.m19705a(aVar);
    }

    /* renamed from: g */
    public final void m19704g(Context context) {
        this.f24894b = new C7708d(this);
        this.f24895c = new b(this);
        getHolder().addCallback(this.f24895c);
        getHolder().setType(0);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C4043b.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C4043b.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f24894b.m33673a(i10, i11);
        setMeasuredDimension(this.f24894b.m33675c(), this.f24894b.m33674b());
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public void setAspectRatio(int i10) {
        this.f24894b.m33676e(i10);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public void setVideoRotation(int i10) {
        Log.e("", "SurfaceView doesn't support rotation (" + i10 + ")!\n");
    }
}
