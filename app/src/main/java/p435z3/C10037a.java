package p435z3;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p022b4.InterfaceC0791a;
import p225n4.InterfaceC6650c;
import p280q4.InterfaceC7753b;
import p329t3.EnumC8619i;
import p363v4.C9238d;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9646c;
import p396x3.InterfaceC9650g;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/a.class
 */
/* renamed from: z3.a */
/* loaded from: combined.jar:classes1.jar:z3/a.class */
public class C10037a<A, T, Z> {

    /* renamed from: m */
    public static final b f46034m = new b();

    /* renamed from: a */
    public final C10042f f46035a;

    /* renamed from: b */
    public final int f46036b;

    /* renamed from: c */
    public final int f46037c;

    /* renamed from: d */
    public final InterfaceC9817c<A> f46038d;

    /* renamed from: e */
    public final InterfaceC7753b<A, T> f46039e;

    /* renamed from: f */
    public final InterfaceC9650g<T> f46040f;

    /* renamed from: g */
    public final InterfaceC6650c<T, Z> f46041g;

    /* renamed from: h */
    public final a f46042h;

    /* renamed from: i */
    public final EnumC10038b f46043i;

    /* renamed from: j */
    public final EnumC8619i f46044j;

    /* renamed from: k */
    public final b f46045k;

    /* renamed from: l */
    public volatile boolean f46046l;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/a$a.class
     */
    /* renamed from: z3.a$a */
    /* loaded from: combined.jar:classes1.jar:z3/a$a.class */
    public interface a {
        /* renamed from: a */
        InterfaceC0791a mo42221a();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/a$b.class
     */
    /* renamed from: z3.a$b */
    /* loaded from: combined.jar:classes1.jar:z3/a$b.class */
    public static class b {
        /* renamed from: a */
        public OutputStream m42222a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/a$c.class
     */
    /* renamed from: z3.a$c */
    /* loaded from: combined.jar:classes1.jar:z3/a$c.class */
    public class c<DataType> implements InterfaceC0791a.b {

        /* renamed from: a */
        public final InterfaceC9645b<DataType> f46047a;

        /* renamed from: b */
        public final DataType f46048b;

        /* renamed from: c */
        public final C10037a f46049c;

        public c(C10037a c10037a, InterfaceC9645b<DataType> interfaceC9645b, DataType datatype) {
            this.f46049c = c10037a;
            this.f46047a = interfaceC9645b;
            this.f46048b = datatype;
        }

