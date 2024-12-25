package p211m4;

import java.io.InputStream;
import p073e4.C4612g;
import p396x3.InterfaceC9648e;
import p435z3.InterfaceC10048l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m4/e.class
 */
/* renamed from: m4.e */
/* loaded from: combined.jar:classes1.jar:m4/e.class */
public class C5926e implements InterfaceC9648e<InputStream, C5922a> {

    /* renamed from: a */
    public final InterfaceC9648e<C4612g, C5922a> f33307a;

    public C5926e(InterfaceC9648e<C4612g, C5922a> interfaceC9648e) {
        this.f33307a = interfaceC9648e;
    }

    @Override // p396x3.InterfaceC9648e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC10048l<C5922a> mo25843a(InputStream inputStream, int i10, int i11) {
        return this.f33307a.mo25843a(new C4612g(inputStream, null), i10, i11);
    }

    @Override // p396x3.InterfaceC9648e
    public String getId() {
        return this.f33307a.getId();
    }
}
