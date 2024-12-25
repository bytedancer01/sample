package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
import p030c0.C0969t0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/i.class
 */
/* renamed from: androidx.navigation.i */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/i.class */
public final class C0629i {

    /* renamed from: a */
    public final Context f4251a;

    /* renamed from: b */
    public final Intent f4252b;

    /* renamed from: c */
    public C0632l f4253c;

    /* renamed from: d */
    public int f4254d;

    /* renamed from: e */
    public Bundle f4255e;

    public C0629i(Context context) {
        this.f4251a = context;
        if (context instanceof Activity) {
            this.f4252b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f4252b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f4252b.addFlags(268468224);
    }

    public C0629i(NavController navController) {
        this(navController.m3442f());
        this.f4253c = navController.m3446j();
    }

    /* renamed from: a */
    public C0969t0 m3549a() {
        if (this.f4252b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.f4253c == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        C0969t0 m5817b = C0969t0.m5815f(this.f4251a).m5817b(new Intent(this.f4252b));
        for (int i10 = 0; i10 < m5817b.m5821i(); i10++) {
            m5817b.m5820g(i10).putExtra("android-support-nav:controller:deepLinkIntent", this.f4252b);
        }
        return m5817b;
    }

    /* renamed from: b */
    public final void m3550b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f4253c);
        C0631k c0631k = null;
        while (!arrayDeque.isEmpty() && c0631k == null) {
            C0631k c0631k2 = (C0631k) arrayDeque.poll();
            if (c0631k2.m3569v() == this.f4254d) {
                c0631k = c0631k2;
            } else if (c0631k2 instanceof C0632l) {
                Iterator<C0631k> it = ((C0632l) c0631k2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (c0631k != null) {
            this.f4252b.putExtra("android-support-nav:controller:deepLinkIds", c0631k.m3565f());
            return;
        }
        throw new IllegalArgumentException("Navigation destination " + C0631k.m3556t(this.f4251a, this.f4254d) + " cannot be found in the navigation graph " + this.f4253c);
    }

    /* renamed from: c */
    public C0629i m3551c(Bundle bundle) {
        this.f4255e = bundle;
        this.f4252b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    /* renamed from: d */
    public C0629i m3552d(int i10) {
        this.f4254d = i10;
        if (this.f4253c != null) {
            m3550b();
        }
        return this;
    }
}
