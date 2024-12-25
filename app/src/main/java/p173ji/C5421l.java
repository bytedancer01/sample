package p173ji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kh.C5624r;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205lh.C5879a;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/l.class
 */
/* renamed from: ji.l */
/* loaded from: combined.jar:classes2.jar:ji/l.class */
public final class C5421l {

    /* renamed from: e */
    public static final C5415i[] f31086e;

    /* renamed from: f */
    public static final C5415i[] f31087f;

    /* renamed from: g */
    @NotNull
    public static final C5421l f31088g;

    /* renamed from: h */
    @NotNull
    public static final C5421l f31089h;

    /* renamed from: i */
    @NotNull
    public static final C5421l f31090i;

    /* renamed from: j */
    @NotNull
    public static final C5421l f31091j;

    /* renamed from: k */
    public static final b f31092k = new b(null);

    /* renamed from: a */
    public final boolean f31093a;

    /* renamed from: b */
    public final boolean f31094b;

    /* renamed from: c */
    public final String[] f31095c;

    /* renamed from: d */
    public final String[] f31096d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/l$a.class
     */
    /* renamed from: ji.l$a */
    /* loaded from: combined.jar:classes2.jar:ji/l$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f31097a;

        /* renamed from: b */
        @Nullable
        public String[] f31098b;

        /* renamed from: c */
        @Nullable
        public String[] f31099c;

        /* renamed from: d */
        public boolean f31100d;

        public a(@NotNull C5421l c5421l) {
            C9367f.m39526e(c5421l, "connectionSpec");
            this.f31097a = c5421l.m26999f();
            this.f31098b = c5421l.f31095c;
            this.f31099c = c5421l.f31096d;
            this.f31100d = c5421l.m27001h();
        }

        public a(boolean z10) {
            this.f31097a = z10;
        }

        @NotNull
        /* renamed from: a */
        public final C5421l m27003a() {
            return new C5421l(this.f31097a, this.f31100d, this.f31098b, this.f31099c);
        }

