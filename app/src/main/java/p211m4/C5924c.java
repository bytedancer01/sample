package p211m4;

import android.graphics.Bitmap;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p073e4.C4612g;
import p142i4.C5172c;
import p142i4.C5181l;
import p142i4.C5184o;
import p195l4.C5672b;
import p363v4.C9235a;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/c.class
 */
/* renamed from: m4.c */
/* loaded from: combined.jar:classes1.jar:m4/c.class */
public class C5924c implements InterfaceC9648e<C4612g, C5922a> {

    /* renamed from: g */
    public static final b f33296g = new b();

    /* renamed from: h */
    public static final a f33297h = new a();

    /* renamed from: a */
    public final InterfaceC9648e<C4612g, Bitmap> f33298a;

    /* renamed from: b */
    public final InterfaceC9648e<InputStream, C5672b> f33299b;

    /* renamed from: c */
    public final InterfaceC0065b f33300c;

    /* renamed from: d */
    public final b f33301d;

    /* renamed from: e */
    public final a f33302e;

    /* renamed from: f */
    public String f33303f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m4/c$a.class
     */
    /* renamed from: m4.c$a */
    /* loaded from: combined.jar:classes1.jar:m4/c$a.class */
    public static class a {
        /* renamed from: a */
        public InputStream m29179a(InputStream inputStream, byte[] bArr) {
            return new C5184o(inputStream, bArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m4/c$b.class
     */
    /* renamed from: m4.c$b */
    /* loaded from: combined.jar:classes1.jar:m4/c$b.class */
    public static class b {
        /* renamed from: a */
        public C5181l.a m29180a(InputStream inputStream) {
            return new C5181l(inputStream).m25856d();
        }
    }

    public C5924c(InterfaceC9648e<C4612g, Bitmap> interfaceC9648e, InterfaceC9648e<InputStream, C5672b> interfaceC9648e2, InterfaceC0065b interfaceC0065b) {
        this(interfaceC9648e, interfaceC9648e2, interfaceC0065b, f33296g, f33297h);
    }

    public C5924c(InterfaceC9648e<C4612g, Bitmap> interfaceC9648e, InterfaceC9648e<InputStream, C5672b> interfaceC9648e2, InterfaceC0065b interfaceC0065b, b bVar, a aVar) {
        this.f33298a = interfaceC9648e;
        this.f33299b = interfaceC9648e2;
        this.f33300c = interfaceC0065b;
        this.f33301d = bVar;
        this.f33302e = aVar;
    }

    /* renamed from: b */
    public final C5922a m29174b(C4612g c4612g, int i10, int i11, byte[] bArr) {
        return c4612g.m23244b() != null ? m29178f(c4612g, i10, i11, bArr) : m29176d(c4612g, i10, i11);
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<C5922a> mo25843a(C4612g c4612g, int i10, int i11) {
        C9235a m38942a = C9235a.m38942a();
        byte[] m38943b = m38942a.m38943b();
        try {
            C5922a m29174b = m29174b(c4612g, i10, i11, m38943b);
            return m29174b != null ? new C5923b(m29174b) : null;
        } finally {
            m38942a.m38944c(m38943b);
        }
    }

    /* renamed from: d */
    public final C5922a m29176d(C4612g c4612g, int i10, int i11) {
        InterfaceC10048l<Bitmap> mo25843a = this.f33298a.mo25843a(c4612g, i10, i11);
        C5922a c5922a = null;
        if (mo25843a != null) {
            c5922a = new C5922a(mo25843a, null);
        }
        return c5922a;
    }

    /* renamed from: e */
    public final C5922a m29177e(InputStream inputStream, int i10, int i11) {
        InterfaceC10048l<C5672b> mo25843a = this.f33299b.mo25843a(inputStream, i10, i11);
        C5922a c5922a = null;
        if (mo25843a != null) {
            C5672b c5672b = mo25843a.get();
            c5922a = c5672b.m27904f() > 1 ? new C5922a(null, mo25843a) : new C5922a(new C5172c(c5672b.m27903e(), this.f33300c), null);
        }
        return c5922a;
    }

    /* renamed from: f */
    public final C5922a m29178f(C4612g c4612g, int i10, int i11, byte[] bArr) {
        InputStream m29179a = this.f33302e.m29179a(c4612g.m23244b(), bArr);
        m29179a.mark(2048);
        C5181l.a m29180a = this.f33301d.m29180a(m29179a);
        m29179a.reset();
        C5922a m29177e = m29180a == C5181l.a.GIF ? m29177e(m29179a, i10, i11) : null;
        C5922a c5922a = m29177e;
        if (m29177e == null) {
            c5922a = m29176d(new C4612g(m29179a, c4612g.m23243a()), i10, i11);
        }
        return c5922a;
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        if (this.f33303f == null) {
            this.f33303f = this.f33299b.getId() + this.f33298a.getId();
        }
        return this.f33303f;
    }
}
