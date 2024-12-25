package p395x2;

import p395x2.InterfaceC9623b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/p.class
 */
/* renamed from: x2.p */
/* loaded from: combined.jar:classes1.jar:x2/p.class */
public class C9637p<T> {

    /* renamed from: a */
    public final T f44014a;

    /* renamed from: b */
    public final InterfaceC9623b.a f44015b;

    /* renamed from: c */
    public final C9642u f44016c;

    /* renamed from: d */
    public boolean f44017d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/p$a.class
     */
    /* renamed from: x2.p$a */
    /* loaded from: combined.jar:classes1.jar:x2/p$a.class */
    public interface a {
        /* renamed from: a */
        void mo6895a(C9642u c9642u);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/p$b.class
     */
    /* renamed from: x2.p$b */
    /* loaded from: combined.jar:classes1.jar:x2/p$b.class */
    public interface b<T> {
        /* renamed from: a */
        void mo6909a(T t10);
    }

    public C9637p(T t10, InterfaceC9623b.a aVar) {
        this.f44017d = false;
        this.f44014a = t10;
        this.f44015b = aVar;
        this.f44016c = null;
    }

    public C9637p(C9642u c9642u) {
        this.f44017d = false;
        this.f44014a = null;
        this.f44015b = null;
        this.f44016c = c9642u;
    }

    /* renamed from: a */
    public static <T> C9637p<T> m40573a(C9642u c9642u) {
        return new C9637p<>(c9642u);
    }

    /* renamed from: c */
    public static <T> C9637p<T> m40574c(T t10, InterfaceC9623b.a aVar) {
        return new C9637p<>(t10, aVar);
    }

    /* renamed from: b */
    public boolean m40575b() {
        return this.f44016c == null;
    }
}
