package p264p3;

import java.util.LinkedHashMap;
import java.util.Map;
import p004a3.InterfaceC0062p;
import p033c3.C0986f;
import p434z2.InterfaceC10033b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p3/d.class
 */
/* renamed from: p3.d */
/* loaded from: combined.jar:classes1.jar:p3/d.class */
public final class C7550d {

    /* renamed from: b */
    public static final Map<Class, InterfaceC10033b> f36425b = m32314a();

    /* renamed from: a */
    public final Map<InterfaceC0062p, InterfaceC10033b> f36426a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$a.class
     */
    /* renamed from: p3.d$a */
    /* loaded from: combined.jar:classes1.jar:p3/d$a.class */
    public static final class a extends g<String> {
        public a() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$b.class
     */
    /* renamed from: p3.d$b */
    /* loaded from: combined.jar:classes1.jar:p3/d$b.class */
    public static final class b extends g<Boolean> {
        public b() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$c.class
     */
    /* renamed from: p3.d$c */
    /* loaded from: combined.jar:classes1.jar:p3/d$c.class */
    public static final class c extends g<Integer> {
        public c() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$d.class
     */
    /* renamed from: p3.d$d */
    /* loaded from: combined.jar:classes1.jar:p3/d$d.class */
    public static final class d extends g<Long> {
        public d() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$e.class
     */
    /* renamed from: p3.d$e */
    /* loaded from: combined.jar:classes1.jar:p3/d$e.class */
    public static final class e extends g<Float> {
        public e() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$f.class
     */
    /* renamed from: p3.d$f */
    /* loaded from: combined.jar:classes1.jar:p3/d$f.class */
    public static final class f extends g<Double> {
        public f() {
            super(null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/d$g.class
     */
    /* renamed from: p3.d$g */
    /* loaded from: combined.jar:classes1.jar:p3/d$g.class */
    public static abstract class g<T> implements InterfaceC10033b<T> {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public C7550d(Map<InterfaceC0062p, InterfaceC10033b> map) {
        this.f36426a = (Map) C0986f.m5892c(map, "customAdapters == null");
    }

    /* renamed from: a */
    public static Map<Class, InterfaceC10033b> m32314a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(String.class, new a());
        linkedHashMap.put(Boolean.class, new b());
        linkedHashMap.put(Integer.class, new c());
        linkedHashMap.put(Long.class, new d());
        linkedHashMap.put(Float.class, new e());
        linkedHashMap.put(Double.class, new f());
        return linkedHashMap;
    }
}
