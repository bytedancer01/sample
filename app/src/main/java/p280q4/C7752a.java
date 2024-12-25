package p280q4;

import java.io.File;
import p073e4.InterfaceC4617l;
import p225n4.InterfaceC6650c;
import p396x3.InterfaceC9645b;
import p396x3.InterfaceC9648e;
import p396x3.InterfaceC9649f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q4/a.class
 */
/* renamed from: q4.a */
/* loaded from: combined.jar:classes1.jar:q4/a.class */
public class C7752a<A, T, Z, R> implements InterfaceC7757f<A, T, Z, R>, Cloneable {

    /* renamed from: b */
    public final InterfaceC7757f<A, T, Z, R> f37613b;

    /* renamed from: c */
    public InterfaceC9648e<File, Z> f37614c;

    /* renamed from: d */
    public InterfaceC9648e<T, Z> f37615d;

    /* renamed from: e */
    public InterfaceC9649f<Z> f37616e;

    /* renamed from: f */
    public InterfaceC6650c<Z, R> f37617f;

    /* renamed from: g */
    public InterfaceC9645b<T> f37618g;

    public C7752a(InterfaceC7757f<A, T, Z, R> interfaceC7757f) {
        this.f37613b = interfaceC7757f;
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: a */
    public InterfaceC9645b<T> mo25839a() {
        InterfaceC9645b<T> interfaceC9645b = this.f37618g;
        return interfaceC9645b != null ? interfaceC9645b : this.f37613b.mo25839a();
    }

    @Override // p280q4.InterfaceC7757f
    /* renamed from: b */
    public InterfaceC6650c<Z, R> mo33905b() {
        InterfaceC6650c<Z, R> interfaceC6650c = this.f37617f;
        return interfaceC6650c != null ? interfaceC6650c : this.f37613b.mo33905b();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: c */
    public InterfaceC9649f<Z> mo25840c() {
        InterfaceC9649f<Z> interfaceC9649f = this.f37616e;
        return interfaceC9649f != null ? interfaceC9649f : this.f37613b.mo25840c();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: d */
    public InterfaceC9648e<T, Z> mo25841d() {
        InterfaceC9648e<T, Z> interfaceC9648e = this.f37615d;
        return interfaceC9648e != null ? interfaceC9648e : this.f37613b.mo25841d();
    }

    @Override // p280q4.InterfaceC7753b
    /* renamed from: e */
    public InterfaceC9648e<File, Z> mo25842e() {
        InterfaceC9648e<File, Z> interfaceC9648e = this.f37614c;
        return interfaceC9648e != null ? interfaceC9648e : this.f37613b.mo25842e();
    }

    @Override // p280q4.InterfaceC7757f
    /* renamed from: g */
    public InterfaceC4617l<A, T> mo33906g() {
        return this.f37613b.mo33906g();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C7752a<A, T, Z, R> clone() {
        try {
            return (C7752a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: i */
    public void m33908i(InterfaceC9648e<T, Z> interfaceC9648e) {
        this.f37615d = interfaceC9648e;
    }

    /* renamed from: j */
    public void m33909j(InterfaceC9645b<T> interfaceC9645b) {
        this.f37618g = interfaceC9645b;
    }
}
