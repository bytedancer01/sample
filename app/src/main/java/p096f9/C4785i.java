package p096f9;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p059d9.C4349a;
import p059d9.C4378o;
import p059d9.C4387s0;
import p078e9.InterfaceC4679m;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/i.class
 */
/* renamed from: f9.i */
/* loaded from: combined.jar:classes2.jar:f9/i.class */
public final class C4785i implements InterfaceC4679m, InterfaceC4777a {

    /* renamed from: j */
    public int f28196j;

    /* renamed from: k */
    public SurfaceTexture f28197k;

    /* renamed from: n */
    public byte[] f28200n;

    /* renamed from: b */
    public final AtomicBoolean f28188b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f28189c = new AtomicBoolean(true);

    /* renamed from: d */
    public final C4783g f28190d = new C4783g();

    /* renamed from: e */
    public final C4779c f28191e = new C4779c();

    /* renamed from: f */
    public final C4387s0<Long> f28192f = new C4387s0<>();

    /* renamed from: g */
    public final C4387s0<C4781e> f28193g = new C4387s0<>();

    /* renamed from: h */
    public final float[] f28194h = new float[16];

    /* renamed from: i */
    public final float[] f28195i = new float[16];

    /* renamed from: l */
    public volatile int f28198l = 0;

    /* renamed from: m */
    public int f28199m = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m24220g(SurfaceTexture surfaceTexture) {
        this.f28188b.set(true);
    }

    @Override // p078e9.InterfaceC4679m
    /* renamed from: a */
    public void mo23576a(long j10, long j11, C7629w0 c7629w0, MediaFormat mediaFormat) {
        this.f28192f.m22226a(j11, Long.valueOf(j10));
        m24224i(c7629w0.f37096w, c7629w0.f37097x, j11);
    }

    @Override // p096f9.InterfaceC4777a
    /* renamed from: b */
    public void mo24184b(long j10, float[] fArr) {
        this.f28191e.m24192e(j10, fArr);
    }

    @Override // p096f9.InterfaceC4777a
    /* renamed from: c */
    public void mo24185c() {
        this.f28192f.m22228c();
        this.f28191e.m24191d();
        this.f28189c.set(true);
    }

    /* renamed from: e */
    public void m24221e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        C4378o.m22171b();
        if (this.f28188b.compareAndSet(true, false)) {
            ((SurfaceTexture) C4349a.m21882e(this.f28197k)).updateTexImage();
            C4378o.m22171b();
            if (this.f28189c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f28194h, 0);
            }
            long timestamp = this.f28197k.getTimestamp();
            Long m22231g = this.f28192f.m22231g(timestamp);
            if (m22231g != null) {
                this.f28191e.m24190c(this.f28194h, m22231g.longValue());
            }
            C4781e m22234j = this.f28193g.m22234j(timestamp);
            if (m22234j != null) {
                this.f28190d.m24214d(m22234j);
            }
        }
        Matrix.multiplyMM(this.f28195i, 0, fArr, 0, this.f28194h, 0);
        this.f28190d.m24212a(this.f28196j, this.f28195i, z10);
    }

    /* renamed from: f */
    public SurfaceTexture m24222f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C4378o.m22171b();
        this.f28190d.m24213b();
        C4378o.m22171b();
        this.f28196j = C4378o.m22176g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f28196j);
        this.f28197k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: f9.h

            /* renamed from: b */
            public final C4785i f28187b;

            {
                this.f28187b = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f28187b.m24220g(surfaceTexture2);
            }
        });
        return this.f28197k;
    }

    /* renamed from: h */
    public void m24223h(int i10) {
        this.f28198l = i10;
    }

    /* renamed from: i */
    public final void m24224i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f28200n;
        int i11 = this.f28199m;
        this.f28200n = bArr;
        int i12 = i10;
        if (i10 == -1) {
            i12 = this.f28198l;
        }
        this.f28199m = i12;
        if (i11 == i12 && Arrays.equals(bArr2, this.f28200n)) {
            return;
        }
        C4781e c4781e = null;
        byte[] bArr3 = this.f28200n;
        if (bArr3 != null) {
            c4781e = C4782f.m24204a(bArr3, this.f28199m);
        }
        if (c4781e == null || !C4783g.m24211c(c4781e)) {
            c4781e = C4781e.m24200b(this.f28199m);
        }
        this.f28193g.m22226a(j10, c4781e);
    }
}
