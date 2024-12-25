package p322s8;

import android.text.Spannable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s8/d.class
 */
/* renamed from: s8.d */
/* loaded from: combined.jar:classes2.jar:s8/d.class */
public final class C8548d {
    /* renamed from: a */
    public static void m36774a(Spannable spannable, Object obj, int i10, int i11, int i12) {
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == i12) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, i12);
    }
}
