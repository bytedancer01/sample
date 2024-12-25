package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p030c0.C0936d;
import p050d0.C4290b;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/k.class
 */
/* renamed from: androidx.fragment.app.k */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/k.class */
public abstract class AbstractC0425k<E> extends AbstractC0420g {

    /* renamed from: b */
    public final Activity f2905b;

    /* renamed from: c */
    public final Context f2906c;

    /* renamed from: d */
    public final Handler f2907d;

    /* renamed from: e */
    public final int f2908e;

    /* renamed from: f */
    public final AbstractC0428n f2909f;

    public AbstractC0425k(Activity activity, Context context, Handler handler, int i10) {
        this.f2909f = new C0429o();
        this.f2905b = activity;
        this.f2906c = (Context) C6616h.m30528f(context, "context == null");
        this.f2907d = (Handler) C6616h.m30528f(handler, "handler == null");
        this.f2908e = i10;
    }

    public AbstractC0425k(ActivityC0416e activityC0416e) {
        this(activityC0416e, activityC0416e, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0420g
    /* renamed from: c */
    public View mo1940c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0420g
    /* renamed from: d */
    public boolean mo1941d() {
        return true;
    }

    /* renamed from: e */
    Activity m2106e() {
        return this.f2905b;
    }

    /* renamed from: f */
    Context m2107f() {
        return this.f2906c;
    }

    /* renamed from: g */
    Handler m2108g() {
        return this.f2907d;
    }

    /* renamed from: h */
    public void mo2035h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo2036i();

    /* renamed from: j */
    public LayoutInflater mo2037j() {
        return LayoutInflater.from(this.f2906c);
    }

    @Deprecated
    /* renamed from: k */
    public void m2109k(Fragment fragment, String[] strArr, int i10) {
    }

    /* renamed from: l */
    public boolean mo2038l(Fragment fragment) {
        return true;
    }

    /* renamed from: m */
    public boolean mo2039m(String str) {
        return false;
    }

    /* renamed from: n */
    public void m2110n(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C4290b.m21732k(this.f2906c, intent, bundle);
    }

    @Deprecated
    /* renamed from: o */
    public void m2111o(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C0936d.m5647x(this.f2905b, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* renamed from: p */
    public void mo2040p() {
    }
}
