package p218mf;

import android.content.Context;
import android.os.Build;
import com.maxdigitall.maxdigitaliptvbox.view.demo.C3662a;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import p027b9.C0863u;
import p027b9.C0864v;
import p027b9.InterfaceC0831a0;
import p027b9.InterfaceC0854m;
import p039c9.C1033c;
import p039c9.C1048r;
import p039c9.C1049s;
import p039c9.InterfaceC1031a;
import p059d9.C4392v;
import p267p6.C7601n;
import p267p6.InterfaceC7639z1;
import p320s6.C8540c;
import p320s6.InterfaceC8539b;
import p399x6.C9671b;
import p399x6.C9672c;
import p420y7.C9843b;
import p420y7.C9845c;
import p420y7.C9870t;
import p440z8.C10085g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mf/b.class
 */
/* renamed from: mf.b */
/* loaded from: combined.jar:classes2.jar:mf/b.class */
public final class C6588b {

    /* renamed from: a */
    public static final String f34437a = "ExoPlayerDemo/2.15.0 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.0";

    /* renamed from: b */
    public static InterfaceC0854m.a f34438b;

    /* renamed from: c */
    public static InterfaceC0831a0.b f34439c;

    /* renamed from: d */
    public static InterfaceC8539b f34440d;

    /* renamed from: e */
    public static File f34441e;

    /* renamed from: f */
    public static InterfaceC1031a f34442f;

    /* renamed from: g */
    public static C9870t f34443g;

    /* renamed from: h */
    public static C3662a f34444h;

    /* renamed from: i */
    public static C10085g f34445i;

    /* renamed from: a */
    public static C1033c.c m30436a(InterfaceC0854m.a aVar, InterfaceC1031a interfaceC1031a) {
        return new C1033c.c().m6094i(interfaceC1031a).m6097l(aVar).m6095j(null).m6096k(2);
    }

    /* renamed from: b */
    public static InterfaceC7639z1 m30437b(Context context, boolean z10) {
        return new C7601n(context.getApplicationContext()).m32862i(m30448m() ? z10 ? 2 : 1 : 0);
    }

    /* renamed from: c */
    public static void m30438c(Context context) {
        synchronized (C6588b.class) {
            try {
                if (f34443g == null) {
                    C9845c c9845c = new C9845c(m30440e(context));
                    m30447l(context, "actions", c9845c, false);
                    m30447l(context, "tracked_actions", c9845c, true);
                    f34443g = new C9870t(context, m30440e(context), m30441f(context), m30446k(context), Executors.newFixedThreadPool(6));
                    f34444h = new C3662a(context, m30446k(context), f34443g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static InterfaceC0854m.a m30439d(Context context) {
        InterfaceC0854m.a aVar;
        synchronized (C6588b.class) {
            try {
                if (f34438b == null) {
                    Context applicationContext = context.getApplicationContext();
                    f34438b = m30436a(new C0863u(applicationContext, m30446k(applicationContext)), m30441f(applicationContext));
                }
                aVar = f34438b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static InterfaceC8539b m30440e(Context context) {
        InterfaceC8539b interfaceC8539b;
        synchronized (C6588b.class) {
            try {
                if (f34440d == null) {
                    f34440d = new C8540c(context);
                }
                interfaceC8539b = f34440d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC8539b;
    }

    /* renamed from: f */
    public static InterfaceC1031a m30441f(Context context) {
        InterfaceC1031a interfaceC1031a;
        synchronized (C6588b.class) {
            try {
                if (f34442f == null) {
                    f34442f = new C1049s(new File(m30442g(context), "downloads"), new C1048r(), m30440e(context));
                }
                interfaceC1031a = f34442f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC1031a;
    }

    /* renamed from: g */
    public static File m30442g(Context context) {
        File file;
        synchronized (C6588b.class) {
            try {
                if (f34441e == null) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    f34441e = externalFilesDir;
                    if (externalFilesDir == null) {
                        f34441e = context.getFilesDir();
                    }
                }
                file = f34441e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    /* renamed from: h */
    public static C9870t m30443h(Context context) {
        C9870t c9870t;
        synchronized (C6588b.class) {
            try {
                m30438c(context);
                c9870t = f34443g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9870t;
    }

    /* renamed from: i */
    public static C10085g m30444i(Context context) {
        C10085g c10085g;
        synchronized (C6588b.class) {
            try {
                if (f34445i == null) {
                    f34445i = new C10085g(context, "download_channel");
                }
                c10085g = f34445i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10085g;
    }

    /* renamed from: j */
    public static C3662a m30445j(Context context) {
        C3662a c3662a;
        synchronized (C6588b.class) {
            try {
                m30438c(context);
                c3662a = f34444h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3662a;
    }

    /* renamed from: k */
    public static InterfaceC0831a0.b m30446k(Context context) {
        InterfaceC0831a0.b bVar;
        synchronized (C6588b.class) {
            try {
                if (f34439c == null) {
                    Context applicationContext = context.getApplicationContext();
                    String str = f34437a;
                    CronetEngine m40680a = C9672c.m40680a(applicationContext, str, false);
                    if (m40680a != null) {
                        f34439c = new C9671b.b(m40680a, Executors.newSingleThreadExecutor());
                    }
                    if (f34439c == null) {
                        CookieManager cookieManager = new CookieManager();
                        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                        CookieHandler.setDefault(cookieManager);
                        f34439c = new C0864v.b().m5428c(str);
                    }
                }
                bVar = f34439c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* renamed from: l */
    public static void m30447l(Context context, String str, C9845c c9845c, boolean z10) {
        synchronized (C6588b.class) {
            try {
                try {
                    C9843b.m41373b(new File(m30442g(context), str), null, c9845c, true, z10);
                } catch (IOException e10) {
                    C4392v.m22271e("DemoUtil", "Failed to upgrade action file: " + str, e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public static boolean m30448m() {
        return true;
    }
}
