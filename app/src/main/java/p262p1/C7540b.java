package p262p1;

import android.annotation.SuppressLint;
import androidx.navigation.C0632l;
import java.util.HashSet;
import java.util.Set;
import p359v0.InterfaceC9221c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p1/b.class
 */
/* renamed from: p1.b */
/* loaded from: combined.jar:classes1.jar:p1/b.class */
public final class C7540b {

    /* renamed from: a */
    public final Set<Integer> f36376a;

    /* renamed from: b */
    public final InterfaceC9221c f36377b;

    /* renamed from: c */
    public final c f36378c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p1/b$b.class
     */
    /* renamed from: p1.b$b */
    /* loaded from: combined.jar:classes1.jar:p1/b$b.class */
    public static final class b {

        /* renamed from: a */
        public final Set<Integer> f36379a;

        /* renamed from: b */
        public InterfaceC9221c f36380b;

        /* renamed from: c */
        public c f36381c;

        public b(C0632l c0632l) {
            HashSet hashSet = new HashSet();
            this.f36379a = hashSet;
            hashSet.add(Integer.valueOf(C7541c.m32273a(c0632l).m3569v()));
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public C7540b m32271a() {
            return new C7540b(this.f36379a, this.f36380b, this.f36381c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p1/b$c.class
     */
    /* renamed from: p1.b$c */
    /* loaded from: combined.jar:classes1.jar:p1/b$c.class */
    public interface c {
        /* renamed from: a */
        boolean m32272a();
    }

    public C7540b(Set<Integer> set, InterfaceC9221c interfaceC9221c, c cVar) {
        this.f36376a = set;
        this.f36377b = interfaceC9221c;
        this.f36378c = cVar;
    }

    /* renamed from: a */
    public c m32268a() {
        return this.f36378c;
    }

    /* renamed from: b */
    public InterfaceC9221c m32269b() {
        return this.f36377b;
    }

    /* renamed from: c */
    public Set<Integer> m32270c() {
        return this.f36376a;
    }
}
