package p211m4;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p073e4.C4612g;
import p179k4.C5474c;
import p195l4.C5672b;
import p280q4.InterfaceC7753b;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/g.class
 */
/* renamed from: m4.g */
/* loaded from: combined.jar:classes1.jar:m4/g.class */
public class C5928g implements InterfaceC7753b<C4612g, C5922a> {

    /* renamed from: b */
    public final InterfaceC9648e<File, C5922a> f33310b;

    /* renamed from: c */
    public final InterfaceC9648e<C4612g, C5922a> f33311c;

    /* renamed from: d */
    public final InterfaceC9649f<C5922a> f33312d;

    /* renamed from: e */
    public final InterfaceC9645b<C4612g> f33313e;

    public C5928g(InterfaceC7753b<C4612g, Bitmap> interfaceC7753b, InterfaceC7753b<InputStream, C5672b> interfaceC7753b2, InterfaceC0065b interfaceC0065b) {
        C5924c c5924c = new C5924c(interfaceC7753b.mo25841d(), interfaceC7753b2.mo25841d(), interfaceC0065b);
        this.f33310b = new C5474c(new C5926e(c5924c));
        this.f33311c = c5924c;
        this.f33312d = new C5925d(interfaceC7753b.mo25840c(), interfaceC7753b2.mo25840c());
        this.f33313e = interfaceC7753b.mo25839a();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<C4612g> mo25839a() {
        return this.f33313e;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<C5922a> mo25840c() {
        return this.f33312d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<C4612g, C5922a> mo25841d() {
        return this.f33311c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, C5922a> mo25842e() {
        return this.f33310b;
    }
}
