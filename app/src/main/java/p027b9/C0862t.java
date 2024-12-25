package p027b9;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p025b7.C0819a;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/t.class
 */
/* renamed from: b9.t */
/* loaded from: combined.jar:classes2.jar:b9/t.class */
public final class C0862t implements InterfaceC0854m {

    /* renamed from: a */
    public final Context f5905a;

    /* renamed from: b */
    public final List<InterfaceC0853l0> f5906b = new ArrayList();

    /* renamed from: c */
    public final InterfaceC0854m f5907c;

    /* renamed from: d */
    public InterfaceC0854m f5908d;

    /* renamed from: e */
    public InterfaceC0854m f5909e;

    /* renamed from: f */
    public InterfaceC0854m f5910f;

    /* renamed from: g */
    public InterfaceC0854m f5911g;

    /* renamed from: h */
    public InterfaceC0854m f5912h;

    /* renamed from: i */
    public InterfaceC0854m f5913i;

    /* renamed from: j */
    public InterfaceC0854m f5914j;

    /* renamed from: k */
    public InterfaceC0854m f5915k;

    public C0862t(Context context, InterfaceC0854m interfaceC0854m) {
        this.f5905a = context.getApplicationContext();
        this.f5907c = (InterfaceC0854m) C4349a.m21882e(interfaceC0854m);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        InterfaceC0854m m5410s;
        C4349a.m21884g(this.f5915k == null);
        String scheme = c0858p.f5847a.getScheme();
        if (C4401z0.m22414u0(c0858p.f5847a)) {
            String path = c0858p.f5847a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                m5410s = m5412u();
            }
            m5410s = m5409r();
        } else {
            if (!"asset".equals(scheme)) {
                m5410s = "content".equals(scheme) ? m5410s() : "rtmp".equals(scheme) ? m5414w() : "udp".equals(scheme) ? m5415x() : "data".equals(scheme) ? m5411t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? m5413v() : this.f5907c;
            }
            m5410s = m5409r();
        }
        this.f5915k = m5410s;
        return this.f5915k.mo521a(c0858p);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: c */
    public void mo522c(InterfaceC0853l0 interfaceC0853l0) {
        C4349a.m21882e(interfaceC0853l0);
        this.f5907c.mo522c(interfaceC0853l0);
        this.f5906b.add(interfaceC0853l0);
        m5416y(this.f5908d, interfaceC0853l0);
        m5416y(this.f5909e, interfaceC0853l0);
        m5416y(this.f5910f, interfaceC0853l0);
        m5416y(this.f5911g, interfaceC0853l0);
        m5416y(this.f5912h, interfaceC0853l0);
        m5416y(this.f5913i, interfaceC0853l0);
        m5416y(this.f5914j, interfaceC0853l0);
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        InterfaceC0854m interfaceC0854m = this.f5915k;
        if (interfaceC0854m != null) {
            try {
                interfaceC0854m.close();
            } finally {
                this.f5915k = null;
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: e */
    public Map<String, List<String>> mo523e() {
        InterfaceC0854m interfaceC0854m = this.f5915k;
        return interfaceC0854m == null ? Collections.emptyMap() : interfaceC0854m.mo523e();
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        InterfaceC0854m interfaceC0854m = this.f5915k;
        return interfaceC0854m == null ? null : interfaceC0854m.getUri();
    }

    /* renamed from: h */
    public final void m5408h(InterfaceC0854m interfaceC0854m) {
        for (int i10 = 0; i10 < this.f5906b.size(); i10++) {
            interfaceC0854m.mo522c(this.f5906b.get(i10));
        }
    }

    /* renamed from: r */
    public final InterfaceC0854m m5409r() {
        if (this.f5909e == null) {
            C0834c c0834c = new C0834c(this.f5905a);
            this.f5909e = c0834c;
            m5408h(c0834c);
        }
        return this.f5909e;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        return ((InterfaceC0854m) C4349a.m21882e(this.f5915k)).read(bArr, i10, i11);
    }

    /* renamed from: s */
    public final InterfaceC0854m m5410s() {
        if (this.f5910f == null) {
            C0844h c0844h = new C0844h(this.f5905a);
            this.f5910f = c0844h;
            m5408h(c0844h);
        }
        return this.f5910f;
    }

    /* renamed from: t */
    public final InterfaceC0854m m5411t() {
        if (this.f5913i == null) {
            C0848j c0848j = new C0848j();
            this.f5913i = c0848j;
            m5408h(c0848j);
        }
        return this.f5913i;
    }

    /* renamed from: u */
    public final InterfaceC0854m m5412u() {
        if (this.f5908d == null) {
            C0868z c0868z = new C0868z();
            this.f5908d = c0868z;
            m5408h(c0868z);
        }
        return this.f5908d;
    }

    /* renamed from: v */
    public final InterfaceC0854m m5413v() {
        if (this.f5914j == null) {
            C0847i0 c0847i0 = new C0847i0(this.f5905a);
            this.f5914j = c0847i0;
            m5408h(c0847i0);
        }
        return this.f5914j;
    }

    /* renamed from: w */
    public final InterfaceC0854m m5414w() {
        if (this.f5911g == null) {
            try {
                int i10 = C0819a.f5679g;
                InterfaceC0854m interfaceC0854m = (InterfaceC0854m) C0819a.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f5911g = interfaceC0854m;
                m5408h(interfaceC0854m);
            } catch (ClassNotFoundException e10) {
                C4392v.m22275i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating RTMP extension", e11);
            }
            if (this.f5911g == null) {
                this.f5911g = this.f5907c;
            }
        }
        return this.f5911g;
    }

    /* renamed from: x */
    public final InterfaceC0854m m5415x() {
        if (this.f5912h == null) {
            C0855m0 c0855m0 = new C0855m0();
            this.f5912h = c0855m0;
            m5408h(c0855m0);
        }
        return this.f5912h;
    }

    /* renamed from: y */
    public final void m5416y(InterfaceC0854m interfaceC0854m, InterfaceC0853l0 interfaceC0853l0) {
        if (interfaceC0854m != null) {
            interfaceC0854m.mo522c(interfaceC0853l0);
        }
    }
}
