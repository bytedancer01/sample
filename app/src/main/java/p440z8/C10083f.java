package p440z8;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p059d9.C4349a;
import p059d9.C4400z;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/f.class
 */
/* renamed from: z8.f */
/* loaded from: combined.jar:classes2.jar:z8/f.class */
public class C10083f implements InterfaceC10124z0 {

    /* renamed from: a */
    public final Resources f46257a;

    public C10083f(Resources resources) {
        this.f46257a = (Resources) C4349a.m21882e(resources);
    }

    /* renamed from: i */
    public static int m42398i(C7629w0 c7629w0) {
        int m22304l = C4400z.m22304l(c7629w0.f37086m);
        if (m22304l != -1) {
            return m22304l;
        }
        if (C4400z.m22307o(c7629w0.f37083j) != null) {
            return 2;
        }
        if (C4400z.m22295c(c7629w0.f37083j) != null) {
            return 1;
        }
        if (c7629w0.f37091r == -1 && c7629w0.f37092s == -1) {
            return (c7629w0.f37099z == -1 && c7629w0.f37068A == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // p440z8.InterfaceC10124z0
    /* renamed from: a */
    public String mo42399a(C7629w0 c7629w0) {
        int m42398i = m42398i(c7629w0);
        String m42407j = m42398i == 2 ? m42407j(m42406h(c7629w0), m42405g(c7629w0), m42401c(c7629w0)) : m42398i == 1 ? m42407j(m42403e(c7629w0), m42400b(c7629w0), m42401c(c7629w0)) : m42403e(c7629w0);
        String str = m42407j;
        if (m42407j.length() == 0) {
            str = this.f46257a.getString(C10113u.f46371H);
        }
        return str;
    }

    /* renamed from: b */
    public final String m42400b(C7629w0 c7629w0) {
        Resources resources;
        int i10;
        int i11 = c7629w0.f37099z;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            resources = this.f46257a;
            i10 = C10113u.f46392u;
        } else if (i11 == 2) {
            resources = this.f46257a;
            i10 = C10113u.f46367D;
        } else if (i11 == 6 || i11 == 7) {
            resources = this.f46257a;
            i10 = C10113u.f46369F;
        } else if (i11 != 8) {
            resources = this.f46257a;
            i10 = C10113u.f46368E;
        } else {
            resources = this.f46257a;
            i10 = C10113u.f46370G;
        }
        return resources.getString(i10);
    }

    /* renamed from: c */
    public final String m42401c(C7629w0 c7629w0) {
        int i10 = c7629w0.f37082i;
        return i10 == -1 ? "" : this.f46257a.getString(C10113u.f46391t, Float.valueOf(i10 / 1000000.0f));
    }

    /* renamed from: d */
    public final String m42402d(C7629w0 c7629w0) {
        return TextUtils.isEmpty(c7629w0.f37076c) ? "" : c7629w0.f37076c;
    }

    /* renamed from: e */
    public final String m42403e(C7629w0 c7629w0) {
        String m42407j = m42407j(m42404f(c7629w0), m42406h(c7629w0));
        String str = m42407j;
        if (TextUtils.isEmpty(m42407j)) {
            str = m42402d(c7629w0);
        }
        return str;
    }

    /* renamed from: f */
    public final String m42404f(C7629w0 c7629w0) {
        String str = c7629w0.f37077d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (C4401z0.f26679a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    /* renamed from: g */
    public final String m42405g(C7629w0 c7629w0) {
        int i10 = c7629w0.f37091r;
        int i11 = c7629w0.f37092s;
        return (i10 == -1 || i11 == -1) ? "" : this.f46257a.getString(C10113u.f46393v, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    /* renamed from: h */
    public final String m42406h(C7629w0 c7629w0) {
        String string = (c7629w0.f37079f & 2) != 0 ? this.f46257a.getString(C10113u.f46394w) : "";
        String str = string;
        if ((c7629w0.f37079f & 4) != 0) {
            str = m42407j(string, this.f46257a.getString(C10113u.f46397z));
        }
        String str2 = str;
        if ((c7629w0.f37079f & 8) != 0) {
            str2 = m42407j(str, this.f46257a.getString(C10113u.f46396y));
        }
        String str3 = str2;
        if ((c7629w0.f37079f & 1088) != 0) {
            str3 = m42407j(str2, this.f46257a.getString(C10113u.f46395x));
        }
        return str3;
    }

    /* renamed from: j */
    public final String m42407j(String... strArr) {
        int length = strArr.length;
        String str = "";
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            String str3 = str;
            if (str2.length() > 0) {
                str3 = TextUtils.isEmpty(str) ? str2 : this.f46257a.getString(C10113u.f46390s, str, str2);
            }
            i10++;
            str = str3;
        }
        return str;
    }
}
