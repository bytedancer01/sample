package ug;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import p411xi.C9761e;
import tg.EnumC8742r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/f.class
 */
/* renamed from: ug.f */
/* loaded from: combined.jar:classes2.jar:ug/f.class */
public class C9181f {

    /* renamed from: a */
    public static final C9181f f41996a = m38666d();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/f$b.class
     */
    /* renamed from: ug.f$b */
    /* loaded from: combined.jar:classes2.jar:ug/f$b.class */
    public static class b extends C9181f {

        /* renamed from: b */
        public final Class<?> f41997b;

        /* renamed from: c */
        public final Method f41998c;

        /* renamed from: d */
        public final Method f41999d;

        /* renamed from: e */
        public final Method f42000e;

        /* renamed from: f */
        public final Method f42001f;

        /* renamed from: g */
        public final Method f42002g;

        /* renamed from: h */
        public final Method f42003h;

        public b(Class<?> cls, Method method, Method method2, Method method3, Method method4, Method method5, Method method6) {
            this.f41997b = cls;
            this.f41998c = method;
            this.f41999d = method2;
            this.f42000e = method3;
            this.f42001f = method4;
            this.f42002g = method5;
            this.f42003h = method6;
        }

        @Override // ug.C9181f
        /* renamed from: b */
        public void mo38668b(SSLSocket sSLSocket, String str, List<EnumC8742r> list) {
            if (this.f41997b.isInstance(sSLSocket)) {
                if (str != null) {
                    try {
                        this.f41998c.invoke(sSLSocket, Boolean.TRUE);
                        this.f41999d.invoke(sSLSocket, str);
                    } catch (IllegalAccessException e10) {
                        throw new AssertionError(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11.getCause());
                    }
                }
                if (this.f42002g != null) {
                    try {
                        this.f42002g.invoke(sSLSocket, C9181f.m38665a(list));
                    } catch (IllegalAccessException e12) {
                        throw new AssertionError(e12);
                    } catch (InvocationTargetException e13) {
                        throw new RuntimeException(e13.getCause());
                    }
                }
            }
        }

