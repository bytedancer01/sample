package p244o9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.C6126ff;
import ma.C6364r1;
import ma.EnumC6057c9;
import p030c0.C0964r;
import p030c0.C0969t0;
import p060da.C4414m;
import p157j1.C5278b;
import p216m9.C5938b;
import p216m9.C5941c;
import p216m9.C5980p;
import p230n9.AbstractC6716g;
import p230n9.C6698a;
import p230n9.C6701b;
import p230n9.C6704c;
import p230n9.C6713f;
import p230n9.C6719h;
import p230n9.InterfaceC6752x0;
import p304r9.C8015b;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:o9/o.class
 */
/* renamed from: o9.o */
/* loaded from: combined.jar:classes2.jar:o9/o.class */
public final class C6945o {

    /* renamed from: y */
    public static final C8015b f35875y = new C8015b("MediaNotificationProxy");

    /* renamed from: a */
    public final Context f35876a;

    /* renamed from: b */
    public final NotificationManager f35877b;

    /* renamed from: c */
    public final C5938b f35878c;

    /* renamed from: d */
    public final C6719h f35879d;

    /* renamed from: e */
    public final C6704c f35880e;

    /* renamed from: f */
    public final ComponentName f35881f;

    /* renamed from: g */
    public final ComponentName f35882g;

    /* renamed from: h */
    public List f35883h = new ArrayList();

    /* renamed from: i */
    public int[] f35884i;

    /* renamed from: j */
    public final long f35885j;

    /* renamed from: k */
    public final C6932b f35886k;

    /* renamed from: l */
    public final C6701b f35887l;

    /* renamed from: m */
    public final Resources f35888m;

    /* renamed from: n */
    public C6943m f35889n;

    /* renamed from: o */
    public C6944n f35890o;

    /* renamed from: p */
    public Notification f35891p;

    /* renamed from: q */
    public C0964r.a f35892q;

    /* renamed from: r */
    public C0964r.a f35893r;

    /* renamed from: s */
    public C0964r.a f35894s;

    /* renamed from: t */
    public C0964r.a f35895t;

    /* renamed from: u */
    public C0964r.a f35896u;

    /* renamed from: v */
    public C0964r.a f35897v;

    /* renamed from: w */
    public C0964r.a f35898w;

    /* renamed from: x */
    public C0964r.a f35899x;

