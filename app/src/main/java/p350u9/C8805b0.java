package p350u9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import ga.BinderC4994b;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p060da.C4402a;
import p060da.C4411j;
import p422y9.AbstractBinderC9948s0;
import p422y9.C9935o;
import p422y9.InterfaceC9951t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/b0.class
 */
/* renamed from: u9.b0 */
/* loaded from: combined.jar:classes2.jar:u9/b0.class */
public final class C8805b0 {

    /* renamed from: e */
    public static volatile InterfaceC9951t0 f40827e;

    /* renamed from: g */
    public static Context f40829g;

    /* renamed from: a */
    public static final AbstractBinderC8839z f40823a = new BinderC8833t(AbstractBinderC8837x.m37732U0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final AbstractBinderC8839z f40824b = new BinderC8834u(AbstractBinderC8837x.m37732U0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final AbstractBinderC8839z f40825c = new BinderC8835v(AbstractBinderC8837x.m37732U0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t��Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final AbstractBinderC8839z f40826d = new BinderC8836w(AbstractBinderC8837x.m37732U0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t��Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f40828f = new Object();

    /* renamed from: a */
    public static C8825l0 m37664a(String str, AbstractBinderC8837x abstractBinderC8837x, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m37669f(str, abstractBinderC8837x, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.os.IBinder, ga.a] */
    /* renamed from: b */
    public static C8825l0 m37665b(String str, boolean z10, boolean z11, boolean z12) {
        String concat;
        C8825l0 m37728d;
        C8813f0 mo41876b1;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C9935o.m41850j(f40829g);
            try {
                m37670g();
                try {
                    mo41876b1 = f40827e.mo41876b1(new C8807c0(str, z10, false, BinderC4994b.m25160B1(f40829g), false));
                } catch (RemoteException e10) {
                    e = e10;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    concat = "module call";
                }
            } catch (DynamiteModule.C2419a e11) {
                e = e11;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                String valueOf = String.valueOf(e.getMessage());
                concat = valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: ");
            }
            if (mo41876b1.m37695Q()) {
                m37728d = C8825l0.m37726b();
            } else {
                String m37694P = mo41876b1.m37694P();
                concat = m37694P;
                if (m37694P == null) {
                    concat = "error checking package certificate";
                }
                if (mo41876b1.m37696R() == 4) {
                    e = new PackageManager.NameNotFoundException();
                    m37728d = C8825l0.m37728d(concat, e);
                } else {
                    m37728d = C8825l0.m37727c(concat);
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return m37728d;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ String m37666c(boolean z10, String str, AbstractBinderC8837x abstractBinderC8837x) {
        String str2 = true != (!z10 && m37669f(str, abstractBinderC8837x, true, false).f40867a) ? "not allowed" : "debug cert rejected";
        MessageDigest m22426b = C4402a.m22426b(MessageDigestAlgorithms.SHA_1);
        C9935o.m41850j(m22426b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, C4411j.m22446a(m22426b.digest(abstractBinderC8837x.mo37733B1())), Boolean.valueOf(z10), "12451000.false");
    }

    /* renamed from: d */
    public static void m37667d(Context context) {
        synchronized (C8805b0.class) {
            try {
                if (f40829g != null) {
                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                } else if (context != null) {
                    f40829g = context.getApplicationContext();
                }
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static boolean m37668e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m37670g();
                return f40827e.mo41875b();
            } catch (RemoteException | DynamiteModule.C2419a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: f */
    public static C8825l0 m37669f(final String str, final AbstractBinderC8837x abstractBinderC8837x, final boolean z10, boolean z11) {
        try {
            m37670g();
            C9935o.m41850j(f40829g);
            try {
                return f40827e.mo41874A1(new C8817h0(str, abstractBinderC8837x, z10, z11), BinderC4994b.m25160B1(f40829g.getPackageManager())) ? C8825l0.m37726b() : new C8823k0(new Callable(z10, str, abstractBinderC8837x) { // from class: u9.s

                    /* renamed from: a */
                    public final boolean f40877a;

                    /* renamed from: b */
                    public final String f40878b;

                    /* renamed from: c */
                    public final AbstractBinderC8837x f40879c;

                    {
                        this.f40877a = z10;
                        this.f40878b = str;
                        this.f40879c = abstractBinderC8837x;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C8805b0.m37666c(this.f40877a, this.f40878b, this.f40879c);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C8825l0.m37728d("module call", e10);
            }
        } catch (DynamiteModule.C2419a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            String valueOf = String.valueOf(e11.getMessage());
            return C8825l0.m37728d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
        }
    }

    /* renamed from: g */
    public static void m37670g() {
        if (f40827e != null) {
            return;
        }
        C9935o.m41850j(f40829g);
        synchronized (f40828f) {
            if (f40827e == null) {
                f40827e = AbstractBinderC9948s0.m41880y0(DynamiteModule.m13174e(f40829g, DynamiteModule.f14839f, "com.google.android.gms.googlecertificates").m13182d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
