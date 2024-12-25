package p097fa;

import android.content.Context;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fa/e.class
 */
/* renamed from: fa.e */
/* loaded from: combined.jar:classes2.jar:fa/e.class */
public class C4794e {

    /* renamed from: b */
    public static C4794e f28236b = new C4794e();

    /* renamed from: a */
    public C4793d f28237a = null;

    /* renamed from: a */
    public static C4793d m24250a(Context context) {
        return f28236b.m24251b(context);
    }

    /* renamed from: b */
    public final C4793d m24251b(Context context) {
        C4793d c4793d;
        synchronized (this) {
            if (this.f28237a == null) {
                Context context2 = context;
                if (context.getApplicationContext() != null) {
                    context2 = context.getApplicationContext();
                }
                this.f28237a = new C4793d(context2);
            }
            c4793d = this.f28237a;
        }
        return c4793d;
    }
}
