package p009a8;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p027b9.C0858p;
import p027b9.InterfaceC0853l0;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/n.class
 */
/* renamed from: a8.n */
/* loaded from: combined.jar:classes2.jar:a8/n.class */
public final class C0109n implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC0854m f449a;

    /* renamed from: b */
    public final int f450b;

    /* renamed from: c */
    public final a f451c;

    /* renamed from: d */
    public final byte[] f452d;

    /* renamed from: e */
    public int f453e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/n$a.class
     */
    /* renamed from: a8.n$a */
    /* loaded from: combined.jar:classes2.jar:a8/n$a.class */
    public interface a {
        /* renamed from: b */
        void mo499b(C4361f0 c4361f0);
    }

    public C0109n(InterfaceC0854m interfaceC0854m, int i10, a aVar) {
        C4349a.m21878a(i10 > 0);
        this.f449a = interfaceC0854m;
        this.f450b = i10;
        this.f451c = aVar;
        this.f452d = new byte[1];
        this.f453e = i10;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        throw new UnsupportedOperationException();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f449a.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        return this.f449a.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f449a.getUri();
    }

    /* renamed from: h */
    public final boolean m524h() {
        if (this.f449a.read(this.f452d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f452d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (true) {
            int i13 = i10;
            if (i11 <= 0) {
                while (i13 > 0 && bArr[i13 - 1] == 0) {
                    i13--;
                }
                if (i13 <= 0) {
                    return true;
                }
                this.f451c.mo499b(new C4361f0(bArr, i13));
                return true;
            }
            int read = this.f449a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f453e == 0) {
            if (!m524h()) {
                return -1;
            }
            this.f453e = this.f450b;
        }
        int read = this.f449a.read(bArr, i10, Math.min(this.f453e, i11));
        if (read != -1) {
            this.f453e -= read;
        }
        return read;
    }
}
