package p027b9;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/k0.class
 */
/* renamed from: b9.k0 */
/* loaded from: combined.jar:classes2.jar:b9/k0.class */
public final class C0851k0 implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC0854m f5826a;

    /* renamed from: b */
    public final InterfaceC0850k f5827b;

    /* renamed from: c */
    public boolean f5828c;

    /* renamed from: d */
    public long f5829d;

    public C0851k0(InterfaceC0854m interfaceC0854m, InterfaceC0850k interfaceC0850k) {
        this.f5826a = (InterfaceC0854m) C4349a.m21882e(interfaceC0854m);
        this.f5827b = (InterfaceC0850k) C4349a.m21882e(interfaceC0850k);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        long mo521a = this.f5826a.mo521a(c0858p);
        this.f5829d = mo521a;
        if (mo521a == 0) {
            return 0L;
        }
        C0858p c0858p2 = c0858p;
        if (c0858p.f5854h == -1) {
            c0858p2 = c0858p;
            if (mo521a != -1) {
                c0858p2 = c0858p.m5381f(0L, mo521a);
            }
        }
        this.f5828c = true;
        this.f5827b.mo5367a(c0858p2);
        return this.f5829d;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f5826a.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        try {
            this.f5826a.close();
        } finally {
            if (this.f5828c) {
                this.f5828c = false;
                this.f5827b.close();
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        return this.f5826a.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5826a.getUri();
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f5829d == 0) {
            return -1;
        }
        int read = this.f5826a.read(bArr, i10, i11);
        if (read > 0) {
            this.f5827b.write(bArr, i10, read);
            long j10 = this.f5829d;
            if (j10 != -1) {
                this.f5829d = j10 - read;
            }
        }
        return read;
    }
}
