package gh;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import p135hh.C5117y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:gh/b.class
 */
/* renamed from: gh.b */
/* loaded from: combined.jar:classes2.jar:gh/b.class */
public class C5011b {

    /* renamed from: a */
    public Context f29045a;

    public C5011b(Context context) {
        this.f29045a = context;
    }

    /* renamed from: a */
    public void m25204a(String str) {
        Set<String> m25207d = m25207d();
        m25207d.add(str);
        m25209f(m25207d);
    }

    /* renamed from: b */
    public boolean m25205b(Context context, String str) {
        String str2 = str;
        if (str == null) {
            str2 = "de.blinkt.openvpn.ANYPACKAGE";
        }
        if (m25208e(str2)) {
            return true;
        }
        Intent intent = new Intent(context, (Class<?>) ActivityC5010a.class);
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.PACKAGE_NAME", str2);
        context.startActivity(intent);
        return false;
    }

    /* renamed from: c */
    public void m25206c() {
        m25209f(new HashSet());
    }

    /* renamed from: d */
    public Set<String> m25207d() {
        return C5117y.m25656a(this.f29045a).getStringSet("allowed_apps", new HashSet());
    }

    /* renamed from: e */
    public boolean m25208e(String str) {
        return m25207d().contains(str);
    }

    /* renamed from: f */
    public final void m25209f(Set<String> set) {
        SharedPreferences m25656a = C5117y.m25656a(this.f29045a);
        SharedPreferences.Editor edit = m25656a.edit();
        edit.putStringSet("allowed_apps", set);
        edit.putInt("counter", m25656a.getInt("counter", 0) + 1);
        edit.apply();
    }
}
