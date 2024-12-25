package p142i4;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p073e4.C4620o;
import p179k4.C5474c;
import p280q4.InterfaceC7753b;
import p396x3.EnumC9644a;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/p.class
 */
/* renamed from: i4.p */
/* loaded from: combined.jar:classes1.jar:i4/p.class */
public class C5185p implements InterfaceC7753b<InputStream, Bitmap> {

    /* renamed from: b */
    public final C5186q f29592b;

    /* renamed from: c */
    public final C5171b f29593c;

    /* renamed from: d */
    public final C4620o f29594d = new C4620o();

    /* renamed from: e */
    public final C5474c<Bitmap> f29595e;

    public C5185p(InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        C5186q c5186q = new C5186q(interfaceC0065b, enumC9644a);
        this.f29592b = c5186q;
        this.f29593c = new C5171b();
        this.f29595e = new C5474c<>(c5186q);
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<InputStream> mo25839a() {
        return this.f29594d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<Bitmap> mo25840c() {
        return this.f29593c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<InputStream, Bitmap> mo25841d() {
        return this.f29592b;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, Bitmap> mo25842e() {
        return this.f29595e;
    }
}
