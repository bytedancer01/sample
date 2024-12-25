package p195l4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p142i4.C5172c;
import p396x3.InterfaceC9650g;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/e.class
 */
/* renamed from: l4.e */
/* loaded from: combined.jar:classes1.jar:l4/e.class */
public class C5675e implements InterfaceC9650g<C5672b> {

    /* renamed from: a */
    public final InterfaceC9650g<Bitmap> f31987a;

    /* renamed from: b */
    public final InterfaceC0065b f31988b;

    public C5675e(InterfaceC9650g<Bitmap> interfaceC9650g, InterfaceC0065b interfaceC0065b) {
        this.f31987a = interfaceC9650g;
        this.f31988b = interfaceC0065b;
    }

    @Override // p396x3.InterfaceC9650g
    /* renamed from: a */
    public InterfaceC10048l<C5672b> mo25234a(InterfaceC10048l<C5672b> interfaceC10048l, int i10, int i11) {
        C5672b c5672b = interfaceC10048l.get();
        Bitmap m27903e = interfaceC10048l.get().m27903e();
        Bitmap bitmap = this.f31987a.mo25234a(new C5172c(m27903e, this.f31988b), i10, i11).get();
        if (!bitmap.equals(m27903e)) {
            interfaceC10048l = new C5674d(new C5672b(c5672b, bitmap, this.f31987a));
        }
        return interfaceC10048l;
    }

    @Override // p396x3.InterfaceC9650g
    public String getId() {
        return this.f31987a.getId();
    }
}
