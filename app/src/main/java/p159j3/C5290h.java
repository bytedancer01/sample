package p159j3;

import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p004a3.C0053g;
import p004a3.InterfaceC0063q;
import p109g3.C4935a;
import p109g3.C4936b;
import p279q3.InterfaceC7751b;
import p434z2.C10032a;
import p434z2.InterfaceC10034c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j3/h.class
 */
/* renamed from: j3.h */
/* loaded from: combined.jar:classes1.jar:j3/h.class */
public class C5290h<T> implements AppSyncSubscriptionCall<T> {

    /* renamed from: h */
    public static Semaphore f30430h = new Semaphore(1, true);

    /* renamed from: i */
    public static int f30431i = 30;

    /* renamed from: j */
    public static final String f30432j = C5290h.class.getSimpleName();

    /* renamed from: a */
    public final C5284b f30433a;

    /* renamed from: b */
    public final InterfaceC0063q<?, T, ?> f30434b;

    /* renamed from: c */
    public final InterfaceC7751b f30435c;

    /* renamed from: d */
    public final AtomicReference<EnumC5285c> f30436d = new AtomicReference<>(EnumC5285c.IDLE);

    /* renamed from: e */
    public final C10032a f30437e;

    /* renamed from: f */
    public final C5287e<T> f30438f;

    /* renamed from: g */
    public AppSyncSubscriptionCall.Callback<T> f30439g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/h$a.class
     */
    /* renamed from: j3.h$a */
    /* loaded from: combined.jar:classes1.jar:j3/h$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final AppSyncSubscriptionCall.Callback f30440b;

        /* renamed from: c */
        public final C5290h f30441c;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:j3/h$a$a.class
         */
        /* renamed from: j3.h$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:j3/h$a$a.class */
        public class C10303a extends InterfaceC10034c.a<T> {

            /* renamed from: a */
            public final a f30442a;

            public C10303a(a aVar) {
                this.f30442a = aVar;
            }

            @Override // p434z2.InterfaceC10034c.a
            public void onFailure(C4936b c4936b) {
                C5290h.f30430h.release();
                this.f30442a.f30441c.m26475i();
                this.f30442a.f30440b.onFailure(c4936b);
            }

            @Override // p434z2.InterfaceC10034c.a
            public void onResponse(C0053g<T> c0053g) {
                C5290h.f30430h.release();
            }
        }

