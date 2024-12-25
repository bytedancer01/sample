package p332t6;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t6/b.class
 */
/* renamed from: t6.b */
/* loaded from: combined.jar:classes2.jar:t6/b.class */
public final class C8634b {

    /* renamed from: a */
    public byte[] f40303a;

    /* renamed from: b */
    public byte[] f40304b;

    /* renamed from: c */
    public int f40305c;

    /* renamed from: d */
    public int[] f40306d;

    /* renamed from: e */
    public int[] f40307e;

    /* renamed from: f */
    public int f40308f;

    /* renamed from: g */
    public int f40309g;

    /* renamed from: h */
    public int f40310h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f40311i;

    /* renamed from: j */
    public final b f40312j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:t6/b$b.class
     */
    /* renamed from: t6.b$b */
    /* loaded from: combined.jar:classes2.jar:t6/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f40313a;

        /* renamed from: b */
        public final MediaCodec$CryptoInfo$Pattern f40314b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f40313a = cryptoInfo;
            this.f40314b = new MediaCodec$CryptoInfo$Pattern(0, 0);
        }

        /* renamed from: b */
        public final void m37075b(int i10, int i11) {
            this.f40314b.set(i10, i11);
            this.f40313a.setPattern(this.f40314b);
        }
    }

    public C8634b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f40311i = cryptoInfo;
        this.f40312j = C4401z0.f26679a >= 24 ? new b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m37071a() {
        return this.f40311i;
    }

    /* renamed from: b */
    public void m37072b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f40306d == null) {
            int[] iArr = new int[1];
            this.f40306d = iArr;
            this.f40311i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f40306d;
        iArr2[0] = iArr2[0] + i10;
    }

    /* renamed from: c */
    public void m37073c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f40308f = i10;
        this.f40306d = iArr;
        this.f40307e = iArr2;
        this.f40304b = bArr;
        this.f40303a = bArr2;
        this.f40305c = i11;
        this.f40309g = i12;
        this.f40310h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f40311i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (C4401z0.f26679a >= 24) {
            ((b) C4349a.m21882e(this.f40312j)).m37075b(i12, i13);
        }
    }
}
