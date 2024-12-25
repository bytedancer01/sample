package p392x;

import p392x.C9605f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/g.class
 */
/* renamed from: x.g */
/* loaded from: combined.jar:classes1.jar:x/g.class */
public class C9606g extends C9605f {

    /* renamed from: m */
    public int f43892m;

    public C9606g(AbstractC9612m abstractC9612m) {
        super(abstractC9612m);
        this.f43884e = abstractC9612m instanceof C9609j ? C9605f.a.HORIZONTAL_DIMENSION : C9605f.a.VERTICAL_DIMENSION;
    }

    @Override // p392x.C9605f
    /* renamed from: d */
    public void mo40474d(int i10) {
        if (this.f43889j) {
            return;
        }
        this.f43889j = true;
        this.f43886g = i10;
        for (InterfaceC9603d interfaceC9603d : this.f43890k) {
            interfaceC9603d.mo40449a(interfaceC9603d);
        }
    }
}
