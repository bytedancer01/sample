package p211m4;

import android.graphics.Bitmap;
import java.io.OutputStream;
import p195l4.C5672b;
import p396x3.InterfaceC9649f;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/d.class
 */
/* renamed from: m4.d */
/* loaded from: combined.jar:classes1.jar:m4/d.class */
public class C5925d implements InterfaceC9649f<C5922a> {

    /* renamed from: a */
    public final InterfaceC9649f<Bitmap> f33304a;

    /* renamed from: b */
    public final InterfaceC9649f<C5672b> f33305b;

    /* renamed from: c */
    public String f33306c;

    public C5925d(InterfaceC9649f<Bitmap> interfaceC9649f, InterfaceC9649f<C5672b> interfaceC9649f2) {
        this.f33304a = interfaceC9649f;
        this.f33305b = interfaceC9649f2;
    }

    @Override // p396x3.InterfaceC9645b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo23245a(InterfaceC10048l<C5922a> interfaceC10048l, OutputStream outputStream) {
        C5922a c5922a = interfaceC10048l.get();
        InterfaceC10048l<Bitmap> m29170a = c5922a.m29170a();
        return m29170a != null ? this.f33304a.mo23245a(m29170a, outputStream) : this.f33305b.mo23245a(c5922a.m29171b(), outputStream);
    }

    @Override // p396x3.InterfaceC9645b
    public String getId() {
        if (this.f33306c == null) {
            this.f33306c = this.f33304a.getId() + this.f33305b.getId();
        }
        return this.f33306c;
    }
}