        @NotNull
        /* renamed from: b */
        public final a m27004b(@NotNull String... strArr) {
            C9367f.m39526e(strArr, "cipherSuites");
            if (!this.f31097a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f31098b = (String[]) clone;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final a m27005c(@NotNull C5415i... c5415iArr) {
            C9367f.m39526e(c5415iArr, "cipherSuites");
            if (!this.f31097a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c5415iArr.length);
            for (C5415i c5415i : c5415iArr) {
                arrayList.add(c5415i.m26983c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return m27004b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        /* renamed from: d */
        public final a m27006d(boolean z10) {
            if (!this.f31097a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f31100d = z10;
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final a m27007e(@NotNull String... strArr) {
            C9367f.m39526e(strArr, "tlsVersions");
            if (!this.f31097a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f31099c = (String[]) clone;
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final a m27008f(@NotNull EnumC5416i0... enumC5416i0Arr) {
            C9367f.m39526e(enumC5416i0Arr, "tlsVersions");
            if (!this.f31097a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(enumC5416i0Arr.length);
            for (EnumC5416i0 enumC5416i0 : enumC5416i0Arr) {
                arrayList.add(enumC5416i0.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return m27007e((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/l$b.class
     */
    /* renamed from: ji.l$b */
    /* loaded from: combined.jar:classes2.jar:ji/l$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }
    }

    static {
        C5415i c5415i = C5415i.f31054n1;
        C5415i c5415i2 = C5415i.f31057o1;
        C5415i c5415i3 = C5415i.f31060p1;
        C5415i c5415i4 = C5415i.f31013Z0;
        C5415i c5415i5 = C5415i.f31024d1;
        C5415i c5415i6 = C5415i.f31015a1;
        C5415i c5415i7 = C5415i.f31027e1;
        C5415i c5415i8 = C5415i.f31045k1;
        C5415i c5415i9 = C5415i.f31042j1;
        C5415i[] c5415iArr = {c5415i, c5415i2, c5415i3, c5415i4, c5415i5, c5415i6, c5415i7, c5415i8, c5415i9};
        f31086e = c5415iArr;
        C5415i[] c5415iArr2 = {c5415i, c5415i2, c5415i3, c5415i4, c5415i5, c5415i6, c5415i7, c5415i8, c5415i9, C5415i.f30983K0, C5415i.f30985L0, C5415i.f31038i0, C5415i.f31041j0, C5415i.f30974G, C5415i.f30982K, C5415i.f31043k};
        f31087f = c5415iArr2;
        a m27005c = new a(true).m27005c((C5415i[]) Arrays.copyOf(c5415iArr, c5415iArr.length));
        EnumC5416i0 enumC5416i0 = EnumC5416i0.TLS_1_3;
        EnumC5416i0 enumC5416i02 = EnumC5416i0.TLS_1_2;
        f31088g = m27005c.m27008f(enumC5416i0, enumC5416i02).m27006d(true).m27003a();
        f31089h = new a(true).m27005c((C5415i[]) Arrays.copyOf(c5415iArr2, c5415iArr2.length)).m27008f(enumC5416i0, enumC5416i02).m27006d(true).m27003a();
        f31090i = new a(true).m27005c((C5415i[]) Arrays.copyOf(c5415iArr2, c5415iArr2.length)).m27008f(enumC5416i0, enumC5416i02, EnumC5416i0.TLS_1_1, EnumC5416i0.TLS_1_0).m27006d(true).m27003a();
        f31091j = new a(false).m27003a();
    }

    public C5421l(boolean z10, boolean z11, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f31093a = z10;
        this.f31094b = z11;
        this.f31095c = strArr;
        this.f31096d = strArr2;
    }

    /* renamed from: c */
    public final void m26996c(@NotNull SSLSocket sSLSocket, boolean z10) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C5421l m27000g = m27000g(sSLSocket, z10);
        if (m27000g.m27002i() != null) {
            sSLSocket.setEnabledProtocols(m27000g.f31096d);
        }
        if (m27000g.m26997d() != null) {
            sSLSocket.setEnabledCipherSuites(m27000g.f31095c);
        }
    }

    @Nullable
    /* renamed from: d */
    public final List<C5415i> m26997d() {
        List<C5415i> list;
        String[] strArr = this.f31095c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C5415i.f31069s1.m26986b(str));
            }
            list = C5624r.m27718G(arrayList);
        } else {
            list = null;
        }
        return list;
    }

    /* renamed from: e */
    public final boolean m26998e(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "socket");
        if (!this.f31093a) {
            return false;
        }
        String[] strArr = this.f31096d;
        if (strArr != null && !C5634b.m27798r(strArr, sSLSocket.getEnabledProtocols(), C5879a.m28689b())) {
            return false;
        }
        String[] strArr2 = this.f31095c;
        return strArr2 == null || C5634b.m27798r(strArr2, sSLSocket.getEnabledCipherSuites(), C5415i.f31069s1.m26987c());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5421l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f31093a;
        C5421l c5421l = (C5421l) obj;
        if (z10 != c5421l.f31093a) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f31095c, c5421l.f31095c) && Arrays.equals(this.f31096d, c5421l.f31096d) && this.f31094b == c5421l.f31094b;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m26999f() {
        return this.f31093a;
    }

    /* renamed from: g */
    public final C5421l m27000g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f31095c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            C9367f.m39525d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = C5634b.m27758B(enabledCipherSuites2, this.f31095c, C5415i.f31069s1.m26987c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f31096d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            C9367f.m39525d(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = C5634b.m27758B(enabledProtocols2, this.f31096d, C5879a.m28689b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C9367f.m39525d(supportedCipherSuites, "supportedCipherSuites");
        int m27801u = C5634b.m27801u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C5415i.f31069s1.m26987c());
        String[] strArr = enabledCipherSuites;
        if (z10) {
            strArr = enabledCipherSuites;
            if (m27801u != -1) {
                C9367f.m39525d(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[m27801u];
                C9367f.m39525d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                strArr = C5634b.m27792l(enabledCipherSuites, str);
            }
        }
        a aVar = new a(this);
        C9367f.m39525d(strArr, "cipherSuitesIntersection");
        a m27004b = aVar.m27004b((String[]) Arrays.copyOf(strArr, strArr.length));
        C9367f.m39525d(enabledProtocols, "tlsVersionsIntersection");
        return m27004b.m27007e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m27003a();
    }

    /* renamed from: h */
    public final boolean m27001h() {
        return this.f31094b;
    }

    public int hashCode() {
        int i10;
        if (this.f31093a) {
            String[] strArr = this.f31095c;
            int i11 = 0;
            int hashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
            String[] strArr2 = this.f31096d;
            if (strArr2 != null) {
                i11 = Arrays.hashCode(strArr2);
            }
            i10 = ((((527 + hashCode) * 31) + i11) * 31) + (!this.f31094b ? 1 : 0);
        } else {
            i10 = 17;
        }
        return i10;
    }

    @Nullable
    /* renamed from: i */
    public final List<EnumC5416i0> m27002i() {
        List<EnumC5416i0> list;
        String[] strArr = this.f31096d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(EnumC5416i0.Companion.m26990a(str));
            }
            list = C5624r.m27718G(arrayList);
        } else {
            list = null;
        }
        return list;
    }

    @NotNull
    public String toString() {
        if (!this.f31093a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m26997d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m27002i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f31094b + ')';
    }
}
