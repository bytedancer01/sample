package p440z8;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import java.util.List;
import p030c0.C0964r;
import p420y7.C9849e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/g.class
 */
/* renamed from: z8.g */
/* loaded from: combined.jar:classes2.jar:z8/g.class */
public final class C10085g {

    /* renamed from: a */
    public final C0964r.e f46259a;

    public C10085g(Context context, String str) {
        this.f46259a = new C0964r.e(context.getApplicationContext(), str);
    }

    /* renamed from: a */
    public Notification m42408a(Context context, int i10, PendingIntent pendingIntent, String str) {
        return m42410c(context, i10, pendingIntent, str, C10113u.f46386o);
    }

    /* renamed from: b */
    public Notification m42409b(Context context, int i10, PendingIntent pendingIntent, String str) {
        return m42410c(context, i10, pendingIntent, str, C10113u.f46388q);
    }

    /* renamed from: c */
    public final Notification m42410c(Context context, int i10, PendingIntent pendingIntent, String str, int i11) {
        return m42411d(context, i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    /* renamed from: d */
    public final Notification m42411d(Context context, int i10, PendingIntent pendingIntent, String str, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f46259a.m5764D(i10);
        this.f46259a.m5783n(i11 == 0 ? null : context.getResources().getString(i11));
        this.f46259a.m5781l(pendingIntent);
        this.f46259a.m5766F(str == null ? null : new C0964r.c().m5758h(str));
        this.f46259a.m5762B(i12, i13, z10);
        this.f46259a.m5794y(z11);
        this.f46259a.m5763C(z12);
        return this.f46259a.m5773c();
    }

    /* renamed from: e */
    public Notification m42412e(Context context, int i10, PendingIntent pendingIntent, String str, List<C9849e> list) {
        int i11;
        boolean z10;
        float f10 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = true;
        boolean z14 = false;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C9849e c9849e = list.get(i13);
            int i14 = c9849e.f45183b;
            if (i14 == 5) {
                z12 = true;
            } else if (i14 == 7 || i14 == 2) {
                float m41402b = c9849e.m41402b();
                float f11 = f10;
                if (m41402b != -1.0f) {
                    f11 = f10 + m41402b;
                    z13 = false;
                }
                z14 |= c9849e.m41401a() > 0;
                i12++;
                z11 = true;
                f10 = f11;
            }
        }
        int i15 = z11 ? C10113u.f46387p : z12 ? C10113u.f46389r : 0;
        if (z11) {
            int i16 = (int) (f10 / i12);
            z10 = z13 && z14;
            i11 = i16;
        } else {
            i11 = 0;
            z10 = true;
        }
        return m42411d(context, i10, pendingIntent, str, i15, 100, i11, z10, true, false);
    }
}
