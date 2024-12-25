package p422y9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import p060da.C4410i;
import p097fa.C4794e;
import p175k0.C5442c;
import p184k9.C5534b;
import p294r.C7936i;
import p350u9.C8820j;
import p350u9.C8826m;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/a0.class
 */
/* renamed from: y9.a0 */
/* loaded from: combined.jar:classes2.jar:y9/a0.class */
public final class C9894a0 {

    /* renamed from: a */
    public static final C7936i<String, String> f45513a = new C7936i<>();

    /* renamed from: b */
    public static Locale f45514b;

    /* renamed from: a */
    public static String m41752a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4794e.m24250a(context).m24246d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m41753b(Context context) {
        return context.getResources().getString(C5534b.f31600g);
    }

    /* renamed from: c */
    public static String m41754c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : C5534b.f31594a : C5534b.f31603j : C5534b.f31597d);
    }

    /* renamed from: d */
    public static String m41755d(Context context, int i10) {
        Resources resources = context.getResources();
        String m41752a = m41752a(context);
        if (i10 == 1) {
            return resources.getString(C5534b.f31598e, m41752a);
        }
        if (i10 == 2) {
            return C4410i.m22443d(context) ? resources.getString(C5534b.f31607n) : resources.getString(C5534b.f31604k, m41752a);
        }
        if (i10 == 3) {
            return resources.getString(C5534b.f31595b, m41752a);
        }
        if (i10 == 5) {
            return m41759h(context, "common_google_play_services_invalid_account_text", m41752a);
        }
        if (i10 == 7) {
            return m41759h(context, "common_google_play_services_network_error_text", m41752a);
        }
        if (i10 == 9) {
            return resources.getString(C5534b.f31602i, m41752a);
        }
        if (i10 == 20) {
            return m41759h(context, "common_google_play_services_restricted_profile_text", m41752a);
        }
        switch (i10) {
            case 16:
                return m41759h(context, "common_google_play_services_api_unavailable_text", m41752a);
            case 17:
                return m41759h(context, "common_google_play_services_sign_in_failed_text", m41752a);
            case 18:
                return resources.getString(C5534b.f31606m, m41752a);
            default:
                return resources.getString(C8826m.f40870a, m41752a);
        }
    }

    /* renamed from: e */
    public static String m41756e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? m41759h(context, "common_google_play_services_resolution_required_text", m41752a(context)) : m41755d(context, i10);
    }

    /* renamed from: f */
    public static String m41757f(Context context, int i10) {
        String m41760i = i10 == 6 ? m41760i(context, "common_google_play_services_resolution_required_title") : m41758g(context, i10);
        return m41760i == null ? context.getResources().getString(C5534b.f31601h) : m41760i;
    }

    /* renamed from: g */
    public static String m41758g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C5534b.f31599f);
            case 2:
                return resources.getString(C5534b.f31605l);
            case 3:
                return resources.getString(C5534b.f31596c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m41760i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m41760i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                str = sb2.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m41760i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m41760i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: h */
    public static String m41759h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m41760i = m41760i(context, str);
        String str3 = m41760i;
        if (m41760i == null) {
            str3 = resources.getString(C8826m.f40870a);
        }
        return String.format(resources.getConfiguration().locale, str3, str2);
    }

    /* renamed from: i */
    public static String m41760i(Context context, String str) {
        C7936i<String, String> c7936i = f45513a;
        synchronized (c7936i) {
            Locale m27202c = C5442c.m27195a(context.getResources().getConfiguration()).m27202c(0);
            if (!m27202c.equals(f45514b)) {
                c7936i.clear();
                f45514b = m27202c;
            }
            String str2 = c7936i.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m37705f = C8820j.m37705f(context);
            if (m37705f == null) {
                return null;
            }
            int identifier = m37705f.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = m37705f.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            c7936i.put(str, string);
            return string;
        }
    }
}
