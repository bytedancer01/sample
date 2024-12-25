package p420y7;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4357d0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p420y7.AbstractServiceC9875y;
import p420y7.C9870t;
import p439z7.C10067c;
import p439z7.InterfaceC10071g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/y.class
 */
/* renamed from: y7.y */
/* loaded from: combined.jar:classes2.jar:y7/y.class */
public abstract class AbstractServiceC9875y extends Service {

    /* renamed from: l */
    public static final HashMap<Class<? extends AbstractServiceC9875y>, b> f45323l = new HashMap<>();

    /* renamed from: b */
    public final c f45324b;

    /* renamed from: c */
    public final String f45325c;

    /* renamed from: d */
    public final int f45326d;

    /* renamed from: e */
    public final int f45327e;

    /* renamed from: f */
    public C9870t f45328f;

    /* renamed from: g */
    public int f45329g;

    /* renamed from: h */
    public boolean f45330h;

    /* renamed from: i */
    public boolean f45331i;

    /* renamed from: j */
    public boolean f45332j;

    /* renamed from: k */
    public boolean f45333k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/y$b.class
     */
    /* renamed from: y7.y$b */
    /* loaded from: combined.jar:classes2.jar:y7/y$b.class */
    public static final class b implements C9870t.d {

        /* renamed from: a */
        public final Context f45334a;

        /* renamed from: b */
        public final C9870t f45335b;

        /* renamed from: c */
        public final boolean f45336c;

        /* renamed from: d */
        public final InterfaceC10071g f45337d;

        /* renamed from: e */
        public final Class<? extends AbstractServiceC9875y> f45338e;

        /* renamed from: f */
        public AbstractServiceC9875y f45339f;

