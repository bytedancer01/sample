package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/i.class
 */
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/i.class */
public class C0710i {

    /* renamed from: b */
    public int f4934b;

    /* renamed from: c */
    public int f4935c;

    /* renamed from: d */
    public int f4936d;

    /* renamed from: e */
    public int f4937e;

    /* renamed from: h */
    public boolean f4940h;

    /* renamed from: i */
    public boolean f4941i;

    /* renamed from: a */
    public boolean f4933a = true;

    /* renamed from: f */
    public int f4938f = 0;

    /* renamed from: g */
    public int f4939g = 0;

    /* renamed from: a */
    public boolean m4594a(RecyclerView.C0668b0 c0668b0) {
        int i10 = this.f4935c;
        return i10 >= 0 && i10 < c0668b0.m4009c();
    }

    /* renamed from: b */
    public View m4595b(RecyclerView.C0692w c0692w) {
        View m4300o = c0692w.m4300o(this.f4935c);
        this.f4935c += this.f4936d;
        return m4300o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4934b + ", mCurrentPosition=" + this.f4935c + ", mItemDirection=" + this.f4936d + ", mLayoutDirection=" + this.f4937e + ", mStartLine=" + this.f4938f + ", mEndLine=" + this.f4939g + '}';
    }
}
