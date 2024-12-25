package p038c8;

import java.util.Arrays;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/l.class
 */
/* renamed from: c8.l */
/* loaded from: combined.jar:classes2.jar:c8/l.class */
public abstract class AbstractC1026l extends AbstractC1020f {

    /* renamed from: j */
    public byte[] f6913j;

    /* renamed from: k */
    public volatile boolean f6914k;

    public AbstractC1026l(InterfaceC0854m interfaceC0854m, C0858p c0858p, int i10, C7629w0 c7629w0, int i11, Object obj, byte[] bArr) {
        super(interfaceC0854m, c0858p, i10, c7629w0, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f6913j = bArr == null ? C4401z0.f26684f : bArr;
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public final void mo498a() {
        try {
            this.f6876i.mo521a(this.f6869b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f6914k) {
                m6050i(i11);
                int read = this.f6876i.read(this.f6913j, i11, 16384);
                i10 = read;
                if (read != -1) {
                    i11 += read;
                    i10 = read;
                }
            }
            if (!this.f6914k) {
                mo6048g(this.f6913j, i11);
            }
        } finally {
            C4401z0.m22401o(this.f6876i);
        }
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public final void mo500c() {
        this.f6914k = true;
    }

    /* renamed from: g */
    public abstract void mo6048g(byte[] bArr, int i10);

    /* renamed from: h */
    public byte[] m6049h() {
        return this.f6913j;
    }

    /* renamed from: i */
    public final void m6050i(int i10) {
        byte[] bArr = this.f6913j;
        if (bArr.length < i10 + 16384) {
            this.f6913j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
