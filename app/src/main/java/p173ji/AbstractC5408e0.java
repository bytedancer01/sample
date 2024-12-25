package p173ji;

import ci.C1117c;
import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferTable;
import java.io.File;
import java.nio.charset.Charset;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9764h;
import p411xi.C9772p;
import p411xi.InterfaceC9756b0;
import p411xi.InterfaceC9762f;
import th.C8749a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/e0.class
 */
/* renamed from: ji.e0 */
/* loaded from: combined.jar:classes2.jar:ji/e0.class */
public abstract class AbstractC5408e0 {

    /* renamed from: a */
    public static final a f30901a = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/e0$a.class
     */
    /* renamed from: ji.e0$a */
    /* loaded from: combined.jar:classes2.jar:ji/e0$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/e0$a$a.class
         */
        /* renamed from: ji.e0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ji/e0$a$a.class */
        public static final class C10305a extends AbstractC5408e0 {

            /* renamed from: b */
            public final File f30902b;

            /* renamed from: c */
            public final C5435z f30903c;

            public C10305a(File file, C5435z c5435z) {
                this.f30902b = file;
                this.f30903c = c5435z;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: a */
            public long mo22935a() {
                return this.f30902b.length();
            }

            @Override // p173ji.AbstractC5408e0
            @Nullable
            /* renamed from: b */
            public C5435z mo22936b() {
                return this.f30903c;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: i */
            public void mo22937i(@NotNull InterfaceC9762f interfaceC9762f) {
                C9367f.m39526e(interfaceC9762f, "sink");
                InterfaceC9756b0 m41236j = C9772p.m41236j(this.f30902b);
                try {
                    interfaceC9762f.mo41127I(m41236j);
                    C8749a.m37542a(m41236j, null);
                } finally {
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/e0$a$b.class
         */
        /* renamed from: ji.e0$a$b */
        /* loaded from: combined.jar:classes2.jar:ji/e0$a$b.class */
        public static final class b extends AbstractC5408e0 {

            /* renamed from: b */
            public final C9764h f30904b;

            /* renamed from: c */
            public final C5435z f30905c;

            public b(C9764h c9764h, C5435z c5435z) {
                this.f30904b = c9764h;
                this.f30905c = c5435z;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: a */
            public long mo22935a() {
                return this.f30904b.size();
            }

            @Override // p173ji.AbstractC5408e0
            @Nullable
            /* renamed from: b */
            public C5435z mo22936b() {
                return this.f30905c;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: i */
            public void mo22937i(@NotNull InterfaceC9762f interfaceC9762f) {
                C9367f.m39526e(interfaceC9762f, "sink");
                interfaceC9762f.mo41162i0(this.f30904b);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/e0$a$c.class
         */
        /* renamed from: ji.e0$a$c */
        /* loaded from: combined.jar:classes2.jar:ji/e0$a$c.class */
        public static final class c extends AbstractC5408e0 {

            /* renamed from: b */
            public final byte[] f30906b;

            /* renamed from: c */
            public final C5435z f30907c;

            /* renamed from: d */
            public final int f30908d;

            /* renamed from: e */
            public final int f30909e;

            public c(byte[] bArr, C5435z c5435z, int i10, int i11) {
                this.f30906b = bArr;
                this.f30907c = c5435z;
                this.f30908d = i10;
                this.f30909e = i11;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: a */
            public long mo22935a() {
                return this.f30908d;
            }

            @Override // p173ji.AbstractC5408e0
            @Nullable
            /* renamed from: b */
            public C5435z mo22936b() {
                return this.f30907c;
            }

            @Override // p173ji.AbstractC5408e0
            /* renamed from: i */
            public void mo22937i(@NotNull InterfaceC9762f interfaceC9762f) {
                C9367f.m39526e(interfaceC9762f, "sink");
                interfaceC9762f.write(this.f30906b, this.f30909e, this.f30908d);
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: i */
        public static /* synthetic */ AbstractC5408e0 m26901i(a aVar, String str, C5435z c5435z, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                c5435z = null;
            }
            return aVar.m26905b(str, c5435z);
        }

        /* renamed from: j */
        public static /* synthetic */ AbstractC5408e0 m26902j(a aVar, C5435z c5435z, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.m26909f(c5435z, bArr, i10, i11);
        }

        /* renamed from: k */
        public static /* synthetic */ AbstractC5408e0 m26903k(a aVar, byte[] bArr, C5435z c5435z, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                c5435z = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m26911h(bArr, c5435z, i10, i11);
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC5408e0 m26904a(@NotNull File file, @Nullable C5435z c5435z) {
            C9367f.m39526e(file, "$this$asRequestBody");
            return new C10305a(file, c5435z);
        }

        @NotNull
        /* renamed from: b */
        public final AbstractC5408e0 m26905b(@NotNull String str, @Nullable C5435z c5435z) {
            C9367f.m39526e(str, "$this$toRequestBody");
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
            byte[] bytes = str.getBytes(charset2);
            C9367f.m39525d(bytes, "(this as java.lang.String).getBytes(charset)");
            return m26911h(bytes, c5435z2, 0, bytes.length);
        }

        @NotNull
        /* renamed from: c */
        public final AbstractC5408e0 m26906c(@Nullable C5435z c5435z, @NotNull File file) {
            C9367f.m39526e(file, TransferTable.COLUMN_FILE);
            return m26904a(file, c5435z);
        }

        @NotNull
        /* renamed from: d */
        public final AbstractC5408e0 m26907d(@Nullable C5435z c5435z, @NotNull String str) {
            C9367f.m39526e(str, "content");
            return m26905b(str, c5435z);
        }

        @NotNull
        /* renamed from: e */
        public final AbstractC5408e0 m26908e(@Nullable C5435z c5435z, @NotNull C9764h c9764h) {
            C9367f.m39526e(c9764h, "content");
            return m26910g(c9764h, c5435z);
        }

        @NotNull
        /* renamed from: f */
        public final AbstractC5408e0 m26909f(@Nullable C5435z c5435z, @NotNull byte[] bArr, int i10, int i11) {
            C9367f.m39526e(bArr, "content");
            return m26911h(bArr, c5435z, i10, i11);
        }

        @NotNull
        /* renamed from: g */
        public final AbstractC5408e0 m26910g(@NotNull C9764h c9764h, @Nullable C5435z c5435z) {
            C9367f.m39526e(c9764h, "$this$toRequestBody");
            return new b(c9764h, c5435z);
        }

        @NotNull
        /* renamed from: h */
        public final AbstractC5408e0 m26911h(@NotNull byte[] bArr, @Nullable C5435z c5435z, int i10, int i11) {
            C9367f.m39526e(bArr, "$this$toRequestBody");
            C5634b.m27789i(bArr.length, i10, i11);
            return new c(bArr, c5435z, i11, i10);
        }
    }

    @NotNull
    /* renamed from: c */
    public static final AbstractC5408e0 m26895c(@Nullable C5435z c5435z, @NotNull File file) {
        return f30901a.m26906c(c5435z, file);
    }

    @NotNull
    /* renamed from: d */
    public static final AbstractC5408e0 m26896d(@Nullable C5435z c5435z, @NotNull String str) {
        return f30901a.m26907d(c5435z, str);
    }

    @NotNull
    /* renamed from: e */
    public static final AbstractC5408e0 m26897e(@Nullable C5435z c5435z, @NotNull C9764h c9764h) {
        return f30901a.m26908e(c5435z, c9764h);
    }

    @NotNull
    /* renamed from: f */
    public static final AbstractC5408e0 m26898f(@Nullable C5435z c5435z, @NotNull byte[] bArr) {
        return a.m26902j(f30901a, c5435z, bArr, 0, 0, 12, null);
    }

    /* renamed from: a */
    public long mo22935a() {
        return -1L;
    }

    @Nullable
    /* renamed from: b */
    public abstract C5435z mo22936b();

    /* renamed from: g */
    public boolean m26899g() {
        return false;
    }

    /* renamed from: h */
    public boolean m26900h() {
        return false;
    }

    /* renamed from: i */
    public abstract void mo22937i(@NotNull InterfaceC9762f interfaceC9762f);
}
