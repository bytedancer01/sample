package p239o4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractC0428n;
import androidx.fragment.app.ActivityC0416e;
import java.util.HashMap;
import java.util.Map;
import p329t3.C8620j;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o4/k.class
 */
/* renamed from: o4.k */
/* loaded from: combined.jar:classes1.jar:o4/k.class */
public class C6902k implements Handler.Callback {

    /* renamed from: f */
    public static final C6902k f35730f = new C6902k();

    /* renamed from: b */
    public volatile C8620j f35731b;

    /* renamed from: c */
    public final Map<FragmentManager, FragmentC6901j> f35732c = new HashMap();

    /* renamed from: d */
    public final Map<AbstractC0428n, C6905n> f35733d = new HashMap();

    /* renamed from: e */
    public final Handler f35734e = new Handler(Looper.getMainLooper(), this);

    @TargetApi(17)
    /* renamed from: a */
    public static void m31816a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: c */
    public static C6902k m31817c() {
        return f35730f;
    }

    @TargetApi(11)
    /* renamed from: b */
    public C8620j m31818b(Context context, FragmentManager fragmentManager) {
        FragmentC6901j m31823h = m31823h(fragmentManager);
        C8620j m31812c = m31823h.m31812c();
        C8620j c8620j = m31812c;
        if (m31812c == null) {
            c8620j = new C8620j(context, m31823h.m31811b(), m31823h.m31813d());
            m31823h.m31815f(c8620j);
        }
        return c8620j;
    }

    @TargetApi(11)
    /* renamed from: d */
    public C8620j m31819d(Activity activity) {
        if (C9242h.m38970h()) {
            return m31820e(activity.getApplicationContext());
        }
        m31816a(activity);
        return m31818b(activity, activity.getFragmentManager());
    }

    /* renamed from: e */
    public C8620j m31820e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C9242h.m38971i() && !(context instanceof Application)) {
            if (context instanceof ActivityC0416e) {
                return m31821f((ActivityC0416e) context);
            }
            if (context instanceof Activity) {
                return m31819d((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m31820e(((ContextWrapper) context).getBaseContext());
            }
        }
        return m31822g(context);
    }

    /* renamed from: f */
    public C8620j m31821f(ActivityC0416e activityC0416e) {
        if (C9242h.m38970h()) {
            return m31820e(activityC0416e.getApplicationContext());
        }
        m31816a(activityC0416e);
        return m31825j(activityC0416e, activityC0416e.getSupportFragmentManager());
    }

    /* renamed from: g */
    public final C8620j m31822g(Context context) {
        if (this.f35731b == null) {
            synchronized (this) {
                if (this.f35731b == null) {
                    this.f35731b = new C8620j(context.getApplicationContext(), new C6893b(), new C6897f());
                }
            }
        }
        return this.f35731b;
    }

    @TargetApi(17)
    /* renamed from: h */
    public FragmentC6901j m31823h(FragmentManager fragmentManager) {
        FragmentC6901j fragmentC6901j = (FragmentC6901j) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        FragmentC6901j fragmentC6901j2 = fragmentC6901j;
        if (fragmentC6901j == null) {
            FragmentC6901j fragmentC6901j3 = this.f35732c.get(fragmentManager);
            fragmentC6901j2 = fragmentC6901j3;
            if (fragmentC6901j3 == null) {
                fragmentC6901j2 = new FragmentC6901j();
                this.f35732c.put(fragmentManager, fragmentC6901j2);
                fragmentManager.beginTransaction().add(fragmentC6901j2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f35734e.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return fragmentC6901j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        int i10 = message.what;
        FragmentC6901j fragmentC6901j = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj = (FragmentManager) message.obj;
            map = this.f35732c;
        } else {
            if (i10 != 2) {
                z10 = false;
                obj = null;
                if (z10 && fragmentC6901j == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
                }
                return z10;
            }
            obj = (AbstractC0428n) message.obj;
            map = this.f35733d;
        }
        fragmentC6901j = map.remove(obj);
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z10;
    }

    /* renamed from: i */
    public C6905n m31824i(AbstractC0428n abstractC0428n) {
        C6905n c6905n = (C6905n) abstractC0428n.m2206i0("com.bumptech.glide.manager");
        C6905n c6905n2 = c6905n;
        if (c6905n == null) {
            C6905n c6905n3 = this.f35733d.get(abstractC0428n);
            c6905n2 = c6905n3;
            if (c6905n3 == null) {
                c6905n2 = new C6905n();
                this.f35733d.put(abstractC0428n, c6905n2);
                abstractC0428n.m2216m().m2364e(c6905n2, "com.bumptech.glide.manager").mo1965k();
                this.f35734e.obtainMessage(2, abstractC0428n).sendToTarget();
            }
        }
        return c6905n2;
    }

    /* renamed from: j */
    public C8620j m31825j(Context context, AbstractC0428n abstractC0428n) {
        C6905n m31824i = m31824i(abstractC0428n);
        C8620j m31834p = m31824i.m31834p();
        C8620j c8620j = m31834p;
        if (m31834p == null) {
            c8620j = new C8620j(context, m31824i.m31833n(), m31824i.m31835q());
            m31824i.m31837u(c8620j);
        }
        return c8620j;
    }
}
