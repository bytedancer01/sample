package p421y8;

import p009a8.C0083a1;
import p009a8.InterfaceC0127w;
import p027b9.InterfaceC0840f;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p267p6.InterfaceC7633x1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/o.class
 */
/* renamed from: y8.o */
/* loaded from: combined.jar:classes2.jar:y8/o.class */
public abstract class AbstractC9891o {

    /* renamed from: a */
    public a f45507a;

    /* renamed from: b */
    public InterfaceC0840f f45508b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y8/o$a.class
     */
    /* renamed from: y8.o$a */
    /* loaded from: combined.jar:classes2.jar:y8/o$a.class */
    public interface a {
        /* renamed from: b */
        void mo33088b();
    }

    /* renamed from: a */
    public final InterfaceC0840f m41745a() {
        return (InterfaceC0840f) C4349a.m21882e(this.f45508b);
    }

    /* renamed from: b */
    public final void m41746b(a aVar, InterfaceC0840f interfaceC0840f) {
        this.f45507a = aVar;
        this.f45508b = interfaceC0840f;
    }

    /* renamed from: c */
    public final void m41747c() {
        a aVar = this.f45507a;
        if (aVar != null) {
            aVar.mo33088b();
        }
    }

    /* renamed from: d */
    public abstract void mo41703d(Object obj);

    /* renamed from: e */
    public abstract C9892p mo41704e(InterfaceC7633x1[] interfaceC7633x1Arr, C0083a1 c0083a1, InterfaceC0127w.a aVar, AbstractC7574e2 abstractC7574e2);
}
