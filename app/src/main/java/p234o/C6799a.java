package p234o;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o/a.class
 */
/* renamed from: o.a */
/* loaded from: combined.jar:classes1.jar:o/a.class */
public final class C6799a {

    /* renamed from: a */
    public final Integer f35444a;

    /* renamed from: b */
    public final Integer f35445b;

    /* renamed from: c */
    public final Integer f35446c;

    /* renamed from: d */
    public final Integer f35447d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o/a$a.class
     */
    /* renamed from: o.a$a */
    /* loaded from: combined.jar:classes1.jar:o/a$a.class */
    public static final class a {

        /* renamed from: a */
        public Integer f35448a;

        /* renamed from: b */
        public Integer f35449b;

        /* renamed from: c */
        public Integer f35450c;

        /* renamed from: d */
        public Integer f35451d;

        /* renamed from: a */
        public C6799a m31349a() {
            return new C6799a(this.f35448a, this.f35449b, this.f35450c, this.f35451d);
        }
    }

    public C6799a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f35444a = num;
        this.f35445b = num2;
        this.f35446c = num3;
        this.f35447d = num4;
    }

    /* renamed from: a */
    public Bundle m31348a() {
        Bundle bundle = new Bundle();
        Integer num = this.f35444a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f35445b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f35446c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f35447d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
