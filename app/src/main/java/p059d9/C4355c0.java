package p059d9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.amazonaws.services.p045s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p059d9.C4355c0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/c0.class
 */
/* renamed from: d9.c0 */
/* loaded from: combined.jar:classes2.jar:d9/c0.class */
public final class C4355c0 {

    /* renamed from: e */
    public static C4355c0 f26547e;

    /* renamed from: a */
    public final Handler f26548a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<c>> f26549b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f26550c = new Object();

    /* renamed from: d */
    public int f26551d = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/c0$b.class
     */
    /* renamed from: d9.c0$b */
    /* loaded from: combined.jar:classes2.jar:d9/c0$b.class */
    public static final class b {

        /* renamed from: a */
        public static volatile boolean f26552a;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/c0$c.class
     */
    /* renamed from: d9.c0$c */
    /* loaded from: combined.jar:classes2.jar:d9/c0$c.class */
    public interface c {
        /* renamed from: a */
        void mo5397a(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/c0$d.class
     */
    /* renamed from: d9.c0$d */
    /* loaded from: combined.jar:classes2.jar:d9/c0$d.class */
    public final class d extends BroadcastReceiver {

        /* renamed from: a */
        public final C4355c0 f26553a;

        public d(C4355c0 c4355c0) {
            this.f26553a = c4355c0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m21922g = C4355c0.m21922g(context);
            int i10 = C4401z0.f26679a;
            if (i10 >= 29 && !b.f26552a && m21922g == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C4349a.m21882e((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, Constants.f7590MB);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException e10) {
                }
            }
            this.f26553a.m21927k(m21922g);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:d9/c0$e.class
     */
    /* renamed from: d9.c0$e */
    /* loaded from: combined.jar:classes2.jar:d9/c0$e.class */
    public class e extends PhoneStateListener {

        /* renamed from: a */
        public final C4355c0 f26554a;

        public e(C4355c0 c4355c0) {
            this.f26554a = c4355c0;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            this.f26554a.m21927k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            this.f26554a.m21927k(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public C4355c0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* renamed from: d */
    public static C4355c0 m21920d(Context context) {
        C4355c0 c4355c0;
        synchronized (C4355c0.class) {
            try {
                if (f26547e == null) {
                    f26547e = new C4355c0(context);
                }
                c4355c0 = f26547e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4355c0;
    }

    /* renamed from: e */
    public static int m21921e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return C4401z0.f26679a >= 29 ? 9 : 0;
        }
    }

    /* renamed from: g */
    public static int m21922g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            return 2;
                        }
                        if (type != 4 && type != 5) {
                            if (type != 6) {
                                return type != 9 ? 8 : 7;
                            }
                            return 5;
                        }
                    }
                    return m21921e(activeNetworkInfo);
                }
                i10 = 1;
            }
        } catch (SecurityException e10) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m21923h(c cVar) {
        cVar.mo5397a(m21924f());
    }

    /* renamed from: f */
    public int m21924f() {
        int i10;
        synchronized (this.f26550c) {
            i10 = this.f26551d;
        }
        return i10;
    }

    /* renamed from: i */
    public void m21925i(final c cVar) {
        m21926j();
        this.f26549b.add(new WeakReference<>(cVar));
        this.f26548a.post(new Runnable(this, cVar) { // from class: d9.b0

            /* renamed from: b */
            public final C4355c0 f26544b;

            /* renamed from: c */
            public final C4355c0.c f26545c;

            {
                this.f26544b = this;
                this.f26545c = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26544b.m21923h(this.f26545c);
            }
        });
    }

    /* renamed from: j */
    public final void m21926j() {
        Iterator<WeakReference<c>> it = this.f26549b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f26549b.remove(next);
            }
        }
    }

    /* renamed from: k */
    public final void m21927k(int i10) {
        synchronized (this.f26550c) {
            if (this.f26551d == i10) {
                return;
            }
            this.f26551d = i10;
            Iterator<WeakReference<c>> it = this.f26549b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.mo5397a(i10);
                } else {
                    this.f26549b.remove(next);
                }
            }
        }
    }
}
