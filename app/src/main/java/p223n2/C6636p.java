package p223n2;

import androidx.work.C0757b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p071e2.AbstractC4582k;
import p071e2.C4573b;
import p071e2.C4591t;
import p071e2.EnumC4572a;
import p071e2.EnumC4586o;
import p206m.InterfaceC5884a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n2/p.class
 */
/* renamed from: n2.p */
/* loaded from: combined.jar:classes1.jar:n2/p.class */
public final class C6636p {

    /* renamed from: s */
    public static final String f34571s = AbstractC4582k.m23128f("WorkSpec");

    /* renamed from: t */
    public static final InterfaceC5884a<List<c>, List<C4591t>> f34572t = new a();

    /* renamed from: a */
    public String f34573a;

    /* renamed from: b */
    public C4591t.a f34574b;

    /* renamed from: c */
    public String f34575c;

    /* renamed from: d */
    public String f34576d;

    /* renamed from: e */
    public C0757b f34577e;

    /* renamed from: f */
    public C0757b f34578f;

    /* renamed from: g */
    public long f34579g;

    /* renamed from: h */
    public long f34580h;

    /* renamed from: i */
    public long f34581i;

    /* renamed from: j */
    public C4573b f34582j;

    /* renamed from: k */
    public int f34583k;

    /* renamed from: l */
    public EnumC4572a f34584l;

    /* renamed from: m */
    public long f34585m;

    /* renamed from: n */
    public long f34586n;

    /* renamed from: o */
    public long f34587o;

    /* renamed from: p */
    public long f34588p;

    /* renamed from: q */
    public boolean f34589q;

    /* renamed from: r */
    public EnumC4586o f34590r;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/p$a.class
     */
    /* renamed from: n2.p$a */
    /* loaded from: combined.jar:classes1.jar:n2/p$a.class */
    public class a implements InterfaceC5884a<List<c>, List<C4591t>> {
        @Override // p206m.InterfaceC5884a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C4591t> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m30592a());
            }
            return arrayList;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/p$b.class
     */
    /* renamed from: n2.p$b */
    /* loaded from: combined.jar:classes1.jar:n2/p$b.class */
    public static class b {

        /* renamed from: a */
        public String f34591a;

