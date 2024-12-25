package p272pc;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p060da.C4403b;
import ua.C8871c6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pc/b.class
 */
/* renamed from: pc.b */
/* loaded from: combined.jar:classes2.jar:pc/b.class */
public final class C7700b {

    /* renamed from: a */
    public static final Set<String> f37441a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    public static final List<String> f37442b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final List<String> f37443c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    public static final List<String> f37444d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    public static final List<String> f37445e = Arrays.asList((String[]) C4403b.m22427a(new String[]{C8871c6.f40990a, C8871c6.f40991b}));

    /* renamed from: f */
    public static final List<String> f37446f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static boolean m33639a(String str) {
        return !f37443c.contains(str);
    }

    /* renamed from: b */
    public static boolean m33640b(String str, Bundle bundle) {
        if (f37442b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f37444d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m33641c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f37445e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f37446f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static boolean m33642d(String str, String str2, Bundle bundle) {
        boolean z10;
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m33639a(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = f37444d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                z10 = false;
            }
            z10 = -1;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                z10 = 2;
            }
            z10 = -1;
        } else {
            if (str.equals("fdl")) {
                z10 = true;
            }
            z10 = -1;
        }
        if (!z10) {
            str3 = "fcm_integration";
        } else if (z10) {
            str3 = "fdl_integration";
        } else {
            if (z10 != 2) {
                return false;
            }
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    /* renamed from: e */
    public static void m33643e(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }
}
