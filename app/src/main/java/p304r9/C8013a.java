package p304r9;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/a.class
 */
/* renamed from: r9.a */
/* loaded from: combined.jar:classes2.jar:r9/a.class */
public final class C8013a {

    /* renamed from: a */
    public static final Pattern f38794a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b */
    public static final Random f38795b = new Random(SystemClock.elapsedRealtime());

    /* renamed from: a */
    public static JSONObject m34860a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            return null;
        }
    }

    /* renamed from: b */
    public static double m34861b(long j10) {
        return j10 / 1000.0d;
    }

    /* renamed from: c */
    public static String m34862c(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: d */
    public static long m34863d(double d10) {
        return (long) (d10 * 1000.0d);
    }

    /* renamed from: e */
    public static long m34864e(long j10) {
        return j10 * 1000;
    }

    /* renamed from: f */
    public static void m34865f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: g */
    public static long m34866g() {
        return f38795b.nextLong();
    }

    /* renamed from: h */
    public static String m34867h(Locale locale) {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static String m34868i(String str) {
        if (f38794a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* renamed from: j */
    public static List m34869j(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r4 != null) goto L6;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m34870k(java.lang.Object r3, java.lang.Object r4) {
        /*
            r0 = 1
            r6 = r0
            r0 = r3
            if (r0 != 0) goto Lc
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L25
        Lc:
            r0 = r3
            if (r0 == 0) goto L23
            r0 = r4
            if (r0 == 0) goto L23
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            r0 = r6
            r5 = r0
            goto L25
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 0
            r5 = r0
        L25:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p304r9.C8013a.m34870k(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: l */
    public static int[] m34871l(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    /* renamed from: m */
    public static long[] m34872m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jArr[i10] = jSONArray.getLong(i10);
        }
        return jArr;
    }
}
