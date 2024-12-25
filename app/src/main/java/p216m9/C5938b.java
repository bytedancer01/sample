package p216m9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ma.BinderC6069d0;
import ma.BinderC6110f;
import ma.C6131g;
import ma.C6173i;
import ma.C6176i2;
import ma.C6196j1;
import ma.C6216k0;
import ma.C6445v;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p097fa.C4794e;
import p200l9.C5747b0;
import p208m1.C5900i;
import p208m1.C5901j;
import p304r9.C8015b;
import p304r9.C8028h0;
import p383w9.AbstractC9515r;
import p383w9.InterfaceC9502o;
import p422y9.C9935o;
import za.C10146j;
import za.InterfaceC10138f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/b.class
 */
/* renamed from: m9.b */
/* loaded from: combined.jar:classes2.jar:m9/b.class */
public class C5938b {

    /* renamed from: q */
    public static final C8015b f33385q = new C8015b("CastContext");

    /* renamed from: r */
    public static final Object f33386r = new Object();

    /* renamed from: s */
    public static volatile C5938b f33387s;

    /* renamed from: a */
    public final Context f33388a;

    /* renamed from: b */
    public final InterfaceC5988r1 f33389b;

    /* renamed from: c */
    public final C5991t f33390c;

    /* renamed from: d */
    public final C5967k1 f33391d;

    /* renamed from: e */
    public final C5962j f33392e;

    /* renamed from: f */
    public final C5953g f33393f;

    /* renamed from: g */
    public final C5941c f33394g;

    /* renamed from: h */
    public final C8028h0 f33395h;

    /* renamed from: i */
    public final BinderC6110f f33396i;

    /* renamed from: j */
    public final BinderC6069d0 f33397j;

    /* renamed from: k */
    public final C6445v f33398k;

    /* renamed from: l */
    public final List f33399l;

    /* renamed from: m */
    public final C6216k0 f33400m;

    /* renamed from: n */
    public final C6196j1 f33401n;

    /* renamed from: o */
    public C6173i f33402o;

    /* renamed from: p */
    public C5944d f33403p;

