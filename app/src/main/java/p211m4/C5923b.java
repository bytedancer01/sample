package p211m4;

import android.graphics.Bitmap;
import p195l4.C5672b;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/b.class
 */
/* renamed from: m4.b */
/* loaded from: combined.jar:classes1.jar:m4/b.class */
public class C5923b implements InterfaceC10048l<C5922a> {

    /* renamed from: a */
    public final C5922a f33295a;

    public C5923b(C5922a c5922a) {
        if (c5922a == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f33295a = c5922a;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5922a get() {
        return this.f33295a;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: b */
    public void mo25232b() {
        InterfaceC10048l<Bitmap> m29170a = this.f33295a.m29170a();
        if (m29170a != null) {
            m29170a.mo25232b();
        }
        InterfaceC10048l<C5672b> m29171b = this.f33295a.m29171b();
        if (m29171b != null) {
            m29171b.mo25232b();
        }
    }

    @Override // p435z3.InterfaceC10048l
    public int getSize() {
        return this.f33295a.m29172c();
    }
}
