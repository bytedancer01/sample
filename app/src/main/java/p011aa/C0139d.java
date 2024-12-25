package p011aa;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import la.C5830d;
import p383w9.AbstractC9515r;
import p383w9.InterfaceC9502o;
import p422y9.C9947s;
import p422y9.C9956v;
import p422y9.InterfaceC9953u;
import za.AbstractC10144i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:aa/d.class
 */
/* renamed from: aa.d */
/* loaded from: combined.jar:classes2.jar:aa/d.class */
public final class C0139d extends AbstractC2416c<C9956v> implements InterfaceC9953u {

    /* renamed from: d */
    public static final C2414a.g<C0140e> f624d;

    /* renamed from: e */
    public static final C2414a.a<C0140e, C9956v> f625e;

    /* renamed from: f */
    public static final C2414a<C9956v> f626f;

    static {
        C2414a.g<C0140e> gVar = new C2414a.g<>();
        f624d = gVar;
        C0138c c0138c = new C0138c();
        f625e = c0138c;
        f626f = new C2414a<>("ClientTelemetry.API", c0138c, gVar);
    }

    public C0139d(Context context, C9956v c9956v) {
        super(context, f626f, c9956v, AbstractC2416c.a.f14810c);
    }

    @Override // p422y9.InterfaceC9953u
    /* renamed from: a */
    public final AbstractC10144i<Void> mo671a(final C9947s c9947s) {
        AbstractC9515r.a m40018a = AbstractC9515r.m40018a();
        m40018a.m40026d(C5830d.f32451a);
        m40018a.m40025c(false);
        m40018a.m40024b(new InterfaceC9502o(c9947s) { // from class: aa.b

            /* renamed from: a */
            public final C9947s f623a;

            {
                this.f623a = c9947s;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                C9947s c9947s2 = this.f623a;
                C2414a.g<C0140e> gVar = C0139d.f624d;
                ((C0136a) ((C0140e) obj).getService()).m670B1(c9947s2);
                ((C10146j) obj2).m42580c(null);
            }
        });
        return doBestEffortWrite(m40018a.m40023a());
    }
}
