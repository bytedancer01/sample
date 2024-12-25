package ma;

import com.google.ads.interactivemedia.p047v3.internal.C1659c0;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ge.class
 */
/* renamed from: ma.ge */
/* loaded from: combined.jar:classes2.jar:ma/ge.class */
public final /* synthetic */ class C6146ge {
    /* renamed from: a */
    public static /* synthetic */ boolean m29638a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!C1659c0.m10098a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
