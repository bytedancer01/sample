package p142i4;

import android.graphics.Bitmap;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p396x3.EnumC9644a;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/q.class
 */
/* renamed from: i4.q */
/* loaded from: combined.jar:classes1.jar:i4/q.class */
public class C5186q implements InterfaceC9648e<InputStream, Bitmap> {

    /* renamed from: a */
    public final AbstractC5175f f29596a;

    /* renamed from: b */
    public InterfaceC0065b f29597b;

    /* renamed from: c */
    public EnumC9644a f29598c;

    /* renamed from: d */
    public String f29599d;

    public C5186q(InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        this(AbstractC5175f.f29555c, interfaceC0065b, enumC9644a);
    }

    public C5186q(AbstractC5175f abstractC5175f, InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        this.f29596a = abstractC5175f;
        this.f29597b = interfaceC0065b;
        this.f29598c = enumC9644a;
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<Bitmap> mo25843a(InputStream inputStream, int i10, int i11) {
        return C5172c.m25824c(this.f29596a.m25834a(inputStream, this.f29597b, i10, i11, this.f29598c), this.f29597b);
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        if (this.f29599d == null) {
            this.f29599d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.f29596a.getId() + this.f29598c.name();
        }
        return this.f29599d;
    }
}
