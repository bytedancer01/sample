package p443zc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p060da.C4414m;
import za.AbstractC10144i;
import za.C10148l;
import za.InterfaceC10128a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/f.class
 */
/* renamed from: zc.f */
/* loaded from: combined.jar:classes2.jar:zc/f.class */
public class C10172f {

    /* renamed from: c */
    public static final Object f46619c = new Object();

    /* renamed from: d */
    public static ServiceConnectionC10169c0 f46620d;

    /* renamed from: a */
    public final Context f46621a;

    /* renamed from: b */
    public final Executor f46622b;

    public C10172f(Context context) {
        this.f46621a = context;
        this.f46622b = ExecutorC10164a.f46602b;
    }

    public C10172f(Context context, ExecutorService executorService) {
        this.f46621a = context;
        this.f46622b = executorService;
    }

    /* renamed from: a */
    public static AbstractC10144i<Integer> m42614a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return m42615b(context, "com.google.firebase.MESSAGING_EVENT").m42607c(intent).mo42559h(C10174h.m42622a(), C10170d.f46617a);
    }

    /* renamed from: b */
    public static ServiceConnectionC10169c0 m42615b(Context context, String str) {
        ServiceConnectionC10169c0 serviceConnectionC10169c0;
        synchronized (f46619c) {
            if (f46620d == null) {
                f46620d = new ServiceConnectionC10169c0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            serviceConnectionC10169c0 = f46620d;
        }
        return serviceConnectionC10169c0;
    }

    /* renamed from: c */
    public static final /* synthetic */ Integer m42616c(AbstractC10144i abstractC10144i) {
        return -1;
    }

    /* renamed from: e */
    public static final /* synthetic */ Integer m42618e(AbstractC10144i abstractC10144i) {
        return 403;
    }

    /* renamed from: f */
    public static final /* synthetic */ AbstractC10144i m42619f(Context context, Intent intent, AbstractC10144i abstractC10144i) {
        return (C4414m.m22458i() && ((Integer) abstractC10144i.mo42563l()).intValue() == 402) ? m42614a(context, intent).mo42559h(C10174h.m42622a(), C10171e.f46618a) : abstractC10144i;
    }

    /* renamed from: g */
    public AbstractC10144i<Integer> m42620g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m42621h(this.f46621a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    public AbstractC10144i<Integer> m42621h(final Context context, final Intent intent) {
        boolean z10 = false;
        if (C4414m.m22458i()) {
            z10 = false;
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                z10 = true;
            }
        }
        return (z10 && (intent.getFlags() & 268435456) == 0) ? m42614a(context, intent) : C10148l.m42585c(this.f46622b, new Callable(context, intent) { // from class: zc.b

            /* renamed from: a */
            public final Context f46604a;

            /* renamed from: b */
            public final Intent f46605b;

            {
                this.f46604a = context;
                this.f46605b = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C10189w.m42643b().m42649g(this.f46604a, this.f46605b));
                return valueOf;
            }
        }).mo42561j(this.f46622b, new InterfaceC10128a(context, intent) { // from class: zc.c

            /* renamed from: a */
            public final Context f46607a;

            /* renamed from: b */
            public final Intent f46608b;

            {
                this.f46607a = context;
                this.f46608b = intent;
            }

            @Override // za.InterfaceC10128a
            /* renamed from: a */
            public Object mo26105a(AbstractC10144i abstractC10144i) {
                return C10172f.m42619f(this.f46607a, this.f46608b, abstractC10144i);
            }
        });
    }
}
