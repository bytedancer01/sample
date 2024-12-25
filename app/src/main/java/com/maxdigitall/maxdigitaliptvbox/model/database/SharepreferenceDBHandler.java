package com.maxdigitall.maxdigitaliptvbox.model.database;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import org.apache.http.client.config.CookieSpecs;
import p151if.C5251a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/SharepreferenceDBHandler.class
 */
/* loaded from: combined.jar:classes2.jar:com/maxdigitall/maxdigitaliptvbox/model/database/SharepreferenceDBHandler.class */
public class SharepreferenceDBHandler {
    /* renamed from: A */
    public static int m15337A(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getInt("userID", -1);
    }

    /* renamed from: B */
    public static String m15338B(Context context) {
        return context.getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
    }

    /* renamed from: C */
    public static String m15339C(Context context) {
        return context.getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
    }

    /* renamed from: D */
    public static String m15340D(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("VODAppName", "");
    }

    /* renamed from: E */
    public static String m15341E(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("VODPkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: F */
    public static String m15342F(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("VODSort", "0");
    }

    /* renamed from: G */
    public static String m15343G(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("vodcatsort", "0");
    }

    /* renamed from: H */
    public static boolean m15344H(Context context) {
        return context.getSharedPreferences("auto_start", 0).getBoolean("autoplay", true);
    }

    /* renamed from: I */
    public static String m15345I(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("seriescatsort", "0");
    }

    /* renamed from: J */
    public static boolean m15346J(Context context) {
        return context.getSharedPreferences("showPopup", 0).getBoolean("check_box", true);
    }

    /* renamed from: K */
    public static void m15347K(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("auto_start", 0).edit();
        edit.putString("act_code", str);
        edit.apply();
    }

    /* renamed from: L */
    public static void m15348L(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        edit.putInt("async_status", i10);
        edit.apply();
    }

    /* renamed from: M */
    public static void m15349M(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("cacheClearCount", 0).edit();
        edit.putInt("cacheClearCount", i10);
        edit.apply();
    }

    /* renamed from: N */
    public static void m15350N(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("CatchUpPkgName", str);
        edit.putString("CatchUpAppName", str2);
        edit.apply();
    }

    /* renamed from: O */
    public static void m15351O(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        edit.putString("current_app_type", str);
        edit.apply();
    }

    /* renamed from: P */
    public static void m15352P(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("EPGPkgName", str);
        edit.putString("EPGAppName", str2);
        edit.apply();
    }

    /* renamed from: Q */
    public static void m15353Q(boolean z10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPref", 0).edit();
        edit.putBoolean("AppExist", z10);
        edit.apply();
    }

    /* renamed from: R */
    public static void m15354R(boolean z10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        edit.putBoolean("Update", z10);
        edit.apply();
    }

    /* renamed from: S */
    public static void m15355S(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("livecatsort", str);
        edit.apply();
    }

    /* renamed from: T */
    public static void m15356T(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("LivePkgName", str);
        edit.putString("LiveAppName", str2);
        edit.apply();
    }

    /* renamed from: U */
    public static void m15357U(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("LiveSort", str);
        edit.apply();
    }

    /* renamed from: V */
    public static void m15358V(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("RadioSort", str);
        edit.apply();
    }

    /* renamed from: W */
    public static void m15359W(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        edit.putInt("RateUsCount", i10);
        edit.apply();
    }

    /* renamed from: X */
    public static void m15360X(boolean z10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        edit.putBoolean("RateUsDontask", z10);
        edit.apply();
    }

    /* renamed from: Y */
    public static void m15361Y(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("RecordingsPkgName", str);
        edit.putString("RecordingsAppName", str2);
        edit.apply();
    }

    /* renamed from: Z */
    public static void m15362Z(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        edit.putString("screenType", str);
        edit.apply();
    }

    /* renamed from: a */
    public static String m15363a(Context context) {
        return context.getSharedPreferences("auto_start", 0).getString("act_code", "");
    }

    /* renamed from: a0 */
    public static void m15364a0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("LanguageSelectionPref", 0).edit();
        edit.putString("SelectedLanguage", str);
        edit.apply();
    }

    /* renamed from: b */
    public static int m15365b(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getInt("async_status", 0);
    }

    /* renamed from: b0 */
    public static void m15366b0(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("SeriesPkgName", str);
        edit.putString("SeriesAppName", str2);
        edit.apply();
    }

    /* renamed from: c */
    public static int m15367c(Context context) {
        return context.getSharedPreferences("cacheClearCount", 0).getInt("cacheClearCount", 0);
    }

    /* renamed from: c0 */
    public static void m15368c0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("SeriesSort", str);
        edit.apply();
    }

