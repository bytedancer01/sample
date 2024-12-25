package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p413y0.C9798k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/SearchEditText.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchEditText.class */
public class SearchEditText extends C0501c1 {

    /* renamed from: j */
    public static final String f3328j = SearchEditText.class.getSimpleName();

    /* renamed from: i */
    public InterfaceC0487a f3329i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/SearchEditText$a.class
     */
    /* renamed from: androidx.leanback.widget.SearchEditText$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/SearchEditText$a.class */
    public interface InterfaceC0487a {
        /* renamed from: a */
        void mo2512a();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9798k.f45032a);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.leanback.widget.C0501c1
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo2517e() {
        super.mo2517e();
    }

    @Override // androidx.leanback.widget.C0501c1
    /* renamed from: g */
    public /* bridge */ /* synthetic */ void mo2518g(String str, String str2) {
        super.mo2518g(str, str2);
    }

    @Override // androidx.leanback.widget.C0501c1, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i10, keyEvent);
        }
        InterfaceC0487a interfaceC0487a = this.f3329i;
        if (interfaceC0487a == null) {
            return false;
        }
        interfaceC0487a.mo2512a();
        return false;
    }

    @Override // androidx.leanback.widget.C0501c1, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.leanback.widget.C0501c1
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(InterfaceC0487a interfaceC0487a) {
        this.f3329i = interfaceC0487a;
    }
}
