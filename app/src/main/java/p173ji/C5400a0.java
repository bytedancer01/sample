package p173ji;

import com.amazonaws.services.p045s3.Headers;
import java.util.ArrayList;
import java.util.List;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.AbstractC5408e0;
import p173ji.C5432w;
import p173ji.C5435z;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import p411xi.C9764h;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/a0.class
 */
/* renamed from: ji.a0 */
/* loaded from: combined.jar:classes2.jar:ji/a0.class */
public final class C5400a0 extends AbstractC5408e0 {

    /* renamed from: g */
    @NotNull
    public static final C5435z f30782g;

    /* renamed from: h */
    @NotNull
    public static final C5435z f30783h;

    /* renamed from: i */
    @NotNull
    public static final C5435z f30784i;

    /* renamed from: j */
    @NotNull
    public static final C5435z f30785j;

    /* renamed from: k */
    @NotNull
    public static final C5435z f30786k;

    /* renamed from: l */
    public static final byte[] f30787l;

    /* renamed from: m */
    public static final byte[] f30788m;

    /* renamed from: n */
    public static final byte[] f30789n;

    /* renamed from: o */
    public static final b f30790o = new b(null);

    /* renamed from: b */
    public final C5435z f30791b;

    /* renamed from: c */
    public long f30792c;

    /* renamed from: d */
    public final C9764h f30793d;

    /* renamed from: e */
    @NotNull
    public final C5435z f30794e;

    /* renamed from: f */
    @NotNull
    public final List<c> f30795f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/a0$a.class
     */
    /* renamed from: ji.a0$a */
    /* loaded from: combined.jar:classes2.jar:ji/a0$a.class */
    public static final class a {

        /* renamed from: a */
        public final C9764h f30796a;

        /* renamed from: b */
        public C5435z f30797b;

        /* renamed from: c */
        public final List<c> f30798c;

        public a() {
            this(null, 1, null);
        }

