package p435z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/m.class
 */
/* renamed from: z3.m */
/* loaded from: combined.jar:classes1.jar:z3/m.class */
public class C10049m {

    /* renamed from: a */
    public boolean f46112a;

    /* renamed from: b */
    public final Handler f46113b = new Handler(Looper.getMainLooper(), new b());

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:z3/m$b.class
     */
    /* renamed from: z3.m$b */
    /* loaded from: combined.jar:classes1.jar:z3/m$b.class */
    public static class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC10048l) message.obj).mo25232b();
            return true;
        }
    }

    /* renamed from: a */
    public void m42262a(InterfaceC10048l<?> interfaceC10048l) {
        C9242h.m38963a();
        if (this.f46112a) {
            this.f46113b.obtainMessage(1, interfaceC10048l).sendToTarget();
            return;
        }
        this.f46112a = true;
        interfaceC10048l.mo25232b();
        this.f46112a = false;
    }
}
