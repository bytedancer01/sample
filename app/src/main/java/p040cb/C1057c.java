package p040cb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cb/c.class
 */
/* renamed from: cb.c */
/* loaded from: combined.jar:classes2.jar:cb/c.class */
public class C1057c<V extends View> extends CoordinatorLayout.AbstractC0381c<V> {

    /* renamed from: a */
    public C1058d f7056a;

    /* renamed from: b */
    public int f7057b;

    /* renamed from: c */
    public int f7058c;

    public C1057c() {
        this.f7057b = 0;
        this.f7058c = 0;
    }

    public C1057c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7057b = 0;
        this.f7058c = 0;
    }

    /* renamed from: E */
    public int mo6255E() {
        C1058d c1058d = this.f7056a;
        return c1058d != null ? c1058d.m6258b() : 0;
    }

    /* renamed from: F */
    public void mo6246F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.m1784J(v10, i10);
    }

    /* renamed from: G */
    public boolean mo6256G(int i10) {
        C1058d c1058d = this.f7056a;
        if (c1058d != null) {
            return c1058d.m6261e(i10);
        }
        this.f7057b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
    /* renamed from: l */
    public boolean mo1829l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        mo6246F(coordinatorLayout, v10, i10);
        if (this.f7056a == null) {
            this.f7056a = new C1058d(v10);
        }
        this.f7056a.m6259c();
        this.f7056a.m6257a();
        int i11 = this.f7057b;
        if (i11 != 0) {
            this.f7056a.m6261e(i11);
            this.f7057b = 0;
        }
        int i12 = this.f7058c;
        if (i12 == 0) {
            return true;
        }
        this.f7056a.m6260d(i12);
        this.f7058c = 0;
        return true;
    }
}
