package p277q1;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p087f0.C4738a;
import p277q1.C7746b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q1/a.class
 */
/* renamed from: q1.a */
/* loaded from: combined.jar:classes1.jar:q1/a.class */
public final class C7745a {

    /* renamed from: g */
    public static final Comparator<b> f37559g = new a();

    /* renamed from: a */
    public final int[] f37560a;

    /* renamed from: b */
    public final int[] f37561b;

    /* renamed from: c */
    public final List<C7746b.d> f37562c;

    /* renamed from: e */
    public final C7746b.c[] f37564e;

    /* renamed from: f */
    public final float[] f37565f = new float[3];

    /* renamed from: d */
    public final TimingLogger f37563d = null;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/a$a.class
     */
    /* renamed from: q1.a$a */
    /* loaded from: combined.jar:classes1.jar:q1/a$a.class */
    public static final class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.m33860g() - bVar.m33860g();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q1/a$b.class
     */
    /* renamed from: q1.a$b */
    /* loaded from: combined.jar:classes1.jar:q1/a$b.class */
    public class b {

        /* renamed from: a */
        public int f37566a;

        /* renamed from: b */
        public int f37567b;

        /* renamed from: c */
        public int f37568c;

        /* renamed from: d */
        public int f37569d;

        /* renamed from: e */
        public int f37570e;

        /* renamed from: f */
        public int f37571f;

        /* renamed from: g */
        public int f37572g;

        /* renamed from: h */
        public int f37573h;

        /* renamed from: i */
        public int f37574i;

        /* renamed from: j */
        public final C7745a f37575j;

        public b(C7745a c7745a, int i10, int i11) {
            this.f37575j = c7745a;
            this.f37566a = i10;
            this.f37567b = i11;
            m33856c();
        }

        /* renamed from: a */
        public final boolean m33854a() {
            boolean z10 = true;
            if (m33858e() <= 1) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: b */
        public final int m33855b() {
            int m33859f = m33859f();
            C7745a c7745a = this.f37575j;
            int[] iArr = c7745a.f37560a;
            int[] iArr2 = c7745a.f37561b;
            C7745a.m33840e(iArr, m33859f, this.f37566a, this.f37567b);
            Arrays.sort(iArr, this.f37566a, this.f37567b + 1);
            C7745a.m33840e(iArr, m33859f, this.f37566a, this.f37567b);
            int i10 = this.f37568c / 2;
            int i11 = this.f37566a;
            int i12 = 0;
            while (true) {
                int i13 = this.f37567b;
                if (i11 > i13) {
                    return this.f37566a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        /* renamed from: c */
        public final void m33856c() {
            C7745a c7745a = this.f37575j;
            int[] iArr = c7745a.f37560a;
            int[] iArr2 = c7745a.f37561b;
            int i10 = this.f37566a;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MIN_VALUE;
            int i17 = 0;
            while (true) {
                int i18 = i17;
                if (i10 > this.f37567b) {
                    this.f37569d = i11;
                    this.f37570e = i14;
                    this.f37571f = i12;
                    this.f37572g = i15;
                    this.f37573h = i13;
                    this.f37574i = i16;
                    this.f37568c = i18;
                    return;
                }
                int i19 = iArr[i10];
                int i20 = i18 + iArr2[i19];
                int m33845k = C7745a.m33845k(i19);
                int m33844j = C7745a.m33844j(i19);
                int m33843i = C7745a.m33843i(i19);
                int i21 = i14;
                if (m33845k > i14) {
                    i21 = m33845k;
                }
                int i22 = i11;
                if (m33845k < i11) {
                    i22 = m33845k;
                }
                int i23 = i15;
                if (m33844j > i15) {
                    i23 = m33844j;
                }
                int i24 = i12;
                if (m33844j < i12) {
                    i24 = m33844j;
                }
                int i25 = i16;
                if (m33843i > i16) {
                    i25 = m33843i;
                }
                int i26 = i13;
                if (m33843i < i13) {
                    i26 = m33843i;
                }
                i10++;
                i11 = i22;
                i12 = i24;
                i13 = i26;
                i14 = i21;
                i15 = i23;
                i16 = i25;
                i17 = i20;
            }
        }

        /* renamed from: d */
        public final C7746b.d m33857d() {
            C7745a c7745a = this.f37575j;
            int[] iArr = c7745a.f37560a;
            int[] iArr2 = c7745a.f37561b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = this.f37566a; i14 <= this.f37567b; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i15];
                i11 += i16;
                i10 += C7745a.m33845k(i15) * i16;
                i12 += C7745a.m33844j(i15) * i16;
                i13 += i16 * C7745a.m33843i(i15);
            }
            float f10 = i11;
            return new C7746b.d(C7745a.m33839b(Math.round(i10 / f10), Math.round(i12 / f10), Math.round(i13 / f10)), i11);
        }

        /* renamed from: e */
        public final int m33858e() {
            return (this.f37567b + 1) - this.f37566a;
        }

        /* renamed from: f */
        public final int m33859f() {
            int i10 = this.f37570e - this.f37569d;
            int i11 = this.f37572g - this.f37571f;
            int i12 = this.f37574i - this.f37573h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        /* renamed from: g */
        public final int m33860g() {
            return ((this.f37570e - this.f37569d) + 1) * ((this.f37572g - this.f37571f) + 1) * ((this.f37574i - this.f37573h) + 1);
        }

        /* renamed from: h */
        public final b m33861h() {
            if (!m33854a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int m33855b = m33855b();
            b bVar = new b(this.f37575j, m33855b + 1, this.f37567b);
            this.f37567b = m33855b;
            m33856c();
            return bVar;
        }
    }

    public C7745a(int[] iArr, int i10, C7746b.c[] cVarArr) {
        int i11;
        this.f37564e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f37561b = iArr2;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int m33842g = m33842g(iArr[i12]);
            iArr[i12] = m33842g;
            iArr2[m33842g] = iArr2[m33842g] + 1;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i11 = i14;
            if (i13 >= 32768) {
                break;
            }
            if (iArr2[i13] > 0 && m33849l(i13)) {
                iArr2[i13] = 0;
            }
            int i15 = i11;
            if (iArr2[i13] > 0) {
                i15 = i11 + 1;
            }
            i13++;
            i14 = i15;
        }
        int[] iArr3 = new int[i11];
        this.f37560a = iArr3;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i17;
            if (i16 >= 32768) {
                break;
            }
            int i19 = i18;
            if (iArr2[i16] > 0) {
                iArr3[i18] = i16;
                i19 = i18 + 1;
            }
            i16++;
            i17 = i19;
        }
        if (i11 > i10) {
            this.f37562c = m33848h(i10);
            return;
        }
        this.f37562c = new ArrayList();
        for (int i20 = 0; i20 < i11; i20++) {
            int i21 = iArr3[i20];
            this.f37562c.add(new C7746b.d(m33838a(i21), iArr2[i21]));
        }
    }

    /* renamed from: a */
    public static int m33838a(int i10) {
        return m33839b(m33845k(i10), m33844j(i10), m33843i(i10));
    }

    /* renamed from: b */
    public static int m33839b(int i10, int i11, int i12) {
        return Color.rgb(m33841f(i10, 5, 8), m33841f(i11, 5, 8), m33841f(i12, 5, 8));
    }

    /* renamed from: e */
    public static void m33840e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            for (int i13 = i11; i13 <= i12; i13++) {
                int i14 = iArr[i13];
                iArr[i13] = m33843i(i14) | (m33844j(i14) << 10) | (m33845k(i14) << 5);
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i15 = iArr[i11];
            iArr[i11] = m33845k(i15) | (m33843i(i15) << 10) | (m33844j(i15) << 5);
            i11++;
        }
    }

