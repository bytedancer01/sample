package p067di;

import fi.C4881t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/k1.class
 */
/* renamed from: di.k1 */
/* loaded from: combined.jar:classes2.jar:di/k1.class */
public final class C4490k1 {

    /* renamed from: a */
    @NotNull
    public static final C4881t f26904a = new C4881t("COMPLETING_ALREADY");

    /* renamed from: b */
    @NotNull
    public static final C4881t f26905b = new C4881t("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    @NotNull
    public static final C4881t f26906c = new C4881t("COMPLETING_RETRY");

    /* renamed from: d */
    @NotNull
    public static final C4881t f26907d = new C4881t("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    @NotNull
    public static final C4881t f26908e = new C4881t("SEALED");

    /* renamed from: f */
    @NotNull
    public static final C4504p0 f26909f = new C4504p0(false);

    /* renamed from: g */
    @NotNull
    public static final C4504p0 f26910g = new C4504p0(true);

    @Nullable
    /* renamed from: g */
    public static final Object m22780g(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj instanceof InterfaceC4528x0) {
            obj2 = new C4531y0((InterfaceC4528x0) obj);
        }
        return obj2;
    }
}
