package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0572g;
import androidx.lifecycle.FragmentC0589w;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/lifecycle/v.class
 */
/* renamed from: androidx.lifecycle.v */
/* loaded from: combined.jar:classes1.jar:androidx/lifecycle/v.class */
public class C0588v implements InterfaceC0579m {

    /* renamed from: j */
    public static final C0588v f3780j = new C0588v();

    /* renamed from: f */
    public Handler f3785f;

    /* renamed from: b */
    public int f3781b = 0;

    /* renamed from: c */
    public int f3782c = 0;

    /* renamed from: d */
    public boolean f3783d = true;

    /* renamed from: e */
    public boolean f3784e = true;

    /* renamed from: g */
    public final C0580n f3786g = new C0580n(this);

    /* renamed from: h */
    public Runnable f3787h = new a(this);

    /* renamed from: i */
    public FragmentC0589w.a f3788i = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/v$a.class
     */
    /* renamed from: androidx.lifecycle.v$a */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/v$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0588v f3789b;

        public a(C0588v c0588v) {
            this.f3789b = c0588v;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3789b.m3188f();
            this.f3789b.m3189g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/v$b.class
     */
    /* renamed from: androidx.lifecycle.v$b */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/v$b.class */
    public class b implements FragmentC0589w.a {

        /* renamed from: a */
        public final C0588v f3790a;

        public b(C0588v c0588v) {
            this.f3790a = c0588v;
        }

        @Override // androidx.lifecycle.FragmentC0589w.a
        /* renamed from: a */
        public void mo3190a() {
        }

        @Override // androidx.lifecycle.FragmentC0589w.a
        public void onResume() {
            this.f3790a.m3184b();
        }

        @Override // androidx.lifecycle.FragmentC0589w.a
        public void onStart() {
            this.f3790a.m3185c();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/lifecycle/v$c.class
     */
    /* renamed from: androidx.lifecycle.v$c */
    /* loaded from: combined.jar:classes1.jar:androidx/lifecycle/v$c.class */
    public class c extends C0566d {

        /* renamed from: b */
        public final C0588v f3791b;

        public c(C0588v c0588v) {
            this.f3791b = c0588v;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC0589w.m3192f(activity).m3198h(this.f3791b.f3788i);
        }

        @Override // androidx.lifecycle.C0566d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            this.f3791b.m3183a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f3791b.m3186d();
        }
    }

    /* renamed from: h */
    public static void m3182h(Context context) {
        f3780j.m3187e(context);
    }

    /* renamed from: a */
    public void m3183a() {
        int i10 = this.f3782c - 1;
        this.f3782c = i10;
        if (i10 == 0) {
            this.f3785f.postDelayed(this.f3787h, 700L);
        }
    }

    /* renamed from: b */
    public void m3184b() {
        int i10 = this.f3782c + 1;
        this.f3782c = i10;
        if (i10 == 1) {
            if (!this.f3783d) {
                this.f3785f.removeCallbacks(this.f3787h);
            } else {
                this.f3786g.m3166h(AbstractC0572g.b.ON_RESUME);
                this.f3783d = false;
            }
        }
    }

    /* renamed from: c */
    public void m3185c() {
        int i10 = this.f3781b + 1;
        this.f3781b = i10;
        if (i10 == 1 && this.f3784e) {
            this.f3786g.m3166h(AbstractC0572g.b.ON_START);
            this.f3784e = false;
        }
    }

    /* renamed from: d */
    public void m3186d() {
        this.f3781b--;
        m3189g();
    }

    /* renamed from: e */
    public void m3187e(Context context) {
        this.f3785f = new Handler();
        this.f3786g.m3166h(AbstractC0572g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c(this));
    }

    /* renamed from: f */
    public void m3188f() {
        if (this.f3782c == 0) {
            this.f3783d = true;
            this.f3786g.m3166h(AbstractC0572g.b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    public void m3189g() {
        if (this.f3781b == 0 && this.f3783d) {
            this.f3786g.m3166h(AbstractC0572g.b.ON_STOP);
            this.f3784e = true;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0579m
    public AbstractC0572g getLifecycle() {
        return this.f3786g;
    }
}
