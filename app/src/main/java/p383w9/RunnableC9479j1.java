package p383w9;

import android.util.Log;
import com.google.android.gms.common.api.C2414a;
import java.util.Map;
import p350u9.C8804b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/j1.class
 */
/* renamed from: w9.j1 */
/* loaded from: combined.jar:classes2.jar:w9/j1.class */
public final class RunnableC9479j1 implements Runnable {

    /* renamed from: b */
    public final C8804b f43302b;

    /* renamed from: c */
    public final C9484k1 f43303c;

    public RunnableC9479j1(C9484k1 c9484k1, C8804b c8804b) {
        this.f43303c = c9484k1;
        this.f43302b = c8804b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C9437b c9437b;
        C2414a.f fVar;
        C2414a.f fVar2;
        C2414a.f fVar3;
        C2414a.f fVar4;
        C9484k1 c9484k1 = this.f43303c;
        map = c9484k1.f43324f.f43251m;
        c9437b = c9484k1.f43320b;
        C9464g1 c9464g1 = (C9464g1) map.get(c9437b);
        if (c9464g1 == null) {
            return;
        }
        if (!this.f43302b.m37663T()) {
            c9464g1.m39884E(this.f43302b, null);
            return;
        }
        this.f43303c.f43323e = true;
        fVar = this.f43303c.f43319a;
        if (fVar.requiresSignIn()) {
            this.f43303c.m39940h();
            return;
        }
        try {
            C9484k1 c9484k12 = this.f43303c;
            fVar3 = c9484k12.f43319a;
            fVar4 = c9484k12.f43319a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f43303c.f43319a;
            fVar2.disconnect("Failed to get service from broker.");
            c9464g1.m39884E(new C8804b(10), null);
        }
    }
}
