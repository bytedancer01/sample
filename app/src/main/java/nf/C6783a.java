package nf;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nf/a.class
 */
/* renamed from: nf.a */
/* loaded from: combined.jar:classes2.jar:nf/a.class */
public class C6783a {

    /* renamed from: a */
    public Context f35389a;

    /* renamed from: b */
    public SharedPreferences f35390b;

    /* renamed from: c */
    public SharedPreferences f35391c;

    /* renamed from: d */
    public SharedPreferences f35392d;

    /* renamed from: e */
    public SharedPreferences f35393e;

    /* renamed from: f */
    public SharedPreferences f35394f;

    /* renamed from: g */
    public SharedPreferences f35395g;

    /* renamed from: h */
    public SharedPreferences f35396h;

    /* renamed from: i */
    public SharedPreferences f35397i;

    /* renamed from: j */
    public SharedPreferences f35398j;

    /* renamed from: k */
    public SharedPreferences f35399k;

    /* renamed from: l */
    public SharedPreferences.Editor f35400l;

    /* renamed from: m */
    public SharedPreferences.Editor f35401m;

    /* renamed from: n */
    public SharedPreferences.Editor f35402n;

    /* renamed from: o */
    public SharedPreferences f35403o;

    public C6783a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f35389a = applicationContext;
        this.f35390b = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        this.f35391c = this.f35389a.getSharedPreferences("pref.using_opensl_es", 0);
        this.f35398j = this.f35389a.getSharedPreferences("pref.using_opengl", 0);
        SharedPreferences sharedPreferences = this.f35389a.getSharedPreferences("pref.using_media_codec", 0);
        this.f35399k = sharedPreferences;
        this.f35400l = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = this.f35389a.getSharedPreferences("auto_start", 0);
        this.f35394f = sharedPreferences2;
        this.f35401m = sharedPreferences2.edit();
        SharedPreferences sharedPreferences3 = this.f35389a.getSharedPreferences("pref.billing_p", 0);
        this.f35397i = sharedPreferences3;
        this.f35402n = sharedPreferences3.edit();
        this.f35392d = this.f35389a.getSharedPreferences("pref.using_infbuf", 0);
        this.f35393e = this.f35389a.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f35394f = this.f35389a.getSharedPreferences("auto_start", 0);
        this.f35395g = this.f35389a.getSharedPreferences("automation_channels", 0);
        this.f35396h = this.f35389a.getSharedPreferences("automation_epg", 0);
        this.f35403o = this.f35389a.getSharedPreferences("loginPrefs", 0);
    }

    /* renamed from: A */
    public boolean m31242A() {
        return this.f35394f.getBoolean("show_epg_in_channels_list", C5251a.f30045i0);
    }

    /* renamed from: B */
    public String m31243B() {
        return this.f35403o.getString("serverTimeZone", C5251a.f30041g0);
    }

    /* renamed from: C */
    public boolean m31244C() {
        return this.f35399k.getString("pref.using_media_codec", C5251a.f30035d0).equals(this.f35389a.getResources().getString(2132017829));
    }

    /* renamed from: D */
    public boolean m31245D() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018370), false);
    }

    /* renamed from: E */
    public boolean m31246E() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018371), false);
    }

    /* renamed from: F */
    public boolean m31247F() {
        return this.f35391c.getString("pref.using_opensl_es", "").equals("checked");
    }

    /* renamed from: G */
    public Boolean m31248G() {
        return Boolean.valueOf(this.f35394f.getBoolean("full_epg", true));
    }

    /* renamed from: H */
    public void m31249H(Boolean bool) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putBoolean("subtitle_active", bool.booleanValue());
            this.f35401m.apply();
        }
    }

    /* renamed from: I */
    public void m31250I(boolean z10) {
        try {
            SharedPreferences.Editor editor = this.f35401m;
            if (editor != null) {
                editor.putBoolean("auto_clear_cache", z10);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: J */
    public void m31251J(String str) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.f35401m.apply();
        }
    }

    /* renamed from: K */
    public void m31252K(Boolean bool) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putBoolean("autoplay", bool.booleanValue());
            this.f35401m.apply();
        }
    }

    /* renamed from: L */
    public void m31253L(Boolean bool) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putBoolean("auto_start", bool.booleanValue());
            this.f35401m.apply();
        }
    }

    /* renamed from: M */
    public void m31254M(boolean z10) {
        try {
            SharedPreferences.Editor editor = this.f35401m;
            if (editor != null) {
                editor.putBoolean("auto_play_channel_in_live", z10);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: N */
    public void m31255N() {
        try {
            this.f35402n.putString("pref_billing_p_date", String.valueOf(System.currentTimeMillis()));
            this.f35402n.apply();
        } catch (Exception e10) {
        }
    }

    /* renamed from: O */
    public void m31256O(int i10) {
        try {
            this.f35401m.putInt("pref.brightness", i10);
            this.f35401m.apply();
        } catch (Exception e10) {
        }
    }

    /* renamed from: P */
    public void m31257P(boolean z10) {
        try {
            SharedPreferences.Editor editor = this.f35401m;
            if (editor != null) {
                editor.putBoolean("show_epg_in_channels_list", z10);
            }
        } catch (Exception e10) {
        }
    }

    /* renamed from: Q */
    public void m31258Q(String str) {
        this.f35400l.putString("pref.using_media_codec", str);
        this.f35400l.apply();
    }

    /* renamed from: R */
    public void m31259R(int i10) {
        try {
            this.f35401m.putInt("recently_added_limit", i10);
            this.f35401m.apply();
        } catch (Exception e10) {
        }
    }

    /* renamed from: S */
    public void m31260S(int i10) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i10);
            this.f35401m.apply();
        }
    }

    /* renamed from: T */
    public void m31261T(String str) {
        try {
            this.f35401m.putString("pref.screen_type", str);
            this.f35401m.apply();
        } catch (Exception e10) {
        }
    }

    /* renamed from: U */
    public void m31262U(Boolean bool) {
        SharedPreferences.Editor editor = this.f35401m;
        if (editor != null) {
            editor.putBoolean("full_epg", bool.booleanValue());
            this.f35401m.apply();
        }
    }

    /* renamed from: a */
    public void m31263a() {
        try {
            this.f35402n.clear().commit();
        } catch (Exception e10) {
        }
    }

    /* renamed from: b */
    public Boolean m31264b() {
        return Boolean.valueOf(this.f35394f.getBoolean("subtitle_active", true));
    }

    /* renamed from: c */
    public boolean m31265c() {
        return this.f35394f.getBoolean("auto_clear_cache", C5251a.f30043h0);
    }

    /* renamed from: d */
    public String m31266d() {
        return this.f35394f.getString("autoplay_seconds", C5251a.f30031b0);
    }

    /* renamed from: e */
    public Boolean m31267e() {
        return Boolean.valueOf(this.f35394f.getBoolean("autoplay", true));
    }

    /* renamed from: f */
    public Boolean m31268f() {
        return Boolean.valueOf(this.f35394f.getBoolean("auto_start", true));
    }

    /* renamed from: g */
    public int m31269g() {
        return this.f35395g.getInt("automation_channels_days", C5251a.f30051l0);
    }

    /* renamed from: h */
    public int m31270h() {
        return this.f35396h.getInt("automation_epg_days", C5251a.f30059p0);
    }

    /* renamed from: i */
    public boolean m31271i() {
        return this.f35394f.getBoolean("auto_play_channel_in_live", C5251a.f30047j0);
    }

    /* renamed from: j */
    public String m31272j() {
        String str = "";
        try {
            str = this.f35397i.getString("pref_billing_p_date", "");
        } catch (Exception e10) {
        }
        return str;
    }

    /* renamed from: k */
    public String m31273k() {
        String str = "";
        try {
            str = this.f35397i.getString("pref_billing_p_email", "");
        } catch (Exception e10) {
        }
        return str;
    }

    /* renamed from: l */
    public int m31274l() {
        int i10 = 0;
        try {
            i10 = this.f35397i.getInt("pref_billing_p_id", 0);
        } catch (Exception e10) {
        }
        return i10;
    }

    /* renamed from: m */
    public Boolean m31275m() {
        try {
            return Boolean.valueOf(this.f35397i.getBoolean("pref_billing_p_is_p", false));
        } catch (Exception e10) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: n */
    public String m31276n() {
        String str = "";
        try {
            str = this.f35397i.getString("pref_billing_p_pass", "");
        } catch (Exception e10) {
        }
        return str;
    }

    /* renamed from: o */
    public int m31277o() {
        try {
            return this.f35394f.getInt("pref.brightness", C5251a.f30063r0);
        } catch (Exception e10) {
            return C5251a.f30063r0;
        }
    }

    /* renamed from: p */
    public boolean m31278p() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018359), false);
    }

    /* renamed from: q */
    public boolean m31279q() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018360), false);
    }

    /* renamed from: r */
    public boolean m31280r() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018361), false);
    }

    /* renamed from: s */
    public boolean m31281s() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018362), false);
    }

    /* renamed from: t */
    public boolean m31282t() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018363), false);
    }

    /* renamed from: u */
    public boolean m31283u() {
        return this.f35390b.getBoolean(this.f35389a.getString(2132018365), false);
    }

    /* renamed from: v */
    public String m31284v() {
        return this.f35398j.getString("pref.using_opengl", "");
    }

    /* renamed from: w */
    public int m31285w() {
        String string = this.f35399k.getString("pref.using_media_codec", C5251a.f30035d0);
        if (string.equals(this.f35389a.getResources().getString(2132018167))) {
            return 3;
        }
        if (string.equals(this.f35389a.getResources().getString(2132017829))) {
            return 2;
        }
        string.equals(this.f35389a.getResources().getString(2132018605));
        return 2;
    }

    /* renamed from: x */
    public int m31286x() {
        return this.f35394f.getInt("recently_added_limit", C5251a.f30027Z);
    }

    /* renamed from: y */
    public int m31287y() {
        return this.f35394f.getInt("recently_watched_limit_live", C5251a.f30029a0);
    }

    /* renamed from: z */
    public String m31288z() {
        try {
            return this.f35394f.getString("pref.screen_type", "");
        } catch (Exception e10) {
            return null;
        }
    }
}
