package p027b9;

import android.content.Context;
import p027b9.C0864v;
import p027b9.InterfaceC0854m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/u.class
 */
/* renamed from: b9.u */
/* loaded from: combined.jar:classes2.jar:b9/u.class */
public final class C0863u implements InterfaceC0854m.a {

    /* renamed from: a */
    public final Context f5916a;

    /* renamed from: b */
    public final InterfaceC0853l0 f5917b;

    /* renamed from: c */
    public final InterfaceC0854m.a f5918c;

    public C0863u(Context context) {
        this(context, (String) null, (InterfaceC0853l0) null);
    }

    public C0863u(Context context, InterfaceC0853l0 interfaceC0853l0, InterfaceC0854m.a aVar) {
        this.f5916a = context.getApplicationContext();
        this.f5917b = interfaceC0853l0;
        this.f5918c = aVar;
    }

    public C0863u(Context context, InterfaceC0854m.a aVar) {
        this(context, (InterfaceC0853l0) null, aVar);
    }

    public C0863u(Context context, String str, InterfaceC0853l0 interfaceC0853l0) {
        this(context, interfaceC0853l0, new C0864v.b().m5428c(str));
    }

    @Override // p027b9.InterfaceC0854m.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0862t mo5296a() {
        C0862t c0862t = new C0862t(this.f5916a, this.f5918c.mo5296a());
        InterfaceC0853l0 interfaceC0853l0 = this.f5917b;
        if (interfaceC0853l0 != null) {
            c0862t.mo522c(interfaceC0853l0);
        }
        return c0862t;
    }
}
