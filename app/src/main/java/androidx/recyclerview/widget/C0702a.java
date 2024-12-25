package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0712k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p221n0.C6614f;
import p221n0.InterfaceC6613e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/a.class
 */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/a.class */
public final class C0702a implements C0712k.a {

    /* renamed from: a */
    public InterfaceC6613e<b> f4755a;

    /* renamed from: b */
    public final ArrayList<b> f4756b;

    /* renamed from: c */
    public final ArrayList<b> f4757c;

    /* renamed from: d */
    public final a f4758d;

    /* renamed from: e */
    public Runnable f4759e;

    /* renamed from: f */
    public final boolean f4760f;

    /* renamed from: g */
    public final C0712k f4761g;

    /* renamed from: h */
    public int f4762h;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/a$a.class
     */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/a$a.class */
    public interface a {
        /* renamed from: a */
        void mo4077a(int i10, int i11);

        /* renamed from: b */
        void mo4078b(b bVar);

        /* renamed from: c */
        void mo4079c(b bVar);

        /* renamed from: d */
        void mo4080d(int i10, int i11);

        /* renamed from: e */
        void mo4081e(int i10, int i11, Object obj);

        /* renamed from: f */
        RecyclerView.AbstractC0674e0 mo4082f(int i10);

        /* renamed from: g */
        void mo4083g(int i10, int i11);

        /* renamed from: h */
        void mo4084h(int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/a$b.class
     */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/a$b.class */
    public static final class b {

        /* renamed from: a */
        public int f4763a;

        /* renamed from: b */
        public int f4764b;

        /* renamed from: c */
        public Object f4765c;

        /* renamed from: d */
        public int f4766d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f4763a = i10;
            this.f4764b = i11;
            this.f4766d = i12;
            this.f4765c = obj;
        }

        /* renamed from: a */
        public String m4449a() {
            int i10 = this.f4763a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4763a;
            if (i10 != bVar.f4763a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4766d - this.f4764b) == 1 && this.f4766d == bVar.f4764b && this.f4764b == bVar.f4766d) {
                return true;
            }
            if (this.f4766d != bVar.f4766d || this.f4764b != bVar.f4764b) {
                return false;
            }
            Object obj2 = this.f4765c;
            Object obj3 = bVar.f4765c;
            return obj2 != null ? obj2.equals(obj3) : obj3 == null;
        }

        public int hashCode() {
            return (((this.f4763a * 31) + this.f4764b) * 31) + this.f4766d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m4449a() + ",s:" + this.f4764b + "c:" + this.f4766d + ",p:" + this.f4765c + "]";
        }
    }

    public C0702a(a aVar) {
        this(aVar, false);
    }

    public C0702a(a aVar, boolean z10) {
        this.f4755a = new C6614f(30);
        this.f4756b = new ArrayList<>();
        this.f4757c = new ArrayList<>();
        this.f4762h = 0;
        this.f4758d = aVar;
        this.f4760f = z10;
        this.f4761g = new C0712k(this);
    }

    @Override // androidx.recyclerview.widget.C0712k.a
    /* renamed from: a */
    public b mo4424a(int i10, int i11, int i12, Object obj) {
        b bVar;
        b mo30521b = this.f4755a.mo30521b();
        if (mo30521b == null) {
            bVar = new b(i10, i11, i12, obj);
        } else {
            mo30521b.f4763a = i10;
            mo30521b.f4764b = i11;
            mo30521b.f4766d = i12;
            mo30521b.f4765c = obj;
            bVar = mo30521b;
        }
        return bVar;
    }

    @Override // androidx.recyclerview.widget.C0712k.a
    /* renamed from: b */
    public void mo4425b(b bVar) {
        if (this.f4760f) {
            return;
        }
        bVar.f4765c = null;
        this.f4755a.mo30520a(bVar);
    }

    /* renamed from: c */
    public final void m4426c(b bVar) {
        m4444u(bVar);
    }

    /* renamed from: d */
    public final void m4427d(b bVar) {
        m4444u(bVar);
    }

