package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/v.class
 */
/* renamed from: fi.v */
/* loaded from: combined.jar:classes2.jar:fi/v.class */
public final /* synthetic */ class C4883v {

    /* renamed from: a */
    public static final int f28586a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m24809a() {
        return f28586a;
    }

    @Nullable
    /* renamed from: b */
    public static final String m24810b(@NotNull String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e10) {
            str2 = null;
        }
        return str2;
    }
}
