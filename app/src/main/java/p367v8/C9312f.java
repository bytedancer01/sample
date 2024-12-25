package p367v8;

import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import org.apache.commons.net.SocketClient;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p322s8.C8545a;
import p322s8.C8547c;
import p322s8.C8548d;
import p322s8.C8549e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/f.class
 */
/* renamed from: v8.f */
/* loaded from: combined.jar:classes2.jar:v8/f.class */
public final class C9312f {
    /* renamed from: a */
    public static void m39270a(Spannable spannable, int i10, int i11, C9313g c9313g, C9310d c9310d, Map<String, C9313g> map, int i12) {
        C9310d m39274e;
        Object c8547c;
        Parcelable absoluteSizeSpan;
        int i13;
        if (c9313g.m39298l() != -1) {
            spannable.setSpan(new StyleSpan(c9313g.m39298l()), i10, i11, 33);
        }
        if (c9313g.m39305s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c9313g.m39306t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c9313g.m39303q()) {
            C8548d.m36774a(spannable, new ForegroundColorSpan(c9313g.m39289c()), i10, i11, 33);
        }
        if (c9313g.m39302p()) {
            C8548d.m36774a(spannable, new BackgroundColorSpan(c9313g.m39288b()), i10, i11, 33);
        }
        if (c9313g.m39290d() != null) {
            C8548d.m36774a(spannable, new TypefaceSpan(c9313g.m39290d()), i10, i11, 33);
        }
        if (c9313g.m39301o() != null) {
            C9308b c9308b = (C9308b) C4349a.m21882e(c9313g.m39301o());
            int i14 = c9308b.f42447a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = c9308b.f42448b;
            }
            int i15 = c9308b.f42449c;
            int i16 = i15;
            if (i15 == -2) {
                i16 = 1;
            }
            C8548d.m36774a(spannable, new C8549e(i14, i13, i16), i10, i11, 33);
        }
        int m39296j = c9313g.m39296j();
        if (m39296j == 2) {
            C9310d m39273d = m39273d(c9310d, map);
            if (m39273d != null && (m39274e = m39274e(m39273d, map)) != null) {
                if (m39274e.m39261g() != 1 || m39274e.m39260f(0).f42468b == null) {
                    C4392v.m22273g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C4401z0.m22391j(m39274e.m39260f(0).f42468b);
                    C9313g m39275f = m39275f(m39274e.f42472f, m39274e.m39265l(), map);
                    int m39295i = m39275f != null ? m39275f.m39295i() : -1;
                    int i17 = m39295i;
                    if (m39295i == -1) {
                        C9313g m39275f2 = m39275f(m39273d.f42472f, m39273d.m39265l(), map);
                        i17 = m39295i;
                        if (m39275f2 != null) {
                            i17 = m39275f2.m39295i();
                        }
                    }
                    c8547c = new C8547c(str, i17);
                    spannable.setSpan(c8547c, i10, i11, 33);
                }
            }
        } else if (m39296j == 3 || m39296j == 4) {
            c8547c = new C9307a();
            spannable.setSpan(c8547c, i10, i11, 33);
        }
        if (c9313g.m39300n()) {
            C8548d.m36774a(spannable, new C8545a(), i10, i11, 33);
        }
        int m39292f = c9313g.m39292f();
        if (m39292f == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) c9313g.m39291e(), true);
        } else if (m39292f == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(c9313g.m39291e());
        } else if (m39292f != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(c9313g.m39291e() / 100.0f);
        }
        C8548d.m36774a(spannable, absoluteSizeSpan, i10, i11, 33);
    }

    /* renamed from: b */
    public static String m39271b(String str) {
        return str.replaceAll(SocketClient.NETASCII_EOL, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m39272c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    /* renamed from: d */
    public static C9310d m39273d(C9310d c9310d, Map<String, C9313g> map) {
        while (c9310d != null) {
            C9313g m39275f = m39275f(c9310d.f42472f, c9310d.m39265l(), map);
            if (m39275f != null && m39275f.m39296j() == 1) {
                return c9310d;
            }
            c9310d = c9310d.f42476j;
        }
        return null;
    }

    /* renamed from: e */
    public static C9310d m39274e(C9310d c9310d, Map<String, C9313g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c9310d);
        while (!arrayDeque.isEmpty()) {
            C9310d c9310d2 = (C9310d) arrayDeque.pop();
            C9313g m39275f = m39275f(c9310d2.f42472f, c9310d2.m39265l(), map);
            if (m39275f != null && m39275f.m39296j() == 3) {
                return c9310d2;
            }
            for (int m39261g = c9310d2.m39261g() - 1; m39261g >= 0; m39261g--) {
                arrayDeque.push(c9310d2.m39260f(m39261g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C9313g m39275f(C9313g c9313g, String[] strArr, Map<String, C9313g> map) {
        if (c9313g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C9313g c9313g2 = new C9313g();
                for (String str : strArr) {
                    c9313g2.m39287a(map.get(str));
                }
                return c9313g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c9313g.m39287a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                for (String str2 : strArr) {
                    c9313g.m39287a(map.get(str2));
                }
            }
        }
        return c9313g;
    }
}
