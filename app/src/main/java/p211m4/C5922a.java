package p211m4;

import android.graphics.Bitmap;
import p195l4.C5672b;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/a.class
 */
/* renamed from: m4.a */
/* loaded from: combined.jar:classes1.jar:m4/a.class */
public class C5922a {

    /* renamed from: a */
    public final InterfaceC10048l<C5672b> f33293a;

    /* renamed from: b */
    public final InterfaceC10048l<Bitmap> f33294b;

    public C5922a(InterfaceC10048l<Bitmap> interfaceC10048l, InterfaceC10048l<C5672b> interfaceC10048l2) {
        if (interfaceC10048l != null && interfaceC10048l2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (interfaceC10048l == null && interfaceC10048l2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.f33294b = interfaceC10048l;
        this.f33293a = interfaceC10048l2;
    }

    /* renamed from: a */
    public InterfaceC10048l<Bitmap> m29170a() {
        return this.f33294b;
    }

    /* renamed from: b */
    public InterfaceC10048l<C5672b> m29171b() {
        return this.f33293a;
    }

    /* renamed from: c */
    public int m29172c() {
        InterfaceC10048l<Bitmap> interfaceC10048l = this.f33294b;
        return interfaceC10048l != null ? interfaceC10048l.getSize() : this.f33293a.getSize();
    }
}
