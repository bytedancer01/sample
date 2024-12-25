package p060da;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/o.class
 */
/* renamed from: da.o */
/* loaded from: combined.jar:classes2.jar:da/o.class */
public class C4416o {

    /* renamed from: a */
    public static final Pattern f26706a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m22463a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
