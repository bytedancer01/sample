package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import p314s0.C8513u;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/GuidedActionEditText.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidedActionEditText.class */
public class GuidedActionEditText extends EditText {

    /* renamed from: b */
    public InterfaceC0534q f3195b;

    /* renamed from: c */
    public InterfaceC0526n f3196c;

    /* renamed from: d */
    public final Drawable f3197d;

    /* renamed from: e */
    public final Drawable f3198e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/GuidedActionEditText$a.class
     */
    /* renamed from: androidx.leanback.widget.GuidedActionEditText$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/GuidedActionEditText$a.class */
    public static final class C0467a extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3197d = getBackground();
        C0467a c0467a = new C0467a();
        this.f3198e = c0467a;
        setBackground(c0467a);
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        InterfaceC0526n interfaceC0526n = this.f3196c;
        if (interfaceC0526n != null) {
            interfaceC0526n.m2911a(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        setBackground(z10 ? this.f3197d : this.f3198e);
        if (z10) {
            return;
        }
        setFocusable(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        InterfaceC0534q interfaceC0534q = this.f3195b;
        boolean m2933a = interfaceC0534q != null ? interfaceC0534q.m2933a(this, i10, keyEvent) : false;
        boolean z10 = m2933a;
        if (!m2933a) {
            z10 = super.onKeyPreIme(i10, keyEvent);
        }
        return z10;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8513u.m36725q(this, callback));
    }

    public void setImeKeyListener(InterfaceC0534q interfaceC0534q) {
        this.f3195b = interfaceC0534q;
    }

    public void setOnAutofillListener(InterfaceC0526n interfaceC0526n) {
        this.f3196c = interfaceC0526n;
    }
}
