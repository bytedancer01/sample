package p234o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p030c0.C0950k;
import p050d0.C4290b;
import p234o.C6799a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o/d.class
 */
/* renamed from: o.d */
/* loaded from: combined.jar:classes1.jar:o/d.class */
public final class C6802d {

    /* renamed from: a */
    public final Intent f35474a;

    /* renamed from: b */
    public final Bundle f35475b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o/d$a.class
     */
    /* renamed from: o.d$a */
    /* loaded from: combined.jar:classes1.jar:o/d$a.class */
    public static final class a {

        /* renamed from: c */
        public ArrayList<Bundle> f35478c;

        /* renamed from: d */
        public Bundle f35479d;

        /* renamed from: e */
        public ArrayList<Bundle> f35480e;

        /* renamed from: f */
        public SparseArray<Bundle> f35481f;

        /* renamed from: g */
        public Bundle f35482g;

        /* renamed from: a */
        public final Intent f35476a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C6799a.a f35477b = new C6799a.a();

        /* renamed from: h */
        public int f35483h = 0;

        /* renamed from: i */
        public boolean f35484i = true;

        public a() {
        }

        public a(C6804f c6804f) {
            if (c6804f != null) {
                m31359b(c6804f);
            }
        }

        /* renamed from: a */
        public C6802d m31358a() {
            if (!this.f35476a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m31360c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f35478c;
            if (arrayList != null) {
                this.f35476a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f35480e;
            if (arrayList2 != null) {
                this.f35476a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f35476a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f35484i);
            this.f35476a.putExtras(this.f35477b.m31349a().m31348a());
            Bundle bundle = this.f35482g;
            if (bundle != null) {
                this.f35476a.putExtras(bundle);
            }
            if (this.f35481f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f35481f);
                this.f35476a.putExtras(bundle2);
            }
            this.f35476a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f35483h);
            return new C6802d(this.f35476a, this.f35479d);
        }

        /* renamed from: b */
        public a m31359b(C6804f c6804f) {
            this.f35476a.setPackage(c6804f.m31364d().getPackageName());
            m31360c(c6804f.m31363c(), c6804f.m31365e());
            return this;
        }

        /* renamed from: c */
        public final void m31360c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0950k.m5672b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f35476a.putExtras(bundle);
        }
    }

    public C6802d(Intent intent, Bundle bundle) {
        this.f35474a = intent;
        this.f35475b = bundle;
    }

    /* renamed from: a */
    public void m31357a(Context context, Uri uri) {
        this.f35474a.setData(uri);
        C4290b.m21732k(context, this.f35474a, this.f35475b);
    }
}