    /* renamed from: d */
    public static String m15369d(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("CatchUpAppName", "");
    }

    /* renamed from: d0 */
    public static void m15370d0(Boolean bool, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("showPopup", 0).edit();
        edit.putBoolean("popshow", bool.booleanValue());
        edit.apply();
    }

    /* renamed from: e */
    public static String m15371e(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("CatchUpPkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: e0 */
    public static void m15372e0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        edit.putString("type", str);
        edit.apply();
    }

    /* renamed from: f */
    public static String m15373f(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("current_app_type", "api");
    }

    /* renamed from: f0 */
    public static void m15374f0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginPrefs", 0).edit();
        edit.putString("in_which", str);
        edit.apply();
    }

    /* renamed from: g */
    public static String m15375g(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("EPGAppName", "");
    }

    /* renamed from: g0 */
    public static void m15376g0(int i10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        edit.putInt("userID", i10);
        edit.apply();
    }

    /* renamed from: h */
    public static String m15377h(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("EPGPkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: h0 */
    public static void m15378h0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginPrefs", 0).edit();
        edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, str);
        edit.apply();
    }

    /* renamed from: i */
    public static boolean m15379i(Context context) {
        return context.getSharedPreferences("MyPref", 0).getBoolean("AppExist", false);
    }

    /* renamed from: i0 */
    public static void m15380i0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("loginPrefs", 0).edit();
        edit.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, str);
        edit.apply();
    }

    /* renamed from: j */
    public static String m15381j(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("livecatsort", "0");
    }

    /* renamed from: j0 */
    public static void m15382j0(String str, String str2, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        edit.putString("VODPkgName", str);
        edit.putString("VODAppName", str2);
        edit.apply();
    }

    /* renamed from: k */
    public static String m15383k(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("LiveAppName", "");
    }

    /* renamed from: k0 */
    public static void m15384k0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("VODSort", str);
        edit.apply();
    }

    /* renamed from: l */
    public static String m15385l(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("LivePkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: l0 */
    public static void m15386l0(Boolean bool, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("showPopup", 0).edit();
        edit.putBoolean("check_box", bool.booleanValue());
        edit.apply();
    }

    /* renamed from: m */
    public static String m15387m(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("LiveSort", "0");
    }

    /* renamed from: m0 */
    public static void m15388m0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("vodcatsort", str);
        edit.apply();
    }

    /* renamed from: n */
    public static String m15389n(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("RadioSort", "0");
    }

    /* renamed from: n0 */
    public static void m15390n0(boolean z10, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("auto_start", 0).edit();
        edit.putBoolean("autoplay", z10);
        edit.apply();
    }

    /* renamed from: o */
    public static int m15391o(Context context) {
        return context.getSharedPreferences("SplashAppUpdate", 0).getInt("RateUsCount", 0);
    }

    /* renamed from: o0 */
    public static void m15392o0(String str, Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(C5251a.f30064s, 0).edit();
        edit.putString("seriescatsort", str);
        edit.apply();
    }

    /* renamed from: p */
    public static boolean m15393p(Context context) {
        return context.getSharedPreferences("SplashAppUpdate", 0).getBoolean("RateUsDontask", false);
    }

    /* renamed from: q */
    public static String m15394q(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("RecordingsAppName", "");
    }

    /* renamed from: r */
    public static String m15395r(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("RecordingsPkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: s */
    public static String m15396s(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("screenType", CookieSpecs.DEFAULT);
    }

    /* renamed from: t */
    public static String m15397t(Context context) {
        return context.getSharedPreferences("LanguageSelectionPref", 0).getString("SelectedLanguage", "English");
    }

    /* renamed from: u */
    public static String m15398u(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("SeriesAppName", "");
    }

    /* renamed from: v */
    public static String m15399v(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("SeriesPkgName", CookieSpecs.DEFAULT);
    }

    /* renamed from: w */
    public static String m15400w(Context context) {
        return context.getSharedPreferences(C5251a.f30064s, 0).getString("SeriesSort", "0");
    }

    /* renamed from: x */
    public static boolean m15401x(Context context) {
        return context.getSharedPreferences("showPopup", 0).getBoolean("popshow", true);
    }

    /* renamed from: y */
    public static String m15402y(Context context) {
        return context.getSharedPreferences("loginPrefs", 0).getString("isTrial", "");
    }

    /* renamed from: z */
    public static String m15403z(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("type", "");
    }
}
