package mc;

import android.content.Context;
import bd.InterfaceC0891b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mc/b.class
 */
/* renamed from: mc.b */
/* loaded from: combined.jar:classes2.jar:mc/b.class */
public final /* synthetic */ class C6552b implements InterfaceC0891b {

    /* renamed from: a */
    public final C6553c f34284a;

    /* renamed from: b */
    public final Context f34285b;

    public C6552b(C6553c c6553c, Context context) {
        this.f34284a = c6553c;
        this.f34285b = context;
    }

    /* renamed from: a */
    public static InterfaceC0891b m30225a(C6553c c6553c, Context context) {
        return new C6552b(c6553c, context);
    }

    @Override // bd.InterfaceC0891b
    public Object get() {
        return C6553c.m30234r(this.f34284a, this.f34285b);
    }
}
