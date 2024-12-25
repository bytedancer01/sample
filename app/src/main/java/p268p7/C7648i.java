package p268p7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p059d9.C4349a;
import p059d9.C4382q;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/i.class
 */
/* renamed from: p7.i */
/* loaded from: combined.jar:classes2.jar:p7/i.class */
public final class C7648i extends MediaCodec.Callback {

    /* renamed from: b */
    public final HandlerThread f37174b;

    /* renamed from: c */
    public Handler f37175c;

    /* renamed from: h */
    public MediaFormat f37180h;

    /* renamed from: i */
    public MediaFormat f37181i;

    /* renamed from: j */
    public MediaCodec.CodecException f37182j;

    /* renamed from: k */
    public long f37183k;

    /* renamed from: l */
    public boolean f37184l;

    /* renamed from: m */
    public IllegalStateException f37185m;

    /* renamed from: a */
    public final Object f37173a = new Object();

    /* renamed from: d */
    public final C4382q f37176d = new C4382q();

    /* renamed from: e */
    public final C4382q f37177e = new C4382q();

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f37178f = new ArrayDeque<>();

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f37179g = new ArrayDeque<>();

    public C7648i(HandlerThread handlerThread) {
        this.f37174b = handlerThread;
    }

    /* renamed from: b */
    public final void m33286b(MediaFormat mediaFormat) {
        this.f37177e.m22213a(-2);
        this.f37179g.add(mediaFormat);
    }

    /* renamed from: c */
    public int m33287c() {
        synchronized (this.f37173a) {
            int i10 = -1;
            if (m33293i()) {
                return -1;
            }
            m33294k();
            if (!this.f37176d.m22216d()) {
                i10 = this.f37176d.m22217e();
            }
            return i10;
        }
    }

    /* renamed from: d */
    public int m33288d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f37173a) {
            if (m33293i()) {
                return -1;
            }
            m33294k();
            if (this.f37177e.m22216d()) {
                return -1;
            }
            int m22217e = this.f37177e.m22217e();
            if (m22217e >= 0) {
                C4349a.m21886i(this.f37180h);
                MediaCodec.BufferInfo remove = this.f37178f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (m22217e == -2) {
                this.f37180h = this.f37179g.remove();
            }
            return m22217e;
        }
    }

    /* renamed from: e */
    public void m33289e(final Runnable runnable) {
        synchronized (this.f37173a) {
            this.f37183k++;
            ((Handler) C4401z0.m22391j(this.f37175c)).post(new Runnable(this, runnable) { // from class: p7.h

                /* renamed from: b */
                public final C7648i f37171b;

                /* renamed from: c */
                public final Runnable f37172c;

                {
                    this.f37171b = this;
                    this.f37172c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f37171b.m33285j(this.f37172c);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m33290f() {
        if (!this.f37179g.isEmpty()) {
            this.f37181i = this.f37179g.getLast();
        }
        this.f37176d.m22214b();
        this.f37177e.m22214b();
        this.f37178f.clear();
        this.f37179g.clear();
        this.f37182j = null;
    }

    /* renamed from: g */
    public MediaFormat m33291g() {
        MediaFormat mediaFormat;
        synchronized (this.f37173a) {
            mediaFormat = this.f37180h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m33292h(MediaCodec mediaCodec) {
        C4349a.m21884g(this.f37175c == null);
        this.f37174b.start();
        Handler handler = new Handler(this.f37174b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f37175c = handler;
    }

    /* renamed from: i */
    public final boolean m33293i() {
        return this.f37183k > 0 || this.f37184l;
    }

    /* renamed from: k */
    public final void m33294k() {
        m33295l();
        m33296m();
    }

    /* renamed from: l */
    public final void m33295l() {
        IllegalStateException illegalStateException = this.f37185m;
        if (illegalStateException == null) {
            return;
        }
        this.f37185m = null;
        throw illegalStateException;
    }

    /* renamed from: m */
    public final void m33296m() {
        MediaCodec.CodecException codecException = this.f37182j;
        if (codecException == null) {
            return;
        }
        this.f37182j = null;
        throw codecException;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m33285j(Runnable runnable) {
        synchronized (this.f37173a) {
            m33298o(runnable);
        }
    }

    /* renamed from: o */
    public final void m33298o(Runnable runnable) {
        if (this.f37184l) {
            return;
        }
        long j10 = this.f37183k - 1;
        this.f37183k = j10;
        if (j10 > 0) {
            return;
        }
        if (j10 < 0) {
            m33299p(new IllegalStateException());
            return;
        }
        m33290f();
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            m33299p(e10);
        } catch (Exception e11) {
            m33299p(new IllegalStateException(e11));
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f37173a) {
            this.f37182j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f37173a) {
            this.f37176d.m22213a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f37173a) {
            MediaFormat mediaFormat = this.f37181i;
            if (mediaFormat != null) {
                m33286b(mediaFormat);
                this.f37181i = null;
            }
            this.f37177e.m22213a(i10);
            this.f37178f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f37173a) {
            m33286b(mediaFormat);
            this.f37181i = null;
        }
    }

    /* renamed from: p */
    public final void m33299p(IllegalStateException illegalStateException) {
        synchronized (this.f37173a) {
            this.f37185m = illegalStateException;
        }
    }

    /* renamed from: q */
    public void m33300q() {
        synchronized (this.f37173a) {
            this.f37184l = true;
            this.f37174b.quit();
            m33290f();
        }
    }
}
