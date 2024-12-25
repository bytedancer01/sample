package p392x;

import p373w.C9381a;
import p373w.C9385e;
import p392x.C9605f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/i.class
 */
/* renamed from: x.i */
/* loaded from: combined.jar:classes1.jar:x/i.class */
public class C9608i extends AbstractC9612m {
    public C9608i(C9385e c9385e) {
        super(c9385e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r0 < r8) goto L9;
     */
    @Override // p392x.AbstractC9612m, p392x.InterfaceC9603d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40449a(p392x.InterfaceC9603d r5) {
        /*
            r4 = this;
            r0 = r4
            w.e r0 = r0.f43907b
            w.a r0 = (p373w.C9381a) r0
            r11 = r0
            r0 = r11
            int r0 = r0.m39563I0()
            r10 = r0
            r0 = r4
            x.f r0 = r0.f43913h
            java.util.List<x.f> r0 = r0.f43891l
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = -1
            r8 = r0
        L22:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5e
            r0 = r5
            java.lang.Object r0 = r0.next()
            x.f r0 = (p392x.C9605f) r0
            int r0 = r0.f43886g
            r9 = r0
            r0 = r8
            r1 = -1
            if (r0 == r1) goto L49
            r0 = r8
            r7 = r0
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L4c
        L49:
            r0 = r9
            r7 = r0
        L4c:
            r0 = r7
            r8 = r0
            r0 = r6
            r1 = r9
            if (r0 >= r1) goto L22
            r0 = r9
            r6 = r0
            r0 = r7
            r8 = r0
            goto L22
        L5e:
            r0 = r10
            if (r0 == 0) goto L7d
            r0 = r10
            r1 = 2
            if (r0 != r1) goto L6c
            goto L7d
        L6c:
            r0 = r4
            x.f r0 = r0.f43913h
            r1 = r6
            r2 = r11
            int r2 = r2.m39564J0()
            int r1 = r1 + r2
            r0.mo40474d(r1)
            goto L8c
        L7d:
            r0 = r4
            x.f r0 = r0.f43913h
            r1 = r8
            r2 = r11
            int r2 = r2.m39564J0()
            int r1 = r1 + r2
            r0.mo40474d(r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9608i.mo40449a(x.d):void");
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: d */
    public void mo40450d() {
        AbstractC9612m abstractC9612m;
        C9385e c9385e = this.f43907b;
        if (c9385e instanceof C9381a) {
            this.f43913h.f43881b = true;
            C9381a c9381a = (C9381a) c9385e;
            int m39563I0 = c9381a.m39563I0();
            boolean m39562H0 = c9381a.m39562H0();
            if (m39563I0 == 0) {
                this.f43913h.f43884e = C9605f.a.LEFT;
                for (int i10 = 0; i10 < c9381a.f43053x0; i10++) {
                    C9385e c9385e2 = c9381a.f43052w0[i10];
                    if (m39562H0 || c9385e2.m39607M() != 8) {
                        C9605f c9605f = c9385e2.f42981e.f43913h;
                        c9605f.f43890k.add(this.f43913h);
                        this.f43913h.f43891l.add(c9605f);
                    }
                }
            } else {
                if (m39563I0 != 1) {
                    if (m39563I0 == 2) {
                        this.f43913h.f43884e = C9605f.a.TOP;
                        for (int i11 = 0; i11 < c9381a.f43053x0; i11++) {
                            C9385e c9385e3 = c9381a.f43052w0[i11];
                            if (m39562H0 || c9385e3.m39607M() != 8) {
                                C9605f c9605f2 = c9385e3.f42983f.f43913h;
                                c9605f2.f43890k.add(this.f43913h);
                                this.f43913h.f43891l.add(c9605f2);
                            }
                        }
                    } else {
                        if (m39563I0 != 3) {
                            return;
                        }
                        this.f43913h.f43884e = C9605f.a.BOTTOM;
                        for (int i12 = 0; i12 < c9381a.f43053x0; i12++) {
                            C9385e c9385e4 = c9381a.f43052w0[i12];
                            if (m39562H0 || c9385e4.m39607M() != 8) {
                                C9605f c9605f3 = c9385e4.f42983f.f43914i;
                                c9605f3.f43890k.add(this.f43913h);
                                this.f43913h.f43891l.add(c9605f3);
                            }
                        }
                    }
                    m40476q(this.f43907b.f42983f.f43913h);
                    abstractC9612m = this.f43907b.f42983f;
                    m40476q(abstractC9612m.f43914i);
                }
                this.f43913h.f43884e = C9605f.a.RIGHT;
                for (int i13 = 0; i13 < c9381a.f43053x0; i13++) {
                    C9385e c9385e5 = c9381a.f43052w0[i13];
                    if (m39562H0 || c9385e5.m39607M() != 8) {
                        C9605f c9605f4 = c9385e5.f42981e.f43914i;
                        c9605f4.f43890k.add(this.f43913h);
                        this.f43913h.f43891l.add(c9605f4);
                    }
                }
            }
            m40476q(this.f43907b.f42981e.f43913h);
            abstractC9612m = this.f43907b.f42981e;
            m40476q(abstractC9612m.f43914i);
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: e */
    public void mo40451e() {
        C9385e c9385e = this.f43907b;
        if (c9385e instanceof C9381a) {
            int m39563I0 = ((C9381a) c9385e).m39563I0();
            if (m39563I0 == 0 || m39563I0 == 1) {
                this.f43907b.m39593C0(this.f43913h.f43886g);
            } else {
                this.f43907b.m39595D0(this.f43913h.f43886g);
            }
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: f */
    public void mo40452f() {
        this.f43908c = null;
        this.f43913h.m40473c();
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: m */
    public boolean mo40454m() {
        return false;
    }

    /* renamed from: q */
    public final void m40476q(C9605f c9605f) {
        this.f43913h.f43890k.add(c9605f);
        c9605f.f43891l.add(this.f43913h);
    }
}
