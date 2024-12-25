package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/k.class
 */
/* renamed from: androidx.appcompat.widget.k */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/k.class */
public class C0326k {
    /* renamed from: a */
    public static InputConnection m1462a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                ViewParent viewParent = parent;
                if (!(viewParent instanceof View)) {
                    break;
                }
                if (viewParent instanceof InterfaceC0361v1) {
                    editorInfo.hintText = ((InterfaceC0361v1) viewParent).m1644a();
                    break;
                }
                parent = viewParent.getParent();
            }
        }
        return inputConnection;
    }
}
