package p180k5;

import java.util.Collections;
import java.util.List;
import p074e5.AbstractC4625b;
import p074e5.AbstractC4631h;
import p111g5.AbstractC4953g;
import p180k5.AbstractC5481f;
import p300r5.C7962d;
import p300r5.C7963e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k5/b.class
 */
/* renamed from: k5.b */
/* loaded from: combined.jar:classes1.jar:k5/b.class */
public final class C5477b extends AbstractC5476a {

    /* renamed from: j */
    public static final C5478c[] f31289j = new C5478c[0];

    /* renamed from: a */
    public final AbstractC4631h f31290a;

    /* renamed from: b */
    public final Class<?> f31291b;

    /* renamed from: c */
    public final C7962d f31292c;

    /* renamed from: d */
    public final List<AbstractC4631h> f31293d;

    /* renamed from: e */
    public final AbstractC4625b f31294e;

    /* renamed from: f */
    public final C7963e f31295f;

    /* renamed from: g */
    public final AbstractC5481f.a f31296g;

    /* renamed from: h */
    public final Class<?> f31297h;

    /* renamed from: i */
    public boolean f31298i = false;

    public C5477b(AbstractC4631h abstractC4631h, Class<?> cls, C7962d c7962d, List<AbstractC4631h> list, AbstractC4625b abstractC4625b, AbstractC5481f.a aVar, C7963e c7963e, C5478c c5478c) {
        this.f31290a = abstractC4631h;
        this.f31291b = cls;
        this.f31292c = c7962d;
        this.f31293d = list;
        this.f31294e = abstractC4625b;
        this.f31295f = c7963e;
        this.f31296g = aVar;
        this.f31297h = aVar == null ? null : aVar.mo24944a(cls);
    }

    /* renamed from: a */
    public static C5477b m27279a(Class<?> cls, AbstractC4953g<?> abstractC4953g) {
        if (abstractC4953g == null) {
            return new C5477b(null, cls, C7962d.m34519a(), Collections.emptyList(), null, null, null, null);
        }
        return new C5477b(null, cls, C7962d.m34519a(), Collections.emptyList(), abstractC4953g.m24942e() ? abstractC4953g.mo23268c() : null, abstractC4953g, abstractC4953g.m24941d(), null);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C5477b.class) {
            return false;
        }
        if (((C5477b) obj).f31291b != this.f31291b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.f31291b.getName().hashCode();
    }

    public String toString() {
        return "[AnnotedClass " + this.f31291b.getName() + "]";
    }
}
