package p329t3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005a4.InterfaceC0065b;
import p022b4.InterfaceC0798h;
import p054d4.C4302a;
import p073e4.C4608c;
import p073e4.C4609d;
import p073e4.C4612g;
import p073e4.InterfaceC4617l;
import p073e4.InterfaceC4618m;
import p091f4.C4763a;
import p091f4.C4764b;
import p091f4.C4765c;
import p091f4.C4766d;
import p110g4.C4940a;
import p110g4.C4941b;
import p110g4.C4942c;
import p110g4.C4943d;
import p110g4.C4944e;
import p110g4.C4945f;
import p110g4.C4946g;
import p142i4.C5174e;
import p142i4.C5176g;
import p142i4.C5178i;
import p142i4.C5179j;
import p142i4.C5183n;
import p142i4.C5185p;
import p160j4.AbstractC5293b;
import p179k4.C5475d;
import p195l4.C5672b;
import p195l4.C5673c;
import p211m4.C5922a;
import p211m4.C5927f;
import p211m4.C5928g;
import p225n4.C6648a;
import p225n4.C6649b;
import p225n4.C6651d;
import p225n4.InterfaceC6650c;
import p239o4.C6902k;
import p265p4.C7552b;
import p265p4.InterfaceC7551a;
import p280q4.C7754c;
import p280q4.InterfaceC7753b;
import p299r4.InterfaceC7954b;
import p330t4.C8626f;
import p330t4.InterfaceC8630j;
import p363v4.C9242h;
import p396x3.EnumC9644a;
import p435z3.C10039c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t3/g.class
 */
/* renamed from: t3.g */
/* loaded from: combined.jar:classes1.jar:t3/g.class */
public class C8617g {

    /* renamed from: o */
    public static volatile C8617g f40237o;

    /* renamed from: p */
    public static boolean f40238p = true;

    /* renamed from: a */
    public final C4608c f40239a;

    /* renamed from: b */
    public final C10039c f40240b;

    /* renamed from: c */
    public final InterfaceC0065b f40241c;

    /* renamed from: d */
    public final InterfaceC0798h f40242d;

    /* renamed from: e */
    public final EnumC9644a f40243e;

    /* renamed from: f */
    public final C8626f f40244f = new C8626f();

    /* renamed from: g */
    public final C6651d f40245g;

    /* renamed from: h */
    public final C7754c f40246h;

    /* renamed from: i */
    public final C5174e f40247i;

    /* renamed from: j */
    public final C5927f f40248j;

    /* renamed from: k */
    public final C5178i f40249k;

    /* renamed from: l */
    public final C5927f f40250l;

    /* renamed from: m */
    public final Handler f40251m;

    /* renamed from: n */
    public final C4302a f40252n;

    public C8617g(C10039c c10039c, InterfaceC0798h interfaceC0798h, InterfaceC0065b interfaceC0065b, Context context, EnumC9644a enumC9644a) {
        C6651d c6651d = new C6651d();
        this.f40245g = c6651d;
        this.f40240b = c10039c;
        this.f40241c = interfaceC0065b;
        this.f40242d = interfaceC0798h;
        this.f40243e = enumC9644a;
        this.f40239a = new C4608c(context);
        this.f40251m = new Handler(Looper.getMainLooper());
        this.f40252n = new C4302a(interfaceC0798h, interfaceC0065b, enumC9644a);
        C7754c c7754c = new C7754c();
        this.f40246h = c7754c;
        C5185p c5185p = new C5185p(interfaceC0065b, enumC9644a);
        c7754c.m33911b(InputStream.class, Bitmap.class, c5185p);
        C5176g c5176g = new C5176g(interfaceC0065b, enumC9644a);
        c7754c.m33911b(ParcelFileDescriptor.class, Bitmap.class, c5176g);
        C5183n c5183n = new C5183n(c5185p, c5176g);
        c7754c.m33911b(C4612g.class, Bitmap.class, c5183n);
        C5673c c5673c = new C5673c(context, interfaceC0065b);
        c7754c.m33911b(InputStream.class, C5672b.class, c5673c);
        c7754c.m33911b(C4612g.class, C5922a.class, new C5928g(c5183n, c5673c, interfaceC0065b));
        c7754c.m33911b(InputStream.class, File.class, new C5475d());
        m37017s(File.class, ParcelFileDescriptor.class, new C4763a.a());
        m37017s(File.class, InputStream.class, new C4942c.a());
        Class cls = Integer.TYPE;
        m37017s(cls, ParcelFileDescriptor.class, new C4764b.a());
        m37017s(cls, InputStream.class, new C4943d.a());
        m37017s(Integer.class, ParcelFileDescriptor.class, new C4764b.a());
        m37017s(Integer.class, InputStream.class, new C4943d.a());
        m37017s(String.class, ParcelFileDescriptor.class, new C4765c.a());
        m37017s(String.class, InputStream.class, new C4944e.a());
        m37017s(Uri.class, ParcelFileDescriptor.class, new C4766d.a());
        m37017s(Uri.class, InputStream.class, new C4945f.a());
        m37017s(URL.class, InputStream.class, new C4946g.a());
        m37017s(C4609d.class, InputStream.class, new C4940a.a());
        m37017s(byte[].class, InputStream.class, new C4941b.a());
        c6651d.m30653b(Bitmap.class, C5179j.class, new C6649b(context.getResources(), interfaceC0065b));
        c6651d.m30653b(C5922a.class, AbstractC5293b.class, new C6648a(new C6649b(context.getResources(), interfaceC0065b)));
        C5174e c5174e = new C5174e(interfaceC0065b);
        this.f40247i = c5174e;
        this.f40248j = new C5927f(interfaceC0065b, c5174e);
        C5178i c5178i = new C5178i(interfaceC0065b);
        this.f40249k = c5178i;
        this.f40250l = new C5927f(interfaceC0065b, c5178i);
    }

