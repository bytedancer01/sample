package p067di;

import org.jetbrains.annotations.NotNull;
import p172jh.C5398q;
import p233nh.C6793h;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/g.class
 */
/* renamed from: di.g */
/* loaded from: combined.jar:classes2.jar:di/g.class */
public final /* synthetic */ class C4476g {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC4466c1 m22659a(@NotNull InterfaceC4471e0 interfaceC4471e0, @NotNull InterfaceC6792g interfaceC6792g, @NotNull EnumC4477g0 enumC4477g0, @NotNull InterfaceC9200p<? super InterfaceC4471e0, ? super InterfaceC6789d<? super C5398q>, ? extends Object> interfaceC9200p) {
        InterfaceC6792g m22628c = C4459a0.m22628c(interfaceC4471e0, interfaceC6792g);
        C4511r1 c4493l1 = enumC4477g0.isLazy() ? new C4493l1(m22628c, interfaceC9200p) : new C4511r1(m22628c, true);
        c4493l1.m22624s0(enumC4477g0, c4493l1, interfaceC9200p);
        return c4493l1;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC4466c1 m22660b(InterfaceC4471e0 interfaceC4471e0, InterfaceC6792g interfaceC6792g, EnumC4477g0 enumC4477g0, InterfaceC9200p interfaceC9200p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6792g = C6793h.f35418b;
        }
        if ((i10 & 2) != 0) {
            enumC4477g0 = EnumC4477g0.DEFAULT;
        }
        return C4473f.m22653a(interfaceC4471e0, interfaceC6792g, enumC4477g0, interfaceC9200p);
    }
}
