package p216m9;

import android.content.Context;
import android.os.IBinder;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m9/v.class
 */
/* renamed from: m9.v */
/* loaded from: combined.jar:classes2.jar:m9/v.class */
public abstract class AbstractC5995v {

    /* renamed from: a */
    public final Context f33633a;

    /* renamed from: b */
    public final String f33634b;

    /* renamed from: c */
    public final BinderC6000x0 f33635c = new BinderC6000x0(this, null);

    public AbstractC5995v(Context context, String str) {
        this.f33633a = ((Context) C9935o.m41850j(context)).getApplicationContext();
        this.f33634b = C9935o.m41846f(str);
    }

    /* renamed from: a */
    public abstract AbstractC5989s mo29362a(String str);

    /* renamed from: b */
    public final String m29363b() {
        return this.f33634b;
    }

    /* renamed from: c */
    public final Context m29364c() {
        return this.f33633a;
    }

    /* renamed from: d */
    public abstract boolean mo29365d();

    /* renamed from: e */
    public final IBinder m29366e() {
        return this.f33635c;
    }
}
