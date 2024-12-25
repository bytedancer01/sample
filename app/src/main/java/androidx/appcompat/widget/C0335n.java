package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p029c.C0920a;
import p068e.C4561b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/n.class
 */
/* renamed from: androidx.appcompat.widget.n */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/n.class */
public class C0335n extends MultiAutoCompleteTextView {

    /* renamed from: d */
    public static final int[] f2165d = {R.attr.popupBackground};

    /* renamed from: b */
    public final C0308e f2166b;

    /* renamed from: c */
    public final C0309e0 f2167c;

    public C0335n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6121p);
    }

    public C0335n(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0337n1 m1505v = C0337n1.m1505v(getContext(), attributeSet, f2165d, i10, 0);
        if (m1505v.m1524s(0)) {
            setDropDownBackgroundDrawable(m1505v.m1512g(0));
        }
        m1505v.m1525w();
        C0308e c0308e = new C0308e(this);
        this.f2166b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f2167c = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        c0309e0.m1332b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2166b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f2167c;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2166b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2166b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0326k.m1462a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2166b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2166b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C4561b.m22999d(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2166b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2166b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0309e0 c0309e0 = this.f2167c;
        if (c0309e0 != null) {
            c0309e0.m1346q(context, i10);
        }
    }
}
