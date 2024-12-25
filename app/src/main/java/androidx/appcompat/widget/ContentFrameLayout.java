package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/ContentFrameLayout.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ContentFrameLayout.class */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f1776b;

    /* renamed from: c */
    public TypedValue f1777c;

    /* renamed from: d */
    public TypedValue f1778d;

    /* renamed from: e */
    public TypedValue f1779e;

    /* renamed from: f */
    public TypedValue f1780f;

    /* renamed from: g */
    public TypedValue f1781g;

    /* renamed from: h */
    public final Rect f1782h;

    /* renamed from: i */
    public InterfaceC0269a f1783i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/ContentFrameLayout$a.class
     */
    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/ContentFrameLayout$a.class */
    public interface InterfaceC0269a {
        /* renamed from: a */
        void mo1121a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1782h = new Rect();
    }

    /* renamed from: a */
    public void m1120a(int i10, int i11, int i12, int i13) {
        this.f1782h.set(i10, i11, i12, i13);
        if (C6824g0.m31502U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1780f == null) {
            this.f1780f = new TypedValue();
        }
        return this.f1780f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1781g == null) {
            this.f1781g = new TypedValue();
        }
        return this.f1781g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1778d == null) {
            this.f1778d = new TypedValue();
        }
        return this.f1778d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1779e == null) {
            this.f1779e = new TypedValue();
        }
        return this.f1779e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1776b == null) {
            this.f1776b = new TypedValue();
        }
        return this.f1776b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1777c == null) {
            this.f1777c = new TypedValue();
        }
        return this.f1777c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0269a interfaceC0269a = this.f1783i;
        if (interfaceC0269a != null) {
            interfaceC0269a.mo1121a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0269a interfaceC0269a = this.f1783i;
        if (interfaceC0269a != null) {
            interfaceC0269a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r5, int r6) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0269a interfaceC0269a) {
        this.f1783i = interfaceC0269a;
    }
}
