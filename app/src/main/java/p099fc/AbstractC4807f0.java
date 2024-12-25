package p099fc;

import ec.C4708k;
import ec.InterfaceC4712o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/f0.class
 */
/* renamed from: fc.f0 */
/* loaded from: combined.jar:classes2.jar:fc/f0.class */
public abstract class AbstractC4807f0<K0, V0> {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f0$a.class
     */
    /* renamed from: fc.f0$a */
    /* loaded from: combined.jar:classes2.jar:fc/f0$a.class */
    public static final class a extends e<Object> {

        /* renamed from: a */
        public final int f28308a;

        public a(int i10) {
            this.f28308a = i10;
        }

        @Override // p099fc.AbstractC4807f0.e
        /* renamed from: c */
        public <K, V> Map<K, Collection<V>> mo24385c() {
            return C4819l0.m24449c(this.f28308a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f0$b.class
     */
    /* renamed from: fc.f0$b */
    /* loaded from: combined.jar:classes2.jar:fc/f0$b.class */
    public static final class b extends e<K0> {

        /* renamed from: a */
        public final Comparator f28309a;

        public b(Comparator comparator) {
            this.f28309a = comparator;
        }

        @Override // p099fc.AbstractC4807f0.e
        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo24385c() {
            return new TreeMap(this.f28309a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f0$c.class
     */
    /* renamed from: fc.f0$c */
    /* loaded from: combined.jar:classes2.jar:fc/f0$c.class */
    public static final class c<V> implements InterfaceC4712o<List<V>>, Serializable {

        /* renamed from: b */
        public final int f28310b;

        public c(int i10) {
            this.f28310b = C4814j.m24399b(i10, "expectedValuesPerKey");
        }

        @Override // ec.InterfaceC4712o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f28310b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f0$d.class
     */
    /* renamed from: fc.f0$d */
    /* loaded from: combined.jar:classes2.jar:fc/f0$d.class */
    public static abstract class d<K0, V0> extends AbstractC4807f0<K0, V0> {
        public d() {
            super(null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> InterfaceC4797a0<K, V> mo24387e();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/f0$e.class
     */
    /* renamed from: fc.f0$e */
    /* loaded from: combined.jar:classes2.jar:fc/f0$e.class */
    public static abstract class e<K0> {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/f0$e$a.class
         */
        /* renamed from: fc.f0$e$a */
        /* loaded from: combined.jar:classes2.jar:fc/f0$e$a.class */
        public class a extends d<K0, Object> {

            /* renamed from: a */
            public final int f28311a;

            /* renamed from: b */
            public final e f28312b;

            public a(e eVar, int i10) {
                this.f28312b = eVar;
                this.f28311a = i10;
            }

            @Override // p099fc.AbstractC4807f0.d
            /* renamed from: e */
            public <K extends K0, V> InterfaceC4797a0<K, V> mo24387e() {
                return C4809g0.m24391b(this.f28312b.mo24385c(), new c(this.f28311a));
            }
        }

        /* renamed from: a */
        public d<K0, Object> m24388a() {
            return m24389b(2);
        }

        /* renamed from: b */
        public d<K0, Object> m24389b(int i10) {
            C4814j.m24399b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo24385c();
    }

    public AbstractC4807f0() {
    }

    public /* synthetic */ AbstractC4807f0(a aVar) {
        this();
    }

    /* renamed from: a */
    public static e<Object> m24381a() {
        return m24382b(8);
    }

    /* renamed from: b */
    public static e<Object> m24382b(int i10) {
        C4814j.m24399b(i10, "expectedKeys");
        return new a(i10);
    }

    /* renamed from: c */
    public static e<Comparable> m24383c() {
        return m24384d(AbstractC4817k0.m24409c());
    }

    /* renamed from: d */
    public static <K0> e<K0> m24384d(Comparator<K0> comparator) {
        C4708k.m23668j(comparator);
        return new b(comparator);
    }
}
