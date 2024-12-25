package p027b9;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/j0.class
 */
/* renamed from: b9.j0 */
/* loaded from: combined.jar:classes2.jar:b9/j0.class */
public final class C0849j0 implements InterfaceC0854m {

    /* renamed from: a */
    public final InterfaceC0854m f5822a;

    /* renamed from: b */
    public long f5823b;

    /* renamed from: c */
    public Uri f5824c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f5825d = Collections.emptyMap();

    public C0849j0(InterfaceC0854m interfaceC0854m) {
        this.f5822a = (InterfaceC0854m) C4349a.m21882e(interfaceC0854m);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        this.f5824c = c0858p.f5847a;
        this.f5825d = Collections.emptyMap();
        long mo521a = this.f5822a.mo521a(c0858p);
        this.f5824c = (Uri) C4349a.m21882e(getUri());
        this.f5825d = mo523e();
        return mo521a;
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f5822a.mo522c(interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5822a.close();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        return this.f5822a.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5822a.getUri();
    }

    /* renamed from: h */
    public long m5363h() {
        return this.f5823b;
    }

    /* renamed from: r */
    public Uri m5364r() {
        return this.f5824c;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f5822a.read(bArr, i10, i11);
        if (read != -1) {
            this.f5823b += read;
        }
        return read;
    }

    /* renamed from: s */
    public Map<String, List<String>> m5365s() {
        return this.f5825d;
    }

    /* renamed from: t */
    public void m5366t() {
        this.f5823b = 0L;
    }
}
