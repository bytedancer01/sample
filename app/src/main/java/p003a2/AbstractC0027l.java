package p003a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p235o0.C6824g0;
import p294r.C7928a;
import p294r.C7933f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/l.class
 */
/* renamed from: a2.l */
/* loaded from: combined.jar:classes1.jar:a2/l.class */
public abstract class AbstractC0027l implements Cloneable {

    /* renamed from: H */
    public static final int[] f85H = {2, 1, 3, 4};

    /* renamed from: I */
    public static final AbstractC0017g f86I = new a();

    /* renamed from: J */
    public static ThreadLocal<C7928a<Animator, d>> f87J = new ThreadLocal<>();

    /* renamed from: E */
    public e f92E;

    /* renamed from: F */
    public C7928a<String, String> f93F;

    /* renamed from: u */
    public ArrayList<C0039s> f114u;

    /* renamed from: v */
    public ArrayList<C0039s> f115v;

    /* renamed from: b */
    public String f95b = getClass().getName();

    /* renamed from: c */
    public long f96c = -1;

    /* renamed from: d */
    public long f97d = -1;

    /* renamed from: e */
    public TimeInterpolator f98e = null;

    /* renamed from: f */
    public ArrayList<Integer> f99f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f100g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f101h = null;

    /* renamed from: i */
    public ArrayList<Class<?>> f102i = null;

    /* renamed from: j */
    public ArrayList<Integer> f103j = null;

    /* renamed from: k */
    public ArrayList<View> f104k = null;

    /* renamed from: l */
    public ArrayList<Class<?>> f105l = null;

    /* renamed from: m */
    public ArrayList<String> f106m = null;

    /* renamed from: n */
    public ArrayList<Integer> f107n = null;

    /* renamed from: o */
    public ArrayList<View> f108o = null;

    /* renamed from: p */
    public ArrayList<Class<?>> f109p = null;

    /* renamed from: q */
    public C0040t f110q = new C0040t();

    /* renamed from: r */
    public C0040t f111r = new C0040t();

    /* renamed from: s */
    public C0035p f112s = null;

    /* renamed from: t */
    public int[] f113t = f85H;

    /* renamed from: w */
    public ViewGroup f116w = null;

    /* renamed from: x */
    public boolean f117x = false;

    /* renamed from: y */
    public ArrayList<Animator> f118y = new ArrayList<>();

    /* renamed from: z */
    public int f119z = 0;

    /* renamed from: A */
    public boolean f88A = false;

    /* renamed from: B */
    public boolean f89B = false;

    /* renamed from: C */
    public ArrayList<f> f90C = null;

    /* renamed from: D */
    public ArrayList<Animator> f91D = new ArrayList<>();

    /* renamed from: G */
    public AbstractC0017g f94G = f86I;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$a.class
     */
    /* renamed from: a2.l$a */
    /* loaded from: combined.jar:classes1.jar:a2/l$a.class */
    public static final class a extends AbstractC0017g {
        @Override // p003a2.AbstractC0017g
        /* renamed from: a */
        public Path mo102a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$b.class
     */
    /* renamed from: a2.l$b */
    /* loaded from: combined.jar:classes1.jar:a2/l$b.class */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C7928a f120b;

        /* renamed from: c */
        public final AbstractC0027l f121c;

