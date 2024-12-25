package p295r0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p221n0.C6616h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r0/b.class
 */
/* renamed from: r0.b */
/* loaded from: combined.jar:classes1.jar:r0/b.class */
public final class C7939b {

    /* renamed from: a */
    public static final String[] f38203a = new String[0];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:r0/b$a.class
     */
    /* renamed from: r0.b$a */
    /* loaded from: combined.jar:classes1.jar:r0/b$a.class */
    public static class a {
        /* renamed from: a */
        public static void m34465a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    /* renamed from: a */
    public static String[] m34457a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                strArr = f38203a;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f38203a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        String[] strArr2 = stringArray;
        if (stringArray == null) {
            strArr2 = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (strArr2 == null) {
            strArr2 = f38203a;
        }
        return strArr2;
    }

    /* renamed from: b */
    public static boolean m34458b(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    /* renamed from: c */
    public static boolean m34459c(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    /* renamed from: d */
    public static void m34460d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m34461e(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        C6616h.m30527e(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m34465a(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            m34463g(editorInfo, null, 0, 0);
            return;
        }
        if (m34459c(editorInfo.inputType)) {
            m34463g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m34463g(editorInfo, charSequence, i13, i14);
        } else {
            m34464h(editorInfo, charSequence, i13, i14);
        }
    }

    /* renamed from: f */
    public static void m34462f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m34465a(editorInfo, charSequence, 0);
        } else {
            m34461e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    public static void m34463g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    /* renamed from: h */
    public static void m34464h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        int i16 = min2;
        int i17 = i15;
        if (m34458b(charSequence, i15, 0)) {
            i17 = i15 + 1;
            i16 = min2 - 1;
        }
        int i18 = min;
        if (m34458b(charSequence, (i11 + min) - 1, 1)) {
            i18 = min - 1;
        }
        CharSequence concat = i13 != i12 ? TextUtils.concat(charSequence.subSequence(i17, i17 + i16), charSequence.subSequence(i11, i18 + i11)) : charSequence.subSequence(i17, i16 + i13 + i18 + i17);
        int i19 = i16 + 0;
        m34463g(editorInfo, concat, i19, i13 + i19);
    }
}
