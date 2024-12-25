package p135hh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/w.class
 */
/* renamed from: hh.w */
/* loaded from: combined.jar:classes2.jar:hh/w.class */
public class C5115w {

    /* renamed from: f */
    public static C5115w f29375f;

    /* renamed from: c */
    public Context f29378c;

    /* renamed from: a */
    public String f29376a = "org.torproject.android.intent.extra.SOCKS_PROXY_HOST";

    /* renamed from: b */
    public String f29377b = "org.torproject.android.intent.extra.SOCKS_PROXY_PORT";

    /* renamed from: d */
    public Set<b> f29379d = new HashSet();

    /* renamed from: e */
    public BroadcastReceiver f29380e = new a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/w$a.class
     */
    /* renamed from: hh.w$a */
    /* loaded from: combined.jar:classes2.jar:hh/w$a.class */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        public final C5115w f29381a;

        public a(C5115w c5115w) {
            this.f29381a = c5115w;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), "org.torproject.android.intent.action.STATUS")) {
                Iterator it = this.f29381a.f29379d.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).mo25642b(intent);
                }
                String stringExtra = intent.getStringExtra("org.torproject.android.intent.extra.STATUS");
                if (!TextUtils.equals(stringExtra, "ON")) {
                    if (TextUtils.equals(stringExtra, "STARTS_DISABLED")) {
                        Iterator it2 = this.f29381a.f29379d.iterator();
                        while (it2.hasNext()) {
                            ((b) it2.next()).mo25644d(intent);
                        }
                        return;
                    }
                    return;
                }
                int intExtra = intent.getIntExtra(this.f29381a.f29377b, 9050);
                String stringExtra2 = intent.getStringExtra(this.f29381a.f29376a);
                String str = stringExtra2;
                if (TextUtils.isEmpty(stringExtra2)) {
                    str = "127.0.0.1";
                }
                Iterator it3 = this.f29381a.f29379d.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).mo25643c(intent, str, intExtra);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/w$b.class
     */
    /* renamed from: hh.w$b */
    /* loaded from: combined.jar:classes2.jar:hh/w$b.class */
    public interface b {
        /* renamed from: a */
        void mo25641a();

        /* renamed from: b */
        void mo25642b(Intent intent);

        /* renamed from: c */
        void mo25643c(Intent intent, String str, int i10);

        /* renamed from: d */
        void mo25644d(Intent intent);
    }

    /* renamed from: c */
    public static boolean m25646c(Context context) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(m25648e(context), 0);
        boolean z10 = false;
        if (queryBroadcastReceivers != null) {
            z10 = false;
            if (queryBroadcastReceivers.size() > 0) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: d */
    public static C5115w m25647d(C5110r c5110r) {
        if (f29375f == null) {
            f29375f = new C5115w();
        }
        return f29375f;
    }

    /* renamed from: e */
    public static Intent m25648e(Context context) {
        Intent intent = new Intent("org.torproject.android.intent.action.START");
        intent.setPackage("org.torproject.android");
        intent.putExtra("org.torproject.android.intent.extra.PACKAGE_NAME", context.getPackageName());
        return intent;
    }

    /* renamed from: b */
    public C5115w m25649b(Context context, b bVar) {
        synchronized (this) {
            if (this.f29379d.size() == 0) {
                context.getApplicationContext().registerReceiver(this.f29380e, new IntentFilter("org.torproject.android.intent.action.STATUS"));
                this.f29378c = context.getApplicationContext();
            }
            if (!m25646c(context)) {
                bVar.mo25641a();
            }
            this.f29379d.add(bVar);
        }
        return this;
    }

    /* renamed from: f */
    public void m25650f(b bVar) {
        synchronized (this) {
            this.f29379d.remove(bVar);
            if (this.f29379d.size() == 0) {
                this.f29378c.unregisterReceiver(this.f29380e);
            }
        }
    }

    /* renamed from: g */
    public void m25651g() {
        Context context = this.f29378c;
        context.sendBroadcast(m25648e(context));
    }
}
