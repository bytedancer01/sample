package p182k7;

import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/p.class
 */
/* renamed from: k7.p */
/* loaded from: combined.jar:classes2.jar:k7/p.class */
public final class C5525p {

    /* renamed from: a */
    public final boolean f31536a;

    /* renamed from: b */
    public final String f31537b;

    /* renamed from: c */
    public final InterfaceC4337t.a f31538c;

    /* renamed from: d */
    public final int f31539d;

    /* renamed from: e */
    public final byte[] f31540e;

    public C5525p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        C4349a.m21878a((bArr2 != null ? false : true) ^ (i10 == 0));
        this.f31536a = z10;
        this.f31537b = str;
        this.f31539d = i10;
        this.f31540e = bArr2;
        this.f31538c = new InterfaceC4337t.a(m27492a(str), bArr, i11, i12);
    }

    /* renamed from: a */
    public static int m27492a(String str) {
        if (str == null) {
            return 1;
        }
        switch (str) {
            case "cbc1":
            case "cbcs":
                break;
            case "cenc":
            case "cens":
                break;
            default:
                C4392v.m22275i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
