package p142i4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import p073e4.C4612g;
import p073e4.C4613h;
import p280q4.InterfaceC7753b;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/n.class
 */
/* renamed from: i4.n */
/* loaded from: combined.jar:classes1.jar:i4/n.class */
public class C5183n implements InterfaceC7753b<C4612g, Bitmap> {

    /* renamed from: b */
    public final C5182m f29583b;

    /* renamed from: c */
    public final InterfaceC9648e<File, Bitmap> f29584c;

    /* renamed from: d */
    public final InterfaceC9649f<Bitmap> f29585d;

    /* renamed from: e */
    public final C4613h f29586e;

    public C5183n(InterfaceC7753b<InputStream, Bitmap> interfaceC7753b, InterfaceC7753b<ParcelFileDescriptor, Bitmap> interfaceC7753b2) {
        this.f29585d = interfaceC7753b.mo25840c();
        this.f29586e = new C4613h(interfaceC7753b.mo25839a(), interfaceC7753b2.mo25839a());
        this.f29584c = interfaceC7753b.mo25842e();
        this.f29583b = new C5182m(interfaceC7753b.mo25841d(), interfaceC7753b2.mo25841d());
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<C4612g> mo25839a() {
        return this.f29586e;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<Bitmap> mo25840c() {
        return this.f29585d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<C4612g, Bitmap> mo25841d() {
        return this.f29583b;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, Bitmap> mo25842e() {
        return this.f29584c;
    }
}
