package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p071e2.AbstractC4582k;
import p071e2.C4576e;
import p089f2.C4759i;
import p089f2.InterfaceC4752b;
import p158j2.C5282d;
import p158j2.InterfaceC5281c;
import p223n2.C6636p;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/impl/foreground/a.class
 */
/* renamed from: androidx.work.impl.foreground.a */
/* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/a.class */
public class C0770a implements InterfaceC5281c, InterfaceC4752b {

    /* renamed from: l */
    public static final String f5272l = AbstractC4582k.m23128f("SystemFgDispatcher");

    /* renamed from: b */
    public Context f5273b;

    /* renamed from: c */
    public C4759i f5274c;

    /* renamed from: d */
    public final InterfaceC7748a f5275d;

    /* renamed from: e */
    public final Object f5276e = new Object();

    /* renamed from: f */
    public String f5277f;

    /* renamed from: g */
    public final Map<String, C4576e> f5278g;

    /* renamed from: h */
    public final Map<String, C6636p> f5279h;

    /* renamed from: i */
    public final Set<C6636p> f5280i;

    /* renamed from: j */
    public final C5282d f5281j;

    /* renamed from: k */
    public b f5282k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/foreground/a$a.class
     */
    /* renamed from: androidx.work.impl.foreground.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final WorkDatabase f5283b;

        /* renamed from: c */
        public final String f5284c;

        /* renamed from: d */
        public final C0770a f5285d;

        public a(C0770a c0770a, WorkDatabase workDatabase, String str) {
            this.f5285d = c0770a;
            this.f5283b = workDatabase;
            this.f5284c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6636p mo30599g = this.f5283b.mo4891B().mo30599g(this.f5284c);
            if (mo30599g == null || !mo30599g.m30588b()) {
                return;
            }
            synchronized (this.f5285d.f5276e) {
                this.f5285d.f5279h.put(this.f5284c, mo30599g);
                this.f5285d.f5280i.add(mo30599g);
                C0770a c0770a = this.f5285d;
                c0770a.f5281j.m26369d(c0770a.f5280i);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/work/impl/foreground/a$b.class
     */
    /* renamed from: androidx.work.impl.foreground.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/work/impl/foreground/a$b.class */
    public interface b {
        /* renamed from: a */
        void mo4960a(int i10, Notification notification);

        /* renamed from: c */
        void mo4961c(int i10, int i11, Notification notification);

        /* renamed from: d */
        void mo4962d(int i10);

        void stop();
    }

    public C0770a(Context context) {
        this.f5273b = context;
        C4759i m24111m = C4759i.m24111m(context);
        this.f5274c = m24111m;
        InterfaceC7748a m24120r = m24111m.m24120r();
        this.f5275d = m24120r;
        this.f5277f = null;
        this.f5278g = new LinkedHashMap();
        this.f5280i = new HashSet();
        this.f5279h = new HashMap();
        this.f5281j = new C5282d(this.f5273b, m24120r, this);
        this.f5274c.m24117o().m24074c(this);
    }

    /* renamed from: a */
    public static Intent m4964a(Context context, String str, C4576e c4576e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c4576e.m23115c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4576e.m23113a());
        intent.putExtra("KEY_NOTIFICATION", c4576e.m23114b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m4965c(Context context, String str, C4576e c4576e) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c4576e.m23115c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4576e.m23113a());
        intent.putExtra("KEY_NOTIFICATION", c4576e.m23114b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m4966d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: b */
    public void mo4942b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            AbstractC4582k.m23126c().mo23129a(f5272l, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f5274c.m24127y(str);
        }
    }

    @Override // p089f2.InterfaceC4752b
    /* renamed from: e */
    public void mo4931e(String str, boolean z10) {
        Map.Entry<String, C4576e> next;
        synchronized (this.f5276e) {
            C6636p remove = this.f5279h.remove(str);
            if (remove != null ? this.f5280i.remove(remove) : false) {
                this.f5281j.m26369d(this.f5280i);
            }
        }
        C4576e remove2 = this.f5278g.remove(str);
        if (str.equals(this.f5277f) && this.f5278g.size() > 0) {
            Iterator<Map.Entry<String, C4576e>> it = this.f5278g.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f5277f = next.getKey();
            if (this.f5282k != null) {
                C4576e value = next.getValue();
                this.f5282k.mo4961c(value.m23115c(), value.m23113a(), value.m23114b());
                this.f5282k.mo4962d(value.m23115c());
            }
        }
        b bVar = this.f5282k;
        if (remove2 == null || bVar == null) {
            return;
        }
        AbstractC4582k.m23126c().mo23129a(f5272l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.m23115c()), str, Integer.valueOf(remove2.m23113a())), new Throwable[0]);
        bVar.mo4962d(remove2.m23115c());
    }

    @Override // p158j2.InterfaceC5281c
    /* renamed from: f */
    public void mo4945f(List<String> list) {
    }

    /* renamed from: g */
    public final void m4967g(Intent intent) {
        AbstractC4582k.m23126c().mo23131d(f5272l, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f5274c.m24112h(UUID.fromString(stringExtra));
    }

    /* renamed from: h */
    public final void m4968h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC4582k.m23126c().mo23129a(f5272l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f5282k == null) {
            return;
        }
        this.f5278g.put(stringExtra, new C4576e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f5277f)) {
            this.f5277f = stringExtra;
            this.f5282k.mo4961c(intExtra, intExtra2, notification);
            return;
        }
        this.f5282k.mo4960a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, C4576e>> it = this.f5278g.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= it.next().getValue().m23113a();
        }
        C4576e c4576e = this.f5278g.get(this.f5277f);
        if (c4576e != null) {
            this.f5282k.mo4961c(c4576e.m23115c(), i10, c4576e.m23114b());
        }
    }

    /* renamed from: i */
    public final void m4969i(Intent intent) {
        AbstractC4582k.m23126c().mo23131d(f5272l, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f5275d.mo33902b(new a(this, this.f5274c.m24119q(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: j */
    public void m4970j(Intent intent) {
        AbstractC4582k.m23126c().mo23131d(f5272l, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f5282k;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* renamed from: k */
    public void m4971k() {
        this.f5282k = null;
        synchronized (this.f5276e) {
            this.f5281j.m26370e();
        }
        this.f5274c.m24117o().m24078i(this);
    }

    /* renamed from: l */
    public void m4972l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m4969i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m4967g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    m4970j(intent);
                    return;
                }
                return;
            }
        }
        m4968h(intent);
    }

    /* renamed from: m */
    public void m4973m(b bVar) {
        if (this.f5282k != null) {
            AbstractC4582k.m23126c().mo23130b(f5272l, "A callback already exists.", new Throwable[0]);
        } else {
            this.f5282k = bVar;
        }
    }
}
