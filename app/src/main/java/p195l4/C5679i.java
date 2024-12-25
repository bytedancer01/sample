package p195l4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import p005a4.InterfaceC0065b;
import p122h4.C5026d;
import p362v3.C9231a;
import p362v3.C9233c;
import p362v3.C9234d;
import p363v4.C9242h;
import p396x3.InterfaceC9648e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/i.class
 */
/* renamed from: l4.i */
/* loaded from: combined.jar:classes1.jar:l4/i.class */
public class C5679i implements InterfaceC9648e<InputStream, C5672b> {

    /* renamed from: f */
    public static final b f32005f = new b();

    /* renamed from: g */
    public static final a f32006g = new a();

    /* renamed from: a */
    public final Context f32007a;

    /* renamed from: b */
    public final b f32008b;

    /* renamed from: c */
    public final InterfaceC0065b f32009c;

    /* renamed from: d */
    public final a f32010d;

    /* renamed from: e */
    public final C5671a f32011e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/i$a.class
     */
    /* renamed from: l4.i$a */
    /* loaded from: combined.jar:classes1.jar:l4/i$a.class */
    public static class a {

        /* renamed from: a */
        public final Queue<C9231a> f32012a = C9242h.m38965c(0);

        /* renamed from: a */
        public C9231a m27930a(C9231a.a aVar) {
            C9231a c9231a;
            synchronized (this) {
                C9231a poll = this.f32012a.poll();
                c9231a = poll;
                if (poll == null) {
                    c9231a = new C9231a(aVar);
                }
            }
            return c9231a;
        }

        /* renamed from: b */
        public void m27931b(C9231a c9231a) {
            synchronized (this) {
                c9231a.m38910b();
                this.f32012a.offer(c9231a);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l4/i$b.class
     */
    /* renamed from: l4.i$b */
    /* loaded from: combined.jar:classes1.jar:l4/i$b.class */
    public static class b {

        /* renamed from: a */
        public final Queue<C9234d> f32013a = C9242h.m38965c(0);

        /* renamed from: a */
        public C9234d m27932a(byte[] bArr) {
            C9234d m38939o;
            synchronized (this) {
                C9234d poll = this.f32013a.poll();
                C9234d c9234d = poll;
                if (poll == null) {
                    c9234d = new C9234d();
                }
                m38939o = c9234d.m38939o(bArr);
            }
            return m38939o;
        }

        /* renamed from: b */
        public void m27933b(C9234d c9234d) {
            synchronized (this) {
                c9234d.m38925a();
                this.f32013a.offer(c9234d);
            }
        }
    }

    public C5679i(Context context, InterfaceC0065b interfaceC0065b) {
        this(context, interfaceC0065b, f32005f, f32006g);
    }

    public C5679i(Context context, InterfaceC0065b interfaceC0065b, b bVar, a aVar) {
        this.f32007a = context.getApplicationContext();
        this.f32009c = interfaceC0065b;
        this.f32010d = aVar;
        this.f32011e = new C5671a(interfaceC0065b);
        this.f32008b = bVar;
    }

    /* renamed from: e */
    public static byte[] m27926e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e10) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e10);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5674d mo25843a(InputStream inputStream, int i10, int i11) {
        byte[] m27926e = m27926e(inputStream);
        C9234d m27932a = this.f32008b.m27932a(m27926e);
        C9231a m27930a = this.f32010d.m27930a(this.f32011e);
        try {
            return m27928c(m27926e, i10, i11, m27932a, m27930a);
        } finally {
            this.f32008b.m27933b(m27932a);
            this.f32010d.m27931b(m27930a);
        }
    }

    /* renamed from: c */
    public final C5674d m27928c(byte[] bArr, int i10, int i11, C9234d c9234d, C9231a c9231a) {
        Bitmap m27929d;
        C9233c m38927c = c9234d.m38927c();
        if (m38927c.m38923a() <= 0 || m38927c.m38924b() != 0 || (m27929d = m27929d(c9231a, m38927c, bArr)) == null) {
            return null;
        }
        return new C5674d(new C5672b(this.f32007a, this.f32011e, this.f32009c, C5026d.m25233b(), i10, i11, m38927c, bArr, m27929d));
    }

    /* renamed from: d */
    public final Bitmap m27929d(C9231a c9231a, C9233c c9233c, byte[] bArr) {
        c9231a.m38921n(c9233c, bArr);
        c9231a.m38909a();
        return c9231a.m38917i();
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return "";
    }
}