        @Override // ug.C9181f
        /* renamed from: c */
        public void mo38669c(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
            try {
                socket.connect(inetSocketAddress, i10);
            } catch (SecurityException e10) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e10);
                throw iOException;
            }
        }

        @Override // ug.C9181f
        /* renamed from: g */
        public String mo38671g(SSLSocket sSLSocket) {
            if (this.f42003h == null || !this.f41997b.isInstance(sSLSocket)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) this.f42003h.invoke(sSLSocket, new Object[0]);
                if (bArr == null) {
                    return null;
                }
                return new String(bArr, C9183h.f42015d);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }

        @Override // ug.C9181f
        /* renamed from: i */
        public void mo38673i(Socket socket) {
            Method method = this.f42000e;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }

        @Override // ug.C9181f
        /* renamed from: k */
        public void mo38675k(Socket socket) {
            Method method = this.f42001f;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/f$c.class
     */
    /* renamed from: ug.f$c */
    /* loaded from: combined.jar:classes2.jar:ug/f$c.class */
    public static class c extends C9181f {

        /* renamed from: b */
        public final Method f42004b;

        /* renamed from: c */
        public final Method f42005c;

        /* renamed from: d */
        public final Class<?> f42006d;

        /* renamed from: e */
        public final Class<?> f42007e;

        public c(Method method, Method method2, Class<?> cls, Class<?> cls2) {
            this.f42005c = method;
            this.f42004b = method2;
            this.f42006d = cls;
            this.f42007e = cls2;
        }

        @Override // ug.C9181f
        /* renamed from: b */
        public void mo38668b(SSLSocket sSLSocket, String str, List<EnumC8742r> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                EnumC8742r enumC8742r = list.get(i10);
                if (enumC8742r != EnumC8742r.HTTP_1_0) {
                    arrayList.add(enumC8742r.toString());
                }
            }
            try {
                this.f42005c.invoke(null, sSLSocket, Proxy.newProxyInstance(C9181f.class.getClassLoader(), new Class[]{this.f42006d, this.f42007e}, new d(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // ug.C9181f
        /* renamed from: g */
        public String mo38671g(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f42004b.invoke(null, sSLSocket));
                if (dVar.f42009b || dVar.f42010c != null) {
                    return dVar.f42009b ? null : dVar.f42010c;
                }
                AbstractC9177b.f41992a.log(Level.INFO, "NPN/ALPN callback dropped: SPDY and HTTP/2 are disabled. Is npn-boot or alpn-boot on the boot class path?");
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError();
            } catch (InvocationTargetException e11) {
                throw new AssertionError();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ug/f$d.class
     */
    /* renamed from: ug.f$d */
    /* loaded from: combined.jar:classes2.jar:ug/f$d.class */
    public static class d implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f42008a;

        /* renamed from: b */
        public boolean f42009b;

        /* renamed from: c */
        public String f42010c;

        public d(List<String> list) {
            this.f42008a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            Object[] objArr2 = objArr;
            if (objArr == null) {
                objArr2 = C9183h.f42013b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f42009b = true;
                return null;
            }
            if (name.equals("protocols") && objArr2.length == 0) {
                return this.f42008a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr2.length == 1) {
                Object obj3 = objArr2[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj2 = this.f42008a.get(0);
                            break;
                        }
                        if (this.f42008a.contains(list.get(i10))) {
                            obj2 = list.get(i10);
                            break;
                        }
                        i10++;
                    }
                    String str = (String) obj2;
                    this.f42010c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr2.length != 1) {
                return method.invoke(this, objArr2);
            }
            this.f42010c = (String) objArr2[0];
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m38665a(List<EnumC8742r> list) {
        C9761e c9761e = new C9761e();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC8742r enumC8742r = list.get(i10);
            if (enumC8742r != EnumC8742r.HTTP_1_0) {
                c9761e.writeByte(enumC8742r.toString().length());
                c9761e.mo41136Q(enumC8742r.toString());
            }
        }
        return c9761e.m41128J0();
    }

    /* renamed from: d */
    public static C9181f m38666d() {
        Class<?> cls;
        Class<?> cls2;
        Method method;
        Method method2;
        Method method3;
        try {
            try {
                cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                String str = "org.eclipse.jetty.alpn.ALPN";
                try {
                    try {
                        cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    } catch (ClassNotFoundException e11) {
                        str = "org.eclipse.jetty.npn.NextProtoNego";
                        cls = Class.forName("org.eclipse.jetty.npn.NextProtoNego");
                    }
                    Class<?> cls3 = Class.forName(str + "$Provider");
                    return new c(cls.getMethod("put", SSLSocket.class, cls3), cls.getMethod("get", SSLSocket.class), Class.forName(str + "$ClientProvider"), Class.forName(str + "$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException e12) {
                    return new C9181f();
                }
            }
        } catch (ClassNotFoundException e13) {
            cls2 = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
        }
        Method method4 = cls2.getMethod("setUseSessionTickets", Boolean.TYPE);
        Method method5 = cls2.getMethod("setHostname", String.class);
        Method method6 = null;
        try {
            Class<?> cls4 = Class.forName("android.net.TrafficStats");
            method = cls4.getMethod("tagSocket", Socket.class);
            try {
                method2 = cls4.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException e14) {
                method2 = null;
                method3 = cls2.getMethod("setNpnProtocols", byte[].class);
                try {
                    method6 = cls2.getMethod("getNpnSelectedProtocol", new Class[0]);
                } catch (NoSuchMethodException e15) {
                }
                return new b(cls2, method4, method5, method, method2, method3, method6);
            }
        } catch (ClassNotFoundException | NoSuchMethodException e16) {
            method = null;
        }
        try {
            method3 = cls2.getMethod("setNpnProtocols", byte[].class);
            method6 = cls2.getMethod("getNpnSelectedProtocol", new Class[0]);
        } catch (NoSuchMethodException e17) {
            method3 = null;
        }
        return new b(cls2, method4, method5, method, method2, method3, method6);
    }

    /* renamed from: e */
    public static C9181f m38667e() {
        return f41996a;
    }

    /* renamed from: b */
    public void mo38668b(SSLSocket sSLSocket, String str, List<EnumC8742r> list) {
    }

    /* renamed from: c */
    public void mo38669c(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    /* renamed from: f */
    public String m38670f() {
        return "OkHttp";
    }

    /* renamed from: g */
    public String mo38671g(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: h */
    public void m38672h(String str) {
        System.out.println(str);
    }

    /* renamed from: i */
    public void mo38673i(Socket socket) {
    }

    /* renamed from: j */
    public URI m38674j(URL url) {
        return url.toURI();
    }

    /* renamed from: k */
    public void mo38675k(Socket socket) {
    }
}
