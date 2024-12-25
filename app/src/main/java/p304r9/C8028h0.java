package p304r9;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC2416c;
import com.google.android.gms.common.api.C2414a;
import p200l9.C5747b0;
import p383w9.AbstractC9515r;
import p383w9.InterfaceC9502o;
import za.AbstractC10144i;
import za.C10146j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/h0.class
 */
/* renamed from: r9.h0 */
/* loaded from: combined.jar:classes2.jar:r9/h0.class */
public final class C8028h0 extends AbstractC2416c {

    /* renamed from: d */
    public static final C2414a.g f38817d;

    /* renamed from: e */
    public static final C2414a.a f38818e;

    /* renamed from: f */
    public static final C2414a f38819f;

    static {
        C2414a.g gVar = new C2414a.g();
        f38817d = gVar;
        C8020d0 c8020d0 = new C8020d0();
        f38818e = c8020d0;
        f38819f = new C2414a("CastApi.API", c8020d0, gVar);
    }

    public C8028h0(Context context) {
        super(context, (C2414a<C2414a.d.c>) f38819f, C2414a.d.f14808a, AbstractC2416c.a.f14810c);
    }

    /* renamed from: b */
    public final AbstractC10144i m34891b(final String[] strArr) {
        return doRead(AbstractC9515r.m40018a().m40024b(new InterfaceC9502o(this, strArr) { // from class: r9.b0

            /* renamed from: a */
            public final C8028h0 f38802a;

            /* renamed from: b */
            public final String[] f38803b;

            {
                this.f38802a = this;
                this.f38803b = strArr;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p383w9.InterfaceC9502o
            public final void accept(Object obj, Object obj2) {
                C8028h0 c8028h0 = this.f38802a;
                String[] strArr2 = this.f38803b;
                ((C8035l) ((C8030i0) obj).getService()).m34908C1(new BinderC8022e0(c8028h0, (C10146j) obj2), strArr2);
            }
        }).m40026d(C5747b0.f32188d).m40025c(false).m40027e(8425).m40023a());
    }
}
