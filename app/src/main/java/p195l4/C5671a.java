package p195l4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p362v3.C9231a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/a.class
 */
/* renamed from: l4.a */
/* loaded from: combined.jar:classes1.jar:l4/a.class */
public class C5671a implements C9231a.a {

    /* renamed from: a */
    public final InterfaceC0065b f31961a;

    public C5671a(InterfaceC0065b interfaceC0065b) {
        this.f31961a = interfaceC0065b;
    }

    @Override // p362v3.C9231a.a
    /* renamed from: a */
    public void mo27899a(Bitmap bitmap) {
        if (this.f31961a.mo231a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }

    @Override // p362v3.C9231a.a
    /* renamed from: b */
    public Bitmap mo27900b(int i10, int i11, Bitmap.Config config) {
        return this.f31961a.mo235e(i10, i11, config);
    }
}
