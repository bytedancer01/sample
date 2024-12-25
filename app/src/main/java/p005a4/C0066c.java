package p005a4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.InterfaceC0069f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a4/c.class
 */
/* renamed from: a4.c */
/* loaded from: combined.jar:classes1.jar:a4/c.class */
public class C0066c<K extends InterfaceC0069f, V> {

    /* renamed from: a */
    public final a<K, V> f195a = new a<>();

    /* renamed from: b */
    public final Map<K, a<K, V>> f196b = new HashMap();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a4/c$a.class
     */
    /* renamed from: a4.c$a */
    /* loaded from: combined.jar:classes1.jar:a4/c$a.class */
    public static class a<K, V> {

        /* renamed from: a */
        public final K f197a;

        /* renamed from: b */
        public List<V> f198b;

        /* renamed from: c */
        public a<K, V> f199c;

        /* renamed from: d */
        public a<K, V> f200d;

        public a() {
            this(null);
        }

        public a(K k10) {
            this.f200d = this;
            this.f199c = this;
            this.f197a = k10;
        }

        /* renamed from: b */
        public void m244b(V v10) {
            if (this.f198b == null) {
                this.f198b = new ArrayList();
            }
            this.f198b.add(v10);
        }

        /* renamed from: c */
        public V m245c() {
            int m246d = m246d();
            return m246d > 0 ? this.f198b.remove(m246d - 1) : null;
        }

        /* renamed from: d */
        public int m246d() {
            List<V> list = this.f198b;
            return list != null ? list.size() : 0;
        }
    }

    /* renamed from: e */
    public static <K, V> void m236e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f200d;
        aVar2.f199c = aVar.f199c;
        aVar.f199c.f200d = aVar2;
    }

    /* renamed from: g */
    public static <K, V> void m237g(a<K, V> aVar) {
        aVar.f199c.f200d = aVar;
        aVar.f200d.f199c = aVar;
    }

    /* renamed from: a */
    public V m238a(K k10) {
        a<K, V> aVar;
        a<K, V> aVar2 = this.f196b.get(k10);
        if (aVar2 == null) {
            a<K, V> aVar3 = new a<>(k10);
            this.f196b.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.mo260a();
            aVar = aVar2;
        }
        m239b(aVar);
        return aVar.m245c();
    }

    /* renamed from: b */
    public final void m239b(a<K, V> aVar) {
        m236e(aVar);
        a<K, V> aVar2 = this.f195a;
        aVar.f200d = aVar2;
        aVar.f199c = aVar2.f199c;
        m237g(aVar);
    }

    /* renamed from: c */
    public final void m240c(a<K, V> aVar) {
        m236e(aVar);
        a<K, V> aVar2 = this.f195a;
        aVar.f200d = aVar2.f200d;
        aVar.f199c = aVar2;
        m237g(aVar);
    }

    /* renamed from: d */
    public void m241d(K k10, V v10) {
        a<K, V> aVar;
        a<K, V> aVar2 = this.f196b.get(k10);
        if (aVar2 == null) {
            a<K, V> aVar3 = new a<>(k10);
            m240c(aVar3);
            this.f196b.put(k10, aVar3);
            aVar = aVar3;
        } else {
            k10.mo260a();
            aVar = aVar2;
        }
        aVar.m244b(v10);
    }

    /* renamed from: f */
    public V m242f() {
        a<K, V> aVar = this.f195a;
        while (true) {
            aVar = aVar.f200d;
            if (aVar.equals(this.f195a)) {
                return null;
            }
            V m245c = aVar.m245c();
            if (m245c != null) {
                return m245c;
            }
            m236e(aVar);
            this.f196b.remove(aVar.f197a);
            ((InterfaceC0069f) aVar.f197a).mo260a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a<K, V> aVar = this.f195a.f199c; !aVar.equals(this.f195a); aVar = aVar.f199c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f197a);
            sb2.append(':');
            sb2.append(aVar.m246d());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
