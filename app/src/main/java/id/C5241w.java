package id;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/w.class
 */
/* renamed from: id.w */
/* loaded from: combined.jar:classes2.jar:id/w.class */
public final class C5241w {

    /* renamed from: d */
    public static WeakReference<C5241w> f29952d;

    /* renamed from: a */
    public final SharedPreferences f29953a;

    /* renamed from: b */
    public C5239u f29954b;

    /* renamed from: c */
    public final Executor f29955c;

    public C5241w(SharedPreferences sharedPreferences, Executor executor) {
        this.f29955c = executor;
        this.f29953a = sharedPreferences;
    }

    /* renamed from: a */
    public static C5241w m26130a(Context context, Executor executor) {
        synchronized (C5241w.class) {
            try {
                WeakReference<C5241w> weakReference = f29952d;
                C5241w c5241w = weakReference != null ? weakReference.get() : null;
                if (c5241w != null) {
                    return c5241w;
                }
                C5241w c5241w2 = new C5241w(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c5241w2.m26132c();
                f29952d = new WeakReference<>(c5241w2);
                return c5241w2;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public C5240v m26131b() {
        C5240v m26125a;
        synchronized (this) {
            m26125a = C5240v.m26125a(this.f29954b.m26120e());
        }
        return m26125a;
    }

    /* renamed from: c */
    public final void m26132c() {
        synchronized (this) {
            this.f29954b = C5239u.m26116c(this.f29953a, "topic_operation_queue", ",", this.f29955c);
        }
    }

    /* renamed from: d */
    public boolean m26133d(C5240v c5240v) {
        boolean m26121f;
        synchronized (this) {
            m26121f = this.f29954b.m26121f(c5240v.m26129e());
        }
        return m26121f;
    }
}
