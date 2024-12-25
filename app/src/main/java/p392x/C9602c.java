package p392x;

import java.util.ArrayList;
import java.util.Iterator;
import p373w.C9385e;
import p373w.C9386f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/c.class
 */
/* renamed from: x.c */
/* loaded from: combined.jar:classes1.jar:x/c.class */
public class C9602c extends AbstractC9612m {

    /* renamed from: k */
    public ArrayList<AbstractC9612m> f43869k;

    /* renamed from: l */
    public int f43870l;

    public C9602c(C9385e c9385e, int i10) {
        super(c9385e);
        this.f43869k = new ArrayList<>();
        this.f43911f = i10;
        m40455q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0392, code lost:
    
        if (r16 != r9) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03fc, code lost:
    
        r0.f43910e.mo40474d(r21);
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03f2, code lost:
    
        r17 = r11 + 1;
        r21 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ef, code lost:
    
        if (r16 != r9) goto L133;
     */
    @Override // p392x.AbstractC9612m, p392x.InterfaceC9603d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40449a(p392x.InterfaceC9603d r5) {
        /*
            Method dump skipped, instructions count: 2475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9602c.mo40449a(x.d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r7 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        m40484b(r5.f43914i, r7, -r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010d, code lost:
    
        if (r7 != null) goto L34;
     */
    @Override // p392x.AbstractC9612m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40450d() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9602c.mo40450d():void");
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: e */
    public void mo40451e() {
        for (int i10 = 0; i10 < this.f43869k.size(); i10++) {
            this.f43869k.get(i10).mo40451e();
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: f */
    public void mo40452f() {
        this.f43908c = null;
        Iterator<AbstractC9612m> it = this.f43869k.iterator();
        while (it.hasNext()) {
            it.next().mo40452f();
        }
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: j */
    public long mo40453j() {
        int size = this.f43869k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r0.f43913h.f43885f + this.f43869k.get(i10).mo40453j() + r0.f43914i.f43885f;
        }
        return j10;
    }

    @Override // p392x.AbstractC9612m
    /* renamed from: m */
    public boolean mo40454m() {
        int size = this.f43869k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f43869k.get(i10).mo40454m()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m40455q() {
        C9385e c9385e;
        C9385e c9385e2 = this.f43907b;
        do {
            c9385e = c9385e2;
            c9385e2 = c9385e.m39598F(this.f43911f);
        } while (c9385e2 != null);
        this.f43907b = c9385e;
        this.f43869k.add(c9385e.m39602H(this.f43911f));
        C9385e m39594D = c9385e.m39594D(this.f43911f);
        while (true) {
            C9385e c9385e3 = m39594D;
            if (c9385e3 == null) {
                break;
            }
            this.f43869k.add(c9385e3.m39602H(this.f43911f));
            m39594D = c9385e3.m39594D(this.f43911f);
        }
        Iterator<AbstractC9612m> it = this.f43869k.iterator();
        while (it.hasNext()) {
            AbstractC9612m next = it.next();
            int i10 = this.f43911f;
            if (i10 == 0) {
                next.f43907b.f42977c = this;
            } else if (i10 == 1) {
                next.f43907b.f42979d = this;
            }
        }
        if ((this.f43911f == 0 && ((C9386f) this.f43907b.m39596E()).m39681W0()) && this.f43869k.size() > 1) {
            ArrayList<AbstractC9612m> arrayList = this.f43869k;
            this.f43907b = arrayList.get(arrayList.size() - 1).f43907b;
        }
        this.f43870l = this.f43911f == 0 ? this.f43907b.m39658v() : this.f43907b.m39604J();
    }

    /* renamed from: r */
    public final C9385e m40456r() {
        for (int i10 = 0; i10 < this.f43869k.size(); i10++) {
            AbstractC9612m abstractC9612m = this.f43869k.get(i10);
            if (abstractC9612m.f43907b.m39607M() != 8) {
                return abstractC9612m.f43907b;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final C9385e m40457s() {
        for (int size = this.f43869k.size() - 1; size >= 0; size--) {
            AbstractC9612m abstractC9612m = this.f43869k.get(size);
            if (abstractC9612m.f43907b.m39607M() != 8) {
                return abstractC9612m.f43907b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f43911f == 0 ? "horizontal : " : "vertical : ");
        String sb3 = sb2.toString();
        Iterator<AbstractC9612m> it = this.f43869k.iterator();
        while (it.hasNext()) {
            AbstractC9612m next = it.next();
            sb3 = ((sb3 + "<") + next) + "> ";
        }
        return sb3;
    }
}
