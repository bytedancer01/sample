package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager.class */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0685p implements RecyclerView.AbstractC0666a0.b {

    /* renamed from: B */
    public BitSet f4700B;

    /* renamed from: G */
    public boolean f4705G;

    /* renamed from: H */
    public boolean f4706H;

    /* renamed from: I */
    public C0700e f4707I;

    /* renamed from: J */
    public int f4708J;

    /* renamed from: O */
    public int[] f4713O;

    /* renamed from: t */
    public C0701f[] f4716t;

    /* renamed from: u */
    public AbstractC0713l f4717u;

    /* renamed from: v */
    public AbstractC0713l f4718v;

    /* renamed from: w */
    public int f4719w;

    /* renamed from: x */
    public int f4720x;

    /* renamed from: y */
    public final C0710i f4721y;

    /* renamed from: s */
    public int f4715s = -1;

    /* renamed from: z */
    public boolean f4722z = false;

    /* renamed from: A */
    public boolean f4699A = false;

    /* renamed from: C */
    public int f4701C = -1;

    /* renamed from: D */
    public int f4702D = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

    /* renamed from: E */
    public C0699d f4703E = new C0699d();

    /* renamed from: F */
    public int f4704F = 2;

    /* renamed from: K */
    public final Rect f4709K = new Rect();

    /* renamed from: L */
    public final C0697b f4710L = new C0697b(this);

    /* renamed from: M */
    public boolean f4711M = false;

    /* renamed from: N */
    public boolean f4712N = true;

    /* renamed from: P */
    public final Runnable f4714P = new RunnableC0696a(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$a.class
     */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$a.class */
    public class RunnableC0696a implements Runnable {

        /* renamed from: b */
        public final StaggeredGridLayoutManager f4723b;

        public RunnableC0696a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f4723b = staggeredGridLayoutManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4723b.m4365q2();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$b.class
     */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$b.class */
    public class C0697b {

        /* renamed from: a */
        public int f4724a;

        /* renamed from: b */
        public int f4725b;

        /* renamed from: c */
        public boolean f4726c;

        /* renamed from: d */
        public boolean f4727d;

        /* renamed from: e */
        public boolean f4728e;

        /* renamed from: f */
        public int[] f4729f;

        /* renamed from: g */
        public final StaggeredGridLayoutManager f4730g;

        public C0697b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f4730g = staggeredGridLayoutManager;
            m4377c();
        }

        /* renamed from: a */
        public void m4375a() {
            this.f4725b = this.f4726c ? this.f4730g.f4717u.mo4619i() : this.f4730g.f4717u.mo4623m();
        }

        /* renamed from: b */
        public void m4376b(int i10) {
            this.f4725b = this.f4726c ? this.f4730g.f4717u.mo4619i() - i10 : this.f4730g.f4717u.mo4623m() + i10;
        }

        /* renamed from: c */
        public void m4377c() {
            this.f4724a = -1;
            this.f4725b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f4726c = false;
            this.f4727d = false;
            this.f4728e = false;
            int[] iArr = this.f4729f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m4378d(C0701f[] c0701fArr) {
            int length = c0701fArr.length;
            int[] iArr = this.f4729f;
            if (iArr == null || iArr.length < length) {
                this.f4729f = new int[this.f4730g.f4716t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f4729f[i10] = c0701fArr[i10].m4417p(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$c.class
     */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$c.class */
    public static class C0698c extends RecyclerView.C0686q {

        /* renamed from: f */
        public C0701f f4731f;

        /* renamed from: g */
        public boolean f4732g;

        public C0698c(int i10, int i11) {
            super(i10, i11);
        }

        public C0698c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0698c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0698c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: n */
        public boolean m4379n() {
            return this.f4732g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d.class
     */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d.class */
    public static class C0699d {

        /* renamed from: a */
        public int[] f4733a;

        /* renamed from: b */
        public List<a> f4734b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a.class
         */
        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a.class */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C10250a();

            /* renamed from: b */
            public int f4735b;

            /* renamed from: c */
            public int f4736c;

            /* renamed from: d */
            public int[] f4737d;

            /* renamed from: e */
            public boolean f4738e;

            /* JADX WARN: Classes with same name are omitted:
              classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a$a.class
             */
            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$d$a$a.class */
            public class C10250a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f4735b = parcel.readInt();
                this.f4736c = parcel.readInt();
                this.f4738e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4737d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: b */
            public int m4395b(int i10) {
                int[] iArr = this.f4737d;
                return iArr == null ? 0 : iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4735b + ", mGapDir=" + this.f4736c + ", mHasUnwantedGapAfter=" + this.f4738e + ", mGapPerSpan=" + Arrays.toString(this.f4737d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4735b);
                parcel.writeInt(this.f4736c);
                parcel.writeInt(this.f4738e ? 1 : 0);
                int[] iArr = this.f4737d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4737d);
                }
            }
        }

        /* renamed from: a */
        public void m4380a(a aVar) {
            if (this.f4734b == null) {
                this.f4734b = new ArrayList();
            }
            int size = this.f4734b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f4734b.get(i10);
                if (aVar2.f4735b == aVar.f4735b) {
                    this.f4734b.remove(i10);
                }
                if (aVar2.f4735b >= aVar.f4735b) {
                    this.f4734b.add(i10, aVar);
                    return;
                }
            }
            this.f4734b.add(aVar);
        }

        /* renamed from: b */
        public void m4381b() {
            int[] iArr = this.f4733a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4734b = null;
        }

        /* renamed from: c */
        public void m4382c(int i10) {
            int[] iArr = this.f4733a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4733a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[m4394o(i10)];
                this.f4733a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4733a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m4383d(int i10) {
            List<a> list = this.f4734b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4734b.get(size).f4735b >= i10) {
                        this.f4734b.remove(size);
                    }
                }
            }
            return m4387h(i10);
        }

        /* renamed from: e */
        public a m4384e(int i10, int i11, int i12, boolean z10) {
            a aVar;
            int i13;
            List<a> list = this.f4734b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size && (i13 = (aVar = this.f4734b.get(i14)).f4735b) < i11; i14++) {
                if (i13 >= i10 && (i12 == 0 || aVar.f4736c == i12 || (z10 && aVar.f4738e))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public a m4385f(int i10) {
            List<a> list = this.f4734b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4734b.get(size);
                if (aVar.f4735b == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m4386g(int i10) {
            int[] iArr = this.f4733a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        /* renamed from: h */
        public int m4387h(int i10) {
            int[] iArr = this.f4733a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int m4388i = m4388i(i10);
            if (m4388i == -1) {
                int[] iArr2 = this.f4733a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4733a.length;
            }
            int min = Math.min(m4388i + 1, this.f4733a.length);
            Arrays.fill(this.f4733a, i10, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int m4388i(int i10) {
            if (this.f4734b == null) {
                return -1;
            }
            a m4385f = m4385f(i10);
            if (m4385f != null) {
                this.f4734b.remove(m4385f);
            }
            int size = this.f4734b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f4734b.get(i11).f4735b >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.f4734b.get(i11);
            this.f4734b.remove(i11);
            return aVar.f4735b;
        }

        /* renamed from: j */
        public void m4389j(int i10, int i11) {
            int[] iArr = this.f4733a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m4382c(i12);
            int[] iArr2 = this.f4733a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f4733a, i10, i12, -1);
            m4391l(i10, i11);
        }

        /* renamed from: k */
        public void m4390k(int i10, int i11) {
            int[] iArr = this.f4733a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            m4382c(i12);
            int[] iArr2 = this.f4733a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f4733a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m4392m(i10, i11);
        }

        /* renamed from: l */
        public final void m4391l(int i10, int i11) {
            List<a> list = this.f4734b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4734b.get(size);
                int i12 = aVar.f4735b;
                if (i12 >= i10) {
                    aVar.f4735b = i12 + i11;
                }
            }
        }

        /* renamed from: m */
        public final void m4392m(int i10, int i11) {
            List<a> list = this.f4734b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4734b.get(size);
                int i12 = aVar.f4735b;
                if (i12 >= i10) {
                    if (i12 < i10 + i11) {
                        this.f4734b.remove(size);
                    } else {
                        aVar.f4735b = i12 - i11;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m4393n(int i10, C0701f c0701f) {
            m4382c(i10);
            this.f4733a[i10] = c0701f.f4753e;
        }

        /* renamed from: o */
        public int m4394o(int i10) {
            int length = this.f4733a.length;
            while (true) {
                int i11 = length;
                if (i11 > i10) {
                    return i11;
                }
                length = i11 * 2;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$e.class
     */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$e.class */
    public static class C0700e implements Parcelable {
        public static final Parcelable.Creator<C0700e> CREATOR = new a();

        /* renamed from: b */
        public int f4739b;

        /* renamed from: c */
        public int f4740c;

        /* renamed from: d */
        public int f4741d;

        /* renamed from: e */
        public int[] f4742e;

        /* renamed from: f */
        public int f4743f;

        /* renamed from: g */
        public int[] f4744g;

        /* renamed from: h */
        public List<C0699d.a> f4745h;

        /* renamed from: i */
        public boolean f4746i;

        /* renamed from: j */
        public boolean f4747j;

        /* renamed from: k */
        public boolean f4748k;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$e$a.class
         */
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$e$a.class */
        public class a implements Parcelable.Creator<C0700e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0700e createFromParcel(Parcel parcel) {
                return new C0700e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0700e[] newArray(int i10) {
                return new C0700e[i10];
            }
        }

        public C0700e() {
        }

        public C0700e(Parcel parcel) {
            this.f4739b = parcel.readInt();
            this.f4740c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4741d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4742e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4743f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4744g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4746i = parcel.readInt() == 1;
            this.f4747j = parcel.readInt() == 1;
            this.f4748k = parcel.readInt() == 1;
            this.f4745h = parcel.readArrayList(C0699d.a.class.getClassLoader());
        }

        public C0700e(C0700e c0700e) {
            this.f4741d = c0700e.f4741d;
            this.f4739b = c0700e.f4739b;
            this.f4740c = c0700e.f4740c;
            this.f4742e = c0700e.f4742e;
            this.f4743f = c0700e.f4743f;
            this.f4744g = c0700e.f4744g;
            this.f4746i = c0700e.f4746i;
            this.f4747j = c0700e.f4747j;
            this.f4748k = c0700e.f4748k;
            this.f4745h = c0700e.f4745h;
        }

        /* renamed from: b */
        public void m4398b() {
            this.f4742e = null;
            this.f4741d = 0;
            this.f4739b = -1;
            this.f4740c = -1;
        }

        /* renamed from: c */
        public void m4399c() {
            this.f4742e = null;
            this.f4741d = 0;
            this.f4743f = 0;
            this.f4744g = null;
            this.f4745h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4739b);
            parcel.writeInt(this.f4740c);
            parcel.writeInt(this.f4741d);
            if (this.f4741d > 0) {
                parcel.writeIntArray(this.f4742e);
            }
            parcel.writeInt(this.f4743f);
            if (this.f4743f > 0) {
                parcel.writeIntArray(this.f4744g);
            }
            parcel.writeInt(this.f4746i ? 1 : 0);
            parcel.writeInt(this.f4747j ? 1 : 0);
            parcel.writeInt(this.f4748k ? 1 : 0);
            parcel.writeList(this.f4745h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$f.class
     */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$f.class */
    public class C0701f {

        /* renamed from: a */
        public ArrayList<View> f4749a = new ArrayList<>();

        /* renamed from: b */
        public int f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

        /* renamed from: c */
        public int f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;

        /* renamed from: d */
        public int f4752d = 0;

        /* renamed from: e */
        public final int f4753e;

        /* renamed from: f */
        public final StaggeredGridLayoutManager f4754f;

        public C0701f(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
            this.f4754f = staggeredGridLayoutManager;
            this.f4753e = i10;
        }

        /* renamed from: a */
        public void m4402a(View view) {
            C0698c m4415n = m4415n(view);
            m4415n.f4731f = this;
            this.f4749a.add(view);
            this.f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            if (this.f4749a.size() == 1) {
                this.f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            }
            if (m4415n.m4249k() || m4415n.m4248j()) {
                this.f4752d += this.f4754f.f4717u.mo4615e(view);
            }
        }

        /* renamed from: b */
        public void m4403b(boolean z10, int i10) {
            int m4413l = z10 ? m4413l(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) : m4417p(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
            m4406e();
            if (m4413l == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || m4413l >= this.f4754f.f4717u.mo4619i()) {
                if (z10 || m4413l <= this.f4754f.f4717u.mo4623m()) {
                    int i11 = m4413l;
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = m4413l + i10;
                    }
                    this.f4751c = i11;
                    this.f4750b = i11;
                }
            }
        }

        /* renamed from: c */
        public void m4404c() {
            C0699d.a m4385f;
            ArrayList<View> arrayList = this.f4749a;
            View view = arrayList.get(arrayList.size() - 1);
            C0698c m4415n = m4415n(view);
            this.f4751c = this.f4754f.f4717u.mo4614d(view);
            if (m4415n.f4732g && (m4385f = this.f4754f.f4703E.m4385f(m4415n.m4247c())) != null && m4385f.f4736c == 1) {
                this.f4751c += m4385f.m4395b(this.f4753e);
            }
        }

        /* renamed from: d */
        public void m4405d() {
            C0699d.a m4385f;
            View view = this.f4749a.get(0);
            C0698c m4415n = m4415n(view);
            this.f4750b = this.f4754f.f4717u.mo4617g(view);
            if (m4415n.f4732g && (m4385f = this.f4754f.f4703E.m4385f(m4415n.m4247c())) != null && m4385f.f4736c == -1) {
                this.f4750b -= m4385f.m4395b(this.f4753e);
            }
        }

        /* renamed from: e */
        public void m4406e() {
            this.f4749a.clear();
            m4418q();
            this.f4752d = 0;
        }

        /* renamed from: f */
        public int m4407f() {
            int i10;
            int size;
            if (this.f4754f.f4722z) {
                i10 = this.f4749a.size() - 1;
                size = -1;
            } else {
                i10 = 0;
                size = this.f4749a.size();
            }
            return m4410i(i10, size, true);
        }

        /* renamed from: g */
        public int m4408g() {
            int size;
            int i10;
            if (this.f4754f.f4722z) {
                size = 0;
                i10 = this.f4749a.size();
            } else {
                size = this.f4749a.size() - 1;
                i10 = -1;
            }
            return m4410i(size, i10, true);
        }

        /* renamed from: h */
        public int m4409h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int mo4623m = this.f4754f.f4717u.mo4623m();
            int mo4619i = this.f4754f.f4717u.mo4619i();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f4749a.get(i10);
                int mo4617g = this.f4754f.f4717u.mo4617g(view);
                int mo4614d = this.f4754f.f4717u.mo4614d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? mo4617g >= mo4619i : mo4617g > mo4619i;
                if (!z12 ? mo4614d > mo4623m : mo4614d >= mo4623m) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (!z11 && mo4617g >= mo4623m && mo4614d <= mo4619i) {
                        }
                        return this.f4754f.m4155B0(view);
                    }
                    if (mo4617g >= mo4623m && mo4614d <= mo4619i) {
                        return this.f4754f.m4155B0(view);
                    }
                }
                i10 += i12;
            }
            return -1;
        }

        /* renamed from: i */
        public int m4410i(int i10, int i11, boolean z10) {
            return m4409h(i10, i11, false, false, z10);
        }

        /* renamed from: j */
        public int m4411j() {
            return this.f4752d;
        }

        /* renamed from: k */
        public int m4412k() {
            int i10 = this.f4751c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m4404c();
            return this.f4751c;
        }

        /* renamed from: l */
        public int m4413l(int i10) {
            int i11 = this.f4751c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4749a.size() == 0) {
                return i10;
            }
            m4404c();
            return this.f4751c;
        }

        /* renamed from: m */
        public View m4414m(int i10, int i11) {
            View view;
            View view2 = null;
            if (i11 != -1) {
                int size = this.f4749a.size() - 1;
                View view3 = null;
                while (true) {
                    View view4 = view3;
                    view = view4;
                    if (size < 0) {
                        break;
                    }
                    View view5 = this.f4749a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4754f;
                    if (staggeredGridLayoutManager.f4722z) {
                        view = view4;
                        if (staggeredGridLayoutManager.m4155B0(view5) >= i10) {
                            break;
                        }
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f4754f;
                    if (!staggeredGridLayoutManager2.f4722z && staggeredGridLayoutManager2.m4155B0(view5) <= i10) {
                        view = view4;
                        break;
                    }
                    view = view4;
                    if (!view5.hasFocusable()) {
                        break;
                    }
                    size--;
                    view3 = view5;
                }
            } else {
                int size2 = this.f4749a.size();
                int i12 = 0;
                while (true) {
                    view = view2;
                    if (i12 >= size2) {
                        break;
                    }
                    View view6 = this.f4749a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.f4754f;
                    if (staggeredGridLayoutManager3.f4722z) {
                        view = view2;
                        if (staggeredGridLayoutManager3.m4155B0(view6) <= i10) {
                            break;
                        }
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.f4754f;
                    if (!staggeredGridLayoutManager4.f4722z && staggeredGridLayoutManager4.m4155B0(view6) >= i10) {
                        view = view2;
                        break;
                    }
                    view = view2;
                    if (!view6.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view2 = view6;
                }
            }
            return view;
        }

        /* renamed from: n */
        public C0698c m4415n(View view) {
            return (C0698c) view.getLayoutParams();
        }

        /* renamed from: o */
        public int m4416o() {
            int i10 = this.f4750b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            m4405d();
            return this.f4750b;
        }

        /* renamed from: p */
        public int m4417p(int i10) {
            int i11 = this.f4750b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4749a.size() == 0) {
                return i10;
            }
            m4405d();
            return this.f4750b;
        }

        /* renamed from: q */
        public void m4418q() {
            this.f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }

        /* renamed from: r */
        public void m4419r(int i10) {
            int i11 = this.f4750b;
            if (i11 != Integer.MIN_VALUE) {
                this.f4750b = i11 + i10;
            }
            int i12 = this.f4751c;
            if (i12 != Integer.MIN_VALUE) {
                this.f4751c = i12 + i10;
            }
        }

        /* renamed from: s */
        public void m4420s() {
            int size = this.f4749a.size();
            View remove = this.f4749a.remove(size - 1);
            C0698c m4415n = m4415n(remove);
            m4415n.f4731f = null;
            if (m4415n.m4249k() || m4415n.m4248j()) {
                this.f4752d -= this.f4754f.f4717u.mo4615e(remove);
            }
            if (size == 1) {
                this.f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            }
            this.f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }

        /* renamed from: t */
        public void m4421t() {
            View remove = this.f4749a.remove(0);
            C0698c m4415n = m4415n(remove);
            m4415n.f4731f = null;
            if (this.f4749a.size() == 0) {
                this.f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            }
            if (m4415n.m4249k() || m4415n.m4248j()) {
                this.f4752d -= this.f4754f.f4717u.mo4615e(remove);
            }
            this.f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }

        /* renamed from: u */
        public void m4422u(View view) {
            C0698c m4415n = m4415n(view);
            m4415n.f4731f = this;
            this.f4749a.add(0, view);
            this.f4750b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            if (this.f4749a.size() == 1) {
                this.f4751c = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            }
            if (m4415n.m4249k() || m4415n.m4248j()) {
                this.f4752d += this.f4754f.f4717u.mo4615e(view);
            }
        }

        /* renamed from: v */
        public void m4423v(int i10) {
            this.f4750b = i10;
            this.f4751c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.AbstractC0685p.d m4147C0 = RecyclerView.AbstractC0685p.m4147C0(context, attributeSet, i10, i11);
        m4348f3(m4147C0.f4675a);
        m4350h3(m4147C0.f4676b);
        m4349g3(m4147C0.f4677c);
        this.f4721y = new C0710i();
        m4373y2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: A1 */
    public void mo4153A1(int i10) {
        if (i10 == 0) {
            m4365q2();
        }
    }

    /* renamed from: A2 */
    public final int m4317A2(int i10) {
        int m4217h0 = m4217h0();
        for (int i11 = 0; i11 < m4217h0; i11++) {
            int m4155B0 = m4155B0(m4216g0(i11));
            if (m4155B0 >= 0 && m4155B0 < i10) {
                return m4155B0;
            }
        }
        return 0;
    }

    /* renamed from: B2 */
    public View m4318B2(boolean z10) {
        View m4216g0;
        int mo4623m = this.f4717u.mo4623m();
        int mo4619i = this.f4717u.mo4619i();
        int m4217h0 = m4217h0() - 1;
        View view = null;
        while (true) {
            View view2 = view;
            if (m4217h0 < 0) {
                return view2;
            }
            m4216g0 = m4216g0(m4217h0);
            int mo4617g = this.f4717u.mo4617g(m4216g0);
            int mo4614d = this.f4717u.mo4614d(m4216g0);
            View view3 = view2;
            if (mo4614d > mo4623m) {
                if (mo4617g >= mo4619i) {
                    view3 = view2;
                } else {
                    if (mo4614d <= mo4619i || !z10) {
                        break;
                    }
                    view3 = view2;
                    if (view2 == null) {
                        view3 = m4216g0;
                    }
                }
            }
            m4217h0--;
            view = view3;
        }
        return m4216g0;
    }

    /* renamed from: C2 */
    public View m4319C2(boolean z10) {
        int mo4623m = this.f4717u.mo4623m();
        int mo4619i = this.f4717u.mo4619i();
        int m4217h0 = m4217h0();
        View view = null;
        int i10 = 0;
        while (i10 < m4217h0) {
            View m4216g0 = m4216g0(i10);
            int mo4617g = this.f4717u.mo4617g(m4216g0);
            View view2 = view;
            if (this.f4717u.mo4614d(m4216g0) > mo4623m) {
                if (mo4617g >= mo4619i) {
                    view2 = view;
                } else {
                    if (mo4617g >= mo4623m || !z10) {
                        return m4216g0;
                    }
                    view2 = view;
                    if (view == null) {
                        view2 = m4216g0;
                    }
                }
            }
            i10++;
            view = view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: D */
    public void mo3789D(String str) {
        if (this.f4707I == null) {
            super.mo3789D(str);
        }
    }

    /* renamed from: D2 */
    public int m4320D2() {
        View m4318B2 = this.f4699A ? m4318B2(true) : m4319C2(true);
        return m4318B2 == null ? -1 : m4155B0(m4318B2);
    }

    /* renamed from: E2 */
    public final int m4321E2(int i10) {
        for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
            int m4155B0 = m4155B0(m4216g0(m4217h0));
            if (m4155B0 >= 0 && m4155B0 < i10) {
                return m4155B0;
            }
        }
        return 0;
    }

    /* renamed from: F2 */
    public final void m4322F2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10) {
        int mo4619i;
        int m4326J2 = m4326J2(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        if (m4326J2 != Integer.MIN_VALUE && (mo4619i = this.f4717u.mo4619i() - m4326J2) > 0) {
            int i10 = mo4619i - (-m4346d3(-mo4619i, c0692w, c0668b0));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f4717u.mo4628r(i10);
        }
    }

    /* renamed from: G2 */
    public final void m4323G2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10) {
        int mo4623m;
        int m4329M2 = m4329M2(Integer.MAX_VALUE);
        if (m4329M2 != Integer.MAX_VALUE && (mo4623m = m4329M2 - this.f4717u.mo4623m()) > 0) {
            int m4346d3 = mo4623m - m4346d3(mo4623m, c0692w, c0668b0);
            if (!z10 || m4346d3 <= 0) {
                return;
            }
            this.f4717u.mo4628r(-m4346d3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: H */
    public boolean mo2731H() {
        return this.f4719w == 0;
    }

    /* renamed from: H2 */
    public int m4324H2() {
        int i10 = 0;
        if (m4217h0() != 0) {
            i10 = m4155B0(m4216g0(0));
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: I */
    public boolean mo2736I() {
        boolean z10 = true;
        if (this.f4719w != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: I2 */
    public int m4325I2() {
        int m4217h0 = m4217h0();
        return m4217h0 == 0 ? 0 : m4155B0(m4216g0(m4217h0 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: J */
    public boolean mo3747J(RecyclerView.C0686q c0686q) {
        return c0686q instanceof C0698c;
    }

    /* renamed from: J2 */
    public final int m4326J2(int i10) {
        int m4413l = this.f4716t[0].m4413l(i10);
        int i11 = 1;
        while (i11 < this.f4715s) {
            int m4413l2 = this.f4716t[i11].m4413l(i10);
            int i12 = m4413l;
            if (m4413l2 > m4413l) {
                i12 = m4413l2;
            }
            i11++;
            m4413l = i12;
        }
        return m4413l;
    }

    /* renamed from: K2 */
    public final int m4327K2(int i10) {
        int m4417p = this.f4716t[0].m4417p(i10);
        int i11 = 1;
        while (i11 < this.f4715s) {
            int m4417p2 = this.f4716t[i11].m4417p(i10);
            int i12 = m4417p;
            if (m4417p2 > m4417p) {
                i12 = m4417p2;
            }
            i11++;
            m4417p = i12;
        }
        return m4417p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: L */
    public void mo2746L(int i10, int i11, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0685p.c cVar) {
        int i12;
        int m4413l;
        int i13;
        if (this.f4719w != 0) {
            i10 = i11;
        }
        if (m4217h0() == 0 || i10 == 0) {
            return;
        }
        m4339W2(i10, c0668b0);
        int[] iArr = this.f4713O;
        if (iArr == null || iArr.length < this.f4715s) {
            this.f4713O = new int[this.f4715s];
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = i15;
            if (i14 >= this.f4715s) {
                break;
            }
            C0710i c0710i = this.f4721y;
            if (c0710i.f4936d == -1) {
                m4413l = c0710i.f4938f;
                i13 = this.f4716t[i14].m4417p(m4413l);
            } else {
                m4413l = this.f4716t[i14].m4413l(c0710i.f4939g);
                i13 = this.f4721y.f4939g;
            }
            int i16 = m4413l - i13;
            int i17 = i12;
            if (i16 >= 0) {
                this.f4713O[i12] = i16;
                i17 = i12 + 1;
            }
            i14++;
            i15 = i17;
        }
        Arrays.sort(this.f4713O, 0, i12);
        for (int i18 = 0; i18 < i12 && this.f4721y.m4594a(c0668b0); i18++) {
            cVar.mo4245a(this.f4721y.f4935c, this.f4713O[i18]);
            C0710i c0710i2 = this.f4721y;
            c0710i2.f4935c += c0710i2.f4936d;
        }
    }

    /* renamed from: L2 */
    public final int m4328L2(int i10) {
        int m4413l = this.f4716t[0].m4413l(i10);
        int i11 = 1;
        while (i11 < this.f4715s) {
            int m4413l2 = this.f4716t[i11].m4413l(i10);
            int i12 = m4413l;
            if (m4413l2 < m4413l) {
                i12 = m4413l2;
            }
            i11++;
            m4413l = i12;
        }
        return m4413l;
    }

    /* renamed from: M2 */
    public final int m4329M2(int i10) {
        int m4417p = this.f4716t[0].m4417p(i10);
        int i11 = 1;
        while (i11 < this.f4715s) {
            int m4417p2 = this.f4716t[i11].m4417p(i10);
            int i12 = m4417p;
            if (m4417p2 < m4417p) {
                i12 = m4417p2;
            }
            i11++;
            m4417p = i12;
        }
        return m4417p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: N */
    public int mo3798N(RecyclerView.C0668b0 c0668b0) {
        return m4367s2(c0668b0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: N0 */
    public boolean mo3799N0() {
        return this.f4704F != 0;
    }

    /* renamed from: N2 */
    public final C0701f m4330N2(C0710i c0710i) {
        int i10;
        int i11;
        int i12 = -1;
        if (m4338V2(c0710i.f4937e)) {
            i10 = this.f4715s - 1;
            i11 = -1;
        } else {
            i10 = 0;
            i12 = this.f4715s;
            i11 = 1;
        }
        int i13 = c0710i.f4937e;
        C0701f c0701f = null;
        if (i13 != 1) {
            int i14 = Integer.MIN_VALUE;
            int mo4619i = this.f4717u.mo4619i();
            while (i10 != i12) {
                C0701f c0701f2 = this.f4716t[i10];
                int m4417p = c0701f2.m4417p(mo4619i);
                int i15 = i14;
                if (m4417p > i14) {
                    c0701f = c0701f2;
                    i15 = m4417p;
                }
                i10 += i11;
                i14 = i15;
            }
            return c0701f;
        }
        int i16 = Integer.MAX_VALUE;
        int mo4623m = this.f4717u.mo4623m();
        C0701f c0701f3 = null;
        int i17 = i10;
        while (i17 != i12) {
            C0701f c0701f4 = this.f4716t[i17];
            int m4413l = c0701f4.m4413l(mo4623m);
            int i18 = i16;
            if (m4413l < i16) {
                c0701f3 = c0701f4;
                i18 = m4413l;
            }
            i17 += i11;
            i16 = i18;
        }
        return c0701f3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: O */
    public int mo3749O(RecyclerView.C0668b0 c0668b0) {
        return m4368t2(c0668b0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* renamed from: O2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4331O2(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.f4699A
            if (r0 == 0) goto L10
            r0 = r4
            int r0 = r0.m4325I2()
            r9 = r0
            goto L16
        L10:
            r0 = r4
            int r0 = r0.m4324H2()
            r9 = r0
        L16:
            r0 = r7
            r1 = 8
            if (r0 != r1) goto L34
            r0 = r5
            r1 = r6
            if (r0 >= r1) goto L29
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            goto L39
        L29:
            r0 = r5
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r10 = r0
            goto L3c
        L34:
            r0 = r5
            r1 = r6
            int r0 = r0 + r1
            r8 = r0
        L39:
            r0 = r5
            r10 = r0
        L3c:
            r0 = r4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f4703E
            r1 = r10
            int r0 = r0.m4387h(r1)
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L7a
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L6e
            r0 = r7
            r1 = 8
            if (r0 == r1) goto L59
            goto L83
        L59:
            r0 = r4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f4703E
            r1 = r5
            r2 = 1
            r0.m4390k(r1, r2)
            r0 = r4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f4703E
            r1 = r6
            r2 = 1
            r0.m4389j(r1, r2)
            goto L83
        L6e:
            r0 = r4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f4703E
            r1 = r5
            r2 = r6
            r0.m4390k(r1, r2)
            goto L83
        L7a:
            r0 = r4
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.f4703E
            r1 = r5
            r2 = r6
            r0.m4389j(r1, r2)
        L83:
            r0 = r8
            r1 = r9
            if (r0 > r1) goto L8b
            return
        L8b:
            r0 = r4
            boolean r0 = r0.f4699A
            if (r0 == 0) goto L9a
            r0 = r4
            int r0 = r0.m4324H2()
            r5 = r0
            goto L9f
        L9a:
            r0 = r4
            int r0 = r0.m4325I2()
            r5 = r0
        L9f:
            r0 = r10
            r1 = r5
            if (r0 > r1) goto La9
            r0 = r4
            r0.m4184Q1()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4331O2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: P */
    public int mo3751P(RecyclerView.C0668b0 c0668b0) {
        return m4369u2(c0668b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r0 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
    
        if (r0 == r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* renamed from: P2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m4332P2() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4332P2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: Q */
    public int mo3802Q(RecyclerView.C0668b0 c0668b0) {
        return m4367s2(c0668b0);
    }

    /* renamed from: Q2 */
    public void m4333Q2() {
        this.f4703E.m4381b();
        m4184Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: R */
    public int mo3752R(RecyclerView.C0668b0 c0668b0) {
        return m4368t2(c0668b0);
    }

    /* renamed from: R2 */
    public boolean m4334R2() {
        boolean z10 = true;
        if (m4234x0() != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: S */
    public int mo3753S(RecyclerView.C0668b0 c0668b0) {
        return m4369u2(c0668b0);
    }

    /* renamed from: S2 */
    public final void m4335S2(View view, int i10, int i11, boolean z10) {
        m4165G(view, this.f4709K);
        C0698c c0698c = (C0698c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0698c).leftMargin;
        Rect rect = this.f4709K;
        int m4364p3 = m4364p3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) c0698c).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) c0698c).topMargin;
        Rect rect2 = this.f4709K;
        int m4364p32 = m4364p3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) c0698c).bottomMargin + rect2.bottom);
        if (z10 ? m4215f2(view, m4364p3, m4364p32, c0698c) : m4212d2(view, m4364p3, m4364p32, c0698c)) {
            view.measure(m4364p3, m4364p32);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: T1 */
    public int mo2766T1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        return m4346d3(i10, c0692w, c0668b0);
    }

    /* renamed from: T2 */
    public final void m4336T2(View view, C0698c c0698c, boolean z10) {
        int m4150i0;
        int m4150i02;
        if (c0698c.f4732g) {
            if (this.f4719w != 1) {
                m4335S2(view, RecyclerView.AbstractC0685p.m4150i0(m4169I0(), m4171J0(), m4226o() + m4222k(), ((ViewGroup.MarginLayoutParams) c0698c).width, true), this.f4708J, z10);
                return;
            }
            m4150i0 = this.f4708J;
        } else {
            if (this.f4719w != 1) {
                m4150i0 = RecyclerView.AbstractC0685p.m4150i0(m4169I0(), m4171J0(), m4226o() + m4222k(), ((ViewGroup.MarginLayoutParams) c0698c).width, true);
                m4150i02 = RecyclerView.AbstractC0685p.m4150i0(this.f4720x, m4231v0(), 0, ((ViewGroup.MarginLayoutParams) c0698c).height, false);
                m4335S2(view, m4150i0, m4150i02, z10);
            }
            m4150i0 = RecyclerView.AbstractC0685p.m4150i0(this.f4720x, m4171J0(), 0, ((ViewGroup.MarginLayoutParams) c0698c).width, false);
        }
        m4150i02 = RecyclerView.AbstractC0685p.m4150i0(m4230u0(), m4231v0(), m4225n() + m4206a(), ((ViewGroup.MarginLayoutParams) c0698c).height, true);
        m4335S2(view, m4150i0, m4150i02, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: U1 */
    public void mo2769U1(int i10) {
        C0700e c0700e = this.f4707I;
        if (c0700e != null && c0700e.f4739b != i10) {
            c0700e.m4398b();
        }
        this.f4701C = i10;
        this.f4702D = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        m4184Q1();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: U2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4337U2(androidx.recyclerview.widget.RecyclerView.C0692w r6, androidx.recyclerview.widget.RecyclerView.C0668b0 r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4337U2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: V1 */
    public int mo2772V1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        return m4346d3(i10, c0692w, c0668b0);
    }

    /* renamed from: V2 */
    public final boolean m4338V2(int i10) {
        if (this.f4719w == 0) {
            return (i10 == -1) != this.f4699A;
        }
        return ((i10 == -1) == this.f4699A) == m4334R2();
    }

    /* renamed from: W2 */
    public void m4339W2(int i10, RecyclerView.C0668b0 c0668b0) {
        int m4324H2;
        int i11;
        if (i10 > 0) {
            m4324H2 = m4325I2();
            i11 = 1;
        } else {
            m4324H2 = m4324H2();
            i11 = -1;
        }
        this.f4721y.f4933a = true;
        m4358m3(m4324H2, c0668b0);
        m4347e3(i11);
        C0710i c0710i = this.f4721y;
        c0710i.f4935c = m4324H2 + c0710i.f4936d;
        c0710i.f4934b = Math.abs(i10);
    }

    /* renamed from: X2 */
    public final void m4340X2(View view) {
        for (int i10 = this.f4715s - 1; i10 >= 0; i10--) {
            this.f4716t[i10].m4422u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: Y0 */
    public void mo4201Y0(int i10) {
        super.mo4201Y0(i10);
        for (int i11 = 0; i11 < this.f4715s; i11++) {
            this.f4716t[i11].m4419r(i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r6.f4937e == (-1)) goto L11;
     */
    /* renamed from: Y2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4341Y2(androidx.recyclerview.widget.RecyclerView.C0692w r5, androidx.recyclerview.widget.C0710i r6) {
        /*
            r4 = this;
            r0 = r6
            boolean r0 = r0.f4933a
            if (r0 == 0) goto L94
            r0 = r6
            boolean r0 = r0.f4941i
            if (r0 == 0) goto L11
            goto L94
        L11:
            r0 = r6
            int r0 = r0.f4934b
            if (r0 != 0) goto L3c
            r0 = r6
            int r0 = r0.f4937e
            r1 = -1
            if (r0 != r1) goto L2e
        L20:
            r0 = r6
            int r0 = r0.f4939g
            r7 = r0
        L25:
            r0 = r4
            r1 = r5
            r2 = r7
            r0.m4342Z2(r1, r2)
            goto L94
        L2e:
            r0 = r6
            int r0 = r0.f4938f
            r7 = r0
        L33:
            r0 = r4
            r1 = r5
            r2 = r7
            r0.m4343a3(r1, r2)
            goto L94
        L3c:
            r0 = r6
            int r0 = r0.f4937e
            r1 = -1
            if (r0 != r1) goto L69
            r0 = r6
            int r0 = r0.f4938f
            r7 = r0
            r0 = r7
            r1 = r4
            r2 = r7
            int r1 = r1.m4327K2(r2)
            int r0 = r0 - r1
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto L58
            goto L20
        L58:
            r0 = r6
            int r0 = r0.f4939g
            r1 = r7
            r2 = r6
            int r2 = r2.f4934b
            int r1 = java.lang.Math.min(r1, r2)
            int r0 = r0 - r1
            r7 = r0
            goto L25
        L69:
            r0 = r4
            r1 = r6
            int r1 = r1.f4939g
            int r0 = r0.m4328L2(r1)
            r1 = r6
            int r1 = r1.f4939g
            int r0 = r0 - r1
            r8 = r0
            r0 = r8
            if (r0 >= 0) goto L80
            goto L2e
        L80:
            r0 = r6
            int r0 = r0.f4938f
            r7 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.f4934b
            int r0 = java.lang.Math.min(r0, r1)
            r1 = r7
            int r0 = r0 + r1
            r7 = r0
            goto L33
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4341Y2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.i):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: Z0 */
    public void mo4204Z0(int i10) {
        super.mo4204Z0(i10);
        for (int i11 = 0; i11 < this.f4715s; i11++) {
            this.f4716t[i11].m4419r(i10);
        }
    }

    /* renamed from: Z2 */
    public final void m4342Z2(RecyclerView.C0692w c0692w, int i10) {
        for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
            View m4216g0 = m4216g0(m4217h0);
            if (this.f4717u.mo4617g(m4216g0) < i10 || this.f4717u.mo4627q(m4216g0) < i10) {
                return;
            }
            C0698c c0698c = (C0698c) m4216g0.getLayoutParams();
            if (c0698c.f4732g) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f4715s) {
                        for (int i12 = 0; i12 < this.f4715s; i12++) {
                            this.f4716t[i12].m4420s();
                        }
                    } else if (this.f4716t[i11].f4749a.size() == 1) {
                        return;
                    } else {
                        i11++;
                    }
                }
            } else if (c0698c.f4731f.f4749a.size() == 1) {
                return;
            } else {
                c0698c.f4731f.m4420s();
            }
            m4172J1(m4216g0, c0692w);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: a1 */
    public void mo2783a1(RecyclerView.AbstractC0677h abstractC0677h, RecyclerView.AbstractC0677h abstractC0677h2) {
        this.f4703E.m4381b();
        for (int i10 = 0; i10 < this.f4715s; i10++) {
            this.f4716t[i10].m4406e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: a2 */
    public void mo3755a2(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int m4226o = m4226o() + m4222k();
        int m4225n = m4225n() + m4206a();
        if (this.f4719w == 1) {
            int m4148K = RecyclerView.AbstractC0685p.m4148K(i11, rect.height() + m4225n, m4239z0());
            int m4148K2 = RecyclerView.AbstractC0685p.m4148K(i10, (this.f4720x * this.f4715s) + m4226o, m4152A0());
            i13 = m4148K;
            i12 = m4148K2;
        } else {
            int m4148K3 = RecyclerView.AbstractC0685p.m4148K(i10, rect.width() + m4226o, m4152A0());
            int m4148K4 = RecyclerView.AbstractC0685p.m4148K(i11, (this.f4720x * this.f4715s) + m4225n, m4239z0());
            i12 = m4148K3;
            i13 = m4148K4;
        }
        m4205Z1(i12, i13);
    }

    /* renamed from: a3 */
    public final void m4343a3(RecyclerView.C0692w c0692w, int i10) {
        while (m4217h0() > 0) {
            View m4216g0 = m4216g0(0);
            if (this.f4717u.mo4614d(m4216g0) > i10 || this.f4717u.mo4626p(m4216g0) > i10) {
                return;
            }
            C0698c c0698c = (C0698c) m4216g0.getLayoutParams();
            if (c0698c.f4732g) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f4715s) {
                        for (int i12 = 0; i12 < this.f4715s; i12++) {
                            this.f4716t[i12].m4421t();
                        }
                    } else if (this.f4716t[i11].f4749a.size() == 1) {
                        return;
                    } else {
                        i11++;
                    }
                }
            } else if (c0698c.f4731f.f4749a.size() == 1) {
                return;
            } else {
                c0698c.f4731f.m4421t();
            }
            m4172J1(m4216g0, c0692w);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: b0 */
    public RecyclerView.C0686q mo2786b0() {
        return this.f4719w == 0 ? new C0698c(-2, -1) : new C0698c(-1, -2);
    }

    /* renamed from: b3 */
    public final void m4344b3() {
        if (this.f4718v.mo4621k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int m4217h0 = m4217h0();
        for (int i10 = 0; i10 < m4217h0; i10++) {
            View m4216g0 = m4216g0(i10);
            float mo4615e = this.f4718v.mo4615e(m4216g0);
            if (mo4615e >= f10) {
                float f11 = mo4615e;
                if (((C0698c) m4216g0.getLayoutParams()).m4379n()) {
                    f11 = (mo4615e * 1.0f) / this.f4715s;
                }
                f10 = Math.max(f10, f11);
            }
        }
        int i11 = this.f4720x;
        int round = Math.round(f10 * this.f4715s);
        int i12 = round;
        if (this.f4718v.mo4621k() == Integer.MIN_VALUE) {
            i12 = Math.min(round, this.f4718v.mo4624n());
        }
        m4360n3(i12);
        if (this.f4720x == i11) {
            return;
        }
        for (int i13 = 0; i13 < m4217h0; i13++) {
            View m4216g02 = m4216g0(i13);
            C0698c c0698c = (C0698c) m4216g02.getLayoutParams();
            if (!c0698c.f4732g) {
                if (m4334R2() && this.f4719w == 1) {
                    int i14 = this.f4715s;
                    int i15 = c0698c.f4731f.f4753e;
                    m4216g02.offsetLeftAndRight(((-((i14 - 1) - i15)) * this.f4720x) - ((-((i14 - 1) - i15)) * i11));
                } else {
                    int i16 = c0698c.f4731f.f4753e;
                    int i17 = (this.f4720x * i16) - (i16 * i11);
                    if (this.f4719w == 1) {
                        m4216g02.offsetLeftAndRight(i17);
                    } else {
                        m4216g02.offsetTopAndBottom(i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: c0 */
    public RecyclerView.C0686q mo2790c0(Context context, AttributeSet attributeSet) {
        return new C0698c(context, attributeSet);
    }

    /* renamed from: c3 */
    public final void m4345c3() {
        this.f4699A = (this.f4719w == 1 || !m4334R2()) ? this.f4722z : !this.f4722z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0.b
    /* renamed from: d */
    public PointF mo3816d(int i10) {
        int m4363p2 = m4363p2(i10);
        PointF pointF = new PointF();
        if (m4363p2 == 0) {
            return null;
        }
        if (this.f4719w == 0) {
            pointF.x = m4363p2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m4363p2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: d0 */
    public RecyclerView.C0686q mo2793d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0698c((ViewGroup.MarginLayoutParams) layoutParams) : new C0698c(layoutParams);
    }

    /* renamed from: d3 */
    public int m4346d3(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0 || i10 == 0) {
            return 0;
        }
        m4339W2(i10, c0668b0);
        int m4374z2 = m4374z2(c0692w, this.f4721y, c0668b0);
        if (this.f4721y.f4934b >= m4374z2) {
            i10 = i10 < 0 ? -m4374z2 : m4374z2;
        }
        this.f4717u.mo4628r(-i10);
        this.f4705G = this.f4699A;
        C0710i c0710i = this.f4721y;
        c0710i.f4934b = 0;
        m4341Y2(c0692w, c0710i);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: e1 */
    public void mo3818e1(RecyclerView recyclerView, RecyclerView.C0692w c0692w) {
        super.mo3818e1(recyclerView, c0692w);
        m4176L1(this.f4714P);
        for (int i10 = 0; i10 < this.f4715s; i10++) {
            this.f4716t[i10].m4406e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: e3 */
    public final void m4347e3(int i10) {
        C0710i c0710i = this.f4721y;
        c0710i.f4937e = i10;
        c0710i.f4936d = this.f4699A == (i10 == -1) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: f1 */
    public View mo3756f1(View view, int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        View m4203Z;
        View m4414m;
        if (m4217h0() == 0 || (m4203Z = m4203Z(view)) == null) {
            return null;
        }
        m4345c3();
        int m4370v2 = m4370v2(i10);
        if (m4370v2 == Integer.MIN_VALUE) {
            return null;
        }
        C0698c c0698c = (C0698c) m4203Z.getLayoutParams();
        boolean z10 = c0698c.f4732g;
        C0701f c0701f = c0698c.f4731f;
        int m4325I2 = m4370v2 == 1 ? m4325I2() : m4324H2();
        m4358m3(m4325I2, c0668b0);
        m4347e3(m4370v2);
        C0710i c0710i = this.f4721y;
        c0710i.f4935c = c0710i.f4936d + m4325I2;
        c0710i.f4934b = (int) (this.f4717u.mo4624n() * 0.33333334f);
        C0710i c0710i2 = this.f4721y;
        c0710i2.f4940h = true;
        c0710i2.f4933a = false;
        m4374z2(c0692w, c0710i2, c0668b0);
        this.f4705G = this.f4699A;
        if (!z10 && (m4414m = c0701f.m4414m(m4325I2, m4370v2)) != null && m4414m != m4203Z) {
            return m4414m;
        }
        if (m4338V2(m4370v2)) {
            for (int i11 = this.f4715s - 1; i11 >= 0; i11--) {
                View m4414m2 = this.f4716t[i11].m4414m(m4325I2, m4370v2);
                if (m4414m2 != null && m4414m2 != m4203Z) {
                    return m4414m2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f4715s; i12++) {
                View m4414m3 = this.f4716t[i12].m4414m(m4325I2, m4370v2);
                if (m4414m3 != null && m4414m3 != m4203Z) {
                    return m4414m3;
                }
            }
        }
        boolean z11 = (this.f4722z ^ true) == (m4370v2 == -1);
        if (!z10) {
            View mo3812a0 = mo3812a0(z11 ? c0701f.m4407f() : c0701f.m4408g());
            if (mo3812a0 != null && mo3812a0 != m4203Z) {
                return mo3812a0;
            }
        }
        if (!m4338V2(m4370v2)) {
            for (int i13 = 0; i13 < this.f4715s; i13++) {
                C0701f[] c0701fArr = this.f4716t;
                View mo3812a02 = mo3812a0(z11 ? c0701fArr[i13].m4407f() : c0701fArr[i13].m4408g());
                if (mo3812a02 != null && mo3812a02 != m4203Z) {
                    return mo3812a02;
                }
            }
            return null;
        }
        for (int i14 = this.f4715s - 1; i14 >= 0; i14--) {
            if (i14 != c0701f.f4753e) {
                C0701f[] c0701fArr2 = this.f4716t;
                View mo3812a03 = mo3812a0(z11 ? c0701fArr2[i14].m4407f() : c0701fArr2[i14].m4408g());
                if (mo3812a03 != null && mo3812a03 != m4203Z) {
                    return mo3812a03;
                }
            }
        }
        return null;
    }

    /* renamed from: f3 */
    public void m4348f3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo3789D(null);
        if (i10 == this.f4719w) {
            return;
        }
        this.f4719w = i10;
        AbstractC0713l abstractC0713l = this.f4717u;
        this.f4717u = this.f4718v;
        this.f4718v = abstractC0713l;
        m4184Q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g1 */
    public void mo3822g1(AccessibilityEvent accessibilityEvent) {
        super.mo3822g1(accessibilityEvent);
        if (m4217h0() > 0) {
            View m4319C2 = m4319C2(false);
            View m4318B2 = m4318B2(false);
            if (m4319C2 == null || m4318B2 == null) {
                return;
            }
            int m4155B0 = m4155B0(m4319C2);
            int m4155B02 = m4155B0(m4318B2);
            if (m4155B0 < m4155B02) {
                accessibilityEvent.setFromIndex(m4155B0);
                accessibilityEvent.setToIndex(m4155B02);
            } else {
                accessibilityEvent.setFromIndex(m4155B02);
                accessibilityEvent.setToIndex(m4155B0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g2 */
    public void mo2800g2(RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0, int i10) {
        C0711j c0711j = new C0711j(recyclerView.getContext());
        c0711j.m3999p(i10);
        mo2803h2(c0711j);
    }

    /* renamed from: g3 */
    public void m4349g3(boolean z10) {
        mo3789D(null);
        C0700e c0700e = this.f4707I;
        if (c0700e != null && c0700e.f4746i != z10) {
            c0700e.f4746i = z10;
        }
        this.f4722z = z10;
        m4184Q1();
    }

    /* renamed from: h3 */
    public void m4350h3(int i10) {
        mo3789D(null);
        if (i10 != this.f4715s) {
            m4333Q2();
            this.f4715s = i10;
            this.f4700B = new BitSet(this.f4715s);
            this.f4716t = new C0701f[this.f4715s];
            for (int i11 = 0; i11 < this.f4715s; i11++) {
                this.f4716t[i11] = new C0701f(this, i11);
            }
            m4184Q1();
        }
    }

    /* renamed from: i3 */
    public final void m4351i3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f4715s; i12++) {
            if (!this.f4716t[i12].f4749a.isEmpty()) {
                m4362o3(this.f4716t[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: j2 */
    public boolean mo2809j2() {
        return this.f4707I == null;
    }

    /* renamed from: j3 */
    public final boolean m4352j3(RecyclerView.C0668b0 c0668b0, C0697b c0697b) {
        boolean z10 = this.f4705G;
        int m4009c = c0668b0.m4009c();
        c0697b.f4724a = z10 ? m4321E2(m4009c) : m4317A2(m4009c);
        c0697b.f4725b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        return true;
    }

    /* renamed from: k2 */
    public final void m4353k2(View view) {
        for (int i10 = this.f4715s - 1; i10 >= 0; i10--) {
            this.f4716t[i10].m4402a(view);
        }
    }

    /* renamed from: k3 */
    public boolean m4354k3(RecyclerView.C0668b0 c0668b0, C0697b c0697b) {
        int i10;
        int mo4623m;
        int mo4617g;
        boolean z10 = false;
        if (c0668b0.m4014h() || (i10 = this.f4701C) == -1) {
            return false;
        }
        if (i10 < 0 || i10 >= c0668b0.m4009c()) {
            this.f4701C = -1;
            this.f4702D = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            return false;
        }
        C0700e c0700e = this.f4707I;
        if (c0700e != null && c0700e.f4739b != -1 && c0700e.f4741d >= 1) {
            c0697b.f4725b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            c0697b.f4724a = this.f4701C;
            return true;
        }
        View mo3812a0 = mo3812a0(this.f4701C);
        if (mo3812a0 == null) {
            int i11 = this.f4701C;
            c0697b.f4724a = i11;
            int i12 = this.f4702D;
            if (i12 == Integer.MIN_VALUE) {
                if (m4363p2(i11) == 1) {
                    z10 = true;
                }
                c0697b.f4726c = z10;
                c0697b.m4375a();
            } else {
                c0697b.m4376b(i12);
            }
            c0697b.f4727d = true;
            return true;
        }
        c0697b.f4724a = this.f4699A ? m4325I2() : m4324H2();
        if (this.f4702D != Integer.MIN_VALUE) {
            if (c0697b.f4726c) {
                mo4623m = this.f4717u.mo4619i() - this.f4702D;
                mo4617g = this.f4717u.mo4614d(mo3812a0);
            } else {
                mo4623m = this.f4717u.mo4623m() + this.f4702D;
                mo4617g = this.f4717u.mo4617g(mo3812a0);
            }
            c0697b.f4725b = mo4623m - mo4617g;
            return true;
        }
        if (this.f4717u.mo4615e(mo3812a0) > this.f4717u.mo4624n()) {
            c0697b.f4725b = c0697b.f4726c ? this.f4717u.mo4619i() : this.f4717u.mo4623m();
            return true;
        }
        int mo4617g2 = this.f4717u.mo4617g(mo3812a0) - this.f4717u.mo4623m();
        if (mo4617g2 < 0) {
            c0697b.f4725b = -mo4617g2;
            return true;
        }
        int mo4619i = this.f4717u.mo4619i() - this.f4717u.mo4614d(mo3812a0);
        if (mo4619i < 0) {
            c0697b.f4725b = mo4619i;
            return true;
        }
        c0697b.f4725b = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        return true;
    }

    /* renamed from: l2 */
    public final void m4355l2(C0697b c0697b) {
        boolean z10;
        C0700e c0700e = this.f4707I;
        int i10 = c0700e.f4741d;
        if (i10 > 0) {
            if (i10 == this.f4715s) {
                for (int i11 = 0; i11 < this.f4715s; i11++) {
                    this.f4716t[i11].m4406e();
                    C0700e c0700e2 = this.f4707I;
                    int i12 = c0700e2.f4742e[i11];
                    int i13 = i12;
                    if (i12 != Integer.MIN_VALUE) {
                        i13 = i12 + (c0700e2.f4747j ? this.f4717u.mo4619i() : this.f4717u.mo4623m());
                    }
                    this.f4716t[i11].m4423v(i13);
                }
            } else {
                c0700e.m4399c();
                C0700e c0700e3 = this.f4707I;
                c0700e3.f4739b = c0700e3.f4740c;
            }
        }
        C0700e c0700e4 = this.f4707I;
        this.f4706H = c0700e4.f4748k;
        m4349g3(c0700e4.f4746i);
        m4345c3();
        C0700e c0700e5 = this.f4707I;
        int i14 = c0700e5.f4739b;
        if (i14 != -1) {
            this.f4701C = i14;
            z10 = c0700e5.f4747j;
        } else {
            z10 = this.f4699A;
        }
        c0697b.f4726c = z10;
        if (c0700e5.f4743f > 1) {
            C0699d c0699d = this.f4703E;
            c0699d.f4733a = c0700e5.f4744g;
            c0699d.f4734b = c0700e5.f4745h;
        }
    }

    /* renamed from: l3 */
    public void m4356l3(RecyclerView.C0668b0 c0668b0, C0697b c0697b) {
        if (m4354k3(c0668b0, c0697b) || m4352j3(c0668b0, c0697b)) {
            return;
        }
        c0697b.m4375a();
        c0697b.f4724a = 0;
    }

    /* renamed from: m2 */
    public boolean m4357m2() {
        int m4413l = this.f4716t[0].m4413l(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        for (int i10 = 1; i10 < this.f4715s; i10++) {
            if (this.f4716t[i10].m4413l(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) != m4413l) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* renamed from: m3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4358m3(int r5, androidx.recyclerview.widget.RecyclerView.C0668b0 r6) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4358m3(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: n1 */
    public void mo2826n1(RecyclerView recyclerView, int i10, int i11) {
        m4331O2(i10, i11, 1);
    }

    /* renamed from: n2 */
    public boolean m4359n2() {
        int m4417p = this.f4716t[0].m4417p(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
        for (int i10 = 1; i10 < this.f4715s; i10++) {
            if (this.f4716t[i10].m4417p(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) != m4417p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n3 */
    public void m4360n3(int i10) {
        this.f4720x = i10 / this.f4715s;
        this.f4708J = View.MeasureSpec.makeMeasureSpec(i10, this.f4718v.mo4621k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: o1 */
    public void mo2831o1(RecyclerView recyclerView) {
        this.f4703E.m4381b();
        m4184Q1();
    }

    /* renamed from: o2 */
    public final void m4361o2(View view, C0698c c0698c, C0710i c0710i) {
        if (c0710i.f4937e == 1) {
            if (c0698c.f4732g) {
                m4353k2(view);
                return;
            } else {
                c0698c.f4731f.m4402a(view);
                return;
            }
        }
        if (c0698c.f4732g) {
            m4340X2(view);
        } else {
            c0698c.f4731f.m4422u(view);
        }
    }

    /* renamed from: o3 */
    public final void m4362o3(C0701f c0701f, int i10, int i11) {
        int m4411j = c0701f.m4411j();
        if (i10 == -1) {
            if (c0701f.m4416o() + m4411j > i11) {
                return;
            }
        } else if (c0701f.m4412k() - m4411j < i11) {
            return;
        }
        this.f4700B.set(c0701f.f4753e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: p1 */
    public void mo2835p1(RecyclerView recyclerView, int i10, int i11, int i12) {
        m4331O2(i10, i11, 8);
    }

    /* renamed from: p2 */
    public final int m4363p2(int i10) {
        int i11 = -1;
        if (m4217h0() == 0) {
            if (this.f4699A) {
                i11 = 1;
            }
            return i11;
        }
        if ((i10 < m4324H2()) == this.f4699A) {
            i11 = 1;
        }
        return i11;
    }

    /* renamed from: p3 */
    public final int m4364p3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: q1 */
    public void mo2839q1(RecyclerView recyclerView, int i10, int i11) {
        m4331O2(i10, i11, 2);
    }

    /* renamed from: q2 */
    public boolean m4365q2() {
        int m4324H2;
        int m4325I2;
        if (m4217h0() == 0 || this.f4704F == 0 || !m4177M0()) {
            return false;
        }
        if (this.f4699A) {
            m4324H2 = m4325I2();
            m4325I2 = m4324H2();
        } else {
            m4324H2 = m4324H2();
            m4325I2 = m4325I2();
        }
        if (m4324H2 == 0 && m4332P2() != null) {
            this.f4703E.m4381b();
        } else {
            if (!this.f4711M) {
                return false;
            }
            int i10 = this.f4699A ? -1 : 1;
            int i11 = m4325I2 + 1;
            C0699d.a m4384e = this.f4703E.m4384e(m4324H2, i11, i10, true);
            if (m4384e == null) {
                this.f4711M = false;
                this.f4703E.m4383d(i11);
                return false;
            }
            C0699d.a m4384e2 = this.f4703E.m4384e(m4324H2, m4384e.f4735b, i10 * (-1), true);
            if (m4384e2 == null) {
                this.f4703E.m4383d(m4384e.f4735b);
            } else {
                this.f4703E.m4383d(m4384e2.f4735b + 1);
            }
        }
        m4186R1();
        m4184Q1();
        return true;
    }

    /* renamed from: r2 */
    public final boolean m4366r2(C0701f c0701f) {
        if (!this.f4699A) {
            if (c0701f.m4416o() > this.f4717u.mo4623m()) {
                return !c0701f.m4415n(c0701f.f4749a.get(0)).f4732g;
            }
            return false;
        }
        if (c0701f.m4412k() >= this.f4717u.mo4619i()) {
            return false;
        }
        ArrayList<View> arrayList = c0701f.f4749a;
        return !c0701f.m4415n(arrayList.get(arrayList.size() - 1)).f4732g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: s1 */
    public void mo3767s1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        m4331O2(i10, i11, 4);
    }

    /* renamed from: s2 */
    public final int m4367s2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        return C0716o.m4651a(c0668b0, this.f4717u, m4319C2(!this.f4712N), m4318B2(!this.f4712N), this, this.f4712N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: t1 */
    public void mo2852t1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        m4337U2(c0692w, c0668b0, true);
    }

    /* renamed from: t2 */
    public final int m4368t2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        return C0716o.m4652b(c0668b0, this.f4717u, m4319C2(!this.f4712N), m4318B2(!this.f4712N), this, this.f4712N, this.f4699A);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: u1 */
    public void mo2856u1(RecyclerView.C0668b0 c0668b0) {
        super.mo2856u1(c0668b0);
        this.f4701C = -1;
        this.f4702D = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        this.f4707I = null;
        this.f4710L.m4377c();
    }

    /* renamed from: u2 */
    public final int m4369u2(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0) {
            return 0;
        }
        return C0716o.m4653c(c0668b0, this.f4717u, m4319C2(!this.f4712N), m4318B2(!this.f4712N), this, this.f4712N);
    }

    /* renamed from: v2 */
    public final int m4370v2(int i10) {
        int i11 = -1;
        if (i10 == 1) {
            return (this.f4719w != 1 && m4334R2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4719w != 1 && m4334R2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f4719w != 0) {
                i11 = Integer.MIN_VALUE;
            }
            return i11;
        }
        if (i10 == 33) {
            if (this.f4719w != 1) {
                i11 = Integer.MIN_VALUE;
            }
            return i11;
        }
        if (i10 == 66) {
            return this.f4719w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }
        return this.f4719w == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: w2 */
    public final C0699d.a m4371w2(int i10) {
        C0699d.a aVar = new C0699d.a();
        aVar.f4737d = new int[this.f4715s];
        for (int i11 = 0; i11 < this.f4715s; i11++) {
            aVar.f4737d[i11] = i10 - this.f4716t[i11].m4413l(i10);
        }
        return aVar;
    }

    /* renamed from: x2 */
    public final C0699d.a m4372x2(int i10) {
        C0699d.a aVar = new C0699d.a();
        aVar.f4737d = new int[this.f4715s];
        for (int i11 = 0; i11 < this.f4715s; i11++) {
            aVar.f4737d[i11] = this.f4716t[i11].m4417p(i10) - i10;
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: y1 */
    public void mo2871y1(Parcelable parcelable) {
        if (parcelable instanceof C0700e) {
            C0700e c0700e = (C0700e) parcelable;
            this.f4707I = c0700e;
            if (this.f4701C != -1) {
                c0700e.m4398b();
                this.f4707I.m4399c();
            }
            m4184Q1();
        }
    }

    /* renamed from: y2 */
    public final void m4373y2() {
        this.f4717u = AbstractC0713l.m4612b(this, this.f4719w);
        this.f4718v = AbstractC0713l.m4612b(this, 1 - this.f4719w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: z1 */
    public Parcelable mo2875z1() {
        int m4417p;
        int i10;
        int mo4623m;
        int[] iArr;
        if (this.f4707I != null) {
            return new C0700e(this.f4707I);
        }
        C0700e c0700e = new C0700e();
        c0700e.f4746i = this.f4722z;
        c0700e.f4747j = this.f4705G;
        c0700e.f4748k = this.f4706H;
        C0699d c0699d = this.f4703E;
        if (c0699d == null || (iArr = c0699d.f4733a) == null) {
            c0700e.f4743f = 0;
        } else {
            c0700e.f4744g = iArr;
            c0700e.f4743f = iArr.length;
            c0700e.f4745h = c0699d.f4734b;
        }
        if (m4217h0() > 0) {
            c0700e.f4739b = this.f4705G ? m4325I2() : m4324H2();
            c0700e.f4740c = m4320D2();
            int i11 = this.f4715s;
            c0700e.f4741d = i11;
            c0700e.f4742e = new int[i11];
            for (int i12 = 0; i12 < this.f4715s; i12++) {
                if (this.f4705G) {
                    m4417p = this.f4716t[i12].m4413l(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
                    i10 = m4417p;
                    if (m4417p != Integer.MIN_VALUE) {
                        mo4623m = this.f4717u.mo4619i();
                        i10 = m4417p - mo4623m;
                        c0700e.f4742e[i12] = i10;
                    } else {
                        c0700e.f4742e[i12] = i10;
                    }
                } else {
                    m4417p = this.f4716t[i12].m4417p(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
                    i10 = m4417p;
                    if (m4417p != Integer.MIN_VALUE) {
                        mo4623m = this.f4717u.mo4623m();
                        i10 = m4417p - mo4623m;
                        c0700e.f4742e[i12] = i10;
                    } else {
                        c0700e.f4742e[i12] = i10;
                    }
                }
            }
        } else {
            c0700e.f4739b = -1;
            c0700e.f4740c = -1;
            c0700e.f4741d = 0;
        }
        return c0700e;
    }

    /* renamed from: z2 */
    public final int m4374z2(RecyclerView.C0692w c0692w, C0710i c0710i, RecyclerView.C0668b0 c0668b0) {
        int i10;
        boolean z10;
        C0701f c0701f;
        int m4329M2;
        int mo4615e;
        int mo4615e2;
        int i11;
        this.f4700B.set(0, this.f4715s, true);
        if (this.f4721y.f4941i) {
            i10 = c0710i.f4937e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = c0710i.f4937e == 1 ? c0710i.f4939g + c0710i.f4934b : c0710i.f4938f - c0710i.f4934b;
        }
        m4351i3(c0710i.f4937e, i10);
        int mo4619i = this.f4699A ? this.f4717u.mo4619i() : this.f4717u.mo4623m();
        boolean z11 = false;
        while (true) {
            z10 = z11;
            if (!c0710i.m4594a(c0668b0) || (!this.f4721y.f4941i && this.f4700B.isEmpty())) {
                break;
            }
            View m4595b = c0710i.m4595b(c0692w);
            C0698c c0698c = (C0698c) m4595b.getLayoutParams();
            int m4247c = c0698c.m4247c();
            int m4386g = this.f4703E.m4386g(m4247c);
            boolean z12 = m4386g == -1;
            if (z12) {
                c0701f = c0698c.f4732g ? this.f4716t[0] : m4330N2(c0710i);
                this.f4703E.m4393n(m4247c, c0701f);
            } else {
                c0701f = this.f4716t[m4386g];
            }
            c0698c.f4731f = c0701f;
            if (c0710i.f4937e == 1) {
                m4151A(m4595b);
            } else {
                m4154B(m4595b, 0);
            }
            m4336T2(m4595b, c0698c, false);
            if (c0710i.f4937e == 1) {
                int m4326J2 = c0698c.f4732g ? m4326J2(mo4619i) : c0701f.m4413l(mo4619i);
                int mo4615e3 = this.f4717u.mo4615e(m4595b);
                if (z12 && c0698c.f4732g) {
                    C0699d.a m4371w2 = m4371w2(m4326J2);
                    m4371w2.f4736c = -1;
                    m4371w2.f4735b = m4247c;
                    this.f4703E.m4380a(m4371w2);
                }
                mo4615e = m4326J2;
                m4329M2 = mo4615e3 + m4326J2;
            } else {
                m4329M2 = c0698c.f4732g ? m4329M2(mo4619i) : c0701f.m4417p(mo4619i);
                mo4615e = m4329M2 - this.f4717u.mo4615e(m4595b);
                if (z12 && c0698c.f4732g) {
                    C0699d.a m4372x2 = m4372x2(m4329M2);
                    m4372x2.f4736c = 1;
                    m4372x2.f4735b = m4247c;
                    this.f4703E.m4380a(m4372x2);
                }
            }
            if (c0698c.f4732g && c0710i.f4936d == -1) {
                if (!z12) {
                    if (!(c0710i.f4937e == 1 ? m4357m2() : m4359n2())) {
                        C0699d.a m4385f = this.f4703E.m4385f(m4247c);
                        if (m4385f != null) {
                            m4385f.f4738e = true;
                        }
                    }
                }
                this.f4711M = true;
            }
            m4361o2(m4595b, c0698c, c0710i);
            if (m4334R2() && this.f4719w == 1) {
                int mo4619i2 = c0698c.f4732g ? this.f4718v.mo4619i() : this.f4718v.mo4619i() - (((this.f4715s - 1) - c0701f.f4753e) * this.f4720x);
                mo4615e2 = mo4619i2;
                i11 = mo4619i2 - this.f4718v.mo4615e(m4595b);
            } else {
                int mo4623m = c0698c.f4732g ? this.f4718v.mo4623m() : (c0701f.f4753e * this.f4720x) + this.f4718v.mo4623m();
                mo4615e2 = this.f4718v.mo4615e(m4595b) + mo4623m;
                i11 = mo4623m;
            }
            if (this.f4719w == 1) {
                int i12 = mo4615e;
                mo4615e = i11;
                i11 = i12;
            } else {
                int i13 = m4329M2;
                m4329M2 = mo4615e2;
                mo4615e2 = i13;
            }
            m4193V0(m4595b, mo4615e, i11, mo4615e2, m4329M2);
            if (c0698c.f4732g) {
                m4351i3(this.f4721y.f4937e, i10);
            } else {
                m4362o3(c0701f, this.f4721y.f4937e, i10);
            }
            m4341Y2(c0692w, this.f4721y);
            if (this.f4721y.f4940h && m4595b.hasFocusable()) {
                if (c0698c.f4732g) {
                    this.f4700B.clear();
                } else {
                    this.f4700B.set(c0701f.f4753e, false);
                }
            }
            z11 = true;
        }
        if (!z10) {
            m4341Y2(c0692w, this.f4721y);
        }
        int mo4623m2 = this.f4721y.f4937e == -1 ? this.f4717u.mo4623m() - m4329M2(this.f4717u.mo4623m()) : m4326J2(this.f4717u.mo4619i()) - this.f4717u.mo4619i();
        return mo4623m2 > 0 ? Math.min(c0710i.f4934b, mo4623m2) : 0;
    }
}
