package p073e4;

import java.net.URL;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/r.class
 */
/* renamed from: e4.r */
/* loaded from: combined.jar:classes1.jar:e4/r.class */
public class C4623r<T> implements InterfaceC4617l<URL, T> {

    /* renamed from: a */
    public final InterfaceC4617l<C4609d, T> f27322a;

    public C4623r(InterfaceC4617l<C4609d, T> interfaceC4617l) {
        this.f27322a = interfaceC4617l;
    }

    @Override // p073e4.InterfaceC4617l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9817c<T> mo23227a(URL url, int i10, int i11) {
        return this.f27322a.mo23227a(new C4609d(url), i10, i11);
    }
}
