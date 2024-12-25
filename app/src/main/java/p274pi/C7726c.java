package p274pi;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pi/c.class
 */
/* renamed from: pi.c */
/* loaded from: combined.jar:classes2.jar:pi/c.class */
public final class C7726c {

    /* renamed from: a */
    public static final a f37492a = new a();

    /* renamed from: b */
    public static final String[] f37493b;

    /* renamed from: c */
    public static final DateFormat[] f37494c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:pi/c$a.class
     */
    /* renamed from: pi.c$a */
    /* loaded from: combined.jar:classes2.jar:pi/c$a.class */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C5634b.f31709f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f37493b = strArr;
        f37494c = new DateFormat[strArr.length];
    }

    @Nullable
    /* renamed from: a */
    public static final Date m33725a(@NotNull String str) {
        C9367f.m39526e(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f37492a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f37493b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                DateFormat[] dateFormatArr = f37494c;
                DateFormat dateFormat = dateFormatArr[i10];
                DateFormat dateFormat2 = dateFormat;
                if (dateFormat == null) {
                    dateFormat2 = new SimpleDateFormat(f37493b[i10], Locale.US);
                    dateFormat2.setTimeZone(C5634b.f31709f);
                    dateFormatArr[i10] = dateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat2.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            C5398q c5398q = C5398q.f30770a;
            return null;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final String m33726b(@NotNull Date date) {
        C9367f.m39526e(date, "$this$toHttpDateString");
        String format = f37492a.get().format(date);
        C9367f.m39525d(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
