package p339ti;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import si.C8588j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/l.class
 */
/* renamed from: ti.l */
/* loaded from: combined.jar:classes2.jar:ti/l.class */
public final class C8761l extends C8755f {

    /* renamed from: j */
    public static final a f40738j = new a(null);

    /* renamed from: h */
    public final Class<? super SSLSocketFactory> f40739h;

    /* renamed from: i */
    public final Class<?> f40740i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/l$a.class
     */
    /* renamed from: ti.l$a */
    /* loaded from: combined.jar:classes2.jar:ti/l$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC8760k m37572b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m37573a(str);
        }

        @Nullable
        /* renamed from: a */
        public final InterfaceC8760k m37573a(@NotNull String str) {
            C8761l c8761l;
            C9367f.m39526e(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C9367f.m39525d(cls3, "paramsClass");
                c8761l = new C8761l(cls, cls2, cls3);
            } catch (Exception e10) {
                C8588j.f40042c.m36880g().m36873j("unable to load android socket classes", 5, e10);
                c8761l = null;
            }
            return c8761l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8761l(@NotNull Class<? super SSLSocket> cls, @NotNull Class<? super SSLSocketFactory> cls2, @NotNull Class<?> cls3) {
        super(cls);
        C9367f.m39526e(cls, "sslSocketClass");
        C9367f.m39526e(cls2, "sslSocketFactoryClass");
        C9367f.m39526e(cls3, "paramClass");
        this.f40739h = cls2;
        this.f40740i = cls3;
    }
}
