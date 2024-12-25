package p355uf;

import android.net.Uri;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:uf/b.class
 */
/* renamed from: uf.b */
/* loaded from: combined.jar:classes2.jar:uf/b.class */
public class C9174b {

    /* renamed from: a */
    public static InputFilter f41943a = new b();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:uf/b$a.class
     */
    /* renamed from: uf.b$a */
    /* loaded from: combined.jar:classes2.jar:uf/b$a.class */
    public class a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            while (i10 < i11) {
                if (Character.isWhitespace(charSequence.charAt(i10))) {
                    return "";
                }
                i10++;
            }
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:uf/b$b.class
     */
    /* renamed from: uf.b$b */
    /* loaded from: combined.jar:classes2.jar:uf/b$b.class */
    public class b implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            while (i10 < i11) {
                if (Character.getType(charSequence.charAt(i10)) == 19) {
                    return "";
                }
                i10++;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m38607a(EditText editText) {
        editText.setFilters(new InputFilter[]{new a()});
    }

    /* renamed from: b */
    public static boolean m38608b(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m38609c(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
}
