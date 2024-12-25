package cf;

import android.app.Activity;
import android.os.Handler;
import mbanje.kurt.fabbutton.FabButton;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cf/h.class
 */
/* renamed from: cf.h */
/* loaded from: combined.jar:classes2.jar:cf/h.class */
public class C1084h {

    /* renamed from: c */
    public final FabButton f7251c;

    /* renamed from: d */
    public final Activity f7252d;

    /* renamed from: a */
    public int f7249a = 0;

    /* renamed from: b */
    public Handler f7250b = new Handler();

    /* renamed from: e */
    public boolean f7253e = false;

    public C1084h(FabButton fabButton, Activity activity) {
        this.f7251c = fabButton;
        this.f7252d = activity;
    }

    /* renamed from: a */
    public boolean m6471a() {
        return this.f7253e;
    }

    /* renamed from: b */
    public void m6472b() {
        this.f7251c.m30205d(true);
        this.f7253e = true;
    }

    /* renamed from: c */
    public void m6473c() {
        this.f7251c.m30205d(false);
        this.f7253e = false;
    }
}
