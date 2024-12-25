package p365v6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/a.class
 */
/* renamed from: v6.a */
/* loaded from: combined.jar:classes2.jar:v6/a.class */
public final class C9247a {
    /* renamed from: a */
    public static byte[] m39001a(byte[] bArr) {
        return C4401z0.f26679a >= 27 ? bArr : C4401z0.m22396l0(m39003c(C4401z0.m22323F(bArr)));
    }

    /* renamed from: b */
    public static byte[] m39002b(byte[] bArr) {
        if (C4401z0.f26679a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C4401z0.m22323F(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(m39004d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m39004d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C4401z0.m22396l0(sb2.toString());
        } catch (JSONException e10) {
            C4392v.m22271e("ClearKeyUtil", "Failed to adjust response data: " + C4401z0.m22323F(bArr), e10);
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m39003c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m39004d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
