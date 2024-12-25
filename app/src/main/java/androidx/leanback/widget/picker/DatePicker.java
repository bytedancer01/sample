package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.leanback.widget.picker.C0533a;
import com.facebook.ads.AdError;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p019b1.C0780a;
import p019b1.C0781b;
import p413y0.C9799l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/picker/DatePicker.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/picker/DatePicker.class */
public class DatePicker extends C0780a {

    /* renamed from: H */
    public static final int[] f3550H = {5, 2, 1};

    /* renamed from: A */
    public int f3551A;

    /* renamed from: B */
    public final DateFormat f3552B;

    /* renamed from: C */
    public C0533a.a f3553C;

    /* renamed from: D */
    public Calendar f3554D;

    /* renamed from: E */
    public Calendar f3555E;

    /* renamed from: F */
    public Calendar f3556F;

    /* renamed from: G */
    public Calendar f3557G;

    /* renamed from: u */
    public String f3558u;

    /* renamed from: v */
    public C0781b f3559v;

    /* renamed from: w */
    public C0781b f3560w;

    /* renamed from: x */
    public C0781b f3561x;

    /* renamed from: y */
    public int f3562y;

    /* renamed from: z */
    public int f3563z;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/leanback/widget/picker/DatePicker$a.class
     */
    /* renamed from: androidx.leanback.widget.picker.DatePicker$a */
    /* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/picker/DatePicker$a.class */
    public class RunnableC0532a implements Runnable {

        /* renamed from: b */
        public final boolean f3564b;

        /* renamed from: c */
        public final DatePicker f3565c;

        public RunnableC0532a(DatePicker datePicker, boolean z10) {
            this.f3565c = datePicker;
            this.f3564b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3565c.m2929u(this.f3564b);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3552B = new SimpleDateFormat("MM/dd/yyyy");
        m2927q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9799l.f45043K);
        String string = obtainStyledAttributes.getString(C9799l.f45044L);
        String string2 = obtainStyledAttributes.getString(C9799l.f45045M);
        this.f3557G.clear();
        if (TextUtils.isEmpty(string) || !m2925o(string, this.f3557G)) {
            this.f3557G.set(1900, 0, 1);
        }
        this.f3554D.setTimeInMillis(this.f3557G.getTimeInMillis());
        this.f3557G.clear();
        if (TextUtils.isEmpty(string2) || !m2925o(string2, this.f3557G)) {
            this.f3557G.set(AdError.BROKEN_MEDIA_ERROR_CODE, 0, 1);
        }
        this.f3555E.setTimeInMillis(this.f3557G.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(C9799l.f45046N);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }

