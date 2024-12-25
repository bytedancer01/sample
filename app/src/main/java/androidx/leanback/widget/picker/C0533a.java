package androidx.leanback.widget.picker;

import android.content.res.Resources;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/picker/a.class
 */
/* renamed from: androidx.leanback.widget.picker.a */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/picker/a.class */
public class C0533a {

    /* renamed from: a */
    public static final boolean f3566a = true;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/picker/a$a.class
     */
    /* renamed from: androidx.leanback.widget.picker.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/picker/a$a.class */
    public static class a {

        /* renamed from: a */
        public final Locale f3567a;

        /* renamed from: b */
        public final String[] f3568b;

        /* renamed from: c */
        public final String[] f3569c;

        public a(Locale locale, Resources resources) {
            this.f3567a = locale;
            this.f3568b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            this.f3569c = C0533a.m2930a(calendar.getMinimum(5), calendar.getMaximum(5), "%02d");
        }
    }

    /* renamed from: a */
    public static String[] m2930a(int i10, int i11, String str) {
        String[] strArr = new String[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            int i13 = i12 - i10;
            if (str != null) {
                strArr[i13] = String.format(str, Integer.valueOf(i12));
            } else {
                strArr[i13] = String.valueOf(i12);
            }
        }
        return strArr;
    }

    /* renamed from: b */
    public static Calendar m2931b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    /* renamed from: c */
    public static a m2932c(Locale locale, Resources resources) {
        return new a(locale, resources);
    }
}
