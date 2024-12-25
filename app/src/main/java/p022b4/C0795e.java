package p022b4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p022b4.InterfaceC0791a;
import p344u3.C8786a;
import p396x3.InterfaceC9646c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/e.class
 */
/* renamed from: b4.e */
/* loaded from: combined.jar:classes1.jar:b4/e.class */
public class C0795e implements InterfaceC0791a {

    /* renamed from: f */
    public static C0795e f5535f;

    /* renamed from: a */
    public final C0793c f5536a = new C0793c();

    /* renamed from: b */
    public final C0800j f5537b = new C0800j();

    /* renamed from: c */
    public final File f5538c;

    /* renamed from: d */
    public final int f5539d;

    /* renamed from: e */
    public C8786a f5540e;

    public C0795e(File file, int i10) {
        this.f5538c = file;
        this.f5539d = i10;
    }

    /* renamed from: d */
    public static InterfaceC0791a m5098d(File file, int i10) {
        C0795e c0795e;
        synchronized (C0795e.class) {
            try {
                if (f5535f == null) {
                    f5535f = new C0795e(file, i10);
                }
                c0795e = f5535f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0795e;
    }

    @Override // p022b4.InterfaceC0791a
    /* renamed from: a */
    public File mo5089a(InterfaceC9646c interfaceC9646c) {
        File file;
        try {
            C8786a.d m37606B0 = m5099e().m37606B0(this.f5537b.m5117a(interfaceC9646c));
            file = null;
            if (m37606B0 != null) {
                file = m37606B0.m37638a(0);
            }
        } catch (IOException e10) {
            file = null;
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
                file = null;
            }
        }
        return file;
    }

    @Override // p022b4.InterfaceC0791a
    /* renamed from: b */
    public void mo5090b(InterfaceC9646c interfaceC9646c, InterfaceC0791a.b bVar) {
        String m5117a = this.f5537b.m5117a(interfaceC9646c);
        this.f5536a.m5093a(interfaceC9646c);
        try {
            try {
                C8786a.b m37615v0 = m5099e().m37615v0(m5117a);
                if (m37615v0 != null) {
                    try {
                        if (bVar.mo5092a(m37615v0.m37623f(0))) {
                            m37615v0.m37622e();
                        }
                        m37615v0.m37621b();
                    } catch (Throwable th2) {
                        m37615v0.m37621b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f5536a.m5094b(interfaceC9646c);
        }
    }

    @Override // p022b4.InterfaceC0791a
    /* renamed from: c */
    public void mo5091c(InterfaceC9646c interfaceC9646c) {
        try {
            m5099e().m37612I0(this.f5537b.m5117a(interfaceC9646c));
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e10);
            }
        }
    }

    /* renamed from: e */
    public final C8786a m5099e() {
        C8786a c8786a;
        synchronized (this) {
            if (this.f5540e == null) {
                this.f5540e = C8786a.m37593D0(this.f5538c, 1, 1, this.f5539d);
            }
            c8786a = this.f5540e;
        }
        return c8786a;
    }
}
