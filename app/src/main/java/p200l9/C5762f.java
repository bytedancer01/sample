package p200l9;

import java.util.Collection;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/f.class
 */
/* renamed from: l9.f */
/* loaded from: combined.jar:classes2.jar:l9/f.class */
public final class C5762f {
    /* renamed from: a */
    public static String m28194a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        C5761e2 c5761e2 = new C5761e2(null);
        C5761e2.m28191a(c5761e2, str);
        return C5769g2.m28198a(C5761e2.m28193c(c5761e2));
    }

    /* renamed from: b */
    public static String m28195b(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        C5761e2 c5761e2 = new C5761e2(null);
        C5761e2.m28191a(c5761e2, str);
        C5761e2.m28192b(c5761e2, collection);
        return C5769g2.m28198a(C5761e2.m28193c(c5761e2));
    }
}
