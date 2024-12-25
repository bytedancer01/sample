package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/b.class
 */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/b.class */
public class C0703b {

    /* renamed from: a */
    public final b f4767a;

    /* renamed from: b */
    public final a f4768b = new a();

    /* renamed from: c */
    public final List<View> f4769c = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/b$a.class
     */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/b$a.class */
    public static class a {

        /* renamed from: a */
        public long f4770a = 0;

        /* renamed from: b */
        public a f4771b;

        /* renamed from: a */
        public void m4470a(int i10) {
            if (i10 < 64) {
                this.f4770a &= (1 << i10) ^ (-1);
                return;
            }
            a aVar = this.f4771b;
            if (aVar != null) {
                aVar.m4470a(i10 - 64);
            }
        }

        /* renamed from: b */
        public int m4471b(int i10) {
            a aVar = this.f4771b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f4770a) : Long.bitCount(this.f4770a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f4770a & ((1 << i10) - 1)) : aVar.m4471b(i10 - 64) + Long.bitCount(this.f4770a);
        }

        /* renamed from: c */
        public final void m4472c() {
            if (this.f4771b == null) {
                this.f4771b = new a();
            }
        }

        /* renamed from: d */
        public boolean m4473d(int i10) {
            if (i10 < 64) {
                return (this.f4770a & (1 << i10)) != 0;
            }
            m4472c();
            return this.f4771b.m4473d(i10 - 64);
        }

