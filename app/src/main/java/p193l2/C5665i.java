package p193l2;

import android.content.Context;
import p278q2.InterfaceC7748a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l2/i.class
 */
/* renamed from: l2.i */
/* loaded from: combined.jar:classes1.jar:l2/i.class */
public class C5665i {

    /* renamed from: e */
    public static C5665i f31929e;

    /* renamed from: a */
    public C5657a f31930a;

    /* renamed from: b */
    public C5658b f31931b;

    /* renamed from: c */
    public C5663g f31932c;

    /* renamed from: d */
    public C5664h f31933d;

    public C5665i(Context context, InterfaceC7748a interfaceC7748a) {
        Context applicationContext = context.getApplicationContext();
        this.f31930a = new C5657a(applicationContext, interfaceC7748a);
        this.f31931b = new C5658b(applicationContext, interfaceC7748a);
        this.f31932c = new C5663g(applicationContext, interfaceC7748a);
        this.f31933d = new C5664h(applicationContext, interfaceC7748a);
    }

    /* renamed from: c */
    public static C5665i m27880c(Context context, InterfaceC7748a interfaceC7748a) {
        C5665i c5665i;
        synchronized (C5665i.class) {
            try {
                if (f31929e == null) {
                    f31929e = new C5665i(context, interfaceC7748a);
                }
                c5665i = f31929e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5665i;
    }

    /* renamed from: a */
    public C5657a m27881a() {
        return this.f31930a;
    }

    /* renamed from: b */
    public C5658b m27882b() {
        return this.f31931b;
    }

    /* renamed from: d */
    public C5663g m27883d() {
        return this.f31932c;
    }

    /* renamed from: e */
    public C5664h m27884e() {
        return this.f31933d;
    }
}
