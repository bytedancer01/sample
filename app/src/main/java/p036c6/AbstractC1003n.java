package p036c6;

import com.google.auto.value.AutoValue;
import p036c6.C0992c;
import p437z5.AbstractC10055c;
import p437z5.C10054b;
import p437z5.InterfaceC10057e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/n.class
 */
@AutoValue
/* renamed from: c6.n */
/* loaded from: combined.jar:classes1.jar:c6/n.class */
public abstract class AbstractC1003n {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:c6/n$a.class
     */
    @AutoValue.Builder
    /* renamed from: c6.n$a */
    /* loaded from: combined.jar:classes1.jar:c6/n$a.class */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC1003n mo5921a();

        /* renamed from: b */
        public abstract a mo5922b(C10054b c10054b);

        /* renamed from: c */
        public abstract a mo5923c(AbstractC10055c<?> abstractC10055c);

        /* renamed from: d */
        public abstract a mo5924d(InterfaceC10057e<?, byte[]> interfaceC10057e);

        /* renamed from: e */
        public abstract a mo5925e(AbstractC1004o abstractC1004o);

        /* renamed from: f */
        public abstract a mo5926f(String str);
    }

    /* renamed from: a */
    public static a m5958a() {
        return new C0992c.b();
    }

    /* renamed from: b */
    public abstract C10054b mo5916b();

    /* renamed from: c */
    public abstract AbstractC10055c<?> mo5917c();

    /* renamed from: d */
    public byte[] m5959d() {
        return mo5918e().apply(mo5917c().mo42266b());
    }

    /* renamed from: e */
    public abstract InterfaceC10057e<?, byte[]> mo5918e();

    /* renamed from: f */
    public abstract AbstractC1004o mo5919f();

    /* renamed from: g */
    public abstract String mo5920g();
}