    /* renamed from: n */
    public static boolean m2919n(char c10, char[] cArr) {
        for (char c11 : cArr) {
            if (c10 == c11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m2920r(C0781b c0781b, int i10) {
        if (i10 == c0781b.m5014d()) {
            return false;
        }
        c0781b.m5018h(i10);
        return true;
    }

    /* renamed from: s */
    public static boolean m2921s(C0781b c0781b, int i10) {
        if (i10 == c0781b.m5015e()) {
            return false;
        }
        c0781b.m5019i(i10);
        return true;
    }

    @Override // p019b1.C0780a
    /* renamed from: c */
    public final void mo2922c(int i10, int i11) {
        this.f3557G.setTimeInMillis(this.f3556F.getTimeInMillis());
        int m5012b = m4997a(i10).m5012b();
        if (i10 == this.f3563z) {
            this.f3557G.add(5, i11 - m5012b);
        } else if (i10 == this.f3562y) {
            this.f3557G.add(2, i11 - m5012b);
        } else {
            if (i10 != this.f3551A) {
                throw new IllegalArgumentException();
            }
            this.f3557G.add(1, i11 - m5012b);
        }
        m2926p(this.f3557G.get(1), this.f3557G.get(2), this.f3557G.get(5));
        m2928t(false);
    }

    public long getDate() {
        return this.f3556F.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f3558u;
    }

    public long getMaxDate() {
        return this.f3555E.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f3554D.getTimeInMillis();
    }

    /* renamed from: l */
    public List<CharSequence> m2923l() {
        String m2924m = m2924m(this.f3558u);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        char c10 = 0;
        for (int i10 = 0; i10 < m2924m.length(); i10++) {
            char charAt = m2924m.charAt(i10);
            if (charAt != ' ') {
                if (charAt != '\'') {
                    if (z10 || !m2919n(charAt, new char[]{'Y', 'y', 'M', 'm', 'D', 'd'})) {
                        sb2.append(charAt);
                    } else if (charAt != c10) {
                        arrayList.add(sb2.toString());
                        sb2.setLength(0);
                    }
                    c10 = charAt;
                } else if (z10) {
                    z10 = false;
                } else {
                    sb2.setLength(0);
                    z10 = true;
                }
            }
        }
        arrayList.add(sb2.toString());
        return arrayList;
    }

    /* renamed from: m */
    public String m2924m(String str) {
        String localizedPattern;
        if (C0533a.f3566a) {
            localizedPattern = android.text.format.DateFormat.getBestDateTimePattern(this.f3553C.f3567a, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            localizedPattern = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : "MM/dd/yyyy";
        }
        if (TextUtils.isEmpty(localizedPattern)) {
            localizedPattern = "MM/dd/yyyy";
        }
        return localizedPattern;
    }

    /* renamed from: o */
    public final boolean m2925o(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f3552B.parse(str));
            return true;
        } catch (ParseException e10) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    /* renamed from: p */
    public final void m2926p(int i10, int i11, int i12) {
        Calendar calendar;
        Calendar calendar2;
        this.f3556F.set(i10, i11, i12);
        if (this.f3556F.before(this.f3554D)) {
            calendar = this.f3556F;
            calendar2 = this.f3554D;
        } else {
            if (!this.f3556F.after(this.f3555E)) {
                return;
            }
            calendar = this.f3556F;
            calendar2 = this.f3555E;
        }
        calendar.setTimeInMillis(calendar2.getTimeInMillis());
    }

    /* renamed from: q */
    public final void m2927q() {
        C0533a.a m2932c = C0533a.m2932c(Locale.getDefault(), getContext().getResources());
        this.f3553C = m2932c;
        this.f3557G = C0533a.m2931b(this.f3557G, m2932c.f3567a);
        this.f3554D = C0533a.m2931b(this.f3554D, this.f3553C.f3567a);
        this.f3555E = C0533a.m2931b(this.f3555E, this.f3553C.f3567a);
        this.f3556F = C0533a.m2931b(this.f3556F, this.f3553C.f3567a);
        C0781b c0781b = this.f3559v;
        if (c0781b != null) {
            c0781b.m5020j(this.f3553C.f3568b);
            m4999d(this.f3562y, this.f3559v);
        }
    }

    public void setDatePickerFormat(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (TextUtils.equals(this.f3558u, str2)) {
            return;
        }
        this.f3558u = str2;
        List<CharSequence> m2923l = m2923l();
        if (m2923l.size() != str2.length() + 1) {
            throw new IllegalStateException("Separators size: " + m2923l.size() + " must equal the size of datePickerFormat: " + str2.length() + " + 1");
        }
        setSeparators(m2923l);
        this.f3560w = null;
        this.f3559v = null;
        this.f3561x = null;
        this.f3562y = -1;
        this.f3563z = -1;
        this.f3551A = -1;
        String upperCase = str2.toUpperCase();
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < upperCase.length(); i10++) {
            char charAt = upperCase.charAt(i10);
            if (charAt == 'D') {
                if (this.f3560w != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C0781b c0781b = new C0781b();
                this.f3560w = c0781b;
                arrayList.add(c0781b);
                this.f3560w.m5017g("%02d");
                this.f3563z = i10;
            } else if (charAt != 'M') {
                if (charAt != 'Y') {
                    throw new IllegalArgumentException("datePicker format error");
                }
                if (this.f3561x != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C0781b c0781b2 = new C0781b();
                this.f3561x = c0781b2;
                arrayList.add(c0781b2);
                this.f3551A = i10;
                this.f3561x.m5017g("%d");
            } else {
                if (this.f3559v != null) {
                    throw new IllegalArgumentException("datePicker format error");
                }
                C0781b c0781b3 = new C0781b();
                this.f3559v = c0781b3;
                arrayList.add(c0781b3);
                this.f3559v.m5020j(this.f3553C.f3568b);
                this.f3562y = i10;
            }
        }
        setColumns(arrayList);
        m2928t(false);
    }

    public void setMaxDate(long j10) {
        this.f3557G.setTimeInMillis(j10);
        if (this.f3557G.get(1) != this.f3555E.get(1) || this.f3557G.get(6) == this.f3555E.get(6)) {
            this.f3555E.setTimeInMillis(j10);
            if (this.f3556F.after(this.f3555E)) {
                this.f3556F.setTimeInMillis(this.f3555E.getTimeInMillis());
            }
            m2928t(false);
        }
    }

    public void setMinDate(long j10) {
        this.f3557G.setTimeInMillis(j10);
        if (this.f3557G.get(1) != this.f3554D.get(1) || this.f3557G.get(6) == this.f3554D.get(6)) {
            this.f3554D.setTimeInMillis(j10);
            if (this.f3556F.before(this.f3554D)) {
                this.f3556F.setTimeInMillis(this.f3554D.getTimeInMillis());
            }
            m2928t(false);
        }
    }

    /* renamed from: t */
    public final void m2928t(boolean z10) {
        post(new RunnableC0532a(this, z10));
    }

    /* renamed from: u */
    public void m2929u(boolean z10) {
        int[] iArr = {this.f3563z, this.f3562y, this.f3551A};
        boolean z11 = true;
        boolean z12 = true;
        for (int length = f3550H.length - 1; length >= 0; length--) {
            int i10 = iArr[length];
            if (i10 >= 0) {
                int i11 = f3550H[length];
                C0781b m4997a = m4997a(i10);
                boolean m2921s = m2921s(m4997a, z11 ? this.f3554D.get(i11) : this.f3556F.getActualMinimum(i11));
                boolean m2920r = m2920r(m4997a, z12 ? this.f3555E.get(i11) : this.f3556F.getActualMaximum(i11));
                boolean z13 = z11 & (this.f3556F.get(i11) == this.f3554D.get(i11));
                z12 &= this.f3556F.get(i11) == this.f3555E.get(i11);
                if (m2921s | false | m2920r) {
                    m4999d(iArr[length], m4997a);
                }
                m5000e(iArr[length], this.f3556F.get(i11), z10);
                z11 = z13;
            }
        }
    }
}
