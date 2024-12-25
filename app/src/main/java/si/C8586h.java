package si;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/h.class
 */
/* renamed from: si.h */
/* loaded from: combined.jar:classes2.jar:si/h.class */
public class C8586h extends C8588j {

    /* renamed from: d */
    public static final boolean f40035d;

    /* renamed from: e */
    public static final a f40036e = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/h$a.class
     */
    /* renamed from: si.h$a */
    /* loaded from: combined.jar:classes2.jar:si/h$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8586h m36866a() {
            return m36867b() ? new C8586h() : null;
        }

        /* renamed from: b */
        public final boolean m36867b() {
            return C8586h.f40035d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5.intValue() >= 9) goto L12;
     */
    static {
        /*
            r0 = 0
            r5 = r0
            si.h$a r0 = new si.h$a
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            si.C8586h.f40036e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1c
            r0 = r6
            java.lang.Integer r0 = ci.C1127m.m6713f(r0)
            r5 = r0
        L1c:
            r0 = 1
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L33
            r0 = r5
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L2e
            goto L3f
        L2e:
            r0 = 0
            r4 = r0
            goto L3f
        L33:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r1 = "getApplicationProtocol"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L44
        L3f:
            r0 = r4
            si.C8586h.f40035d = r0
            return
        L44:
            r5 = move-exception
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: si.C8586h.m46047clinit():void");
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> m36875b = C8588j.f40042c.m36875b(list);
        C9367f.m39525d(sSLParameters, "sslParameters");
        Object[] array = m36875b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        String str;
        String applicationProtocol;
        C9367f.m39526e(sSLSocket, "sslSocket");
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            str = applicationProtocol;
            if (str == null) {
                str = null;
            } else if (str.hashCode() == 0) {
                if (str.equals("")) {
                    str = null;
                }
            }
        } catch (UnsupportedOperationException e10) {
            str = null;
        }
        return str;
    }
}
