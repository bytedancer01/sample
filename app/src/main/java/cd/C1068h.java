package cd;

import mc.C6558h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/h.class
 */
/* renamed from: cd.h */
/* loaded from: combined.jar:classes2.jar:cd/h.class */
public class C1068h extends C6558h {

    /* renamed from: b */
    public final a f7099b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cd/h$a.class
     */
    /* renamed from: cd.h$a */
    /* loaded from: combined.jar:classes2.jar:cd/h$a.class */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C1068h(a aVar) {
        this.f7099b = aVar;
    }

    public C1068h(String str, a aVar) {
        super(str);
        this.f7099b = aVar;
    }
}