        public a(C5290h c5290h, AppSyncSubscriptionCall.Callback callback) {
            this.f30441c = c5290h;
            this.f30440b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppSyncSubscriptionCall.Callback callback;
            C4936b c4935a;
            this.f30441c.f30439g = this.f30440b;
            this.f30441c.f30435c.addListener(this.f30441c.f30434b, this.f30440b);
            int i10 = c.f30444a[((EnumC5285c) this.f30441c.f30436d.get()).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    callback = this.f30440b;
                    c4935a = new C4935a("Call is cancelled.");
                } else if (i10 != 3) {
                    callback = this.f30440b;
                    c4935a = new C4936b("Unknown state");
                } else {
                    callback = this.f30440b;
                    c4935a = new C4936b("Already Executed");
                }
                callback.onFailure(c4935a);
            } else {
                this.f30441c.f30436d.set(EnumC5285c.ACTIVE);
            }
            try {
                if (C5290h.f30430h.tryAcquire(C5290h.f30431i, TimeUnit.SECONDS)) {
                    this.f30441c.f30433a.m26386a("Subscription Infrastructure: Acquired subscription Semaphore. Continuing", new Object[0]);
                } else {
                    this.f30441c.f30433a.m26386a("Subscription Infrastructure: Did not acquire subscription Semaphore after waiting for [" + C5290h.f30431i + "] seconds. Will continue", new Object[0]);
                }
            } catch (InterruptedException e10) {
                this.f30441c.f30433a.m26389d(e10, "Subscription Infrastructure:Got exception while waiting to acquire subscription Semaphore. Will continue without waiting", new Object[0]);
            }
            this.f30441c.f30433a.m26386a("Subscription Infrastructure: Making request to server to get Subscription Meta Data", new Object[0]);
            this.f30441c.f30438f.enqueue(new C10303a(this));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/h$b.class
     */
    /* renamed from: j3.h$b */
    /* loaded from: combined.jar:classes1.jar:j3/h$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C5290h f30443b;

        public b(C5290h c5290h) {
            this.f30443b = c5290h;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicReference atomicReference;
            EnumC5285c enumC5285c;
            synchronized (this) {
                int i10 = c.f30444a[((EnumC5285c) this.f30443b.f30436d.get()).ordinal()];
                if (i10 == 1) {
                    atomicReference = this.f30443b.f30436d;
                    enumC5285c = EnumC5285c.CANCELED;
                } else if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown state");
                    }
                    try {
                        this.f30443b.f30435c.unsubscribe(this.f30443b.f30434b);
                        this.f30443b.f30435c.removeListener(this.f30443b.f30434b, this.f30443b.f30439g);
                        if (this.f30443b.f30439g != null) {
                            this.f30443b.f30439g.onCompleted();
                            this.f30443b.f30439g = null;
                        }
                        atomicReference = this.f30443b.f30436d;
                        enumC5285c = EnumC5285c.CANCELED;
                    } catch (Throwable th2) {
                        this.f30443b.f30436d.set(EnumC5285c.CANCELED);
                        throw th2;
                    }
                }
                atomicReference.set(enumC5285c);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:j3/h$c.class
     */
    /* renamed from: j3.h$c */
    /* loaded from: combined.jar:classes1.jar:j3/h$c.class */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final int[] f30444a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                j3.c[] r0 = p159j3.EnumC5285c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p159j3.C5290h.c.f30444a = r0
                r0 = r4
                j3.c r1 = p159j3.EnumC5285c.IDLE     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = p159j3.C5290h.c.f30444a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                j3.c r1 = p159j3.EnumC5285c.CANCELED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = p159j3.C5290h.c.f30444a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                j3.c r1 = p159j3.EnumC5285c.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: p159j3.C5290h.c.m44662clinit():void");
        }
    }

    public C5290h(InterfaceC0063q<?, T, ?> interfaceC0063q, InterfaceC7751b interfaceC7751b, C10032a c10032a, C5284b c5284b, C5287e<T> c5287e) {
        this.f30434b = interfaceC0063q;
        this.f30435c = interfaceC7751b;
        this.f30437e = c10032a;
        this.f30438f = c5287e;
        this.f30433a = c5284b;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public void cancel() {
        new Thread(new b(this)).start();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppSyncSubscriptionCall<T> m44661clone() {
        return new C5290h(this.f30434b, this.f30435c, this.f30437e, this.f30433a, this.f30438f.clone());
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public void execute(AppSyncSubscriptionCall.Callback<T> callback) {
        synchronized (this) {
            if (callback != null) {
                new Thread(new a(this, callback)).start();
                return;
            }
            this.f30433a.m26391f("Subscription Infrastructure: Callback passed into subscription [" + this.f30434b + "] was null. Will not subscribe.", new Object[0]);
        }
    }

    /* renamed from: i */
    public void m26475i() {
        this.f30433a.m26386a("Trying to report failure to Subscription Manager", new Object[0]);
        try {
            this.f30435c.getClass().getDeclaredMethod("reportConnectionError", new Class[0]).invoke(this.f30435c, new Object[0]);
        } catch (IllegalAccessException e10) {
            this.f30433a.m26386a("Exception [" + e10 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        } catch (NoSuchMethodException e11) {
            this.f30433a.m26386a("Exception [" + e11 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        } catch (InvocationTargetException e12) {
            this.f30433a.m26386a("Exception [" + e12 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public boolean isCanceled() {
        return this.f30436d.get() == EnumC5285c.CANCELED;
    }
}
