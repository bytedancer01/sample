package p339ti;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/a.class
 */
@SuppressLint({"NewApi"})
/* renamed from: ti.a */
/* loaded from: combined.jar:classes2.jar:ti/a.class */
public final class C8750a implements InterfaceC8760k {

    /* renamed from: a */
    public static final a f40712a = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/a$a.class
     */
    /* renamed from: ti.a$a */
    /* loaded from: combined.jar:classes2.jar:ti/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final InterfaceC8760k m37547a() {
            return m37548b() ? new C8750a() : null;
        }

        /* renamed from: b */
        public final boolean m37548b() {
            return C8588j.f40042c.m36881h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: a */
    public boolean mo37543a(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: b */
    public boolean mo37544b() {
        return f40712a.m37548b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r0.equals("") != false) goto L10;
     */
    @Override // p339ti.InterfaceC8760k
    @android.annotation.SuppressLint({"NewApi"})
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
            java.lang.String r0 = si.C8585g.m36864a(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L12
            goto L29
        L12:
            r0 = r5
            int r0 = r0.hashCode()
            if (r0 == 0) goto L1e
            r0 = r5
            r4 = r0
            goto L2b
        L1e:
            r0 = r5
            r4 = r0
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
        L29:
            r0 = 0
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p339ti.C8750a.mo37545c(javax.net.ssl.SSLSocket):java.lang.String");
    }

    @Override // p339ti.InterfaceC8760k
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo37546d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C9367f.m39525d(sSLParameters, "sslParameters");
            Object[] array = C8588j.f40042c.m36875b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
