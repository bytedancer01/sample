package p338te;

import java.util.ArrayList;
import java.util.List;
import p444zd.C10202j;
import td.AbstractC8693h;
import td.C8688c;
import td.C8694i;
import td.C8699n;
import td.C8701p;
import td.InterfaceC8697l;
import td.InterfaceC8702q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:te/i.class
 */
/* renamed from: te.i */
/* loaded from: combined.jar:classes2.jar:te/i.class */
public class C8711i implements InterfaceC8702q {

    /* renamed from: a */
    public InterfaceC8697l f40497a;

    /* renamed from: b */
    public List<C8701p> f40498b = new ArrayList();

    public C8711i(InterfaceC8697l interfaceC8697l) {
        this.f40497a = interfaceC8697l;
    }

    @Override // td.InterfaceC8702q
    /* renamed from: a */
    public void mo37224a(C8701p c8701p) {
        this.f40498b.add(c8701p);
    }

    /* renamed from: b */
    public C8699n m37230b(C8688c c8688c) {
        C8699n c8699n;
        this.f40498b.clear();
        try {
            InterfaceC8697l interfaceC8697l = this.f40497a;
            c8699n = interfaceC8697l instanceof C8694i ? ((C8694i) interfaceC8697l).m37207d(c8688c) : interfaceC8697l.mo6325b(c8688c);
        } catch (Exception e10) {
            c8699n = null;
        } catch (Throwable th2) {
            this.f40497a.reset();
            throw th2;
        }
        this.f40497a.reset();
        return c8699n;
    }

    /* renamed from: c */
    public C8699n m37231c(AbstractC8693h abstractC8693h) {
        return m37230b(mo37233e(abstractC8693h));
    }

    /* renamed from: d */
    public List<C8701p> m37232d() {
        return new ArrayList(this.f40498b);
    }

    /* renamed from: e */
    public C8688c mo37233e(AbstractC8693h abstractC8693h) {
        return new C8688c(new C10202j(abstractC8693h));
    }
}