    /* renamed from: e */
    public int m4428e(int i10) {
        int size = this.f4756b.size();
        int i11 = 0;
        while (true) {
            int i12 = i10;
            if (i11 >= size) {
                return i12;
            }
            b bVar = this.f4756b.get(i11);
            int i13 = bVar.f4763a;
            if (i13 == 1) {
                i10 = i12;
                if (bVar.f4764b <= i12) {
                    i10 = i12 + bVar.f4766d;
                }
            } else if (i13 == 2) {
                int i14 = bVar.f4764b;
                i10 = i12;
                if (i14 <= i12) {
                    int i15 = bVar.f4766d;
                    if (i14 + i15 > i12) {
                        return -1;
                    }
                    i10 = i12 - i15;
                } else {
                    continue;
                }
            } else if (i13 != 8) {
                i10 = i12;
            } else {
                int i16 = bVar.f4764b;
                if (i16 == i12) {
                    i10 = bVar.f4766d;
                } else {
                    int i17 = i12;
                    if (i16 < i12) {
                        i17 = i12 - 1;
                    }
                    i10 = i17;
                    if (bVar.f4766d <= i17) {
                        i10 = i17 + 1;
                    }
                }
            }
            i11++;
        }
    }

    /* renamed from: f */
    public final void m4429f(b bVar) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12 = bVar.f4764b;
        int i13 = bVar.f4766d + i12;
        boolean z12 = -1;
        int i14 = i12;
        int i15 = 0;
        while (true) {
            i10 = i15;
            if (i14 >= i13) {
                break;
            }
            if (this.f4758d.mo4082f(i14) != null || m4431h(i14)) {
                if (z12) {
                    z10 = false;
                } else {
                    m4434k(mo4424a(2, i12, i10, null));
                    z10 = true;
                }
                z12 = true;
            } else {
                if (z12) {
                    m4444u(mo4424a(2, i12, i10, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 = z11;
                z12 = false;
            }
            if (z10) {
                i14 -= i10;
                i13 -= i10;
                i11 = 1;
            } else {
                i11 = i10 + 1;
            }
            i14++;
            i15 = i11;
        }
        b bVar2 = bVar;
        if (i10 != bVar.f4766d) {
            mo4425b(bVar);
            bVar2 = mo4424a(2, i12, i10, null);
        }
        if (z12) {
            m4444u(bVar2);
        } else {
            m4434k(bVar2);
        }
    }

    /* renamed from: g */
    public final void m4430g(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f4764b;
        int i12 = bVar.f4766d;
        int i13 = i11;
        boolean z11 = -1;
        int i14 = 0;
        int i15 = i11;
        while (i15 < i12 + i11) {
            if (this.f4758d.mo4082f(i15) != null || m4431h(i15)) {
                int i16 = i13;
                i10 = i14;
                if (!z11) {
                    m4434k(mo4424a(4, i13, i14, bVar.f4765c));
                    i16 = i15;
                    i10 = 0;
                }
                z10 = true;
                i13 = i16;
            } else {
                int i17 = i13;
                int i18 = i14;
                if (z11) {
                    m4444u(mo4424a(4, i13, i14, bVar.f4765c));
                    i17 = i15;
                    i18 = 0;
                }
                z10 = false;
                i13 = i17;
                i10 = i18;
            }
            i15++;
            z11 = z10;
            i14 = i10 + 1;
        }
        b bVar2 = bVar;
        if (i14 != bVar.f4766d) {
            Object obj = bVar.f4765c;
            mo4425b(bVar);
            bVar2 = mo4424a(4, i13, i14, obj);
        }
        if (z11) {
            m4444u(bVar2);
        } else {
            m4434k(bVar2);
        }
    }

    /* renamed from: h */
    public final boolean m4431h(int i10) {
        int size = this.f4757c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4757c.get(i11);
            int i12 = bVar.f4763a;
            if (i12 == 8) {
                if (m4437n(bVar.f4766d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4764b;
                int i14 = bVar.f4766d;
                for (int i15 = i13; i15 < i14 + i13; i15++) {
                    if (m4437n(i15, i11 + 1) == i10) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m4432i() {
        int size = this.f4757c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4758d.mo4079c(this.f4757c.get(i10));
        }
        m4446w(this.f4757c);
        this.f4762h = 0;
    }

    /* renamed from: j */
    public void m4433j() {
        m4432i();
        int size = this.f4756b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4756b.get(i10);
            int i11 = bVar.f4763a;
            if (i11 == 1) {
                this.f4758d.mo4079c(bVar);
                this.f4758d.mo4083g(bVar.f4764b, bVar.f4766d);
            } else if (i11 == 2) {
                this.f4758d.mo4079c(bVar);
                this.f4758d.mo4084h(bVar.f4764b, bVar.f4766d);
            } else if (i11 == 4) {
                this.f4758d.mo4079c(bVar);
                this.f4758d.mo4081e(bVar.f4764b, bVar.f4766d, bVar.f4765c);
            } else if (i11 == 8) {
                this.f4758d.mo4079c(bVar);
                this.f4758d.mo4077a(bVar.f4764b, bVar.f4766d);
            }
            Runnable runnable = this.f4759e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m4446w(this.f4756b);
        this.f4762h = 0;
    }

    /* renamed from: k */
    public final void m4434k(b bVar) {
        int i10;
        int i11 = bVar.f4763a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m4448y = m4448y(bVar.f4764b, i11);
        int i12 = bVar.f4764b;
        int i13 = bVar.f4763a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4766d; i15++) {
            int m4448y2 = m4448y(bVar.f4764b + (i10 * i15), bVar.f4763a);
            int i16 = bVar.f4763a;
            if (i16 == 2 ? m4448y2 == m4448y : i16 == 4 && m4448y2 == m4448y + 1) {
                i14++;
            } else {
                b mo4424a = mo4424a(i16, m4448y, i14, bVar.f4765c);
                m4435l(mo4424a, i12);
                mo4425b(mo4424a);
                int i17 = i12;
                if (bVar.f4763a == 4) {
                    i17 = i12 + i14;
                }
                i14 = 1;
                i12 = i17;
                m4448y = m4448y2;
            }
        }
        Object obj = bVar.f4765c;
        mo4425b(bVar);
        if (i14 > 0) {
            b mo4424a2 = mo4424a(bVar.f4763a, m4448y, i14, obj);
            m4435l(mo4424a2, i12);
            mo4425b(mo4424a2);
        }
    }

    /* renamed from: l */
    public void m4435l(b bVar, int i10) {
        this.f4758d.mo4078b(bVar);
        int i11 = bVar.f4763a;
        if (i11 == 2) {
            this.f4758d.mo4084h(i10, bVar.f4766d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4758d.mo4081e(i10, bVar.f4766d, bVar.f4765c);
        }
    }

    /* renamed from: m */
    public int m4436m(int i10) {
        return m4437n(i10, 0);
    }

    /* renamed from: n */
    public int m4437n(int i10, int i11) {
        int size = this.f4757c.size();
        int i12 = i11;
        while (true) {
            int i13 = i10;
            if (i12 >= size) {
                return i13;
            }
            b bVar = this.f4757c.get(i12);
            int i14 = bVar.f4763a;
            if (i14 == 8) {
                int i15 = bVar.f4764b;
                if (i15 == i13) {
                    i10 = bVar.f4766d;
                } else {
                    int i16 = i13;
                    if (i15 < i13) {
                        i16 = i13 - 1;
                    }
                    i10 = i16;
                    if (bVar.f4766d <= i16) {
                        i10 = i16 + 1;
                    }
                }
            } else {
                int i17 = bVar.f4764b;
                i10 = i13;
                if (i17 > i13) {
                    continue;
                } else if (i14 == 2) {
                    int i18 = bVar.f4766d;
                    if (i13 < i17 + i18) {
                        return -1;
                    }
                    i10 = i13 - i18;
                } else {
                    i10 = i13;
                    if (i14 == 1) {
                        i10 = i13 + bVar.f4766d;
                    }
                }
            }
            i12++;
        }
    }

    /* renamed from: o */
    public boolean m4438o(int i10) {
        return (i10 & this.f4762h) != 0;
    }

    /* renamed from: p */
    public boolean m4439p() {
        return this.f4756b.size() > 0;
    }

    /* renamed from: q */
    public boolean m4440q() {
        return (this.f4757c.isEmpty() || this.f4756b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public boolean m4441r(int i10, int i11, Object obj) {
        boolean z10 = false;
        if (i11 < 1) {
            return false;
        }
        this.f4756b.add(mo4424a(4, i10, i11, obj));
        this.f4762h |= 4;
        if (this.f4756b.size() == 1) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: s */
    public boolean m4442s(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f4756b.add(mo4424a(8, i10, i11, null));
        this.f4762h |= 8;
        if (this.f4756b.size() == 1) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: t */
    public boolean m4443t(int i10, int i11) {
        boolean z10 = false;
        if (i11 < 1) {
            return false;
        }
        this.f4756b.add(mo4424a(2, i10, i11, null));
        this.f4762h |= 2;
        if (this.f4756b.size() == 1) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: u */
    public final void m4444u(b bVar) {
        this.f4757c.add(bVar);
        int i10 = bVar.f4763a;
        if (i10 == 1) {
            this.f4758d.mo4083g(bVar.f4764b, bVar.f4766d);
            return;
        }
        if (i10 == 2) {
            this.f4758d.mo4080d(bVar.f4764b, bVar.f4766d);
            return;
        }
        if (i10 == 4) {
            this.f4758d.mo4081e(bVar.f4764b, bVar.f4766d, bVar.f4765c);
        } else {
            if (i10 == 8) {
                this.f4758d.mo4077a(bVar.f4764b, bVar.f4766d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    public void m4445v() {
        this.f4761g.m4606b(this.f4756b);
        int size = this.f4756b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4756b.get(i10);
            int i11 = bVar.f4763a;
            if (i11 == 1) {
                m4426c(bVar);
            } else if (i11 == 2) {
                m4429f(bVar);
            } else if (i11 == 4) {
                m4430g(bVar);
            } else if (i11 == 8) {
                m4427d(bVar);
            }
            Runnable runnable = this.f4759e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4756b.clear();
    }

    /* renamed from: w */
    public void m4446w(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo4425b(list.get(i10));
        }
        list.clear();
    }

    /* renamed from: x */
    public void m4447x() {
        m4446w(this.f4756b);
        m4446w(this.f4757c);
        this.f4762h = 0;
    }

    /* renamed from: y */
    public final int m4448y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size = this.f4757c.size() - 1;
        while (true) {
            i12 = i10;
            if (size < 0) {
                break;
            }
            b bVar = this.f4757c.get(size);
            int i19 = bVar.f4763a;
            if (i19 == 8) {
                int i20 = bVar.f4764b;
                int i21 = bVar.f4766d;
                if (i20 < i21) {
                    i15 = i20;
                    i14 = i21;
                } else {
                    i14 = i20;
                    i15 = i21;
                }
                if (i12 < i15 || i12 > i14) {
                    i10 = i12;
                    if (i12 < i20) {
                        if (i11 == 1) {
                            bVar.f4764b = i20 + 1;
                            i16 = i21 + 1;
                        } else {
                            i10 = i12;
                            if (i11 == 2) {
                                bVar.f4764b = i20 - 1;
                                i16 = i21 - 1;
                            }
                        }
                        bVar.f4766d = i16;
                        i10 = i12;
                    }
                } else if (i15 == i20) {
                    if (i11 == 1) {
                        i18 = i21 + 1;
                    } else {
                        if (i11 == 2) {
                            i18 = i21 - 1;
                        }
                        i10 = i12 + 1;
                    }
                    bVar.f4766d = i18;
                    i10 = i12 + 1;
                } else {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10 = i12 - 1;
                    }
                    bVar.f4764b = i17;
                    i10 = i12 - 1;
                }
            } else {
                int i22 = bVar.f4764b;
                if (i22 > i12) {
                    if (i11 == 1) {
                        i13 = i22 + 1;
                    } else {
                        i10 = i12;
                        if (i11 == 2) {
                            i13 = i22 - 1;
                        }
                    }
                    bVar.f4764b = i13;
                    i10 = i12;
                } else if (i19 == 1) {
                    i10 = i12 - bVar.f4766d;
                } else {
                    i10 = i12;
                    if (i19 == 2) {
                        i10 = i12 + bVar.f4766d;
                    }
                }
            }
            size--;
        }
        for (int size2 = this.f4757c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4757c.get(size2);
            if (bVar2.f4763a == 8) {
                int i23 = bVar2.f4766d;
                if (i23 != bVar2.f4764b && i23 >= 0) {
                }
                this.f4757c.remove(size2);
                mo4425b(bVar2);
            } else {
                if (bVar2.f4766d > 0) {
                }
                this.f4757c.remove(size2);
                mo4425b(bVar2);
            }
        }
        return i12;
    }
}
