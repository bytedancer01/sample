package p339ti;

import ci.C1128n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p339ti.C8759j;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8580b;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/f.class
 */
/* renamed from: ti.f */
/* loaded from: combined.jar:classes2.jar:ti/f.class */
public class C8755f implements InterfaceC8760k {

    /* renamed from: f */
    @NotNull
    public static final C8759j.a f40720f;

    /* renamed from: g */
    public static final a f40721g;

    /* renamed from: a */
    public final Method f40722a;

    /* renamed from: b */
    public final Method f40723b;

    /* renamed from: c */
    public final Method f40724c;

    /* renamed from: d */
    public final Method f40725d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f40726e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/f$a.class
     */
    /* renamed from: ti.f$a */
    /* loaded from: combined.jar:classes2.jar:ti/f$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ti/f$a$a.class
         */
        /* renamed from: ti.f$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ti/f$a$a.class */
        public static final class C10331a implements C8759j.a {

            /* renamed from: a */
            public final String f40727a;

            public C10331a(String str) {
                this.f40727a = str;
            }

            @Override // p339ti.C8759j.a
            /* renamed from: a */
            public boolean mo37562a(@NotNull SSLSocket sSLSocket) {
                C9367f.m39526e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C9367f.m39525d(name, "sslSocket.javaClass.name");
                return C1128n.m6732y(name, this.f40727a + '.', false, 2, null);
            }

            @Override // p339ti.C8759j.a
            @NotNull
            /* renamed from: b */
            public InterfaceC8760k mo37563b(@NotNull SSLSocket sSLSocket) {
                C9367f.m39526e(sSLSocket, "sslSocket");
                return C8755f.f40721g.m37559b(sSLSocket.getClass());
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: b */
        public final C8755f m37559b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!C9367f.m39522a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C9367f.m39524c(cls2);
            return new C8755f(cls2);
        }

        @NotNull
        /* renamed from: c */
        public final C8759j.a m37560c(@NotNull String str) {
            C9367f.m39526e(str, "packageName");
            return new C10331a(str);
        }

        @NotNull
        /* renamed from: d */
        public final C8759j.a m37561d() {
            return C8755f.f40720f;
        }
    }

    static {
        a aVar = new a(null);
        f40721g = aVar;
        f40720f = aVar.m37560c("com.google.android.gms.org.conscrypt");
    }

    public C8755f(@NotNull Class<? super SSLSocket> cls) {
        C9367f.m39526e(cls, "sslSocketClass");
        this.f40726e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C9367f.m39525d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f40722a = declaredMethod;
        this.f40723b = cls.getMethod("setHostname", String.class);
        this.f40724c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f40725d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: a */
    public boolean mo37543a(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return this.f40726e.isInstance(sSLSocket);
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: b */
    public boolean mo37544b() {
        return C8580b.f40014g.m36847b();
    }

    @Override // p339ti.InterfaceC8760k
    @Nullable
    /* renamed from: c */
    public String mo37545c(@NotNull SSLSocket sSLSocket) {
        String str;
        C9367f.m39526e(sSLSocket, "sslSocket");
        if (!mo37543a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f40724c.invoke(sSLSocket, new Object[0]);
            str = null;
            if (bArr != null) {
                Charset charset = StandardCharsets.UTF_8;
                C9367f.m39525d(charset, "StandardCharsets.UTF_8");
                str = new String(bArr, charset);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (!C9367f.m39522a(e11.getMessage(), "ssl == null")) {
                throw e11;
            }
            str = null;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
        return str;
    }

    @Override // p339ti.InterfaceC8760k
    /* renamed from: d */
    public void mo37546d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (mo37543a(sSLSocket)) {
            try {
                this.f40722a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f40723b.invoke(sSLSocket, str);
                }
                this.f40725d.invoke(sSLSocket, C8588j.f40042c.m36876c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
