package p305ra;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y2.class
 */
/* renamed from: ra.y2 */
/* loaded from: combined.jar:classes2.jar:ra/y2.class */
public final class C8422y2 {

    /* renamed from: f */
    public static HashMap<String, String> f39398f;

    /* renamed from: k */
    public static Object f39403k;

    /* renamed from: l */
    public static boolean f39404l;

    /* renamed from: a */
    public static final Uri f39393a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f39394b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f39395c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f39396d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f39397e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap<String, Boolean> f39399g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f39400h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f39401i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f39402j = new HashMap<>();

    /* renamed from: m */
    public static final String[] f39405m = new String[0];

    /* renamed from: a */
    public static String m36218a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C8422y2.class) {
            try {
                if (f39398f == null) {
                    f39397e.set(false);
                    f39398f = new HashMap<>();
                    f39403k = new Object();
                    f39404l = false;
                    contentResolver.registerContentObserver(f39393a, true, new C8407x2(null));
                } else if (f39397e.getAndSet(false)) {
                    f39398f.clear();
                    f39399g.clear();
                    f39400h.clear();
                    f39401i.clear();
                    f39402j.clear();
                    f39403k = new Object();
                    f39404l = false;
                }
                Object obj = f39403k;
                if (f39398f.containsKey(str)) {
                    String str3 = f39398f.get(str);
                    if (str3 == null) {
                        str3 = null;
                    }
                    return str3;
                }
                int length = f39405m.length;
                Cursor query = contentResolver.query(f39393a, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        m36220c(obj, str, null);
                        query.close();
                        return null;
                    }
                    String string = query.getString(1);
                    String str4 = string;
                    if (string != null) {
                        str4 = string;
                        if (string.equals(null)) {
                            str4 = null;
                        }
                    }
                    m36220c(obj, str, str4);
                    if (str4 == null) {
                        str4 = null;
                    }
                    query.close();
                    return str4;
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public static void m36220c(Object obj, String str, String str2) {
        synchronized (C8422y2.class) {
            try {
                if (obj == f39403k) {
                    f39398f.put(str, str2);
                }
            } finally {
            }
        }
    }
}