        /* renamed from: b */
        public C4591t.a f34592b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f34592b != bVar.f34592b) {
                return false;
            }
            return this.f34591a.equals(bVar.f34591a);
        }

        public int hashCode() {
            return (this.f34591a.hashCode() * 31) + this.f34592b.hashCode();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:n2/p$c.class
     */
    /* renamed from: n2.p$c */
    /* loaded from: combined.jar:classes1.jar:n2/p$c.class */
    public static class c {

        /* renamed from: a */
        public String f34593a;

        /* renamed from: b */
        public C4591t.a f34594b;

        /* renamed from: c */
        public C0757b f34595c;

        /* renamed from: d */
        public int f34596d;

        /* renamed from: e */
        public List<String> f34597e;

        /* renamed from: f */
        public List<C0757b> f34598f;

        /* renamed from: a */
        public C4591t m30592a() {
            List<C0757b> list = this.f34598f;
            return new C4591t(UUID.fromString(this.f34593a), this.f34594b, this.f34595c, this.f34597e, (list == null || list.isEmpty()) ? C0757b.f5186c : this.f34598f.get(0), this.f34596d);
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f34596d != cVar.f34596d) {
                return false;
            }
            String str = this.f34593a;
            if (str != null) {
                if (!str.equals(cVar.f34593a)) {
                    return false;
                }
            } else if (cVar.f34593a != null) {
                return false;
            }
            if (this.f34594b != cVar.f34594b) {
                return false;
            }
            C0757b c0757b = this.f34595c;
            if (c0757b != null) {
                if (!c0757b.equals(cVar.f34595c)) {
                    return false;
                }
            } else if (cVar.f34595c != null) {
                return false;
            }
            List<String> list = this.f34597e;
            if (list != null) {
                if (!list.equals(cVar.f34597e)) {
                    return false;
                }
            } else if (cVar.f34597e != null) {
                return false;
            }
            List<C0757b> list2 = this.f34598f;
            List<C0757b> list3 = cVar.f34598f;
            if (list2 != null) {
                z10 = list2.equals(list3);
            } else if (list3 != null) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            String str = this.f34593a;
            int i10 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            C4591t.a aVar = this.f34594b;
            int hashCode2 = aVar != null ? aVar.hashCode() : 0;
            C0757b c0757b = this.f34595c;
            int hashCode3 = c0757b != null ? c0757b.hashCode() : 0;
            int i11 = this.f34596d;
            List<String> list = this.f34597e;
            int hashCode4 = list != null ? list.hashCode() : 0;
            List<C0757b> list2 = this.f34598f;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i11) * 31) + hashCode4) * 31) + i10;
        }
    }

    public C6636p(String str, String str2) {
        this.f34574b = C4591t.a.ENQUEUED;
        C0757b c0757b = C0757b.f5186c;
        this.f34577e = c0757b;
        this.f34578f = c0757b;
        this.f34582j = C4573b.f27195i;
        this.f34584l = EnumC4572a.EXPONENTIAL;
        this.f34585m = 30000L;
        this.f34588p = -1L;
        this.f34590r = EnumC4586o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f34573a = str;
        this.f34575c = str2;
    }

    public C6636p(C6636p c6636p) {
        this.f34574b = C4591t.a.ENQUEUED;
        C0757b c0757b = C0757b.f5186c;
        this.f34577e = c0757b;
        this.f34578f = c0757b;
        this.f34582j = C4573b.f27195i;
        this.f34584l = EnumC4572a.EXPONENTIAL;
        this.f34585m = 30000L;
        this.f34588p = -1L;
        this.f34590r = EnumC4586o.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f34573a = c6636p.f34573a;
        this.f34575c = c6636p.f34575c;
        this.f34574b = c6636p.f34574b;
        this.f34576d = c6636p.f34576d;
        this.f34577e = new C0757b(c6636p.f34577e);
        this.f34578f = new C0757b(c6636p.f34578f);
        this.f34579g = c6636p.f34579g;
        this.f34580h = c6636p.f34580h;
        this.f34581i = c6636p.f34581i;
        this.f34582j = new C4573b(c6636p.f34582j);
        this.f34583k = c6636p.f34583k;
        this.f34584l = c6636p.f34584l;
        this.f34585m = c6636p.f34585m;
        this.f34586n = c6636p.f34586n;
        this.f34587o = c6636p.f34587o;
        this.f34588p = c6636p.f34588p;
        this.f34589q = c6636p.f34589q;
        this.f34590r = c6636p.f34590r;
    }

    /* renamed from: a */
    public long m30587a() {
        boolean z10 = false;
        if (m30589c()) {
            if (this.f34584l == EnumC4572a.LINEAR) {
                z10 = true;
            }
            return this.f34586n + Math.min(18000000L, z10 ? this.f34585m * this.f34583k : (long) Math.scalb(this.f34585m, this.f34583k - 1));
        }
        long j10 = 0;
        if (!m30590d()) {
            long j11 = this.f34586n;
            long j12 = j11;
            if (j11 == 0) {
                j12 = System.currentTimeMillis();
            }
            return j12 + this.f34579g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j13 = this.f34586n;
        long j14 = j13 == 0 ? currentTimeMillis + this.f34579g : j13;
        long j15 = this.f34581i;
        long j16 = this.f34580h;
        boolean z11 = false;
        if (j15 != j16) {
            z11 = true;
        }
        if (z11) {
            if (j13 == 0) {
                j10 = j15 * (-1);
            }
            return j14 + j16 + j10;
        }
        if (j13 != 0) {
            j10 = j16;
        }
        return j14 + j10;
    }

    /* renamed from: b */
    public boolean m30588b() {
        return !C4573b.f27195i.equals(this.f34582j);
    }

    /* renamed from: c */
    public boolean m30589c() {
        return this.f34574b == C4591t.a.ENQUEUED && this.f34583k > 0;
    }

    /* renamed from: d */
    public boolean m30590d() {
        return this.f34580h != 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C6636p.class != obj.getClass()) {
            return false;
        }
        C6636p c6636p = (C6636p) obj;
        if (this.f34579g != c6636p.f34579g || this.f34580h != c6636p.f34580h || this.f34581i != c6636p.f34581i || this.f34583k != c6636p.f34583k || this.f34585m != c6636p.f34585m || this.f34586n != c6636p.f34586n || this.f34587o != c6636p.f34587o || this.f34588p != c6636p.f34588p || this.f34589q != c6636p.f34589q || !this.f34573a.equals(c6636p.f34573a) || this.f34574b != c6636p.f34574b || !this.f34575c.equals(c6636p.f34575c)) {
            return false;
        }
        String str = this.f34576d;
        if (str != null) {
            if (!str.equals(c6636p.f34576d)) {
                return false;
            }
        } else if (c6636p.f34576d != null) {
            return false;
        }
        if (!this.f34577e.equals(c6636p.f34577e) || !this.f34578f.equals(c6636p.f34578f) || !this.f34582j.equals(c6636p.f34582j) || this.f34584l != c6636p.f34584l) {
            return false;
        }
        if (this.f34590r != c6636p.f34590r) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f34573a.hashCode();
        int hashCode2 = this.f34574b.hashCode();
        int hashCode3 = this.f34575c.hashCode();
        String str = this.f34576d;
        int hashCode4 = str != null ? str.hashCode() : 0;
        int hashCode5 = this.f34577e.hashCode();
        int hashCode6 = this.f34578f.hashCode();
        long j10 = this.f34579g;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.f34580h;
        int i11 = (int) (j11 ^ (j11 >>> 32));
        long j12 = this.f34581i;
        int i12 = (int) (j12 ^ (j12 >>> 32));
        int hashCode7 = this.f34582j.hashCode();
        int i13 = this.f34583k;
        int hashCode8 = this.f34584l.hashCode();
        long j13 = this.f34585m;
        int i14 = (int) (j13 ^ (j13 >>> 32));
        long j14 = this.f34586n;
        int i15 = (int) (j14 ^ (j14 >>> 32));
        long j15 = this.f34587o;
        int i16 = (int) (j15 ^ (j15 >>> 32));
        long j16 = this.f34588p;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + hashCode7) * 31) + i13) * 31) + hashCode8) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f34589q ? 1 : 0)) * 31) + this.f34590r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f34573a + "}";
    }
}
