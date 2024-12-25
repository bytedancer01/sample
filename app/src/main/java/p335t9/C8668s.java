package p335t9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/s.class
 */
/* renamed from: t9.s */
/* loaded from: combined.jar:classes2.jar:t9/s.class */
public final class C8668s {

    /* renamed from: a */
    public final Messenger f40436a;

    /* renamed from: b */
    public final C8654e f40437b;

    public C8668s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f40436a = new Messenger(iBinder);
            this.f40437b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f40437b = new C8654e(iBinder);
            this.f40436a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void m37162a(Message message) {
        Messenger messenger = this.f40436a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C8654e c8654e = this.f40437b;
        if (c8654e == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c8654e.m37145c(message);
    }
}
