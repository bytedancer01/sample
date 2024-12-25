package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p068e.C4561b;
import p314s0.C8513u;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/g.class
 */
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/g.class */
public class C0314g extends CheckedTextView {

    /* renamed from: c */
    public static final int[] f2064c = {R.attr.checkMark};

    /* renamed from: b */
    public final C0309e0 f2065b;

    public C0314g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public C0314g(Context context, AttributeSet attributeSet, int i10) {
        super(C0328k1.m1464b(context), attributeSet, i10);
        C0322i1.m1454a(this, getContext());
        C0309e0 c0309e0 = new C0309e0(this);
        this.f2065b = c0309e0;
        c0309e0.m1342m(attributeSet, i10);
        c0309e0.m1332b();
        C0337n1 m1505v = C0337n1.m1505v(getContext(), attributeSet, f2064c, i10, 0);
        setCheckMarkDrawable(m1505v.m1512g(0));
        m1505v.m1525w();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0309e0 c0309e0 = this.f2065b;
        if (c0309e0 != null) {
            c0309e0.m1332b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0326k.m1462a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C4561b.m22999d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0309e0 c0309e0 = this.f2065b;
        if (c0309e0 != null) {
            c0309e0.m1346q(context, i10);
        }
    }
}