    public C5938b(Context context, C5941c c5941c, List list, BinderC6069d0 binderC6069d0, final C8028h0 c8028h0) {
        this.f33388a = context;
        this.f33394g = c5941c;
        this.f33397j = binderC6069d0;
        this.f33395h = c8028h0;
        this.f33399l = list;
        C6445v c6445v = new C6445v(context);
        this.f33398k = c6445v;
        C6216k0 m29535y0 = binderC6069d0.m29535y0();
        this.f33400m = m29535y0;
        m29249p();
        try {
            InterfaceC5988r1 m29612a = C6131g.m29612a(context, c5941c, binderC6069d0, m29248o());
            this.f33389b = m29612a;
            try {
                this.f33391d = new C5967k1(m29612a.mo29333b());
                try {
                    C5991t c5991t = new C5991t(m29612a.mo29337p(), context);
                    this.f33390c = c5991t;
                    this.f33393f = new C5953g(c5991t);
                    this.f33392e = new C5962j(c5941c, c5991t, c8028h0);
                    if (m29535y0 != null) {
                        m29535y0.m29800j(c5991t);
                    }
                    this.f33401n = new C6196j1(context);
                    c8028h0.m34891b(new String[]{"com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_UPDATE_DEVICES_DELAY_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_DISCOVERY_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ZERO_DEVICE_TIMEOUT_MS", "com.google.android.gms.cast.FLAG_MEDIA_ROUTE_DIALOG_ENABLE_WIFI_WARNING"}).mo42558g(new InterfaceC10138f() { // from class: ma.c
                        @Override // za.InterfaceC10138f
                        public final void onSuccess(Object obj) {
                            C6068d.m29515b((Bundle) obj);
                        }
                    });
                    BinderC6110f binderC6110f = new BinderC6110f();
                    this.f33396i = binderC6110f;
                    try {
                        m29612a.mo29336e1(binderC6110f);
                        binderC6110f.m29581y0(c6445v.f34096a);
                        if (!c5941c.m29259X().isEmpty()) {
                            f33385q.m34877e("Setting Route Discovery for appIds: ".concat(String.valueOf(c5941c.m29259X())), new Object[0]);
                            c6445v.m30069o(c5941c.m29259X());
                        }
                        c8028h0.m34891b(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).mo42558g(new InterfaceC10138f(this) { // from class: m9.v0

                            /* renamed from: a */
                            public final C5938b f33636a;

                            {
                                this.f33636a = this;
                            }

                            @Override // za.InterfaceC10138f
                            public final void onSuccess(Object obj) {
                                C6176i2.m29667a(r0.f33388a, r0.f33395h, r0.f33390c, r0.f33400m, this.f33636a.f33396i).m29669c((Bundle) obj);
                            }
                        });
                        final String[] strArr = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        c8028h0.doRead(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(c8028h0, strArr) { // from class: r9.c0

                            /* renamed from: a */
                            public final C8028h0 f38805a;

                            /* renamed from: b */
                            public final String[] f38806b;

                            {
                                this.f38805a = c8028h0;
                                this.f38806b = strArr;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // p383w9.InterfaceC9502o
                            public final void accept(Object obj, Object obj2) {
                                C8028h0 c8028h02 = this.f38805a;
                                String[] strArr2 = this.f38806b;
                                ((C8035l) ((C8030i0) obj).getService()).m34909D1(new BinderC8026g0(c8028h02, (C10146j) obj2), strArr2);
                            }
                        }).m40026d(C5747b0.f32192h).m40025c(false).m40027e(8427).m40023a()).mo42558g(new InterfaceC10138f(this) { // from class: m9.y0

                            /* renamed from: a */
                            public final C5938b f33638a;

                            {
                                this.f33638a = this;
                            }

                            @Override // za.InterfaceC10138f
                            public final void onSuccess(Object obj) {
                                this.f33638a.m29247m((Bundle) obj);
                            }
                        });
                        try {
                            if (m29612a.mo29334c() >= 224300000) {
                                C5935a.m29220c(new C6004z0(this));
                            }
                        } catch (RemoteException e10) {
                            f33385q.m34874b(e10, "Unable to call %s on %s.", "clientGmsVersion", InterfaceC5988r1.class.getSimpleName());
                        }
                    } catch (RemoteException e11) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e11);
                    }
                } catch (RemoteException e12) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e12);
                }
            } catch (RemoteException e13) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e13);
            }
        } catch (RemoteException e14) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e14);
        }
    }

    /* renamed from: d */
    public static C5938b m29234d() {
        C9935o.m41845e("Must be called from the main thread.");
        return f33387s;
    }

    @Deprecated
    /* renamed from: e */
    public static C5938b m29235e(Context context) {
        C9935o.m41845e("Must be called from the main thread.");
        if (f33387s == null) {
            synchronized (f33386r) {
                if (f33387s == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC5959i m29240n = m29240n(applicationContext);
                    C5941c castOptions = m29240n.getCastOptions(applicationContext);
                    C8028h0 c8028h0 = new C8028h0(applicationContext);
                    try {
                        f33387s = new C5938b(applicationContext, castOptions, m29240n.getAdditionalSessionProviders(applicationContext), new BinderC6069d0(applicationContext, C5901j.m28867j(applicationContext), castOptions, c8028h0), c8028h0);
                    } catch (C5956h e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f33387s;
    }

    /* renamed from: g */
    public static C5938b m29236g(Context context) {
        C9935o.m41845e("Must be called from the main thread.");
        try {
            return m29235e(context);
        } catch (RuntimeException e10) {
            f33385q.m34875c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e10);
            return null;
        }
    }

    /* renamed from: n */
    public static InterfaceC5959i m29240n(Context context) {
        try {
            Bundle bundle = C4794e.m24250a(context).m24245c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f33385q.m34875c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (InterfaceC5959i) Class.forName(string).asSubclass(InterfaceC5959i.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            throw new IllegalStateException("Failed to initialize CastContext.", e10);
        }
    }

    /* renamed from: a */
    public C5941c m29241a() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33394g;
    }

    /* renamed from: b */
    public C5900i m29242b() {
        C9935o.m41845e("Must be called from the main thread.");
        try {
            return C5900i.m28852d(this.f33389b.mo29335d());
        } catch (RemoteException e10) {
            f33385q.m34874b(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", InterfaceC5988r1.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: c */
    public C5991t m29243c() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33390c;
    }

    @Deprecated
    /* renamed from: f */
    public boolean m29244f(KeyEvent keyEvent) {
        C9935o.m41845e("Must be called from the main thread.");
        return false;
    }

    /* renamed from: h */
    public final C5967k1 m29245h() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33391d;
    }

    /* renamed from: k */
    public final C6196j1 m29246k() {
        C9935o.m41845e("Must be called from the main thread.");
        return this.f33401n;
    }

    /* renamed from: m */
    public final /* synthetic */ void m29247m(Bundle bundle) {
        this.f33403p = new C5944d(bundle);
    }

    /* renamed from: o */
    public final Map m29248o() {
        HashMap hashMap = new HashMap();
        C6173i c6173i = this.f33402o;
        if (c6173i != null) {
            hashMap.put(c6173i.m29363b(), c6173i.m29366e());
        }
        List<AbstractC5995v> list = this.f33399l;
        if (list != null) {
            for (AbstractC5995v abstractC5995v : list) {
                C9935o.m41851k(abstractC5995v, "Additional SessionProvider must not be null.");
                String m41847g = C9935o.m41847g(abstractC5995v.m29363b(), "Category for SessionProvider must not be null or empty string.");
                C9935o.m41842b(!hashMap.containsKey(m41847g), String.format("SessionProvider for category %s already added", m41847g));
                hashMap.put(m41847g, abstractC5995v.m29366e());
            }
        }
        return hashMap;
    }

    @RequiresNonNull({"castOptions", "mediaRouter", "appContext"})
    /* renamed from: p */
    public final void m29249p() {
        this.f33402o = !TextUtils.isEmpty(this.f33394g.m29254S()) ? new C6173i(this.f33388a, this.f33394g, this.f33397j) : null;
    }
}
