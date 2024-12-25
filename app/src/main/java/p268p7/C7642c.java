package p268p7;

import android.media.MediaCodec;
import android.media.MediaCodec$OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import ec.InterfaceC4712o;
import java.nio.ByteBuffer;
import java.util.Objects;
import p059d9.C4391u0;
import p268p7.C7642c;
import p268p7.InterfaceC7651l;
import p332t6.C8634b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/c.class
 */
/* renamed from: p7.c */
/* loaded from: combined.jar:classes2.jar:p7/c.class */
public final class C7642c implements InterfaceC7651l {

    /* renamed from: a */
    public final MediaCodec f37143a;

    /* renamed from: b */
    public final C7648i f37144b;

    /* renamed from: c */
    public final C7645f f37145c;

    /* renamed from: d */
    public final boolean f37146d;

    /* renamed from: e */
    public boolean f37147e;

    /* renamed from: f */
    public int f37148f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/c$b.class
     */
    /* renamed from: p7.c$b */
    /* loaded from: combined.jar:classes2.jar:p7/c$b.class */
    public static final class b implements InterfaceC7651l.b {

        /* renamed from: b */
        public final InterfaceC4712o<HandlerThread> f37149b;

        /* renamed from: c */
        public final InterfaceC4712o<HandlerThread> f37150c;

        /* renamed from: d */
        public final boolean f37151d;

        /* renamed from: e */
        public final boolean f37152e;

        public b(final int i10, boolean z10, boolean z11) {
            this(new InterfaceC4712o(i10) { // from class: p7.d

                /* renamed from: b */
                public final int f37153b;

                {
                    this.f37153b = i10;
                }

                @Override // ec.InterfaceC4712o
                public final Object get() {
                    HandlerThread m33258e;
                    m33258e = C7642c.b.m33258e(this.f37153b);
                    return m33258e;
                }
            }, new InterfaceC4712o(i10) { // from class: p7.e

                /* renamed from: b */
                public final int f37154b;

                {
                    this.f37154b = i10;
                }

                @Override // ec.InterfaceC4712o
                public final Object get() {
                    HandlerThread m33259f;
                    m33259f = C7642c.b.m33259f(this.f37154b);
                    return m33259f;
                }
            }, z10, z11);
        }

        public b(InterfaceC4712o<HandlerThread> interfaceC4712o, InterfaceC4712o<HandlerThread> interfaceC4712o2, boolean z10, boolean z11) {
            this.f37149b = interfaceC4712o;
            this.f37150c = interfaceC4712o2;
            this.f37151d = z10;
            this.f37152e = z11;
        }

        /* renamed from: e */
        public static /* synthetic */ HandlerThread m33258e(int i10) {
            return new HandlerThread(C7642c.m33236s(i10));
        }

        /* renamed from: f */
        public static /* synthetic */ HandlerThread m33259f(int i10) {
            return new HandlerThread(C7642c.m33237t(i10));
        }

        @Override // p268p7.InterfaceC7651l.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C7642c mo33260a(InterfaceC7651l.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f37192a.f37201a;
            C7642c c7642c = null;
            try {
                C4391u0.m22263a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C7642c c7642c2 = new C7642c(mediaCodec, this.f37149b.get(), this.f37150c.get(), this.f37151d, this.f37152e);
                    try {
                        C4391u0.m22265c();
                        c7642c2.m33254v(aVar.f37193b, aVar.f37195d, aVar.f37196e, aVar.f37197f);
                        return c7642c2;
                    } catch (Exception e10) {
                        e = e10;
                        c7642c = c7642c2;
                        if (c7642c != null) {
                            c7642c.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodec = null;
            }
        }
    }

    public C7642c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f37143a = mediaCodec;
        this.f37144b = new C7648i(handlerThread);
        this.f37145c = new C7645f(mediaCodec, handlerThread2, z10);
        this.f37146d = z11;
        this.f37148f = 0;
    }

    /* renamed from: s */
    public static String m33236s(int i10) {
        return m33238u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: t */
    public static String m33237t(int i10) {
        return m33238u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: u */
    public static String m33238u(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m33239w(InterfaceC7651l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.mo23572a(this, j10, j11);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: a */
    public MediaFormat mo33240a() {
        return this.f37144b.m33291g();
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: b */
    public void mo33241b(final InterfaceC7651l.c cVar, Handler handler) {
        m33255x();
        this.f37143a.setOnFrameRenderedListener(new MediaCodec$OnFrameRenderedListener(this, cVar) { // from class: p7.a

            /* renamed from: a */
            public final C7642c f37140a;

            /* renamed from: b */
            public final InterfaceC7651l.c f37141b;

            {
                this.f37140a = this;
                this.f37141b = cVar;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f37140a.m33239w(this.f37141b, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: c */
    public void mo33242c(int i10, int i11, C8634b c8634b, long j10, int i12) {
        this.f37145c.m33277o(i10, i11, c8634b, j10, i12);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: d */
    public void mo33243d(int i10) {
        m33255x();
        this.f37143a.setVideoScalingMode(i10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: e */
    public ByteBuffer mo33244e(int i10) {
        return this.f37143a.getInputBuffer(i10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: f */
    public void mo33245f(Surface surface) {
        m33255x();
        this.f37143a.setOutputSurface(surface);
    }

    @Override // p268p7.InterfaceC7651l
    public void flush() {
        this.f37145c.m33273i();
        this.f37143a.flush();
        C7648i c7648i = this.f37144b;
        final MediaCodec mediaCodec = this.f37143a;
        Objects.requireNonNull(mediaCodec);
        c7648i.m33289e(new Runnable(mediaCodec) { // from class: p7.b

            /* renamed from: b */
            public final MediaCodec f37142b;

            {
                this.f37142b = mediaCodec;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f37142b.start();
            }
        });
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: g */
    public void mo33246g(int i10, int i11, int i12, long j10, int i13) {
        this.f37145c.m33276n(i10, i11, i12, j10, i13);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: h */
    public boolean mo33247h() {
        return false;
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: i */
    public void mo33248i(Bundle bundle) {
        m33255x();
        this.f37143a.setParameters(bundle);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: j */
    public void mo33249j(int i10, long j10) {
        this.f37143a.releaseOutputBuffer(i10, j10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: k */
    public int mo33250k() {
        return this.f37144b.m33287c();
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: l */
    public int mo33251l(MediaCodec.BufferInfo bufferInfo) {
        return this.f37144b.m33288d(bufferInfo);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: m */
    public void mo33252m(int i10, boolean z10) {
        this.f37143a.releaseOutputBuffer(i10, z10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: n */
    public ByteBuffer mo33253n(int i10) {
        return this.f37143a.getOutputBuffer(i10);
    }

    @Override // p268p7.InterfaceC7651l
    public void release() {
        try {
            if (this.f37148f == 1) {
                this.f37145c.m33279r();
                this.f37144b.m33300q();
            }
            this.f37148f = 2;
        } finally {
            if (!this.f37147e) {
                this.f37143a.release();
                this.f37147e = true;
            }
        }
    }

    /* renamed from: v */
    public final void m33254v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f37144b.m33292h(this.f37143a);
        C4391u0.m22263a("configureCodec");
        this.f37143a.configure(mediaFormat, surface, mediaCrypto, i10);
        C4391u0.m22265c();
        this.f37145c.m33280s();
        C4391u0.m22263a("startCodec");
        this.f37143a.start();
        C4391u0.m22265c();
        this.f37148f = 1;
    }

    /* renamed from: x */
    public final void m33255x() {
        if (this.f37146d) {
            try {
                this.f37145c.m33281t();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}
