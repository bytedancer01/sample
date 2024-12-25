package p443zc;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p443zc.ServiceConnectionC10169c0;
import za.AbstractC10144i;
import za.InterfaceC10134d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/z.class
 */
/* renamed from: zc.z */
/* loaded from: combined.jar:classes2.jar:zc/z.class */
public class BinderC10192z extends Binder {

    /* renamed from: b */
    public final a f46665b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zc/z$a.class
     */
    /* renamed from: zc.z$a */
    /* loaded from: combined.jar:classes2.jar:zc/z$a.class */
    public interface a {
        /* renamed from: a */
        AbstractC10144i<Void> mo26098a(Intent intent);
    }

    public BinderC10192z(a aVar) {
        this.f46665b = aVar;
    }

    /* renamed from: b */
    public void m42656b(final ServiceConnectionC10169c0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.f46665b.mo26098a(aVar.f46615a).mo42553b(C10174h.m42622a(), new InterfaceC10134d(aVar) { // from class: zc.y

            /* renamed from: a */
            public final ServiceConnectionC10169c0.a f46664a;

            {
                this.f46664a = aVar;
            }

            @Override // za.InterfaceC10134d
            /* renamed from: a */
            public void mo26091a(AbstractC10144i abstractC10144i) {
                this.f46664a.m42611b();
            }
        });
    }
}
