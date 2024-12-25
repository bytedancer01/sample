package p380w6;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.av1.Gav1Decoder;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
import p059d9.C4391u0;
import p059d9.C4401z0;
import p078e9.AbstractC4667c;
import p078e9.InterfaceC4668c0;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p332t6.C8639g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w6/d.class
 */
/* renamed from: w6.d */
/* loaded from: combined.jar:classes2.jar:w6/d.class */
public class C9424d extends AbstractC4667c {

    /* renamed from: f0 */
    public static final int f43174f0 = ((C4401z0.m22395l(1280, 64) * C4401z0.m22395l(720, 64)) * 6144) / 2;

    /* renamed from: W */
    public final int f43175W;

    /* renamed from: X */
    public final int f43176X;

    /* renamed from: Y */
    public final int f43177Y;

    /* renamed from: Z */
    public Gav1Decoder f43178Z;

    public C9424d(long j10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10) {
        this(j10, handler, interfaceC4668c0, i10, 0, 4, 4);
    }

    public C9424d(long j10, Handler handler, InterfaceC4668c0 interfaceC4668c0, int i10, int i11, int i12, int i13) {
        super(j10, handler, interfaceC4668c0, i10);
        this.f43177Y = i11;
        this.f43175W = i12;
        this.f43176X = i13;
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: L */
    public C8639g mo5979L(String str, C7629w0 c7629w0, C7629w0 c7629w02) {
        return new C8639g(str, c7629w0, c7629w02, 3, 0);
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public final int mo5981a(C7629w0 c7629w0) {
        return ("video/av01".equalsIgnoreCase(c7629w0.f37086m) && C9423c.m39775a()) ? c7629w0.f37073F != null ? C7630w1.m33226a(2) : C7630w1.m33227b(4, 16, 0) : C7630w1.m33226a(0);
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "Libgav1VideoRenderer";
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: m0 */
    public void mo5982m0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) {
        Gav1Decoder gav1Decoder = this.f43178Z;
        if (gav1Decoder == null) {
            throw new C9422b("Failed to render output buffer to surface: decoder is not initialized.");
        }
        gav1Decoder.m11979A(videoDecoderOutputBuffer, surface);
        videoDecoderOutputBuffer.release();
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: o0 */
    public void mo5983o0(int i10) {
        Gav1Decoder gav1Decoder = this.f43178Z;
        if (gav1Decoder != null) {
            gav1Decoder.m11980B(i10);
        }
    }

    @Override // p078e9.AbstractC4667c
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public Gav1Decoder mo5980O(C7629w0 c7629w0, ExoMediaCrypto exoMediaCrypto) {
        C4391u0.m22263a("createGav1Decoder");
        int i10 = c7629w0.f37087n;
        if (i10 == -1) {
            i10 = f43174f0;
        }
        Gav1Decoder gav1Decoder = new Gav1Decoder(this.f43175W, this.f43176X, i10, this.f43177Y);
        this.f43178Z = gav1Decoder;
        C4391u0.m22265c();
        return gav1Decoder;
    }
}