        public b(AbstractC0027l abstractC0027l, C7928a c7928a) {
            this.f121c = abstractC0027l;
            this.f120b = c7928a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f120b.remove(animator);
            this.f121c.f118y.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f121c.f118y.add(animator);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$c.class
     */
    /* renamed from: a2.l$c */
    /* loaded from: combined.jar:classes1.jar:a2/l$c.class */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final AbstractC0027l f122b;

        public c(AbstractC0027l abstractC0027l) {
            this.f122b = abstractC0027l;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f122b.m157p();
            animator.removeListener(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$d.class
     */
    /* renamed from: a2.l$d */
    /* loaded from: combined.jar:classes1.jar:a2/l$d.class */
    public static class d {

        /* renamed from: a */
        public View f123a;

        /* renamed from: b */
        public String f124b;

        /* renamed from: c */
        public C0039s f125c;

        /* renamed from: d */
        public InterfaceC0036p0 f126d;

        /* renamed from: e */
        public AbstractC0027l f127e;

        public d(View view, String str, AbstractC0027l abstractC0027l, InterfaceC0036p0 interfaceC0036p0, C0039s c0039s) {
            this.f123a = view;
            this.f124b = str;
            this.f125c = c0039s;
            this.f126d = interfaceC0036p0;
            this.f127e = abstractC0027l;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$e.class
     */
    /* renamed from: a2.l$e */
    /* loaded from: combined.jar:classes1.jar:a2/l$e.class */
    public static abstract class e {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/l$f.class
     */
    /* renamed from: a2.l$f */
    /* loaded from: combined.jar:classes1.jar:a2/l$f.class */
    public interface f {
        /* renamed from: a */
        void mo98a(AbstractC0027l abstractC0027l);

        /* renamed from: b */
        void mo64b(AbstractC0027l abstractC0027l);

        /* renamed from: c */
        void mo65c(AbstractC0027l abstractC0027l);

        /* renamed from: d */
        void mo66d(AbstractC0027l abstractC0027l);

        /* renamed from: e */
        void mo67e(AbstractC0027l abstractC0027l);
    }

    /* renamed from: D */
    public static C7928a<Animator, d> m114D() {
        C7928a<Animator, d> c7928a = f87J.get();
        C7928a<Animator, d> c7928a2 = c7928a;
        if (c7928a == null) {
            c7928a2 = new C7928a<>();
            f87J.set(c7928a2);
        }
        return c7928a2;
    }

    /* renamed from: N */
    public static boolean m115N(C0039s c0039s, C0039s c0039s2, String str) {
        boolean z10;
        Object obj = c0039s.f169a.get(str);
        Object obj2 = c0039s2.f169a.get(str);
        if (obj == null && obj2 == null) {
            z10 = false;
        } else {
            z10 = true;
            if (obj != null) {
                z10 = obj2 == null ? true : true ^ obj.equals(obj2);
            }
        }
        return z10;
    }

    /* renamed from: d */
    public static void m116d(C0040t c0040t, View view, C0039s c0039s) {
        c0040t.f172a.put(view, c0039s);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c0040t.f173b.indexOfKey(id2) >= 0) {
                c0040t.f173b.put(id2, null);
            } else {
                c0040t.f173b.put(id2, view);
            }
        }
        String m31491L = C6824g0.m31491L(view);
        if (m31491L != null) {
            if (c0040t.f175d.containsKey(m31491L)) {
                c0040t.f175d.put(m31491L, null);
            } else {
                c0040t.f175d.put(m31491L, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0040t.f174c.m34401h(itemIdAtPosition) < 0) {
                    C6824g0.m31555x0(view, true);
                    c0040t.f174c.m34403j(itemIdAtPosition, view);
                    return;
                }
                View m34399e = c0040t.f174c.m34399e(itemIdAtPosition);
                if (m34399e != null) {
                    C6824g0.m31555x0(m34399e, false);
                    c0040t.f174c.m34403j(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: A */
    public AbstractC0017g m117A() {
        return this.f94G;
    }

    /* renamed from: C */
    public AbstractC0033o m118C() {
        return null;
    }

    /* renamed from: E */
    public long m119E() {
        return this.f96c;
    }

    /* renamed from: F */
    public List<Integer> m120F() {
        return this.f99f;
    }

    /* renamed from: G */
    public List<String> m121G() {
        return this.f101h;
    }

    /* renamed from: H */
    public List<Class<?>> m122H() {
        return this.f102i;
    }

    /* renamed from: I */
    public List<View> m123I() {
        return this.f100g;
    }

    /* renamed from: J */
    public String[] mo46J() {
        return null;
    }

    /* renamed from: K */
    public C0039s m124K(View view, boolean z10) {
        C0035p c0035p = this.f112s;
        if (c0035p != null) {
            return c0035p.m124K(view, z10);
        }
        return (z10 ? this.f110q : this.f111r).f172a.get(view);
    }

    /* renamed from: L */
    public boolean mo125L(C0039s c0039s, C0039s c0039s2) {
        boolean z10 = false;
        if (c0039s != null) {
            z10 = false;
            if (c0039s2 != null) {
                String[] mo46J = mo46J();
                if (mo46J != null) {
                    int length = mo46J.length;
                    int i10 = 0;
                    while (true) {
                        z10 = false;
                        if (i10 >= length) {
                            break;
                        }
                        if (m115N(c0039s, c0039s2, mo46J[i10])) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    Iterator<String> it = c0039s.f169a.keySet().iterator();
                    do {
                        z10 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                    } while (!m115N(c0039s, c0039s2, it.next()));
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: M */
    public boolean m126M(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f103j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f104k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f105l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f105l.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f106m != null && C6824g0.m31491L(view) != null && this.f106m.contains(C6824g0.m31491L(view))) {
            return false;
        }
        if ((this.f99f.size() == 0 && this.f100g.size() == 0 && (((arrayList = this.f102i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f101h) == null || arrayList2.isEmpty()))) || this.f99f.contains(Integer.valueOf(id2)) || this.f100g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f101h;
        if (arrayList6 != null && arrayList6.contains(C6824g0.m31491L(view))) {
            return true;
        }
        if (this.f102i == null) {
            return false;
        }
        for (int i11 = 0; i11 < this.f102i.size(); i11++) {
            if (this.f102i.get(i11).isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final void m127O(C7928a<View, C0039s> c7928a, C7928a<View, C0039s> c7928a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && m126M(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && m126M(view)) {
                C0039s c0039s = c7928a.get(valueAt);
                C0039s c0039s2 = c7928a2.get(view);
                if (c0039s != null && c0039s2 != null) {
                    this.f114u.add(c0039s);
                    this.f115v.add(c0039s2);
                    c7928a.remove(valueAt);
                    c7928a2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    public final void m128P(C7928a<View, C0039s> c7928a, C7928a<View, C0039s> c7928a2) {
        C0039s remove;
        for (int size = c7928a.size() - 1; size >= 0; size--) {
            View m34439j = c7928a.m34439j(size);
            if (m34439j != null && m126M(m34439j) && (remove = c7928a2.remove(m34439j)) != null && m126M(remove.f170b)) {
                this.f114u.add(c7928a.m34441l(size));
                this.f115v.add(remove);
            }
        }
    }

    /* renamed from: Q */
    public final void m129Q(C7928a<View, C0039s> c7928a, C7928a<View, C0039s> c7928a2, C7933f<View> c7933f, C7933f<View> c7933f2) {
        View m34399e;
        int m34406m = c7933f.m34406m();
        for (int i10 = 0; i10 < m34406m; i10++) {
            View m34407n = c7933f.m34407n(i10);
            if (m34407n != null && m126M(m34407n) && (m34399e = c7933f2.m34399e(c7933f.m34402i(i10))) != null && m126M(m34399e)) {
                C0039s c0039s = c7928a.get(m34407n);
                C0039s c0039s2 = c7928a2.get(m34399e);
                if (c0039s != null && c0039s2 != null) {
                    this.f114u.add(c0039s);
                    this.f115v.add(c0039s2);
                    c7928a.remove(m34407n);
                    c7928a2.remove(m34399e);
                }
            }
        }
    }

    /* renamed from: R */
    public final void m130R(C7928a<View, C0039s> c7928a, C7928a<View, C0039s> c7928a2, C7928a<String, View> c7928a3, C7928a<String, View> c7928a4) {
        View view;
        int size = c7928a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m34443n = c7928a3.m34443n(i10);
            if (m34443n != null && m126M(m34443n) && (view = c7928a4.get(c7928a3.m34439j(i10))) != null && m126M(view)) {
                C0039s c0039s = c7928a.get(m34443n);
                C0039s c0039s2 = c7928a2.get(view);
                if (c0039s != null && c0039s2 != null) {
                    this.f114u.add(c0039s);
                    this.f115v.add(c0039s2);
                    c7928a.remove(m34443n);
                    c7928a2.remove(view);
                }
            }
        }
    }

    /* renamed from: S */
    public final void m131S(C0040t c0040t, C0040t c0040t2) {
        C7928a<View, C0039s> c7928a = new C7928a<>(c0040t.f172a);
        C7928a<View, C0039s> c7928a2 = new C7928a<>(c0040t2.f172a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f113t;
            if (i10 >= iArr.length) {
                m143c(c7928a, c7928a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                m128P(c7928a, c7928a2);
            } else if (i11 == 2) {
                m130R(c7928a, c7928a2, c0040t.f175d, c0040t2.f175d);
            } else if (i11 == 3) {
                m127O(c7928a, c7928a2, c0040t.f173b, c0040t2.f173b);
            } else if (i11 == 4) {
                m129Q(c7928a, c7928a2, c0040t.f174c, c0040t2.f174c);
            }
            i10++;
        }
    }

    /* renamed from: T */
    public void mo132T(View view) {
        if (this.f89B) {
            return;
        }
        C7928a<Animator, d> m114D = m114D();
        int size = m114D.size();
        InterfaceC0036p0 m33d = C0006a0.m33d(view);
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            d m34443n = m114D.m34443n(size);
            if (m34443n.f123a != null && m33d.equals(m34443n.f126d)) {
                C0005a.m28b(m114D.m34439j(size));
            }
        }
        ArrayList<f> arrayList = this.f90C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f90C.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).mo64b(this);
            }
        }
        this.f88A = true;
    }

    /* renamed from: U */
    public void m133U(ViewGroup viewGroup) {
        d dVar;
        this.f114u = new ArrayList<>();
        this.f115v = new ArrayList<>();
        m131S(this.f110q, this.f111r);
        C7928a<Animator, d> m114D = m114D();
        int size = m114D.size();
        InterfaceC0036p0 m33d = C0006a0.m33d(viewGroup);
        while (true) {
            size--;
            if (size < 0) {
                mo156o(viewGroup, this.f110q, this.f111r, this.f114u, this.f115v);
                mo138Z();
                return;
            }
            Animator m34439j = m114D.m34439j(size);
            if (m34439j != null && (dVar = m114D.get(m34439j)) != null && dVar.f123a != null && m33d.equals(dVar.f126d)) {
                C0039s c0039s = dVar.f125c;
                View view = dVar.f123a;
                C0039s m124K = m124K(view, true);
                C0039s m161x = m161x(view, true);
                C0039s c0039s2 = m161x;
                if (m124K == null) {
                    c0039s2 = m161x;
                    if (m161x == null) {
                        c0039s2 = this.f111r.f172a.get(view);
                    }
                }
                if (!(m124K == null && c0039s2 == null) && dVar.f127e.mo125L(c0039s, c0039s2)) {
                    if (m34439j.isRunning() || m34439j.isStarted()) {
                        m34439j.cancel();
                    } else {
                        m114D.remove(m34439j);
                    }
                }
            }
        }
    }

    /* renamed from: V */
    public AbstractC0027l mo134V(f fVar) {
        ArrayList<f> arrayList = this.f90C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f90C.size() == 0) {
            this.f90C = null;
        }
        return this;
    }

    /* renamed from: W */
    public AbstractC0027l mo135W(View view) {
        this.f100g.remove(view);
        return this;
    }

    /* renamed from: X */
    public void mo136X(View view) {
        if (this.f88A) {
            if (!this.f89B) {
                C7928a<Animator, d> m114D = m114D();
                int size = m114D.size();
                InterfaceC0036p0 m33d = C0006a0.m33d(view);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    d m34443n = m114D.m34443n(size);
                    if (m34443n.f123a != null && m33d.equals(m34443n.f126d)) {
                        C0005a.m29c(m114D.m34439j(size));
                    }
                }
                ArrayList<f> arrayList = this.f90C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f90C.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).mo65c(this);
                    }
                }
            }
            this.f88A = false;
        }
    }

    /* renamed from: Y */
    public final void m137Y(Animator animator, C7928a<Animator, d> c7928a) {
        if (animator != null) {
            animator.addListener(new b(this, c7928a));
            m146e(animator);
        }
    }

    /* renamed from: Z */
    public void mo138Z() {
        m149g0();
        C7928a<Animator, d> m114D = m114D();
        Iterator<Animator> it = this.f91D.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m114D.containsKey(next)) {
                m149g0();
                m137Y(next, m114D);
            }
        }
        this.f91D.clear();
        m157p();
    }

    /* renamed from: a */
    public AbstractC0027l mo139a(f fVar) {
        if (this.f90C == null) {
            this.f90C = new ArrayList<>();
        }
        this.f90C.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public AbstractC0027l mo140a0(long j10) {
        this.f97d = j10;
        return this;
    }

    /* renamed from: b */
    public AbstractC0027l mo141b(View view) {
        this.f100g.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo142b0(e eVar) {
        this.f92E = eVar;
    }

    /* renamed from: c */
    public final void m143c(C7928a<View, C0039s> c7928a, C7928a<View, C0039s> c7928a2) {
        int i10;
        int i11 = 0;
        while (true) {
            if (i11 >= c7928a.size()) {
                break;
            }
            C0039s m34443n = c7928a.m34443n(i11);
            if (m126M(m34443n.f170b)) {
                this.f114u.add(m34443n);
                this.f115v.add(null);
            }
            i11++;
        }
        for (i10 = 0; i10 < c7928a2.size(); i10++) {
            C0039s m34443n2 = c7928a2.m34443n(i10);
            if (m126M(m34443n2.f170b)) {
                this.f115v.add(m34443n2);
                this.f114u.add(null);
            }
        }
    }

    /* renamed from: c0 */
    public AbstractC0027l mo144c0(TimeInterpolator timeInterpolator) {
        this.f98e = timeInterpolator;
        return this;
    }

    public void cancel() {
        for (int size = this.f118y.size() - 1; size >= 0; size--) {
            this.f118y.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f90C;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f90C.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).mo67e(this);
        }
    }

    /* renamed from: d0 */
    public void mo145d0(AbstractC0017g abstractC0017g) {
        AbstractC0017g abstractC0017g2 = abstractC0017g;
        if (abstractC0017g == null) {
            abstractC0017g2 = f86I;
        }
        this.f94G = abstractC0017g2;
    }

    /* renamed from: e */
    public void m146e(Animator animator) {
        if (animator == null) {
            m157p();
            return;
        }
        if (m158r() >= 0) {
            animator.setDuration(m158r());
        }
        if (m119E() >= 0) {
            animator.setStartDelay(m119E() + animator.getStartDelay());
        }
        if (m160u() != null) {
            animator.setInterpolator(m160u());
        }
        animator.addListener(new c(this));
        animator.start();
    }

    /* renamed from: e0 */
    public void mo147e0(AbstractC0033o abstractC0033o) {
    }

    /* renamed from: f0 */
    public AbstractC0027l mo148f0(long j10) {
        this.f96c = j10;
        return this;
    }

    /* renamed from: g */
    public abstract void mo47g(C0039s c0039s);

    /* renamed from: g0 */
    public void m149g0() {
        if (this.f119z == 0) {
            ArrayList<f> arrayList = this.f90C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f90C.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).mo98a(this);
                }
            }
            this.f89B = false;
        }
        this.f119z++;
    }

    /* renamed from: h */
    public final void m150h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f103j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f104k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f105l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f105l.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0039s c0039s = new C0039s(view);
                    if (z10) {
                        mo49j(c0039s);
                    } else {
                        mo47g(c0039s);
                    }
                    c0039s.f171c.add(this);
                    mo152i(c0039s);
                    m116d(z10 ? this.f110q : this.f111r, view, c0039s);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f107n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f108o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f109p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f109p.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                m150h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x010f, code lost:
    
        if (r5.f100g.size() > 0) goto L15;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo151h0(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.AbstractC0027l.mo151h0(java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public void mo152i(C0039s c0039s) {
    }

    /* renamed from: j */
    public abstract void mo49j(C0039s c0039s);

    /* renamed from: k */
    public void m153k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C7928a<String, String> c7928a;
        int i10;
        m154l(z10);
        if ((this.f99f.size() > 0 || this.f100g.size() > 0) && (((arrayList = this.f101h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f102i) == null || arrayList2.isEmpty()))) {
            for (int i11 = 0; i11 < this.f99f.size(); i11++) {
                View findViewById = viewGroup.findViewById(this.f99f.get(i11).intValue());
                if (findViewById != null) {
                    C0039s c0039s = new C0039s(findViewById);
                    if (z10) {
                        mo49j(c0039s);
                    } else {
                        mo47g(c0039s);
                    }
                    c0039s.f171c.add(this);
                    mo152i(c0039s);
                    m116d(z10 ? this.f110q : this.f111r, findViewById, c0039s);
                }
            }
            for (int i12 = 0; i12 < this.f100g.size(); i12++) {
                View view = this.f100g.get(i12);
                C0039s c0039s2 = new C0039s(view);
                if (z10) {
                    mo49j(c0039s2);
                } else {
                    mo47g(c0039s2);
                }
                c0039s2.f171c.add(this);
                mo152i(c0039s2);
                m116d(z10 ? this.f110q : this.f111r, view, c0039s2);
            }
        } else {
            m150h(viewGroup, z10);
        }
        if (z10 || (c7928a = this.f93F) == null) {
            return;
        }
        int size = c7928a.size();
        ArrayList arrayList3 = new ArrayList(size);
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            arrayList3.add(this.f110q.f175d.remove(this.f93F.m34439j(i13)));
            i13++;
        }
        for (i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.f110q.f175d.put(this.f93F.m34443n(i10), view2);
            }
        }
    }

    /* renamed from: l */
    public void m154l(boolean z10) {
        C0040t c0040t;
        if (z10) {
            this.f110q.f172a.clear();
            this.f110q.f173b.clear();
            c0040t = this.f110q;
        } else {
            this.f111r.f172a.clear();
            this.f111r.f173b.clear();
            c0040t = this.f111r;
        }
        c0040t.f174c.m34396b();
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0027l clone() {
        try {
            AbstractC0027l abstractC0027l = (AbstractC0027l) super.clone();
            abstractC0027l.f91D = new ArrayList<>();
            abstractC0027l.f110q = new C0040t();
            abstractC0027l.f111r = new C0040t();
            abstractC0027l.f114u = null;
            abstractC0027l.f115v = null;
            return abstractC0027l;
        } catch (CloneNotSupportedException e10) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo51n(ViewGroup viewGroup, C0039s c0039s, C0039s c0039s2) {
        return null;
    }

    /* renamed from: o */
    public void mo156o(ViewGroup viewGroup, C0040t c0040t, C0040t c0040t2, ArrayList<C0039s> arrayList, ArrayList<C0039s> arrayList2) {
        View view;
        C0039s c0039s;
        C7928a<Animator, d> m114D = m114D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0039s c0039s2 = arrayList.get(i10);
            C0039s c0039s3 = arrayList2.get(i10);
            C0039s c0039s4 = c0039s2;
            if (c0039s2 != null) {
                c0039s4 = c0039s2;
                if (!c0039s2.f171c.contains(this)) {
                    c0039s4 = null;
                }
            }
            C0039s c0039s5 = c0039s3;
            if (c0039s3 != null) {
                c0039s5 = c0039s3;
                if (!c0039s3.f171c.contains(this)) {
                    c0039s5 = null;
                }
            }
            if (c0039s4 != null || c0039s5 != null) {
                if (c0039s4 == null || c0039s5 == null || mo125L(c0039s4, c0039s5)) {
                    Animator mo51n = mo51n(viewGroup, c0039s4, c0039s5);
                    if (mo51n != null) {
                        if (c0039s5 != null) {
                            View view2 = c0039s5.f170b;
                            String[] mo46J = mo46J();
                            if (mo46J != null && mo46J.length > 0) {
                                C0039s c0039s6 = new C0039s(view2);
                                C0039s c0039s7 = c0040t2.f172a.get(view2);
                                Animator animator = mo51n;
                                if (c0039s7 != null) {
                                    int i11 = 0;
                                    while (true) {
                                        animator = mo51n;
                                        if (i11 >= mo46J.length) {
                                            break;
                                        }
                                        Map<String, Object> map = c0039s6.f169a;
                                        String str = mo46J[i11];
                                        map.put(str, c0039s7.f169a.get(str));
                                        i11++;
                                    }
                                }
                                int size2 = m114D.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size2) {
                                        mo51n = animator;
                                        c0039s = c0039s6;
                                        break;
                                    }
                                    d dVar = m114D.get(m114D.m34439j(i12));
                                    if (dVar.f125c != null && dVar.f123a == view2 && dVar.f124b.equals(m162z()) && dVar.f125c.equals(c0039s6)) {
                                        mo51n = null;
                                        c0039s = c0039s6;
                                        break;
                                    }
                                    i12++;
                                }
                            } else {
                                c0039s = null;
                            }
                            view = view2;
                        } else {
                            view = c0039s4.f170b;
                            c0039s = null;
                        }
                        if (mo51n != null) {
                            m114D.put(mo51n, new d(view, m162z(), this, C0006a0.m33d(viewGroup), c0039s));
                            this.f91D.add(mo51n);
                        }
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator2 = this.f91D.get(sparseIntArray.keyAt(i13));
                animator2.setStartDelay((sparseIntArray.valueAt(i13) - Long.MAX_VALUE) + animator2.getStartDelay());
            }
        }
    }

    /* renamed from: p */
    public void m157p() {
        int i10 = this.f119z - 1;
        this.f119z = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.f90C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f90C.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).mo66d(this);
                }
            }
            for (int i12 = 0; i12 < this.f110q.f174c.m34406m(); i12++) {
                View m34407n = this.f110q.f174c.m34407n(i12);
                if (m34407n != null) {
                    C6824g0.m31555x0(m34407n, false);
                }
            }
            for (int i13 = 0; i13 < this.f111r.f174c.m34406m(); i13++) {
                View m34407n2 = this.f111r.f174c.m34407n(i13);
                if (m34407n2 != null) {
                    C6824g0.m31555x0(m34407n2, false);
                }
            }
            this.f89B = true;
        }
    }

    /* renamed from: r */
    public long m158r() {
        return this.f97d;
    }

    /* renamed from: s */
    public e m159s() {
        return this.f92E;
    }

    public String toString() {
        return mo151h0("");
    }

    /* renamed from: u */
    public TimeInterpolator m160u() {
        return this.f98e;
    }

    /* renamed from: x */
    public C0039s m161x(View view, boolean z10) {
        int i10;
        C0035p c0035p = this.f112s;
        if (c0035p != null) {
            return c0035p.m161x(view, z10);
        }
        ArrayList<C0039s> arrayList = z10 ? this.f114u : this.f115v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= size) {
                break;
            }
            C0039s c0039s = arrayList.get(i11);
            if (c0039s == null) {
                return null;
            }
            if (c0039s.f170b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        C0039s c0039s2 = null;
        if (i10 >= 0) {
            c0039s2 = (z10 ? this.f115v : this.f114u).get(i10);
        }
        return c0039s2;
    }

    /* renamed from: z */
    public String m162z() {
        return this.f95b;
    }
}
