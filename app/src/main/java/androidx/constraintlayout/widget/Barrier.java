package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p373w.C9381a;
import p373w.C9385e;
import p412y.C9786d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/constraintlayout/widget/Barrier.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/constraintlayout/widget/Barrier.class */
public class Barrier extends AbstractC0375b {

    /* renamed from: j */
    public int f2362j;

    /* renamed from: k */
    public int f2363k;

    /* renamed from: l */
    public C9381a f2364l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0375b
    /* renamed from: g */
    public void mo1691g(AttributeSet attributeSet) {
        super.mo1691g(attributeSet);
        this.f2364l = new C9381a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9786d.f44753a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == C9786d.f44816j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C9786d.f44809i1) {
                    this.f2364l.m39566L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C9786d.f44822k1) {
                    this.f2364l.m39568N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2476e = this.f2364l;
        m1731m();
    }

    public int getMargin() {
        return this.f2364l.m39564J0();
    }

    public int getType() {
        return this.f2362j;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0375b
    /* renamed from: h */
    public void mo1692h(C9385e c9385e, boolean z10) {
        m1694o(c9385e, this.f2362j, z10);
    }

    /* renamed from: n */
    public boolean m1693n() {
        return this.f2364l.m39562H0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 == 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r0 == 6) goto L6;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1694o(p373w.C9385e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = r3
            r1 = r5
            r0.f2363k = r1
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r3
            int r0 = r0.f2362j
            r5 = r0
            r0 = r5
            r1 = 5
            if (r0 != r1) goto L1b
        L13:
            r0 = r3
            r1 = 1
            r0.f2363k = r1
            goto L3f
        L1b:
            r0 = r5
            r1 = 6
            if (r0 != r1) goto L3f
            goto L2e
        L24:
            r0 = r3
            int r0 = r0.f2362j
            r5 = r0
            r0 = r5
            r1 = 5
            if (r0 != r1) goto L36
        L2e:
            r0 = r3
            r1 = 0
            r0.f2363k = r1
            goto L3f
        L36:
            r0 = r5
            r1 = 6
            if (r0 != r1) goto L3f
            goto L13
        L3f:
            r0 = r4
            boolean r0 = r0 instanceof p373w.C9381a
            if (r0 == 0) goto L51
            r0 = r4
            w.a r0 = (p373w.C9381a) r0
            r1 = r3
            int r1 = r1.f2363k
            r0.m39567M0(r1)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.m1694o(w.e, int, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2364l.m39566L0(z10);
    }

    public void setDpMargin(int i10) {
        this.f2364l.m39568N0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2364l.m39568N0(i10);
    }

    public void setType(int i10) {
        this.f2362j = i10;
    }
}
