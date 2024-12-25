package p280q4;

import java.io.File;
import p073e4.InterfaceC4617l;
import p225n4.InterfaceC6650c;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q4/e.class
 */
/* renamed from: q4.e */
/* loaded from: combined.jar:classes1.jar:q4/e.class */
public class C7756e<A, T, Z, R> implements InterfaceC7757f<A, T, Z, R> {

    /* renamed from: b */
    public final InterfaceC4617l<A, T> f37622b;

    /* renamed from: c */
    public final InterfaceC6650c<Z, R> f37623c;

    /* renamed from: d */
    public final InterfaceC7753b<T, Z> f37624d;

    public C7756e(InterfaceC4617l<A, T> interfaceC4617l, InterfaceC6650c<Z, R> interfaceC6650c, InterfaceC7753b<T, Z> interfaceC7753b) {
        if (interfaceC4617l == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f37622b = interfaceC4617l;
        if (interfaceC6650c == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f37623c = interfaceC6650c;
        if (interfaceC7753b == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f37624d = interfaceC7753b;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<T> mo25839a() {
        return this.f37624d.mo25839a();
    }

    @Override // p280q4.InterfaceC7757f
    /* renamed from: b */
    public InterfaceC6650c<Z, R> mo33905b() {
        return this.f37623c;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<Z> mo25840c() {
        return this.f37624d.mo25840c();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<T, Z> mo25841d() {
        return this.f37624d.mo25841d();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, Z> mo25842e() {
        return this.f37624d.mo25842e();
    }

    @Override // p280q4.InterfaceC7757f
    /* renamed from: g */
    public InterfaceC4617l<A, T> mo33906g() {
        return this.f37622b;
    }
}
