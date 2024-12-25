package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p175k0.C5450k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/e.class
 */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/e.class */
public final class RunnableC0706e implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<RunnableC0706e> f4859f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<c> f4860g = new a();

    /* renamed from: c */
    public long f4862c;

    /* renamed from: d */
    public long f4863d;

    /* renamed from: b */
    public ArrayList<RecyclerView> f4861b = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<c> f4864e = new ArrayList<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/e$a.class
     */
    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/e$a.class */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4872d;
            if ((recyclerView == null) != (cVar2.f4872d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4869a;
            if (z10 != cVar2.f4869a) {
                int i10 = 1;
                if (z10) {
                    i10 = -1;
                }
                return i10;
            }
            int i11 = cVar2.f4870b - cVar.f4870b;
            if (i11 != 0) {
                return i11;
            }
            int i12 = cVar.f4871c - cVar2.f4871c;
            if (i12 != 0) {
                return i12;
            }
            return 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/e$b.class
     */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/e$b.class */
    public static class b implements RecyclerView.AbstractC0685p.c {

        /* renamed from: a */
        public int f4865a;

        /* renamed from: b */
        public int f4866b;

        /* renamed from: c */
        public int[] f4867c;

        /* renamed from: d */
        public int f4868d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p.c
        /* renamed from: a */
        public void mo4245a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f4868d * 2;
            int[] iArr = this.f4867c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4867c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f4867c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4867c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f4868d++;
        }

        /* renamed from: b */
        public void m4523b() {
            int[] iArr = this.f4867c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4868d = 0;
        }

        /* renamed from: c */
        public void m4524c(RecyclerView recyclerView, boolean z10) {
            this.f4868d = 0;
            int[] iArr = this.f4867c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0685p abstractC0685p = recyclerView.f4550n;
            if (recyclerView.f4548m == null || abstractC0685p == null || !abstractC0685p.m4181P0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f4533e.m4439p()) {
                    abstractC0685p.mo2750M(recyclerView.f4548m.mo3013n(), this);
                }
            } else if (!recyclerView.m3960q0()) {
                abstractC0685p.mo2746L(this.f4865a, this.f4866b, recyclerView.f4553o0, this);
            }
            int i10 = this.f4868d;
            if (i10 > abstractC0685p.f4667m) {
                abstractC0685p.f4667m = i10;
                abstractC0685p.f4668n = z10;
                recyclerView.f4531c.m4283K();
            }
        }

        /* renamed from: d */
        public boolean m4525d(int i10) {
            if (this.f4867c == null) {
                return false;
            }
            int i11 = this.f4868d;
            for (int i12 = 0; i12 < i11 * 2; i12 += 2) {
                if (this.f4867c[i12] == i10) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m4526e(int i10, int i11) {
            this.f4865a = i10;
            this.f4866b = i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/e$c.class
     */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/e$c.class */
    public static class c {

        /* renamed from: a */
        public boolean f4869a;

        /* renamed from: b */
        public int f4870b;

        /* renamed from: c */
        public int f4871c;

        /* renamed from: d */
        public RecyclerView f4872d;

        /* renamed from: e */
        public int f4873e;

        /* renamed from: a */
        public void m4527a() {
            this.f4869a = false;
            this.f4870b = 0;
            this.f4871c = 0;
            this.f4872d = null;
            this.f4873e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m4512e(RecyclerView recyclerView, int i10) {
        int m4459j = recyclerView.f4534f.m4459j();
        for (int i11 = 0; i11 < m4459j; i11++) {
            RecyclerView.AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(recyclerView.f4534f.m4458i(i11));
            if (m3862j0.f4622c == i10 && !m3862j0.m4075y()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m4513a(RecyclerView recyclerView) {
        this.f4861b.add(recyclerView);
    }

    /* renamed from: b */
    public final void m4514b() {
        int i10;
        int i11;
        c cVar;
        int size = this.f4861b.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = i13;
            if (i12 >= size) {
                break;
            }
            RecyclerView recyclerView = this.f4861b.get(i12);
            int i14 = i10;
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4551n0.m4524c(recyclerView, false);
                i14 = i10 + recyclerView.f4551n0.f4868d;
            }
            i12++;
            i13 = i14;
        }
        this.f4864e.ensureCapacity(i10);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = i16;
            if (i15 >= size) {
                Collections.sort(this.f4864e, f4860g);
                return;
            }
            RecyclerView recyclerView2 = this.f4861b.get(i15);
            if (recyclerView2.getWindowVisibility() != 0) {
                i11 = i17;
            } else {
                b bVar = recyclerView2.f4551n0;
                int abs = Math.abs(bVar.f4865a) + Math.abs(bVar.f4866b);
                int i18 = 0;
                while (true) {
                    i11 = i17;
                    if (i18 < bVar.f4868d * 2) {
                        if (i17 >= this.f4864e.size()) {
                            cVar = new c();
                            this.f4864e.add(cVar);
                        } else {
                            cVar = this.f4864e.get(i17);
                        }
                        int[] iArr = bVar.f4867c;
                        int i19 = iArr[i18 + 1];
                        cVar.f4869a = i19 <= abs;
                        cVar.f4870b = abs;
                        cVar.f4871c = i19;
                        cVar.f4872d = recyclerView2;
                        cVar.f4873e = iArr[i18];
                        i17++;
                        i18 += 2;
                    }
                }
            }
            i15++;
            i16 = i11;
        }
    }

    /* renamed from: c */
    public final void m4515c(c cVar, long j10) {
        RecyclerView.AbstractC0674e0 m4520i = m4520i(cVar.f4872d, cVar.f4873e, cVar.f4869a ? Long.MAX_VALUE : j10);
        if (m4520i == null || m4520i.f4621b == null || !m4520i.m4074x() || m4520i.m4075y()) {
            return;
        }
        m4519h(m4520i.f4621b.get(), j10);
    }

    /* renamed from: d */
    public final void m4516d(long j10) {
        for (int i10 = 0; i10 < this.f4864e.size(); i10++) {
            c cVar = this.f4864e.get(i10);
            if (cVar.f4872d == null) {
                return;
            }
            m4515c(cVar, j10);
            cVar.m4527a();
        }
    }

    /* renamed from: f */
    public void m4517f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4862c == 0) {
            this.f4862c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4551n0.m4526e(i10, i11);
    }

    /* renamed from: g */
    public void m4518g(long j10) {
        m4514b();
        m4516d(j10);
    }

    /* renamed from: h */
    public final void m4519h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4509F && recyclerView.f4534f.m4459j() != 0) {
            recyclerView.m3918Z0();
        }
        b bVar = recyclerView.f4551n0;
        bVar.m4524c(recyclerView, true);
        if (bVar.f4868d != 0) {
            try {
                C5450k.m27205a("RV Nested Prefetch");
                recyclerView.f4553o0.m4015i(recyclerView.f4548m);
                for (int i10 = 0; i10 < bVar.f4868d * 2; i10 += 2) {
                    m4520i(recyclerView, bVar.f4867c[i10], j10);
                }
            } finally {
                C5450k.m27206b();
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.AbstractC0674e0 m4520i(RecyclerView recyclerView, int i10, long j10) {
        if (m4512e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.C0692w c0692w = recyclerView.f4531c;
        try {
            recyclerView.m3891L0();
            RecyclerView.AbstractC0674e0 m4281I = c0692w.m4281I(i10, false, j10);
            if (m4281I != null) {
                if (!m4281I.m4074x() || m4281I.m4075y()) {
                    c0692w.m4286a(m4281I, false);
                } else {
                    c0692w.m4274B(m4281I.f4620a);
                }
            }
            return m4281I;
        } finally {
            recyclerView.m3895N0(false);
        }
    }

    /* renamed from: j */
    public void m4521j(RecyclerView recyclerView) {
        this.f4861b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        long j10;
        try {
            C5450k.m27205a("RV Prefetch");
            if (!this.f4861b.isEmpty()) {
                int size = this.f4861b.size();
                int i10 = 0;
                long j11 = 0;
                while (true) {
                    j10 = j11;
                    if (i10 >= size) {
                        break;
                    }
                    RecyclerView recyclerView = this.f4861b.get(i10);
                    long j12 = j10;
                    if (recyclerView.getWindowVisibility() == 0) {
                        j12 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                    i10++;
                    j11 = j12;
                }
                if (j10 != 0) {
                    m4518g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4863d);
                }
            }
        } finally {
            this.f4862c = 0L;
            C5450k.m27206b();
        }
    }
}
