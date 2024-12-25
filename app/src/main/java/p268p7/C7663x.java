package p268p7;

import android.media.MediaCodec;
import android.media.MediaCodec$OnFrameRenderedListener;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p059d9.C4349a;
import p059d9.C4391u0;
import p059d9.C4401z0;
import p268p7.InterfaceC7651l;
import p332t6.C8634b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p7/x.class
 */
/* renamed from: p7.x */
/* loaded from: combined.jar:classes2.jar:p7/x.class */
public class C7663x implements InterfaceC7651l {

    /* renamed from: a */
    public final MediaCodec f37304a;

    /* renamed from: b */
    public ByteBuffer[] f37305b;

    /* renamed from: c */
    public ByteBuffer[] f37306c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p7/x$b.class
     */
    /* renamed from: p7.x$b */
    /* loaded from: combined.jar:classes2.jar:p7/x$b.class */
    public static class b implements InterfaceC7651l.b {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
        @Override // p268p7.InterfaceC7651l.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p268p7.InterfaceC7651l mo33260a(p268p7.InterfaceC7651l.a r7) {
            /*
                r6 = this;
                r0 = 0
                r9 = r0
                r0 = r6
                r1 = r7
                android.media.MediaCodec r0 = r0.m33456b(r1)     // Catch: java.lang.RuntimeException -> L44 java.io.IOException -> L4a
                r8 = r0
                java.lang.String r0 = "configureCodec"
                p059d9.C4391u0.m22263a(r0)     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r0 = r8
                r1 = r7
                android.media.MediaFormat r1 = r1.f37193b     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r2 = r7
                android.view.Surface r2 = r2.f37195d     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r3 = r7
                android.media.MediaCrypto r3 = r3.f37196e     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r4 = r7
                int r4 = r4.f37197f     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r0.configure(r1, r2, r3, r4)     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                p059d9.C4391u0.m22265c()     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                java.lang.String r0 = "startCodec"
                p059d9.C4391u0.m22263a(r0)     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r0 = r8
                r0.start()     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                p059d9.C4391u0.m22265c()     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                p7.x r0 = new p7.x     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r1 = r0
                r2 = r8
                r3 = 0
                r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L3c java.io.IOException -> L40
                r7 = r0
                r0 = r7
                return r0
            L3c:
                r7 = move-exception
                goto L41
            L40:
                r7 = move-exception
            L41:
                goto L4d
            L44:
                r7 = move-exception
                r0 = r9
                r8 = r0
                goto L4d
            L4a:
                r7 = move-exception
                r0 = r9
                r8 = r0
            L4d:
                r0 = r8
                if (r0 == 0) goto L55
                r0 = r8
                r0.release()
            L55:
                r0 = r7
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p268p7.C7663x.b.mo33260a(p7.l$a):p7.l");
        }

        /* renamed from: b */
        public MediaCodec m33456b(InterfaceC7651l.a aVar) {
            C4349a.m21882e(aVar.f37192a);
            String str = aVar.f37192a.f37201a;
            C4391u0.m22263a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C4391u0.m22265c();
            return createByCodecName;
        }
    }

    public C7663x(MediaCodec mediaCodec) {
        this.f37304a = mediaCodec;
        if (C4401z0.f26679a < 21) {
            this.f37305b = mediaCodec.getInputBuffers();
            this.f37306c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m33455p(InterfaceC7651l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.mo23572a(this, j10, j11);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: a */
    public MediaFormat mo33240a() {
        return this.f37304a.getOutputFormat();
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: b */
    public void mo33241b(final InterfaceC7651l.c cVar, Handler handler) {
        this.f37304a.setOnFrameRenderedListener(new MediaCodec$OnFrameRenderedListener(this, cVar) { // from class: p7.w

            /* renamed from: a */
            public final C7663x f37302a;

            /* renamed from: b */
            public final InterfaceC7651l.c f37303b;

            {
                this.f37302a = this;
                this.f37303b = cVar;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f37302a.m33455p(this.f37303b, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: c */
    public void mo33242c(int i10, int i11, C8634b c8634b, long j10, int i12) {
        this.f37304a.queueSecureInputBuffer(i10, i11, c8634b.m37071a(), j10, i12);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: d */
    public void mo33243d(int i10) {
        this.f37304a.setVideoScalingMode(i10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: e */
    public ByteBuffer mo33244e(int i10) {
        return C4401z0.f26679a >= 21 ? this.f37304a.getInputBuffer(i10) : ((ByteBuffer[]) C4401z0.m22391j(this.f37305b))[i10];
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: f */
    public void mo33245f(Surface surface) {
        this.f37304a.setOutputSurface(surface);
    }

    @Override // p268p7.InterfaceC7651l
    public void flush() {
        this.f37304a.flush();
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: g */
    public void mo33246g(int i10, int i11, int i12, long j10, int i13) {
        this.f37304a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: h */
    public boolean mo33247h() {
        return false;
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: i */
    public void mo33248i(Bundle bundle) {
        this.f37304a.setParameters(bundle);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: j */
    public void mo33249j(int i10, long j10) {
        this.f37304a.releaseOutputBuffer(i10, j10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: k */
    public int mo33250k() {
        return this.f37304a.dequeueInputBuffer(0L);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: l */
    public int mo33251l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f37304a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C4401z0.f26679a < 21) {
                this.f37306c = this.f37304a.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: m */
    public void mo33252m(int i10, boolean z10) {
        this.f37304a.releaseOutputBuffer(i10, z10);
    }

    @Override // p268p7.InterfaceC7651l
    /* renamed from: n */
    public ByteBuffer mo33253n(int i10) {
        return C4401z0.f26679a >= 21 ? this.f37304a.getOutputBuffer(i10) : ((ByteBuffer[]) C4401z0.m22391j(this.f37306c))[i10];
    }

    @Override // p268p7.InterfaceC7651l
    public void release() {
        this.f37305b = null;
        this.f37306c = null;
        this.f37304a.release();
    }
}
