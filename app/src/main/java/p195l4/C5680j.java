package p195l4;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import p005a4.InterfaceC0065b;
import p122h4.C5026d;
import p142i4.C5172c;
import p362v3.C9231a;
import p362v3.C9233c;
import p362v3.C9234d;
import p363v4.C9238d;
import p377w3.C9404a;
import p396x3.InterfaceC9649f;
import p396x3.InterfaceC9650g;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/j.class
 */
/* renamed from: l4.j */
/* loaded from: combined.jar:classes1.jar:l4/j.class */
public class C5680j implements InterfaceC9649f<C5672b> {

    /* renamed from: d */
    public static final a f32014d = new a();

    /* renamed from: a */
    public final C9231a.a f32015a;

    /* renamed from: b */
    public final InterfaceC0065b f32016b;

    /* renamed from: c */
    public final a f32017c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/j$a.class
     */
    /* renamed from: l4.j$a */
    /* loaded from: combined.jar:classes1.jar:l4/j$a.class */
    public static class a {
        /* renamed from: a */
        public C9231a m27938a(C9231a.a aVar) {
            return new C9231a(aVar);
        }

        /* renamed from: b */
        public C9404a m27939b() {
            return new C9404a();
        }

        /* renamed from: c */
        public InterfaceC10048l<Bitmap> m27940c(Bitmap bitmap, InterfaceC0065b interfaceC0065b) {
            return new C5172c(bitmap, interfaceC0065b);
        }

        /* renamed from: d */
        public C9234d m27941d() {
            return new C9234d();
        }
    }

    public C5680j(InterfaceC0065b interfaceC0065b) {
        this(interfaceC0065b, f32014d);
    }

    public C5680j(InterfaceC0065b interfaceC0065b, a aVar) {
        this.f32016b = interfaceC0065b;
        this.f32015a = new C5671a(interfaceC0065b);
        this.f32017c = aVar;
    }

    /* renamed from: b */
    public final C9231a m27934b(byte[] bArr) {
        C9234d m27941d = this.f32017c.m27941d();
        m27941d.m38939o(bArr);
        C9233c m38927c = m27941d.m38927c();
        C9231a m27938a = this.f32017c.m27938a(this.f32015a);
        m27938a.m38921n(m38927c, bArr);
        m27938a.m38909a();
        return m27938a;
    }

    @Override // p396x3.InterfaceC9645b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo23245a(InterfaceC10048l<C5672b> interfaceC10048l, OutputStream outputStream) {
        long m38952b = C9238d.m38952b();
        C5672b c5672b = interfaceC10048l.get();
        InterfaceC9650g<Bitmap> m27905g = c5672b.m27905g();
        if (m27905g instanceof C5026d) {
            return m27937e(c5672b.m27902d(), outputStream);
        }
        C9231a m27934b = m27934b(c5672b.m27902d());
        C9404a m27939b = this.f32017c.m27939b();
        if (!m27939b.m39738h(outputStream)) {
            return false;
        }
        for (int i10 = 0; i10 < m27934b.m38914f(); i10++) {
            InterfaceC10048l<Bitmap> m27936d = m27936d(m27934b.m38917i(), m27905g, c5672b);
            try {
                if (!m27939b.m39731a(m27936d.get())) {
                    m27936d.mo25232b();
                    return false;
                }
                m27939b.m39736f(m27934b.m38913e(m27934b.m38912d()));
                m27934b.m38909a();
                m27936d.mo25232b();
            } catch (Throwable th2) {
                m27936d.mo25232b();
                throw th2;
            }
        }
        boolean m39734d = m27939b.m39734d();
        if (Log.isLoggable("GifEncoder", 2)) {
            Log.v("GifEncoder", "Encoded gif with " + m27934b.m38914f() + " frames and " + c5672b.m27902d().length + " bytes in " + C9238d.m38951a(m38952b) + " ms");
        }
        return m39734d;
    }

    /* renamed from: d */
    public final InterfaceC10048l<Bitmap> m27936d(Bitmap bitmap, InterfaceC9650g<Bitmap> interfaceC9650g, C5672b c5672b) {
        InterfaceC10048l<Bitmap> m27940c = this.f32017c.m27940c(bitmap, this.f32016b);
        InterfaceC10048l<Bitmap> mo25234a = interfaceC9650g.mo25234a(m27940c, c5672b.getIntrinsicWidth(), c5672b.getIntrinsicHeight());
        if (!m27940c.equals(mo25234a)) {
            m27940c.mo25232b();
        }
        return mo25234a;
    }

    /* renamed from: e */
    public final boolean m27937e(byte[] bArr, OutputStream outputStream) {
        boolean z10;
        try {
            outputStream.write(bArr);
            z10 = true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 3)) {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", e10);
            }
            z10 = false;
        }
        return z10;
    }

    @Override // p396x3.InterfaceC9645b
    public String getId() {
        return "";
    }
}
