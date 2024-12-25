package p027b9;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p009a8.C0111o;
import p027b9.C0839e0;
import p027b9.C0858p;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/g0.class
 */
/* renamed from: b9.g0 */
/* loaded from: combined.jar:classes2.jar:b9/g0.class */
public final class C0843g0<T> implements C0839e0.e {

    /* renamed from: a */
    public final long f5796a;

    /* renamed from: b */
    public final C0858p f5797b;

    /* renamed from: c */
    public final int f5798c;

    /* renamed from: d */
    public final C0849j0 f5799d;

    /* renamed from: e */
    public final a<? extends T> f5800e;

    /* renamed from: f */
    public volatile T f5801f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/g0$a.class
     */
    /* renamed from: b9.g0$a */
    /* loaded from: combined.jar:classes2.jar:b9/g0$a.class */
    public interface a<T> {
        /* renamed from: a */
        T mo5362a(Uri uri, InputStream inputStream);
    }

    public C0843g0(InterfaceC0854m interfaceC0854m, Uri uri, int i10, a<? extends T> aVar) {
        this(interfaceC0854m, new C0858p.b().m5391i(uri).m5384b(1).m5383a(), i10, aVar);
    }

    public C0843g0(InterfaceC0854m interfaceC0854m, C0858p c0858p, int i10, a<? extends T> aVar) {
        this.f5799d = new C0849j0(interfaceC0854m);
        this.f5797b = c0858p;
        this.f5798c = i10;
        this.f5800e = aVar;
        this.f5796a = C0111o.m525a();
    }

    /* renamed from: g */
    public static <T> T m5357g(InterfaceC0854m interfaceC0854m, a<? extends T> aVar, C0858p c0858p, int i10) {
        C0843g0 c0843g0 = new C0843g0(interfaceC0854m, c0858p, i10, aVar);
        c0843g0.mo498a();
        return (T) C4349a.m21882e(c0843g0.m5360e());
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: a */
    public final void mo498a() {
        this.f5799d.m5366t();
        C0857o c0857o = new C0857o(this.f5799d, this.f5797b);
        try {
            c0857o.m5375l();
            this.f5801f = this.f5800e.mo5362a((Uri) C4349a.m21882e(this.f5799d.getUri()), c0857o);
        } finally {
            C4401z0.m22403p(c0857o);
        }
    }

    /* renamed from: b */
    public long m5358b() {
        return this.f5799d.m5363h();
    }

    @Override // p027b9.C0839e0.e
    /* renamed from: c */
    public final void mo500c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> m5359d() {
        return this.f5799d.m5365s();
    }

    /* renamed from: e */
    public final T m5360e() {
        return this.f5801f;
    }

    /* renamed from: f */
    public Uri m5361f() {
        return this.f5799d.m5364r();
    }
}
