package ua;

import android.content.ComponentName;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p8.class
 */
/* renamed from: ua.p8 */
/* loaded from: combined.jar:classes2.jar:ua/p8.class */
public final class RunnableC9029p8 implements Runnable {

    /* renamed from: b */
    public final ComponentName f41548b;

    /* renamed from: c */
    public final ServiceConnectionC9077t8 f41549c;

    public RunnableC9029p8(ServiceConnectionC9077t8 serviceConnectionC9077t8, ComponentName componentName) {
        this.f41549c = serviceConnectionC9077t8;
        this.f41548b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9089u8.m38283x(this.f41549c.f41648d, this.f41548b);
    }
}
