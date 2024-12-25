package p225n4;

import android.graphics.Bitmap;
import p142i4.C5179j;
import p160j4.AbstractC5293b;
import p211m4.C5922a;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n4/a.class
 */
/* renamed from: n4.a */
/* loaded from: combined.jar:classes1.jar:n4/a.class */
public class C6648a implements InterfaceC6650c<C5922a, AbstractC5293b> {

    /* renamed from: a */
    public final InterfaceC6650c<Bitmap, C5179j> f34678a;

    public C6648a(InterfaceC6650c<Bitmap, C5179j> interfaceC6650c) {
        this.f34678a = interfaceC6650c;
    }

    @Override // p225n4.InterfaceC6650c
    /* renamed from: a */
    public InterfaceC10048l<AbstractC5293b> mo30651a(InterfaceC10048l<C5922a> interfaceC10048l) {
        C5922a c5922a = interfaceC10048l.get();
        InterfaceC10048l<Bitmap> m29170a = c5922a.m29170a();
        return m29170a != null ? this.f34678a.mo30651a(m29170a) : c5922a.m29171b();
    }

    @Override // p225n4.InterfaceC6650c
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