    public C6945o(Context context) {
        this.f35876a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        this.f35877b = notificationManager;
        C5938b c5938b = (C5938b) C9935o.m41850j(C5938b.m29234d());
        this.f35878c = c5938b;
        C6698a c6698a = (C6698a) C9935o.m41850j(((C5941c) C9935o.m41850j(c5938b.m29241a())).m29251P());
        C6719h c6719h = (C6719h) C9935o.m41850j(c6698a.m30860T());
        this.f35879d = c6719h;
        this.f35880e = c6698a.m30857Q();
        Resources resources = context.getResources();
        this.f35888m = resources;
        this.f35881f = new ComponentName(context.getApplicationContext(), c6698a.m30858R());
        this.f35882g = !TextUtils.isEmpty(c6719h.m30943h0()) ? new ComponentName(context.getApplicationContext(), c6719h.m30943h0()) : null;
        this.f35885j = c6719h.m30939d0();
        int dimensionPixelSize = resources.getDimensionPixelSize(c6719h.m30948m0());
        C6701b c6701b = new C6701b(1, dimensionPixelSize, dimensionPixelSize);
        this.f35887l = c6701b;
        this.f35886k = new C6932b(context.getApplicationContext(), c6701b);
        if (C4414m.m22458i() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", ((Context) C9935o.m41850j(context)).getResources().getString(C5980p.f33548F), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        C6126ff.m29603d(EnumC6057c9.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* renamed from: e */
    public static boolean m31911e(C5941c c5941c) {
        C6719h m30860T;
        C6698a m29251P = c5941c.m29251P();
        if (m29251P == null || (m30860T = m29251P.m30860T()) == null) {
            return false;
        }
        InterfaceC6752x0 m30956u0 = m30860T.m30956u0();
        if (m30956u0 == null) {
            return true;
        }
        List m31945f = C6953w.m31945f(m30956u0);
        int[] m31946g = C6953w.m31946g(m30956u0);
        int size = m31945f == null ? 0 : m31945f.size();
        if (m31945f == null || m31945f.isEmpty()) {
            f35875y.m34875c(AbstractC6716g.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
            return false;
        }
        if (m31945f.size() > 5) {
            f35875y.m34875c(AbstractC6716g.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
            return false;
        }
        if (m31946g == null || (m31946g.length) == 0) {
            f35875y.m34875c(AbstractC6716g.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
            return false;
        }
        for (int i10 : m31946g) {
            if (i10 < 0 || i10 >= size) {
                f35875y.m34875c(AbstractC6716g.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m31912c() {
        this.f35886k.m31900a();
        NotificationManager notificationManager = this.f35877b;
        if (notificationManager != null) {
            notificationManager.cancel("castMediaNotification", 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31913d(com.google.android.gms.cast.CastDevice r11, p230n9.C6721i r12, android.support.v4.media.session.MediaSessionCompat r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p244o9.C6945o.m31913d(com.google.android.gms.cast.CastDevice, n9.i, android.support.v4.media.session.MediaSessionCompat, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: f */
    public final C0964r.a m31914f(String str) {
        boolean z10;
        C0964r.a aVar;
        int m30932W;
        int m30949n0;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    z10 = 4;
                    break;
                }
                z10 = -1;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    z10 = 5;
                    break;
                }
                z10 = -1;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    z10 = 6;
                    break;
                }
                z10 = -1;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
            case false:
                C6943m c6943m = this.f35889n;
                int i10 = c6943m.f35868c;
                if (c6943m.f35867b) {
                    if (this.f35893r == null) {
                        C6719h c6719h = this.f35879d;
                        if (i10 == 2) {
                            m30932W = c6719h.m30941f0();
                            m30949n0 = this.f35879d.m30942g0();
                        } else {
                            m30932W = c6719h.m30932W();
                            m30949n0 = this.f35879d.m30949n0();
                        }
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(this.f35881f);
                        this.f35893r = new C0964r.a.C10256a(m30932W, this.f35888m.getString(m30949n0), PendingIntent.getBroadcast(this.f35876a, 0, intent, C6364r1.f33992a)).m5747a();
                    }
                    aVar = this.f35893r;
                } else {
                    if (this.f35892q == null) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent2.setComponent(this.f35881f);
                        this.f35892q = new C0964r.a.C10256a(this.f35879d.m30933X(), this.f35888m.getString(this.f35879d.m30950o0()), PendingIntent.getBroadcast(this.f35876a, 0, intent2, C6364r1.f33992a)).m5747a();
                    }
                    aVar = this.f35892q;
                }
                return aVar;
            case true:
                boolean z11 = this.f35889n.f35871f;
                if (this.f35894s == null) {
                    PendingIntent pendingIntent = null;
                    if (z11) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(this.f35881f);
                        pendingIntent = PendingIntent.getBroadcast(this.f35876a, 0, intent3, C6364r1.f33992a);
                    }
                    this.f35894s = new C0964r.a.C10256a(this.f35879d.m30937b0(), this.f35888m.getString(this.f35879d.m30954s0()), pendingIntent).m5747a();
                }
                return this.f35894s;
            case true:
                boolean z12 = this.f35889n.f35872g;
                if (this.f35895t == null) {
                    PendingIntent pendingIntent2 = null;
                    if (z12) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(this.f35881f);
                        pendingIntent2 = PendingIntent.getBroadcast(this.f35876a, 0, intent4, C6364r1.f33992a);
                    }
                    this.f35895t = new C0964r.a.C10256a(this.f35879d.m30938c0(), this.f35888m.getString(this.f35879d.m30955t0()), pendingIntent2).m5747a();
                }
                return this.f35895t;
            case true:
                long j10 = this.f35885j;
                if (this.f35896u == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(this.f35881f);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                    this.f35896u = new C0964r.a.C10256a(C6953w.m31940a(this.f35879d, j10), this.f35888m.getString(C6953w.m31941b(this.f35879d, j10)), PendingIntent.getBroadcast(this.f35876a, 0, intent5, C6364r1.f33992a | 134217728)).m5747a();
                }
                return this.f35896u;
            case true:
                long j11 = this.f35885j;
                if (this.f35897v == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(this.f35881f);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j11);
                    this.f35897v = new C0964r.a.C10256a(C6953w.m31942c(this.f35879d, j11), this.f35888m.getString(C6953w.m31943d(this.f35879d, j11)), PendingIntent.getBroadcast(this.f35876a, 0, intent6, C6364r1.f33992a | 134217728)).m5747a();
                }
                return this.f35897v;
            case true:
                if (this.f35899x == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(this.f35881f);
                    this.f35899x = new C0964r.a.C10256a(this.f35879d.m30928S(), this.f35888m.getString(this.f35879d.m30944i0()), PendingIntent.getBroadcast(this.f35876a, 0, intent7, C6364r1.f33992a)).m5747a();
                }
                return this.f35899x;
            case true:
                if (this.f35898w == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(this.f35881f);
                    this.f35898w = new C0964r.a.C10256a(this.f35879d.m30928S(), this.f35888m.getString(this.f35879d.m30944i0(), ""), PendingIntent.getBroadcast(this.f35876a, 0, intent8, C6364r1.f33992a)).m5747a();
                }
                return this.f35898w;
            default:
                f35875y.m34875c("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* renamed from: g */
    public final void m31915g() {
        PendingIntent m5822q;
        C0964r.a m31914f;
        if (this.f35877b == null || this.f35889n == null) {
            return;
        }
        C6944n c6944n = this.f35890o;
        C0964r.e m5769I = new C0964r.e(this.f35876a, "cast_media_notification").m5790u(c6944n == null ? null : c6944n.f35874b).m5764D(this.f35879d.m30940e0()).m5783n(this.f35889n.f35869d).m5782m(this.f35888m.getString(this.f35879d.m30926Q(), this.f35889n.f35870e)).m5794y(true).m5763C(false).m5769I(1);
        ComponentName componentName = this.f35882g;
        if (componentName == null) {
            m5822q = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            C0969t0 m5815f = C0969t0.m5815f(this.f35876a);
            m5815f.m5817b(intent);
            m5822q = m5815f.m5822q(1, C6364r1.f33992a | 134217728);
        }
        if (m5822q != null) {
            m5769I.m5781l(m5822q);
        }
        InterfaceC6752x0 m30956u0 = this.f35879d.m30956u0();
        if (m30956u0 != null) {
            f35875y.m34873a("actionsProvider != null", new Object[0]);
            int[] m31946g = C6953w.m31946g(m30956u0);
            this.f35884i = m31946g == null ? null : (int[]) m31946g.clone();
            List<C6713f> m31945f = C6953w.m31945f(m30956u0);
            this.f35883h = new ArrayList();
            if (m31945f != null) {
                for (C6713f c6713f : m31945f) {
                    String m30912P = c6713f.m30912P();
                    if (m30912P.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || m30912P.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || m30912P.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || m30912P.equals(MediaIntentReceiver.ACTION_FORWARD) || m30912P.equals(MediaIntentReceiver.ACTION_REWIND) || m30912P.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || m30912P.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        m31914f = m31914f(c6713f.m30912P());
                    } else {
                        Intent intent2 = new Intent(c6713f.m30912P());
                        intent2.setComponent(this.f35881f);
                        m31914f = new C0964r.a.C10256a(c6713f.m30914R(), c6713f.m30913Q(), PendingIntent.getBroadcast(this.f35876a, 0, intent2, C6364r1.f33992a)).m5747a();
                    }
                    if (m31914f != null) {
                        this.f35883h.add(m31914f);
                    }
                }
            }
        } else {
            f35875y.m34873a("actionsProvider == null", new Object[0]);
            this.f35883h = new ArrayList();
            Iterator<String> it = this.f35879d.m30925P().iterator();
            while (it.hasNext()) {
                C0964r.a m31914f2 = m31914f(it.next());
                if (m31914f2 != null) {
                    this.f35883h.add(m31914f2);
                }
            }
            this.f35884i = (int[]) this.f35879d.m30927R().clone();
        }
        Iterator it2 = this.f35883h.iterator();
        while (it2.hasNext()) {
            m5769I.m5772b((C0964r.a) it2.next());
        }
        C5278b c5278b = new C5278b();
        int[] iArr = this.f35884i;
        if (iArr != null) {
            c5278b.m26360i(iArr);
        }
        MediaSessionCompat.Token token = this.f35889n.f35866a;
        if (token != null) {
            c5278b.m26359h(token);
        }
        m5769I.m5766F(c5278b);
        Notification m5773c = m5769I.m5773c();
        this.f35891p = m5773c;
        this.f35877b.notify("castMediaNotification", 1, m5773c);
    }
}