    /* renamed from: f */
    public static int m33841f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    /* renamed from: g */
    public static int m33842g(int i10) {
        return m33841f(Color.blue(i10), 8, 5) | (m33841f(Color.red(i10), 8, 5) << 10) | (m33841f(Color.green(i10), 8, 5) << 5);
    }

    /* renamed from: i */
    public static int m33843i(int i10) {
        return i10 & 31;
    }

    /* renamed from: j */
    public static int m33844j(int i10) {
        return (i10 >> 5) & 31;
    }

    /* renamed from: k */
    public static int m33845k(int i10) {
        return (i10 >> 10) & 31;
    }

    /* renamed from: c */
    public final List<C7746b.d> m33846c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            C7746b.d m33857d = it.next().m33857d();
            if (!m33851n(m33857d)) {
                arrayList.add(m33857d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C7746b.d> m33847d() {
        return this.f37562c;
    }

    /* renamed from: h */
    public final List<C7746b.d> m33848h(int i10) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i10, f37559g);
        priorityQueue.offer(new b(this, 0, this.f37560a.length - 1));
        m33852o(priorityQueue, i10);
        return m33846c(priorityQueue);
    }

    /* renamed from: l */
    public final boolean m33849l(int i10) {
        int m33838a = m33838a(i10);
        C4738a.m23967f(m33838a, this.f37565f);
        return m33850m(m33838a, this.f37565f);
    }

    /* renamed from: m */
    public final boolean m33850m(int i10, float[] fArr) {
        C7746b.c[] cVarArr = this.f37564e;
        if (cVarArr == null || cVarArr.length <= 0) {
            return false;
        }
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f37564e[i11].mo33869a(i10, fArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m33851n(C7746b.d dVar) {
        return m33850m(dVar.m33881e(), dVar.m33879c());
    }

    /* renamed from: o */
    public final void m33852o(PriorityQueue<b> priorityQueue, int i10) {
        b poll;
        while (priorityQueue.size() < i10 && (poll = priorityQueue.poll()) != null && poll.m33854a()) {
            priorityQueue.offer(poll.m33861h());
            priorityQueue.offer(poll);
        }
    }
}
