package p142i4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p363v4.C9242h;
import p396x3.InterfaceC9650g;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/d.class
 */
/* renamed from: i4.d */
/* loaded from: combined.jar:classes1.jar:i4/d.class */
public abstract class AbstractC5173d implements InterfaceC9650g<Bitmap> {

    /* renamed from: a */
    public InterfaceC0065b f29552a;

    public AbstractC5173d(InterfaceC0065b interfaceC0065b) {
        this.f29552a = interfaceC0065b;
    }

    @Override // p396x3.InterfaceC9650g
    /* renamed from: a */
    public final InterfaceC10048l<Bitmap> mo25234a(InterfaceC10048l<Bitmap> interfaceC10048l, int i10, int i11) {
        if (!C9242h.m38973k(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Bitmap bitmap = interfaceC10048l.get();
        int i12 = i10;
        if (i10 == Integer.MIN_VALUE) {
            i12 = bitmap.getWidth();
        }
        int i13 = i11;
        if (i11 == Integer.MIN_VALUE) {
            i13 = bitmap.getHeight();
        }
        Bitmap mo25826b = mo25826b(this.f29552a, bitmap, i12, i13);
        if (!bitmap.equals(mo25826b)) {
            interfaceC10048l = C5172c.m25824c(mo25826b, this.f29552a);
        }
        return interfaceC10048l;
    }

    /* renamed from: b */
    public abstract Bitmap mo25826b(InterfaceC0065b interfaceC0065b, Bitmap bitmap, int i10, int i11);
}
