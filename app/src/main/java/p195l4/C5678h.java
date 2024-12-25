package p195l4;

import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p142i4.C5172c;
import p362v3.C9231a;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/h.class
 */
/* renamed from: l4.h */
/* loaded from: combined.jar:classes1.jar:l4/h.class */
public class C5678h implements InterfaceC9648e<C9231a, Bitmap> {

    /* renamed from: a */
    public final InterfaceC0065b f32004a;

    public C5678h(InterfaceC0065b interfaceC0065b) {
        this.f32004a = interfaceC0065b;
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<Bitmap> mo25843a(C9231a c9231a, int i10, int i11) {
        return C5172c.m25824c(c9231a.m38917i(), this.f32004a);
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }
}
