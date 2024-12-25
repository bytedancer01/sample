package p372vh;

import java.util.List;
import p172jh.InterfaceC5383b;
import p356uh.InterfaceC9185a;
import p356uh.InterfaceC9186b;
import p356uh.InterfaceC9187c;
import p356uh.InterfaceC9188d;
import p356uh.InterfaceC9189e;
import p356uh.InterfaceC9190f;
import p356uh.InterfaceC9191g;
import p356uh.InterfaceC9192h;
import p356uh.InterfaceC9193i;
import p356uh.InterfaceC9194j;
import p356uh.InterfaceC9195k;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9197m;
import p356uh.InterfaceC9198n;
import p356uh.InterfaceC9199o;
import p356uh.InterfaceC9200p;
import p356uh.InterfaceC9201q;
import p356uh.InterfaceC9202r;
import p356uh.InterfaceC9203s;
import p356uh.InterfaceC9204t;
import p356uh.InterfaceC9205u;
import p356uh.InterfaceC9206v;
import p356uh.InterfaceC9207w;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/n.class
 */
/* renamed from: vh.n */
/* loaded from: combined.jar:classes2.jar:vh/n.class */
public class C9375n {
    /* renamed from: a */
    public static List m39543a(Object obj) {
        if (obj instanceof InterfaceC9591a) {
            m39550h(obj, "kotlin.collections.MutableList");
        }
        return m39545c(obj);
    }

    /* renamed from: b */
    public static Object m39544b(Object obj, int i10) {
        if (obj != null && !m39547e(obj, i10)) {
            m39550h(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: c */
    public static List m39545c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m39549g(e10);
        }
    }

    /* renamed from: d */
    public static int m39546d(Object obj) {
        if (obj instanceof InterfaceC9366e) {
            return ((InterfaceC9366e) obj).mo33723l();
        }
        if (obj instanceof InterfaceC9185a) {
            return 0;
        }
        if (obj instanceof InterfaceC9196l) {
            return 1;
        }
        if (obj instanceof InterfaceC9200p) {
            return 2;
        }
        if (obj instanceof InterfaceC9201q) {
            return 3;
        }
        if (obj instanceof InterfaceC9202r) {
            return 4;
        }
        if (obj instanceof InterfaceC9203s) {
            return 5;
        }
        if (obj instanceof InterfaceC9204t) {
            return 6;
        }
        if (obj instanceof InterfaceC9205u) {
            return 7;
        }
        if (obj instanceof InterfaceC9206v) {
            return 8;
        }
        if (obj instanceof InterfaceC9207w) {
            return 9;
        }
        if (obj instanceof InterfaceC9186b) {
            return 10;
        }
        if (obj instanceof InterfaceC9187c) {
            return 11;
        }
        if (obj instanceof InterfaceC9188d) {
            return 12;
        }
        if (obj instanceof InterfaceC9189e) {
            return 13;
        }
        if (obj instanceof InterfaceC9190f) {
            return 14;
        }
        if (obj instanceof InterfaceC9191g) {
            return 15;
        }
        if (obj instanceof InterfaceC9192h) {
            return 16;
        }
        if (obj instanceof InterfaceC9193i) {
            return 17;
        }
        if (obj instanceof InterfaceC9194j) {
            return 18;
        }
        if (obj instanceof InterfaceC9195k) {
            return 19;
        }
        if (obj instanceof InterfaceC9197m) {
            return 20;
        }
        if (obj instanceof InterfaceC9198n) {
            return 21;
        }
        return obj instanceof InterfaceC9199o ? 22 : -1;
    }

    /* renamed from: e */
    public static boolean m39547e(Object obj, int i10) {
        return (obj instanceof InterfaceC5383b) && m39546d(obj) == i10;
    }

    /* renamed from: f */
    public static <T extends Throwable> T m39548f(T t10) {
        return (T) C9367f.m39531j(t10, C9375n.class.getName());
    }

    /* renamed from: g */
    public static ClassCastException m39549g(ClassCastException classCastException) {
        throw ((ClassCastException) m39548f(classCastException));
    }

    /* renamed from: h */
    public static void m39550h(Object obj, String str) {
        m39551i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: i */
    public static void m39551i(String str) {
        throw m39549g(new ClassCastException(str));
    }
}
