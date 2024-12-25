package p039c9;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import p059d9.C4349a;
import p059d9.C4392v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/l.class
 */
/* renamed from: c9.l */
/* loaded from: combined.jar:classes2.jar:c9/l.class */
public final class C1042l {

    /* renamed from: a */
    public final int f6991a;

    /* renamed from: b */
    public final String f6992b;

    /* renamed from: c */
    public final TreeSet<C1050t> f6993c;

    /* renamed from: d */
    public final ArrayList<a> f6994d;

    /* renamed from: e */
    public C1047q f6995e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/l$a.class
     */
    /* renamed from: c9.l$a */
    /* loaded from: combined.jar:classes2.jar:c9/l$a.class */
    public static final class a {

        /* renamed from: a */
        public final long f6996a;

        /* renamed from: b */
        public final long f6997b;

        public a(long j10, long j11) {
            this.f6996a = j10;
            this.f6997b = j11;
        }

        /* renamed from: a */
        public boolean m6135a(long j10, long j11) {
            long j12 = this.f6997b;
            boolean z10 = true;
            if (j12 == -1) {
                if (j10 < this.f6996a) {
                    z10 = false;
                }
                return z10;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f6996a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
        
            if ((r0 + r0) > r6) goto L8;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m6136b(long r6, long r8) {
            /*
                r5 = this;
                r0 = r5
                long r0 = r0.f6996a
                r10 = r0
                r0 = 0
                r12 = r0
                r0 = 0
                r13 = r0
                r0 = r10
                r1 = r6
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L33
                r0 = r5
                long r0 = r0.f6997b
                r8 = r0
                r0 = r8
                r1 = -1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L2d
                r0 = r13
                r12 = r0
                r0 = r10
                r1 = r8
                long r0 = r0 + r1
                r1 = r6
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L30
            L2d:
                r0 = 1
                r12 = r0
            L30:
                r0 = r12
                return r0
            L33:
                r0 = r8
                r1 = -1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L44
                r0 = r6
                r1 = r8
                long r0 = r0 + r1
                r1 = r10
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L47
            L44:
                r0 = 1
                r12 = r0
            L47:
                r0 = r12
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p039c9.C1042l.a.m6136b(long, long):boolean");
        }
    }

    public C1042l(int i10, String str) {
        this(i10, str, C1047q.f7018c);
    }

    public C1042l(int i10, String str, C1047q c1047q) {
        this.f6991a = i10;
        this.f6992b = str;
        this.f6995e = c1047q;
        this.f6993c = new TreeSet<>();
        this.f6994d = new ArrayList<>();
    }

    /* renamed from: a */
    public void m6122a(C1050t c1050t) {
        this.f6993c.add(c1050t);
    }

    /* renamed from: b */
    public boolean m6123b(C1046p c1046p) {
        this.f6995e = this.f6995e.m6194e(c1046p);
        return !r0.equals(r0);
    }

    /* renamed from: c */
    public long m6124c(long j10, long j11) {
        C4349a.m21878a(j10 >= 0);
        C4349a.m21878a(j11 >= 0);
        C1050t m6126e = m6126e(j10, j11);
        long j12 = Long.MAX_VALUE;
        if (m6126e.m6112d()) {
            if (!m6126e.m6113e()) {
                j12 = m6126e.f6977d;
            }
            return -Math.min(j12, j11);
        }
        long j13 = j10 + j11;
        if (j13 >= 0) {
            j12 = j13;
        }
        long j14 = m6126e.f6976c + m6126e.f6977d;
        long j15 = j14;
        if (j14 < j12) {
            Iterator<C1050t> it = this.f6993c.tailSet(m6126e, false).iterator();
            while (true) {
                j15 = j14;
                if (!it.hasNext()) {
                    break;
                }
                C1050t next = it.next();
                long j16 = next.f6976c;
                if (j16 > j14) {
                    j15 = j14;
                    break;
                }
                j15 = Math.max(j14, j16 + next.f6977d);
                j14 = j15;
                if (j15 >= j12) {
                    break;
                }
            }
        }
        return Math.min(j15 - j10, j11);
    }

    /* renamed from: d */
    public C1047q m6125d() {
        return this.f6995e;
    }

    /* renamed from: e */
    public C1050t m6126e(long j10, long j11) {
        C1050t m6218j = C1050t.m6218j(this.f6992b, j10);
        C1050t floor = this.f6993c.floor(m6218j);
        if (floor != null && floor.f6976c + floor.f6977d > j10) {
            return floor;
        }
        C1050t ceiling = this.f6993c.ceiling(m6218j);
        long j12 = j11;
        if (ceiling != null) {
            j12 = ceiling.f6976c - j10;
            if (j11 != -1) {
                j12 = Math.min(j12, j11);
            }
        }
        return C1050t.m6217i(this.f6992b, j10, j12);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1042l.class != obj.getClass()) {
            return false;
        }
        C1042l c1042l = (C1042l) obj;
        if (this.f6991a != c1042l.f6991a || !this.f6992b.equals(c1042l.f6992b) || !this.f6993c.equals(c1042l.f6993c) || !this.f6995e.equals(c1042l.f6995e)) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public TreeSet<C1050t> m6127f() {
        return this.f6993c;
    }

    /* renamed from: g */
    public boolean m6128g() {
        return this.f6993c.isEmpty();
    }

    /* renamed from: h */
    public boolean m6129h(long j10, long j11) {
        for (int i10 = 0; i10 < this.f6994d.size(); i10++) {
            if (this.f6994d.get(i10).m6135a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6991a * 31) + this.f6992b.hashCode()) * 31) + this.f6995e.hashCode();
    }

    /* renamed from: i */
    public boolean m6130i() {
        return this.f6994d.isEmpty();
    }

    /* renamed from: j */
    public boolean m6131j(long j10, long j11) {
        for (int i10 = 0; i10 < this.f6994d.size(); i10++) {
            if (this.f6994d.get(i10).m6136b(j10, j11)) {
                return false;
            }
        }
        this.f6994d.add(new a(j10, j11));
        return true;
    }

    /* renamed from: k */
    public boolean m6132k(C1040j c1040j) {
        if (!this.f6993c.remove(c1040j)) {
            return false;
        }
        File file = c1040j.f6979f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    /* renamed from: l */
    public C1050t m6133l(C1050t c1050t, long j10, boolean z10) {
        C4349a.m21884g(this.f6993c.remove(c1050t));
        File file = (File) C4349a.m21882e(c1050t.f6979f);
        File file2 = file;
        if (z10) {
            file2 = C1050t.m6219m((File) C4349a.m21882e(file.getParentFile()), this.f6991a, c1050t.f6976c, j10);
            if (!file.renameTo(file2)) {
                C4392v.m22275i("CachedContent", "Failed to rename " + file + " to " + file2);
                file2 = file;
            }
        }
        C1050t m6221f = c1050t.m6221f(file2, j10);
        this.f6993c.add(m6221f);
        return m6221f;
    }

    /* renamed from: m */
    public void m6134m(long j10) {
        for (int i10 = 0; i10 < this.f6994d.size(); i10++) {
            if (this.f6994d.get(i10).f6996a == j10) {
                this.f6994d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
