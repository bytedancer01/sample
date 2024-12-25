package ua;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354ue.C9169n;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/k4.class
 */
/* renamed from: ua.k4 */
/* loaded from: combined.jar:classes2.jar:ua/k4.class */
public final class C8965k4 {

    /* renamed from: a */
    public final String f41254a;

    /* renamed from: b */
    public final Bundle f41255b;

    /* renamed from: c */
    public Bundle f41256c;

    /* renamed from: d */
    public final C9013o4 f41257d;

    public C8965k4(C9013o4 c9013o4, String str, Bundle bundle) {
        this.f41257d = c9013o4;
        C9935o.m41846f("default_event_parameters");
        this.f41254a = "default_event_parameters";
        this.f41255b = new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Bundle m38099a() {
        Bundle bundle;
        JSONArray jSONArray;
        int i10;
        boolean z10;
        if (this.f41256c == null) {
            String string = this.f41257d.m38167p().getString(this.f41254a, null);
            if (string != null) {
                try {
                    bundle = new Bundle();
                    jSONArray = new JSONArray(string);
                    i10 = 0;
                } catch (JSONException e10) {
                    this.f41257d.f41723a.mo37780c().m38408o().m38326a("Error loading bundle from SharedPreferences. Values will be lost");
                }
                while (true) {
                    if (i10 >= jSONArray.length()) {
                        break;
                    }
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject.getString(C9169n.f41939b);
                        String string3 = jSONObject.getString("t");
                        int hashCode = string3.hashCode();
                        if (hashCode == 100) {
                            if (string3.equals("d")) {
                                z10 = true;
                            }
                            z10 = -1;
                        } else if (hashCode != 108) {
                            if (hashCode == 115 && string3.equals("s")) {
                                z10 = false;
                            }
                            z10 = -1;
                        } else {
                            if (string3.equals("l")) {
                                z10 = 2;
                            }
                            z10 = -1;
                        }
                        if (!z10) {
                            bundle.putString(string2, jSONObject.getString("v"));
                        } else if (z10) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        } else if (z10 != 2) {
                            this.f41257d.f41723a.mo37780c().m38408o().m38327b("Unrecognized persisted bundle type. Type", string3);
                        } else {
                            bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                        }
                    } catch (NumberFormatException | JSONException e11) {
                        this.f41257d.f41723a.mo37780c().m38408o().m38326a("Error reading value from SharedPreferences. Value dropped");
                    }
                    i10++;
                    this.f41257d.f41723a.mo37780c().m38408o().m38326a("Error loading bundle from SharedPreferences. Values will be lost");
                }
                this.f41256c = bundle;
            }
            if (this.f41256c == null) {
                this.f41256c = this.f41255b;
            }
        }
        return this.f41256c;
    }

    /* renamed from: b */
    public final void m38100b(Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        SharedPreferences.Editor edit = this.f41257d.m38167p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f41254a);
        } else {
            String str = this.f41254a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj2 = bundle2.get(str2);
                if (obj2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C9169n.f41939b, str2);
                        jSONObject.put("v", String.valueOf(obj2));
                        if (obj2 instanceof String) {
                            obj = "s";
                        } else if (obj2 instanceof Long) {
                            obj = "l";
                        } else if (obj2 instanceof Double) {
                            obj = "d";
                        } else {
                            this.f41257d.f41723a.mo37780c().m38408o().m38327b("Cannot serialize bundle value to SharedPreferences. Type", obj2.getClass());
                        }
                        jSONObject.put("t", obj);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f41257d.f41723a.mo37780c().m38408o().m38327b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f41256c = bundle2;
    }
}
