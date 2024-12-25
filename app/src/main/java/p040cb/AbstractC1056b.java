package p040cb;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p138i0.C5146a;
import p235o0.C6813c1;
import p235o0.C6820f;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cb/b.class
 */
/* renamed from: cb.b */
/* loaded from: combined.jar:classes2.jar:cb/b.class */
public abstract class AbstractC1056b extends C1057c<View> {

    /* renamed from: d */
    public final Rect f7052d;

    /* renamed from: e */
    public final Rect f7053e;

    /* renamed from: f */
    public int f7054f;

    /* renamed from: g */
    public int f7055g;

    public AbstractC1056b() {
        this.f7052d = new Rect();
        this.f7053e = new Rect();
        this.f7054f = 0;
    }

    public AbstractC1056b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7052d = new Rect();
        this.f7053e = new Rect();
        this.f7054f = 0;
    }

    /* renamed from: N */
    public static int m6245N(int i10) {
        int i11 = i10;
        if (i10 == 0) {
            i11 = 8388659;
        }
        return i11;
    }

    @Override // p040cb.C1057c
    /* renamed from: F */
    public void mo6246F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View mo6247H = mo6247H(coordinatorLayout.m1805s(view));
        if (mo6247H != null) {
            CoordinatorLayout.C0384f c0384f = (CoordinatorLayout.C0384f) view.getLayoutParams();
            Rect rect = this.f7052d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0384f).leftMargin, mo6247H.getBottom() + ((ViewGroup.MarginLayoutParams) c0384f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0384f).rightMargin, ((coordinatorLayout.getHeight() + mo6247H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0384f).bottomMargin);
            C6813c1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C6824g0.m31558z(coordinatorLayout) && !C6824g0.m31558z(view)) {
                rect.left += lastWindowInsets.m31400j();
                rect.right -= lastWindowInsets.m31401k();
            }
            Rect rect2 = this.f7053e;
            C6820f.m31459a(m6245N(c0384f.f2628c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int m6248I = m6248I(mo6247H);
            view.layout(rect2.left, rect2.top - m6248I, rect2.right, rect2.bottom - m6248I);
            i11 = rect2.top - mo6247H.getBottom();
        } else {
            super.mo6246F(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f7054f = i11;
    }

    /* renamed from: H */
    public abstract View mo6247H(List<View> list);

    /* renamed from: I */
    public final int m6248I(View view) {
        int i10 = 0;
        if (this.f7055g != 0) {
            float mo6249J = mo6249J(view);
            int i11 = this.f7055g;
            i10 = C5146a.m25779b((int) (mo6249J * i11), 0, i11);
        }
        return i10;
    }

    /* renamed from: J */
    public float mo6249J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m6250K() {
        return this.f7055g;
    }

    /* renamed from: L */
    public int mo6251L(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: M */
    public final int m6252M() {
        return this.f7054f;
    }

    /* renamed from: O */
    public final void m6253O(int i10) {
        this.f7055g = i10;
    }

    /* renamed from: P */
    public boolean m6254P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
    /* renamed from: m */
    public boolean mo1830m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View mo6247H;
        int height;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (mo6247H = mo6247H(coordinatorLayout.m1805s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            height = size;
            if (C6824g0.m31558z(mo6247H)) {
                C6813c1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                height = size;
                if (lastWindowInsets != null) {
                    height = size + lastWindowInsets.m31402l() + lastWindowInsets.m31399i();
                }
            }
        } else {
            height = coordinatorLayout.getHeight();
        }
        int mo6251L = height + mo6251L(mo6247H);
        int measuredHeight = mo6247H.getMeasuredHeight();
        if (m6254P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            mo6251L -= measuredHeight;
        }
        coordinatorLayout.m1785K(view, i10, i11, View.MeasureSpec.makeMeasureSpec(mo6251L, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }
}
