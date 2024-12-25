package p373w;

import java.util.ArrayList;
import p358v.C9211c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:w/l.class
 */
/* renamed from: w.l */
/* loaded from: combined.jar:classes1.jar:w/l.class */
public class C9392l extends C9385e {

    /* renamed from: w0 */
    public ArrayList<C9385e> f43068w0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo39668H0() {
        ArrayList<C9385e> arrayList = this.f43068w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9385e c9385e = this.f43068w0.get(i10);
            if (c9385e instanceof C9392l) {
                ((C9392l) c9385e).mo39668H0();
            }
        }
    }

    /* renamed from: I0 */
    public void m39706I0(C9385e c9385e) {
        this.f43068w0.remove(c9385e);
        c9385e.m39655t0(null);
    }

    /* renamed from: J0 */
    public void m39707J0() {
        this.f43068w0.clear();
    }

    @Override // p373w.C9385e
    /* renamed from: W */
    public void mo39617W() {
        this.f43068w0.clear();
        super.mo39617W();
    }

    @Override // p373w.C9385e
    /* renamed from: X */
    public void mo39618X(C9211c c9211c) {
        super.mo39618X(c9211c);
        int size = this.f43068w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f43068w0.get(i10).mo39618X(c9211c);
        }
    }

    /* renamed from: b */
    public void m39708b(C9385e c9385e) {
        this.f43068w0.add(c9385e);
        if (c9385e.m39596E() != null) {
            ((C9392l) c9385e.m39596E()).m39706I0(c9385e);
        }
        c9385e.m39655t0(this);
    }
}
