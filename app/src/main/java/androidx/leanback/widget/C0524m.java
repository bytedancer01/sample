package androidx.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC0522l;
import androidx.leanback.widget.C0513g1;
import androidx.leanback.widget.C0538s;
import androidx.recyclerview.widget.AbstractC0713l;
import androidx.recyclerview.widget.C0711j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p235o0.C6824g0;
import p261p0.C7535k;
import p294r.C7931d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/m.class
 */
/* renamed from: androidx.leanback.widget.m */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m.class */
public final class C0524m extends RecyclerView.AbstractC0685p {

    /* renamed from: k0 */
    public static final Rect f3475k0 = new Rect();

    /* renamed from: l0 */
    public static int[] f3476l0 = new int[2];

    /* renamed from: A */
    public int[] f3477A;

    /* renamed from: B */
    public RecyclerView.C0692w f3478B;

    /* renamed from: I */
    public d f3485I;

    /* renamed from: J */
    public f f3486J;

    /* renamed from: L */
    public int f3488L;

    /* renamed from: N */
    public int f3490N;

    /* renamed from: O */
    public int f3491O;

    /* renamed from: P */
    public int f3492P;

    /* renamed from: Q */
    public int[] f3493Q;

    /* renamed from: R */
    public int f3494R;

    /* renamed from: S */
    public int f3495S;

    /* renamed from: T */
    public int f3496T;

    /* renamed from: U */
    public int f3497U;

    /* renamed from: V */
    public int f3498V;

    /* renamed from: X */
    public int f3500X;

    /* renamed from: Z */
    public AbstractC0522l f3502Z;

    /* renamed from: d0 */
    public int f3506d0;

    /* renamed from: e0 */
    public int f3507e0;

    /* renamed from: h0 */
    public InterfaceC0508f f3510h0;

    /* renamed from: t */
    public final AbstractC0496b f3514t;

    /* renamed from: w */
    public RecyclerView.C0668b0 f3517w;

    /* renamed from: x */
    public int f3518x;

    /* renamed from: y */
    public int f3519y;

    /* renamed from: s */
    public int f3513s = 10;

    /* renamed from: u */
    public int f3515u = 0;

    /* renamed from: v */
    public AbstractC0713l f3516v = AbstractC0713l.m4611a(this);

    /* renamed from: z */
    public final SparseIntArray f3520z = new SparseIntArray();

    /* renamed from: C */
    public int f3479C = 221696;

    /* renamed from: D */
    public InterfaceC0500c0 f3480D = null;

    /* renamed from: E */
    public ArrayList<AbstractC0503d0> f3481E = null;

    /* renamed from: F */
    public InterfaceC0497b0 f3482F = null;

    /* renamed from: G */
    public int f3483G = -1;

    /* renamed from: H */
    public int f3484H = 0;

    /* renamed from: K */
    public int f3487K = 0;

    /* renamed from: W */
    public int f3499W = 8388659;

    /* renamed from: Y */
    public int f3501Y = 1;

    /* renamed from: a0 */
    public int f3503a0 = 0;

    /* renamed from: b0 */
    public final C0513g1 f3504b0 = new C0513g1();

    /* renamed from: c0 */
    public final C0536r f3505c0 = new C0536r();

    /* renamed from: f0 */
    public int[] f3508f0 = new int[2];

    /* renamed from: g0 */
    public final C0510f1 f3509g0 = new C0510f1();

    /* renamed from: i0 */
    public final Runnable f3511i0 = new a(this);

    /* renamed from: j0 */
    public AbstractC0522l.b f3512j0 = new b(this);

    /* renamed from: M */
    public int f3489M = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$a.class
     */
    /* renamed from: androidx.leanback.widget.m$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0524m f3521b;

        public a(C0524m c0524m) {
            this.f3521b = c0524m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3521b.m4184Q1();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$b.class
     */
    /* renamed from: androidx.leanback.widget.m$b */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$b.class */
    public class b implements AbstractC0522l.b {

        /* renamed from: a */
        public final C0524m f3522a;

        public b(C0524m c0524m) {
            this.f3522a = c0524m;
        }

        @Override // androidx.leanback.widget.AbstractC0522l.b
        /* renamed from: a */
        public int mo2693a() {
            return this.f3522a.f3518x;
        }

