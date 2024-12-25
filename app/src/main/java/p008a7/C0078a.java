package p008a7;

import android.os.Handler;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;
import com.google.android.exoplayer2.ext.opus.OpusLibrary;
import p059d9.C4391u0;
import p059d9.C4401z0;
import p267p6.C7629w0;
import p301r6.AbstractC7969b0;
import p301r6.InterfaceC7980h;
import p301r6.InterfaceC8002t;
import p301r6.InterfaceC8003u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a7/a.class
 */
/* renamed from: a7.a */
/* loaded from: combined.jar:classes2.jar:a7/a.class */
public class C0078a extends AbstractC7969b0<OpusDecoder> {
    public C0078a() {
        this((Handler) null, (InterfaceC8002t) null, new InterfaceC7980h[0]);
    }

    public C0078a(Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC8003u interfaceC8003u) {
        super(handler, interfaceC8002t, interfaceC8003u);
    }

    public C0078a(Handler handler, InterfaceC8002t interfaceC8002t, InterfaceC7980h... interfaceC7980hArr) {
        super(handler, interfaceC8002t, interfaceC7980hArr);
    }

    @Override // p301r6.AbstractC7969b0
    /* renamed from: c0 */
    public int mo298c0(C7629w0 c7629w0) {
        Class<? extends ExoMediaCrypto> cls = c7629w0.f37073F;
        boolean z10 = cls == null || OpusLibrary.m12047c(cls);
        if (!OpusLibrary.m12046b() || !"audio/opus".equalsIgnoreCase(c7629w0.f37086m)) {
            return 0;
        }
        if (m34559b0(C4401z0.m22372c0(2, c7629w0.f37099z, c7629w0.f37068A))) {
            return !z10 ? 2 : 4;
        }
        return 1;
    }

    @Override // p301r6.AbstractC7969b0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public OpusDecoder mo296N(C7629w0 c7629w0, ExoMediaCrypto exoMediaCrypto) {
        C4391u0.m22263a("createOpusDecoder");
        boolean z10 = m34550S(C4401z0.m22372c0(4, c7629w0.f37099z, c7629w0.f37068A)) == 2;
        int i10 = c7629w0.f37087n;
        if (i10 == -1) {
            i10 = 5760;
        }
        OpusDecoder opusDecoder = new OpusDecoder(16, 16, i10, c7629w0.f37088o, exoMediaCrypto, z10);
        C4391u0.m22265c();
        return opusDecoder;
    }

    @Override // p301r6.AbstractC7969b0
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C7629w0 mo297R(OpusDecoder opusDecoder) {
        return C4401z0.m22372c0(opusDecoder.f13749n ? 4 : 2, opusDecoder.f13750o, 48000);
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "LibopusAudioRenderer";
    }
}
