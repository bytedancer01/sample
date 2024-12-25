package ec;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ec/h.class
 */
/* renamed from: ec.h */
/* loaded from: combined.jar:classes2.jar:ec/h.class */
public final class C4705h extends AbstractC4702e {
    /* renamed from: a */
    public static boolean m23655a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m23656b(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
