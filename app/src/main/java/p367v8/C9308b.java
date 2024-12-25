package p367v8;

import android.text.TextUtils;
import ec.C4699b;
import java.util.regex.Pattern;
import p099fc.AbstractC4842x;
import p099fc.C4833s0;
import p099fc.C4844y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/b.class
 */
/* renamed from: v8.b */
/* loaded from: combined.jar:classes2.jar:v8/b.class */
public final class C9308b {

    /* renamed from: d */
    public static final Pattern f42442d = Pattern.compile("\\s+");

    /* renamed from: e */
    public static final AbstractC4842x<String> f42443e = AbstractC4842x.m24594F("auto", "none");

    /* renamed from: f */
    public static final AbstractC4842x<String> f42444f = AbstractC4842x.m24595G("dot", "sesame", "circle");

    /* renamed from: g */
    public static final AbstractC4842x<String> f42445g = AbstractC4842x.m24594F("filled", "open");

    /* renamed from: h */
    public static final AbstractC4842x<String> f42446h = AbstractC4842x.m24595G("after", "before", "outside");

    /* renamed from: a */
    public final int f42447a;

    /* renamed from: b */
    public final int f42448b;

    /* renamed from: c */
    public final int f42449c;

    public C9308b(int i10, int i11, int i12) {
        this.f42447a = i10;
        this.f42448b = i11;
        this.f42449c = i12;
    }

    /* renamed from: a */
    public static C9308b m39237a(String str) {
        if (str == null) {
            return null;
        }
        String m23638e = C4699b.m23638e(str.trim());
        if (m23638e.isEmpty()) {
            return null;
        }
        return m39238b(AbstractC4842x.m24600y(TextUtils.split(m23638e, f42442d)));
    }

    /* renamed from: b */
    public static C9308b m39238b(AbstractC4842x<String> abstractC4842x) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String str = (String) C4844y.m24602b(C4833s0.m24531c(f42446h, abstractC4842x), "outside");
        int hashCode = str.hashCode();
        int i10 = -1;
        if (hashCode == -1392885889) {
            if (str.equals("before")) {
                z10 = 2;
            }
            z10 = -1;
        } else if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str.equals("after")) {
                z10 = false;
            }
            z10 = -1;
        } else {
            if (str.equals("outside")) {
                z10 = true;
            }
            z10 = -1;
        }
        int i11 = z10 ? !z10 ? 1 : -2 : 2;
        C4833s0.c m24531c = C4833s0.m24531c(f42443e, abstractC4842x);
        if (!m24531c.isEmpty()) {
            String str2 = (String) m24531c.iterator().next();
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 3005871) {
                if (hashCode2 == 3387192 && str2.equals("none")) {
                    z13 = false;
                }
                z13 = -1;
            } else {
                if (str2.equals("auto")) {
                    z13 = true;
                }
                z13 = -1;
            }
            if (!z13) {
                i10 = 0;
            }
            return new C9308b(i10, 0, i11);
        }
        C4833s0.c m24531c2 = C4833s0.m24531c(f42445g, abstractC4842x);
        C4833s0.c m24531c3 = C4833s0.m24531c(f42444f, abstractC4842x);
        if (m24531c2.isEmpty() && m24531c3.isEmpty()) {
            return new C9308b(-1, 0, i11);
        }
        String str3 = (String) C4844y.m24602b(m24531c2, "filled");
        int hashCode3 = str3.hashCode();
        if (hashCode3 != -1274499742) {
            if (hashCode3 == 3417674 && str3.equals("open")) {
                z11 = false;
            }
            z11 = -1;
        } else {
            if (str3.equals("filled")) {
                z11 = true;
            }
            z11 = -1;
        }
        int i12 = z11 ? 1 : 2;
        String str4 = (String) C4844y.m24602b(m24531c3, "circle");
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1360216880) {
            z12 = -1;
            if (str4.equals("circle")) {
                z12 = 2;
            }
        } else if (hashCode4 == -905816648) {
            z12 = -1;
            if (str4.equals("sesame")) {
                z12 = true;
            }
        } else if (hashCode4 != 99657) {
            z12 = -1;
        } else {
            z12 = -1;
            if (str4.equals("dot")) {
                z12 = false;
            }
        }
        int i13 = 2;
        if (z12) {
            i13 = !z12 ? 1 : 3;
        }
        return new C9308b(i13, i12, i11);
    }
}
