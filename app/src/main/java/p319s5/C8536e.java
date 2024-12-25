package p319s5;

import com.amazonaws.util.DateUtils;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p436z4.C10051b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s5/e.class
 */
/* renamed from: s5.e */
/* loaded from: combined.jar:classes1.jar:s5/e.class */
public class C8536e extends DateFormat {

    /* renamed from: i */
    public static final String[] f39918i = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", DateUtils.ISO8601_DATE_PATTERN, "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};

    /* renamed from: j */
    public static final TimeZone f39919j;

    /* renamed from: k */
    public static final Locale f39920k;

    /* renamed from: l */
    public static final DateFormat f39921l;

    /* renamed from: m */
    public static final DateFormat f39922m;

    /* renamed from: n */
    public static final DateFormat f39923n;

    /* renamed from: o */
    public static final DateFormat f39924o;

    /* renamed from: p */
    public static final C8536e f39925p;

    /* renamed from: b */
    public transient TimeZone f39926b;

    /* renamed from: c */
    public final Locale f39927c;

    /* renamed from: d */
    public Boolean f39928d;

    /* renamed from: e */
    public transient DateFormat f39929e;

    /* renamed from: f */
    public transient DateFormat f39930f;

    /* renamed from: g */
    public transient DateFormat f39931g;

    /* renamed from: h */
    public transient DateFormat f39932h;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f39919j = timeZone;
        Locale locale = Locale.US;
        f39920k = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
        f39921l = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        f39922m = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, locale);
        f39923n = simpleDateFormat3;
        simpleDateFormat3.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd", locale);
        f39924o = simpleDateFormat4;
        simpleDateFormat4.setTimeZone(timeZone);
        f39925p = new C8536e();
    }

    public C8536e() {
        this.f39927c = f39920k;
    }

    public C8536e(TimeZone timeZone, Locale locale, Boolean bool) {
        this.f39926b = timeZone;
        this.f39927c = locale;
        this.f39928d = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.text.DateFormat m36752b(java.text.DateFormat r5, java.lang.String r6, java.util.TimeZone r7, java.util.Locale r8, java.lang.Boolean r9) {
        /*
            r0 = r8
            java.util.Locale r1 = p319s5.C8536e.f39920k
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            r5 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L22
            java.util.TimeZone r0 = p319s5.C8536e.f39919j
            r6 = r0
            r0 = r8
            r5 = r0
        L22:
            r0 = r5
            r1 = r6
            r0.setTimeZone(r1)
            r0 = r5
            r6 = r0
            goto L3f
        L2c:
            r0 = r5
            java.lang.Object r0 = r0.clone()
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L3f
            r0 = r7
            r6 = r0
            goto L22
        L3f:
            r0 = r9
            if (r0 == 0) goto L4d
            r0 = r6
            r1 = r9
            boolean r1 = r1.booleanValue()
            r0.setLenient(r1)
        L4d:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p319s5.C8536e.m36752b(java.text.DateFormat, java.lang.String, java.util.TimeZone, java.util.Locale, java.lang.Boolean):java.text.DateFormat");
    }

    /* renamed from: d */
    public static final boolean m36753d(String str) {
        char charAt;
        char charAt2;
        int length = str.length();
        if (length < 6) {
            return false;
        }
        char charAt3 = str.charAt(length - 6);
        return charAt3 == '+' || charAt3 == '-' || (charAt = str.charAt(length - 5)) == '+' || charAt == '-' || (charAt2 = str.charAt(length - 3)) == '+' || charAt2 == '-';
    }

    /* renamed from: a */
    public void m36754a() {
        this.f39929e = null;
        this.f39930f = null;
        this.f39931g = null;
        this.f39932h = null;
    }

    @Override // java.text.DateFormat, java.text.Format
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C8536e clone() {
        return new C8536e(this.f39926b, this.f39927c, this.f39928d);
    }

    /* renamed from: e */
    public boolean m36756e(String str) {
        return str.length() >= 5 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-';
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this.f39930f == null) {
            this.f39930f = m36752b(f39922m, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", this.f39926b, this.f39927c, this.f39928d);
        }
        return this.f39930f.format(date, stringBuffer, fieldPosition);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (r0 == '-') goto L27;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date m36757g(java.lang.String r9, java.text.ParsePosition r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p319s5.C8536e.m36757g(java.lang.String, java.text.ParsePosition, boolean):java.util.Date");
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.f39926b;
    }

    /* renamed from: h */
    public Date m36758h(String str, ParsePosition parsePosition) {
        if (this.f39929e == null) {
            this.f39929e = m36752b(f39921l, "EEE, dd MMM yyyy HH:mm:ss zzz", this.f39926b, this.f39927c, this.f39928d);
        }
        return this.f39929e.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.f39928d;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public Date parse(String str) {
        int i10;
        Date m36758h;
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        if (m36756e(trim)) {
            m36758h = m36757g(trim, parsePosition, true);
        } else {
            int length = trim.length();
            while (true) {
                i10 = length - 1;
                if (i10 < 0) {
                    break;
                }
                char charAt = trim.charAt(i10);
                if (charAt >= '0') {
                    length = i10;
                    if (charAt <= '9') {
                        continue;
                    }
                }
                if (i10 > 0) {
                    break;
                }
                length = i10;
                if (charAt != '-') {
                    break;
                }
            }
            m36758h = (i10 >= 0 || !(trim.charAt(0) == '-' || C10051b.m42264a(trim, false))) ? m36758h(trim, parsePosition) : new Date(Long.parseLong(trim));
        }
        if (m36758h != null) {
            return m36758h;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f39918i) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb2.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        int i10;
        if (m36756e(str)) {
            try {
                return m36757g(str, parsePosition, false);
            } catch (ParseException e10) {
                return null;
            }
        }
        int length = str.length();
        while (true) {
            i10 = length - 1;
            if (i10 >= 0) {
                char charAt = str.charAt(i10);
                if (charAt >= '0') {
                    length = i10;
                    if (charAt <= '9') {
                        continue;
                    }
                }
                if (i10 > 0) {
                    break;
                }
                length = i10;
                if (charAt != '-') {
                    break;
                }
            } else {
                break;
            }
        }
        return (i10 >= 0 || !(str.charAt(0) == '-' || C10051b.m42264a(str, false))) ? m36758h(str, parsePosition) : new Date(Long.parseLong(str));
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        if (this.f39928d != valueOf) {
            this.f39928d = valueOf;
            m36754a();
        }
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f39926b)) {
            return;
        }
        m36754a();
        this.f39926b = timeZone;
    }

    public String toString() {
        String str = "DateFormat " + getClass().getName();
        TimeZone timeZone = this.f39926b;
        String str2 = str;
        if (timeZone != null) {
            str2 = str + " (timezone: " + timeZone + ")";
        }
        return str2 + "(locale: " + this.f39927c + ")";
    }
}
