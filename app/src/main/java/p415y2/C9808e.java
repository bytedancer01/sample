package p415y2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import p395x2.C9628g;
import p395x2.C9632k;
import p395x2.C9643v;
import p395x2.InterfaceC9623b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:y2/e.class
 */
/* renamed from: y2.e */
/* loaded from: combined.jar:classes1.jar:y2/e.class */
public class C9808e {
    /* renamed from: a */
    public static String m41320a(long j10) {
        return m41321b().format(new Date(j10));
    }

    /* renamed from: b */
    public static SimpleDateFormat m41321b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: c */
    public static InterfaceC9623b.a m41322c(C9632k c9632k) {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c9632k.f43982c;
        String str = map.get("Date");
        long m41323d = str != null ? m41323d(str) : 0L;
        String str2 = map.get("Cache-Control");
        boolean z11 = false;
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z11 = false;
            j10 = 0;
            long j17 = 0;
            while (true) {
                j11 = j17;
                if (i10 >= split.length) {
                    z10 = true;
                    break;
                }
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j15 = Long.parseLong(trim.substring(8));
                        j16 = j11;
                    } catch (Exception e10) {
                        j15 = j10;
                        j16 = j11;
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j16 = Long.parseLong(trim.substring(23));
                    j15 = j10;
                } else {
                    if (!trim.equals("must-revalidate")) {
                        j15 = j10;
                        j16 = j11;
                        if (!trim.equals("proxy-revalidate")) {
                        }
                    }
                    z11 = true;
                    j16 = j11;
                    j15 = j10;
                }
                i10++;
                j10 = j15;
                j17 = j16;
            }
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = map.get("Expires");
        long m41323d2 = str3 != null ? m41323d(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long m41323d3 = str4 != null ? m41323d(str4) : 0L;
        String str5 = map.get("ETag");
        if (z10) {
            long j18 = currentTimeMillis + (j10 * 1000);
            if (z11) {
                j14 = j18;
            } else {
                Long.signum(j11);
                j14 = (j11 * 1000) + j18;
            }
            long j19 = j14;
            j13 = j18;
            j12 = j19;
        } else {
            j12 = 0;
            if (m41323d <= 0 || m41323d2 < m41323d) {
                j13 = 0;
            } else {
                j13 = currentTimeMillis + (m41323d2 - m41323d);
                j12 = j13;
            }
        }
        InterfaceC9623b.a aVar = new InterfaceC9623b.a();
        aVar.f43944a = c9632k.f43981b;
        aVar.f43945b = str5;
        aVar.f43949f = j13;
        aVar.f43948e = j12;
        aVar.f43946c = m41323d;
        aVar.f43947d = m41323d3;
        aVar.f43950g = map;
        aVar.f43951h = c9632k.f43983d;
        return aVar;
    }

    /* renamed from: d */
    public static long m41323d(String str) {
        try {
            return m41321b().parse(str).getTime();
        } catch (ParseException e10) {
            C9643v.m40580d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* renamed from: e */
    public static List<C9628g> m41324e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C9628g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Map<String, String> m41325f(List<C9628g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C9628g c9628g : list) {
            treeMap.put(c9628g.m40518a(), c9628g.m40519b());
        }
        return treeMap;
    }
}
