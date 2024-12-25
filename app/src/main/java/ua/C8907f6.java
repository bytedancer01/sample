package ua;

import android.content.Context;
import android.os.Bundle;
import p305ra.C8433yd;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f6.class
 */
/* renamed from: ua.f6 */
/* loaded from: combined.jar:classes2.jar:ua/f6.class */
public final class C8907f6 {

    /* renamed from: a */
    public final Context f41061a;

    /* renamed from: b */
    public String f41062b;

    /* renamed from: c */
    public String f41063c;

    /* renamed from: d */
    public String f41064d;

    /* renamed from: e */
    public Boolean f41065e;

    /* renamed from: f */
    public long f41066f;

    /* renamed from: g */
    public C8433yd f41067g;

    /* renamed from: h */
    public boolean f41068h;

    /* renamed from: i */
    public final Long f41069i;

    /* renamed from: j */
    public String f41070j;

    public C8907f6(Context context, C8433yd c8433yd, Long l10) {
        this.f41068h = true;
        C9935o.m41850j(context);
        Context applicationContext = context.getApplicationContext();
        C9935o.m41850j(applicationContext);
        this.f41061a = applicationContext;
        this.f41069i = l10;
        if (c8433yd != null) {
            this.f41067g = c8433yd;
            this.f41062b = c8433yd.f39431i;
            this.f41063c = c8433yd.f39430h;
            this.f41064d = c8433yd.f39429g;
            this.f41068h = c8433yd.f39428f;
            this.f41066f = c8433yd.f39427e;
            this.f41070j = c8433yd.f39433k;
            Bundle bundle = c8433yd.f39432j;
            if (bundle != null) {
                this.f41065e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
