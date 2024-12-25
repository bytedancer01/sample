package p177k2;

import android.content.Context;
import android.os.Build;
import p071e2.EnumC4583l;
import p158j2.C5280b;
import p193l2.C5665i;
import p223n2.C6636p;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k2/g.class
 */
/* renamed from: k2.g */
/* loaded from: combined.jar:classes1.jar:k2/g.class */
public class C5460g extends AbstractC5456c<C5280b> {
    public C5460g(Context context, InterfaceC7748a interfaceC7748a) {
        super(C5665i.m27880c(context, interfaceC7748a).m27883d());
    }

    @Override // p177k2.AbstractC5456c
    /* renamed from: b */
    public boolean mo27210b(C6636p c6636p) {
        return c6636p.f34582j.m23090b() == EnumC4583l.UNMETERED || (Build.VERSION.SDK_INT >= 30 && c6636p.f34582j.m23090b() == EnumC4583l.TEMPORARILY_UNMETERED);
    }

    @Override // p177k2.AbstractC5456c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo27211c(C5280b c5280b) {
        return !c5280b.m26362a() || c5280b.m26363b();
    }
}
