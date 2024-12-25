package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p029c.C0920a;
import p314s0.C8513u;
import p314s0.InterfaceC8494b;
import p314s0.InterfaceC8515w;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/f.class
 */
/* renamed from: androidx.appcompat.widget.f */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/f.class */
public class C0311f extends Button implements InterfaceC8494b, InterfaceC8515w {

    /* renamed from: b */
    public final C0308e f2054b;

    /* renamed from: c */
    public final C0309e0 f2055c;

    public C0311f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6122q);
    }

    public C0311f(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0308e c0308e = new C0308e(this);
        this.f2054b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f2055c = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        c0309e0.m1332b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2054b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC8494b.f39857e0) {
            return super.getAutoSizeMaxTextSize();
        }
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            return c0309e0.m1338i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2054b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2054b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2055c.m1339j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2055c.m1340k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1344o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 == null || InterfaceC8494b.f39857e0 || !c0309e0.m1341l()) {
            return;
        }
        this.f2055c.m1333c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (InterfaceC8494b.f39857e0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
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
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1351v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2054b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2054b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1348s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2054b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2054b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    @Override // p314s0.InterfaceC8515w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2055c.m1352w(colorStateList);
        this.f2055c.m1332b();
    }

    @Override // p314s0.InterfaceC8515w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2055c.m1353x(mode);
        this.f2055c.m1332b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1346q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (InterfaceC8494b.f39857e0) {
            super.setTextSize(i10, f10);
            return;
        }
        C0309e0 c0309e0 = this.f2055c;
        if (c0309e0 != null) {
            c0309e0.m1328A(i10, f10);
        }
    }
}
