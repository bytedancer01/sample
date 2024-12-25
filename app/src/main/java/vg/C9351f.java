package vg;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/f.class
 */
/* renamed from: vg.f */
/* loaded from: combined.jar:classes2.jar:vg/f.class */
public final class C9351f {

    /* renamed from: a */
    public static final TimeZone f42829a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    public static final ThreadLocal<DateFormat> f42830b = new a();

    /* renamed from: c */
    public static final String[] f42831c;

    /* renamed from: d */
    public static final DateFormat[] f42832d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/f$a.class
     */
    /* renamed from: vg.f$a */
    /* loaded from: combined.jar:classes2.jar:vg/f$a.class */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C9351f.f42829a);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f42831c = strArr;
        f42832d = new DateFormat[strArr.length];
    }

    /* renamed from: b */
    public static Date m39435b(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f42830b.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f42831c;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f42832d;
                DateFormat dateFormat = dateFormatArr[i10];
                DateFormat dateFormat2 = dateFormat;
                if (dateFormat == null) {
                    dateFormat2 = new SimpleDateFormat(f42831c[i10], Locale.US);
                    dateFormat2.setTimeZone(f42829a);
                    dateFormatArr[i10] = dateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat2.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
