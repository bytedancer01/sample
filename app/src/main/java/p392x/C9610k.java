package p392x;

import java.util.ArrayList;
import p373w.C9386f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/k.class
 */
/* renamed from: x.k */
/* loaded from: combined.jar:classes1.jar:x/k.class */
public class C9610k {

    /* renamed from: h */
    public static int f43895h;

    /* renamed from: c */
    public AbstractC9612m f43898c;

    /* renamed from: d */
    public AbstractC9612m f43899d;

    /* renamed from: f */
    public int f43901f;

    /* renamed from: g */
    public int f43902g;

    /* renamed from: a */
    public int f43896a = 0;

    /* renamed from: b */
    public boolean f43897b = false;

    /* renamed from: e */
    public ArrayList<AbstractC9612m> f43900e = new ArrayList<>();

    public C9610k(AbstractC9612m abstractC9612m, int i10) {
        this.f43898c = null;
        this.f43899d = null;
        int i11 = f43895h;
        this.f43901f = i11;
        f43895h = i11 + 1;
        this.f43898c = abstractC9612m;
        this.f43899d = abstractC9612m;
        this.f43902g = i10;
    }

    /* renamed from: a */
    public void m40479a(AbstractC9612m abstractC9612m) {
        this.f43900e.add(abstractC9612m);
        this.f43899d = abstractC9612m;
    }

    /* renamed from: b */
    public long m40480b(C9386f c9386f, int i10) {
        long mo40453j;
        AbstractC9612m abstractC9612m;
        long j10;
        long j11;
        long max;
        AbstractC9612m abstractC9612m2 = this.f43898c;
        long j12 = 0;
        if (abstractC9612m2 instanceof C9602c) {
            if (((C9602c) abstractC9612m2).f43911f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(abstractC9612m2 instanceof C9609j)) {
                return 0L;
            }
        } else if (!(abstractC9612m2 instanceof C9611l)) {
            return 0L;
        }
        C9605f c9605f = (i10 == 0 ? c9386f.f42981e : c9386f.f42983f).f43913h;
        C9605f c9605f2 = (i10 == 0 ? c9386f.f42981e : c9386f.f42983f).f43914i;
        boolean contains = abstractC9612m2.f43913h.f43891l.contains(c9605f);
        boolean contains2 = this.f43898c.f43914i.f43891l.contains(c9605f2);
        long mo40453j2 = this.f43898c.mo40453j();
        if (!contains || !contains2) {
            if (contains) {
                j11 = m40482d(this.f43898c.f43913h, r0.f43885f);
                j10 = this.f43898c.f43913h.f43885f + mo40453j2;
            } else if (contains2) {
                j10 = (-this.f43898c.f43914i.f43885f) + mo40453j2;
                j11 = -m40481c(this.f43898c.f43914i, r0.f43885f);
            } else {
                mo40453j = r0.f43913h.f43885f + this.f43898c.mo40453j();
                abstractC9612m = this.f43898c;
            }
            max = Math.max(j11, j10);
            return max;
        }
        long m40482d = m40482d(this.f43898c.f43913h, 0L);
        long m40481c = m40481c(this.f43898c.f43914i, 0L);
        long j13 = m40482d - mo40453j2;
        AbstractC9612m abstractC9612m3 = this.f43898c;
        int i11 = abstractC9612m3.f43914i.f43885f;
        long j14 = j13;
        if (j13 >= (-i11)) {
            j14 = j13 + i11;
        }
        long j15 = -m40481c;
        int i12 = abstractC9612m3.f43913h.f43885f;
        long j16 = (j15 - mo40453j2) - i12;
        long j17 = j16;
        if (j16 >= i12) {
            j17 = j16 - i12;
        }
        float m39640m = abstractC9612m3.f43907b.m39640m(i10);
        if (m39640m > 0.0f) {
            j12 = (long) ((j17 / m39640m) + (j14 / (1.0f - m39640m)));
        }
        float f10 = j12;
        abstractC9612m = this.f43898c;
        mo40453j = abstractC9612m.f43913h.f43885f + ((long) ((f10 * m39640m) + 0.5f)) + mo40453j2 + ((long) ((f10 * (1.0f - m39640m)) + 0.5f));
        max = mo40453j - abstractC9612m.f43914i.f43885f;
        return max;
    }

    /* renamed from: c */
    public final long m40481c(C9605f c9605f, long j10) {
        long j11;
        AbstractC9612m abstractC9612m = c9605f.f43883d;
        if (abstractC9612m instanceof C9608i) {
            return j10;
        }
        int size = c9605f.f43890k.size();
        int i10 = 0;
        long j12 = j10;
        while (true) {
            j11 = j12;
            if (i10 >= size) {
                break;
            }
            InterfaceC9603d interfaceC9603d = c9605f.f43890k.get(i10);
            long j13 = j11;
            if (interfaceC9603d instanceof C9605f) {
                C9605f c9605f2 = (C9605f) interfaceC9603d;
                j13 = c9605f2.f43883d == abstractC9612m ? j11 : Math.min(j11, m40481c(c9605f2, c9605f2.f43885f + j10));
            }
            i10++;
            j12 = j13;
        }
        long j14 = j11;
        if (c9605f == abstractC9612m.f43914i) {
            long mo40453j = abstractC9612m.mo40453j();
            C9605f c9605f3 = abstractC9612m.f43913h;
            long j15 = j10 - mo40453j;
            j14 = Math.min(Math.min(j11, m40481c(c9605f3, j15)), j15 - abstractC9612m.f43913h.f43885f);
        }
        return j14;
    }

    /* renamed from: d */
    public final long m40482d(C9605f c9605f, long j10) {
        long j11;
        AbstractC9612m abstractC9612m = c9605f.f43883d;
        if (abstractC9612m instanceof C9608i) {
            return j10;
        }
        int size = c9605f.f43890k.size();
        int i10 = 0;
        long j12 = j10;
        while (true) {
            j11 = j12;
            if (i10 >= size) {
                break;
            }
            InterfaceC9603d interfaceC9603d = c9605f.f43890k.get(i10);
            long j13 = j11;
            if (interfaceC9603d instanceof C9605f) {
                C9605f c9605f2 = (C9605f) interfaceC9603d;
                j13 = c9605f2.f43883d == abstractC9612m ? j11 : Math.max(j11, m40482d(c9605f2, c9605f2.f43885f + j10));
            }
            i10++;
            j12 = j13;
        }
        long j14 = j11;
        if (c9605f == abstractC9612m.f43913h) {
            long mo40453j = abstractC9612m.mo40453j();
            C9605f c9605f3 = abstractC9612m.f43914i;
            long j15 = j10 + mo40453j;
            j14 = Math.max(Math.max(j11, m40482d(c9605f3, j15)), j15 - abstractC9612m.f43914i.f43885f);
        }
        return j14;
    }
}
