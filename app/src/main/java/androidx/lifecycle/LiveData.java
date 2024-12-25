package androidx.lifecycle;

import androidx.lifecycle.AbstractC0572g;
import p174k.C5436a;
import p190l.C5637b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/LiveData.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LiveData.class */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f3714k = new Object();

    /* renamed from: a */
    public final Object f3715a = new Object();

    /* renamed from: b */
    public C5637b<InterfaceC0586t<? super T>, LiveData<T>.AbstractC0557c> f3716b = new C5637b<>();

    /* renamed from: c */
    public int f3717c = 0;

    /* renamed from: d */
    public boolean f3718d;

    /* renamed from: e */
    public volatile Object f3719e;

    /* renamed from: f */
    public volatile Object f3720f;

    /* renamed from: g */
    public int f3721g;

    /* renamed from: h */
    public boolean f3722h;

    /* renamed from: i */
    public boolean f3723i;

    /* renamed from: j */
    public final Runnable f3724j;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/LiveData$LifecycleBoundObserver.class
     */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LiveData$LifecycleBoundObserver.class */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0557c implements InterfaceC0577k {

        /* renamed from: f */
        public final InterfaceC0579m f3725f;

        /* renamed from: g */
        public final LiveData f3726g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LifecycleBoundObserver(LiveData liveData, InterfaceC0579m interfaceC0579m, InterfaceC0586t<? super T> interfaceC0586t) {
            super(liveData, interfaceC0586t);
            this.f3726g = liveData;
            this.f3725f = interfaceC0579m;
        }

        @Override // androidx.lifecycle.InterfaceC0577k
        /* renamed from: b */
        public void mo775b(InterfaceC0579m interfaceC0579m, AbstractC0572g.b bVar) {
            AbstractC0572g.c mo3155b = this.f3725f.getLifecycle().mo3155b();
            if (mo3155b == AbstractC0572g.c.DESTROYED) {
                this.f3726g.mo3105m(this.f3729b);
                return;
            }
            AbstractC0572g.c cVar = null;
            while (cVar != mo3155b) {
                m3110c(mo3109k());
                cVar = mo3155b;
                mo3155b = this.f3725f.getLifecycle().mo3155b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0557c
        /* renamed from: e */
        public void mo3107e() {
            this.f3725f.getLifecycle().mo3156c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0557c
        /* renamed from: i */
        public boolean mo3108i(InterfaceC0579m interfaceC0579m) {
            return this.f3725f == interfaceC0579m;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0557c
        /* renamed from: k */
        public boolean mo3109k() {
            return this.f3725f.getLifecycle().mo3155b().isAtLeast(AbstractC0572g.c.STARTED);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/LiveData$a.class
     */
    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LiveData$a.class */
    public class RunnableC0555a implements Runnable {

        /* renamed from: b */
        public final LiveData f3727b;

        public RunnableC0555a(LiveData liveData) {
            this.f3727b = liveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (this.f3727b.f3715a) {
                obj = this.f3727b.f3720f;
                this.f3727b.f3720f = LiveData.f3714k;
            }
            this.f3727b.mo3106n(obj);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/LiveData$b.class
     */
    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LiveData$b.class */
    public class C0556b extends LiveData<T>.AbstractC0557c {

        /* renamed from: f */
        public final LiveData f3728f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0556b(LiveData liveData, InterfaceC0586t<? super T> interfaceC0586t) {
            super(liveData, interfaceC0586t);
            this.f3728f = liveData;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0557c
        /* renamed from: k */
        public boolean mo3109k() {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/LiveData$c.class
     */
    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/LiveData$c.class */
    public abstract class AbstractC0557c {

        /* renamed from: b */
        public final InterfaceC0586t<? super T> f3729b;

        /* renamed from: c */
        public boolean f3730c;

        /* renamed from: d */
        public int f3731d = -1;

        /* renamed from: e */
        public final LiveData f3732e;

        public AbstractC0557c(LiveData liveData, InterfaceC0586t<? super T> interfaceC0586t) {
            this.f3732e = liveData;
            this.f3729b = interfaceC0586t;
        }

        /* renamed from: c */
        public void m3110c(boolean z10) {
            if (z10 == this.f3730c) {
                return;
            }
            this.f3730c = z10;
            this.f3732e.m3095c(z10 ? 1 : -1);
            if (this.f3730c) {
                this.f3732e.m3097e(this);
            }
        }

        /* renamed from: e */
        public void mo3107e() {
        }

        /* renamed from: i */
        public boolean mo3108i(InterfaceC0579m interfaceC0579m) {
            return false;
        }

        /* renamed from: k */
        public abstract boolean mo3109k();
    }

    public LiveData() {
        Object obj = f3714k;
        this.f3720f = obj;
        this.f3724j = new RunnableC0555a(this);
        this.f3719e = obj;
        this.f3721g = -1;
    }

    /* renamed from: b */
    public static void m3094b(String str) {
        if (C5436a.m27181e().mo27183b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: c */
    public void m3095c(int i10) {
        int i11 = this.f3717c;
        this.f3717c = i10 + i11;
        if (this.f3718d) {
            return;
        }
        this.f3718d = true;
        while (true) {
            try {
                int i12 = this.f3717c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    mo3102j();
                } else if (z11) {
                    mo3103k();
                }
                i11 = i12;
            } finally {
                this.f3718d = false;
            }
        }
    }

    /* renamed from: d */
    public final void m3096d(LiveData<T>.AbstractC0557c abstractC0557c) {
        if (abstractC0557c.f3730c) {
            if (!abstractC0557c.mo3109k()) {
                abstractC0557c.m3110c(false);
                return;
            }
            int i10 = abstractC0557c.f3731d;
            int i11 = this.f3721g;
            if (i10 >= i11) {
                return;
            }
            abstractC0557c.f3731d = i11;
            abstractC0557c.f3729b.mo2031a((Object) this.f3719e);
        }
    }

    /* renamed from: e */
    public void m3097e(LiveData<T>.AbstractC0557c abstractC0557c) {
        LiveData<T>.AbstractC0557c abstractC0557c2;
        if (this.f3722h) {
            this.f3723i = true;
            return;
        }
        this.f3722h = true;
        do {
            this.f3723i = false;
            if (abstractC0557c == null) {
                C5637b<InterfaceC0586t<? super T>, LiveData<T>.AbstractC0557c>.d m27812f = this.f3716b.m27812f();
                while (true) {
                    abstractC0557c2 = abstractC0557c;
                    if (!m27812f.hasNext()) {
                        break;
                    }
                    m3096d((AbstractC0557c) m27812f.next().getValue());
                    if (this.f3723i) {
                        abstractC0557c2 = abstractC0557c;
                        break;
                    }
                }
            } else {
                m3096d(abstractC0557c);
                abstractC0557c2 = null;
            }
            abstractC0557c = abstractC0557c2;
        } while (this.f3723i);
        this.f3722h = false;
    }

    /* renamed from: f */
    public T m3098f() {
        T t10 = (T) this.f3719e;
        if (t10 != f3714k) {
            return t10;
        }
        return null;
    }

    /* renamed from: g */
    public boolean m3099g() {
        return this.f3717c > 0;
    }

    /* renamed from: h */
    public void m3100h(InterfaceC0579m interfaceC0579m, InterfaceC0586t<? super T> interfaceC0586t) {
        m3094b("observe");
        if (interfaceC0579m.getLifecycle().mo3155b() == AbstractC0572g.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(this, interfaceC0579m, interfaceC0586t);
        LiveData<T>.AbstractC0557c mo27808i = this.f3716b.mo27808i(interfaceC0586t, lifecycleBoundObserver);
        if (mo27808i != null && !mo27808i.mo3108i(interfaceC0579m)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo27808i != null) {
            return;
        }
        interfaceC0579m.getLifecycle().mo3154a(lifecycleBoundObserver);
    }

    /* renamed from: i */
    public void m3101i(InterfaceC0586t<? super T> interfaceC0586t) {
        m3094b("observeForever");
        C0556b c0556b = new C0556b(this, interfaceC0586t);
        LiveData<T>.AbstractC0557c mo27808i = this.f3716b.mo27808i(interfaceC0586t, c0556b);
        if (mo27808i instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo27808i != null) {
            return;
        }
        c0556b.m3110c(true);
    }

    /* renamed from: j */
    public void mo3102j() {
    }

    /* renamed from: k */
    public void mo3103k() {
    }

    /* renamed from: l */
    public void mo3104l(T t10) {
        boolean z10;
        synchronized (this.f3715a) {
            z10 = this.f3720f == f3714k;
            this.f3720f = t10;
        }
        if (z10) {
            C5436a.m27181e().mo27184c(this.f3724j);
        }
    }

    /* renamed from: m */
    public void mo3105m(InterfaceC0586t<? super T> interfaceC0586t) {
        m3094b("removeObserver");
        LiveData<T>.AbstractC0557c mo27809q = this.f3716b.mo27809q(interfaceC0586t);
        if (mo27809q == null) {
            return;
        }
        mo27809q.mo3107e();
        mo27809q.m3110c(false);
    }

    /* renamed from: n */
    public void mo3106n(T t10) {
        m3094b("setValue");
        this.f3721g++;
        this.f3719e = t10;
        m3097e(null);
    }
}
