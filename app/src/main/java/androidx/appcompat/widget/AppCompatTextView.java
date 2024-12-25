package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p068e.C4561b;
import p087f0.C4741d;
import p207m0.C5888d;
import p314s0.C8513u;
import p314s0.InterfaceC8494b;
import p314s0.InterfaceC8515w;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/AppCompatTextView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/AppCompatTextView.class */
public class AppCompatTextView extends TextView implements InterfaceC8515w, InterfaceC8494b {

    /* renamed from: b */
    public final C0308e f1768b;

    /* renamed from: c */
    public final C0309e0 f1769c;

    /* renamed from: d */
    public final C0364x f1770d;

    /* renamed from: e */
    public boolean f1771e;

    /* renamed from: f */
    public Future<C5888d> f1772f;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        this.f1771e = false;
        C0322i1.m1454a(this, getContext());
        C0308e c0308e = new C0308e(this);
        this.f1768b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f1769c = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        c0309e0.m1332b();
        this.f1770d = new C0364x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f1768b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    /* renamed from: e */
    public final void m1117e() {
        Future<C5888d> future = this.f1772f;
        if (future != null) {
            try {
                this.f1772f = null;
                C8513u.m36722n(this, future.get());
            } catch (InterruptedException | ExecutionException e10) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC8494b.f39857e0) {
            return super.getAutoSizeMaxTextSize();
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            return c0309e0.m1334e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC8494b.f39857e0) {
            return super.getAutoSizeMinTextSize();
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            return c0309e0.m1335f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC8494b.f39857e0) {
            return super.getAutoSizeStepGranularity();
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            return c0309e0.m1336g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC8494b.f39857e0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0309e0 c0309e0 = this.f1769c;
        return c0309e0 != null ? c0309e0.m1337h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i10 = 0;
        if (InterfaceC8494b.f39857e0) {
            if (super.getAutoSizeTextType() == 1) {
                i10 = 1;
            }
            return i10;
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            return c0309e0.m1338i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C8513u.m36710b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C8513u.m36711c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f1768b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f1768b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1769c.m1339j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1769c.m1340k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m1117e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0364x c0364x;
        return (Build.VERSION.SDK_INT >= 28 || (c0364x = this.f1770d) == null) ? super.getTextClassifier() : c0364x.m1678a();
    }

    public C5888d.a getTextMetricsParamsCompat() {
        return C8513u.m36715g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1769c.m1347r(this, onCreateInputConnection, editorInfo);
        return C0326k.m1462a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1344o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m1117e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 == null || InterfaceC8494b.f39857e0 || !c0309e0.m1341l()) {
            return;
        }
        this.f1769c.m1333c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (InterfaceC8494b.f39857e0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1349t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (InterfaceC8494b.f39857e0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1350u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (InterfaceC8494b.f39857e0) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1351v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f1768b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f1768b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable m22999d = i10 != 0 ? C4561b.m22999d(context, i10) : null;
        Drawable m22999d2 = i11 != 0 ? C4561b.m22999d(context, i11) : null;
        Drawable m22999d3 = i12 != 0 ? C4561b.m22999d(context, i12) : null;
        if (i13 != 0) {
            drawable = C4561b.m22999d(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(m22999d, m22999d2, m22999d3, drawable);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable m22999d = i10 != 0 ? C4561b.m22999d(context, i10) : null;
        Drawable m22999d2 = i11 != 0 ? C4561b.m22999d(context, i11) : null;
        Drawable m22999d3 = i12 != 0 ? C4561b.m22999d(context, i12) : null;
        if (i13 != 0) {
            drawable = C4561b.m22999d(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(m22999d, m22999d2, m22999d3, drawable);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1345p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            C8513u.m36719k(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            C8513u.m36720l(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C8513u.m36721m(this, i10);
    }

    public void setPrecomputedText(C5888d c5888d) {
        C8513u.m36722n(this, c5888d);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f1768b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f1768b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    @Override // p314s0.InterfaceC8515w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1769c.m1352w(colorStateList);
        this.f1769c.m1332b();
    }

    @Override // p314s0.InterfaceC8515w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1769c.m1353x(mode);
        this.f1769c.m1332b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1346q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0364x c0364x;
        if (Build.VERSION.SDK_INT >= 28 || (c0364x = this.f1770d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0364x.m1679b(textClassifier);
        }
    }

    public void setTextFuture(Future<C5888d> future) {
        this.f1772f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C5888d.a aVar) {
        C8513u.m36724p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC8494b.f39857e0) {
            super.setTextSize(i10, f10);
            return;
        }
        C0309e0 c0309e0 = this.f1769c;
        if (c0309e0 != null) {
            c0309e0.m1328A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f1771e) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null) {
            typeface2 = null;
            if (i10 > 0) {
                typeface2 = C4741d.m23995a(getContext(), typeface, i10);
            }
        }
        this.f1771e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f1771e = false;
        }
    }
}
