package p049d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p294r.C7929b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/c.class
 */
/* renamed from: d.c */
/* loaded from: combined.jar:classes1.jar:d/c.class */
public abstract class AbstractC4277c {

    /* renamed from: b */
    public static int f26229b = -100;

    /* renamed from: c */
    public static final C7929b<WeakReference<AbstractC4277c>> f26230c = new C7929b<>();

    /* renamed from: d */
    public static final Object f26231d = new Object();

    /* renamed from: c */
    public static void m21533c(AbstractC4277c abstractC4277c) {
        synchronized (f26231d) {
            m21538y(abstractC4277c);
            f26230c.add(new WeakReference<>(abstractC4277c));
        }
    }

    /* renamed from: g */
    public static AbstractC4277c m21534g(Activity activity, InterfaceC4276b interfaceC4276b) {
        return new LayoutInflaterFactory2C4278d(activity, interfaceC4276b);
    }

    /* renamed from: h */
    public static AbstractC4277c m21535h(Dialog dialog, InterfaceC4276b interfaceC4276b) {
        return new LayoutInflaterFactory2C4278d(dialog, interfaceC4276b);
    }

    /* renamed from: j */
    public static int m21536j() {
        return f26229b;
    }

    /* renamed from: x */
    public static void m21537x(AbstractC4277c abstractC4277c) {
        synchronized (f26231d) {
            m21538y(abstractC4277c);
        }
    }

    /* renamed from: y */
    public static void m21538y(AbstractC4277c abstractC4277c) {
        synchronized (f26231d) {
            Iterator<WeakReference<AbstractC4277c>> it = f26230c.iterator();
            while (it.hasNext()) {
                AbstractC4277c abstractC4277c2 = it.next().get();
                if (abstractC4277c2 == abstractC4277c || abstractC4277c2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo21539A(int i10);

    /* renamed from: B */
    public abstract void mo21540B(View view);

    /* renamed from: C */
    public abstract void mo21541C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public abstract void mo21542D(Toolbar toolbar);

    /* renamed from: E */
    public void mo21543E(int i10) {
    }

    /* renamed from: F */
    public abstract void mo21544F(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo21545d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void m21546e(Context context) {
    }

    /* renamed from: f */
    public Context mo21547f(Context context) {
        m21546e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo21548i(int i10);

    /* renamed from: k */
    public int mo21549k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo21550l();

    /* renamed from: m */
    public abstract AbstractC4275a mo21551m();

    /* renamed from: n */
    public abstract void mo21552n();

    /* renamed from: o */
    public abstract void mo21553o();

    /* renamed from: p */
    public abstract void mo21554p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo21555q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo21556r();

    /* renamed from: s */
    public abstract void mo21557s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo21558t();

    /* renamed from: u */
    public abstract void mo21559u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo21560v();

    /* renamed from: w */
    public abstract void mo21561w();

    /* renamed from: z */
    public abstract boolean mo21562z(int i10);
}
