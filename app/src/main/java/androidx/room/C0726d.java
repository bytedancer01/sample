package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0725c;
import androidx.room.InterfaceC0723a;
import androidx.room.InterfaceC0724b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/room/d.class
 */
/* renamed from: androidx.room.d */
/* loaded from: combined.jar:classes1.jar:androidx/room/d.class */
public class C0726d {

    /* renamed from: a */
    public final Context f5012a;

    /* renamed from: b */
    public final String f5013b;

    /* renamed from: c */
    public int f5014c;

    /* renamed from: d */
    public final C0725c f5015d;

    /* renamed from: e */
    public final C0725c.c f5016e;

    /* renamed from: f */
    public InterfaceC0724b f5017f;

    /* renamed from: g */
    public final Executor f5018g;

    /* renamed from: h */
    public final InterfaceC0723a f5019h = new a(this);

    /* renamed from: i */
    public final AtomicBoolean f5020i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f5021j;

    /* renamed from: k */
    public final Runnable f5022k;

    /* renamed from: l */
    public final Runnable f5023l;

    /* renamed from: m */
    public final Runnable f5024m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$a.class
     */
    /* renamed from: androidx.room.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$a.class */
    public class a extends InterfaceC0723a.a {

        /* renamed from: b */
        public final C0726d f5025b;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/room/d$a$a.class
         */
        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:androidx/room/d$a$a.class */
        public class RunnableC10253a implements Runnable {

            /* renamed from: b */
            public final String[] f5026b;

            /* renamed from: c */
            public final a f5027c;

            public RunnableC10253a(a aVar, String[] strArr) {
                this.f5027c = aVar;
                this.f5026b = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5027c.f5025b.f5015d.m4714e(this.f5026b);
            }
        }

        public a(C0726d c0726d) {
            this.f5025b = c0726d;
        }

        @Override // androidx.room.InterfaceC0723a
        /* renamed from: G */
        public void mo4707G(String[] strArr) {
            this.f5025b.f5018g.execute(new RunnableC10253a(this, strArr));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$b.class
     */
    /* renamed from: androidx.room.d$b */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$b.class */
    public class b implements ServiceConnection {

        /* renamed from: b */
        public final C0726d f5028b;

        public b(C0726d c0726d) {
            this.f5028b = c0726d;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f5028b.f5017f = InterfaceC0724b.a.m4709Z(iBinder);
            C0726d c0726d = this.f5028b;
            c0726d.f5018g.execute(c0726d.f5022k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0726d c0726d = this.f5028b;
            c0726d.f5018g.execute(c0726d.f5023l);
            this.f5028b.f5017f = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$c.class
     */
    /* renamed from: androidx.room.d$c */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final C0726d f5029b;

        public c(C0726d c0726d) {
            this.f5029b = c0726d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0726d c0726d = this.f5029b;
                InterfaceC0724b interfaceC0724b = c0726d.f5017f;
                if (interfaceC0724b != null) {
                    c0726d.f5014c = interfaceC0724b.mo4704K0(c0726d.f5019h, c0726d.f5013b);
                    C0726d c0726d2 = this.f5029b;
                    c0726d2.f5015d.m4711a(c0726d2.f5016e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$d.class
     */
    /* renamed from: androidx.room.d$d */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final C0726d f5030b;

        public d(C0726d c0726d) {
            this.f5030b = c0726d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0726d c0726d = this.f5030b;
            c0726d.f5015d.m4716g(c0726d.f5016e);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$e.class
     */
    /* renamed from: androidx.room.d$e */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$e.class */
    public class e implements Runnable {

        /* renamed from: b */
        public final C0726d f5031b;

        public e(C0726d c0726d) {
            this.f5031b = c0726d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0726d c0726d = this.f5031b;
            c0726d.f5015d.m4716g(c0726d.f5016e);
            try {
                C0726d c0726d2 = this.f5031b;
                InterfaceC0724b interfaceC0724b = c0726d2.f5017f;
                if (interfaceC0724b != null) {
                    interfaceC0724b.mo4706x1(c0726d2.f5019h, c0726d2.f5014c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            C0726d c0726d3 = this.f5031b;
            c0726d3.f5012a.unbindService(c0726d3.f5021j);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/room/d$f.class
     */
    /* renamed from: androidx.room.d$f */
    /* loaded from: combined.jar:classes1.jar:androidx/room/d$f.class */
    public class f extends C0725c.c {

        /* renamed from: b */
        public final C0726d f5032b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0726d c0726d, String[] strArr) {
            super(strArr);
            this.f5032b = c0726d;
        }

        @Override // androidx.room.C0725c.c
        /* renamed from: a */
        public boolean mo4728a() {
            return true;
        }

        @Override // androidx.room.C0725c.c
        /* renamed from: b */
        public void mo4729b(Set<String> set) {
            if (this.f5032b.f5020i.get()) {
                return;
            }
            try {
                C0726d c0726d = this.f5032b;
                InterfaceC0724b interfaceC0724b = c0726d.f5017f;
                if (interfaceC0724b != null) {
                    interfaceC0724b.mo4705r0(c0726d.f5014c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public C0726d(Context context, String str, C0725c c0725c, Executor executor) {
        b bVar = new b(this);
        this.f5021j = bVar;
        this.f5022k = new c(this);
        this.f5023l = new d(this);
        this.f5024m = new e(this);
        Context applicationContext = context.getApplicationContext();
        this.f5012a = applicationContext;
        this.f5013b = str;
        this.f5015d = c0725c;
        this.f5018g = executor;
        this.f5016e = new f(this, (String[]) c0725c.f4989a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