        @Override // p022b4.InterfaceC0791a.b
        /* renamed from: a */
        public boolean mo5092a(File file) {
            boolean z10;
            OutputStream outputStream = null;
            OutputStream outputStream2 = null;
            try {
                try {
                    OutputStream m42222a = this.f46049c.f46045k.m42222a(file);
                    outputStream2 = m42222a;
                    outputStream = m42222a;
                    boolean mo23245a = this.f46047a.mo23245a(this.f46048b, m42222a);
                    z10 = mo23245a;
                    if (m42222a != null) {
                        try {
                            m42222a.close();
                            z10 = mo23245a;
                        } catch (IOException e10) {
                            z10 = mo23245a;
                        }
                    }
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        OutputStream outputStream3 = outputStream;
                        Log.d("DecodeJob", "Failed to find file to write to disk cache", e11);
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e12) {
                        }
                    }
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e13) {
                    }
                }
                throw th2;
            }
        }
    }

    public C10037a(C10042f c10042f, int i10, int i11, InterfaceC9817c<A> interfaceC9817c, InterfaceC7753b<A, T> interfaceC7753b, InterfaceC9650g<T> interfaceC9650g, InterfaceC6650c<T, Z> interfaceC6650c, a aVar, EnumC10038b enumC10038b, EnumC8619i enumC8619i) {
        this(c10042f, i10, i11, interfaceC9817c, interfaceC7753b, interfaceC9650g, interfaceC6650c, aVar, enumC10038b, enumC8619i, f46034m);
    }

    public C10037a(C10042f c10042f, int i10, int i11, InterfaceC9817c<A> interfaceC9817c, InterfaceC7753b<A, T> interfaceC7753b, InterfaceC9650g<T> interfaceC9650g, InterfaceC6650c<T, Z> interfaceC6650c, a aVar, EnumC10038b enumC10038b, EnumC8619i enumC8619i, b bVar) {
        this.f46035a = c10042f;
        this.f46036b = i10;
        this.f46037c = i11;
        this.f46038d = interfaceC9817c;
        this.f46039e = interfaceC7753b;
        this.f46040f = interfaceC9650g;
        this.f46041g = interfaceC6650c;
        this.f46042h = aVar;
        this.f46043i = enumC10038b;
        this.f46044j = enumC8619i;
        this.f46045k = bVar;
    }

    /* renamed from: b */
    public final InterfaceC10048l<T> m42208b(A a10) {
        long m38952b = C9238d.m38952b();
        this.f46042h.mo42221a().mo5090b(this.f46035a.m42248b(), new c(this, this.f46039e.mo25839a(), a10));
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Wrote source to cache", m38952b);
        }
        long m38952b2 = C9238d.m38952b();
        InterfaceC10048l<T> m42215i = m42215i(this.f46035a.m42248b());
        if (Log.isLoggable("DecodeJob", 2) && m42215i != null) {
            m42216j("Decoded source from cache", m38952b2);
        }
        return m42215i;
    }

    /* renamed from: c */
    public void m42209c() {
        this.f46046l = true;
        this.f46038d.cancel();
    }

    /* renamed from: d */
    public InterfaceC10048l<Z> m42210d() {
        return m42219m(m42213g());
    }

    /* renamed from: e */
    public final InterfaceC10048l<T> m42211e(A a10) {
        InterfaceC10048l<T> interfaceC10048l;
        if (this.f46043i.cacheSource()) {
            interfaceC10048l = m42208b(a10);
        } else {
            long m38952b = C9238d.m38952b();
            InterfaceC10048l<T> mo25843a = this.f46039e.mo25841d().mo25843a(a10, this.f46036b, this.f46037c);
            interfaceC10048l = mo25843a;
            if (Log.isLoggable("DecodeJob", 2)) {
                m42216j("Decoded from source", m38952b);
                interfaceC10048l = mo25843a;
            }
        }
        return interfaceC10048l;
    }

    /* renamed from: f */
    public InterfaceC10048l<Z> m42212f() {
        if (!this.f46043i.cacheResult()) {
            return null;
        }
        long m38952b = C9238d.m38952b();
        InterfaceC10048l<T> m42215i = m42215i(this.f46035a);
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Decoded transformed from cache", m38952b);
        }
        long m38952b2 = C9238d.m38952b();
        InterfaceC10048l<Z> m42217k = m42217k(m42215i);
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Transcoded transformed from cache", m38952b2);
        }
        return m42217k;
    }

    /* renamed from: g */
    public final InterfaceC10048l<T> m42213g() {
        try {
            long m38952b = C9238d.m38952b();
            A mo23241b = this.f46038d.mo23241b(this.f46044j);
            if (Log.isLoggable("DecodeJob", 2)) {
                m42216j("Fetched data", m38952b);
            }
            if (!this.f46046l) {
                return m42211e(mo23241b);
            }
            this.f46038d.mo23240a();
            return null;
        } finally {
            this.f46038d.mo23240a();
        }
    }

    /* renamed from: h */
    public InterfaceC10048l<Z> m42214h() {
        if (!this.f46043i.cacheSource()) {
            return null;
        }
        long m38952b = C9238d.m38952b();
        InterfaceC10048l<T> m42215i = m42215i(this.f46035a.m42248b());
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Decoded source from cache", m38952b);
        }
        return m42219m(m42215i);
    }

    /* renamed from: i */
    public final InterfaceC10048l<T> m42215i(InterfaceC9646c interfaceC9646c) {
        File mo5089a = this.f46042h.mo42221a().mo5089a(interfaceC9646c);
        if (mo5089a == null) {
            return null;
        }
        try {
            InterfaceC10048l<T> mo25843a = this.f46039e.mo25842e().mo25843a(mo5089a, this.f46036b, this.f46037c);
            if (mo25843a == null) {
            }
            return mo25843a;
        } finally {
            this.f46042h.mo42221a().mo5091c(interfaceC9646c);
        }
    }

    /* renamed from: j */
    public final void m42216j(String str, long j10) {
        Log.v("DecodeJob", str + " in " + C9238d.m38951a(j10) + ", key: " + this.f46035a);
    }

    /* renamed from: k */
    public final InterfaceC10048l<Z> m42217k(InterfaceC10048l<T> interfaceC10048l) {
        if (interfaceC10048l == null) {
            return null;
        }
        return this.f46041g.mo30651a(interfaceC10048l);
    }

    /* renamed from: l */
    public final InterfaceC10048l<T> m42218l(InterfaceC10048l<T> interfaceC10048l) {
        if (interfaceC10048l == null) {
            return null;
        }
        InterfaceC10048l<T> mo25234a = this.f46040f.mo25234a(interfaceC10048l, this.f46036b, this.f46037c);
        if (!interfaceC10048l.equals(mo25234a)) {
            interfaceC10048l.mo25232b();
        }
        return mo25234a;
    }

    /* renamed from: m */
    public final InterfaceC10048l<Z> m42219m(InterfaceC10048l<T> interfaceC10048l) {
        long m38952b = C9238d.m38952b();
        InterfaceC10048l<T> m42218l = m42218l(interfaceC10048l);
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Transformed resource from source", m38952b);
        }
        m42220n(m42218l);
        long m38952b2 = C9238d.m38952b();
        InterfaceC10048l<Z> m42217k = m42217k(m42218l);
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Transcoded transformed from source", m38952b2);
        }
        return m42217k;
    }

    /* renamed from: n */
    public final void m42220n(InterfaceC10048l<T> interfaceC10048l) {
        if (interfaceC10048l == null || !this.f46043i.cacheResult()) {
            return;
        }
        long m38952b = C9238d.m38952b();
        this.f46042h.mo42221a().mo5090b(this.f46035a, new c(this, this.f46039e.mo25840c(), interfaceC10048l));
        if (Log.isLoggable("DecodeJob", 2)) {
            m42216j("Wrote transformed from source to cache", m38952b);
        }
    }
}
