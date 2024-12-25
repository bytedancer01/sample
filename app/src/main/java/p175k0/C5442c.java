package p175k0;

import android.content.res.Configuration;
import android.os.Build;
import android.p016os.LocaleList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/c.class
 */
/* renamed from: k0.c */
/* loaded from: combined.jar:classes1.jar:k0/c.class */
public final class C5442c {
    /* renamed from: a */
    public static C5445f m27195a(Configuration configuration) {
        LocaleList locales;
        if (Build.VERSION.SDK_INT < 24) {
            return C5445f.m27199a(configuration.locale);
        }
        locales = configuration.getLocales();
        return C5445f.m27201d(locales);
    }
}
