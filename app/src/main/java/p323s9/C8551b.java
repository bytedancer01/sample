package p323s9;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p304r9.C8015b;
import p402x9.C9691a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s9/b.class
 */
/* renamed from: s9.b */
/* loaded from: combined.jar:classes2.jar:s9/b.class */
public final class C8551b {

    /* renamed from: a */
    public static final C8015b f39961a = new C8015b("MetadataUtils");

    /* renamed from: b */
    public static final String[] f39962b;

    /* renamed from: c */
    public static final String f39963c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f39962b = strArr;
        f39963c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    /* renamed from: a */
    public static Calendar m36777a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f39961a.m34873a("Input string is empty or null", new Object[0]);
            return null;
        }
        String m36780d = m36780d(str);
        if (TextUtils.isEmpty(m36780d)) {
            f39961a.m34873a("Invalid date format", new Object[0]);
            return null;
        }
        String m36781e = m36781e(str);
        if (TextUtils.isEmpty(m36781e)) {
            str2 = "yyyyMMdd";
        } else {
            m36780d = m36780d + "T" + m36781e;
            str2 = m36781e.length() == 6 ? "yyyyMMdd'T'HHmmss" : f39963c;
        }
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat(str2).parse(m36780d));
            return calendar;
        } catch (ParseException e10) {
            f39961a.m34876d(e10, "Error parsing string", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONArray m36778b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C9691a) it.next()).m40802Q());
        }
        return jSONArray;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0035
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* renamed from: c */
    public static void m36779c(java.util.List r3, org.json.JSONArray r4) {
        /*
            r0 = r3
            r0.clear()     // Catch: org.json.JSONException -> L31
            r0 = 0
            r5 = r0
        L8:
            r0 = r5
            r1 = r4
            int r1 = r1.length()     // Catch: org.json.JSONException -> L31
            if (r0 >= r1) goto L30
            r0 = r4
            r1 = r5
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch: org.json.JSONException -> L31
            r6 = r0
            x9.a r0 = new x9.a     // Catch: org.json.JSONException -> L31 org.json.JSONException -> L31 java.lang.IllegalArgumentException -> L35
            r7 = r0
            r0 = r7
            r1 = r6
            r0.<init>(r1)     // Catch: org.json.JSONException -> L31 java.lang.IllegalArgumentException -> L35
            r0 = r3
            r1 = r7
            boolean r0 = r0.add(r1)     // Catch: org.json.JSONException -> L31 java.lang.IllegalArgumentException -> L35
        L2a:
            int r5 = r5 + 1
            goto L8
        L30:
            return
        L31:
            r3 = move-exception
            goto L30
        L35:
            r6 = move-exception
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: p323s9.C8551b.m36779c(java.util.List, org.json.JSONArray):void");
    }

    /* renamed from: d */
    public static String m36780d(String str) {
        if (TextUtils.isEmpty(str)) {
            f39961a.m34873a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e10) {
            f39961a.m34876d(e10, "Error extracting the date", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public static String m36781e(String str) {
        if (TextUtils.isEmpty(str)) {
            f39961a.m34873a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        if (indexOf != 8) {
            f39961a.m34873a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(indexOf + 1);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt != '+' && charAt != '-') {
                if (charAt == 'Z' && substring.length() == f39962b[0].length() + 6) {
                    return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
                }
                return null;
            }
            int length = substring.length();
            String[] strArr = f39962b;
            if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
            }
            return null;
        } catch (IndexOutOfBoundsException e10) {
            f39961a.m34876d(e10, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
