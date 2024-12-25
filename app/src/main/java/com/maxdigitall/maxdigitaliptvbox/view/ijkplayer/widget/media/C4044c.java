package com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
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
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c.class
 */
@TargetApi(14)
/* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.c */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c.class */
public class C4044c extends TextureView implements InterfaceC4042a {

    /* renamed from: b */
    public C7708d f24905b;

    /* renamed from: c */
    public b f24906c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c$a.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.c$a */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c$a.class */
    public static final class a implements InterfaceC4042a.b {

        /* renamed from: a */
        public C4044c f24907a;

        /* renamed from: b */
        public SurfaceTexture f24908b;

        /* renamed from: c */
        public ISurfaceTextureHost f24909c;

        public a(C4044c c4044c, SurfaceTexture surfaceTexture, ISurfaceTextureHost iSurfaceTextureHost) {
            this.f24907a = c4044c;
            this.f24908b = surfaceTexture;
            this.f24909c = iSurfaceTextureHost;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        /* renamed from: a */
        public InterfaceC4042a mo19699a() {
            return this.f24907a;
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        @TargetApi(16)
        /* renamed from: b */
        public void mo19700b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (!(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                iMediaPlayer.setSurface(m19711d());
                return;
            }
            ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
            this.f24907a.f24906c.m19716e(false);
            SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.f24907a.setSurfaceTexture(surfaceTexture);
            } else {
                iSurfaceTextureHolder.setSurfaceTexture(this.f24908b);
                iSurfaceTextureHolder.setSurfaceTextureHost(this.f24907a.f24906c);
            }
        }

        @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a.b
        /* renamed from: c */
        public SurfaceHolder mo19701c() {
            return null;
        }

        /* renamed from: d */
        public Surface m19711d() {
            if (this.f24908b == null) {
                return null;
            }
            return new Surface(this.f24908b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c$b.class
     */
    /* renamed from: com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.c$b */
    /* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/view/ijkplayer/widget/media/c$b.class */
    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* renamed from: b */
        public SurfaceTexture f24910b;

        /* renamed from: c */
        public boolean f24911c;

        /* renamed from: d */
        public int f24912d;

        /* renamed from: e */
        public int f24913e;

        /* renamed from: i */
        public WeakReference<C4044c> f24917i;

        /* renamed from: f */
        public boolean f24914f = true;

        /* renamed from: g */
        public boolean f24915g = false;

        /* renamed from: h */
        public boolean f24916h = false;

        /* renamed from: j */
        public Map<InterfaceC4042a.a, Object> f24918j = new ConcurrentHashMap();

        public b(C4044c c4044c) {
            this.f24917i = new WeakReference<>(c4044c);
        }

        /* renamed from: b */
        public void m19713b(InterfaceC4042a.a aVar) {
            a aVar2;
            this.f24918j.put(aVar, aVar);
            if (this.f24910b != null) {
                aVar2 = new a(this.f24917i.get(), this.f24910b, this);
                aVar.mo18796c(aVar2, this.f24912d, this.f24913e);
            } else {
                aVar2 = null;
            }
            if (this.f24911c) {
                a aVar3 = aVar2;
                if (aVar2 == null) {
                    aVar3 = new a(this.f24917i.get(), this.f24910b, this);
                }
                aVar.mo18794a(aVar3, 0, this.f24912d, this.f24913e);
            }
        }

        /* renamed from: c */
        public void m19714c() {
            Log.d("TextureRenderView", "didDetachFromWindow()");
            this.f24916h = true;
        }

        /* renamed from: d */
        public void m19715d(InterfaceC4042a.a aVar) {
            this.f24918j.remove(aVar);
        }

        /* renamed from: e */
        public void m19716e(boolean z10) {
            this.f24914f = z10;
        }

        /* renamed from: f */
        public void m19717f() {
            Log.d("TextureRenderView", "willDetachFromWindow()");
            this.f24915g = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f24910b = surfaceTexture;
            this.f24911c = false;
            this.f24912d = 0;
            this.f24913e = 0;
            a aVar = new a(this.f24917i.get(), surfaceTexture, this);
            Iterator<InterfaceC4042a.a> it = this.f24918j.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18796c(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f24910b = surfaceTexture;
            this.f24911c = false;
            this.f24912d = 0;
            this.f24913e = 0;
            a aVar = new a(this.f24917i.get(), surfaceTexture, this);
            Iterator<InterfaceC4042a.a> it = this.f24918j.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18795b(aVar);
            }
            Log.d("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f24914f);
            return this.f24914f;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            this.f24910b = surfaceTexture;
            this.f24911c = true;
            this.f24912d = i10;
            this.f24913e = i11;
            a aVar = new a(this.f24917i.get(), surfaceTexture, this);
            Iterator<InterfaceC4042a.a> it = this.f24918j.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo18794a(aVar, 0, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            String str;
            String str2;
            String str3;
            if (surfaceTexture == null) {
                str = "releaseSurfaceTexture: null";
            } else {
                if (this.f24916h) {
                    if (surfaceTexture != this.f24910b) {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture";
                    } else if (this.f24914f) {
                        str = "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView";
                    } else {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture";
                    }
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                }
                if (this.f24915g) {
                    if (surfaceTexture != this.f24910b) {
                        str3 = "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture";
                        Log.d("TextureRenderView", str3);
                        surfaceTexture.release();
                        return;
                    } else {
                        if (!this.f24914f) {
                            str2 = "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView";
                            Log.d("TextureRenderView", str2);
                            m19716e(true);
                            return;
                        }
                        str = "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView";
                    }
                } else if (surfaceTexture != this.f24910b) {
                    str3 = "releaseSurfaceTexture: alive: release different SurfaceTexture";
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                } else {
                    if (!this.f24914f) {
                        str2 = "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView";
                        Log.d("TextureRenderView", str2);
                        m19716e(true);
                        return;
                    }
                    str = "releaseSurfaceTexture: alive: will released by TextureView";
                }
            }
            Log.d("TextureRenderView", str);
        }
    }

    public C4044c(Context context) {
        super(context);
        m19710g(context);
    }

    /* renamed from: h */
    public static String m19708h() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    /* renamed from: i */
    public static String m19709i() {
        return "W";
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: a */
    public void mo19694a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f24905b.m33678g(i10, i11);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: b */
    public void mo19695b(InterfaceC4042a.a aVar) {
        this.f24906c.m19715d(aVar);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: c */
    public void mo19696c(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f24905b.m33679h(i10, i11);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: d */
    public boolean mo19697d() {
        return false;
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    /* renamed from: e */
    public void mo19698e(InterfaceC4042a.a aVar) {
        this.f24906c.m19713b(aVar);
    }

    /* renamed from: g */
    public final void m19710g(Context context) {
        this.f24905b = new C7708d(this);
        b bVar = new b(this);
        this.f24906c = bVar;
        setSurfaceTextureListener(bVar);
    }

    public InterfaceC4042a.b getSurfaceHolder() {
        return new a(this, this.f24906c.f24910b, this.f24906c);
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f24906c.m19717f();
        super.onDetachedFromWindow();
        this.f24906c.m19714c();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C4044c.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C4044c.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f24905b.m33673a(i10, i11);
        setMeasuredDimension(this.f24905b.m33675c(), this.f24905b.m33674b());
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public void setAspectRatio(int i10) {
        this.f24905b.m33676e(i10);
        requestLayout();
    }

    @Override // com.maxdigitall.maxdigitaliptvbox.view.ijkplayer.widget.media.InterfaceC4042a
    public void setVideoRotation(int i10) {
        this.f24905b.m33677f(i10);
        setRotation(i10);
    }
}
