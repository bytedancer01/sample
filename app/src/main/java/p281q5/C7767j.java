package p281q5;

import java.util.Map;
import p074e5.AbstractC4635l;
import p397x4.AbstractC9656f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q5/j.class
 */
/* renamed from: q5.j */
/* loaded from: combined.jar:classes1.jar:q5/j.class */
public class C7767j {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$a.class
     */
    /* renamed from: q5.j$a */
    /* loaded from: combined.jar:classes1.jar:q5/j$a.class */
    public static abstract class a<T> extends AbstractC7771n<T> {

        /* renamed from: d */
        public final AbstractC9656f.b f37633d;

        /* renamed from: e */
        public final String f37634e;

        /* renamed from: f */
        public final boolean f37635f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls, AbstractC9656f.b bVar, String str) {
            super(cls, false);
            boolean z10 = false;
            this.f37633d = bVar;
            this.f37634e = str;
            this.f37635f = (bVar == AbstractC9656f.b.INT || bVar == AbstractC9656f.b.LONG || bVar == AbstractC9656f.b.BIG_INTEGER) ? true : z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$b.class
     */
    /* renamed from: q5.j$b */
    /* loaded from: combined.jar:classes1.jar:q5/j$b.class */
    public static final class b extends a<Object> {
        public b(Class<?> cls) {
            super(cls, AbstractC9656f.b.DOUBLE, "number");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$c.class
     */
    /* renamed from: q5.j$c */
    /* loaded from: combined.jar:classes1.jar:q5/j$c.class */
    public static final class c extends a<Object> {

        /* renamed from: g */
        public static final c f37636g = new c();

        public c() {
            super(Float.class, AbstractC9656f.b.FLOAT, "number");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$d.class
     */
    /* renamed from: q5.j$d */
    /* loaded from: combined.jar:classes1.jar:q5/j$d.class */
    public static final class d extends a<Object> {

        /* renamed from: g */
        public static final d f37637g = new d();

        public d() {
            super(Number.class, AbstractC9656f.b.INT, "integer");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$e.class
     */
    /* renamed from: q5.j$e */
    /* loaded from: combined.jar:classes1.jar:q5/j$e.class */
    public static final class e extends a<Object> {
        public e(Class<?> cls) {
            super(cls, AbstractC9656f.b.INT, "integer");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$f.class
     */
    /* renamed from: q5.j$f */
    /* loaded from: combined.jar:classes1.jar:q5/j$f.class */
    public static final class f extends a<Object> {
        public f(Class<?> cls) {
            super(cls, AbstractC9656f.b.LONG, "number");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/j$g.class
     */
    /* renamed from: q5.j$g */
    /* loaded from: combined.jar:classes1.jar:q5/j$g.class */
    public static final class g extends a<Object> {

        /* renamed from: g */
        public static final g f37638g = new g();

        public g() {
            super(Short.class, AbstractC9656f.b.INT, "number");
        }
    }

    /* renamed from: a */
    public static void m33913a(Map<String, AbstractC4635l<?>> map) {
        map.put(Integer.class.getName(), new e(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new e(cls));
        map.put(Long.class.getName(), new f(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new f(cls2));
        String name = Byte.class.getName();
        d dVar = d.f37637g;
        map.put(name, dVar);
        map.put(Byte.TYPE.getName(), dVar);
        String name2 = Short.class.getName();
        g gVar = g.f37638g;
        map.put(name2, gVar);
        map.put(Short.TYPE.getName(), gVar);
        map.put(Double.class.getName(), new b(Double.class));
        map.put(Double.TYPE.getName(), new b(Double.TYPE));
        String name3 = Float.class.getName();
        c cVar = c.f37636g;
        map.put(name3, cVar);
        map.put(Float.TYPE.getName(), cVar);
    }
}
