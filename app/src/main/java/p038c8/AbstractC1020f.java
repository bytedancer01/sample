package p038c8;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p009a8.C0111o;
import p027b9.C0839e0;
import p027b9.C0849j0;
import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/f.class
 */
/* renamed from: c8.f */
/* loaded from: combined.jar:classes2.jar:c8/f.class */
public abstract class AbstractC1020f implements C0839e0.e {

    /* renamed from: a */
    public final long f6868a = C0111o.m525a();

    /* renamed from: b */
    public final C0858p f6869b;

    /* renamed from: c */
    public final int f6870c;

    /* renamed from: d */
    public final C7629w0 f6871d;

    /* renamed from: e */
    public final int f6872e;

    /* renamed from: f */
    public final Object f6873f;

    /* renamed from: g */
    public final long f6874g;

    /* renamed from: h */
    public final long f6875h;

    /* renamed from: i */
    public final C0849j0 f6876i;

    public AbstractC1020f(InterfaceC0854m interfaceC0854m, C0858p c0858p, int i10, C7629w0 c7629w0, int i11, Object obj, long j10, long j11) {
        this.f6876i = new C0849j0(interfaceC0854m);
        this.f6869b = (C0858p) C4349a.m21882e(c0858p);
        this.f6870c = i10;
        this.f6871d = c7629w0;
        this.f6872e = i11;
        this.f6873f = obj;
        this.f6874g = j10;
        this.f6875h = j11;
    }

    /* renamed from: b */
    public final long m6003b() {
        return this.f6876i.m5363h();
    }

    /* renamed from: d */
    public final long m6004d() {
        return this.f6875h - this.f6874g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m6005e() {
        return this.f6876i.m5365s();
    }

    /* renamed from: f */
    public final Uri m6006f() {
        return this.f6876i.m5364r();
    }
}
