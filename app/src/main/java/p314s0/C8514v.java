package p314s0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p235o0.C6811c;
import p235o0.InterfaceC6861x;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/v.class
 */
/* renamed from: s0.v */
/* loaded from: combined.jar:classes1.jar:s0/v.class */
public final class C8514v implements InterfaceC6861x {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s0/v$a.class
     */
    /* renamed from: s0.v$a */
    /* loaded from: combined.jar:classes1.jar:s0/v$a.class */
    public static final class a {
        /* renamed from: a */
        public static CharSequence m36734a(Context context, ClipData.Item item, int i10) {
            if ((i10 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            CharSequence charSequence = coerceToText;
            if (coerceToText instanceof Spanned) {
                charSequence = coerceToText.toString();
            }
            return charSequence;
        }
    }

    /* renamed from: b */
    public static CharSequence m36732b(Context context, ClipData.Item item, int i10) {
        return a.m36734a(context, item, i10);
    }

    /* renamed from: c */
    public static void m36733c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // p235o0.InterfaceC6861x
    /* renamed from: a */
    public C6811c mo31663a(View view, C6811c c6811c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c6811c);
        }
        if (c6811c.m31382d() == 2) {
            return c6811c;
        }
        ClipData m31380b = c6811c.m31380b();
        int m31381c = c6811c.m31381c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (i10 >= m31380b.getItemCount()) {
                return null;
            }
            CharSequence m36732b = m36732b(context, m31380b.getItemAt(i10), m31381c);
            boolean z12 = z11;
            if (m36732b != null) {
                if (z11) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m36732b);
                    z12 = z11;
                } else {
                    m36733c(editable, m36732b);
                    z12 = true;
                }
            }
            i10++;
            z10 = z12;
        }
    }
}