        public b(Context context, C9870t c9870t, boolean z10, InterfaceC10071g interfaceC10071g, Class<? extends AbstractServiceC9875y> cls) {
            this.f45334a = context;
            this.f45335b = c9870t;
            this.f45336c = z10;
            this.f45337d = interfaceC10071g;
            this.f45338e = cls;
            c9870t.m41471d(this);
            m41578o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m41573l(AbstractServiceC9875y abstractServiceC9875y) {
            abstractServiceC9875y.m41568u(this.f45335b.m41472e());
        }

        @Override // p420y7.C9870t.d
        /* renamed from: a */
        public void mo18030a(C9870t c9870t, C9849e c9849e, Exception exc) {
            AbstractServiceC9875y abstractServiceC9875y = this.f45339f;
            if (abstractServiceC9875y != null) {
                abstractServiceC9875y.m41566s(c9849e);
            }
            if (m41577n() && AbstractServiceC9875y.m41560r(c9849e.f45183b)) {
                C4392v.m22275i("DownloadService", "DownloadService wasn't running. Restarting.");
                m41576m();
            }
        }

        @Override // p420y7.C9870t.d
        /* renamed from: b */
        public /* synthetic */ void mo18031b(C9870t c9870t, C10067c c10067c, int i10) {
            C9872v.m41532e(this, c9870t, c10067c, i10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: c */
        public void mo18032c(C9870t c9870t, boolean z10) {
            if (!z10 && !c9870t.m41474g() && m41577n()) {
                List<C9849e> m41472e = c9870t.m41472e();
                int i10 = 0;
                while (true) {
                    if (i10 >= m41472e.size()) {
                        break;
                    }
                    if (m41472e.get(i10).f45183b == 0) {
                        m41576m();
                        break;
                    }
                    i10++;
                }
            }
            m41578o();
        }

        @Override // p420y7.C9870t.d
        /* renamed from: d */
        public void mo18033d(C9870t c9870t, C9849e c9849e) {
            AbstractServiceC9875y abstractServiceC9875y = this.f45339f;
            if (abstractServiceC9875y != null) {
                abstractServiceC9875y.m41567t(c9849e);
            }
        }

        @Override // p420y7.C9870t.d
        /* renamed from: e */
        public /* synthetic */ void mo18034e(C9870t c9870t, boolean z10) {
            C9872v.m41529b(this, c9870t, z10);
        }

        @Override // p420y7.C9870t.d
        /* renamed from: f */
        public final void mo18035f(C9870t c9870t) {
            AbstractServiceC9875y abstractServiceC9875y = this.f45339f;
            if (abstractServiceC9875y != null) {
                abstractServiceC9875y.m41564C();
            }
        }

        @Override // p420y7.C9870t.d
        /* renamed from: g */
        public void mo18036g(C9870t c9870t) {
            AbstractServiceC9875y abstractServiceC9875y = this.f45339f;
            if (abstractServiceC9875y != null) {
                abstractServiceC9875y.m41568u(c9870t.m41472e());
            }
        }

        /* renamed from: j */
        public void m41574j(final AbstractServiceC9875y abstractServiceC9875y) {
            C4349a.m21884g(this.f45339f == null);
            this.f45339f = abstractServiceC9875y;
            if (this.f45335b.m41478k()) {
                C4401z0.m22313A().postAtFrontOfQueue(new Runnable(this, abstractServiceC9875y) { // from class: y7.z

                    /* renamed from: b */
                    public final AbstractServiceC9875y.b f45346b;

                    /* renamed from: c */
                    public final AbstractServiceC9875y f45347c;

                    {
                        this.f45346b = this;
                        this.f45347c = abstractServiceC9875y;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45346b.m41573l(this.f45347c);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m41575k(AbstractServiceC9875y abstractServiceC9875y) {
            C4349a.m21884g(this.f45339f == abstractServiceC9875y);
            this.f45339f = null;
            if (this.f45337d == null || this.f45335b.m41479l()) {
                return;
            }
            this.f45337d.cancel();
        }

        /* renamed from: m */
        public final void m41576m() {
            if (this.f45336c) {
                C4401z0.m22362Y0(this.f45334a, AbstractServiceC9875y.m41558n(this.f45334a, this.f45338e, "com.google.android.exoplayer.downloadService.action.RESTART"));
            } else {
                try {
                    this.f45334a.startService(AbstractServiceC9875y.m41558n(this.f45334a, this.f45338e, "com.google.android.exoplayer.downloadService.action.INIT"));
                } catch (IllegalStateException e10) {
                    C4392v.m22275i("DownloadService", "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        /* renamed from: n */
        public final boolean m41577n() {
            AbstractServiceC9875y abstractServiceC9875y = this.f45339f;
            return abstractServiceC9875y == null || abstractServiceC9875y.m41565q();
        }

        /* renamed from: o */
        public final void m41578o() {
            if (this.f45337d == null) {
                return;
            }
            if (!this.f45335b.m41479l()) {
                this.f45337d.cancel();
                return;
            }
            String packageName = this.f45334a.getPackageName();
            if (this.f45337d.mo42361b(this.f45335b.m41475h(), packageName, "com.google.android.exoplayer.downloadService.action.RESTART")) {
                return;
            }
            C4392v.m22270d("DownloadService", "Scheduling downloads failed.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/y$c.class
     */
    /* renamed from: y7.y$c */
    /* loaded from: combined.jar:classes2.jar:y7/y$c.class */
    public final class c {

        /* renamed from: a */
        public final int f45340a;

        /* renamed from: b */
        public final long f45341b;

        /* renamed from: c */
        public final Handler f45342c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public boolean f45343d;

        /* renamed from: e */
        public boolean f45344e;

        /* renamed from: f */
        public final AbstractServiceC9875y f45345f;

        public c(AbstractServiceC9875y abstractServiceC9875y, int i10, long j10) {
            this.f45345f = abstractServiceC9875y;
            this.f45340a = i10;
            this.f45341b = j10;
        }

        /* renamed from: b */
        public void m41580b() {
            if (this.f45344e) {
                m41584f();
            }
        }

        /* renamed from: c */
        public void m41581c() {
            if (this.f45344e) {
                return;
            }
            m41584f();
        }

        /* renamed from: d */
        public void m41582d() {
            this.f45343d = true;
            m41584f();
        }

        /* renamed from: e */
        public void m41583e() {
            this.f45343d = false;
            this.f45342c.removeCallbacksAndMessages(null);
        }

        /* renamed from: f */
        public final void m41584f() {
            List<C9849e> m41472e = ((C9870t) C4349a.m21882e(this.f45345f.f45328f)).m41472e();
            AbstractServiceC9875y abstractServiceC9875y = this.f45345f;
            abstractServiceC9875y.startForeground(this.f45340a, abstractServiceC9875y.mo30434m(m41472e));
            this.f45344e = true;
            if (this.f45343d) {
                this.f45342c.removeCallbacksAndMessages(null);
                this.f45342c.postDelayed(new Runnable(this) { // from class: y7.a0

                    /* renamed from: b */
                    public final AbstractServiceC9875y.c f45170b;

                    {
                        this.f45170b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45170b.m41584f();
                    }
                }, this.f45341b);
            }
        }
    }

    public AbstractServiceC9875y(int i10, long j10, String str, int i11, int i12) {
        if (i10 == 0) {
            this.f45324b = null;
            this.f45325c = null;
            this.f45326d = 0;
            this.f45327e = 0;
            return;
        }
        this.f45324b = new c(this, i10, j10);
        this.f45325c = str;
        this.f45326d = i11;
        this.f45327e = i12;
    }

    /* renamed from: A */
    public static void m41545A(Context context, Class<? extends AbstractServiceC9875y> cls) {
        C4401z0.m22362Y0(context, m41559o(context, cls, "com.google.android.exoplayer.downloadService.action.INIT", true));
    }

    /* renamed from: B */
    public static void m41546B(Context context, Intent intent, boolean z10) {
        if (z10) {
            C4401z0.m22362Y0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* renamed from: i */
    public static Intent m41555i(Context context, Class<? extends AbstractServiceC9875y> cls, C9874x c9874x, int i10, boolean z10) {
        return m41559o(context, cls, "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD", z10).putExtra("download_request", c9874x).putExtra("stop_reason", i10);
    }

    /* renamed from: j */
    public static Intent m41556j(Context context, Class<? extends AbstractServiceC9875y> cls, C9874x c9874x, boolean z10) {
        return m41555i(context, cls, c9874x, 0, z10);
    }

    /* renamed from: k */
    public static Intent m41557k(Context context, Class<? extends AbstractServiceC9875y> cls, String str, boolean z10) {
        return m41559o(context, cls, "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z10).putExtra("content_id", str);
    }

    /* renamed from: n */
    public static Intent m41558n(Context context, Class<? extends AbstractServiceC9875y> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    /* renamed from: o */
    public static Intent m41559o(Context context, Class<? extends AbstractServiceC9875y> cls, String str, boolean z10) {
        return m41558n(context, cls, str).putExtra("foreground", z10);
    }

    /* renamed from: r */
    public static boolean m41560r(int i10) {
        return i10 == 2 || i10 == 5 || i10 == 7;
    }

    /* renamed from: x */
    public static void m41561x(Context context, Class<? extends AbstractServiceC9875y> cls, C9874x c9874x, boolean z10) {
        m41546B(context, m41556j(context, cls, c9874x, z10), z10);
    }

    /* renamed from: y */
    public static void m41562y(Context context, Class<? extends AbstractServiceC9875y> cls, String str, boolean z10) {
        m41546B(context, m41557k(context, cls, str, z10), z10);
    }

    /* renamed from: z */
    public static void m41563z(Context context, Class<? extends AbstractServiceC9875y> cls) {
        context.startService(m41558n(context, cls, "com.google.android.exoplayer.downloadService.action.INIT"));
    }

    /* renamed from: C */
    public final void m41564C() {
        boolean stopSelfResult;
        c cVar = this.f45324b;
        if (cVar != null) {
            cVar.m41583e();
        }
        if (C4401z0.f26679a >= 28 || !this.f45331i) {
            stopSelfResult = this.f45332j | stopSelfResult(this.f45329g);
        } else {
            stopSelf();
            stopSelfResult = true;
        }
        this.f45332j = stopSelfResult;
    }

    /* renamed from: l */
    public abstract C9870t mo30433l();

    /* renamed from: m */
    public abstract Notification mo30434m(List<C9849e> list);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Service
    public void onCreate() {
        String str = this.f45325c;
        if (str != null) {
            C4357d0.m21938a(this, str, this.f45326d, this.f45327e, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends AbstractServiceC9875y>, b> hashMap = f45323l;
        b bVar = (b) hashMap.get(cls);
        if (bVar == null) {
            boolean z10 = this.f45324b != null;
            InterfaceC10071g mo30435p = z10 ? mo30435p() : null;
            C9870t mo30433l = mo30433l();
            this.f45328f = mo30433l;
            mo30433l.m41488v();
            bVar = new b(getApplicationContext(), this.f45328f, z10, mo30435p, cls);
            hashMap.put(cls, bVar);
        } else {
            this.f45328f = bVar.f45335b;
        }
        bVar.m41574j(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f45333k = true;
        ((b) C4349a.m21882e(f45323l.get(getClass()))).m41575k(this);
        c cVar = this.f45324b;
        if (cVar != null) {
            cVar.m41583e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String str;
        String str2;
        C9870t c9870t;
        c cVar;
        String str3;
        this.f45329g = i11;
        this.f45331i = false;
        String str4 = null;
        if (intent != null) {
            str4 = intent.getAction();
            str = intent.getStringExtra("content_id");
            this.f45330h |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(str4);
        } else {
            str = null;
        }
        str2 = str4;
        if (str4 == null) {
            str2 = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        c9870t = (C9870t) C4349a.m21882e(this.f45328f);
        switch (str2) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                C9874x c9874x = (C9874x) ((Intent) C4349a.m21882e(intent)).getParcelableExtra("download_request");
                if (c9874x != null) {
                    c9870t.m41470c(c9874x, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    str3 = "Ignored ADD_DOWNLOAD: Missing download_request extra";
                    C4392v.m22270d("DownloadService", str3);
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                c9870t.m41488v();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                c9870t.m41486t();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                C10067c c10067c = (C10067c) ((Intent) C4349a.m21882e(intent)).getParcelableExtra("requirements");
                if (c10067c != null) {
                    InterfaceC10071g mo30435p = mo30435p();
                    C10067c c10067c2 = c10067c;
                    if (mo30435p != null) {
                        C10067c mo42360a = mo30435p.mo42360a(c10067c);
                        c10067c2 = c10067c;
                        if (!mo42360a.equals(c10067c)) {
                            C4392v.m22275i("DownloadService", "Ignoring requirements not supported by the Scheduler: " + (c10067c.m42367k() ^ mo42360a.m42367k()));
                            c10067c2 = mo42360a;
                        }
                    }
                    c9870t.m41490x(c10067c2);
                    break;
                } else {
                    str3 = "Ignored SET_REQUIREMENTS: Missing requirements extra";
                    C4392v.m22270d("DownloadService", str3);
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                c9870t.m41485s();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) C4349a.m21882e(intent)).hasExtra("stop_reason")) {
                    str3 = "Ignored SET_STOP_REASON: Missing stop_reason extra";
                    C4392v.m22270d("DownloadService", str3);
                    break;
                } else {
                    c9870t.m41491y(str, intent.getIntExtra("stop_reason", 0));
                    break;
                }
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (str != null) {
                    c9870t.m41487u(str);
                    break;
                } else {
                    str3 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra";
                    C4392v.m22270d("DownloadService", str3);
                    break;
                }
            default:
                str3 = "Ignored unrecognized action: " + str2;
                C4392v.m22270d("DownloadService", str3);
                break;
        }
        if (C4401z0.f26679a >= 26 && this.f45330h && (cVar = this.f45324b) != null) {
            cVar.m41581c();
        }
        this.f45332j = false;
        if (!c9870t.m41477j()) {
            return 1;
        }
        m41564C();
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f45331i = true;
    }

    /* renamed from: p */
    public abstract InterfaceC10071g mo30435p();

    /* renamed from: q */
    public final boolean m41565q() {
        return this.f45332j;
    }

    /* renamed from: s */
    public final void m41566s(C9849e c9849e) {
        m41569v(c9849e);
        if (this.f45324b != null) {
            if (m41560r(c9849e.f45183b)) {
                this.f45324b.m41582d();
            } else {
                this.f45324b.m41580b();
            }
        }
    }

    /* renamed from: t */
    public final void m41567t(C9849e c9849e) {
        m41570w(c9849e);
        c cVar = this.f45324b;
        if (cVar != null) {
            cVar.m41580b();
        }
    }

    /* renamed from: u */
    public final void m41568u(List<C9849e> list) {
        if (this.f45324b != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (m41560r(list.get(i10).f45183b)) {
                    this.f45324b.m41582d();
                    return;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: v */
    public void m41569v(C9849e c9849e) {
    }

    @Deprecated
    /* renamed from: w */
    public void m41570w(C9849e c9849e) {
    }
}
