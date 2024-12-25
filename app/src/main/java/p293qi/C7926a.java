package p293qi;

import org.jetbrains.annotations.NotNull;
import p173ji.C5432w;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qi/a.class
 */
/* renamed from: qi.a */
/* loaded from: combined.jar:classes2.jar:qi/a.class */
public final class C7926a {

    /* renamed from: c */
    public static final a f38111c = new a(null);

    /* renamed from: a */
    public long f38112a;

    /* renamed from: b */
    @NotNull
    public final InterfaceC9763g f38113b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qi/a$a.class
     */
    /* renamed from: qi.a$a */
    /* loaded from: combined.jar:classes2.jar:qi/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C7926a(@NotNull InterfaceC9763g interfaceC9763g) {
        C9367f.m39526e(interfaceC9763g, "source");
        this.f38113b = interfaceC9763g;
        this.f38112a = 262144;
    }

    @NotNull
    /* renamed from: a */
    public final C5432w m34330a() {
        C5432w.a aVar = new C5432w.a();
        while (true) {
            String m34331b = m34331b();
            if (m34331b.length() == 0) {
                return aVar.m27092f();
            }
            aVar.m27089c(m34331b);
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m34331b() {
        String mo41166m = this.f38113b.mo41166m(this.f38112a);
        this.f38112a -= mo41166m.length();
        return mo41166m;
    }
}
