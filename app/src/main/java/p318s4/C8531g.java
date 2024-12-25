package p318s4;

import p318s4.C8530f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s4/g.class
 */
/* renamed from: s4.g */
/* loaded from: combined.jar:classes1.jar:s4/g.class */
public class C8531g<R> implements InterfaceC8528d<R> {

    /* renamed from: a */
    public final C8530f.a f39910a;

    /* renamed from: b */
    public InterfaceC8527c<R> f39911b;

    public C8531g(C8530f.a aVar) {
        this.f39910a = aVar;
    }

    @Override // p318s4.InterfaceC8528d
    /* renamed from: a */
    public InterfaceC8527c<R> mo36741a(boolean z10, boolean z11) {
        if (z10 || !z11) {
            return C8529e.m36749c();
        }
        if (this.f39911b == null) {
            this.f39911b = new C8530f(this.f39910a);
        }
        return this.f39911b;
    }
}