        @Override // androidx.leanback.widget.AbstractC0522l.b
        /* renamed from: b */
        public int mo2694b(int i10) {
            C0524m c0524m = this.f3522a;
            View mo3812a0 = c0524m.mo3812a0(i10 - c0524m.f3518x);
            C0524m c0524m2 = this.f3522a;
            return (c0524m2.f3479C & 262144) != 0 ? c0524m2.m2801g3(mo3812a0) : c0524m2.m2804h3(mo3812a0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        
            if (r13 == Integer.MAX_VALUE) goto L6;
         */
        @Override // androidx.leanback.widget.AbstractC0522l.b
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo2695c(java.lang.Object r9, int r10, int r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.b.mo2695c(java.lang.Object, int, int, int, int):void");
        }

        @Override // androidx.leanback.widget.AbstractC0522l.b
        /* renamed from: d */
        public int mo2696d(int i10) {
            C0524m c0524m = this.f3522a;
            return c0524m.m2807i3(c0524m.mo3812a0(i10 - c0524m.f3518x));
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
        
            if (r12.f3486J == null) goto L28;
         */
        @Override // androidx.leanback.widget.AbstractC0522l.b
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int mo2697e(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.b.mo2697e(int, boolean, java.lang.Object[], boolean):int");
        }

        @Override // androidx.leanback.widget.AbstractC0522l.b
        public int getCount() {
            return this.f3522a.f3517w.m4009c() + this.f3522a.f3518x;
        }

        @Override // androidx.leanback.widget.AbstractC0522l.b
        public void removeItem(int i10) {
            C0524m c0524m = this.f3522a;
            View mo3812a0 = c0524m.mo3812a0(i10 - c0524m.f3518x);
            C0524m c0524m2 = this.f3522a;
            if ((c0524m2.f3479C & 3) == 1) {
                c0524m2.m4190U(mo3812a0, c0524m2.f3478B);
            } else {
                c0524m2.m4172J1(mo3812a0, c0524m2.f3478B);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$c.class
     */
    /* renamed from: androidx.leanback.widget.m$c */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$c.class */
    public class c extends d {

        /* renamed from: s */
        public final C0524m f3523s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0524m c0524m) {
            super(c0524m);
            this.f3523s = c0524m;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: a */
        public PointF mo2879a(int i10) {
            if (m3988c() == 0) {
                return null;
            }
            C0524m c0524m = this.f3523s;
            boolean z10 = false;
            int m4155B0 = c0524m.m4155B0(c0524m.m4216g0(0));
            C0524m c0524m2 = this.f3523s;
            if ((c0524m2.f3479C & 262144) == 0 ? i10 < m4155B0 : i10 > m4155B0) {
                z10 = true;
            }
            int i11 = 1;
            if (z10) {
                i11 = -1;
            }
            return c0524m2.f3515u == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$d.class
     */
    /* renamed from: androidx.leanback.widget.m$d */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$d.class */
    public abstract class d extends C0711j {

        /* renamed from: q */
        public boolean f3524q;

        /* renamed from: r */
        public final C0524m f3525r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0524m c0524m) {
            super(c0524m.f3514t.getContext());
            this.f3525r = c0524m;
        }

        /* renamed from: D */
        public void mo2880D() {
            View m3987b = m3987b(m3991f());
            if (m3987b == null) {
                if (m3991f() >= 0) {
                    this.f3525r.m2768T3(m3991f(), 0, false, 0);
                    return;
                }
                return;
            }
            if (this.f3525r.f3483G != m3991f()) {
                this.f3525r.f3483G = m3991f();
            }
            if (this.f3525r.m4175L0()) {
                this.f3525r.f3479C |= 32;
                m3987b.requestFocus();
                this.f3525r.f3479C &= -33;
            }
            this.f3525r.m2832o2();
            this.f3525r.m2836p2();
        }

        @Override // androidx.recyclerview.widget.C0711j, androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: n */
        public void mo2881n() {
            super.mo2881n();
            if (!this.f3524q) {
                mo2880D();
            }
            C0524m c0524m = this.f3525r;
            if (c0524m.f3485I == this) {
                c0524m.f3485I = null;
            }
            if (c0524m.f3486J == this) {
                c0524m.f3486J = null;
            }
        }

        @Override // androidx.recyclerview.widget.C0711j, androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: o */
        public void mo2882o(View view, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0666a0.a aVar) {
            int i10;
            int i11;
            if (this.f3525r.m2764S2(view, null, C0524m.f3476l0)) {
                if (this.f3525r.f3515u == 0) {
                    int[] iArr = C0524m.f3476l0;
                    i10 = iArr[0];
                    i11 = iArr[1];
                } else {
                    int[] iArr2 = C0524m.f3476l0;
                    i10 = iArr2[1];
                    i11 = iArr2[0];
                }
                aVar.m4005d(i10, i11, m4602w((int) Math.sqrt((i10 * i10) + (i11 * i11))), this.f4943j);
            }
        }

        @Override // androidx.recyclerview.widget.C0711j
        /* renamed from: x */
        public int mo2883x(int i10) {
            int mo2883x = super.mo2883x(i10);
            int i11 = mo2883x;
            if (this.f3525r.f3504b0.m2603a().m2617i() > 0) {
                float m2617i = (30.0f / this.f3525r.f3504b0.m2603a().m2617i()) * i10;
                i11 = mo2883x;
                if (mo2883x < m2617i) {
                    i11 = (int) m2617i;
                }
            }
            return i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$e.class
     */
    /* renamed from: androidx.leanback.widget.m$e */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$e.class */
    public static final class e extends RecyclerView.C0686q {

        /* renamed from: f */
        public int f3526f;

        /* renamed from: g */
        public int f3527g;

        /* renamed from: h */
        public int f3528h;

        /* renamed from: i */
        public int f3529i;

        /* renamed from: j */
        public int f3530j;

        /* renamed from: k */
        public int f3531k;

        /* renamed from: l */
        public int[] f3532l;

        /* renamed from: m */
        public C0538s f3533m;

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(e eVar) {
            super((RecyclerView.C0686q) eVar);
        }

        public e(RecyclerView.C0686q c0686q) {
            super(c0686q);
        }

        /* renamed from: A */
        public int m2884A(View view) {
            return view.getRight() - this.f3528h;
        }

        /* renamed from: B */
        public int m2885B() {
            return this.f3528h;
        }

        /* renamed from: C */
        public int m2886C(View view) {
            return view.getTop() + this.f3527g;
        }

        /* renamed from: H */
        public int m2887H() {
            return this.f3527g;
        }

        /* renamed from: P */
        public int m2888P(View view) {
            return (view.getWidth() - this.f3526f) - this.f3528h;
        }

        /* renamed from: Q */
        public void m2889Q(int i10) {
            this.f3530j = i10;
        }

        /* renamed from: R */
        public void m2890R(int i10) {
            this.f3531k = i10;
        }

        /* renamed from: S */
        public void m2891S(C0538s c0538s) {
            this.f3533m = c0538s;
        }

        /* renamed from: T */
        public void m2892T(int i10, int i11, int i12, int i13) {
            this.f3526f = i10;
            this.f3527g = i11;
            this.f3528h = i12;
            this.f3529i = i13;
        }

        /* renamed from: n */
        public void m2893n(int i10, View view) {
            C0538s.a[] m2980a = this.f3533m.m2980a();
            int[] iArr = this.f3532l;
            if (iArr == null || iArr.length != m2980a.length) {
                this.f3532l = new int[m2980a.length];
            }
            for (int i11 = 0; i11 < m2980a.length; i11++) {
                this.f3532l[i11] = C0540t.m2993a(view, m2980a[i11], i10);
            }
            if (i10 == 0) {
                this.f3530j = this.f3532l[0];
            } else {
                this.f3531k = this.f3532l[0];
            }
        }

        /* renamed from: o */
        public int[] m2894o() {
            return this.f3532l;
        }

        /* renamed from: p */
        public int m2895p() {
            return this.f3530j;
        }

        /* renamed from: r */
        public int m2896r() {
            return this.f3531k;
        }

        /* renamed from: s */
        public C0538s m2897s() {
            return this.f3533m;
        }

        /* renamed from: u */
        public int m2898u(View view) {
            return (view.getHeight() - this.f3527g) - this.f3529i;
        }

        /* renamed from: w */
        public int m2899w(View view) {
            return view.getLeft() + this.f3526f;
        }

        /* renamed from: z */
        public int m2900z() {
            return this.f3526f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$f.class
     */
    /* renamed from: androidx.leanback.widget.m$f */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$f.class */
    public final class f extends d {

        /* renamed from: s */
        public final boolean f3534s;

        /* renamed from: t */
        public int f3535t;

        /* renamed from: u */
        public final C0524m f3536u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0524m c0524m, int i10, boolean z10) {
            super(c0524m);
            this.f3536u = c0524m;
            this.f3535t = i10;
            this.f3534s = z10;
            m3999p(-2);
        }

        @Override // androidx.recyclerview.widget.C0711j
        /* renamed from: C */
        public void mo2901C(RecyclerView.AbstractC0666a0.a aVar) {
            if (this.f3535t == 0) {
                return;
            }
            super.mo2901C(aVar);
        }

        @Override // androidx.leanback.widget.C0524m.d
        /* renamed from: D */
        public void mo2880D() {
            super.mo2880D();
            this.f3535t = 0;
            View m3987b = m3987b(m3991f());
            if (m3987b != null) {
                this.f3536u.m2776W3(m3987b, true);
            }
        }

        /* renamed from: E */
        public void m2902E() {
            int i10;
            if (this.f3534s && (i10 = this.f3535t) != 0) {
                this.f3535t = this.f3536u.m2752M3(true, i10);
            }
            int i11 = this.f3535t;
            if (i11 == 0 || ((i11 > 0 && this.f3536u.m2846r3()) || (this.f3535t < 0 && this.f3536u.m2841q3()))) {
                m3999p(this.f3536u.f3483G);
                m4001r();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009f -> B:8:0x002b). Please report as a decompilation issue!!! */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m2903F() {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.f.m2903F():void");
        }

        /* renamed from: G */
        public void m2904G() {
            int i10 = this.f3535t;
            if (i10 > (-this.f3536u.f3513s)) {
                this.f3535t = i10 - 1;
            }
        }

        /* renamed from: H */
        public void m2905H() {
            int i10 = this.f3535t;
            if (i10 < this.f3536u.f3513s) {
                this.f3535t = i10 + 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0666a0
        /* renamed from: a */
        public PointF mo2879a(int i10) {
            int i11 = this.f3535t;
            if (i11 == 0) {
                return null;
            }
            C0524m c0524m = this.f3536u;
            int i12 = ((c0524m.f3479C & 262144) == 0 ? i11 >= 0 : i11 <= 0) ? 1 : -1;
            return c0524m.f3515u == 0 ? new PointF(i12, 0.0f) : new PointF(0.0f, i12);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/m$g.class
     */
    /* renamed from: androidx.leanback.widget.m$g */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$g.class */
    public static final class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b */
        public int f3537b;

        /* renamed from: c */
        public Bundle f3538c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/leanback/widget/m$g$a.class
         */
        /* renamed from: androidx.leanback.widget.m$g$a */
        /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/m$g$a.class */
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
            this.f3538c = Bundle.EMPTY;
        }

        public g(Parcel parcel) {
            this.f3538c = Bundle.EMPTY;
            this.f3537b = parcel.readInt();
            this.f3538c = parcel.readBundle(C0524m.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3537b);
            parcel.writeBundle(this.f3538c);
        }
    }

    public C0524m(AbstractC0496b abstractC0496b) {
        this.f3514t = abstractC0496b;
        m4199X1(false);
    }

    /* renamed from: A2 */
    public final boolean m2708A2(View view, View view2, int[] iArr) {
        int m2758P2 = m2758P2(view);
        int i10 = m2758P2;
        if (view2 != null) {
            i10 = m2876z2(m2758P2, view, view2);
        }
        int m2767T2 = m2767T2(view);
        int i11 = i10 + this.f3488L;
        if (i11 == 0 && m2767T2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i11;
        iArr[1] = m2767T2;
        return true;
    }

    /* renamed from: A3 */
    public final void m2709A3() {
        this.f3478B = null;
        this.f3517w = null;
        this.f3518x = 0;
        this.f3519y = 0;
    }

    /* renamed from: A4 */
    public void m2710A4(int i10) {
        this.f3504b0.m2603a().m2634z(i10);
    }

    /* renamed from: B2 */
    public int m2711B2(RecyclerView recyclerView, int i10, int i11) {
        int indexOfChild;
        View mo3812a0 = mo3812a0(this.f3483G);
        if (mo3812a0 != null && i11 >= (indexOfChild = recyclerView.indexOfChild(mo3812a0))) {
            int i12 = indexOfChild;
            if (i11 < i10 - 1) {
                i12 = ((indexOfChild + i10) - 1) - i11;
            }
            return i12;
        }
        return i11;
    }

    /* renamed from: B3 */
    public void m2712B3(View view) {
        int i10;
        int i11;
        e eVar = (e) view.getLayoutParams();
        Rect rect = f3475k0;
        m4165G(view, rect);
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right;
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom;
        int makeMeasureSpec = this.f3491O == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f3492P, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        int i14 = this.f3515u;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (i14 == 0) {
            i11 = ViewGroup.getChildMeasureSpec(makeMeasureSpec2, i12, ((ViewGroup.MarginLayoutParams) eVar).width);
            i10 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i13, ((ViewGroup.MarginLayoutParams) eVar).height);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec2, i13, ((ViewGroup.MarginLayoutParams) eVar).height);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i12, ((ViewGroup.MarginLayoutParams) eVar).width);
            i10 = childMeasureSpec;
            i11 = childMeasureSpec2;
        }
        view.measure(i11, i10);
    }

    /* renamed from: B4 */
    public void m2713B4(float f10) {
        this.f3504b0.m2603a().m2607A(f10);
    }

    /* renamed from: C2 */
    public int m2714C2(View view) {
        e eVar = (e) view.getLayoutParams();
        return m4227p0(view) + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
    }

    /* renamed from: C3 */
    public final void m2715C3(int i10, int i11, int i12, int[] iArr) {
        View m4300o = this.f3478B.m4300o(i10);
        if (m4300o != null) {
            e eVar = (e) m4300o.getLayoutParams();
            Rect rect = f3475k0;
            m4165G(m4300o, rect);
            int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i18 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i19 = rect.top;
            m4300o.measure(ViewGroup.getChildMeasureSpec(i11, m4226o() + m4222k() + i13 + i14 + i15 + i16, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i12, m4225n() + m4206a() + i17 + i18 + i19 + rect.bottom, ((ViewGroup.MarginLayoutParams) eVar).height));
            iArr[0] = m2718D2(m4300o);
            iArr[1] = m2714C2(m4300o);
            this.f3478B.m4274B(m4300o);
        }
    }

    /* renamed from: C4 */
    public void m2716C4() {
        d dVar = this.f3485I;
        if (dVar != null) {
            dVar.f3524q = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r10 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r9 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r10 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r7 == p261p0.C7535k.a.f36327E.m32250b()) goto L18;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2717D1(androidx.recyclerview.widget.RecyclerView.C0692w r5, androidx.recyclerview.widget.RecyclerView.C0668b0 r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.m2866w3()
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.m2759P3(r1, r2)
            r0 = r4
            int r0 = r0.f3479C
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L20
            r0 = 1
            r10 = r0
            goto L23
        L20:
            r0 = 0
            r10 = r0
        L23:
            r0 = r7
            r9 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L86
            r0 = r4
            int r0 = r0.f3515u
            if (r0 != 0) goto L69
            r0 = r7
            p0.k$a r1 = p261p0.C7535k.a.f36326D
            int r1 = r1.m32250b()
            if (r0 != r1) goto L54
            r0 = r10
            if (r0 == 0) goto L4c
        L44:
            r0 = 4096(0x1000, float:5.74E-42)
            r9 = r0
            goto L86
        L4c:
            r0 = 8192(0x2000, float:1.148E-41)
            r9 = r0
            goto L86
        L54:
            r0 = r7
            r9 = r0
            r0 = r7
            p0.k$a r1 = p261p0.C7535k.a.f36328F
            int r1 = r1.m32250b()
            if (r0 != r1) goto L86
            r0 = r10
            if (r0 == 0) goto L44
            goto L4c
        L69:
            r0 = r7
            p0.k$a r1 = p261p0.C7535k.a.f36325C
            int r1 = r1.m32250b()
            if (r0 != r1) goto L76
            goto L4c
        L76:
            r0 = r7
            r9 = r0
            r0 = r7
            p0.k$a r1 = p261p0.C7535k.a.f36327E
            int r1 = r1.m32250b()
            if (r0 != r1) goto L86
            goto L44
        L86:
            r0 = r9
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 == r1) goto La8
            r0 = r9
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 == r1) goto L99
            goto Lb4
        L99:
            r0 = r4
            r1 = 0
            r0.m2744K3(r1)
            r0 = r4
            r1 = 0
            r2 = -1
            int r0 = r0.m2752M3(r1, r2)
            goto Lb4
        La8:
            r0 = r4
            r1 = 1
            r0.m2744K3(r1)
            r0 = r4
            r1 = 0
            r2 = 1
            int r0 = r0.m2752M3(r1, r2)
        Lb4:
            r0 = r4
            r0.m2709A3()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.mo2717D1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
    }

    /* renamed from: D2 */
    public int m2718D2(View view) {
        e eVar = (e) view.getLayoutParams();
        return m4228q0(view) + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    /* renamed from: D3 */
    public final void m2719D3(int i10) {
        int m4217h0 = m4217h0();
        if (this.f3515u != 1) {
            for (int i11 = 0; i11 < m4217h0; i11++) {
                m4216g0(i11).offsetLeftAndRight(i10);
            }
        } else {
            for (int i12 = 0; i12 < m4217h0; i12++) {
                m4216g0(i12).offsetTopAndBottom(i10);
            }
        }
    }

    /* renamed from: D4 */
    public int m2720D4(int i10) {
        c cVar = new c(this);
        cVar.m3999p(i10);
        mo2803h2(cVar);
        return cVar.m3991f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: E0 */
    public int mo2721E0(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        AbstractC0522l abstractC0522l;
        return (this.f3515u != 0 || (abstractC0522l = this.f3502Z) == null) ? super.mo2721E0(c0692w, c0668b0) : abstractC0522l.m2684r();
    }

    /* renamed from: E2 */
    public int m2722E2() {
        return this.f3507e0;
    }

    /* renamed from: E3 */
    public final void m2723E3(int i10) {
        int m4217h0 = m4217h0();
        if (this.f3515u != 0) {
            for (int i11 = 0; i11 < m4217h0; i11++) {
                m4216g0(i11).offsetLeftAndRight(i10);
            }
        } else {
            for (int i12 = 0; i12 < m4217h0; i12++) {
                m4216g0(i12).offsetTopAndBottom(i10);
            }
        }
    }

    /* renamed from: E4 */
    public final void m2724E4() {
        int m4217h0 = m4217h0();
        for (int i10 = 0; i10 < m4217h0; i10++) {
            m2727F4(m4216g0(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F2 */
    public <E> E m2725F2(RecyclerView.AbstractC0674e0 abstractC0674e0, Class<? extends E> cls) {
        E mo2581c = abstractC0674e0 instanceof InterfaceC0505e ? ((InterfaceC0505e) abstractC0674e0).mo2581c(cls) : null;
        E e10 = mo2581c;
        if (mo2581c == null) {
            InterfaceC0508f interfaceC0508f = this.f3510h0;
            e10 = mo2581c;
            if (interfaceC0508f != null) {
                InterfaceC0505e mo2583f = interfaceC0508f.mo2583f(abstractC0674e0.m4067q());
                e10 = mo2581c;
                if (mo2583f != null) {
                    e10 = mo2583f.mo2581c(cls);
                }
            }
        }
        return e10;
    }

    /* renamed from: F3 */
    public void m2726F3(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        int m4064n = abstractC0674e0.m4064n();
        if (m4064n != -1) {
            this.f3509g0.m2593j(abstractC0674e0.f4620a, m4064n);
        }
    }

    /* renamed from: F4 */
    public final void m2727F4(View view) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.m2897s() == null) {
            eVar.m2889Q(this.f3505c0.f3581c.m2942j(view));
        } else {
            eVar.m2893n(this.f3515u, view);
            if (this.f3515u != 0) {
                eVar.m2889Q(this.f3505c0.f3581c.m2942j(view));
                return;
            }
        }
        eVar.m2890R(this.f3505c0.f3580b.m2942j(view));
    }

    /* renamed from: G2 */
    public int m2728G2() {
        return this.f3503a0;
    }

    /* renamed from: G3 */
    public void m2729G3(boolean z10, int i10, Rect rect) {
        if (!z10) {
            return;
        }
        int i11 = this.f3483G;
        while (true) {
            View mo3812a0 = mo3812a0(i11);
            if (mo3812a0 == null) {
                return;
            }
            if (mo3812a0.getVisibility() == 0 && mo3812a0.hasFocusable()) {
                mo3812a0.requestFocus();
                return;
            }
            i11++;
        }
    }

    /* renamed from: G4 */
    public void m2730G4() {
        int i10 = 0;
        if (m4217h0() > 0) {
            i10 = this.f3502Z.m2679m() - ((e) m4216g0(0).getLayoutParams()).m4247c();
        }
        this.f3518x = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: H */
    public boolean mo2731H() {
        boolean z10 = true;
        if (this.f3515u != 0) {
            z10 = this.f3500X > 1;
        }
        return z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: H1 */
    public void mo2732H1(RecyclerView.C0692w c0692w) {
        for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
            m4174K1(m4217h0, c0692w);
        }
    }

    /* renamed from: H2 */
    public int m2733H2() {
        return this.f3495S;
    }

    /* renamed from: H3 */
    public void m2734H3(int i10) {
        int i11;
        boolean z10 = false;
        if (this.f3515u == 0) {
            if (i10 == 1) {
                i11 = 262144;
            }
            i11 = 0;
        } else {
            if (i10 == 1) {
                i11 = 524288;
            }
            i11 = 0;
        }
        int i12 = this.f3479C;
        if ((786432 & i12) == i11) {
            return;
        }
        this.f3479C = i11 | (i12 & (-786433)) | 256;
        C0513g1.a aVar = this.f3504b0.f3426c;
        if (i10 == 1) {
            z10 = true;
        }
        aVar.m2631w(z10);
    }

    /* renamed from: H4 */
    public void m2735H4() {
        AbstractC0522l.a mo2683q;
        this.f3520z.clear();
        int m4217h0 = m4217h0();
        for (int i10 = 0; i10 < m4217h0; i10++) {
            int m4069s = this.f3514t.m3939i0(m4216g0(i10)).m4069s();
            if (m4069s >= 0 && (mo2683q = this.f3502Z.mo2683q(m4069s)) != null) {
                this.f3520z.put(m4069s, mo2683q.f3470a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: I */
    public boolean mo2736I() {
        boolean z10 = true;
        if (this.f3515u != 1) {
            z10 = this.f3500X > 1;
        }
        return z10;
    }

    /* renamed from: I2 */
    public int m2737I2() {
        return this.f3505c0.m2940a().m2982b();
    }

    /* renamed from: I3 */
    public final boolean m2738I3() {
        return this.f3502Z.m2688v();
    }

    /* renamed from: I4 */
    public final void m2739I4() {
        int i10 = this.f3479C;
        int i11 = 0;
        if (m2748L3(false)) {
            i11 = 1024;
        }
        int i12 = (i10 & (-1025)) | i11;
        this.f3479C = i12;
        if ((i12 & 1024) != 0) {
            m2865w2();
        }
    }

    /* renamed from: J2 */
    public float m2740J2() {
        return this.f3505c0.m2940a().m2983c();
    }

    /* renamed from: J3 */
    public final void m2741J3() {
        this.f3502Z.m2689w((this.f3479C & 262144) != 0 ? this.f3506d0 + this.f3507e0 + this.f3519y : (-this.f3507e0) - this.f3519y);
    }

    /* renamed from: J4 */
    public final void m2742J4() {
        this.f3504b0.f3426c.m2632x(m4169I0());
        this.f3504b0.f3425b.m2632x(m4230u0());
        this.f3504b0.f3426c.m2628t(m4226o(), m4222k());
        this.f3504b0.f3425b.m2628t(m4225n(), m4206a());
        this.f3506d0 = this.f3504b0.m2603a().m2617i();
    }

    /* renamed from: K2 */
    public int m2743K2() {
        return this.f3505c0.m2940a().m2984d();
    }

    /* renamed from: K3 */
    public final void m2744K3(boolean z10) {
        if (z10) {
            if (m2846r3()) {
                return;
            }
        } else if (m2841q3()) {
            return;
        }
        f fVar = this.f3486J;
        if (fVar == null) {
            this.f3514t.m3867A1();
            f fVar2 = new f(this, z10 ? 1 : -1, this.f3500X > 1);
            this.f3487K = 0;
            mo2803h2(fVar2);
            return;
        }
        if (z10) {
            fVar.m2905H();
        } else {
            fVar.m2904G();
        }
    }

    /* renamed from: K4 */
    public void m2745K4() {
        int m2679m;
        int m2682p;
        int m4009c;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f3517w.m4009c() == 0) {
            return;
        }
        if ((this.f3479C & 262144) == 0) {
            m2679m = this.f3502Z.m2682p();
            i10 = this.f3517w.m4009c() - 1;
            m2682p = this.f3502Z.m2679m();
            m4009c = 0;
        } else {
            m2679m = this.f3502Z.m2679m();
            m2682p = this.f3502Z.m2682p();
            m4009c = this.f3517w.m4009c() - 1;
            i10 = 0;
        }
        if (m2679m < 0 || m2682p < 0) {
            return;
        }
        boolean z10 = m2679m == i10;
        boolean z11 = m2682p == m4009c;
        if (z10 || !this.f3504b0.m2603a().m2623o() || z11 || !this.f3504b0.m2603a().m2624p()) {
            int i14 = Integer.MAX_VALUE;
            if (z10) {
                int m2677j = this.f3502Z.m2677j(true, f3476l0);
                View mo3812a0 = mo3812a0(f3476l0[1]);
                int m2788b3 = m2788b3(mo3812a0);
                int[] m2894o = ((e) mo3812a0.getLayoutParams()).m2894o();
                i14 = m2677j;
                i11 = m2788b3;
                if (m2894o != null) {
                    i14 = m2677j;
                    i11 = m2788b3;
                    if (m2894o.length > 0) {
                        i11 = m2788b3 + (m2894o[m2894o.length - 1] - m2894o[0]);
                        i14 = m2677j;
                    }
                }
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11) {
                i13 = this.f3502Z.m2678l(false, f3476l0);
                i12 = m2788b3(mo3812a0(f3476l0[1]));
            } else {
                i12 = Integer.MIN_VALUE;
                i13 = Integer.MIN_VALUE;
            }
            this.f3504b0.m2603a().m2608B(i13, i14, i12, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: L */
    public void mo2746L(int i10, int i11, RecyclerView.C0668b0 c0668b0, RecyclerView.AbstractC0685p.c cVar) {
        try {
            m2759P3(null, c0668b0);
            if (this.f3515u != 0) {
                i10 = i11;
            }
            if (m4217h0() == 0 || i10 == 0) {
                return;
            }
            this.f3502Z.mo2675f(i10 < 0 ? -this.f3507e0 : this.f3506d0 + this.f3507e0, i10, cVar);
        } finally {
            m2709A3();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r4 != 130) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r3.f3479C & 262144) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if ((r3.f3479C & 262144) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r4 != 130) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if ((r3.f3479C & org.apache.http.impl.auth.NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if ((r3.f3479C & org.apache.http.impl.auth.NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION) == 0) goto L17;
     */
    /* renamed from: L2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2747L2(int r4) {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.f3515u
            r6 = r0
            r0 = 0
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L4d
            r0 = r4
            r1 = 17
            if (r0 == r1) goto L3f
            r0 = r4
            r1 = 33
            if (r0 == r1) goto L3a
            r0 = r4
            r1 = 66
            if (r0 == r1) goto L2c
            r0 = r4
            r1 = 130(0x82, float:1.82E-43)
            if (r0 == r1) goto L27
            goto L8f
        L27:
            r0 = 3
            r5 = r0
            goto L92
        L2c:
            r0 = r3
            int r0 = r0.f3479C
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L92
            goto L6e
        L3a:
            r0 = 2
            r5 = r0
            goto L92
        L3f:
            r0 = r3
            int r0 = r0.f3479C
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L6e
            goto L92
        L4d:
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L8f
            r0 = r4
            r1 = 17
            if (r0 == r1) goto L81
            r0 = r4
            r1 = 33
            if (r0 == r1) goto L92
            r0 = r4
            r1 = 66
            if (r0 == r1) goto L73
            r0 = r4
            r1 = 130(0x82, float:1.82E-43)
            if (r0 == r1) goto L6e
            goto L8f
        L6e:
            r0 = 1
            r5 = r0
            goto L92
        L73:
            r0 = r3
            int r0 = r0.f3479C
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L3a
            goto L27
        L81:
            r0 = r3
            int r0 = r0.f3479C
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 != 0) goto L27
            goto L3a
        L8f:
            r0 = 17
            r5 = r0
        L92:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.m2747L2(int):int");
    }

    /* renamed from: L3 */
    public final boolean m2748L3(boolean z10) {
        int i10;
        int i11;
        if (this.f3492P != 0 || this.f3493Q == null) {
            return false;
        }
        AbstractC0522l abstractC0522l = this.f3502Z;
        C7931d[] m2680n = abstractC0522l == null ? null : abstractC0522l.m2680n();
        int i12 = 0;
        boolean z11 = false;
        int i13 = -1;
        while (true) {
            int i14 = i13;
            if (i12 >= this.f3500X) {
                return z11;
            }
            C7931d c7931d = m2680n == null ? null : m2680n[i12];
            int m34388g = c7931d == null ? 0 : c7931d.m34388g();
            int i15 = -1;
            for (int i16 = 0; i16 < m34388g; i16 += 2) {
                int m34385d = c7931d.m34385d(i16);
                int m34385d2 = c7931d.m34385d(i16 + 1);
                while (m34385d <= m34385d2) {
                    View mo3812a0 = mo3812a0(m34385d - this.f3518x);
                    if (mo3812a0 == null) {
                        i11 = i15;
                    } else {
                        if (z10) {
                            m2712B3(mo3812a0);
                        }
                        int m2714C2 = this.f3515u == 0 ? m2714C2(mo3812a0) : m2718D2(mo3812a0);
                        i11 = i15;
                        if (m2714C2 > i15) {
                            i11 = m2714C2;
                        }
                    }
                    m34385d++;
                    i15 = i11;
                }
            }
            int m4009c = this.f3517w.m4009c();
            int i17 = i14;
            int i18 = i15;
            if (!this.f3514t.m3957p0()) {
                i17 = i14;
                i18 = i15;
                if (z10) {
                    i17 = i14;
                    i18 = i15;
                    if (i15 < 0) {
                        i17 = i14;
                        i18 = i15;
                        if (m4009c > 0) {
                            int i19 = i14;
                            if (i14 < 0) {
                                int i20 = this.f3483G;
                                if (i20 < 0) {
                                    i10 = 0;
                                } else {
                                    i10 = i20;
                                    if (i20 >= m4009c) {
                                        i10 = m4009c - 1;
                                    }
                                }
                                int i21 = i10;
                                if (m4217h0() > 0) {
                                    int m4068r = this.f3514t.m3939i0(m4216g0(0)).m4068r();
                                    int m4068r2 = this.f3514t.m3939i0(m4216g0(m4217h0() - 1)).m4068r();
                                    i21 = i10;
                                    if (i10 >= m4068r) {
                                        i21 = i10;
                                        if (i10 <= m4068r2) {
                                            int i22 = i10 - m4068r <= m4068r2 - i10 ? m4068r - 1 : m4068r2 + 1;
                                            if (i22 >= 0 || m4068r2 >= m4009c - 1) {
                                                i21 = i22;
                                                if (i22 >= m4009c) {
                                                    i21 = i22;
                                                    if (m4068r > 0) {
                                                        i21 = m4068r - 1;
                                                    }
                                                }
                                            } else {
                                                i21 = m4068r2 + 1;
                                            }
                                        }
                                    }
                                }
                                i19 = i14;
                                if (i21 >= 0) {
                                    i19 = i14;
                                    if (i21 < m4009c) {
                                        m2715C3(i21, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.f3508f0);
                                        i19 = this.f3515u == 0 ? this.f3508f0[1] : this.f3508f0[0];
                                    }
                                }
                            }
                            i17 = i19;
                            i18 = i15;
                            if (i19 >= 0) {
                                i18 = i19;
                                i17 = i19;
                            }
                        }
                    }
                }
            }
            int i23 = i18;
            if (i18 < 0) {
                i23 = 0;
            }
            int[] iArr = this.f3493Q;
            if (iArr[i12] != i23) {
                iArr[i12] = i23;
                z11 = true;
            }
            i12++;
            i13 = i17;
        }
    }

    /* renamed from: L4 */
    public final void m2749L4() {
        C0513g1.a m2605c = this.f3504b0.m2605c();
        int m2615g = m2605c.m2615g() - this.f3490N;
        int m2773V2 = m2773V2() + m2615g;
        m2605c.m2608B(m2615g, m2773V2, m2615g, m2773V2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: M */
    public void mo2750M(int i10, RecyclerView.AbstractC0685p.c cVar) {
        int i11 = this.f3514t.f3402a1;
        if (i10 == 0 || i11 == 0) {
            return;
        }
        int max = Math.max(0, Math.min(this.f3483G - ((i11 - 1) / 2), i10 - i11));
        for (int i12 = max; i12 < i10 && i12 < max + i11; i12++) {
            cVar.mo4245a(i12, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* renamed from: M2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2751M2(android.view.View r6, int[] r7) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.m2751M2(android.view.View, int[]):boolean");
    }

    /* renamed from: M3 */
    public int m2752M3(boolean z10, int i10) {
        int i11;
        int i12;
        View view;
        int i13;
        AbstractC0522l abstractC0522l = this.f3502Z;
        if (abstractC0522l == null) {
            return i10;
        }
        int i14 = this.f3483G;
        int m2685s = i14 != -1 ? abstractC0522l.m2685s(i14) : -1;
        View view2 = null;
        int m4217h0 = m4217h0();
        int i15 = i10;
        int i16 = 0;
        int i17 = m2685s;
        while (i16 < m4217h0 && i15 != 0) {
            int i18 = i15 > 0 ? i16 : (m4217h0 - 1) - i16;
            View m4216g0 = m4216g0(i18);
            if (m2822m2(m4216g0)) {
                int m2868x2 = m2868x2(i18);
                int m2685s2 = this.f3502Z.m2685s(m2868x2);
                if (i17 == -1) {
                    i12 = m2868x2;
                    view = m4216g0;
                    i11 = m2685s2;
                    i13 = i15;
                } else {
                    i11 = i17;
                    i12 = i14;
                    view = view2;
                    i13 = i15;
                    if (m2685s2 == i17) {
                        if (i15 <= 0 || m2868x2 <= i14) {
                            i11 = i17;
                            i12 = i14;
                            view = view2;
                            i13 = i15;
                            if (i15 < 0) {
                                i11 = i17;
                                i12 = i14;
                                view = view2;
                                i13 = i15;
                                if (m2868x2 >= i14) {
                                }
                            }
                        }
                        view = m4216g0;
                        i13 = i15 > 0 ? i15 - 1 : i15 + 1;
                        i12 = m2868x2;
                        i11 = i17;
                    }
                }
            } else {
                i11 = i17;
                i12 = i14;
                view = view2;
                i13 = i15;
            }
            i16++;
            i17 = i11;
            i14 = i12;
            view2 = view;
            i15 = i13;
        }
        if (view2 != null) {
            if (z10) {
                if (m4175L0()) {
                    this.f3479C |= 32;
                    view2.requestFocus();
                    this.f3479C &= -33;
                }
                this.f3483G = i14;
                this.f3484H = 0;
            } else {
                m2776W3(view2, true);
            }
        }
        return i15;
    }

    /* renamed from: N2 */
    public final int m2753N2(View view) {
        return ((e) view.getLayoutParams()).m2899w(view);
    }

    /* renamed from: N3 */
    public final void m2754N3() {
        int i10 = this.f3479C;
        if ((65600 & i10) == 65536) {
            this.f3502Z.m2691y(this.f3483G, (i10 & 262144) != 0 ? -this.f3507e0 : this.f3506d0 + this.f3507e0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: O1 */
    public boolean mo2755O1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
        return false;
    }

    /* renamed from: O2 */
    public final int m2756O2(View view) {
        return ((e) view.getLayoutParams()).m2884A(view);
    }

    /* renamed from: O3 */
    public final void m2757O3() {
        int i10 = this.f3479C;
        if ((65600 & i10) == 65536) {
            this.f3502Z.m2692z(this.f3483G, (i10 & 262144) != 0 ? this.f3506d0 + this.f3507e0 : -this.f3507e0);
        }
    }

    /* renamed from: P2 */
    public final int m2758P2(View view) {
        return this.f3504b0.m2603a().m2616h(m2788b3(view));
    }

    /* renamed from: P3 */
    public final void m2759P3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (this.f3478B != null || this.f3517w != null) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f3478B = c0692w;
        this.f3517w = c0668b0;
        this.f3518x = 0;
        this.f3519y = 0;
    }

    /* renamed from: Q2 */
    public final int m2760Q2(int i10) {
        int i11 = this.f3492P;
        if (i11 != 0) {
            return i11;
        }
        int[] iArr = this.f3493Q;
        if (iArr == null) {
            return 0;
        }
        return iArr[i10];
    }

    /* renamed from: Q3 */
    public final int m2761Q3(int i10) {
        int i11;
        int i12 = this.f3479C;
        boolean z10 = true;
        int i13 = i10;
        if ((i12 & 64) == 0) {
            i13 = i10;
            if ((i12 & 3) != 1) {
                if (i10 > 0) {
                    i13 = i10;
                    if (!this.f3504b0.m2603a().m2623o()) {
                        int m2612d = this.f3504b0.m2603a().m2612d();
                        i13 = i10;
                        if (i10 > m2612d) {
                            i11 = m2612d;
                            i13 = i11;
                        }
                    }
                } else {
                    i13 = i10;
                    if (i10 < 0) {
                        i13 = i10;
                        if (!this.f3504b0.m2603a().m2624p()) {
                            int m2613e = this.f3504b0.m2603a().m2613e();
                            i13 = i10;
                            if (i10 < m2613e) {
                                i11 = m2613e;
                                i13 = i11;
                            }
                        }
                    }
                }
            }
        }
        if (i13 == 0) {
            return 0;
        }
        m2719D3(-i13);
        if ((this.f3479C & 3) == 1) {
            m2745K4();
            return i13;
        }
        int m4217h0 = m4217h0();
        if ((this.f3479C & 262144) == 0 ? i13 >= 0 : i13 <= 0) {
            m2817l2();
        } else {
            m2741J3();
        }
        boolean z11 = m4217h0() > m4217h0;
        int m4217h02 = m4217h0();
        if ((262144 & this.f3479C) == 0 ? i13 >= 0 : i13 <= 0) {
            m2757O3();
        } else {
            m2754N3();
        }
        if (m4217h0() >= m4217h02) {
            z10 = false;
        }
        if (z11 | z10) {
            m2739I4();
        }
        this.f3514t.invalidate();
        m2745K4();
        return i13;
    }

    /* renamed from: R2 */
    public int m2762R2(int i10) {
        int i11;
        int i12 = 0;
        if ((this.f3479C & NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION) != 0) {
            int i13 = this.f3500X - 1;
            while (true) {
                i11 = i12;
                if (i13 <= i10) {
                    break;
                }
                i12 += m2760Q2(i13) + this.f3498V;
                i13--;
            }
        } else {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                i14 += m2760Q2(i15) + this.f3498V;
            }
            i11 = i14;
        }
        return i11;
    }

    /* renamed from: R3 */
    public final int m2763R3(int i10) {
        if (i10 == 0) {
            return 0;
        }
        m2723E3(-i10);
        this.f3490N += i10;
        m2749L4();
        this.f3514t.invalidate();
        return i10;
    }

    /* renamed from: S2 */
    public boolean m2764S2(View view, View view2, int[] iArr) {
        int i10 = this.f3503a0;
        return (i10 == 1 || i10 == 2) ? m2751M2(view, iArr) : m2708A2(view, view2, iArr);
    }

    /* renamed from: S3 */
    public final void m2765S3(int i10, int i11, boolean z10) {
        if ((this.f3479C & 3) == 1) {
            m2761Q3(i10);
            m2763R3(i11);
            return;
        }
        if (this.f3515u != 0) {
            i11 = i10;
            i10 = i11;
        }
        if (z10) {
            this.f3514t.m3964r1(i10, i11);
        } else {
            this.f3514t.scrollBy(i10, i11);
            m2836p2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: T1 */
    public int mo2766T1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if ((this.f3479C & 512) == 0 || !m2850s3()) {
            return 0;
        }
        m2759P3(c0692w, c0668b0);
        this.f3479C = (this.f3479C & (-4)) | 2;
        int m2761Q3 = this.f3515u == 0 ? m2761Q3(i10) : m2763R3(i10);
        m2709A3();
        this.f3479C &= -4;
        return m2761Q3;
    }

    /* renamed from: T2 */
    public final int m2767T2(View view) {
        return this.f3504b0.m2605c().m2616h(m2791c3(view));
    }

    /* renamed from: T3 */
    public void m2768T3(int i10, int i11, boolean z10, int i12) {
        this.f3488L = i12;
        View mo3812a0 = mo3812a0(i10);
        boolean z11 = !m4189T0();
        if (!z11 || this.f3514t.isLayoutRequested() || mo3812a0 == null || m2872y2(mo3812a0) != i10) {
            int i13 = this.f3479C;
            if ((i13 & 512) == 0 || (i13 & 64) != 0) {
                this.f3483G = i10;
                this.f3484H = i11;
                this.f3487K = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
                return;
            }
            if (z10 && !this.f3514t.isLayoutRequested()) {
                this.f3483G = i10;
                this.f3484H = i11;
                this.f3487K = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
                if (!m2850s3()) {
                    Log.w(m2781Z2(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int m2720D4 = m2720D4(i10);
                if (m2720D4 != this.f3483G) {
                    this.f3483G = m2720D4;
                    this.f3484H = 0;
                    return;
                }
                return;
            }
            if (!z11) {
                m2716C4();
                this.f3514t.m3867A1();
            }
            if (this.f3514t.isLayoutRequested() || mo3812a0 == null || m2872y2(mo3812a0) != i10) {
                this.f3483G = i10;
                this.f3484H = i11;
                this.f3487K = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
                this.f3479C |= 256;
                m4184Q1();
                return;
            }
        }
        this.f3479C |= 32;
        m2776W3(mo3812a0, z10);
        this.f3479C &= -33;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: U1 */
    public void mo2769U1(int i10) {
        m2863v4(i10, 0, false, 0);
    }

    /* renamed from: U2 */
    public int m2770U2() {
        return this.f3483G;
    }

    /* renamed from: U3 */
    public final void m2771U3(View view, View view2, boolean z10) {
        m2774V3(view, view2, z10, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: V1 */
    public int mo2772V1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if ((this.f3479C & 512) == 0 || !m2850s3()) {
            return 0;
        }
        this.f3479C = (this.f3479C & (-4)) | 2;
        m2759P3(c0692w, c0668b0);
        int m2761Q3 = this.f3515u == 1 ? m2761Q3(i10) : m2763R3(i10);
        m2709A3();
        this.f3479C &= -4;
        return m2761Q3;
    }

    /* renamed from: V2 */
    public final int m2773V2() {
        int i10 = (this.f3479C & NTLMEngineImpl.FLAG_REQUEST_NTLM2_SESSION) != 0 ? 0 : this.f3500X - 1;
        return m2762R2(i10) + m2760Q2(i10);
    }

    /* renamed from: V3 */
    public final void m2774V3(View view, View view2, boolean z10, int i10, int i11) {
        if ((this.f3479C & 64) != 0) {
            return;
        }
        int m2872y2 = m2872y2(view);
        int m2777X2 = m2777X2(view, view2);
        if (m2872y2 != this.f3483G || m2777X2 != this.f3484H) {
            this.f3483G = m2872y2;
            this.f3484H = m2777X2;
            this.f3487K = 0;
            if ((this.f3479C & 3) != 1) {
                m2832o2();
            }
            if (this.f3514t.m2556F1()) {
                this.f3514t.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && this.f3514t.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f3479C & 131072) == 0 && z10) {
            return;
        }
        if (!m2764S2(view, view2, f3476l0) && i10 == 0 && i11 == 0) {
            return;
        }
        int[] iArr = f3476l0;
        m2765S3(iArr[0] + i10, iArr[1] + i11, z10);
    }

    /* renamed from: W2 */
    public int m2775W2() {
        int i10;
        int i11;
        int i12;
        if (this.f3515u == 1) {
            i10 = -m4230u0();
            i11 = i10;
            if (m4217h0() > 0) {
                int top = m4216g0(0).getTop();
                i11 = i10;
                if (top < 0) {
                    i12 = top;
                    i11 = i10 + i12;
                }
            }
        } else if ((this.f3479C & 262144) != 0) {
            int m4169I0 = m4169I0();
            i11 = m4169I0;
            if (m4217h0() > 0) {
                int right = m4216g0(0).getRight();
                i11 = m4169I0;
                if (right > m4169I0) {
                    i11 = right;
                }
            }
        } else {
            i10 = -m4169I0();
            i11 = i10;
            if (m4217h0() > 0) {
                int left = m4216g0(0).getLeft();
                i11 = i10;
                if (left < 0) {
                    i12 = left;
                    i11 = i10 + i12;
                }
            }
        }
        return i11;
    }

    /* renamed from: W3 */
    public void m2776W3(View view, boolean z10) {
        m2771U3(view, view == null ? null : view.findFocus(), z10);
    }

    /* renamed from: X2 */
    public int m2777X2(View view, View view2) {
        C0538s m2897s;
        if (view == null || view2 == null || (m2897s = ((e) view.getLayoutParams()).m2897s()) == null) {
            return 0;
        }
        C0538s.a[] m2980a = m2897s.m2980a();
        if (m2980a.length <= 1) {
            return 0;
        }
        while (view2 != view) {
            int id2 = view2.getId();
            if (id2 != -1) {
                for (int i10 = 1; i10 < m2980a.length; i10++) {
                    if (m2980a[i10].m2981a() == id2) {
                        return i10;
                    }
                }
            }
            view2 = (View) view2.getParent();
        }
        return 0;
    }

    /* renamed from: X3 */
    public void m2778X3(View view, boolean z10, int i10, int i11) {
        m2774V3(view, view == null ? null : view.findFocus(), z10, i10, i11);
    }

    /* renamed from: Y2 */
    public int m2779Y2() {
        return this.f3484H;
    }

    /* renamed from: Y3 */
    public void m2780Y3(int i10) {
        this.f3489M = i10;
        if (i10 != -1) {
            int m4217h0 = m4217h0();
            for (int i11 = 0; i11 < m4217h0; i11++) {
                m4216g0(i11).setVisibility(this.f3489M);
            }
        }
    }

    /* renamed from: Z2 */
    public String m2781Z2() {
        return "GridLayoutManager:" + this.f3514t.getId();
    }

    /* renamed from: Z3 */
    public void m2782Z3(int i10) {
        int i11 = this.f3507e0;
        if (i11 == i10) {
            return;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        this.f3507e0 = i10;
        m4184Q1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: a1 */
    public void mo2783a1(RecyclerView.AbstractC0677h abstractC0677h, RecyclerView.AbstractC0677h abstractC0677h2) {
        if (abstractC0677h != null) {
            m2827n2();
            this.f3483G = -1;
            this.f3487K = 0;
            this.f3509g0.m2586b();
        }
        this.f3510h0 = abstractC0677h2 instanceof InterfaceC0508f ? (InterfaceC0508f) abstractC0677h2 : null;
        super.mo2783a1(abstractC0677h, abstractC0677h2);
    }

    /* renamed from: a3 */
    public int m2784a3() {
        return this.f3496T;
    }

    /* renamed from: a4 */
    public void m2785a4(boolean z10, boolean z11) {
        int i10 = this.f3479C;
        int i11 = 0;
        int i12 = z10 ? 2048 : 0;
        if (z11) {
            i11 = 4096;
        }
        this.f3479C = i12 | (i10 & (-6145)) | i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: b0 */
    public RecyclerView.C0686q mo2786b0() {
        return new e(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: b1 */
    public boolean mo2787b1(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
        int i12;
        if ((this.f3479C & 32768) != 0) {
            return true;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            if (this.f3503a0 != 0) {
                int m2615g = this.f3504b0.m2603a().m2615g();
                int m2611c = this.f3504b0.m2603a().m2611c();
                int m4217h0 = m4217h0();
                for (int i13 = 0; i13 < m4217h0; i13++) {
                    View m4216g0 = m4216g0(i13);
                    if (m4216g0.getVisibility() == 0 && m2804h3(m4216g0) >= m2615g && m2801g3(m4216g0) <= m2611c + m2615g) {
                        m4216g0.addFocusables(arrayList, i10, i11);
                    }
                }
                if (arrayList.size() == size) {
                    int m4217h02 = m4217h0();
                    for (int i14 = 0; i14 < m4217h02; i14++) {
                        View m4216g02 = m4216g0(i14);
                        if (m4216g02.getVisibility() == 0) {
                            m4216g02.addFocusables(arrayList, i10, i11);
                        }
                    }
                }
            } else {
                View mo3812a0 = mo3812a0(this.f3483G);
                if (mo3812a0 != null) {
                    mo3812a0.addFocusables(arrayList, i10, i11);
                }
            }
            if (arrayList.size() != size || !recyclerView.isFocusable()) {
                return true;
            }
            arrayList.add(recyclerView);
            return true;
        }
        if (this.f3486J != null) {
            return true;
        }
        int m2747L2 = m2747L2(i10);
        int m2849s2 = m2849s2(recyclerView.findFocus());
        int m2868x2 = m2868x2(m2849s2);
        View mo3812a02 = m2868x2 == -1 ? null : mo3812a0(m2868x2);
        if (mo3812a02 != null) {
            mo3812a02.addFocusables(arrayList, i10, i11);
        }
        if (this.f3502Z == null || m4217h0() == 0) {
            return true;
        }
        if ((m2747L2 == 3 || m2747L2 == 2) && this.f3502Z.m2684r() <= 1) {
            return true;
        }
        AbstractC0522l abstractC0522l = this.f3502Z;
        int i15 = (abstractC0522l == null || mo3812a02 == null) ? -1 : abstractC0522l.mo2683q(m2868x2).f3470a;
        int size2 = arrayList.size();
        int i16 = (m2747L2 == 1 || m2747L2 == 3) ? 1 : -1;
        int m4217h03 = i16 > 0 ? m4217h0() - 1 : 0;
        int m4217h04 = m2849s2 == -1 ? i16 > 0 ? 0 : m4217h0() - 1 : m2849s2 + i16;
        while (true) {
            int i17 = m4217h04;
            if (i16 > 0) {
                if (i17 > m4217h03) {
                    return true;
                }
            } else if (i17 < m4217h03) {
                return true;
            }
            View m4216g03 = m4216g0(i17);
            if (m4216g03.getVisibility() == 0 && m4216g03.hasFocusable()) {
                if (mo3812a02 == null) {
                    m4216g03.addFocusables(arrayList, i10, i11);
                    if (arrayList.size() > size2) {
                        return true;
                    }
                } else {
                    int m2868x22 = m2868x2(i17);
                    AbstractC0522l.a mo2683q = this.f3502Z.mo2683q(m2868x22);
                    if (mo2683q == null) {
                        continue;
                    } else if (m2747L2 == 1) {
                        if (mo2683q.f3470a == i15 && m2868x22 > m2868x2) {
                            m4216g03.addFocusables(arrayList, i10, i11);
                            if (arrayList.size() > size2) {
                                return true;
                            }
                        }
                    } else if (m2747L2 == 0) {
                        if (mo2683q.f3470a == i15 && m2868x22 < m2868x2) {
                            m4216g03.addFocusables(arrayList, i10, i11);
                            if (arrayList.size() > size2) {
                                return true;
                            }
                        }
                    } else if (m2747L2 == 3) {
                        int i18 = mo2683q.f3470a;
                        if (i18 == i15) {
                            continue;
                        } else {
                            if (i18 < i15) {
                                return true;
                            }
                            m4216g03.addFocusables(arrayList, i10, i11);
                        }
                    } else if (m2747L2 == 2 && (i12 = mo2683q.f3470a) != i15) {
                        if (i12 > i15) {
                            return true;
                        }
                        m4216g03.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            m4217h04 = i17 + i16;
        }
    }

    /* renamed from: b3 */
    public final int m2788b3(View view) {
        return this.f3515u == 0 ? m2794d3(view) : m2796e3(view);
    }

    /* renamed from: b4 */
    public void m2789b4(boolean z10, boolean z11) {
        int i10 = this.f3479C;
        int i11 = 0;
        int i12 = z10 ? 8192 : 0;
        if (z11) {
            i11 = 16384;
        }
        this.f3479C = i12 | (i10 & (-24577)) | i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: c0 */
    public RecyclerView.C0686q mo2790c0(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    /* renamed from: c3 */
    public final int m2791c3(View view) {
        return this.f3515u == 0 ? m2796e3(view) : m2794d3(view);
    }

    /* renamed from: c4 */
    public void m2792c4(int i10) {
        this.f3503a0 = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: d0 */
    public RecyclerView.C0686q mo2793d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof RecyclerView.C0686q ? new e((RecyclerView.C0686q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    /* renamed from: d3 */
    public final int m2794d3(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.m2899w(view) + eVar.m2895p();
    }

    /* renamed from: d4 */
    public void m2795d4(boolean z10) {
        this.f3479C = (z10 ? 32768 : 0) | (this.f3479C & (-32769));
    }

    /* renamed from: e3 */
    public final int m2796e3(View view) {
        e eVar = (e) view.getLayoutParams();
        return eVar.m2886C(view) + eVar.m2896r();
    }

    /* renamed from: e4 */
    public void m2797e4(int i10) {
        this.f3499W = i10;
    }

    /* renamed from: f3 */
    public View m2798f3(int i10) {
        return this.f3478B.m4300o(i10);
    }

    /* renamed from: f4 */
    public void m2799f4(int i10) {
        int i11 = this.f3515u;
        this.f3495S = i10;
        if (i11 == 0) {
            this.f3497U = i10;
        } else {
            this.f3498V = i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: g2 */
    public void mo2800g2(RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0, int i10) {
        m2863v4(i10, 0, true, 0);
    }

    /* renamed from: g3 */
    public int m2801g3(View view) {
        return this.f3516v.mo4614d(view);
    }

    /* renamed from: g4 */
    public void m2802g4(int i10) {
        this.f3505c0.m2940a().m2986f(i10);
        m2724E4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: h2 */
    public void mo2803h2(RecyclerView.AbstractC0666a0 abstractC0666a0) {
        m2716C4();
        super.mo2803h2(abstractC0666a0);
        if (abstractC0666a0.m3993h() && (abstractC0666a0 instanceof d)) {
            d dVar = (d) abstractC0666a0;
            this.f3485I = dVar;
            if (dVar instanceof f) {
                this.f3486J = (f) dVar;
                return;
            }
        } else {
            this.f3485I = null;
        }
        this.f3486J = null;
    }

    /* renamed from: h3 */
    public int m2804h3(View view) {
        return this.f3516v.mo4617g(view);
    }

    /* renamed from: h4 */
    public void m2805h4(float f10) {
        this.f3505c0.m2940a().m2987g(f10);
        m2724E4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: i1 */
    public void mo2806i1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, C7535k c7535k) {
        m2759P3(c0692w, c0668b0);
        int m4009c = c0668b0.m4009c();
        boolean z10 = (this.f3479C & 262144) != 0;
        if (m4009c > 1 && !m2862v3(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                c7535k.m32204b(this.f3515u == 0 ? z10 ? C7535k.a.f36328F : C7535k.a.f36326D : C7535k.a.f36325C);
            } else {
                c7535k.m32202a(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            }
            c7535k.m32231p0(true);
        }
        if (m4009c > 1 && !m2862v3(m4009c - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                c7535k.m32204b(this.f3515u == 0 ? z10 ? C7535k.a.f36326D : C7535k.a.f36328F : C7535k.a.f36327E);
            } else {
                c7535k.m32202a(4096);
            }
            c7535k.m32231p0(true);
        }
        c7535k.m32201Z(C7535k.b.m32253a(mo2721E0(c0692w, c0668b0), mo2815l0(c0692w, c0668b0), m4183Q0(c0692w, c0668b0), m4163F0(c0692w, c0668b0)));
        m2709A3();
    }

    /* renamed from: i3 */
    public int m2807i3(View view) {
        Rect rect = f3475k0;
        mo2825n0(view, rect);
        return this.f3515u == 0 ? rect.width() : rect.height();
    }

    /* renamed from: i4 */
    public void m2808i4(boolean z10) {
        this.f3505c0.m2940a().m2988h(z10);
        m2724E4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: j2 */
    public boolean mo2809j2() {
        return true;
    }

    /* renamed from: j3 */
    public void m2810j3(View view, int[] iArr) {
        if (this.f3515u == 0) {
            iArr[0] = m2758P2(view);
            iArr[1] = m2767T2(view);
        } else {
            iArr[1] = m2758P2(view);
            iArr[0] = m2767T2(view);
        }
    }

    /* renamed from: j4 */
    public void m2811j4(int i10) {
        this.f3505c0.m2940a().m2989i(i10);
        m2724E4();
    }

    /* renamed from: k2 */
    public final boolean m2812k2() {
        return this.f3502Z.m2670a();
    }

    /* renamed from: k3 */
    public int m2813k3() {
        return this.f3504b0.m2603a().m2618j();
    }

    /* renamed from: k4 */
    public void m2814k4(int i10) {
        this.f3495S = i10;
        this.f3496T = i10;
        this.f3498V = i10;
        this.f3497U = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: l0 */
    public int mo2815l0(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        AbstractC0522l abstractC0522l;
        return (this.f3515u != 1 || (abstractC0522l = this.f3502Z) == null) ? super.mo2815l0(c0692w, c0668b0) : abstractC0522l.m2684r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: l1 */
    public void mo2816l1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, View view, C7535k c7535k) {
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f3502Z == null || !(layoutParams instanceof e)) {
            return;
        }
        int m4246b = ((e) layoutParams).m4246b();
        int m2685s = m4246b >= 0 ? this.f3502Z.m2685s(m4246b) : -1;
        if (m2685s < 0) {
            return;
        }
        int m2684r = m4246b / this.f3502Z.m2684r();
        if (this.f3515u == 0) {
            i10 = m2685s;
            m2685s = m2684r;
        } else {
            i10 = m2684r;
        }
        c7535k.m32203a0(C7535k.c.m32254a(i10, 1, m2685s, 1, false, false));
    }

    /* renamed from: l2 */
    public final void m2817l2() {
        this.f3502Z.m2671b((this.f3479C & 262144) != 0 ? (-this.f3507e0) - this.f3519y : this.f3506d0 + this.f3507e0 + this.f3519y);
    }

    /* renamed from: l3 */
    public int m2818l3() {
        return this.f3504b0.m2603a().m2619k();
    }

    /* renamed from: l4 */
    public void m2819l4(boolean z10) {
        int i10 = this.f3479C;
        int i11 = 0;
        if (((i10 & 512) != 0) != z10) {
            if (z10) {
                i11 = 512;
            }
            this.f3479C = (i10 & (-513)) | i11;
            m4184Q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: m0 */
    public int mo2820m0(View view) {
        return super.mo2820m0(view) - ((e) view.getLayoutParams()).f3529i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x015e, code lost:
    
        if ((r5.f3479C & 16384) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017e, code lost:
    
        if ((r5.f3479C & org.apache.http.impl.auth.NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: m1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo2821m1(android.view.View r6, int r7) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.mo2821m1(android.view.View, int):android.view.View");
    }

    /* renamed from: m2 */
    public boolean m2822m2(View view) {
        return view.getVisibility() == 0 && (!m4175L0() || view.hasFocusable());
    }

    /* renamed from: m3 */
    public float m2823m3() {
        return this.f3504b0.m2603a().m2620l();
    }

    /* renamed from: m4 */
    public void m2824m4(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        this.f3501Y = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: n0 */
    public void mo2825n0(View view, Rect rect) {
        super.mo2825n0(view, rect);
        e eVar = (e) view.getLayoutParams();
        rect.left += eVar.f3526f;
        rect.top += eVar.f3527g;
        rect.right -= eVar.f3528h;
        rect.bottom -= eVar.f3529i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: n1 */
    public void mo2826n1(RecyclerView recyclerView, int i10, int i11) {
        AbstractC0522l abstractC0522l;
        int i12;
        if (this.f3483G != -1 && (abstractC0522l = this.f3502Z) != null && abstractC0522l.m2679m() >= 0 && (i12 = this.f3487K) != Integer.MIN_VALUE && i10 <= this.f3483G + i12) {
            this.f3487K = i12 + i11;
        }
        this.f3509g0.m2586b();
    }

    /* renamed from: n2 */
    public final void m2827n2() {
        this.f3502Z = null;
        this.f3493Q = null;
        this.f3479C &= -1025;
    }

    /* renamed from: n3 */
    public boolean m2828n3(RecyclerView recyclerView, int i10, Rect rect) {
        int i11 = this.f3503a0;
        return (i11 == 1 || i11 == 2) ? m2837p3(recyclerView, i10, rect) : m2833o3(recyclerView, i10, rect);
    }

    /* renamed from: n4 */
    public void m2829n4(InterfaceC0497b0 interfaceC0497b0) {
        this.f3482F = interfaceC0497b0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: o0 */
    public int mo2830o0(View view) {
        return super.mo2830o0(view) + ((e) view.getLayoutParams()).f3526f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: o1 */
    public void mo2831o1(RecyclerView recyclerView) {
        this.f3487K = 0;
        this.f3509g0.m2586b();
    }

    /* renamed from: o2 */
    public void m2832o2() {
        if (this.f3480D != null || m2854t3()) {
            int i10 = this.f3483G;
            View mo3812a0 = i10 == -1 ? null : mo3812a0(i10);
            if (mo3812a0 != null) {
                RecyclerView.AbstractC0674e0 m3939i0 = this.f3514t.m3939i0(mo3812a0);
                InterfaceC0500c0 interfaceC0500c0 = this.f3480D;
                if (interfaceC0500c0 != null) {
                    interfaceC0500c0.mo2570a(this.f3514t, mo3812a0, this.f3483G, m3939i0 == null ? -1L : m3939i0.m4066p());
                }
                m2853t2(this.f3514t, m3939i0, this.f3483G, this.f3484H);
            } else {
                InterfaceC0500c0 interfaceC0500c02 = this.f3480D;
                if (interfaceC0500c02 != null) {
                    interfaceC0500c02.mo2570a(this.f3514t, null, -1, -1L);
                }
                m2853t2(this.f3514t, null, -1, 0);
            }
            if ((this.f3479C & 3) == 1 || this.f3514t.isLayoutRequested()) {
                return;
            }
            int m4217h0 = m4217h0();
            for (int i11 = 0; i11 < m4217h0; i11++) {
                if (m4216g0(i11).isLayoutRequested()) {
                    m2865w2();
                    return;
                }
            }
        }
    }

    /* renamed from: o3 */
    public final boolean m2833o3(RecyclerView recyclerView, int i10, Rect rect) {
        View mo3812a0 = mo3812a0(this.f3483G);
        if (mo3812a0 != null) {
            return mo3812a0.requestFocus(i10, rect);
        }
        return false;
    }

    /* renamed from: o4 */
    public void m2834o4(InterfaceC0500c0 interfaceC0500c0) {
        this.f3480D = interfaceC0500c0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: p1 */
    public void mo2835p1(RecyclerView recyclerView, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = this.f3483G;
        if (i15 != -1 && (i13 = this.f3487K) != Integer.MIN_VALUE) {
            int i16 = i15 + i13;
            if (i10 <= i16 && i16 < i10 + i12) {
                i14 = i13 + (i11 - i10);
            } else if (i10 < i16 && i11 > i16 - i12) {
                i14 = i13 - i12;
            } else if (i10 > i16 && i11 < i16) {
                i14 = i13 + i12;
            }
            this.f3487K = i14;
        }
        this.f3509g0.m2586b();
    }

    /* renamed from: p2 */
    public void m2836p2() {
        if (m2854t3()) {
            int i10 = this.f3483G;
            View mo3812a0 = i10 == -1 ? null : mo3812a0(i10);
            if (mo3812a0 != null) {
                m2857u2(this.f3514t, this.f3514t.m3939i0(mo3812a0), this.f3483G, this.f3484H);
                return;
            }
            InterfaceC0500c0 interfaceC0500c0 = this.f3480D;
            if (interfaceC0500c0 != null) {
                interfaceC0500c0.mo2570a(this.f3514t, null, -1, -1L);
            }
            m2857u2(this.f3514t, null, -1, 0);
        }
    }

    /* renamed from: p3 */
    public final boolean m2837p3(RecyclerView recyclerView, int i10, Rect rect) {
        int i11;
        int i12;
        int m4217h0 = m4217h0();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = m4217h0;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = m4217h0 - 1;
            i12 = -1;
        }
        int m2615g = this.f3504b0.m2603a().m2615g();
        int m2611c = this.f3504b0.m2603a().m2611c();
        while (i11 != i13) {
            View m4216g0 = m4216g0(i11);
            if (m4216g0.getVisibility() == 0 && m2804h3(m4216g0) >= m2615g && m2801g3(m4216g0) <= m2611c + m2615g && m4216g0.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    /* renamed from: p4 */
    public void m2838p4(AbstractC0503d0 abstractC0503d0) {
        if (abstractC0503d0 == null) {
            this.f3481E = null;
            return;
        }
        ArrayList<AbstractC0503d0> arrayList = this.f3481E;
        if (arrayList == null) {
            this.f3481E = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.f3481E.add(abstractC0503d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: q1 */
    public void mo2839q1(RecyclerView recyclerView, int i10, int i11) {
        AbstractC0522l abstractC0522l;
        int i12;
        int i13;
        int i14;
        if (this.f3483G != -1 && (abstractC0522l = this.f3502Z) != null && abstractC0522l.m2679m() >= 0 && (i12 = this.f3487K) != Integer.MIN_VALUE && i10 <= (i14 = (i13 = this.f3483G) + i12)) {
            if (i10 + i11 > i14) {
                this.f3483G = i13 + i12 + (i10 - i14);
                this.f3487K = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            } else {
                this.f3487K = i12 - i11;
            }
        }
        this.f3509g0.m2586b();
    }

    /* renamed from: q2 */
    public final void m2840q2() {
        boolean z10;
        AbstractC0522l.a mo2683q;
        int m4217h0 = m4217h0();
        int m2679m = this.f3502Z.m2679m();
        this.f3479C &= -9;
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= m4217h0) {
                break;
            }
            View m4216g0 = m4216g0(i10);
            if (m2679m != m2872y2(m4216g0) || (mo2683q = this.f3502Z.mo2683q(m2679m)) == null) {
                break;
            }
            int m2762R2 = m2762R2(mo2683q.f3470a);
            int m2615g = this.f3504b0.m2605c().m2615g();
            int i11 = this.f3490N;
            int m2804h3 = m2804h3(m4216g0);
            int m2807i3 = m2807i3(m4216g0);
            View view = m4216g0;
            if (((e) m4216g0.getLayoutParams()).m4251m()) {
                this.f3479C |= 8;
                m4190U(m4216g0, this.f3478B);
                view = m2798f3(m2679m);
                m4154B(view, i10);
            }
            m2712B3(view);
            int m2718D2 = this.f3515u == 0 ? m2718D2(view) : m2714C2(view);
            m2873y3(mo2683q.f3470a, view, m2804h3, m2804h3 + m2718D2, (m2762R2 + m2615g) - i11);
            if (m2807i3 != m2718D2) {
                break;
            }
            i10++;
            m2679m++;
        }
        z10 = true;
        if (z10) {
            int m2682p = this.f3502Z.m2682p();
            for (int i12 = m4217h0 - 1; i12 >= i10; i12--) {
                m4190U(m4216g0(i12), this.f3478B);
            }
            this.f3502Z.mo2686t(m2679m);
            if ((this.f3479C & 65536) != 0) {
                m2817l2();
                int i13 = this.f3483G;
                if (i13 >= 0 && i13 <= m2682p) {
                    while (this.f3502Z.m2682p() < this.f3483G) {
                        this.f3502Z.m2670a();
                    }
                }
            } else {
                while (this.f3502Z.m2670a() && this.f3502Z.m2682p() < m2682p) {
                }
            }
        }
        m2745K4();
        m2749L4();
    }

    /* renamed from: q3 */
    public boolean m2841q3() {
        boolean z10 = false;
        if (m4233w0() == 0 || this.f3514t.m3917Z(0) != null) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: q4 */
    public void m2842q4(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f3515u = i10;
            this.f3516v = AbstractC0713l.m4612b(this, i10);
            this.f3504b0.m2606d(i10);
            this.f3505c0.m2941b(i10);
            this.f3479C |= 256;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: r0 */
    public int mo2843r0(View view) {
        return super.mo2843r0(view) - ((e) view.getLayoutParams()).f3528h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: r1 */
    public void mo2844r1(RecyclerView recyclerView, int i10, int i11) {
        for (int i12 = i10; i12 < i11 + i10; i12++) {
            this.f3509g0.m2591h(i12);
        }
    }

    /* renamed from: r2 */
    public void m2845r2() {
        int i10;
        int i11;
        List<RecyclerView.AbstractC0674e0> m4296k = this.f3478B.m4296k();
        int size = m4296k.size();
        if (size == 0) {
            return;
        }
        int[] iArr = this.f3477A;
        if (iArr == null || size > iArr.length) {
            int length = iArr == null ? 16 : iArr.length;
            while (true) {
                i10 = length;
                if (i10 >= size) {
                    break;
                } else {
                    length = i10 << 1;
                }
            }
            this.f3477A = new int[i10];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = i13;
            if (i12 >= size) {
                break;
            }
            int m4064n = m4296k.get(i12).m4064n();
            int i14 = i11;
            if (m4064n >= 0) {
                this.f3477A[i11] = m4064n;
                i14 = i11 + 1;
            }
            i12++;
            i13 = i14;
        }
        if (i11 > 0) {
            Arrays.sort(this.f3477A, 0, i11);
            this.f3502Z.m2676h(this.f3477A, i11, this.f3520z);
        }
        this.f3520z.clear();
    }

    /* renamed from: r3 */
    public boolean m2846r3() {
        int m4233w0 = m4233w0();
        boolean z10 = true;
        if (m4233w0 != 0) {
            z10 = this.f3514t.m3917Z(m4233w0 - 1) != null;
        }
        return z10;
    }

    /* renamed from: r4 */
    public void m2847r4(boolean z10) {
        int i10 = this.f3479C;
        int i11 = 65536;
        if (((i10 & 65536) != 0) != z10) {
            if (!z10) {
                i11 = 0;
            }
            this.f3479C = (i10 & (-65537)) | i11;
            if (z10) {
                m4184Q1();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: s0 */
    public int mo2848s0(View view) {
        return super.mo2848s0(view) + ((e) view.getLayoutParams()).f3527g;
    }

    /* renamed from: s2 */
    public final int m2849s2(View view) {
        View m4203Z;
        AbstractC0496b abstractC0496b = this.f3514t;
        if (abstractC0496b == null || view == abstractC0496b || (m4203Z = m4203Z(view)) == null) {
            return -1;
        }
        int m4217h0 = m4217h0();
        for (int i10 = 0; i10 < m4217h0; i10++) {
            if (m4216g0(i10) == m4203Z) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: s3 */
    public boolean m2850s3() {
        return this.f3502Z != null;
    }

    /* renamed from: s4 */
    public void m2851s4(int i10) {
        if (i10 >= 0 || i10 == -2) {
            this.f3491O = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028d, code lost:
    
        if (r0 < r9) goto L93;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2852t1(androidx.recyclerview.widget.RecyclerView.C0692w r7, androidx.recyclerview.widget.RecyclerView.C0668b0 r8) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.mo2852t1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    /* renamed from: t2 */
    public void m2853t2(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11) {
        ArrayList<AbstractC0503d0> arrayList = this.f3481E;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.f3481E.get(size).mo2417a(recyclerView, abstractC0674e0, i10, i11);
        }
    }

    /* renamed from: t3 */
    public boolean m2854t3() {
        ArrayList<AbstractC0503d0> arrayList = this.f3481E;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: t4 */
    public void m2855t4(boolean z10) {
        int i10;
        int i11 = this.f3479C;
        int i12 = 0;
        if (((i11 & 131072) != 0) != z10) {
            if (z10) {
                i12 = 131072;
            }
            int i13 = (i11 & (-131073)) | i12;
            this.f3479C = i13;
            if ((i13 & 131072) == 0 || this.f3503a0 != 0 || (i10 = this.f3483G) == -1) {
                return;
            }
            m2768T3(i10, this.f3484H, true, this.f3488L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: u1 */
    public void mo2856u1(RecyclerView.C0668b0 c0668b0) {
    }

    /* renamed from: u2 */
    public void m2857u2(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11) {
        ArrayList<AbstractC0503d0> arrayList = this.f3481E;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            this.f3481E.get(size).m2580b(recyclerView, abstractC0674e0, i10, i11);
        }
    }

    /* renamed from: u3 */
    public final void m2858u3() {
        this.f3504b0.m2604b();
        this.f3504b0.f3426c.m2632x(m4169I0());
        this.f3504b0.f3425b.m2632x(m4230u0());
        this.f3504b0.f3426c.m2628t(m4226o(), m4222k());
        this.f3504b0.f3425b.m2628t(m4225n(), m4206a());
        this.f3506d0 = this.f3504b0.m2603a().m2617i();
        this.f3490N = 0;
    }

    /* renamed from: u4 */
    public void m2859u4(int i10, int i11) {
        m2863v4(i10, 0, false, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2860v1(androidx.recyclerview.widget.RecyclerView.C0692w r6, androidx.recyclerview.widget.RecyclerView.C0668b0 r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.mo2860v1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, int):void");
    }

    /* renamed from: v2 */
    public final void m2861v2(boolean z10, boolean z11, int i10, int i11) {
        View mo3812a0 = mo3812a0(this.f3483G);
        if (mo3812a0 != null && z11) {
            m2778X3(mo3812a0, false, i10, i11);
        }
        if (mo3812a0 != null && z10 && !mo3812a0.hasFocus()) {
            mo3812a0.requestFocus();
            return;
        }
        if (z10 || this.f3514t.hasFocus()) {
            return;
        }
        if (mo3812a0 == null || !mo3812a0.hasFocusable()) {
            int m4217h0 = m4217h0();
            for (int i12 = 0; i12 < m4217h0; i12++) {
                mo3812a0 = m4216g0(i12);
                if (mo3812a0 == null || !mo3812a0.hasFocusable()) {
                }
            }
            if (z11 || mo3812a0 == null || !mo3812a0.hasFocus()) {
                return;
            }
            m2778X3(mo3812a0, false, i10, i11);
            return;
        }
        this.f3514t.focusableViewAvailable(mo3812a0);
        if (z11) {
        }
    }

    /* renamed from: v3 */
    public boolean m2862v3(int i10) {
        RecyclerView.AbstractC0674e0 m3917Z = this.f3514t.m3917Z(i10);
        if (m3917Z == null) {
            return false;
        }
        boolean z10 = false;
        if (m3917Z.f4620a.getLeft() >= 0) {
            z10 = false;
            if (m3917Z.f4620a.getRight() <= this.f3514t.getWidth()) {
                z10 = false;
                if (m3917Z.f4620a.getTop() >= 0) {
                    z10 = false;
                    if (m3917Z.f4620a.getBottom() <= this.f3514t.getHeight()) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: v4 */
    public void m2863v4(int i10, int i11, boolean z10, int i12) {
        if ((this.f3483G == i10 || i10 == -1) && i11 == this.f3484H && i12 == this.f3488L) {
            return;
        }
        m2768T3(i10, i11, z10, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: w1 */
    public boolean mo2864w1(RecyclerView recyclerView, View view, View view2) {
        if ((this.f3479C & 32768) != 0 || m2872y2(view) == -1 || (this.f3479C & 35) != 0) {
            return true;
        }
        m2771U3(view, view2, true);
        return true;
    }

    /* renamed from: w2 */
    public final void m2865w2() {
        C6824g0.m31523h0(this.f3514t, this.f3511i0);
    }

    /* renamed from: w3 */
    public boolean m2866w3() {
        return (this.f3479C & 131072) != 0;
    }

    /* renamed from: w4 */
    public void m2867w4(int i10) {
        m2863v4(i10, 0, true, 0);
    }

    /* renamed from: x2 */
    public final int m2868x2(int i10) {
        return m2872y2(m4216g0(i10));
    }

    /* renamed from: x3 */
    public boolean m2869x3() {
        return (this.f3479C & 64) != 0;
    }

    /* renamed from: x4 */
    public void m2870x4(int i10, int i11, int i12) {
        m2863v4(i10, i11, false, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: y1 */
    public void mo2871y1(Parcelable parcelable) {
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            this.f3483G = gVar.f3537b;
            this.f3487K = 0;
            this.f3509g0.m2589f(gVar.f3538c);
            this.f3479C |= 256;
            m4184Q1();
        }
    }

    /* renamed from: y2 */
    public final int m2872y2(View view) {
        e eVar;
        if (view == null || (eVar = (e) view.getLayoutParams()) == null || eVar.m4249k()) {
            return -1;
        }
        return eVar.m4246b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (r0 != 48) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (r15 == 1) goto L40;
     */
    /* renamed from: y3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2873y3(int r8, android.view.View r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.m2873y3(int, android.view.View, int, int, int):void");
    }

    /* renamed from: y4 */
    public void m2874y4(int i10) {
        int i11 = this.f3515u;
        this.f3496T = i10;
        if (i11 == 1) {
            this.f3497U = i10;
        } else {
            this.f3498V = i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: z1 */
    public Parcelable mo2875z1() {
        g gVar = new g();
        gVar.f3537b = m2770U2();
        Bundle m2592i = this.f3509g0.m2592i();
        int m4217h0 = m4217h0();
        int i10 = 0;
        while (i10 < m4217h0) {
            View m4216g0 = m4216g0(i10);
            int m2872y2 = m2872y2(m4216g0);
            Bundle bundle = m2592i;
            if (m2872y2 != -1) {
                bundle = this.f3509g0.m2594k(m2592i, m4216g0, m2872y2);
            }
            i10++;
            m2592i = bundle;
        }
        gVar.f3538c = m2592i;
        return gVar;
    }

    /* renamed from: z2 */
    public final int m2876z2(int i10, View view, View view2) {
        int m2777X2 = m2777X2(view, view2);
        int i11 = i10;
        if (m2777X2 != 0) {
            e eVar = (e) view.getLayoutParams();
            i11 = i10 + (eVar.m2894o()[m2777X2] - eVar.m2894o()[0]);
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (((r4.f3479C & 262144) == 0) == r4.f3502Z.m2687u()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* renamed from: z3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2877z3() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0524m.m2877z3():boolean");
    }

    /* renamed from: z4 */
    public void m2878z4(int i10) {
        this.f3504b0.m2603a().m2633y(i10);
    }
}
