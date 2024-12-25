package p137i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p029c.C0920a;
import p029c.C0921b;
import p029c.C0923d;
import p029c.C0929j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i/a.class
 */
/* renamed from: i.a */
/* loaded from: combined.jar:classes1.jar:i/a.class */
public class C5133a {

    /* renamed from: a */
    public Context f29441a;

    public C5133a(Context context) {
        this.f29441a = context;
    }

    /* renamed from: b */
    public static C5133a m25734b(Context context) {
        return new C5133a(context);
    }

    /* renamed from: a */
    public boolean m25735a() {
        return this.f29441a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m25736c() {
        return this.f29441a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m25737d() {
        Configuration configuration = this.f29441a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m25738e() {
        return this.f29441a.getResources().getDimensionPixelSize(C0923d.f6142b);
    }

    /* renamed from: f */
    public int m25739f() {
        TypedArray obtainStyledAttributes = this.f29441a.obtainStyledAttributes(null, C0929j.f6412a, C0920a.f6108c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0929j.f6464j, 0);
        Resources resources = this.f29441a.getResources();
        int i10 = layoutDimension;
        if (!m25740g()) {
            i10 = Math.min(layoutDimension, resources.getDimensionPixelSize(C0923d.f6141a));
        }
        obtainStyledAttributes.recycle();
        return i10;
    }

    /* renamed from: g */
    public boolean m25740g() {
        return this.f29441a.getResources().getBoolean(C0921b.f6132a);
    }

    /* renamed from: h */
    public boolean m25741h() {
        return true;
    }
}
