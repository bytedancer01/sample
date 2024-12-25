package p225n4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import p005a4.InterfaceC0065b;
import p142i4.C5179j;
import p142i4.C5180k;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n4/b.class
 */
/* renamed from: n4.b */
/* loaded from: combined.jar:classes1.jar:n4/b.class */
public class C6649b implements InterfaceC6650c<Bitmap, C5179j> {

    /* renamed from: a */
    public final Resources f34679a;

    /* renamed from: b */
    public final InterfaceC0065b f34680b;

    public C6649b(Resources resources, InterfaceC0065b interfaceC0065b) {
        this.f34679a = resources;
        this.f34680b = interfaceC0065b;
    }

    @Override // p225n4.InterfaceC6650c
    /* renamed from: a */
    public InterfaceC10048l<C5179j> mo30651a(InterfaceC10048l<Bitmap> interfaceC10048l) {
        return new C5180k(new C5179j(this.f34679a, interfaceC10048l.get()), this.f34680b);
    }

    @Override // p225n4.InterfaceC6650c
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
