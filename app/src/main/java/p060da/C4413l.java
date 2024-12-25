package p060da;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/l.class
 */
/* renamed from: da.l */
/* loaded from: combined.jar:classes2.jar:da/l.class */
public final class C4413l {

    /* renamed from: a */
    public static final Pattern f26702a = Pattern.compile("\\\\.");

    /* renamed from: b */
    public static final Pattern f26703b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: a */
    public static boolean m22449a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    C9935o.m41850j(next);
                    if (!m22449a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException e10) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                if (!m22449a(jSONArray.get(i10), jSONArray2.get(i10))) {
                    return false;
                }
            } catch (JSONException e11) {
                return false;
            }
        }
        return true;
    }
}
