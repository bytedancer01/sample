package p037c7;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;
import com.google.android.exoplayer2.ext.vp9.VpxLibrary;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import p059d9.C4391u0;
import p078e9.AbstractC4667c;
import p078e9.InterfaceC4668c0;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p332t6.C8639g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c7/a.class
 */
/* renamed from: c7.a */
/* loaded from: combined.jar:classes2.jar:c7/a.class */
public class C1012a extends AbstractC4667c {

    /* renamed from: W */
    public final int f6836W;

    /* renamed from: X */
    public final int f6837X;

    /* renamed from: Y */
    public final int f6838Y;

    /* renamed from: Z */
    public VpxDecoder f6839Z;

    public C1012a(long j10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10) {
        this(j10, handler, interfaceC4668c0, i10, Runtime.getRuntime().availableProcessors(), 4, 4);
    }

    public C1012a(long j10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10, int i11, int i12, int i13) {
        super(j10, handler, interfaceC4668c0, i10);
        this.f6838Y = i11;
        this.f6836W = i12;
        this.f6837X = i13;
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: L */
    public C8639g mo5979L(String str, C7629w0 c7629w0, C7629w0 c7629w02) {
        return new C8639g(str, c7629w0, c7629w02, 3, 0);
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public final int mo5981a(C7629w0 c7629w0) {
        if (!VpxLibrary.m12056b() || !"video/x-vnd.on2.vp9".equalsIgnoreCase(c7629w0.f37086m)) {
            return C7630w1.m33226a(0);
        }
        Class<? extends ExoMediaCrypto> cls = c7629w0.f37073F;
        return !(cls == null || VpxLibrary.m12057c(cls)) ? C7630w1.m33226a(2) : C7630w1.m33227b(4, 16, 0);
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "LibvpxVideoRenderer";
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: m0 */
    public void mo5982m0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        VpxDecoder vpxDecoder = this.f6839Z;
        if (vpxDecoder == null) {
            throw new C1014c("Failed to render output buffer to surface: decoder is not initialized.");
        }
        vpxDecoder.m12048A(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: o0 */
    public void mo5983o0(int i10) {
        VpxDecoder vpxDecoder = this.f6839Z;
        if (vpxDecoder != null) {
            vpxDecoder.m12049B(i10);
        }
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public VpxDecoder mo5980O(C7629w0 c7629w0, ExoMediaCrypto exoMediaCrypto) {
        C4391u0.m22263a("createVpxDecoder");
        int i10 = c7629w0.f37087n;
        if (i10 == -1) {
            i10 = 786432;
        }
        VpxDecoder vpxDecoder = new VpxDecoder(this.f6836W, this.f6837X, i10, exoMediaCrypto, this.f6838Y);
        this.f6839Z = vpxDecoder;
        C4391u0.m22265c();
        return vpxDecoder;
    }
}
