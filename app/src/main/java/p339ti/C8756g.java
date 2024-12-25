package p339ti;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p339ti.C8759j;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8581c;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/g.class
 */
/* renamed from: ti.g */
/* loaded from: combined.jar:classes2.jar:ti/g.class */
public final class C8756g implements InterfaceC8760k {

    /* renamed from: b */
    public static final b f40729b = new b(null);

    /* renamed from: a */
    @NotNull
    public static final C8759j.a f40728a = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/g$a.class
     */
    /* renamed from: ti.g$a */
    /* loaded from: combined.jar:classes2.jar:ti/g$a.class */
    public static final class a implements C8759j.a {
        @Override // p339ti.C8759j.a
        /* renamed from: a */
        public boolean mo37562a(@NotNull SSLSocket sSLSocket) {
            C9367f.m39526e(sSLSocket, "sslSocket");
            return C8581c.f40020f.m36853b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // p339ti.C8759j.a
        @NotNull
        /* renamed from: b */
        public InterfaceC8760k mo37563b(@NotNull SSLSocket sSLSocket) {
            C9367f.m39526e(sSLSocket, "sslSocket");
            return new C8756g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/g$b.class
     */
    /* renamed from: ti.g$b */
    /* loaded from: combined.jar:classes2.jar:ti/g$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C8759j.a m37565a() {
            return C8756g.f40728a;
        }
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: a */
    public boolean mo37543a(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: b */
    public boolean mo37544b() {
        return C8581c.f40020f.m36853b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0.equals("") != false) goto L10;
     */
    @Override // p339ti.InterfaceC8760k
    @org.jetbrains.annotations.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo37545c(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "sslSocket"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r4
            org.bouncycastle.jsse.BCSSLSocket r0 = (org.bouncycastle.jsse.BCSSLSocket) r0
            java.lang.String r0 = r0.getApplicationProtocol()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r0 = r5
            int r0 = r0.hashCode()
            if (r0 == 0) goto L23
            r0 = r5
            r4 = r0
            goto L30
        L23:
            r0 = r5
            r4 = r0
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
        L2e:
            r0 = 0
            r4 = r0
        L30:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p339ti.C8756g.mo37545c(javax.net.ssl.SSLSocket):java.lang.String");
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: d */
    public void mo37546d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (mo37543a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C9367f.m39525d(parameters, "sslParameters");
            Object[] array = C8588j.f40042c.m36875b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
