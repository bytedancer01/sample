package p335t9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import na.C6757a;
import na.C6762f;
import p079ea.ThreadFactoryC4694b;
import za.AbstractC10144i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/i.class
 */
/* renamed from: t9.i */
/* loaded from: combined.jar:classes2.jar:t9/i.class */
public final class C8658i {

    /* renamed from: e */
    public static C8658i f40417e;

    /* renamed from: a */
    public final Context f40418a;

    /* renamed from: b */
    public final ScheduledExecutorService f40419b;

    /* renamed from: c */
    public ServiceConnectionC8659j f40420c = new ServiceConnectionC8659j(this);

    /* renamed from: d */
    public int f40421d = 1;

    public C8658i(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f40419b = scheduledExecutorService;
        this.f40418a = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C8658i m37147c(Context context) {
        C8658i c8658i;
        synchronized (C8658i.class) {
            try {
                if (f40417e == null) {
                    f40417e = new C8658i(context, C6757a.m31075a().mo31077b(1, new ThreadFactoryC4694b("MessengerIpcClient"), C6762f.f35242b));
                }
                c8658i = f40417e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8658i;
    }

    /* renamed from: a */
    public final int m37149a() {
        int i10;
        synchronized (this) {
            i10 = this.f40421d;
            this.f40421d = i10 + 1;
        }
        return i10;
    }

    /* renamed from: d */
    public final AbstractC10144i<Void> m37150d(int i10, Bundle bundle) {
        return m37151e(new C8667r(m37149a(), 2, bundle));
    }

    /* renamed from: e */
    public final <T> AbstractC10144i<T> m37151e(AbstractC8670u<T> abstractC8670u) {
        AbstractC10144i<T> m42578a;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(abstractC8670u);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
                sb2.append("Queueing ");
                sb2.append(valueOf);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            if (!this.f40420c.m37157e(abstractC8670u)) {
                ServiceConnectionC8659j serviceConnectionC8659j = new ServiceConnectionC8659j(this);
                this.f40420c = serviceConnectionC8659j;
                serviceConnectionC8659j.m37157e(abstractC8670u);
            }
            m42578a = abstractC8670u.f40440b.m42578a();
        }
        return m42578a;
    }

    /* renamed from: g */
    public final AbstractC10144i<Bundle> m37152g(int i10, Bundle bundle) {
        return m37151e(new C8672w(m37149a(), 1, bundle));
    }
}
