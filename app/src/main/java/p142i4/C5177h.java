package p142i4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import p005a4.InterfaceC0065b;
import p396x3.EnumC9644a;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/h.class
 */
/* renamed from: i4.h */
/* loaded from: combined.jar:classes1.jar:i4/h.class */
public class C5177h implements InterfaceC9648e<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C5188s f29562a;

    /* renamed from: b */
    public final InterfaceC0065b f29563b;

    /* renamed from: c */
    public EnumC9644a f29564c;

    public C5177h(InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        this(new C5188s(), interfaceC0065b, enumC9644a);
    }

    public C5177h(C5188s c5188s, InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        this.f29562a = c5188s;
        this.f29563b = interfaceC0065b;
        this.f29564c = enumC9644a;
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<Bitmap> mo25843a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11) {
        return C5172c.m25824c(this.f29562a.m25879a(parcelFileDescriptor, this.f29563b, i10, i11, this.f29564c), this.f29563b);
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
