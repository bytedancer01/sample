package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.InterfaceC0577k;
import androidx.lifecycle.InterfaceC0579m;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/OnBackPressedDispatcher.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/activity/OnBackPressedDispatcher.class */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f1318a;

    /* renamed from: b */
    public final ArrayDeque<AbstractC0222b> f1319b = new ArrayDeque<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class */
    public class LifecycleOnBackPressedCancellable implements InterfaceC0577k, InterfaceC0221a {

        /* renamed from: b */
        public final AbstractC0572g f1320b;

        /* renamed from: c */
        public final AbstractC0222b f1321c;

        /* renamed from: d */
        public InterfaceC0221a f1322d;

        /* renamed from: e */
        public final OnBackPressedDispatcher f1323e;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0572g abstractC0572g, AbstractC0222b abstractC0222b) {
            this.f1323e = onBackPressedDispatcher;
            this.f1320b = abstractC0572g;
            this.f1321c = abstractC0222b;
            abstractC0572g.mo3154a(this);
        }

        @Override // androidx.lifecycle.InterfaceC0577k
        /* renamed from: b */
        public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
            if (bVar == AbstractC0572g.b.ON_START) {
                this.f1322d = this.f1323e.m779b(this.f1321c);
                return;
            }
            if (bVar != AbstractC0572g.b.ON_STOP) {
                if (bVar == AbstractC0572g.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0221a interfaceC0221a = this.f1322d;
                if (interfaceC0221a != null) {
                    interfaceC0221a.cancel();
                }
            }
        }

        @Override // androidx.activity.InterfaceC0221a
        public void cancel() {
            this.f1320b.mo3156c(this);
            this.f1321c.m785e(this);
            InterfaceC0221a interfaceC0221a = this.f1322d;
            if (interfaceC0221a != null) {
                interfaceC0221a.cancel();
                this.f1322d = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/OnBackPressedDispatcher$a.class
     */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/OnBackPressedDispatcher$a.class */
    public class C0220a implements InterfaceC0221a {

        /* renamed from: b */
        public final AbstractC0222b f1324b;

        /* renamed from: c */
        public final OnBackPressedDispatcher f1325c;

        public C0220a(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC0222b abstractC0222b) {
            this.f1325c = onBackPressedDispatcher;
            this.f1324b = abstractC0222b;
        }

        @Override // androidx.activity.InterfaceC0221a
        public void cancel() {
            this.f1325c.f1319b.remove(this.f1324b);
            this.f1324b.m785e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1318a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m778a(InterfaceC0579m interfaceC0579m, AbstractC0222b abstractC0222b) {
        AbstractC0572g lifecycle = interfaceC0579m.getLifecycle();
        if (lifecycle.mo3155b() == AbstractC0572g.c.DESTROYED) {
            return;
        }
        abstractC0222b.m781a(new LifecycleOnBackPressedCancellable(this, lifecycle, abstractC0222b));
    }

    /* renamed from: b */
    public InterfaceC0221a m779b(AbstractC0222b abstractC0222b) {
        this.f1319b.add(abstractC0222b);
        C0220a c0220a = new C0220a(this, abstractC0222b);
        abstractC0222b.m781a(c0220a);
        return c0220a;
    }

    /* renamed from: c */
    public void m780c() {
        Iterator<AbstractC0222b> descendingIterator = this.f1319b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0222b next = descendingIterator.next();
            if (next.m783c()) {
                next.mo782b();
                return;
            }
        }
        Runnable runnable = this.f1318a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
