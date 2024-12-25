package p335t9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p294r.C7936i;
import p335t9.C8654e;
import za.AbstractC10144i;
import za.C10146j;
import za.C10148l;
import za.InterfaceC10128a;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/d.class
 */
/* renamed from: t9.d */
/* loaded from: combined.jar:classes2.jar:t9/d.class */
public class C8652d {

    /* renamed from: h */
    public static int f40399h;

    /* renamed from: i */
    public static PendingIntent f40400i;

    /* renamed from: j */
    public static final Executor f40401j = ExecutorC8653d0.f40409b;

    /* renamed from: b */
    public final Context f40403b;

    /* renamed from: c */
    public final C8671v f40404c;

    /* renamed from: d */
    public final ScheduledExecutorService f40405d;

    /* renamed from: f */
    public Messenger f40407f;

    /* renamed from: g */
    public C8654e f40408g;

    /* renamed from: a */
    public final C7936i<String, C10146j<Bundle>> f40402a = new C7936i<>();

    /* renamed from: e */
    public Messenger f40406e = new Messenger(new HandlerC8651c0(this, Looper.getMainLooper()));

    public C8652d(Context context) {
        this.f40403b = context;
        this.f40404c = new C8671v(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f40405d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static final /* synthetic */ Bundle m37131b(AbstractC10144i abstractC10144i) {
        if (abstractC10144i.mo42567p()) {
            return (Bundle) abstractC10144i.mo42563l();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(abstractC10144i.mo42562k());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", abstractC10144i.mo42562k());
    }

    /* renamed from: c */
    public static String m37132c() {
        String num;
        synchronized (C8652d.class) {
            try {
                int i10 = f40399h;
                f40399h = i10 + 1;
                num = Integer.toString(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return num;
    }

    /* renamed from: d */
    public static final /* synthetic */ AbstractC10144i m37133d(Bundle bundle) {
        return m37137l(bundle) ? C10148l.m42587e(null) : C10148l.m42587e(bundle);
    }

    /* renamed from: f */
    public static void m37134f(Context context, Intent intent) {
        synchronized (C8652d.class) {
            try {
                if (f40400i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f40400i = PendingIntent.getBroadcast(context, 0, intent2, 0);
                }
                intent.putExtra("app", f40400i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ void m37136k(C10146j c10146j) {
        if (c10146j.m42581d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    /* renamed from: l */
    public static boolean m37137l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public AbstractC10144i<Bundle> m37138a(final Bundle bundle) {
        boolean z10 = true;
        if (this.f40404c.m37167c() >= 12000000) {
            return C8658i.m37147c(this.f40403b).m37152g(1, bundle).mo42559h(f40401j, C8673x.f40446a);
        }
        if (this.f40404c.m37165a() == 0) {
            z10 = false;
        }
        return !z10 ? C10148l.m42586d(new IOException("MISSING_INSTANCEID_SERVICE")) : m37143m(bundle).mo42561j(f40401j, new InterfaceC10128a(this, bundle) { // from class: t9.z

            /* renamed from: a */
            public final C8652d f40448a;

            /* renamed from: b */
            public final Bundle f40449b;

            {
                this.f40448a = this;
                this.f40449b = bundle;
            }

            @Override // za.InterfaceC10128a
            /* renamed from: a */
            public final Object mo26105a(AbstractC10144i abstractC10144i) {
                return this.f40448a.m37139e(this.f40449b, abstractC10144i);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ AbstractC10144i m37139e(Bundle bundle, AbstractC10144i abstractC10144i) {
        if (abstractC10144i.mo42567p() && m37137l((Bundle) abstractC10144i.mo42563l())) {
            return m37143m(bundle).mo42568q(f40401j, C8647a0.f40393a);
        }
        return abstractC10144i;
    }

    /* renamed from: g */
    public final void m37140g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C8654e.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C8654e) {
                        this.f40408g = (C8654e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f40407f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                String str = stringExtra;
                if (stringExtra == null) {
                    str = intent2.getStringExtra("unregistered");
                }
                if (str != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", str.length() != 0 ? "Unexpected response string: ".concat(str) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        m37141h(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                    sb2.append("Unexpected response, no error or registration id ");
                    sb2.append(valueOf2);
                    Log.w("Rpc", sb2.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f40402a) {
                        for (int i10 = 0; i10 < this.f40402a.size(); i10++) {
                            m37141h(this.f40402a.m34439j(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str2 = split[2];
                String str3 = split[3];
                String str4 = str3;
                if (str3.startsWith(":")) {
                    str4 = str3.substring(1);
                }
                m37141h(str2, intent2.putExtra("error", str4).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: h */
    public final void m37141h(String str, Bundle bundle) {
        synchronized (this.f40402a) {
            C10146j<Bundle> remove = this.f40402a.remove(str);
            if (remove != null) {
                remove.m42580c(bundle);
            } else {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            }
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void m37142i(String str, ScheduledFuture scheduledFuture, AbstractC10144i abstractC10144i) {
        synchronized (this.f40402a) {
            this.f40402a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: m */
    public final AbstractC10144i<Bundle> m37143m(Bundle bundle) {
        final String m37132c = m37132c();
        final C10146j<Bundle> c10146j = new C10146j<>();
        synchronized (this.f40402a) {
            this.f40402a.put(m37132c, c10146j);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f40404c.m37165a() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        m37134f(this.f40403b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m37132c).length() + 5);
        sb2.append("|ID|");
        sb2.append(m37132c);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f40406e);
        if (this.f40407f != null || this.f40408g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f40407f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f40408g.m37145c(obtain);
                }
            } catch (RemoteException e10) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f40405d.schedule(new Runnable(c10146j) { // from class: t9.y

                /* renamed from: b */
                public final C10146j f40447b;

                {
                    this.f40447b = c10146j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C8652d.m37136k(this.f40447b);
                }
            }, 30L, TimeUnit.SECONDS);
            c10146j.m42578a().mo42553b(f40401j, new InterfaceC10134d(this, m37132c, schedule) { // from class: t9.b0

                /* renamed from: a */
                public final C8652d f40395a;

                /* renamed from: b */
                public final String f40396b;

                /* renamed from: c */
                public final ScheduledFuture f40397c;

                {
                    this.f40395a = this;
                    this.f40396b = m37132c;
                    this.f40397c = schedule;
                }

                @Override // za.InterfaceC10134d
                /* renamed from: a */
                public final void mo26091a(AbstractC10144i abstractC10144i) {
                    this.f40395a.m37142i(this.f40396b, this.f40397c, abstractC10144i);
                }
            });
            return c10146j.m42578a();
        }
        if (this.f40404c.m37165a() == 2) {
            this.f40403b.sendBroadcast(intent);
        } else {
            this.f40403b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f40405d.schedule(new Runnable(c10146j) { // from class: t9.y

            /* renamed from: b */
            public final C10146j f40447b;

            {
                this.f40447b = c10146j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C8652d.m37136k(this.f40447b);
            }
        }, 30L, TimeUnit.SECONDS);
        c10146j.m42578a().mo42553b(f40401j, new InterfaceC10134d(this, m37132c, schedule2) { // from class: t9.b0

            /* renamed from: a */
            public final C8652d f40395a;

            /* renamed from: b */
            public final String f40396b;

            /* renamed from: c */
            public final ScheduledFuture f40397c;

            {
                this.f40395a = this;
                this.f40396b = m37132c;
                this.f40397c = schedule2;
            }

            @Override // za.InterfaceC10134d
            /* renamed from: a */
            public final void mo26091a(AbstractC10144i abstractC10144i) {
                this.f40395a.m37142i(this.f40396b, this.f40397c, abstractC10144i);
            }
        });
        return c10146j.m42578a();
    }
}
