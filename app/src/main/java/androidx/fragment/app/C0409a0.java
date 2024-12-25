package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p175k0.C5441b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/a0.class
 */
/* renamed from: androidx.fragment.app.a0 */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0.class */
public class C0409a0 extends AbstractC0411b0 {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/a0$a.class
     */
    /* renamed from: androidx.fragment.app.a0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0$a.class */
    public class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final Rect f2746a;

        /* renamed from: b */
        public final C0409a0 f2747b;

        public a(C0409a0 c0409a0, Rect rect) {
            this.f2747b = c0409a0;
            this.f2746a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f2746a;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/a0$b.class
     */
    /* renamed from: androidx.fragment.app.a0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0$b.class */
    public class b implements Transition.TransitionListener {

        /* renamed from: b */
        public final View f2748b;

        /* renamed from: c */
        public final ArrayList f2749c;

        /* renamed from: d */
        public final C0409a0 f2750d;

        public b(C0409a0 c0409a0, View view, ArrayList arrayList) {
            this.f2750d = c0409a0;
            this.f2748b = view;
            this.f2749c = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2748b.setVisibility(8);
            int size = this.f2749c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f2749c.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/a0$c.class
     */
    /* renamed from: androidx.fragment.app.a0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0$c.class */
    public class c implements Transition.TransitionListener {

        /* renamed from: b */
        public final Object f2751b;

        /* renamed from: c */
        public final ArrayList f2752c;

        /* renamed from: d */
        public final Object f2753d;

        /* renamed from: e */
        public final ArrayList f2754e;

        /* renamed from: f */
        public final Object f2755f;

        /* renamed from: g */
        public final ArrayList f2756g;

        /* renamed from: h */
        public final C0409a0 f2757h;

        public c(C0409a0 c0409a0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2757h = c0409a0;
            this.f2751b = obj;
            this.f2752c = arrayList;
            this.f2753d = obj2;
            this.f2754e = arrayList2;
            this.f2755f = obj3;
            this.f2756g = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f2751b;
            if (obj != null) {
                this.f2757h.mo91q(obj, this.f2752c, null);
            }
            Object obj2 = this.f2753d;
            if (obj2 != null) {
                this.f2757h.mo91q(obj2, this.f2754e, null);
            }
            Object obj3 = this.f2755f;
            if (obj3 != null) {
                this.f2757h.mo91q(obj3, this.f2756g, null);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/a0$d.class
     */
    /* renamed from: androidx.fragment.app.a0$d */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0$d.class */
    public class d implements Transition.TransitionListener {

        /* renamed from: b */
        public final Runnable f2758b;

        /* renamed from: c */
        public final C0409a0 f2759c;

        public d(C0409a0 c0409a0, Runnable runnable) {
            this.f2759c = c0409a0;
            this.f2758b = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f2758b.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/a0$e.class
     */
    /* renamed from: androidx.fragment.app.a0$e */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/a0$e.class */
    public class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final Rect f2760a;

        /* renamed from: b */
        public final C0409a0 f2761b;

        public e(C0409a0 c0409a0, Rect rect) {
            this.f2761b = c0409a0;
            this.f2760a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2760a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2760a;
        }
    }

    /* renamed from: C */
    public static boolean m1975C(Transition transition) {
        return (AbstractC0411b0.m1982l(transition.getTargetIds()) && AbstractC0411b0.m1982l(transition.getTargetNames()) && AbstractC0411b0.m1982l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: A */
    public void mo81A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo91q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: B */
    public Object mo82B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: a */
    public void mo83a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: b */
    public void mo84b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i10 = 0; i10 < transitionCount; i10++) {
                mo84b(transitionSet.getTransitionAt(i10), arrayList);
            }
            return;
        }
        if (m1975C(transition) || !AbstractC0411b0.m1982l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            transition.addTarget(arrayList.get(i11));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: c */
    public void mo85c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: e */
    public boolean mo86e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: g */
    public Object mo87g(Object obj) {
        return obj != null ? ((Transition) obj).clone() : null;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: m */
    public Object mo88m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: n */
    public Object mo89n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: p */
    public void mo90p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: q */
    public void mo91q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i10 = 0; i10 < transitionCount; i10++) {
                mo91q(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
            }
            return;
        }
        if (m1975C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            transition.addTarget(arrayList2.get(i11));
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: r */
    public void mo92r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: t */
    public void mo93t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: u */
    public void mo94u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: v */
    public void mo95v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m1985k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: w */
    public void mo96w(Fragment fragment, Object obj, C5441b c5441b, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC0411b0
    /* renamed from: z */
    public void mo97z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0411b0.m1979d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo84b(transitionSet, arrayList);
    }
}
