package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.C0631k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p236o1.C6867a;
import p294r.C7937j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/l.class
 */
/* renamed from: androidx.navigation.l */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/l.class */
public class C0632l extends C0631k implements Iterable<C0631k> {

    /* renamed from: k */
    public final C7937j<C0631k> f4273k;

    /* renamed from: l */
    public int f4274l;

    /* renamed from: m */
    public String f4275m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/l$a.class
     */
    /* renamed from: androidx.navigation.l$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/l$a.class */
    public class a implements Iterator<C0631k> {

        /* renamed from: b */
        public int f4276b = -1;

        /* renamed from: c */
        public boolean f4277c = false;

        /* renamed from: d */
        public final C0632l f4278d;

        public a(C0632l c0632l) {
            this.f4278d = c0632l;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0631k next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f4277c = true;
            C7937j<C0631k> c7937j = this.f4278d.f4273k;
            int i10 = this.f4276b + 1;
            this.f4276b = i10;
            return c7937j.m34455m(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z10 = true;
            if (this.f4276b + 1 >= this.f4278d.f4273k.m34454l()) {
                z10 = false;
            }
            return z10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4277c) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            this.f4278d.f4273k.m34455m(this.f4276b).m3561G(null);
            this.f4278d.f4273k.m34453k(this.f4276b);
            this.f4276b--;
            this.f4277c = false;
        }
    }

    public C0632l(AbstractC0639s<? extends C0632l> abstractC0639s) {
        super(abstractC0639s);
        this.f4273k = new C7937j<>();
    }

    @Override // androidx.navigation.C0631k
    /* renamed from: A */
    public C0631k.a mo3557A(C0630j c0630j) {
        C0631k.a mo3557A = super.mo3557A(c0630j);
        Iterator<C0631k> it = iterator();
        while (it.hasNext()) {
            C0631k.a mo3557A2 = it.next().mo3557A(c0630j);
            if (mo3557A2 != null && (mo3557A == null || mo3557A2.compareTo(mo3557A) > 0)) {
                mo3557A = mo3557A2;
            }
        }
        return mo3557A;
    }

    @Override // androidx.navigation.C0631k
    /* renamed from: B */
    public void mo3470B(Context context, AttributeSet attributeSet) {
        super.mo3470B(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C6867a.f35618y);
        m3581N(obtainAttributes.getResourceId(C6867a.f35619z, 0));
        this.f4275m = C0631k.m3556t(context, this.f4274l);
        obtainAttributes.recycle();
    }

    /* renamed from: I */
    public final void m3576I(C0631k c0631k) {
        int m3569v = c0631k.m3569v();
        if (m3569v == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (m3569v == m3569v()) {
            throw new IllegalArgumentException("Destination " + c0631k + " cannot have the same id as graph " + this);
        }
        C0631k m34448e = this.f4273k.m34448e(m3569v);
        if (m34448e == c0631k) {
            return;
        }
        if (c0631k.m3572y() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (m34448e != null) {
            m34448e.m3561G(null);
        }
        c0631k.m3561G(this);
        this.f4273k.m34452j(c0631k.m3569v(), c0631k);
    }

    /* renamed from: J */
    public final C0631k m3577J(int i10) {
        return m3578K(i10, true);
    }

    /* renamed from: K */
    public final C0631k m3578K(int i10, boolean z10) {
        C0631k m34448e = this.f4273k.m34448e(i10);
        if (m34448e == null) {
            m34448e = (!z10 || m3572y() == null) ? null : m3572y().m3577J(i10);
        }
        return m34448e;
    }

    /* renamed from: L */
    public String m3579L() {
        if (this.f4275m == null) {
            this.f4275m = Integer.toString(this.f4274l);
        }
        return this.f4275m;
    }

    /* renamed from: M */
    public final int m3580M() {
        return this.f4274l;
    }

    /* renamed from: N */
    public final void m3581N(int i10) {
        if (i10 != m3569v()) {
            this.f4274l = i10;
            this.f4275m = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i10 + " cannot use the same id as the graph " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator<C0631k> iterator() {
        return new a(this);
    }

    @Override // androidx.navigation.C0631k
    /* renamed from: q */
    public String mo3568q() {
        return m3569v() != 0 ? super.mo3568q() : "the root navigation";
    }

    @Override // androidx.navigation.C0631k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" startDestination=");
        C0631k m3577J = m3577J(m3580M());
        if (m3577J == null) {
            String str2 = this.f4275m;
            str = str2;
            if (str2 == null) {
                sb2.append("0x");
                str = Integer.toHexString(this.f4274l);
            }
        } else {
            sb2.append("{");
            sb2.append(m3577J.toString());
            str = "}";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
