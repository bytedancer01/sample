package p177k2;

import android.content.Context;
import android.os.Build;
import p071e2.AbstractC4582k;
import p071e2.EnumC4583l;
import p158j2.C5280b;
import p193l2.C5665i;
import p223n2.C6636p;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k2/f.class
 */
/* renamed from: k2.f */
/* loaded from: combined.jar:classes1.jar:k2/f.class */
public class C5459f extends AbstractC5456c<C5280b> {

    /* renamed from: e */
    public static final String f31208e = AbstractC4582k.m23128f("NetworkNotRoamingCtrlr");

    public C5459f(Context context, InterfaceC7748a interfaceC7748a) {
        super(C5665i.m27880c(context, interfaceC7748a).m27883d());
    }

    @Override // p177k2.AbstractC5456c
    /* renamed from: b */
    public boolean mo27210b(C6636p c6636p) {
        return c6636p.f34582j.m23090b() == EnumC4583l.NOT_ROAMING;
    }

    @Override // p177k2.AbstractC5456c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo27211c(C5280b c5280b) {
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC4582k.m23126c().mo23129a(f31208e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !c5280b.m26362a();
        }
        boolean z10 = true;
        if (c5280b.m26362a()) {
            z10 = !c5280b.m26364c();
        }
        return z10;
    }
}
