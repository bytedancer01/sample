package p305ra;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import p050d0.C4298j;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/k3.class
 */
/* renamed from: ra.k3 */
/* loaded from: combined.jar:classes2.jar:ra/k3.class */
public final class C8213k3 implements InterfaceC8168h3 {

    /* renamed from: c */
    public static C8213k3 f39147c;

    /* renamed from: a */
    public final Context f39148a;

    /* renamed from: b */
    public final ContentObserver f39149b;

    public C8213k3() {
        this.f39148a = null;
        this.f39149b = null;
    }

    public C8213k3(Context context) {
        this.f39148a = context;
        C8198j3 c8198j3 = new C8198j3(this, null);
        this.f39149b = c8198j3;
        context.getContentResolver().registerContentObserver(C8422y2.f39393a, true, c8198j3);
    }

    /* renamed from: a */
    public static C8213k3 m35525a(Context context) {
        C8213k3 c8213k3;
        synchronized (C8213k3.class) {
            try {
                if (f39147c == null) {
                    f39147c = C4298j.m21759b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C8213k3(context) : new C8213k3();
                }
                c8213k3 = f39147c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8213k3;
    }

    /* renamed from: c */
    public static void m35526c() {
        Context context;
        synchronized (C8213k3.class) {
            try {
                C8213k3 c8213k3 = f39147c;
                if (c8213k3 != null && (context = c8213k3.f39148a) != null && c8213k3.f39149b != null) {
                    context.getContentResolver().unregisterContentObserver(f39147c.f39149b);
                }
                f39147c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p305ra.InterfaceC8168h3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String mo35199g(final String str) {
        if (this.f39148a == null) {
            return null;
        }
        try {
            return (String) C8138f3.m35359a(new InterfaceC8153g3(this, str) { // from class: ra.i3

                /* renamed from: a */
                public final C8213k3 f39115a;

                /* renamed from: b */
                public final String f39116b;

                {
                    this.f39115a = this;
                    this.f39116b = str;
                }

                @Override // p305ra.InterfaceC8153g3
                public final Object zza() {
                    return this.f39115a.m35528d(this.f39116b);
                }
            });
        } catch (IllegalStateException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ String m35528d(String str) {
        return C8422y2.m36218a(this.f39148a.getContentResolver(), str, null);
    }
}
