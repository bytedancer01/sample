package p350u9;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.ActivityC0416e;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.google.android.gms.common.api.GoogleApiActivity;
import la.C5831e;
import p030c0.C0964r;
import p060da.C4410i;
import p060da.C4414m;
import p097fa.C4791b;
import p184k9.C5533a;
import p184k9.C5534b;
import p354ue.C9169n;
import p383w9.AbstractC9494m1;
import p383w9.C9499n1;
import p383w9.InterfaceC9467h;
import p422y9.AbstractDialogInterfaceOnClickListenerC9903d0;
import p422y9.C9894a0;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/f.class
 */
/* renamed from: u9.f */
/* loaded from: combined.jar:classes2.jar:u9/f.class */
public class C8812f extends C8814g {

    /* renamed from: c */
    public String f40844c;

    /* renamed from: e */
    public static final Object f40842e = new Object();

    /* renamed from: f */
    public static final C8812f f40843f = new C8812f();

    /* renamed from: d */
    public static final int f40841d = C8814g.f40848a;

    /* renamed from: q */
    public static C8812f m37675q() {
        return f40843f;
    }

    /* renamed from: A */
    public final boolean m37676A(Context context, C8804b c8804b, int i10) {
        PendingIntent m37684p;
        if (C4791b.m24241a(context) || (m37684p = m37684p(context, c8804b)) == null) {
            return false;
        }
        m37691x(context, c8804b.m37659P(), null, C5831e.m28418a(context, 0, GoogleApiActivity.m13104a(context, m37684p, i10, true), C5831e.f32453a | 134217728));
        return true;
    }

    @Override // p350u9.C8814g
    /* renamed from: d */
    public Intent mo37677d(Context context, int i10, String str) {
        return super.mo37677d(context, i10, str);
    }

    @Override // p350u9.C8814g
    /* renamed from: e */
    public PendingIntent mo37678e(Context context, int i10, int i11) {
        return super.mo37678e(context, i10, i11);
    }

    @Override // p350u9.C8814g
    /* renamed from: g */
    public final String mo37679g(int i10) {
        return super.mo37679g(i10);
    }

    @Override // p350u9.C8814g
    /* renamed from: i */
    public int mo37680i(Context context) {
        return super.mo37680i(context);
    }

    @Override // p350u9.C8814g
    /* renamed from: j */
    public int mo37681j(Context context, int i10) {
        return super.mo37681j(context, i10);
    }

    @Override // p350u9.C8814g
    /* renamed from: m */
    public final boolean mo37682m(int i10) {
        return super.mo37682m(i10);
    }

    /* renamed from: o */
    public Dialog m37683o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m37687t(activity, i10, AbstractDialogInterfaceOnClickListenerC9903d0.m41780b(activity, mo37677d(activity, i10, "d"), i11), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent m37684p(Context context, C8804b c8804b) {
        return c8804b.m37662S() ? c8804b.m37661R() : mo37678e(context, c8804b.m37659P(), 0);
    }

    /* renamed from: r */
    public boolean m37685r(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m37683o = m37683o(activity, i10, i11, onCancelListener);
        if (m37683o == null) {
            return false;
        }
        m37690w(activity, m37683o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void m37686s(Context context, int i10) {
        m37691x(context, i10, null, m37701f(context, i10, 0, C9169n.f41939b));
    }

    /* renamed from: t */
    public final Dialog m37687t(Context context, int i10, AbstractDialogInterfaceOnClickListenerC9903d0 abstractDialogInterfaceOnClickListenerC9903d0, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        AlertDialog.Builder builder2 = builder;
        if (builder == null) {
            builder2 = new AlertDialog.Builder(context);
        }
        builder2.setMessage(C9894a0.m41755d(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String m41754c = C9894a0.m41754c(context, i10);
        if (m41754c != null) {
            builder2.setPositiveButton(m41754c, abstractDialogInterfaceOnClickListenerC9903d0);
        }
        String m41758g = C9894a0.m41758g(context, i10);
        if (m41758g != null) {
            builder2.setTitle(m41758g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder2.create();
    }

    /* renamed from: u */
    public final Dialog m37688u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C9894a0.m41755d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m37690w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: v */
    public final C9499n1 m37689v(Context context, AbstractC9494m1 abstractC9494m1) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C9499n1 c9499n1 = new C9499n1(abstractC9494m1);
        context.registerReceiver(c9499n1, intentFilter);
        c9499n1.m39973a(context);
        if (m37703l(context, "com.google.android.gms")) {
            return c9499n1;
        }
        abstractC9494m1.mo39951a();
        c9499n1.m39974b();
        return null;
    }

    /* renamed from: w */
    public final void m37690w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0416e) {
                C8827n.m37730N(dialog, onCancelListener).mo2024M(((ActivityC0416e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError e10) {
        }
        DialogFragmentC8806c.m37671a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: x */
    public final void m37691x(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        NotificationChannel notificationChannel;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m37692y(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m41757f = C9894a0.m41757f(context, i10);
        String m41756e = C9894a0.m41756e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C9935o.m41850j(context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        C0964r.e m5766F = new C0964r.e(context).m5792w(true).m5777h(true).m5783n(m41757f).m5766F(new C0964r.c().m5758h(m41756e));
        if (C4410i.m22442c(context)) {
            C9935o.m41853m(C4414m.m22454e());
            m5766F.m5764D(context.getApplicationInfo().icon).m5761A(2);
            if (C4410i.m22443d(context)) {
                m5766F.m5771a(C5533a.f31593a, resources.getString(C5534b.f31608o), pendingIntent);
            } else {
                m5766F.m5781l(pendingIntent);
            }
        } else {
            m5766F.m5764D(R.drawable.stat_sys_warning).m5767G(resources.getString(C5534b.f31601h)).m5770J(System.currentTimeMillis()).m5781l(pendingIntent).m5782m(m41756e);
        }
        if (C4414m.m22458i()) {
            C9935o.m41853m(C4414m.m22458i());
            synchronized (f40842e) {
                str2 = this.f40844c;
            }
            String str3 = str2;
            if (str2 == null) {
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m41753b = C9894a0.m41753b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m41753b, 4));
                    str3 = "com.google.android.gms.availability";
                } else {
                    str3 = "com.google.android.gms.availability";
                    if (!m41753b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(m41753b);
                        notificationManager.createNotificationChannel(notificationChannel);
                        str3 = "com.google.android.gms.availability";
                    }
                }
            }
            m5766F.m5778i(str3);
        }
        Notification m5773c = m5766F.m5773c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C8822k.f40858b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, m5773c);
    }

    /* renamed from: y */
    public final void m37692y(Context context) {
        new HandlerC8829p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: z */
    public final boolean m37693z(Activity activity, InterfaceC9467h interfaceC9467h, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m37687t = m37687t(activity, i10, AbstractDialogInterfaceOnClickListenerC9903d0.m41781c(interfaceC9467h, mo37677d(activity, i10, "d"), 2), onCancelListener);
        if (m37687t == null) {
            return false;
        }
        m37690w(activity, m37687t, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