    /* renamed from: b */
    public static <T> InterfaceC4617l<T, ParcelFileDescriptor> m36998b(Class<T> cls, Context context) {
        return m36999d(cls, ParcelFileDescriptor.class, context);
    }

    /* renamed from: d */
    public static <T, Y> InterfaceC4617l<T, Y> m36999d(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return m37002i(context).m37016q().m23229a(cls, cls2);
        }
        if (!Log.isLoggable("Glide", 3)) {
            return null;
        }
        Log.d("Glide", "Unable to load null model, setting placeholder only");
        return null;
    }

    /* renamed from: e */
    public static <T> InterfaceC4617l<T, InputStream> m37000e(Class<T> cls, Context context) {
        return m36999d(cls, InputStream.class, context);
    }

    /* renamed from: g */
    public static void m37001g(InterfaceC8630j<?> interfaceC8630j) {
        C9242h.m38963a();
        InterfaceC7954b mo37043f = interfaceC8630j.mo37043f();
        if (mo37043f != null) {
            mo37043f.clear();
            interfaceC8630j.mo37045h(null);
        }
    }

    /* renamed from: i */
    public static C8617g m37002i(Context context) {
        if (f40237o == null) {
            synchronized (C8617g.class) {
                try {
                    if (f40237o == null) {
                        Context applicationContext = context.getApplicationContext();
                        C8618h c8618h = new C8618h(applicationContext);
                        List<InterfaceC7551a> m37003r = m37003r(applicationContext);
                        Iterator<InterfaceC7551a> it = m37003r.iterator();
                        while (it.hasNext()) {
                            it.next().m32316b(applicationContext, c8618h);
                        }
                        f40237o = c8618h.m37019a();
                        Iterator<InterfaceC7551a> it2 = m37003r.iterator();
                        while (it2.hasNext()) {
                            it2.next().m32315a(applicationContext, f40237o);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f40237o;
    }

    /* renamed from: r */
    public static List<InterfaceC7551a> m37003r(Context context) {
        return f40238p ? new C7552b(context).m32318a() : Collections.emptyList();
    }

    /* renamed from: u */
    public static C8620j m37004u(Context context) {
        return C6902k.m31817c().m31820e(context);
    }

    /* renamed from: a */
    public <T, Z> InterfaceC7753b<T, Z> m37005a(Class<T> cls, Class<Z> cls2) {
        return this.f40246h.m33910a(cls, cls2);
    }

    /* renamed from: c */
    public <R> InterfaceC8630j<R> m37006c(ImageView imageView, Class<R> cls) {
        return this.f40244f.m37052a(imageView, cls);
    }

    /* renamed from: f */
    public <Z, R> InterfaceC6650c<Z, R> m37007f(Class<Z> cls, Class<R> cls2) {
        return this.f40245g.m30652a(cls, cls2);
    }

    /* renamed from: h */
    public void m37008h() {
        C9242h.m38963a();
        this.f40242d.m5108c();
        this.f40241c.mo233c();
    }

    /* renamed from: j */
    public C5174e m37009j() {
        return this.f40247i;
    }

    /* renamed from: k */
    public C5178i m37010k() {
        return this.f40249k;
    }

    /* renamed from: l */
    public InterfaceC0065b m37011l() {
        return this.f40241c;
    }

    /* renamed from: m */
    public EnumC9644a m37012m() {
        return this.f40243e;
    }

    /* renamed from: n */
    public C5927f m37013n() {
        return this.f40248j;
    }

    /* renamed from: o */
    public C5927f m37014o() {
        return this.f40250l;
    }

    /* renamed from: p */
    public C10039c m37015p() {
        return this.f40240b;
    }

    /* renamed from: q */
    public final C4608c m37016q() {
        return this.f40239a;
    }

    /* renamed from: s */
    public <T, Y> void m37017s(Class<T> cls, Class<Y> cls2, InterfaceC4618m<T, Y> interfaceC4618m) {
        InterfaceC4618m<T, Y> m23234f = this.f40239a.m23234f(cls, cls2, interfaceC4618m);
        if (m23234f != null) {
            m23234f.mo23256a();
        }
    }

    /* renamed from: t */
    public void m37018t(int i10) {
        C9242h.m38963a();
        this.f40242d.mo5101b(i10);
        this.f40241c.mo232b(i10);
    }
}
