package p383w9;

import com.google.android.gms.common.api.C2414a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/e1.class
 */
/* renamed from: w9.e1 */
/* loaded from: combined.jar:classes2.jar:w9/e1.class */
public final class RunnableC9454e1 implements Runnable {

    /* renamed from: b */
    public final C9459f1 f43232b;

    public RunnableC9454e1(C9459f1 c9459f1) {
        this.f43232b = c9459f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2414a.f fVar;
        C2414a.f fVar2;
        C9464g1 c9464g1 = this.f43232b.f43259a;
        fVar = c9464g1.f43266c;
        fVar2 = c9464g1.f43266c;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
