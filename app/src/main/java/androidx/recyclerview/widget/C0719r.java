package androidx.recyclerview.widget;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/r.class
 */
/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/r.class */
public class C0719r {

    /* renamed from: a */
    public final b f4967a;

    /* renamed from: b */
    public a f4968b = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/r$a.class
     */
    /* renamed from: androidx.recyclerview.widget.r$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/r$a.class */
    public static class a {

        /* renamed from: a */
        public int f4969a = 0;

        /* renamed from: b */
        public int f4970b;

        /* renamed from: c */
        public int f4971c;

        /* renamed from: d */
        public int f4972d;

        /* renamed from: e */
        public int f4973e;

        /* renamed from: a */
        public void m4678a(int i10) {
            this.f4969a = i10 | this.f4969a;
        }

        /* renamed from: b */
        public boolean m4679b() {
            int i10 = this.f4969a;
            if ((i10 & 7) != 0 && (i10 & (m4680c(this.f4972d, this.f4970b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f4969a;
            if ((i11 & 112) != 0 && (i11 & (m4680c(this.f4972d, this.f4971c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4969a;
            if ((i12 & 1792) != 0 && (i12 & (m4680c(this.f4973e, this.f4970b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4969a;
            return (i13 & 28672) == 0 || (i13 & (m4680c(this.f4973e, this.f4971c) << 12)) != 0;
        }

        /* renamed from: c */
        public int m4680c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* renamed from: d */
        public void m4681d() {
            this.f4969a = 0;
        }

        /* renamed from: e */
        public void m4682e(int i10, int i11, int i12, int i13) {
            this.f4970b = i10;
            this.f4971c = i11;
            this.f4972d = i12;
            this.f4973e = i13;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/r$b.class
     */
    /* renamed from: androidx.recyclerview.widget.r$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/r$b.class */
    public interface b {
        /* renamed from: a */
        View mo4240a(int i10);

        /* renamed from: b */
        int mo4241b(View view);

        /* renamed from: c */
        int mo4242c();

        /* renamed from: d */
        int mo4243d();

        /* renamed from: e */
        int mo4244e(View view);
    }

    public C0719r(b bVar) {
        this.f4967a = bVar;
    }

    /* renamed from: a */
    public View m4676a(int i10, int i11, int i12, int i13) {
        int mo4242c = this.f4967a.mo4242c();
        int mo4243d = this.f4967a.mo4243d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (true) {
            View view2 = view;
            if (i10 == i11) {
                return view2;
            }
            View mo4240a = this.f4967a.mo4240a(i10);
            this.f4968b.m4682e(mo4242c, mo4243d, this.f4967a.mo4241b(mo4240a), this.f4967a.mo4244e(mo4240a));
            if (i12 != 0) {
                this.f4968b.m4681d();
                this.f4968b.m4678a(i12);
                if (this.f4968b.m4679b()) {
                    return mo4240a;
                }
            }
            View view3 = view2;
            if (i13 != 0) {
                this.f4968b.m4681d();
                this.f4968b.m4678a(i13);
                view3 = view2;
                if (this.f4968b.m4679b()) {
                    view3 = mo4240a;
                }
            }
            i10 += i14;
            view = view3;
        }
    }

    /* renamed from: b */
    public boolean m4677b(View view, int i10) {
        this.f4968b.m4682e(this.f4967a.mo4242c(), this.f4967a.mo4243d(), this.f4967a.mo4241b(view), this.f4967a.mo4244e(view));
        if (i10 == 0) {
            return false;
        }
        this.f4968b.m4681d();
        this.f4968b.m4678a(i10);
        return this.f4968b.m4679b();
    }
}
