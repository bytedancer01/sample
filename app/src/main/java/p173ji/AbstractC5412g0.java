package p173ji;

import ci.C1117c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.InterfaceC9763g;
import th.C8749a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/g0.class
 */
/* renamed from: ji.g0 */
/* loaded from: combined.jar:classes2.jar:ji/g0.class */
public abstract class AbstractC5412g0 implements Closeable {

    /* renamed from: c */
    public static final b f30948c = new b(null);

    /* renamed from: b */
    public Reader f30949b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g0$a.class
     */
    /* renamed from: ji.g0$a */
    /* loaded from: combined.jar:classes2.jar:ji/g0$a.class */
    public static final class a extends Reader {

        /* renamed from: b */
        public boolean f30950b;

        /* renamed from: c */
        public Reader f30951c;

        /* renamed from: d */
        public final InterfaceC9763g f30952d;

        /* renamed from: e */
        public final Charset f30953e;

        public a(@NotNull InterfaceC9763g interfaceC9763g, @NotNull Charset charset) {
            C9367f.m39526e(interfaceC9763g, "source");
            C9367f.m39526e(charset, "charset");
            this.f30952d = interfaceC9763g;
            this.f30953e = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f30950b = true;
            Reader reader = this.f30951c;
            if (reader != null) {
                reader.close();
            } else {
                this.f30952d.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cArr, int i10, int i11) {
            C9367f.m39526e(cArr, "cbuf");
            if (this.f30950b) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f30951c;
            if (reader == null) {
                reader = new InputStreamReader(this.f30952d.inputStream(), C5634b.m27762F(this.f30952d, this.f30953e));
                this.f30951c = reader;
            }
            return reader.read(cArr, i10, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g0$b.class
     */
    /* renamed from: ji.g0$b */
    /* loaded from: combined.jar:classes2.jar:ji/g0$b.class */
    public static final class b {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/g0$b$a.class
         */
        /* renamed from: ji.g0$b$a */
        /* loaded from: combined.jar:classes2.jar:ji/g0$b$a.class */
        public static final class a extends AbstractC5412g0 {

            /* renamed from: d */
            public final InterfaceC9763g f30954d;

            /* renamed from: e */
            public final C5435z f30955e;

            /* renamed from: f */
            public final long f30956f;

            public a(InterfaceC9763g interfaceC9763g, C5435z c5435z, long j10) {
                this.f30954d = interfaceC9763g;
                this.f30955e = c5435z;
                this.f30956f = j10;
            }

            @Override // p173ji.AbstractC5412g0
            /* renamed from: o */
            public long mo22897o() {
                return this.f30956f;
            }

            @Override // p173ji.AbstractC5412g0
            @Nullable
            /* renamed from: p */
            public C5435z mo22898p() {
                return this.f30955e;
            }

            @Override // p173ji.AbstractC5412g0
            @NotNull
            /* renamed from: v */
            public InterfaceC9763g mo22899v() {
                return this.f30954d;
            }
        }

        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC5412g0 m26969e(b bVar, byte[] bArr, C5435z c5435z, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c5435z = null;
            }
            return bVar.m26973d(bArr, c5435z);
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC5412g0 m26970a(@NotNull String str, @Nullable C5435z c5435z) {
            C9367f.m39526e(str, "$this$toResponseBody");
            Charset charset = C1117c.f7455b;
            Charset charset2 = charset;
            C5435z c5435z2 = c5435z;
            if (c5435z != null) {
                charset2 = C5435z.m27172d(c5435z, null, 1, null);
                if (charset2 == null) {
                    c5435z2 = C5435z.f31169g.m27179b(c5435z + "; charset=utf-8");
                    charset2 = charset;
                } else {
                    c5435z2 = c5435z;
                }
            }
            C9761e m41157e1 = new C9761e().m41157e1(str, charset2);
            return m26972c(m41157e1, c5435z2, m41157e1.size());
        }

        @NotNull
        /* renamed from: b */
        public final AbstractC5412g0 m26971b(@Nullable C5435z c5435z, long j10, @NotNull InterfaceC9763g interfaceC9763g) {
            C9367f.m39526e(interfaceC9763g, "content");
            return m26972c(interfaceC9763g, c5435z, j10);
        }

        @NotNull
        /* renamed from: c */
        public final AbstractC5412g0 m26972c(@NotNull InterfaceC9763g interfaceC9763g, @Nullable C5435z c5435z, long j10) {
            C9367f.m39526e(interfaceC9763g, "$this$asResponseBody");
            return new a(interfaceC9763g, c5435z, j10);
        }

        @NotNull
        /* renamed from: d */
        public final AbstractC5412g0 m26973d(@NotNull byte[] bArr, @Nullable C5435z c5435z) {
            C9367f.m39526e(bArr, "$this$toResponseBody");
            return m26972c(new C9761e().write(bArr), c5435z, bArr.length);
        }
    }

    @NotNull
    /* renamed from: q */
    public static final AbstractC5412g0 m26964q(@NotNull String str, @Nullable C5435z c5435z) {
        return f30948c.m26970a(str, c5435z);
    }

    @NotNull
    /* renamed from: t */
    public static final AbstractC5412g0 m26965t(@Nullable C5435z c5435z, long j10, @NotNull InterfaceC9763g interfaceC9763g) {
        return f30948c.m26971b(c5435z, j10, interfaceC9763g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C5634b.m27790j(mo22899v());
    }

    @NotNull
    /* renamed from: f */
    public final Reader m26966f() {
        Reader reader = this.f30949b;
        if (reader == null) {
            reader = new a(mo22899v(), m26967l());
            this.f30949b = reader;
        }
        return reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 != null) goto L8;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset m26967l() {
        /*
            r3 = this;
            r0 = r3
            ji.z r0 = r0.mo22898p()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L18
            r0 = r4
            java.nio.charset.Charset r1 = ci.C1117c.f7455b
            java.nio.charset.Charset r0 = r0.m27175c(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L18
            goto L1c
        L18:
            java.nio.charset.Charset r0 = ci.C1117c.f7455b
            r4 = r0
        L1c:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p173ji.AbstractC5412g0.m26967l():java.nio.charset.Charset");
    }

    /* renamed from: o */
    public abstract long mo22897o();

    @Nullable
    /* renamed from: p */
    public abstract C5435z mo22898p();

    @NotNull
    /* renamed from: v */
    public abstract InterfaceC9763g mo22899v();

    @NotNull
    /* renamed from: w */
    public final String m26968w() {
        InterfaceC9763g mo22899v = mo22899v();
        try {
            String mo41172r0 = mo22899v.mo41172r0(C5634b.m27762F(mo22899v, m26967l()));
            C8749a.m37542a(mo22899v, null);
            return mo41172r0;
        } finally {
        }
    }
}
