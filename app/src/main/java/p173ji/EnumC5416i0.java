package p173ji;

import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/i0.class
 */
/* renamed from: ji.i0 */
/* loaded from: combined.jar:classes2.jar:ji/i0.class */
public enum EnumC5416i0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a Companion = new a(null);

    @NotNull
    private final String javaName;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/i0$a.class
     */
    /* renamed from: ji.i0$a */
    /* loaded from: combined.jar:classes2.jar:ji/i0$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @NotNull
        /* renamed from: a */
        public final EnumC5416i0 m26990a(@NotNull String str) {
            EnumC5416i0 enumC5416i0;
            C9367f.m39526e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode == 79201641) {
                if (str.equals("SSLv3")) {
                    enumC5416i0 = EnumC5416i0.SSL_3_0;
                    return enumC5416i0;
                }
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
            }
            if (hashCode == 79923350) {
                if (str.equals("TLSv1")) {
                    enumC5416i0 = EnumC5416i0.TLS_1_0;
                    return enumC5416i0;
                }
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
            }
            switch (hashCode) {
                case -503070503:
                    if (str.equals("TLSv1.1")) {
                        enumC5416i0 = EnumC5416i0.TLS_1_1;
                        return enumC5416i0;
                    }
                    break;
                case -503070502:
                    if (str.equals("TLSv1.2")) {
                        enumC5416i0 = EnumC5416i0.TLS_1_2;
                        return enumC5416i0;
                    }
                    break;
                case -503070501:
                    if (str.equals("TLSv1.3")) {
                        enumC5416i0 = EnumC5416i0.TLS_1_3;
                        return enumC5416i0;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    EnumC5416i0(String str) {
        this.javaName = str;
    }

    @NotNull
    public static final EnumC5416i0 forJavaName(@NotNull String str) {
        return Companion.m26990a(str);
    }

    @NotNull
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m44694deprecated_javaName() {
        return this.javaName;
    }

    @NotNull
    public final String javaName() {
        return this.javaName;
    }
}
