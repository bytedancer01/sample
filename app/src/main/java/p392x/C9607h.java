package p392x;

import p373w.C9385e;
import p373w.C9387g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/h.class
 */
/* renamed from: x.h */
/* loaded from: combined.jar:classes1.jar:x/h.class */
public class C9607h extends AbstractC9612m {
    public C9607h(C9385e c9385e) {
        super(c9385e);
        c9385e.f42981e.mo40452f();
        c9385e.f42983f.mo40452f();
        this.f43911f = ((C9387g) c9385e).m39691H0();
    }

    @Override // p392x.AbstractC9612m, p392x.InterfaceC9603d
    /* renamed from: a */
    public void mo40449a(InterfaceC9603d interfaceC9603d) {
        C9605f c9605f = this.f43913h;
        if (c9605f.f43882c && !c9605f.f43889j) {
            this.f43913h.mo40474d((int) ((c9605f.f43891l.get(0).f43886g * ((C9387g) this.f43907b).m39694K0()) + 0.5f));
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: d */
    public void mo40450d() {
        C9605f c9605f;
        AbstractC9612m abstractC9612m;
        C9605f c9605f2;
        C9387g c9387g = (C9387g) this.f43907b;
        int m39692I0 = c9387g.m39692I0();
        int m39693J0 = c9387g.m39693J0();
        c9387g.m39694K0();
        if (c9387g.m39691H0() == 1) {
            C9605f c9605f3 = this.f43913h;
            if (m39692I0 != -1) {
                c9605f3.f43891l.add(this.f43907b.f42960N.f42981e.f43913h);
                this.f43907b.f42960N.f42981e.f43913h.f43890k.add(this.f43913h);
                c9605f2 = this.f43913h;
            } else if (m39693J0 != -1) {
                c9605f3.f43891l.add(this.f43907b.f42960N.f42981e.f43914i);
                this.f43907b.f42960N.f42981e.f43914i.f43890k.add(this.f43913h);
                c9605f2 = this.f43913h;
                m39692I0 = -m39693J0;
            } else {
                c9605f3.f43881b = true;
                c9605f3.f43891l.add(this.f43907b.f42960N.f42981e.f43914i);
                this.f43907b.f42960N.f42981e.f43914i.f43890k.add(this.f43913h);
                m40475q(this.f43907b.f42981e.f43913h);
                abstractC9612m = this.f43907b.f42981e;
            }
            c9605f2.f43885f = m39692I0;
            m40475q(this.f43907b.f42981e.f43913h);
            abstractC9612m = this.f43907b.f42981e;
        } else {
            C9605f c9605f4 = this.f43913h;
            if (m39692I0 != -1) {
                c9605f4.f43891l.add(this.f43907b.f42960N.f42983f.f43913h);
                this.f43907b.f42960N.f42983f.f43913h.f43890k.add(this.f43913h);
                c9605f = this.f43913h;
            } else if (m39693J0 != -1) {
                c9605f4.f43891l.add(this.f43907b.f42960N.f42983f.f43914i);
                this.f43907b.f42960N.f42983f.f43914i.f43890k.add(this.f43913h);
                c9605f = this.f43913h;
                m39692I0 = -m39693J0;
            } else {
                c9605f4.f43881b = true;
                c9605f4.f43891l.add(this.f43907b.f42960N.f42983f.f43914i);
                this.f43907b.f42960N.f42983f.f43914i.f43890k.add(this.f43913h);
                m40475q(this.f43907b.f42983f.f43913h);
                abstractC9612m = this.f43907b.f42983f;
            }
            c9605f.f43885f = m39692I0;
            m40475q(this.f43907b.f42983f.f43913h);
            abstractC9612m = this.f43907b.f42983f;
        }
        m40475q(abstractC9612m.f43914i);
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: e */
    public void mo40451e() {
        if (((C9387g) this.f43907b).m39691H0() == 1) {
            this.f43907b.m39593C0(this.f43913h.f43886g);
        } else {
            this.f43907b.m39595D0(this.f43913h.f43886g);
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: f */
    public void mo40452f() {
        this.f43913h.m40473c();
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: m */
    public boolean mo40454m() {
        return false;
    }

    /* renamed from: q */
    public final void m40475q(C9605f c9605f) {
        this.f43913h.f43890k.add(c9605f);
        c9605f.f43891l.add(this.f43913h);
    }
}
