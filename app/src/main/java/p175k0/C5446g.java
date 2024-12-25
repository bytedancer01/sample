package p175k0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/g.class
 */
/* renamed from: k0.g */
/* loaded from: combined.jar:classes1.jar:k0/g.class */
public final class C5446g implements InterfaceC5447h {

    /* renamed from: c */
    public static final Locale[] f31191c = new Locale[0];

    /* renamed from: d */
    public static final Locale f31192d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f31193e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f31194f = C5445f.m27200b("en-Latn");

    /* renamed from: a */
    public final Locale[] f31195a;

    /* renamed from: b */
    public final String f31196b;

    public C5446g(Locale... localeArr) {
        String sb2;
        if (localeArr.length == 0) {
            this.f31195a = f31191c;
            sb2 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb3 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale == null) {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m27203b(sb3, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb3.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f31195a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
            sb2 = sb3.toString();
        }
        this.f31196b = sb2;
    }

    /* renamed from: b */
    public static void m27203b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // p175k0.InterfaceC5447h
    /* renamed from: a */
    public Object mo27204a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5446g)) {
            return false;
        }
        Locale[] localeArr = ((C5446g) obj).f31195a;
        if (this.f31195a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f31195a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // p175k0.InterfaceC5447h
    public Locale get(int i10) {
        Locale locale;
        if (i10 >= 0) {
            Locale[] localeArr = this.f31195a;
            if (i10 < localeArr.length) {
                locale = localeArr[i10];
                return locale;
            }
        }
        locale = null;
        return locale;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f31195a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f31195a;
            if (i10 >= localeArr.length) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(localeArr[i10]);
            if (i10 < this.f31195a.length - 1) {
                sb2.append(',');
            }
            i10++;
        }
    }
}
