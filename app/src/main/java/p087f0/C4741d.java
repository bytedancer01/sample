package p087f0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p069e0.C4564c;
import p069e0.C4568g;
import p191l0.C5643f;
import p294r.C7934g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f0/d.class
 */
@SuppressLint({"NewApi"})
/* renamed from: f0.d */
/* loaded from: combined.jar:classes1.jar:f0/d.class */
public class C4741d {

    /* renamed from: a */
    public static final C4747j f27975a;

    /* renamed from: b */
    public static final C7934g<String, Typeface> f27976b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f0/d$a.class
     */
    /* renamed from: f0.d$a */
    /* loaded from: combined.jar:classes1.jar:f0/d$a.class */
    public static class a extends C5643f.c {

        /* renamed from: a */
        public C4568g.c f27977a;

        public a(C4568g.c cVar) {
            this.f27977a = cVar;
        }

        @Override // p191l0.C5643f.c
        /* renamed from: a */
        public void mo24002a(int i10) {
            C4568g.c cVar = this.f27977a;
            if (cVar != null) {
                cVar.mo1356d(i10);
            }
        }

        @Override // p191l0.C5643f.c
        /* renamed from: b */
        public void mo24003b(Typeface typeface) {
            C4568g.c cVar = this.f27977a;
            if (cVar != null) {
                cVar.mo1357e(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f27975a = i10 >= 29 ? new C4746i() : i10 >= 28 ? new C4745h() : i10 >= 26 ? new C4744g() : (i10 < 24 || !C4743f.m24013i()) ? new C4742e() : new C4743f();
        f27976b = new C7934g<>(16);
    }

    /* renamed from: a */
    public static Typeface m23995a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m23996b(Context context, CancellationSignal cancellationSignal, C5643f.b[] bVarArr, int i10) {
        return f27975a.mo24009b(context, cancellationSignal, bVarArr, i10);
    }

    /* renamed from: c */
    public static Typeface m23997c(Context context, C4564c.a aVar, Resources resources, int i10, int i11, C4568g.c cVar, Handler handler, boolean z10) {
        Typeface typeface;
        if (aVar instanceof C4564c.d) {
            C4564c.d dVar = (C4564c.d) aVar;
            Typeface m24001g = m24001g(dVar.m23040c());
            if (m24001g != null) {
                if (cVar != null) {
                    cVar.m23064b(m24001g, handler);
                }
                return m24001g;
            }
            typeface = C5643f.m27849a(context, dVar.m23039b(), i11, !z10 ? cVar != null : dVar.m23038a() != 0, z10 ? dVar.m23041d() : -1, C4568g.c.m23062c(handler), new a(cVar));
        } else {
            Typeface mo24008a = f27975a.mo24008a(context, (C4564c.b) aVar, resources, i11);
            typeface = mo24008a;
            if (cVar != null) {
                if (mo24008a != null) {
                    cVar.m23064b(mo24008a, handler);
                    typeface = mo24008a;
                } else {
                    cVar.m23063a(-3, handler);
                    typeface = mo24008a;
                }
            }
        }
        if (typeface != null) {
            f27976b.m34413f(m23999e(resources, i10, i11), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m23998d(Context context, Resources resources, int i10, String str, int i11) {
        Typeface mo24016d = f27975a.mo24016d(context, resources, i10, str, i11);
        if (mo24016d != null) {
            f27976b.m34413f(m23999e(resources, i10, i11), mo24016d);
        }
        return mo24016d;
    }

    /* renamed from: e */
    public static String m23999e(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + "-" + i10 + "-" + i11;
    }

    /* renamed from: f */
    public static Typeface m24000f(Resources resources, int i10, int i11) {
        return f27976b.m34411d(m23999e(resources, i10, i11));
    }

    /* renamed from: g */
    public static Typeface m24001g(String str) {
        Typeface typeface = null;
        if (str != null) {
            if (str.isEmpty()) {
                typeface = null;
            } else {
                Typeface create = Typeface.create(str, 0);
                Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                typeface = null;
                if (create != null) {
                    typeface = null;
                    if (!create.equals(create2)) {
                        typeface = create;
                    }
                }
            }
        }
        return typeface;
    }
}
