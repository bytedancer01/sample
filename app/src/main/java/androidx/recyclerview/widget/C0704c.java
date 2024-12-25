package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/c.class
 */
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c.class */
public class C0704c extends AbstractC0717p {

    /* renamed from: s */
    public static TimeInterpolator f4772s;

    /* renamed from: h */
    public ArrayList<RecyclerView.AbstractC0674e0> f4773h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.AbstractC0674e0> f4774i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<j> f4775j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<i> f4776k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC0674e0>> f4777l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<j>> f4778m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<i>> f4779n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.AbstractC0674e0> f4780o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.AbstractC0674e0> f4781p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.AbstractC0674e0> f4782q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.AbstractC0674e0> f4783r = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$a.class
     */
    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final ArrayList f4784b;

        /* renamed from: c */
        public final C0704c f4785c;

        public a(C0704c c0704c, ArrayList arrayList) {
            this.f4785c = c0704c;
            this.f4784b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4784b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                this.f4785c.m4481U(jVar.f4818a, jVar.f4819b, jVar.f4820c, jVar.f4821d, jVar.f4822e);
            }
            this.f4784b.clear();
            this.f4785c.f4778m.remove(this.f4784b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$b.class
     */
    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final ArrayList f4786b;

        /* renamed from: c */
        public final C0704c f4787c;

        public b(C0704c c0704c, ArrayList arrayList) {
            this.f4787c = c0704c;
            this.f4786b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4786b.iterator();
            while (it.hasNext()) {
                this.f4787c.m4480T((i) it.next());
            }
            this.f4786b.clear();
            this.f4787c.f4779n.remove(this.f4786b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$c.class
     */
    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final ArrayList f4788b;

        /* renamed from: c */
        public final C0704c f4789c;

        public c(C0704c c0704c, ArrayList arrayList) {
            this.f4789c = c0704c;
            this.f4788b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4788b.iterator();
            while (it.hasNext()) {
                this.f4789c.m4479S((RecyclerView.AbstractC0674e0) it.next());
            }
            this.f4788b.clear();
            this.f4789c.f4777l.remove(this.f4788b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$d.class
     */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$d.class */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f4790b;

        /* renamed from: c */
        public final ViewPropertyAnimator f4791c;

        /* renamed from: d */
        public final View f4792d;

        /* renamed from: e */
        public final C0704c f4793e;

        public d(C0704c c0704c, RecyclerView.AbstractC0674e0 abstractC0674e0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4793e = c0704c;
            this.f4790b = abstractC0674e0;
            this.f4791c = viewPropertyAnimator;
            this.f4792d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4791c.setListener(null);
            this.f4792d.setAlpha(1.0f);
            this.f4793e.m4660H(this.f4790b);
            this.f4793e.f4782q.remove(this.f4790b);
            this.f4793e.m4484X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4793e.m4661I(this.f4790b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$e.class
     */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$e.class */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f4794b;

        /* renamed from: c */
        public final View f4795c;

        /* renamed from: d */
        public final ViewPropertyAnimator f4796d;

        /* renamed from: e */
        public final C0704c f4797e;

        public e(C0704c c0704c, RecyclerView.AbstractC0674e0 abstractC0674e0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4797e = c0704c;
            this.f4794b = abstractC0674e0;
            this.f4795c = view;
            this.f4796d = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4795c.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4796d.setListener(null);
            this.f4797e.m4654B(this.f4794b);
            this.f4797e.f4780o.remove(this.f4794b);
            this.f4797e.m4484X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4797e.m4655C(this.f4794b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$f.class
     */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$f.class */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final RecyclerView.AbstractC0674e0 f4798b;

        /* renamed from: c */
        public final int f4799c;

        /* renamed from: d */
        public final View f4800d;

        /* renamed from: e */
        public final int f4801e;

        /* renamed from: f */
        public final ViewPropertyAnimator f4802f;

        /* renamed from: g */
        public final C0704c f4803g;

        public f(C0704c c0704c, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4803g = c0704c;
            this.f4798b = abstractC0674e0;
            this.f4799c = i10;
            this.f4800d = view;
            this.f4801e = i11;
            this.f4802f = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4799c != 0) {
                this.f4800d.setTranslationX(0.0f);
            }
            if (this.f4801e != 0) {
                this.f4800d.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4802f.setListener(null);
            this.f4803g.m4658F(this.f4798b);
            this.f4803g.f4781p.remove(this.f4798b);
            this.f4803g.m4484X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4803g.m4659G(this.f4798b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$g.class
     */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$g.class */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final i f4804b;

        /* renamed from: c */
        public final ViewPropertyAnimator f4805c;

        /* renamed from: d */
        public final View f4806d;

        /* renamed from: e */
        public final C0704c f4807e;

        public g(C0704c c0704c, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4807e = c0704c;
            this.f4804b = iVar;
            this.f4805c = viewPropertyAnimator;
            this.f4806d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4805c.setListener(null);
            this.f4806d.setAlpha(1.0f);
            this.f4806d.setTranslationX(0.0f);
            this.f4806d.setTranslationY(0.0f);
            this.f4807e.m4656D(this.f4804b.f4812a, true);
            this.f4807e.f4783r.remove(this.f4804b.f4812a);
            this.f4807e.m4484X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4807e.m4657E(this.f4804b.f4812a, true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$h.class
     */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$h.class */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final i f4808b;

        /* renamed from: c */
        public final ViewPropertyAnimator f4809c;

        /* renamed from: d */
        public final View f4810d;

        /* renamed from: e */
        public final C0704c f4811e;

        public h(C0704c c0704c, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4811e = c0704c;
            this.f4808b = iVar;
            this.f4809c = viewPropertyAnimator;
            this.f4810d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4809c.setListener(null);
            this.f4810d.setAlpha(1.0f);
            this.f4810d.setTranslationX(0.0f);
            this.f4810d.setTranslationY(0.0f);
            this.f4811e.m4656D(this.f4808b.f4813b, false);
            this.f4811e.f4783r.remove(this.f4808b.f4813b);
            this.f4811e.m4484X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4811e.m4657E(this.f4808b.f4813b, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$i.class
     */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$i.class */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC0674e0 f4812a;

        /* renamed from: b */
        public RecyclerView.AbstractC0674e0 f4813b;

        /* renamed from: c */
        public int f4814c;

        /* renamed from: d */
        public int f4815d;

        /* renamed from: e */
        public int f4816e;

        /* renamed from: f */
        public int f4817f;

        public i(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02) {
            this.f4812a = abstractC0674e0;
            this.f4813b = abstractC0674e02;
        }

        public i(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02, int i10, int i11, int i12, int i13) {
            this(abstractC0674e0, abstractC0674e02);
            this.f4814c = i10;
            this.f4815d = i11;
            this.f4816e = i12;
            this.f4817f = i13;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4812a + ", newHolder=" + this.f4813b + ", fromX=" + this.f4814c + ", fromY=" + this.f4815d + ", toX=" + this.f4816e + ", toY=" + this.f4817f + '}';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/c$j.class
     */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/c$j.class */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC0674e0 f4818a;

        /* renamed from: b */
        public int f4819b;

        /* renamed from: c */
        public int f4820c;

        /* renamed from: d */
        public int f4821d;

        /* renamed from: e */
        public int f4822e;

        public j(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, int i12, int i13) {
            this.f4818a = abstractC0674e0;
            this.f4819b = i10;
            this.f4820c = i11;
            this.f4821d = i12;
            this.f4822e = i13;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0717p
    /* renamed from: A */
    public boolean mo4478A(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4488b0(abstractC0674e0);
        this.f4773h.add(abstractC0674e0);
        return true;
    }

    /* renamed from: S */
    public void m4479S(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        View view = abstractC0674e0.f4620a;
        ViewPropertyAnimator animate = view.animate();
        this.f4780o.add(abstractC0674e0);
        animate.alpha(1.0f).setDuration(m4125l()).setListener(new e(this, abstractC0674e0, view, animate)).start();
    }

    /* renamed from: T */
    public void m4480T(i iVar) {
        RecyclerView.AbstractC0674e0 abstractC0674e0 = iVar.f4812a;
        View view = null;
        View view2 = abstractC0674e0 == null ? null : abstractC0674e0.f4620a;
        RecyclerView.AbstractC0674e0 abstractC0674e02 = iVar.f4813b;
        if (abstractC0674e02 != null) {
            view = abstractC0674e02.f4620a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m4126m());
            this.f4783r.add(iVar.f4812a);
            duration.translationX(iVar.f4816e - iVar.f4814c);
            duration.translationY(iVar.f4817f - iVar.f4815d);
            duration.alpha(0.0f).setListener(new g(this, iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f4783r.add(iVar.f4813b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m4126m()).alpha(1.0f).setListener(new h(this, iVar, animate, view)).start();
        }
    }

    /* renamed from: U */
    public void m4481U(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, int i12, int i13) {
        View view = abstractC0674e0.f4620a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4781p.add(abstractC0674e0);
        animate.setDuration(m4127n()).setListener(new f(this, abstractC0674e0, i14, view, i15, animate)).start();
    }

    /* renamed from: V */
    public final void m4482V(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        View view = abstractC0674e0.f4620a;
        ViewPropertyAnimator animate = view.animate();
        this.f4782q.add(abstractC0674e0);
        animate.setDuration(m4128o()).alpha(0.0f).setListener(new d(this, abstractC0674e0, animate, view)).start();
    }

    /* renamed from: W */
    public void m4483W(List<RecyclerView.AbstractC0674e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4620a.animate().cancel();
        }
    }

    /* renamed from: X */
    public void m4484X() {
        if (mo4129p()) {
            return;
        }
        m4122i();
    }

    /* renamed from: Y */
    public final void m4485Y(List<i> list, RecyclerView.AbstractC0674e0 abstractC0674e0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m4487a0(iVar, abstractC0674e0) && iVar.f4812a == null && iVar.f4813b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: Z */
    public final void m4486Z(i iVar) {
        RecyclerView.AbstractC0674e0 abstractC0674e0 = iVar.f4812a;
        if (abstractC0674e0 != null) {
            m4487a0(iVar, abstractC0674e0);
        }
        RecyclerView.AbstractC0674e0 abstractC0674e02 = iVar.f4813b;
        if (abstractC0674e02 != null) {
            m4487a0(iVar, abstractC0674e02);
        }
    }

    /* renamed from: a0 */
    public final boolean m4487a0(i iVar, RecyclerView.AbstractC0674e0 abstractC0674e0) {
        boolean z10 = false;
        if (iVar.f4813b == abstractC0674e0) {
            iVar.f4813b = null;
        } else {
            if (iVar.f4812a != abstractC0674e0) {
                return false;
            }
            iVar.f4812a = null;
            z10 = true;
        }
        abstractC0674e0.f4620a.setAlpha(1.0f);
        abstractC0674e0.f4620a.setTranslationX(0.0f);
        abstractC0674e0.f4620a.setTranslationY(0.0f);
        m4656D(abstractC0674e0, z10);
        return true;
    }

    /* renamed from: b0 */
    public final void m4488b0(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        if (f4772s == null) {
            f4772s = new ValueAnimator().getInterpolator();
        }
        abstractC0674e0.f4620a.animate().setInterpolator(f4772s);
        mo4123j(abstractC0674e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: g */
    public boolean mo4120g(RecyclerView.AbstractC0674e0 abstractC0674e0, List<Object> list) {
        return !list.isEmpty() || super.mo4120g(abstractC0674e0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: j */
    public void mo4123j(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        View view = abstractC0674e0.f4620a;
        view.animate().cancel();
        for (int size = this.f4775j.size() - 1; size >= 0; size--) {
            if (this.f4775j.get(size).f4818a == abstractC0674e0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4658F(abstractC0674e0);
                this.f4775j.remove(size);
            }
        }
        m4485Y(this.f4776k, abstractC0674e0);
        if (this.f4773h.remove(abstractC0674e0)) {
            view.setAlpha(1.0f);
            m4660H(abstractC0674e0);
        }
        if (this.f4774i.remove(abstractC0674e0)) {
            view.setAlpha(1.0f);
            m4654B(abstractC0674e0);
        }
        for (int size2 = this.f4779n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4779n.get(size2);
            m4485Y(arrayList, abstractC0674e0);
            if (arrayList.isEmpty()) {
                this.f4779n.remove(size2);
            }
        }
        for (int size3 = this.f4778m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4778m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f4818a == abstractC0674e0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4658F(abstractC0674e0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4778m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4777l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0674e0> arrayList3 = this.f4777l.get(size5);
            if (arrayList3.remove(abstractC0674e0)) {
                view.setAlpha(1.0f);
                m4654B(abstractC0674e0);
                if (arrayList3.isEmpty()) {
                    this.f4777l.remove(size5);
                }
            }
        }
        this.f4782q.remove(abstractC0674e0);
        this.f4780o.remove(abstractC0674e0);
        this.f4783r.remove(abstractC0674e0);
        this.f4781p.remove(abstractC0674e0);
        m4484X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: k */
    public void mo4124k() {
        for (int size = this.f4775j.size() - 1; size >= 0; size--) {
            j jVar = this.f4775j.get(size);
            View view = jVar.f4818a.f4620a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4658F(jVar.f4818a);
            this.f4775j.remove(size);
        }
        for (int size2 = this.f4773h.size() - 1; size2 >= 0; size2--) {
            m4660H(this.f4773h.get(size2));
            this.f4773h.remove(size2);
        }
        for (int size3 = this.f4774i.size() - 1; size3 >= 0; size3--) {
            RecyclerView.AbstractC0674e0 abstractC0674e0 = this.f4774i.get(size3);
            abstractC0674e0.f4620a.setAlpha(1.0f);
            m4654B(abstractC0674e0);
            this.f4774i.remove(size3);
        }
        for (int size4 = this.f4776k.size() - 1; size4 >= 0; size4--) {
            m4486Z(this.f4776k.get(size4));
        }
        this.f4776k.clear();
        if (mo4129p()) {
            for (int size5 = this.f4778m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4778m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4818a.f4620a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4658F(jVar2.f4818a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4778m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4777l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0674e0> arrayList2 = this.f4777l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0674e0 abstractC0674e02 = arrayList2.get(size8);
                    abstractC0674e02.f4620a.setAlpha(1.0f);
                    m4654B(abstractC0674e02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4777l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4779n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4779n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4486Z(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4779n.remove(arrayList3);
                    }
                }
            }
            m4483W(this.f4782q);
            m4483W(this.f4781p);
            m4483W(this.f4780o);
            m4483W(this.f4783r);
            m4122i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: p */
    public boolean mo4129p() {
        return (this.f4774i.isEmpty() && this.f4776k.isEmpty() && this.f4775j.isEmpty() && this.f4773h.isEmpty() && this.f4781p.isEmpty() && this.f4782q.isEmpty() && this.f4780o.isEmpty() && this.f4783r.isEmpty() && this.f4778m.isEmpty() && this.f4777l.isEmpty() && this.f4779n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m
    /* renamed from: v */
    public void mo4135v() {
        boolean z10 = !this.f4773h.isEmpty();
        boolean z11 = !this.f4775j.isEmpty();
        boolean z12 = !this.f4776k.isEmpty();
        boolean z13 = !this.f4774i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.AbstractC0674e0> it = this.f4773h.iterator();
            while (it.hasNext()) {
                m4482V(it.next());
            }
            this.f4773h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4775j);
                this.f4778m.add(arrayList);
                this.f4775j.clear();
                a aVar = new a(this, arrayList);
                if (z10) {
                    C6824g0.m31525i0(arrayList.get(0).f4818a.f4620a, aVar, m4128o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4776k);
                this.f4779n.add(arrayList2);
                this.f4776k.clear();
                b bVar = new b(this, arrayList2);
                if (z10) {
                    C6824g0.m31525i0(arrayList2.get(0).f4812a.f4620a, bVar, m4128o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.AbstractC0674e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4774i);
                this.f4777l.add(arrayList3);
                this.f4774i.clear();
                c cVar = new c(this, arrayList3);
                if (!z10 && !z11 && !z12) {
                    cVar.run();
                    return;
                }
                long j10 = 0;
                long m4128o = z10 ? m4128o() : 0L;
                long m4127n = z11 ? m4127n() : 0L;
                if (z12) {
                    j10 = m4126m();
                }
                C6824g0.m31525i0(arrayList3.get(0).f4620a, cVar, m4128o + Math.max(m4127n, j10));
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0717p
    /* renamed from: x */
    public boolean mo4489x(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4488b0(abstractC0674e0);
        abstractC0674e0.f4620a.setAlpha(0.0f);
        this.f4774i.add(abstractC0674e0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0717p
    /* renamed from: y */
    public boolean mo4490y(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02, int i10, int i11, int i12, int i13) {
        if (abstractC0674e0 == abstractC0674e02) {
            return mo4491z(abstractC0674e0, i10, i11, i12, i13);
        }
        float translationX = abstractC0674e0.f4620a.getTranslationX();
        float translationY = abstractC0674e0.f4620a.getTranslationY();
        float alpha = abstractC0674e0.f4620a.getAlpha();
        m4488b0(abstractC0674e0);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        abstractC0674e0.f4620a.setTranslationX(translationX);
        abstractC0674e0.f4620a.setTranslationY(translationY);
        abstractC0674e0.f4620a.setAlpha(alpha);
        if (abstractC0674e02 != null) {
            m4488b0(abstractC0674e02);
            abstractC0674e02.f4620a.setTranslationX(-i14);
            abstractC0674e02.f4620a.setTranslationY(-i15);
            abstractC0674e02.f4620a.setAlpha(0.0f);
        }
        this.f4776k.add(new i(abstractC0674e0, abstractC0674e02, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0717p
    /* renamed from: z */
    public boolean mo4491z(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, int i12, int i13) {
        View view = abstractC0674e0.f4620a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC0674e0.f4620a.getTranslationY());
        m4488b0(abstractC0674e0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m4658F(abstractC0674e0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4775j.add(new j(abstractC0674e0, translationX, translationY, i12, i13));
        return true;
    }
}
