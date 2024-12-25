package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p029c.C0920a;
import p235o0.C6811c;
import p235o0.C6824g0;
import p235o0.InterfaceC6863y;
import p295r0.C7939b;
import p295r0.C7940c;
import p314s0.C8513u;
import p314s0.C8514v;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/j.class
 */
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/j.class */
public class C0323j extends EditText implements InterfaceC6863y {

    /* renamed from: b */
    public final C0308e f2144b;

    /* renamed from: c */
    public final C0309e0 f2145c;

    /* renamed from: d */
    public final C0364x f2146d;

    /* renamed from: e */
    public final C8514v f2147e;

    public C0323j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0920a.f6089D);
    }

    public C0323j(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0308e c0308e = new C0308e(this);
        this.f2144b = c0308e;
        c0308e.m1320e(attributeSet, i10);
        C0309e0 c0309e0 = new C0309e0(this);
        this.f2145c = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        c0309e0.m1332b();
        this.f2146d = new C0364x(this);
        this.f2147e = new C8514v();
    }

    @Override // p235o0.InterfaceC6863y
    /* renamed from: a */
    public C6811c mo1460a(C6811c c6811c) {
        return this.f2147e.mo31663a(this, c6811c);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0308e c0308e = this.f2144b;
        if (c0308e != null) {
            c0308e.m1317b();
        }
        C0309e0 c0309e0 = this.f2145c;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0308e c0308e = this.f2144b;
        return c0308e != null ? c0308e.m1318c() : null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0308e c0308e = this.f2144b;
        return c0308e != null ? c0308e.m1319d() : null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0364x c0364x;
        return (Build.VERSION.SDK_INT >= 28 || (c0364x = this.f2146d) == null) ? super.getTextClassifier() : c0364x.m1678a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2145c.m1347r(this, onCreateInputConnection, editorInfo);
        InputConnection m1462a = C0326k.m1462a(onCreateInputConnection, editorInfo, this);
        String[] m31479F = C6824g0.m31479F(this);
        InputConnection inputConnection = m1462a;
        if (m1462a != null) {
            inputConnection = m1462a;
            if (m31479F != null) {
                C7939b.m34460d(editorInfo, m31479F);
                inputConnection = C7940c.m34466a(m1462a, editorInfo, C0347r.m1564a(this));
            }
        }
        return inputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0347r.m1565b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C0347r.m1566c(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0308e c0308e = this.f2144b;
        if (c0308e != null) {
            c0308e.m1321f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0308e c0308e = this.f2144b;
        if (c0308e != null) {
            c0308e.m1322g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0308e c0308e = this.f2144b;
        if (c0308e != null) {
            c0308e.m1324i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0308e c0308e = this.f2144b;
        if (c0308e != null) {
            c0308e.m1325j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0309e0 c0309e0 = this.f2145c;
        if (c0309e0 != null) {
            c0309e0.m1346q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0364x c0364x;
        if (Build.VERSION.SDK_INT >= 28 || (c0364x = this.f2146d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0364x.m1679b(textClassifier);
        }
    }
}
