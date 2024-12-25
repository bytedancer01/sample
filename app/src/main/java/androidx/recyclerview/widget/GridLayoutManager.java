package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p261p0.C7535k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/GridLayoutManager.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/GridLayoutManager.class */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    public boolean f4434I;

    /* renamed from: J */
    public int f4435J;

    /* renamed from: K */
    public int[] f4436K;

    /* renamed from: L */
    public View[] f4437L;

    /* renamed from: M */
    public final SparseIntArray f4438M;

    /* renamed from: N */
    public final SparseIntArray f4439N;

    /* renamed from: O */
    public AbstractC0660c f4440O;

    /* renamed from: P */
    public final Rect f4441P;

    /* renamed from: Q */
    public boolean f4442Q;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/GridLayoutManager$a.class
     */
    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/GridLayoutManager$a.class */
    public static final class C0658a extends AbstractC0660c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0660c
        /* renamed from: e */
        public int mo3776e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0660c
        /* renamed from: f */
        public int mo3777f(int i10) {
            return 1;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/GridLayoutManager$b.class
     */
    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/GridLayoutManager$b.class */
    public static class C0659b extends RecyclerView.C0686q {

        /* renamed from: f */
        public int f4443f;

        /* renamed from: g */
        public int f4444g;

        public C0659b(int i10, int i11) {
            super(i10, i11);
            this.f4443f = -1;
            this.f4444g = 0;
        }

        public C0659b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4443f = -1;
            this.f4444g = 0;
        }

        public C0659b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4443f = -1;
            this.f4444g = 0;
        }

        public C0659b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4443f = -1;
            this.f4444g = 0;
        }

        /* renamed from: n */
        public int m3778n() {
            return this.f4443f;
        }

        /* renamed from: o */
        public int m3779o() {
            return this.f4444g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/GridLayoutManager$c.class
     */
    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/GridLayoutManager$c.class */
    public static abstract class AbstractC0660c {

        /* renamed from: a */
        public final SparseIntArray f4445a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f4446b = new SparseIntArray();

        /* renamed from: c */
        public boolean f4447c = false;

        /* renamed from: d */
        public boolean f4448d = false;

        /* renamed from: a */
        public static int m3780a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* renamed from: b */
        public int m3781b(int i10, int i11) {
            if (!this.f4448d) {
                return m3783d(i10, i11);
            }
            int i12 = this.f4446b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int m3783d = m3783d(i10, i11);
            this.f4446b.put(i10, m3783d);
            return m3783d;
        }

        /* renamed from: c */
        public int m3782c(int i10, int i11) {
            if (!this.f4447c) {
                return mo3776e(i10, i11);
            }
            int i12 = this.f4445a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int mo3776e = mo3776e(i10, i11);
            this.f4445a.put(i10, mo3776e);
            return mo3776e;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m3783d(int r5, int r6) {
            /*
                Method dump skipped, instructions count: 189
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0660c.m3783d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3776e(int i10, int i11);

        /* renamed from: f */
        public abstract int mo3777f(int i10);

        /* renamed from: g */
        public void m3784g() {
            this.f4446b.clear();
        }

        /* renamed from: h */
        public void m3785h() {
            this.f4445a.clear();
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f4434I = false;
        this.f4435J = -1;
        this.f4438M = new SparseIntArray();
        this.f4439N = new SparseIntArray();
        this.f4440O = new C0658a();
        this.f4441P = new Rect();
        m3775z3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f4434I = false;
        this.f4435J = -1;
        this.f4438M = new SparseIntArray();
        this.f4439N = new SparseIntArray();
        this.f4440O = new C0658a();
        this.f4441P = new Rect();
        m3775z3(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4434I = false;
        this.f4435J = -1;
        this.f4438M = new SparseIntArray();
        this.f4439N = new SparseIntArray();
        this.f4440O = new C0658a();
        this.f4441P = new Rect();
        m3775z3(RecyclerView.AbstractC0685p.m4147C0(context, attributeSet, i10, i11).f4676b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4[r4.length - 1] != r6) goto L8;
     */
    /* renamed from: l3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] m3744l3(int[] r4, int r5, int r6) {
        /*
            r0 = 1
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r4
            int r0 = r0.length
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            if (r0 != r1) goto L1c
            r0 = r4
            r12 = r0
            r0 = r4
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = r6
            if (r0 == r1) goto L23
        L1c:
            r0 = r5
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r12 = r0
        L23:
            r0 = 0
            r9 = r0
            r0 = r12
            r1 = 0
            r2 = 0
            r0[r1] = r2
            r0 = r6
            r1 = r5
            int r0 = r0 / r1
            r10 = r0
            r0 = r6
            r1 = r5
            int r0 = r0 % r1
            r11 = r0
            r0 = 0
            r7 = r0
            r0 = r9
            r6 = r0
        L3a:
            r0 = r8
            r1 = r5
            if (r0 > r1) goto L73
            r0 = r6
            r1 = r11
            int r0 = r0 + r1
            r6 = r0
            r0 = r6
            if (r0 <= 0) goto L5e
            r0 = r5
            r1 = r6
            int r0 = r0 - r1
            r1 = r11
            if (r0 >= r1) goto L5e
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r6
            r1 = r5
            int r0 = r0 - r1
            r6 = r0
            goto L62
        L5e:
            r0 = r10
            r9 = r0
        L62:
            r0 = r7
            r1 = r9
            int r0 = r0 + r1
            r7 = r0
            r0 = r12
            r1 = r8
            r2 = r7
            r0[r1] = r2
            int r8 = r8 + 1
            goto L3a
        L73:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.m3744l3(int[], int, int):int[]");
    }

    /* renamed from: A3 */
    public final void m3745A3() {
        int m4230u0;
        int m4225n;
        if (m3795J2() == 1) {
            m4230u0 = m4169I0() - m4222k();
            m4225n = m4226o();
        } else {
            m4230u0 = m4230u0() - m4206a();
            m4225n = m4225n();
        }
        m3759k3(m4230u0 - m4225n);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D2 */
    public View mo3746D2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, boolean z10, boolean z11) {
        int i10;
        int m4217h0 = m4217h0();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = m4217h0() - 1;
            i12 = -1;
        } else {
            i11 = m4217h0;
            i10 = 0;
        }
        int m4009c = c0668b0.m4009c();
        m3832r2();
        int mo4623m = this.f4459u.mo4623m();
        int mo4619i = this.f4459u.mo4619i();
        View view = null;
        View view2 = null;
        while (true) {
            View view3 = view2;
            if (i10 == i11) {
                if (view != null) {
                    view3 = view;
                }
                return view3;
            }
            View m4216g0 = m4216g0(i10);
            int m4155B0 = m4155B0(m4216g0);
            View view4 = view;
            View view5 = view3;
            if (m4155B0 >= 0) {
                view4 = view;
                view5 = view3;
                if (m4155B0 >= m4009c) {
                    continue;
                } else if (m3770u3(c0692w, c0668b0, m4155B0) != 0) {
                    view4 = view;
                    view5 = view3;
                } else if (((RecyclerView.C0686q) m4216g0.getLayoutParams()).m4249k()) {
                    view4 = view;
                    view5 = view3;
                    if (view3 == null) {
                        view5 = m4216g0;
                        view4 = view;
                    }
                } else {
                    if (this.f4459u.mo4617g(m4216g0) < mo4619i && this.f4459u.mo4614d(m4216g0) >= mo4623m) {
                        return m4216g0;
                    }
                    view4 = view;
                    view5 = view3;
                    if (view == null) {
                        view4 = m4216g0;
                        view5 = view3;
                    }
                }
            }
            i10 += i12;
            view = view4;
            view2 = view5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: E0 */
    public int mo2721E0(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (this.f4457s == 0) {
            return this.f4435J;
        }
        if (c0668b0.m4009c() < 1) {
            return 0;
        }
        return m3769t3(c0692w, c0668b0, c0668b0.m4009c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: J */
    public boolean mo3747J(RecyclerView.C0686q c0686q) {
        return c0686q instanceof C0659b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: M2 */
    public void mo3748M2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, LinearLayoutManager.C0663c c0663c, LinearLayoutManager.C0662b c0662b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int mo4616f;
        int i16;
        int makeMeasureSpec;
        int m4150i0;
        View m3850d;
        int mo4622l = this.f4459u.mo4622l();
        boolean z10 = mo4622l != 1073741824;
        int i17 = m4217h0() > 0 ? this.f4436K[this.f4435J] : 0;
        if (z10) {
            m3745A3();
        }
        boolean z11 = c0663c.f4478e == 1;
        int i18 = this.f4435J;
        if (!z11) {
            i18 = m3770u3(c0692w, c0668b0, c0663c.f4477d) + m3771v3(c0692w, c0668b0, c0663c.f4477d);
        }
        int i19 = 0;
        while (i19 < this.f4435J && c0663c.m3849c(c0668b0) && i18 > 0) {
            int i20 = c0663c.f4477d;
            int m3771v3 = m3771v3(c0692w, c0668b0, i20);
            if (m3771v3 > this.f4435J) {
                throw new IllegalArgumentException("Item at position " + i20 + " requires " + m3771v3 + " spans but GridLayoutManager has only " + this.f4435J + " spans.");
            }
            i18 -= m3771v3;
            if (i18 < 0 || (m3850d = c0663c.m3850d(c0692w)) == null) {
                break;
            }
            this.f4437L[i19] = m3850d;
            i19++;
        }
        if (i19 == 0) {
            c0662b.f4471b = true;
            return;
        }
        float f10 = 0.0f;
        m3757i3(c0692w, c0668b0, i19, z11);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i19) {
            View view = this.f4437L[i21];
            if (c0663c.f4485l == null) {
                if (z11) {
                    m4151A(view);
                } else {
                    m4154B(view, 0);
                }
            } else if (z11) {
                m4236y(view);
            } else {
                m4238z(view, 0);
            }
            m4165G(view, this.f4441P);
            m3773x3(view, mo4622l, false);
            int mo4615e = this.f4459u.mo4615e(view);
            int i23 = i22;
            if (mo4615e > i22) {
                i23 = mo4615e;
            }
            float mo4616f2 = (this.f4459u.mo4616f(view) * 1.0f) / ((C0659b) view.getLayoutParams()).f4444g;
            float f11 = f10;
            if (mo4616f2 > f10) {
                f11 = mo4616f2;
            }
            i21++;
            i22 = i23;
            f10 = f11;
        }
        int i24 = i22;
        if (z10) {
            m3772w3(f10, i17);
            int i25 = 0;
            int i26 = 0;
            while (true) {
                int i27 = i26;
                i24 = i27;
                if (i25 >= i19) {
                    break;
                }
                View view2 = this.f4437L[i25];
                m3773x3(view2, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, true);
                int mo4615e2 = this.f4459u.mo4615e(view2);
                int i28 = i27;
                if (mo4615e2 > i27) {
                    i28 = mo4615e2;
                }
                i25++;
                i26 = i28;
            }
        }
        for (int i29 = 0; i29 < i19; i29++) {
            View view3 = this.f4437L[i29];
            if (this.f4459u.mo4615e(view3) != i24) {
                C0659b c0659b = (C0659b) view3.getLayoutParams();
                Rect rect = c0659b.f4680c;
                int i30 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0659b).topMargin + ((ViewGroup.MarginLayoutParams) c0659b).bottomMargin;
                int i31 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0659b).leftMargin + ((ViewGroup.MarginLayoutParams) c0659b).rightMargin;
                int m3766r3 = m3766r3(c0659b.f4443f, c0659b.f4444g);
                if (this.f4457s == 1) {
                    makeMeasureSpec = RecyclerView.AbstractC0685p.m4150i0(m3766r3, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, i31, ((ViewGroup.MarginLayoutParams) c0659b).width, false);
                    m4150i0 = View.MeasureSpec.makeMeasureSpec(i24 - i30, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i31, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
                    m4150i0 = RecyclerView.AbstractC0685p.m4150i0(m3766r3, NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH, i30, ((ViewGroup.MarginLayoutParams) c0659b).height, false);
                }
                m3774y3(view3, makeMeasureSpec, m4150i0, true);
            }
        }
        c0662b.f4470a = i24;
        if (this.f4457s == 1) {
            if (c0663c.f4479f == -1) {
                i12 = c0663c.f4475b;
                i13 = i12 - i24;
            } else {
                int i32 = c0663c.f4475b;
                int i33 = i24 + i32;
                i13 = i32;
                i12 = i33;
            }
            i11 = 0;
            i10 = 0;
        } else if (c0663c.f4479f == -1) {
            i11 = c0663c.f4475b;
            i10 = i11 - i24;
            i13 = 0;
            i12 = 0;
        } else {
            i10 = c0663c.f4475b;
            i11 = i24 + i10;
            i12 = 0;
            i13 = 0;
        }
        for (int i34 = 0; i34 < i19; i34++) {
            View view4 = this.f4437L[i34];
            C0659b c0659b2 = (C0659b) view4.getLayoutParams();
            if (this.f4457s == 1) {
                if (m3796K2()) {
                    int m4226o = m4226o() + this.f4436K[this.f4435J - c0659b2.f4443f];
                    i11 = m4226o;
                    i16 = m4226o - this.f4459u.mo4616f(view4);
                } else {
                    int m4226o2 = m4226o() + this.f4436K[c0659b2.f4443f];
                    i16 = m4226o2;
                    i11 = this.f4459u.mo4616f(view4) + m4226o2;
                }
                mo4616f = i12;
                i14 = i13;
                i15 = i16;
            } else {
                int m4225n = m4225n() + this.f4436K[c0659b2.f4443f];
                i14 = m4225n;
                i15 = i10;
                mo4616f = this.f4459u.mo4616f(view4) + m4225n;
            }
            m4193V0(view4, i15, i14, i11, mo4616f);
            if (c0659b2.m4249k() || c0659b2.m4248j()) {
                c0662b.f4472c = true;
            }
            c0662b.f4473d |= view4.hasFocusable();
            int i35 = i14;
            i12 = mo4616f;
            i10 = i15;
            i13 = i35;
        }
        Arrays.fill(this.f4437L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: O */
    public int mo3749O(RecyclerView.C0668b0 c0668b0) {
        return this.f4442Q ? m3762n3(c0668b0) : super.mo3749O(c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: O2 */
    public void mo3750O2(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, LinearLayoutManager.C0661a c0661a, int i10) {
        super.mo3750O2(c0692w, c0668b0, c0661a, i10);
        m3745A3();
        if (c0668b0.m4009c() > 0 && !c0668b0.m4014h()) {
            m3764p3(c0692w, c0668b0, c0661a, i10);
        }
        m3765q3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: P */
    public int mo3751P(RecyclerView.C0668b0 c0668b0) {
        return this.f4442Q ? m3763o3(c0668b0) : super.mo3751P(c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: R */
    public int mo3752R(RecyclerView.C0668b0 c0668b0) {
        return this.f4442Q ? m3762n3(c0668b0) : super.mo3752R(c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: S */
    public int mo3753S(RecyclerView.C0668b0 c0668b0) {
        return this.f4442Q ? m3763o3(c0668b0) : super.mo3753S(c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: T1 */
    public int mo2766T1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        m3745A3();
        m3765q3();
        return super.mo2766T1(i10, c0692w, c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: V1 */
    public int mo2772V1(int i10, RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        m3745A3();
        m3765q3();
        return super.mo2772V1(i10, c0692w, c0668b0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Z2 */
    public void mo3754Z2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo3754Z2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: a2 */
    public void mo3755a2(Rect rect, int i10, int i11) {
        int m4148K;
        int m4148K2;
        if (this.f4436K == null) {
            super.mo3755a2(rect, i10, i11);
        }
        int m4226o = m4226o() + m4222k();
        int m4225n = m4225n() + m4206a();
        if (this.f4457s == 1) {
            m4148K2 = RecyclerView.AbstractC0685p.m4148K(i11, rect.height() + m4225n, m4239z0());
            int[] iArr = this.f4436K;
            m4148K = RecyclerView.AbstractC0685p.m4148K(i10, iArr[iArr.length - 1] + m4226o, m4152A0());
        } else {
            m4148K = RecyclerView.AbstractC0685p.m4148K(i10, rect.width() + m4226o, m4152A0());
            int[] iArr2 = this.f4436K;
            m4148K2 = RecyclerView.AbstractC0685p.m4148K(i11, iArr2[iArr2.length - 1] + m4225n, m4239z0());
        }
        m4205Z1(m4148K, m4148K2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: b0 */
    public RecyclerView.C0686q mo2786b0() {
        return this.f4457s == 0 ? new C0659b(-2, -1) : new C0659b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: c0 */
    public RecyclerView.C0686q mo2790c0(Context context, AttributeSet attributeSet) {
        return new C0659b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: d0 */
    public RecyclerView.C0686q mo2793d0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0659b((ViewGroup.MarginLayoutParams) layoutParams) : new C0659b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0188, code lost:
    
        if (r15 == (r0 > r18)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
    
        if (r15 == r13) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0225 A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo3756f1(android.view.View r7, int r8, androidx.recyclerview.widget.RecyclerView.C0692w r9, androidx.recyclerview.widget.RecyclerView.C0668b0 r10) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3756f1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    /* renamed from: i3 */
    public final void m3757i3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i12 = 1;
            i14 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.f4437L[i11];
            C0659b c0659b = (C0659b) view.getLayoutParams();
            int m3771v3 = m3771v3(c0692w, c0668b0, m4155B0(view));
            c0659b.f4444g = m3771v3;
            c0659b.f4443f = i13;
            i13 += m3771v3;
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: j2 */
    public boolean mo2809j2() {
        return this.f4452D == null && !this.f4434I;
    }

    /* renamed from: j3 */
    public final void m3758j3() {
        int m4217h0 = m4217h0();
        for (int i10 = 0; i10 < m4217h0; i10++) {
            C0659b c0659b = (C0659b) m4216g0(i10).getLayoutParams();
            int m4247c = c0659b.m4247c();
            this.f4438M.put(m4247c, c0659b.m3779o());
            this.f4439N.put(m4247c, c0659b.m3778n());
        }
    }

    /* renamed from: k3 */
    public final void m3759k3(int i10) {
        this.f4436K = m3744l3(this.f4436K, this.f4435J, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: l0 */
    public int mo2815l0(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (this.f4457s == 1) {
            return this.f4435J;
        }
        if (c0668b0.m4009c() < 1) {
            return 0;
        }
        return m3769t3(c0692w, c0668b0, c0668b0.m4009c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: l1 */
    public void mo2816l1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, View view, C7535k c7535k) {
        int i10;
        int m3779o;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0659b)) {
            super.m4224k1(view, c7535k);
            return;
        }
        C0659b c0659b = (C0659b) layoutParams;
        int m3769t3 = m3769t3(c0692w, c0668b0, c0659b.m4247c());
        if (this.f4457s == 0) {
            i11 = c0659b.m3778n();
            i10 = c0659b.m3779o();
            m3779o = 1;
        } else {
            i10 = 1;
            int m3778n = c0659b.m3778n();
            m3779o = c0659b.m3779o();
            i11 = m3769t3;
            m3769t3 = m3778n;
        }
        c7535k.m32203a0(C7535k.c.m32254a(i11, i10, m3769t3, m3779o, false, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: l2 */
    public void mo3760l2(RecyclerView.C0668b0 c0668b0, LinearLayoutManager.C0663c c0663c, RecyclerView.AbstractC0685p.c cVar) {
        int i10 = this.f4435J;
        for (int i11 = 0; i11 < this.f4435J && c0663c.m3849c(c0668b0) && i10 > 0; i11++) {
            int i12 = c0663c.f4477d;
            cVar.mo4245a(i12, Math.max(0, c0663c.f4480g));
            i10 -= this.f4440O.mo3777f(i12);
            c0663c.f4477d += c0663c.f4478e;
        }
    }

    /* renamed from: m3 */
    public final void m3761m3() {
        this.f4438M.clear();
        this.f4439N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: n1 */
    public void mo2826n1(RecyclerView recyclerView, int i10, int i11) {
        this.f4440O.m3785h();
        this.f4440O.m3784g();
    }

    /* renamed from: n3 */
    public final int m3762n3(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0 || c0668b0.m4009c() == 0) {
            return 0;
        }
        m3832r2();
        boolean m3797L2 = m3797L2();
        View m3836v2 = m3836v2(!m3797L2, true);
        View m3835u2 = m3835u2(!m3797L2, true);
        if (m3836v2 == null || m3835u2 == null) {
            return 0;
        }
        int m3781b = this.f4440O.m3781b(m4155B0(m3836v2), this.f4435J);
        int m3781b2 = this.f4440O.m3781b(m4155B0(m3835u2), this.f4435J);
        int max = this.f4462x ? Math.max(0, ((this.f4440O.m3781b(c0668b0.m4009c() - 1, this.f4435J) + 1) - Math.max(m3781b, m3781b2)) - 1) : Math.max(0, Math.min(m3781b, m3781b2));
        if (!m3797L2) {
            return max;
        }
        return Math.round((max * (Math.abs(this.f4459u.mo4614d(m3835u2) - this.f4459u.mo4617g(m3836v2)) / ((this.f4440O.m3781b(m4155B0(m3835u2), this.f4435J) - this.f4440O.m3781b(m4155B0(m3836v2), this.f4435J)) + 1))) + (this.f4459u.mo4623m() - this.f4459u.mo4617g(m3836v2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: o1 */
    public void mo2831o1(RecyclerView recyclerView) {
        this.f4440O.m3785h();
        this.f4440O.m3784g();
    }

    /* renamed from: o3 */
    public final int m3763o3(RecyclerView.C0668b0 c0668b0) {
        if (m4217h0() == 0 || c0668b0.m4009c() == 0) {
            return 0;
        }
        m3832r2();
        View m3836v2 = m3836v2(!m3797L2(), true);
        View m3835u2 = m3835u2(!m3797L2(), true);
        if (m3836v2 == null || m3835u2 == null) {
            return 0;
        }
        if (!m3797L2()) {
            return this.f4440O.m3781b(c0668b0.m4009c() - 1, this.f4435J) + 1;
        }
        int mo4614d = this.f4459u.mo4614d(m3835u2);
        int mo4617g = this.f4459u.mo4617g(m3836v2);
        int m3781b = this.f4440O.m3781b(m4155B0(m3836v2), this.f4435J);
        return (int) (((mo4614d - mo4617g) / ((this.f4440O.m3781b(m4155B0(m3835u2), this.f4435J) - m3781b) + 1)) * (this.f4440O.m3781b(c0668b0.m4009c() - 1, this.f4435J) + 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: p1 */
    public void mo2835p1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f4440O.m3785h();
        this.f4440O.m3784g();
    }

    /* renamed from: p3 */
    public final void m3764p3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, LinearLayoutManager.C0661a c0661a, int i10) {
        int i11;
        int m3770u3;
        boolean z10 = i10 == 1;
        int m3770u32 = m3770u3(c0692w, c0668b0, c0661a.f4466b);
        if (z10) {
            while (m3770u32 > 0) {
                int i12 = c0661a.f4466b;
                if (i12 <= 0) {
                    return;
                }
                int i13 = i12 - 1;
                c0661a.f4466b = i13;
                m3770u32 = m3770u3(c0692w, c0668b0, i13);
            }
            return;
        }
        int m4009c = c0668b0.m4009c();
        int i14 = c0661a.f4466b;
        while (i14 < m4009c - 1 && (m3770u3 = m3770u3(c0692w, c0668b0, (i11 = i14 + 1))) > m3770u32) {
            i14 = i11;
            m3770u32 = m3770u3;
        }
        c0661a.f4466b = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: q1 */
    public void mo2839q1(RecyclerView recyclerView, int i10, int i11) {
        this.f4440O.m3785h();
        this.f4440O.m3784g();
    }

    /* renamed from: q3 */
    public final void m3765q3() {
        View[] viewArr = this.f4437L;
        if (viewArr == null || viewArr.length != this.f4435J) {
            this.f4437L = new View[this.f4435J];
        }
    }

    /* renamed from: r3 */
    public int m3766r3(int i10, int i11) {
        if (this.f4457s != 1 || !m3796K2()) {
            int[] iArr = this.f4436K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f4436K;
        int i12 = this.f4435J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: s1 */
    public void mo3767s1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f4440O.m3785h();
        this.f4440O.m3784g();
    }

    /* renamed from: s3 */
    public int m3768s3() {
        return this.f4435J;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: t1 */
    public void mo2852t1(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0) {
        if (c0668b0.m4014h()) {
            m3758j3();
        }
        super.mo2852t1(c0692w, c0668b0);
        m3761m3();
    }

    /* renamed from: t3 */
    public final int m3769t3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, int i10) {
        if (!c0668b0.m4014h()) {
            return this.f4440O.m3781b(i10, this.f4435J);
        }
        int m4291f = c0692w.m4291f(i10);
        if (m4291f != -1) {
            return this.f4440O.m3781b(m4291f, this.f4435J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0685p
    /* renamed from: u1 */
    public void mo2856u1(RecyclerView.C0668b0 c0668b0) {
        super.mo2856u1(c0668b0);
        this.f4434I = false;
    }

    /* renamed from: u3 */
    public final int m3770u3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, int i10) {
        if (!c0668b0.m4014h()) {
            return this.f4440O.m3782c(i10, this.f4435J);
        }
        int i11 = this.f4439N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m4291f = c0692w.m4291f(i10);
        if (m4291f != -1) {
            return this.f4440O.m3782c(m4291f, this.f4435J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    /* renamed from: v3 */
    public final int m3771v3(RecyclerView.C0692w c0692w, RecyclerView.C0668b0 c0668b0, int i10) {
        if (!c0668b0.m4014h()) {
            return this.f4440O.mo3777f(i10);
        }
        int i11 = this.f4438M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m4291f = c0692w.m4291f(i10);
        if (m4291f != -1) {
            return this.f4440O.mo3777f(m4291f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    /* renamed from: w3 */
    public final void m3772w3(float f10, int i10) {
        m3759k3(Math.max(Math.round(f10 * this.f4435J), i10));
    }

    /* renamed from: x3 */
    public final void m3773x3(View view, int i10, boolean z10) {
        int m4150i0;
        int m4150i02;
        C0659b c0659b = (C0659b) view.getLayoutParams();
        Rect rect = c0659b.f4680c;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0659b).topMargin + ((ViewGroup.MarginLayoutParams) c0659b).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0659b).leftMargin + ((ViewGroup.MarginLayoutParams) c0659b).rightMargin;
        int m3766r3 = m3766r3(c0659b.f4443f, c0659b.f4444g);
        if (this.f4457s == 1) {
            m4150i02 = RecyclerView.AbstractC0685p.m4150i0(m3766r3, i10, i12, ((ViewGroup.MarginLayoutParams) c0659b).width, false);
            m4150i0 = RecyclerView.AbstractC0685p.m4150i0(this.f4459u.mo4624n(), m4231v0(), i11, ((ViewGroup.MarginLayoutParams) c0659b).height, true);
        } else {
            m4150i0 = RecyclerView.AbstractC0685p.m4150i0(m3766r3, i10, i11, ((ViewGroup.MarginLayoutParams) c0659b).height, false);
            m4150i02 = RecyclerView.AbstractC0685p.m4150i0(this.f4459u.mo4624n(), m4171J0(), i12, ((ViewGroup.MarginLayoutParams) c0659b).width, true);
        }
        m3774y3(view, m4150i02, m4150i0, z10);
    }

    /* renamed from: y3 */
    public final void m3774y3(View view, int i10, int i11, boolean z10) {
        RecyclerView.C0686q c0686q = (RecyclerView.C0686q) view.getLayoutParams();
        if (z10 ? m4215f2(view, i10, i11, c0686q) : m4212d2(view, i10, i11, c0686q)) {
            view.measure(i10, i11);
        }
    }

    /* renamed from: z3 */
    public void m3775z3(int i10) {
        if (i10 == this.f4435J) {
            return;
        }
        this.f4434I = true;
        if (i10 >= 1) {
            this.f4435J = i10;
            this.f4440O.m3785h();
            m4184Q1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }
}
