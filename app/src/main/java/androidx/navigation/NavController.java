package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.AbstractC0222b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.C0567d0;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0578l;
import androidx.lifecycle.InterfaceC0579m;
import androidx.navigation.AbstractC0639s;
import androidx.navigation.C0631k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/NavController.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/NavController.class */
public class NavController {

    /* renamed from: a */
    public final Context f4145a;

    /* renamed from: b */
    public Activity f4146b;

    /* renamed from: c */
    public C0635o f4147c;

    /* renamed from: d */
    public C0632l f4148d;

    /* renamed from: e */
    public Bundle f4149e;

    /* renamed from: f */
    public Parcelable[] f4150f;

    /* renamed from: g */
    public boolean f4151g;

    /* renamed from: i */
    public InterfaceC0579m f4153i;

    /* renamed from: j */
    public C0627g f4154j;

    /* renamed from: h */
    public final Deque<C0620e> f4152h = new ArrayDeque();

    /* renamed from: k */
    public C0640t f4155k = new C0640t();

    /* renamed from: l */
    public final CopyOnWriteArrayList<InterfaceC0615b> f4156l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    public final InterfaceC0578l f4157m = new InterfaceC0577k(this) { // from class: androidx.navigation.NavController.1

        /* renamed from: b */
        public final NavController f4160b;

        {
            this.f4160b = this;
        }

        @Override // androidx.lifecycle.InterfaceC0577k
        /* renamed from: b */
        public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
            NavController navController = this.f4160b;
            if (navController.f4148d != null) {
                Iterator<C0620e> it = navController.f4152h.iterator();
                while (it.hasNext()) {
                    it.next().m3500e(bVar);
                }
            }
        }
    };

    /* renamed from: n */
    public final AbstractC0222b f4158n = new C0614a(this, false);

    /* renamed from: o */
    public boolean f4159o = true;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/NavController$a.class
     */
    /* renamed from: androidx.navigation.NavController$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/NavController$a.class */
    public class C0614a extends AbstractC0222b {

        /* renamed from: c */
        public final NavController f4161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0614a(NavController navController, boolean z10) {
            super(z10);
            this.f4161c = navController;
        }

        @Override // androidx.activity.AbstractC0222b
        /* renamed from: b */
        public void mo782b() {
            this.f4161c.m3457u();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/NavController$b.class
     */
    /* renamed from: androidx.navigation.NavController$b */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/NavController$b.class */
    public interface InterfaceC0615b {
        /* renamed from: a */
        void mo3463a(NavController navController, C0631k c0631k, Bundle bundle);
    }

    public NavController(Context context) {
        this.f4145a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                this.f4146b = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        C0640t c0640t = this.f4155k;
        c0640t.m3666a(new C0633m(c0640t));
        this.f4155k.m3666a(new C0616a(this.f4145a));
    }

    /* renamed from: A */
    public void m3430A(int i10) {
        m3431B(i10, null);
    }

    /* renamed from: B */
    public void m3431B(int i10, Bundle bundle) {
        m3432C(m3447k().m3587c(i10), bundle);
    }

    /* renamed from: C */
    public void m3432C(C0632l c0632l, Bundle bundle) {
        C0632l c0632l2 = this.f4148d;
        if (c0632l2 != null) {
            m3459w(c0632l2.m3569v(), true);
        }
        this.f4148d = c0632l;
        m3456t(bundle);
    }

    /* renamed from: D */
    public void mo3433D(InterfaceC0579m interfaceC0579m) {
        if (interfaceC0579m == this.f4153i) {
            return;
        }
        this.f4153i = interfaceC0579m;
        interfaceC0579m.getLifecycle().mo3154a(this.f4157m);
    }

    /* renamed from: E */
    public void mo3434E(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f4153i == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.f4158n.m784d();
        onBackPressedDispatcher.m778a(this.f4153i, this.f4158n);
    }

    /* renamed from: F */
    public void mo3435F(C0567d0 c0567d0) {
        if (this.f4154j == C0627g.m3530g(c0567d0)) {
            return;
        }
        if (!this.f4152h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f4154j = C0627g.m3530g(c0567d0);
    }

    /* renamed from: G */
    public final void m3436G() {
        AbstractC0222b abstractC0222b = this.f4158n;
        boolean z10 = true;
        if (!this.f4159o || m3445i() <= 1) {
            z10 = false;
        }
        abstractC0222b.m786f(z10);
    }

    /* renamed from: a */
    public void m3437a(InterfaceC0615b interfaceC0615b) {
        if (!this.f4152h.isEmpty()) {
            C0620e peekLast = this.f4152h.peekLast();
            interfaceC0615b.mo3463a(this, peekLast.m3498b(), peekLast.m3497a());
        }
        this.f4156l.add(interfaceC0615b);
    }

    /* renamed from: b */
    public final boolean m3438b() {
        while (!this.f4152h.isEmpty() && (this.f4152h.peekLast().m3498b() instanceof C0632l) && m3459w(this.f4152h.peekLast().m3498b().m3569v(), true)) {
        }
        if (this.f4152h.isEmpty()) {
            return false;
        }
        C0631k m3498b = this.f4152h.peekLast().m3498b();
        C0631k c0631k = null;
        if (m3498b instanceof InterfaceC0617b) {
            Iterator<C0620e> descendingIterator = this.f4152h.descendingIterator();
            while (true) {
                c0631k = null;
                if (!descendingIterator.hasNext()) {
                    break;
                }
                c0631k = descendingIterator.next().m3498b();
                if (!(c0631k instanceof C0632l) && !(c0631k instanceof InterfaceC0617b)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator<C0620e> descendingIterator2 = this.f4152h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            C0620e next = descendingIterator2.next();
            AbstractC0572g.c m3499c = next.m3499c();
            C0631k m3498b2 = next.m3498b();
            if (m3498b != null && m3498b2.m3569v() == m3498b.m3569v()) {
                AbstractC0572g.c cVar = AbstractC0572g.c.RESUMED;
                if (m3499c != cVar) {
                    hashMap.put(next, cVar);
                }
                m3498b = m3498b.m3572y();
            } else if (c0631k == null || m3498b2.m3569v() != c0631k.m3569v()) {
                next.m3503h(AbstractC0572g.c.CREATED);
            } else {
                if (m3499c == AbstractC0572g.c.RESUMED) {
                    next.m3503h(AbstractC0572g.c.STARTED);
                } else {
                    AbstractC0572g.c cVar2 = AbstractC0572g.c.STARTED;
                    if (m3499c != cVar2) {
                        hashMap.put(next, cVar2);
                    }
                }
                c0631k = c0631k.m3572y();
            }
        }
        for (C0620e c0620e : this.f4152h) {
            AbstractC0572g.c cVar3 = (AbstractC0572g.c) hashMap.get(c0620e);
            if (cVar3 != null) {
                c0620e.m3503h(cVar3);
            } else {
                c0620e.m3504i();
            }
        }
        C0620e peekLast = this.f4152h.peekLast();
        Iterator<InterfaceC0615b> it = this.f4156l.iterator();
        while (it.hasNext()) {
            it.next().mo3463a(this, peekLast.m3498b(), peekLast.m3497a());
        }
        return true;
    }

    /* renamed from: c */
    public void mo3439c(boolean z10) {
        this.f4159o = z10;
        m3436G();
    }

    /* renamed from: d */
    public C0631k m3440d(int i10) {
        C0632l c0632l = this.f4148d;
        if (c0632l == null) {
            return null;
        }
        if (c0632l.m3569v() == i10) {
            return this.f4148d;
        }
        C0632l m3498b = this.f4152h.isEmpty() ? this.f4148d : this.f4152h.getLast().m3498b();
        return (m3498b instanceof C0632l ? m3498b : m3498b.m3572y()).m3577J(i10);
    }

    /* renamed from: e */
    public final String m3441e(int[] iArr) {
        C0632l c0632l;
        C0632l c0632l2 = this.f4148d;
        int i10 = 0;
        while (true) {
            C0631k c0631k = null;
            if (i10 >= iArr.length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 != 0) {
                c0631k = c0632l2.m3577J(i11);
            } else if (this.f4148d.m3569v() == i11) {
                c0631k = this.f4148d;
            }
            if (c0631k == null) {
                return C0631k.m3556t(this.f4145a, i11);
            }
            if (i10 != iArr.length - 1) {
                C0631k c0631k2 = c0631k;
                while (true) {
                    c0632l = (C0632l) c0631k2;
                    if (!(c0632l.m3577J(c0632l.m3580M()) instanceof C0632l)) {
                        break;
                    }
                    c0631k2 = c0632l.m3577J(c0632l.m3580M());
                }
                c0632l2 = c0632l;
            }
            i10++;
        }
    }

    /* renamed from: f */
    public Context m3442f() {
        return this.f4145a;
    }

    /* renamed from: g */
    public C0620e m3443g() {
        if (this.f4152h.isEmpty()) {
            return null;
        }
        return this.f4152h.getLast();
    }

    /* renamed from: h */
    public C0631k m3444h() {
        C0620e m3443g = m3443g();
        return m3443g != null ? m3443g.m3498b() : null;
    }

    /* renamed from: i */
    public final int m3445i() {
        Iterator<C0620e> it = this.f4152h.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!(it.next().m3498b() instanceof C0632l)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: j */
    public C0632l m3446j() {
        C0632l c0632l = this.f4148d;
        if (c0632l != null) {
            return c0632l;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    /* renamed from: k */
    public C0635o m3447k() {
        if (this.f4147c == null) {
            this.f4147c = new C0635o(this.f4145a, this.f4155k);
        }
        return this.f4147c;
    }

    /* renamed from: l */
    public C0640t m3448l() {
        return this.f4155k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r11.length == 0) goto L21;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3449m(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.m3449m(android.content.Intent):boolean");
    }

    /* renamed from: n */
    public void m3450n(int i10) {
        m3451o(i10, null);
    }

    /* renamed from: o */
    public void m3451o(int i10, Bundle bundle) {
        m3452p(i10, bundle, null);
    }

    /* renamed from: p */
    public void m3452p(int i10, Bundle bundle, C0636p c0636p) {
        m3453q(i10, bundle, c0636p, null);
    }

    /* renamed from: q */
    public void m3453q(int i10, Bundle bundle, C0636p c0636p, AbstractC0639s.a aVar) {
        int i11;
        C0636p c0636p2;
        Bundle bundle2;
        C0631k m3498b = this.f4152h.isEmpty() ? this.f4148d : this.f4152h.getLast().m3498b();
        if (m3498b == null) {
            throw new IllegalStateException("no current navigation node");
        }
        C0618c m3566g = m3498b.m3566g(i10);
        if (m3566g != null) {
            C0636p c0636p3 = c0636p;
            if (c0636p == null) {
                c0636p3 = m3566g.m3485c();
            }
            int m3484b = m3566g.m3484b();
            Bundle m3483a = m3566g.m3483a();
            bundle2 = null;
            i11 = m3484b;
            c0636p2 = c0636p3;
            if (m3483a != null) {
                bundle2 = new Bundle();
                bundle2.putAll(m3483a);
                i11 = m3484b;
                c0636p2 = c0636p3;
            }
        } else {
            i11 = i10;
            c0636p2 = c0636p;
            bundle2 = null;
        }
        Bundle bundle3 = bundle2;
        if (bundle != null) {
            bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            bundle3.putAll(bundle);
        }
        if (i11 == 0 && c0636p2 != null && c0636p2.m3597e() != -1) {
            m3458v(c0636p2.m3597e(), c0636p2.m3598f());
            return;
        }
        if (i11 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        C0631k m3440d = m3440d(i11);
        if (m3440d != null) {
            m3454r(m3440d, bundle3, c0636p2, aVar);
            return;
        }
        String m3556t = C0631k.m3556t(this.f4145a, i11);
        if (m3566g == null) {
            throw new IllegalArgumentException("Navigation action/destination " + m3556t + " cannot be found from the current destination " + m3498b);
        }
        throw new IllegalArgumentException("Navigation destination " + m3556t + " referenced from action " + C0631k.m3556t(this.f4145a, i10) + " cannot be found from the current destination " + m3498b);
    }

    /* renamed from: r */
    public final void m3454r(C0631k c0631k, Bundle bundle, C0636p c0636p, AbstractC0639s.a aVar) {
        boolean z10;
        boolean m3459w = (c0636p == null || c0636p.m3597e() == -1) ? false : m3459w(c0636p.m3597e(), c0636p.m3598f());
        AbstractC0639s m3669e = this.f4155k.m3669e(c0631k.m3571x());
        Bundle m3564d = c0631k.m3564d(bundle);
        C0631k mo3465b = m3669e.mo3465b(c0631k, m3564d, c0636p, aVar);
        if (mo3465b != null) {
            if (!(mo3465b instanceof InterfaceC0617b)) {
                while (!this.f4152h.isEmpty() && (this.f4152h.peekLast().m3498b() instanceof InterfaceC0617b) && m3459w(this.f4152h.peekLast().m3498b().m3569v(), true)) {
                }
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            if (c0631k instanceof C0632l) {
                C0631k c0631k2 = mo3465b;
                do {
                    c0631k2 = c0631k2.m3572y();
                    if (c0631k2 != null) {
                        arrayDeque.addFirst(new C0620e(this.f4145a, c0631k2, m3564d, this.f4153i, this.f4154j));
                        if (!this.f4152h.isEmpty() && this.f4152h.getLast().m3498b() == c0631k2) {
                            m3459w(c0631k2.m3569v(), true);
                        }
                    }
                    if (c0631k2 == null) {
                        break;
                    }
                } while (c0631k2 != c0631k);
            }
            C0631k m3498b = arrayDeque.isEmpty() ? mo3465b : ((C0620e) arrayDeque.getFirst()).m3498b();
            while (m3498b != null && m3440d(m3498b.m3569v()) == null) {
                C0632l m3572y = m3498b.m3572y();
                m3498b = m3572y;
                if (m3572y != null) {
                    arrayDeque.addFirst(new C0620e(this.f4145a, m3572y, m3564d, this.f4153i, this.f4154j));
                    m3498b = m3572y;
                }
            }
            C0631k m3498b2 = arrayDeque.isEmpty() ? mo3465b : ((C0620e) arrayDeque.getLast()).m3498b();
            while (!this.f4152h.isEmpty() && (this.f4152h.getLast().m3498b() instanceof C0632l) && ((C0632l) this.f4152h.getLast().m3498b()).m3578K(m3498b2.m3569v(), false) == null && m3459w(this.f4152h.getLast().m3498b().m3569v(), true)) {
            }
            this.f4152h.addAll(arrayDeque);
            if (this.f4152h.isEmpty() || this.f4152h.getFirst().m3498b() != this.f4148d) {
                this.f4152h.addFirst(new C0620e(this.f4145a, this.f4148d, m3564d, this.f4153i, this.f4154j));
            }
            this.f4152h.add(new C0620e(this.f4145a, mo3465b, mo3465b.m3564d(m3564d), this.f4153i, this.f4154j));
            z10 = false;
        } else {
            z10 = false;
            if (c0636p != null) {
                z10 = false;
                if (c0636p.m3599g()) {
                    C0620e peekLast = this.f4152h.peekLast();
                    if (peekLast != null) {
                        peekLast.m3501f(m3564d);
                    }
                    z10 = true;
                }
            }
        }
        m3436G();
        if (m3459w || mo3465b != null || z10) {
            m3438b();
        }
    }

    /* renamed from: s */
    public boolean m3455s() {
        int m3569v;
        C0632l m3572y;
        if (m3445i() != 1) {
            return m3457u();
        }
        C0631k m3444h = m3444h();
        do {
            m3569v = m3444h.m3569v();
            m3572y = m3444h.m3572y();
            if (m3572y == null) {
                return false;
            }
            m3444h = m3572y;
        } while (m3572y.m3580M() == m3569v);
        Bundle bundle = new Bundle();
        Activity activity = this.f4146b;
        if (activity != null && activity.getIntent() != null && this.f4146b.getIntent().getData() != null) {
            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f4146b.getIntent());
            C0631k.a mo3557A = this.f4148d.mo3557A(new C0630j(this.f4146b.getIntent()));
            if (mo3557A != null) {
                bundle.putAll(mo3557A.m3574d().m3564d(mo3557A.m3575e()));
            }
        }
        new C0629i(this).m3552d(m3572y.m3569v()).m3551c(bundle).m3549a().m5824v();
        Activity activity2 = this.f4146b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    /* renamed from: t */
    public final void m3456t(Bundle bundle) {
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f4149e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                AbstractC0639s m3669e = this.f4155k.m3669e(next);
                Bundle bundle3 = this.f4149e.getBundle(next);
                if (bundle3 != null) {
                    m3669e.mo3511c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f4150f;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                C0621f c0621f = (C0621f) parcelable;
                C0631k m3440d = m3440d(c0621f.m3506c());
                if (m3440d == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C0631k.m3556t(this.f4145a, c0621f.m3506c()) + " cannot be found from the current destination " + m3444h());
                }
                Bundle m3505b = c0621f.m3505b();
                if (m3505b != null) {
                    m3505b.setClassLoader(this.f4145a.getClassLoader());
                }
                this.f4152h.add(new C0620e(this.f4145a, m3440d, m3505b, this.f4153i, this.f4154j, c0621f.m3508k(), c0621f.m3507j()));
            }
            m3436G();
            this.f4150f = null;
        }
        if (this.f4148d == null || !this.f4152h.isEmpty()) {
            m3438b();
            return;
        }
        boolean z10 = false;
        if (!this.f4151g) {
            Activity activity = this.f4146b;
            z10 = false;
            if (activity != null) {
                z10 = false;
                if (m3449m(activity.getIntent())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            return;
        }
        m3454r(this.f4148d, bundle, null, null);
    }

    /* renamed from: u */
    public boolean m3457u() {
        if (this.f4152h.isEmpty()) {
            return false;
        }
        return m3458v(m3444h().m3569v(), true);
    }

    /* renamed from: v */
    public boolean m3458v(int i10, boolean z10) {
        return m3459w(i10, z10) && m3438b();
    }

    /* renamed from: w */
    public boolean m3459w(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        if (this.f4152h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0620e> descendingIterator = this.f4152h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z11 = false;
                break;
            }
            C0631k m3498b = descendingIterator.next().m3498b();
            AbstractC0639s m3669e = this.f4155k.m3669e(m3498b.m3571x());
            if (z10 || m3498b.m3569v() != i10) {
                arrayList.add(m3669e);
            }
            if (m3498b.m3569v() == i10) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            Log.i("NavController", "Ignoring popBackStack to destination " + C0631k.m3556t(this.f4145a, i10) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        boolean z13 = false;
        while (true) {
            z12 = z13;
            if (!it.hasNext() || !((AbstractC0639s) it.next()).mo3466e()) {
                break;
            }
            C0620e removeLast = this.f4152h.removeLast();
            if (removeLast.getLifecycle().mo3155b().isAtLeast(AbstractC0572g.c.CREATED)) {
                removeLast.m3503h(AbstractC0572g.c.DESTROYED);
            }
            C0627g c0627g = this.f4154j;
            if (c0627g != null) {
                c0627g.m3531f(removeLast.f4183g);
            }
            z13 = true;
        }
        m3436G();
        return z12;
    }

    /* renamed from: x */
    public void m3460x(InterfaceC0615b interfaceC0615b) {
        this.f4156l.remove(interfaceC0615b);
    }

    /* renamed from: y */
    public void m3461y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f4145a.getClassLoader());
        this.f4149e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f4150f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f4151g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* renamed from: z */
    public Bundle m3462z() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, AbstractC0639s<? extends C0631k>> entry : this.f4155k.m3670f().entrySet()) {
            String key = entry.getKey();
            Bundle mo3512d = entry.getValue().mo3512d();
            if (mo3512d != null) {
                arrayList.add(key);
                bundle2.putBundle(key, mo3512d);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        Bundle bundle3 = bundle;
        if (!this.f4152h.isEmpty()) {
            bundle3 = bundle;
            if (bundle == null) {
                bundle3 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f4152h.size()];
            int i10 = 0;
            Iterator<C0620e> it = this.f4152h.iterator();
            while (it.hasNext()) {
                parcelableArr[i10] = new C0621f(it.next());
                i10++;
            }
            bundle3.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        Bundle bundle4 = bundle3;
        if (this.f4151g) {
            bundle4 = bundle3;
            if (bundle3 == null) {
                bundle4 = new Bundle();
            }
            bundle4.putBoolean("android-support-nav:controller:deepLinkHandled", this.f4151g);
        }
        return bundle4;
    }
}