        /* renamed from: e */
        public void m4474e(int i10, boolean z10) {
            if (i10 >= 64) {
                m4472c();
                this.f4771b.m4474e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4770a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f4770a = ((j10 & (j11 ^ (-1))) << 1) | (j10 & j11);
            if (z10) {
                m4477h(i10);
            } else {
                m4470a(i10);
            }
            if (z11 || this.f4771b != null) {
                m4472c();
                this.f4771b.m4474e(0, z11);
            }
        }

        /* renamed from: f */
        public boolean m4475f(int i10) {
            if (i10 >= 64) {
                m4472c();
                return this.f4771b.m4475f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4770a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (j10 ^ (-1));
            this.f4770a = j12;
            long j13 = j10 - 1;
            this.f4770a = (j12 & j13) | Long.rotateRight((j13 ^ (-1)) & j12, 1);
            a aVar = this.f4771b;
            if (aVar != null) {
                if (aVar.m4473d(0)) {
                    m4477h(63);
                }
                this.f4771b.m4475f(0);
            }
            return z10;
        }

        /* renamed from: g */
        public void m4476g() {
            this.f4770a = 0L;
            a aVar = this.f4771b;
            if (aVar != null) {
                aVar.m4476g();
            }
        }

        /* renamed from: h */
        public void m4477h(int i10) {
            if (i10 < 64) {
                this.f4770a |= 1 << i10;
            } else {
                m4472c();
                this.f4771b.m4477h(i10 - 64);
            }
        }

        public String toString() {
            String str;
            if (this.f4771b == null) {
                str = Long.toBinaryString(this.f4770a);
            } else {
                str = this.f4771b.toString() + "xx" + Long.toBinaryString(this.f4770a);
            }
            return str;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/b$b.class
     */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/b$b.class */
    public interface b {
        /* renamed from: a */
        View mo4027a(int i10);

        void addView(View view, int i10);

        /* renamed from: b */
        void mo4028b(View view);

        /* renamed from: c */
        int mo4029c();

        /* renamed from: d */
        RecyclerView.AbstractC0674e0 mo4030d(View view);

        /* renamed from: e */
        void mo4031e(int i10);

        /* renamed from: f */
        void mo4032f();

        /* renamed from: g */
        int mo4033g(View view);

        /* renamed from: h */
        void mo4034h(View view);

        /* renamed from: i */
        void mo4035i(int i10);

        /* renamed from: j */
        void mo4036j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public C0703b(b bVar) {
        this.f4767a = bVar;
    }

    /* renamed from: a */
    public void m4450a(View view, int i10, boolean z10) {
        int mo4029c = i10 < 0 ? this.f4767a.mo4029c() : m4457h(i10);
        this.f4768b.m4474e(mo4029c, z10);
        if (z10) {
            m4461l(view);
        }
        this.f4767a.addView(view, mo4029c);
    }

    /* renamed from: b */
    public void m4451b(View view, boolean z10) {
        m4450a(view, -1, z10);
    }

    /* renamed from: c */
    public void m4452c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int mo4029c = i10 < 0 ? this.f4767a.mo4029c() : m4457h(i10);
        this.f4768b.m4474e(mo4029c, z10);
        if (z10) {
            m4461l(view);
        }
        this.f4767a.mo4036j(view, mo4029c, layoutParams);
    }

    /* renamed from: d */
    public void m4453d(int i10) {
        int m4457h = m4457h(i10);
        this.f4768b.m4475f(m4457h);
        this.f4767a.mo4031e(m4457h);
    }

    /* renamed from: e */
    public View m4454e(int i10) {
        int size = this.f4769c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4769c.get(i11);
            RecyclerView.AbstractC0674e0 mo4030d = this.f4767a.mo4030d(view);
            if (mo4030d.m4068r() == i10 && !mo4030d.m4075y() && !mo4030d.m4037A()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m4455f(int i10) {
        return this.f4767a.mo4027a(m4457h(i10));
    }

    /* renamed from: g */
    public int m4456g() {
        return this.f4767a.mo4029c() - this.f4769c.size();
    }

    /* renamed from: h */
    public final int m4457h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int mo4029c = this.f4767a.mo4029c();
        int i11 = i10;
        while (true) {
            int i12 = i11;
            if (i12 >= mo4029c) {
                return -1;
            }
            int m4471b = i10 - (i12 - this.f4768b.m4471b(i12));
            if (m4471b == 0) {
                while (this.f4768b.m4473d(i12)) {
                    i12++;
                }
                return i12;
            }
            i11 = i12 + m4471b;
        }
    }

    /* renamed from: i */
    public View m4458i(int i10) {
        return this.f4767a.mo4027a(i10);
    }

    /* renamed from: j */
    public int m4459j() {
        return this.f4767a.mo4029c();
    }

    /* renamed from: k */
    public void m4460k(View view) {
        int mo4033g = this.f4767a.mo4033g(view);
        if (mo4033g >= 0) {
            this.f4768b.m4477h(mo4033g);
            m4461l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: l */
    public final void m4461l(View view) {
        this.f4769c.add(view);
        this.f4767a.mo4028b(view);
    }

    /* renamed from: m */
    public int m4462m(View view) {
        int mo4033g = this.f4767a.mo4033g(view);
        if (mo4033g == -1 || this.f4768b.m4473d(mo4033g)) {
            return -1;
        }
        return mo4033g - this.f4768b.m4471b(mo4033g);
    }

    /* renamed from: n */
    public boolean m4463n(View view) {
        return this.f4769c.contains(view);
    }

    /* renamed from: o */
    public void m4464o() {
        this.f4768b.m4476g();
        for (int size = this.f4769c.size() - 1; size >= 0; size--) {
            this.f4767a.mo4034h(this.f4769c.get(size));
            this.f4769c.remove(size);
        }
        this.f4767a.mo4032f();
    }

    /* renamed from: p */
    public void m4465p(View view) {
        int mo4033g = this.f4767a.mo4033g(view);
        if (mo4033g < 0) {
            return;
        }
        if (this.f4768b.m4475f(mo4033g)) {
            m4469t(view);
        }
        this.f4767a.mo4035i(mo4033g);
    }

    /* renamed from: q */
    public void m4466q(int i10) {
        int m4457h = m4457h(i10);
        View mo4027a = this.f4767a.mo4027a(m4457h);
        if (mo4027a == null) {
            return;
        }
        if (this.f4768b.m4475f(m4457h)) {
            m4469t(mo4027a);
        }
        this.f4767a.mo4035i(m4457h);
    }

    /* renamed from: r */
    public boolean m4467r(View view) {
        int mo4033g = this.f4767a.mo4033g(view);
        if (mo4033g == -1) {
            m4469t(view);
            return true;
        }
        if (!this.f4768b.m4473d(mo4033g)) {
            return false;
        }
        this.f4768b.m4475f(mo4033g);
        m4469t(view);
        this.f4767a.mo4035i(mo4033g);
        return true;
    }

    /* renamed from: s */
    public void m4468s(View view) {
        int mo4033g = this.f4767a.mo4033g(view);
        if (mo4033g < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4768b.m4473d(mo4033g)) {
            this.f4768b.m4470a(mo4033g);
            m4469t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean m4469t(View view) {
        if (!this.f4769c.remove(view)) {
            return false;
        }
        this.f4767a.mo4034h(view);
        return true;
    }

    public String toString() {
        return this.f4768b.toString() + ", hidden list:" + this.f4769c.size();
    }
}
