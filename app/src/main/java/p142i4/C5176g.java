package p142i4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p005a4.InterfaceC0065b;
import p122h4.C5023a;
import p179k4.C5474c;
import p280q4.InterfaceC7753b;
import p396x3.EnumC9644a;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i4/g.class
 */
/* renamed from: i4.g */
/* loaded from: combined.jar:classes1.jar:i4/g.class */
public class C5176g implements InterfaceC7753b<ParcelFileDescriptor, Bitmap> {

    /* renamed from: b */
    public final InterfaceC9648e<File, Bitmap> f29558b;

    /* renamed from: c */
    public final C5177h f29559c;

    /* renamed from: d */
    public final C5171b f29560d = new C5171b();

    /* renamed from: e */
    public final InterfaceC9645b<ParcelFileDescriptor> f29561e = C5023a.m25229b();

    public C5176g(InterfaceC0065b interfaceC0065b, EnumC9644a enumC9644a) {
        this.f29558b = new C5474c(new C5186q(interfaceC0065b, enumC9644a));
        this.f29559c = new C5177h(interfaceC0065b, enumC9644a);
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<ParcelFileDescriptor> mo25839a() {
        return this.f29561e;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<Bitmap> mo25840c() {
        return this.f29560d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<ParcelFileDescriptor, Bitmap> mo25841d() {
        return this.f29559c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, Bitmap> mo25842e() {
        return this.f29558b;
    }
}