        public a(@NotNull String str) {
            C9367f.m39526e(str, "boundary");
            this.f30796a = C9764h.f44531f.m41212d(str);
            this.f30797b = C5400a0.f30782g;
            this.f30798c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(java.lang.String r4, int r5, p372vh.C9365d r6) {
            /*
                r3 = this;
                r0 = r5
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L13
                java.util.UUID r0 = java.util.UUID.randomUUID()
                java.lang.String r0 = r0.toString()
                r4 = r0
                r0 = r4
                java.lang.String r1 = "UUID.randomUUID().toString()"
                p372vh.C9367f.m39525d(r0, r1)
            L13:
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5400a0.a.<init>(java.lang.String, int, vh.d):void");
        }

        @NotNull
        /* renamed from: a */
        public final a m26763a(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            m26766d(c.f30799c.m26773b(str, str2));
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final a m26764b(@NotNull String str, @Nullable String str2, @NotNull AbstractC5408e0 abstractC5408e0) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(abstractC5408e0, "body");
            m26766d(c.f30799c.m26774c(str, str2, abstractC5408e0));
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final a m26765c(@Nullable C5432w c5432w, @NotNull AbstractC5408e0 abstractC5408e0) {
            C9367f.m39526e(abstractC5408e0, "body");
            m26766d(c.f30799c.m26772a(c5432w, abstractC5408e0));
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final a m26766d(@NotNull c cVar) {
            C9367f.m39526e(cVar, "part");
            this.f30798c.add(cVar);
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C5400a0 m26767e() {
            if (!this.f30798c.isEmpty()) {
                return new C5400a0(this.f30796a, this.f30797b, C5634b.m27773Q(this.f30798c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        /* renamed from: f */
        public final a m26768f(@NotNull C5435z c5435z) {
            C9367f.m39526e(c5435z, "type");
            if (C9367f.m39522a(c5435z.m27177h(), "multipart")) {
                this.f30797b = c5435z;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + c5435z).toString());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/a0$b.class
     */
    /* renamed from: ji.a0$b */
    /* loaded from: combined.jar:classes2.jar:ji/a0$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final void m26769a(@NotNull StringBuilder sb2, @NotNull String str) {
            String str2;
            C9367f.m39526e(sb2, "$this$appendQuotedString");
            C9367f.m39526e(str, "key");
            sb2.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == '\n') {
                    str2 = "%0A";
                } else if (charAt == '\r') {
                    str2 = "%0D";
                } else if (charAt != '\"') {
                    sb2.append(charAt);
                } else {
                    str2 = "%22";
                }
                sb2.append(str2);
            }
            sb2.append('\"');
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/a0$c.class
     */
    /* renamed from: ji.a0$c */
    /* loaded from: combined.jar:classes2.jar:ji/a0$c.class */
    public static final class c {

        /* renamed from: c */
        public static final a f30799c = new a(null);

        /* renamed from: a */
        @Nullable
        public final C5432w f30800a;

        /* renamed from: b */
        @NotNull
        public final AbstractC5408e0 f30801b;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/a0$c$a.class
         */
        /* renamed from: ji.a0$c$a */
        /* loaded from: combined.jar:classes2.jar:ji/a0$c$a.class */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C9365d c9365d) {
                this();
            }

            @NotNull
            /* renamed from: a */
            public final c m26772a(@Nullable C5432w c5432w, @NotNull AbstractC5408e0 abstractC5408e0) {
                C9367f.m39526e(abstractC5408e0, "body");
                if (!((c5432w != null ? c5432w.m27081a("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((c5432w != null ? c5432w.m27081a("Content-Length") : null) == null) {
                    return new c(c5432w, abstractC5408e0, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @NotNull
            /* renamed from: b */
            public final c m26773b(@NotNull String str, @NotNull String str2) {
                C9367f.m39526e(str, "name");
                C9367f.m39526e(str2, "value");
                return m26774c(str, null, AbstractC5408e0.a.m26901i(AbstractC5408e0.f30901a, str2, null, 1, null));
            }

            @NotNull
            /* renamed from: c */
            public final c m26774c(@NotNull String str, @Nullable String str2, @NotNull AbstractC5408e0 abstractC5408e0) {
                C9367f.m39526e(str, "name");
                C9367f.m39526e(abstractC5408e0, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = C5400a0.f30790o;
                bVar.m26769a(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    bVar.m26769a(sb2, str2);
                }
                String sb3 = sb2.toString();
                C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
                return m26772a(new C5432w.a().m27091e(Headers.CONTENT_DISPOSITION, sb3).m27092f(), abstractC5408e0);
            }
        }

        public c(C5432w c5432w, AbstractC5408e0 abstractC5408e0) {
            this.f30800a = c5432w;
            this.f30801b = abstractC5408e0;
        }

        public /* synthetic */ c(C5432w c5432w, AbstractC5408e0 abstractC5408e0, C9365d c9365d) {
            this(c5432w, abstractC5408e0);
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC5408e0 m26770a() {
            return this.f30801b;
        }

        @Nullable
        /* renamed from: b */
        public final C5432w m26771b() {
            return this.f30800a;
        }
    }

    static {
        C5435z.a aVar = C5435z.f31169g;
        f30782g = aVar.m27178a("multipart/mixed");
        f30783h = aVar.m27178a("multipart/alternative");
        f30784i = aVar.m27178a("multipart/digest");
        f30785j = aVar.m27178a("multipart/parallel");
        f30786k = aVar.m27178a("multipart/form-data");
        f30787l = new byte[]{(byte) 58, (byte) 32};
        f30788m = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f30789n = new byte[]{b10, b10};
    }

    public C5400a0(@NotNull C9764h c9764h, @NotNull C5435z c5435z, @NotNull List<c> list) {
        C9367f.m39526e(c9764h, "boundaryByteString");
        C9367f.m39526e(c5435z, "type");
        C9367f.m39526e(list, "parts");
        this.f30793d = c9764h;
        this.f30794e = c5435z;
        this.f30795f = list;
        this.f30791b = C5435z.f31169g.m27178a(c5435z + "; boundary=" + m26761j());
        this.f30792c = -1L;
    }

    @Override // p173ji.AbstractC5408e0
    /* renamed from: a */
    public long mo22935a() {
        long j10 = this.f30792c;
        long j11 = j10;
        if (j10 == -1) {
            j11 = m26762k(null, true);
            this.f30792c = j11;
        }
        return j11;
    }

    @Override // p173ji.AbstractC5408e0
    @NotNull
    /* renamed from: b */
    public C5435z mo22936b() {
        return this.f30791b;
    }

    @Override // p173ji.AbstractC5408e0
    /* renamed from: i */
    public void mo22937i(@NotNull InterfaceC9762f interfaceC9762f) {
        C9367f.m39526e(interfaceC9762f, "sink");
        m26762k(interfaceC9762f, false);
    }

    @NotNull
    /* renamed from: j */
    public final String m26761j() {
        return this.f30793d.m41188D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final long m26762k(InterfaceC9762f interfaceC9762f, boolean z10) {
        InterfaceC9762f interfaceC9762f2;
        if (z10) {
            interfaceC9762f = new C9761e();
            interfaceC9762f2 = interfaceC9762f;
        } else {
            interfaceC9762f2 = null;
        }
        int size = this.f30795f.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f30795f.get(i10);
            C5432w m26771b = cVar.m26771b();
            AbstractC5408e0 m26770a = cVar.m26770a();
            C9367f.m39524c(interfaceC9762f);
            interfaceC9762f.write(f30789n);
            interfaceC9762f.mo41162i0(this.f30793d);
            interfaceC9762f.write(f30788m);
            if (m26771b != null) {
                int size2 = m26771b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC9762f.mo41136Q(m26771b.m27082b(i11)).write(f30787l).mo41136Q(m26771b.m27085h(i11)).write(f30788m);
                }
            }
            C5435z mo22936b = m26770a.mo22936b();
            if (mo22936b != null) {
                interfaceC9762f.mo41136Q("Content-Type: ").mo41136Q(mo22936b.toString()).write(f30788m);
            }
            long mo22935a = m26770a.mo22935a();
            if (mo22935a != -1) {
                interfaceC9762f.mo41136Q("Content-Length: ").mo41155d0(mo22935a).write(f30788m);
            } else if (z10) {
                C9367f.m39524c(interfaceC9762f2);
                interfaceC9762f2.m41165l();
                return -1L;
            }
            byte[] bArr = f30788m;
            interfaceC9762f.write(bArr);
            if (z10) {
                j10 += mo22935a;
            } else {
                m26770a.mo22937i(interfaceC9762f);
            }
            interfaceC9762f.write(bArr);
        }
        C9367f.m39524c(interfaceC9762f);
        byte[] bArr2 = f30789n;
        interfaceC9762f.write(bArr2);
        interfaceC9762f.mo41162i0(this.f30793d);
        interfaceC9762f.write(bArr2);
        interfaceC9762f.write(f30788m);
        long j11 = j10;
        if (z10) {
            C9367f.m39524c(interfaceC9762f2);
            j11 = j10 + interfaceC9762f2.size();
            interfaceC9762f2.m41165l();
        }
        return j11;
    }
}
