package p195l4;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import p005a4.InterfaceC0065b;
import p073e4.C4620o;
import p179k4.C5474c;
import p280q4.InterfaceC7753b;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l4/c.class
 */
/* renamed from: l4.c */
/* loaded from: combined.jar:classes1.jar:l4/c.class */
public class C5673c implements InterfaceC7753b<InputStream, C5672b> {

    /* renamed from: b */
    public final C5679i f31983b;

    /* renamed from: c */
    public final C5680j f31984c;

    /* renamed from: d */
    public final C4620o f31985d;

    /* renamed from: e */
    public final C5474c<C5672b> f31986e;

    public C5673c(Context context, InterfaceC0065b interfaceC0065b) {
        C5679i c5679i = new C5679i(context, interfaceC0065b);
        this.f31983b = c5679i;
        this.f31986e = new C5474c<>(c5679i);
        this.f31984c = new C5680j(interfaceC0065b);
        this.f31985d = new C4620o();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<InputStream> mo25839a() {
        return this.f31985d;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<C5672b> mo25840c() {
        return this.f31984c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<InputStream, C5672b> mo25841d() {
        return this.f31983b;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, C5672b> mo25842e() {
        return this.f31986e;
    }
}
