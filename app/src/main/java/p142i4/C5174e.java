package p142i4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/e.class
 */
/* renamed from: i4.e */
/* loaded from: combined.jar:classes1.jar:i4/e.class */
public class C5174e extends AbstractC5173d {
    public C5174e(InterfaceC0065b interfaceC0065b) {
        super(interfaceC0065b);
    }

    @Override // p142i4.AbstractC5173d
    /* renamed from: b */
    public Bitmap mo25826b(InterfaceC0065b interfaceC0065b, Bitmap bitmap, int i10, int i11) {
        Bitmap mo234d = interfaceC0065b.mo234d(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap m25872a = C5187r.m25872a(mo234d, bitmap, i10, i11);
        if (mo234d != null && mo234d != m25872a && !interfaceC0065b.mo231a(mo234d)) {
            mo234d.recycle();
        }
        return m25872a;
    }

    @Override // p396x3.InterfaceC9650g
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
