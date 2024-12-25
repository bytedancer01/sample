package p142i4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p363v4.C9242h;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/c.class
 */
/* renamed from: i4.c */
/* loaded from: combined.jar:classes1.jar:i4/c.class */
public class C5172c implements InterfaceC10048l<Bitmap> {

    /* renamed from: a */
    public final Bitmap f29550a;

    /* renamed from: b */
    public final InterfaceC0065b f29551b;

    public C5172c(Bitmap bitmap, InterfaceC0065b interfaceC0065b) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (interfaceC0065b == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f29550a = bitmap;
        this.f29551b = interfaceC0065b;
    }

    /* renamed from: c */
    public static C5172c m25824c(Bitmap bitmap, InterfaceC0065b interfaceC0065b) {
        if (bitmap == null) {
            return null;
        }
        return new C5172c(bitmap, interfaceC0065b);
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f29550a;
    }

    @Override // p435z3.InterfaceC10048l
    /* renamed from: b */
    public void mo25232b() {
        if (this.f29551b.mo231a(this.f29550a)) {
            return;
        }
        this.f29550a.recycle();
    }

    @Override // p435z3.InterfaceC10048l
    public int getSize() {
        return C9242h.m38967e(this.f29550a);
    }
}
