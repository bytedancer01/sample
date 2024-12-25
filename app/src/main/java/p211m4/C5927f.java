package p211m4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p195l4.C5672b;
import p195l4.C5675e;
import p396x3.InterfaceC9650g;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/f.class
 */
/* renamed from: m4.f */
/* loaded from: combined.jar:classes1.jar:m4/f.class */
public class C5927f implements InterfaceC9650g<C5922a> {

    /* renamed from: a */
    public final InterfaceC9650g<Bitmap> f33308a;

    /* renamed from: b */
    public final InterfaceC9650g<C5672b> f33309b;

    public C5927f(InterfaceC0065b interfaceC0065b, InterfaceC9650g<Bitmap> interfaceC9650g) {
        this(interfaceC9650g, new C5675e(interfaceC9650g, interfaceC0065b));
    }

    public C5927f(InterfaceC9650g<Bitmap> interfaceC9650g, InterfaceC9650g<C5672b> interfaceC9650g2) {
        this.f33308a = interfaceC9650g;
        this.f33309b = interfaceC9650g2;
    }

    @Override // p396x3.InterfaceC9650g
    /* renamed from: a */
    public InterfaceC10048l<C5922a> mo25234a(InterfaceC10048l<C5922a> interfaceC10048l, int i10, int i11) {
        InterfaceC10048l<C5922a> interfaceC10048l2;
        InterfaceC9650g<Bitmap> interfaceC9650g;
        InterfaceC10048l<Bitmap> m29170a = interfaceC10048l.get().m29170a();
        InterfaceC10048l<C5672b> m29171b = interfaceC10048l.get().m29171b();
        if (m29170a == null || (interfaceC9650g = this.f33308a) == null) {
            interfaceC10048l2 = interfaceC10048l;
            if (m29171b != null) {
                InterfaceC9650g<C5672b> interfaceC9650g2 = this.f33309b;
                interfaceC10048l2 = interfaceC10048l;
                if (interfaceC9650g2 != null) {
                    InterfaceC10048l<C5672b> mo25234a = interfaceC9650g2.mo25234a(m29171b, i10, i11);
                    interfaceC10048l2 = interfaceC10048l;
                    if (!m29171b.equals(mo25234a)) {
                        interfaceC10048l2 = new C5923b(new C5922a(interfaceC10048l.get().m29170a(), mo25234a));
                    }
                }
            }
        } else {
            InterfaceC10048l<Bitmap> mo25234a2 = interfaceC9650g.mo25234a(m29170a, i10, i11);
            interfaceC10048l2 = interfaceC10048l;
            if (!m29170a.equals(mo25234a2)) {
                return new C5923b(new C5922a(mo25234a2, interfaceC10048l.get().m29171b()));
            }
        }
        return interfaceC10048l2;
    }

    @Override // p396x3.InterfaceC9650g
    public String getId() {
        return this.f33308a.getId();
    }
}
