package p338te;

import p444zd.C10202j;
import td.AbstractC8693h;
import td.C8688c;
import td.InterfaceC8697l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/o.class
 */
/* renamed from: te.o */
/* loaded from: combined.jar:classes2.jar:te/o.class */
public class C8717o extends C8711i {

    /* renamed from: c */
    public boolean f40517c;

    public C8717o(InterfaceC8697l interfaceC8697l) {
        super(interfaceC8697l);
        this.f40517c = true;
    }

    @Override // p338te.C8711i
    /* renamed from: e */
    public C8688c mo37233e(AbstractC8693h abstractC8693h) {
        if (this.f40517c) {
            this.f40517c = false;
            return new C8688c(new C10202j(abstractC8693h.mo37201e()));
        }
        this.f40517c = true;
        return new C8688c(new C10202j(abstractC8693h));
    }
}
