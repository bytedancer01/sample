package p175k0;

import android.os.Build;
import android.p016os.LocaleList;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/f.class
 */
/* renamed from: k0.f */
/* loaded from: combined.jar:classes1.jar:k0/f.class */
public final class C5445f {

    /* renamed from: b */
    public static final C5445f f31189b = m27199a(new Locale[0]);

    /* renamed from: a */
    public InterfaceC5447h f31190a;

    public C5445f(InterfaceC5447h interfaceC5447h) {
        this.f31190a = interfaceC5447h;
    }

    /* renamed from: a */
    public static C5445f m27199a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m27201d(new LocaleList(localeArr)) : new C5445f(new C5446g(localeArr));
    }

    /* renamed from: b */
    public static Locale m27200b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains(AWSAppSyncClient.DATABASE_NAME_DELIMITER)) {
                return new Locale(str);
            }
            String[] split2 = str.split(AWSAppSyncClient.DATABASE_NAME_DELIMITER, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C5445f m27201d(LocaleList localeList) {
        return new C5445f(new C5448i(localeList));
    }

    /* renamed from: c */
    public Locale m27202c(int i10) {
        return this.f31190a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5445f) && this.f31190a.equals(((C5445f) obj).f31190a);
    }

    public int hashCode() {
        return this.f31190a.hashCode();
    }

    public String toString() {
        return this.f31190a.toString();
    }
}
