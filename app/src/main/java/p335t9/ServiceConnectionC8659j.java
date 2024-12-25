package p335t9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import ca.C1052b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import na.HandlerC6761e;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/j.class
 */
/* renamed from: t9.j */
/* loaded from: combined.jar:classes2.jar:t9/j.class */
public final class ServiceConnectionC8659j implements ServiceConnection {

    /* renamed from: b */
    public int f40422b;

    /* renamed from: c */
    public final Messenger f40423c;

    /* renamed from: d */
    public C8668s f40424d;

    /* renamed from: e */
    public final Queue<AbstractC8670u<?>> f40425e;

    /* renamed from: f */
    public final SparseArray<AbstractC8670u<?>> f40426f;

    /* renamed from: g */
    public final C8658i f40427g;

    public ServiceConnectionC8659j(C8658i c8658i) {
        this.f40427g = c8658i;
        this.f40422b = 0;
        this.f40423c = new Messenger(new HandlerC6761e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: t9.m

            /* renamed from: b */
            public final ServiceConnectionC8659j f40429b;

            {
                this.f40429b = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f40429b.m37156d(message);
            }
        }));
        this.f40425e = new ArrayDeque();
        this.f40426f = new SparseArray<>();
    }

    /* renamed from: a */
    public final void m37153a() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f40427g.f40419b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: t9.n

            /* renamed from: b */
            public final ServiceConnectionC8659j f40430b;

            {
                this.f40430b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC8670u<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC8659j serviceConnectionC8659j = this.f40430b;
                while (true) {
                    synchronized (serviceConnectionC8659j) {
                        if (serviceConnectionC8659j.f40422b != 2) {
                            return;
                        }
                        if (serviceConnectionC8659j.f40425e.isEmpty()) {
                            serviceConnectionC8659j.m37158f();
                            return;
                        }
                        poll = serviceConnectionC8659j.f40425e.poll();
                        serviceConnectionC8659j.f40426f.put(poll.f40439a, poll);
                        scheduledExecutorService2 = serviceConnectionC8659j.f40427g.f40419b;
                        scheduledExecutorService2.schedule(new Runnable(serviceConnectionC8659j, poll) { // from class: t9.p

                            /* renamed from: b */
                            public final ServiceConnectionC8659j f40433b;

                            /* renamed from: c */
                            public final AbstractC8670u f40434c;

                            {
                                this.f40433b = serviceConnectionC8659j;
                                this.f40434c = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f40433b.m37154b(this.f40434c.f40439a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    context = serviceConnectionC8659j.f40427g.f40418a;
                    Messenger messenger = serviceConnectionC8659j.f40423c;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f40441c;
                    obtain.arg1 = poll.f40439a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo37161d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f40442d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC8659j.f40424d.m37162a(obtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC8659j.m37155c(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void m37154b(int i10) {
        synchronized (this) {
            AbstractC8670u<?> abstractC8670u = this.f40426f.get(i10);
            if (abstractC8670u != null) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Timing out request: ");
                sb2.append(i10);
                Log.w("MessengerIpcClient", sb2.toString());
                this.f40426f.remove(i10);
                abstractC8670u.m37164c(new C8669t(3, "Timed out waiting for response"));
                m37158f();
            }
        }
    }

    /* renamed from: c */
    public final void m37155c(int i10, String str) {
        Context context;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i11 = this.f40422b;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    this.f40422b = 4;
                    return;
                } else {
                    if (i11 == 4) {
                        return;
                    }
                    int i12 = this.f40422b;
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("Unknown state: ");
                    sb2.append(i12);
                    throw new IllegalStateException(sb2.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f40422b = 4;
            C1052b m6223b = C1052b.m6223b();
            context = this.f40427g.f40418a;
            m6223b.m6228c(context, this);
            C8669t c8669t = new C8669t(i10, str);
            Iterator<AbstractC8670u<?>> it = this.f40425e.iterator();
            while (it.hasNext()) {
                it.next().m37164c(c8669t);
            }
            this.f40425e.clear();
            for (int i13 = 0; i13 < this.f40426f.size(); i13++) {
                this.f40426f.valueAt(i13).m37164c(c8669t);
            }
            this.f40426f.clear();
        }
    }

    /* renamed from: d */
    public final boolean m37156d(Message message) {
        int i10 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Received response to request: ");
            sb2.append(i10);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        synchronized (this) {
            AbstractC8670u<?> abstractC8670u = this.f40426f.get(i10);
            if (abstractC8670u == null) {
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("Received response for unknown request: ");
                sb3.append(i10);
                Log.w("MessengerIpcClient", sb3.toString());
                return true;
            }
            this.f40426f.remove(i10);
            m37158f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                abstractC8670u.m37164c(new C8669t(4, "Not supported by GmsCore"));
                return true;
            }
            abstractC8670u.mo37160a(data);
            return true;
        }
    }

    /* renamed from: e */
    public final boolean m37157e(AbstractC8670u<?> abstractC8670u) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            int i10 = this.f40422b;
            if (i10 == 0) {
                this.f40425e.add(abstractC8670u);
                C9935o.m41853m(this.f40422b == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f40422b = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                C1052b m6223b = C1052b.m6223b();
                context = this.f40427g.f40418a;
                if (m6223b.m6227a(context, intent, this, 1)) {
                    scheduledExecutorService = this.f40427g.f40419b;
                    scheduledExecutorService.schedule(new Runnable(this) { // from class: t9.l

                        /* renamed from: b */
                        public final ServiceConnectionC8659j f40428b;

                        {
                            this.f40428b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f40428b.m37159g();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    m37155c(0, "Unable to bind to service");
                }
                return true;
            }
            if (i10 == 1) {
                this.f40425e.add(abstractC8670u);
                return true;
            }
            if (i10 == 2) {
                this.f40425e.add(abstractC8670u);
                m37153a();
                return true;
            }
            if (i10 == 3 || i10 == 4) {
                return false;
            }
            int i11 = this.f40422b;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i11);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: f */
    public final void m37158f() {
        Context context;
        synchronized (this) {
            if (this.f40422b == 2 && this.f40425e.isEmpty() && this.f40426f.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f40422b = 3;
                C1052b m6223b = C1052b.m6223b();
                context = this.f40427g.f40418a;
                m6223b.m6228c(context, this);
            }
        }
    }

    /* renamed from: g */
    public final void m37159g() {
        synchronized (this) {
            if (this.f40422b == 1) {
                m37155c(1, "Timed out while binding");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f40427g.f40419b;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: t9.o

            /* renamed from: b */
            public final ServiceConnectionC8659j f40431b;

            /* renamed from: c */
            public final IBinder f40432c;

            {
                this.f40431b = this;
                this.f40432c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC8659j serviceConnectionC8659j = this.f40431b;
                IBinder iBinder2 = this.f40432c;
                synchronized (serviceConnectionC8659j) {
                    if (iBinder2 == null) {
                        serviceConnectionC8659j.m37155c(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC8659j.f40424d = new C8668s(iBinder2);
                        serviceConnectionC8659j.f40422b = 2;
                        serviceConnectionC8659j.m37153a();
                    } catch (RemoteException e10) {
                        serviceConnectionC8659j.m37155c(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f40427g.f40419b;
        scheduledExecutorService.execute(new Runnable(this) { // from class: t9.q

            /* renamed from: b */
            public final ServiceConnectionC8659j f40435b;

            {
                this.f40435b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f40435b.m37155c(2, "Service disconnected");
            }
        });
    }
}
