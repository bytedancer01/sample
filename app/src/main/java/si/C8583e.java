package si;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/e.class
 */
/* renamed from: si.e */
/* loaded from: combined.jar:classes2.jar:si/e.class */
public final class C8583e extends C8588j {

    /* renamed from: i */
    public static final b f40026i = new b(null);

    /* renamed from: d */
    public final Method f40027d;

    /* renamed from: e */
    public final Method f40028e;

    /* renamed from: f */
    public final Method f40029f;

    /* renamed from: g */
    public final Class<?> f40030g;

    /* renamed from: h */
    public final Class<?> f40031h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/e$a.class
     */
    /* renamed from: si.e$a */
    /* loaded from: combined.jar:classes2.jar:si/e$a.class */
    public static final class a implements InvocationHandler {

        /* renamed from: a */
        public boolean f40032a;

        /* renamed from: b */
        @Nullable
        public String f40033b;

        /* renamed from: c */
        public final List<String> f40034c;

        public a(@NotNull List<String> list) {
            C9367f.m39526e(list, "protocols");
            this.f40034c = list;
        }

        @Nullable
        /* renamed from: a */
        public final String m36860a() {
            return this.f40033b;
        }

        /* renamed from: b */
        public final boolean m36861b() {
            return this.f40032a;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
            C9367f.m39526e(obj, "proxy");
            C9367f.m39526e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C9367f.m39522a(name, "supports") && C9367f.m39522a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C9367f.m39522a(name, "unsupported") && C9367f.m39522a(Void.TYPE, returnType)) {
                this.f40032a = true;
                return null;
            }
            if (C9367f.m39522a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f40034c;
                }
            }
            if ((C9367f.m39522a(name, "selectProtocol") || C9367f.m39522a(name, "select")) && C9367f.m39522a(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj3 = list.get(i10);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (!this.f40034c.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f40033b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f40034c.get(0);
                    this.f40033b = str2;
                    return str2;
                }
            }
            if ((!C9367f.m39522a(name, "protocolSelected") && !C9367f.m39522a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f40033b = (String) obj4;
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/e$b.class
     */
    /* renamed from: si.e$b */
    /* loaded from: combined.jar:classes2.jar:si/e$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8588j m36862a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C9367f.m39525d(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException e10) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                C9367f.m39525d(method, "putMethod");
                C9367f.m39525d(method2, "getMethod");
                C9367f.m39525d(method3, "removeMethod");
                C9367f.m39525d(cls3, "clientProviderClass");
                C9367f.m39525d(cls4, "serverProviderClass");
                return new C8583e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException e11) {
                return null;
            }
        }
    }

    public C8583e(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> cls, @NotNull Class<?> cls2) {
        C9367f.m39526e(method, "putMethod");
        C9367f.m39526e(method2, "getMethod");
        C9367f.m39526e(method3, "removeMethod");
        C9367f.m39526e(cls, "clientProviderClass");
        C9367f.m39526e(cls2, "serverProviderClass");
        this.f40027d = method;
        this.f40028e = method2;
        this.f40029f = method3;
        this.f40030g = cls;
        this.f40031h = cls2;
    }

    @Override // si.C8588j
    /* renamed from: b */
    public void mo36859b(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        try {
            this.f40029f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        List<String> m36875b = C8588j.f40042c.m36875b(list);
        try {
            this.f40027d.invoke(null, sSLSocket, Proxy.newProxyInstance(C8588j.class.getClassLoader(), new Class[]{this.f40030g, this.f40031h}, new a(m36875b)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f40028e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (aVar.m36861b() || aVar.m36860a() != null) {
                return aVar.m36861b() ? null : aVar.m36860a();
            }
            C8588j.m36872k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
