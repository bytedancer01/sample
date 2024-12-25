package p235o0;

import android.view.View;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/s.class
 */
/* renamed from: o0.s */
/* loaded from: combined.jar:classes1.jar:o0/s.class */
public class C6851s {

    /* renamed from: a */
    public ViewParent f35570a;

    /* renamed from: b */
    public ViewParent f35571b;

    /* renamed from: c */
    public final View f35572c;

    /* renamed from: d */
    public boolean f35573d;

    /* renamed from: e */
    public int[] f35574e;

    public C6851s(View view) {
        this.f35572c = view;
    }

    /* renamed from: a */
    public boolean m31632a(float f10, float f11, boolean z10) {
        ViewParent m31639h;
        if (!m31643l() || (m31639h = m31639h(0)) == null) {
            return false;
        }
        return C6862x0.m31664a(m31639h, this.f35572c, f10, f11, z10);
    }

    /* renamed from: b */
    public boolean m31633b(float f10, float f11) {
        ViewParent m31639h;
        if (!m31643l() || (m31639h = m31639h(0)) == null) {
            return false;
        }
        return C6862x0.m31665b(m31639h, this.f35572c, f10, f11);
    }

    /* renamed from: c */
    public boolean m31634c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m31635d(i10, i11, iArr, iArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (r19[1] != 0) goto L30;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m31635d(int r8, int r9, int[] r10, int[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p235o0.C6851s.m31635d(int, int, int[], int[], int):boolean");
    }

    /* renamed from: e */
    public void m31636e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m31638g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: f */
    public boolean m31637f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m31638g(i10, i11, i12, i13, iArr, 0, null);
    }

    /* renamed from: g */
    public final boolean m31638g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent m31639h;
        int i15;
        int i16;
        if (!m31643l() || (m31639h = m31639h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr == null) {
                return false;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        if (iArr != null) {
            this.f35572c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            iArr2 = m31640i();
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        C6862x0.m31667d(m31639h, this.f35572c, i10, i11, i12, i13, i14, iArr2);
        if (iArr == null) {
            return true;
        }
        this.f35572c.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i15;
        iArr[1] = iArr[1] - i16;
        return true;
    }

    /* renamed from: h */
    public final ViewParent m31639h(int i10) {
        if (i10 == 0) {
            return this.f35570a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f35571b;
    }

    /* renamed from: i */
    public final int[] m31640i() {
        if (this.f35574e == null) {
            this.f35574e = new int[2];
        }
        return this.f35574e;
    }

    /* renamed from: j */
    public boolean m31641j() {
        return m31642k(0);
    }

    /* renamed from: k */
    public boolean m31642k(int i10) {
        return m31639h(i10) != null;
    }

    /* renamed from: l */
    public boolean m31643l() {
        return this.f35573d;
    }

    /* renamed from: m */
    public void m31644m(boolean z10) {
        if (this.f35573d) {
            C6824g0.m31492L0(this.f35572c);
        }
        this.f35573d = z10;
    }

    /* renamed from: n */
    public final void m31645n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f35570a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f35571b = viewParent;
        }
    }

    /* renamed from: o */
    public boolean m31646o(int i10) {
        return m31647p(i10, 0);
    }

    /* renamed from: p */
    public boolean m31647p(int i10, int i11) {
        if (m31642k(i11)) {
            return true;
        }
        if (!m31643l()) {
            return false;
        }
        View view = this.f35572c;
        for (ViewParent parent = this.f35572c.getParent(); parent != null; parent = parent.getParent()) {
            if (C6862x0.m31669f(parent, view, this.f35572c, i10, i11)) {
                m31645n(i11, parent);
                C6862x0.m31668e(parent, view, this.f35572c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void m31648q() {
        m31649r(0);
    }

    /* renamed from: r */
    public void m31649r(int i10) {
        ViewParent m31639h = m31639h(i10);
        if (m31639h != null) {
            C6862x0.m31670g(m31639h, this.f35572c, i10);
            m31645n(i10, null);
        }
    }
}
