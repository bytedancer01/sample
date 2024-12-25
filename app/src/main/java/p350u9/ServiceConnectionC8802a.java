package p350u9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/a.class
 */
/* renamed from: u9.a */
/* loaded from: combined.jar:classes2.jar:u9/a.class */
public class ServiceConnectionC8802a implements ServiceConnection {

    /* renamed from: b */
    public boolean f40815b = false;

    /* renamed from: c */
    public final BlockingQueue<IBinder> f40816c = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m37657a(long j10, TimeUnit timeUnit) {
        C9935o.m41849i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f40815b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f40815b = true;
        IBinder poll = this.f40816c.poll(j10, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f40816c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
