package p135hh;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p135hh.C5095d0;
import p135hh.InterfaceC5101i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/s.class
 */
/* renamed from: hh.s */
/* loaded from: combined.jar:classes2.jar:hh/s.class */
public class ServiceC5111s extends Service implements C5095d0.d, C5095d0.b, C5095d0.e {

    /* renamed from: d */
    public static c f29335d;

    /* renamed from: b */
    public static final RemoteCallbackList<InterfaceC5102j> f29333b = new RemoteCallbackList<>();

    /* renamed from: c */
    public static final InterfaceC5101i.a f29334c = new a();

    /* renamed from: e */
    public static final b f29336e = new b(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/s$a.class
     */
    /* renamed from: hh.s$a */
    /* loaded from: combined.jar:classes2.jar:hh/s$a.class */
    public class a extends InterfaceC5101i.a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:hh/s$a$a.class
         */
        /* renamed from: hh.s$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:hh/s$a$a.class */
        public class C10299a extends Thread {

            /* renamed from: b */
            public final ParcelFileDescriptor[] f29337b;

            /* renamed from: c */
            public final C5103k[] f29338c;

            /* renamed from: d */
            public final a f29339d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10299a(a aVar, String str, ParcelFileDescriptor[] parcelFileDescriptorArr, C5103k[] c5103kArr) {
                super(str);
                this.f29339d = aVar;
                this.f29337b = parcelFileDescriptorArr;
                this.f29338c = c5103kArr;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(this.f29337b[1]));
                try {
                    Object obj = C5095d0.f29254k;
                    synchronized (obj) {
                        if (!C5095d0.f29253j) {
                            obj.wait();
                        }
                    }
                } catch (InterruptedException e10) {
                    C5095d0.m25475r(e10);
                }
                try {
                    for (C5103k c5103k : this.f29338c) {
                        byte[] m25527c = c5103k.m25527c();
                        dataOutputStream.writeShort(m25527c.length);
                        dataOutputStream.write(m25527c);
                    }
                    dataOutputStream.writeShort(32767);
                    dataOutputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // p135hh.InterfaceC5101i
        /* renamed from: G0 */
        public void mo25512G0(String str, int i10, String str2) {
            C5116x.m25655d(str, i10, str2);
        }

        @Override // p135hh.InterfaceC5101i
        /* renamed from: a1 */
        public String mo25513a1() {
            return C5095d0.m25464g();
        }

        @Override // p135hh.InterfaceC5101i
        /* renamed from: e0 */
        public void mo25514e0(InterfaceC5102j interfaceC5102j) {
            ServiceC5111s.f29333b.unregister(interfaceC5102j);
        }

        @Override // p135hh.InterfaceC5101i
        /* renamed from: l0 */
        public C5091b0 mo25515l0() {
            return C5095d0.f29255l;
        }

        @Override // p135hh.InterfaceC5101i
        /* renamed from: u0 */
        public ParcelFileDescriptor mo25516u0(InterfaceC5102j interfaceC5102j) {
            C5103k[] m25467j = C5095d0.m25467j();
            c cVar = ServiceC5111s.f29335d;
            if (cVar != null) {
                ServiceC5111s.m25604c(interfaceC5102j, cVar);
            }
            ServiceC5111s.f29333b.register(interfaceC5102j);
            try {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                new C10299a(this, "pushLogs", createPipe, m25467j).start();
                return createPipe[0];
            } catch (IOException e10) {
                e10.printStackTrace();
                throw new RemoteException(e10.getMessage());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/s$b.class
     */
    /* renamed from: hh.s$b */
    /* loaded from: combined.jar:classes2.jar:hh/s$b.class */
    public static class b extends Handler {

        /* renamed from: a */
        public WeakReference<ServiceC5111s> f29340a;

        public b() {
            this.f29340a = null;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public final void m25606b(ServiceC5111s serviceC5111s) {
            this.f29340a = new WeakReference<>(serviceC5111s);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x00c6
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                r0 = r6
                java.lang.ref.WeakReference<hh.s> r0 = r0.f29340a
                r10 = r0
                r0 = r10
                if (r0 == 0) goto Lc5
                r0 = r10
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L16
                goto Lc5
            L16:
                r0 = r6
                java.lang.ref.WeakReference<hh.s> r0 = r0.f29340a
                java.lang.Object r0 = r0.get()
                hh.s r0 = (p135hh.ServiceC5111s) r0
                r10 = r0
                android.os.RemoteCallbackList<hh.j> r0 = p135hh.ServiceC5111s.f29333b
                r10 = r0
                r0 = r10
                int r0 = r0.beginBroadcast()
                r9 = r0
                r0 = 0
                r8 = r0
            L2f:
                r0 = r8
                r1 = r9
                if (r0 >= r1) goto Lc0
                r0 = r10
                r1 = r8
                android.os.IInterface r0 = r0.getBroadcastItem(r1)     // Catch: android.os.RemoteException -> Lc6
                hh.j r0 = (p135hh.InterfaceC5102j) r0     // Catch: android.os.RemoteException -> Lc6
                r12 = r0
                r0 = r7
                int r0 = r0.what     // Catch: android.os.RemoteException -> Lc6
                switch(r0) {
                    case 100: goto Lac;
                    case 101: goto L9d;
                    case 102: goto L74;
                    case 103: goto L63;
                    default: goto L60;
                }     // Catch: android.os.RemoteException -> Lc6
            L60:
                goto Lba
            L63:
                r0 = r12
                r1 = r7
                java.lang.Object r1 = r1.obj     // Catch: android.os.RemoteException -> Lc6
                java.lang.String r1 = (java.lang.String) r1     // Catch: android.os.RemoteException -> Lc6
                r0.mo25521W0(r1)     // Catch: android.os.RemoteException -> Lc6
                goto Lba
            L74:
                r0 = r7
                java.lang.Object r0 = r0.obj     // Catch: android.os.RemoteException -> Lc6
                android.util.Pair r0 = (android.util.Pair) r0     // Catch: android.os.RemoteException -> Lc6
                r11 = r0
                r0 = r12
                r1 = r11
                java.lang.Object r1 = r1.first     // Catch: android.os.RemoteException -> Lc6
                java.lang.Long r1 = (java.lang.Long) r1     // Catch: android.os.RemoteException -> Lc6
                long r1 = r1.longValue()     // Catch: android.os.RemoteException -> Lc6
                r2 = r11
                java.lang.Object r2 = r2.second     // Catch: android.os.RemoteException -> Lc6
                java.lang.Long r2 = (java.lang.Long) r2     // Catch: android.os.RemoteException -> Lc6
                long r2 = r2.longValue()     // Catch: android.os.RemoteException -> Lc6
                r0.mo25520I0(r1, r2)     // Catch: android.os.RemoteException -> Lc6
                goto Lba
            L9d:
                r0 = r12
                r1 = r7
                java.lang.Object r1 = r1.obj     // Catch: android.os.RemoteException -> Lc6
                hh.s$c r1 = (p135hh.ServiceC5111s.c) r1     // Catch: android.os.RemoteException -> Lc6
                p135hh.ServiceC5111s.m25603b(r0, r1)     // Catch: android.os.RemoteException -> Lc6
                goto Lba
            Lac:
                r0 = r12
                r1 = r7
                java.lang.Object r1 = r1.obj     // Catch: android.os.RemoteException -> Lc6
                hh.k r1 = (p135hh.C5103k) r1     // Catch: android.os.RemoteException -> Lc6
                r0.mo25519A(r1)     // Catch: android.os.RemoteException -> Lc6
            Lba:
                int r8 = r8 + 1
                goto L2f
            Lc0:
                r0 = r10
                r0.finishBroadcast()
            Lc5:
                return
            Lc6:
                r11 = move-exception
                goto Lba
            */
            throw new UnsupportedOperationException("Method not decompiled: p135hh.ServiceC5111s.b.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/s$c.class
     */
    /* renamed from: hh.s$c */
    /* loaded from: combined.jar:classes2.jar:hh/s$c.class */
    public static class c {

        /* renamed from: a */
        public String f29341a;

        /* renamed from: b */
        public String f29342b;

        /* renamed from: c */
        public EnumC5096e f29343c;

        /* renamed from: d */
        public Intent f29344d;

        /* renamed from: e */
        public int f29345e;

        public c(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
            this.f29341a = str;
            this.f29345e = i10;
            this.f29342b = str2;
            this.f29343c = enumC5096e;
            this.f29344d = intent;
        }
    }

    /* renamed from: c */
    public static void m25604c(InterfaceC5102j interfaceC5102j, c cVar) {
        interfaceC5102j.mo25522n0(cVar.f29341a, cVar.f29342b, cVar.f29345e, cVar.f29343c, cVar.f29344d);
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: U0 */
    public void mo22565U0(String str, String str2, int i10, EnumC5096e enumC5096e, Intent intent) {
        c cVar = new c(str, str2, i10, enumC5096e, intent);
        f29335d = cVar;
        f29336e.obtainMessage(101, cVar).sendToTarget();
    }

    @Override // p135hh.C5095d0.b
    /* renamed from: Z */
    public void mo22570Z(long j10, long j11, long j12, long j13) {
        f29336e.obtainMessage(102, Pair.create(Long.valueOf(j10), Long.valueOf(j11))).sendToTarget();
    }

    @Override // p135hh.C5095d0.d
    /* renamed from: a */
    public void mo25484a(C5103k c5103k) {
        f29336e.obtainMessage(100, c5103k).sendToTarget();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f29334c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C5095d0.m25459b(this);
        C5095d0.m25458a(this);
        C5095d0.m25460c(this);
        f29336e.m25606b(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C5095d0.m25450D(this);
        C5095d0.m25449C(this);
        C5095d0.m25451E(this);
        f29333b.kill();
    }

    @Override // p135hh.C5095d0.e
    /* renamed from: y0 */
    public void mo22572y0(String str) {
        f29336e.obtainMessage(103, str).sendToTarget();
    }
}
