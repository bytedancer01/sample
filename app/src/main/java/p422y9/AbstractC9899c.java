package p422y9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p350u9.C8804b;
import p350u9.C8808d;
import p350u9.C8814g;
import p368v9.C9316b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/c.class
 */
/* renamed from: y9.c */
/* loaded from: combined.jar:classes2.jar:y9/c.class */
public abstract class AbstractC9899c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private C8804b zzB;
    private boolean zzC;
    private volatile C9910f1 zzD;
    public C9943q1 zza;
    public final Handler zzb;
    public c zzc;
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC9914h zzn;
    private final C8814g zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC9926l zzr;
    private T zzs;
    private final ArrayList<AbstractC9963y0<?>> zzt;
    private ServiceConnectionC9895a1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C8808d[] zze = new C8808d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/c$a.class
     */
    /* renamed from: y9.c$a */
    /* loaded from: combined.jar:classes2.jar:y9/c$a.class */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/c$b.class
     */
    /* renamed from: y9.c$b */
    /* loaded from: combined.jar:classes2.jar:y9/c$b.class */
    public interface b {
        void onConnectionFailed(C8804b c8804b);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/c$c.class
     */
    /* renamed from: y9.c$c */
    /* loaded from: combined.jar:classes2.jar:y9/c$c.class */
    public interface c {
        /* renamed from: c */
        void mo39826c(C8804b c8804b);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/c$d.class
     */
    /* renamed from: y9.c$d */
    /* loaded from: combined.jar:classes2.jar:y9/c$d.class */
    public class d implements c {

        /* renamed from: a */
        public final AbstractC9899c f45522a;

        public d(AbstractC9899c abstractC9899c) {
            this.f45522a = abstractC9899c;
        }

        @Override // p422y9.AbstractC9899c.c
        /* renamed from: c */
        public final void mo39826c(C8804b c8804b) {
            if (c8804b.m37663T()) {
                AbstractC9899c abstractC9899c = this.f45522a;
                abstractC9899c.getRemoteService(null, abstractC9899c.getScopes());
            } else if (this.f45522a.zzx != null) {
                this.f45522a.zzx.onConnectionFailed(c8804b);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y9/c$e.class
     */
    /* renamed from: y9.c$e */
    /* loaded from: combined.jar:classes2.jar:y9/c$e.class */
    public interface e {
        /* renamed from: a */
        void mo39863a();
    }

    public AbstractC9899c(Context context, Handler handler, AbstractC9914h abstractC9914h, C8814g c8814g, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C9935o.m41851k(context, "Context must not be null");
        this.zzl = context;
        C9935o.m41851k(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C9935o.m41851k(abstractC9914h, "Supervisor must not be null");
        this.zzn = abstractC9914h;
        C9935o.m41851k(c8814g, "API availability must not be null");
        this.zzo = c8814g;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC9899c(android.content.Context r11, android.os.Looper r12, int r13, p422y9.AbstractC9899c.a r14, p422y9.AbstractC9899c.b r15, java.lang.String r16) {
        /*
            r10 = this;
            r0 = r11
            y9.h r0 = p422y9.AbstractC9914h.m41790b(r0)
            r18 = r0
            u9.g r0 = p350u9.C8814g.m37697h()
            r17 = r0
            r0 = r14
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            r0 = r15
            java.lang.Object r0 = p422y9.C9935o.m41850j(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r18
            r4 = r17
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p422y9.AbstractC9899c.<init>(android.content.Context, android.os.Looper, int, y9.c$a, y9.c$b, java.lang.String):void");
    }

    public AbstractC9899c(Context context, Looper looper, AbstractC9914h abstractC9914h, C8814g c8814g, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C9935o.m41851k(context, "Context must not be null");
        this.zzl = context;
        C9935o.m41851k(looper, "Looper must not be null");
        this.zzm = looper;
        C9935o.m41851k(abstractC9914h, "Supervisor must not be null");
        this.zzn = abstractC9914h;
        C9935o.m41851k(c8814g, "API availability must not be null");
        this.zzo = c8814g;
        this.zzb = new HandlerC9961x0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public static /* bridge */ /* synthetic */ void zzj(AbstractC9899c abstractC9899c, C9910f1 c9910f1) {
        abstractC9899c.zzD = c9910f1;
        if (abstractC9899c.usesClientTelemetry()) {
            C9905e c9905e = c9910f1.f45566g;
            C9938p.m41858b().m41860c(c9905e == null ? null : c9905e.m41787U());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC9899c abstractC9899c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC9899c.zzp) {
            i11 = abstractC9899c.zzv;
        }
        if (i11 == 3) {
            abstractC9899c.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC9899c.zzb;
        handler.sendMessage(handler.obtainMessage(i12, abstractC9899c.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC9899c abstractC9899c, int i10, int i11, IInterface iInterface) {
        boolean z10;
        synchronized (abstractC9899c.zzp) {
            if (abstractC9899c.zzv != i10) {
                z10 = false;
            } else {
                abstractC9899c.zzp(i11, iInterface);
                z10 = true;
            }
        }
        return z10;
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC9899c abstractC9899c) {
        boolean z10 = false;
        if (!abstractC9899c.zzC && !TextUtils.isEmpty(abstractC9899c.getServiceDescriptor()) && !TextUtils.isEmpty(abstractC9899c.getLocalStartServiceAction())) {
            try {
                Class.forName(abstractC9899c.getServiceDescriptor());
                z10 = true;
            } catch (ClassNotFoundException e10) {
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i10, T t10) {
        C9943q1 c9943q1;
        boolean z10 = false;
        if ((i10 == 4) == (t10 != null)) {
            z10 = true;
        }
        C9935o.m41841a(z10);
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = t10;
            if (i10 == 1) {
                ServiceConnectionC9895a1 serviceConnectionC9895a1 = this.zzu;
                if (serviceConnectionC9895a1 != null) {
                    AbstractC9914h abstractC9914h = this.zzn;
                    String m41871c = this.zza.m41871c();
                    C9935o.m41850j(m41871c);
                    abstractC9914h.m41793e(m41871c, this.zza.m41870b(), this.zza.m41869a(), serviceConnectionC9895a1, zze(), this.zza.m41872d());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                ServiceConnectionC9895a1 serviceConnectionC9895a12 = this.zzu;
                if (serviceConnectionC9895a12 != null && (c9943q1 = this.zza) != null) {
                    String m41871c2 = c9943q1.m41871c();
                    String m41870b = c9943q1.m41870b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m41871c2).length() + 70 + String.valueOf(m41870b).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(m41871c2);
                    sb2.append(" on ");
                    sb2.append(m41870b);
                    Log.e("GmsClient", sb2.toString());
                    AbstractC9914h abstractC9914h2 = this.zzn;
                    String m41871c3 = this.zza.m41871c();
                    C9935o.m41850j(m41871c3);
                    abstractC9914h2.m41793e(m41871c3, this.zza.m41870b(), this.zza.m41869a(), serviceConnectionC9895a12, zze(), this.zza.m41872d());
                    this.zzd.incrementAndGet();
                }
                ServiceConnectionC9895a1 serviceConnectionC9895a13 = new ServiceConnectionC9895a1(this, this.zzd.get());
                this.zzu = serviceConnectionC9895a13;
                C9943q1 c9943q12 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C9943q1(getStartServicePackage(), getStartServiceAction(), false, AbstractC9914h.m41789a(), getUseDynamicLookup()) : new C9943q1(getContext().getPackageName(), getLocalStartServiceAction(), true, AbstractC9914h.m41789a(), false);
                this.zza = c9943q12;
                if (c9943q12.m41872d() && getMinApkVersion() < 17895000) {
                    String valueOf = String.valueOf(this.zza.m41871c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                AbstractC9914h abstractC9914h3 = this.zzn;
                String m41871c4 = this.zza.m41871c();
                C9935o.m41850j(m41871c4);
                if (!abstractC9914h3.mo41794f(new C9922j1(m41871c4, this.zza.m41870b(), this.zza.m41869a(), this.zza.m41872d()), serviceConnectionC9895a13, zze(), getBindServiceExecutor())) {
                    String m41871c5 = this.zza.m41871c();
                    String m41870b2 = this.zza.m41870b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(m41871c5).length() + 34 + String.valueOf(m41870b2).length());
                    sb3.append("unable to connect to service: ");
                    sb3.append(m41871c5);
                    sb3.append(" on ");
                    sb3.append(m41870b2);
                    Log.w("GmsClient", sb3.toString());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                C9935o.m41850j(t10);
                onConnectedLocked(t10);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int mo37681j = this.zzo.mo37681j(this.zzl, getMinApkVersion());
        if (mo37681j == 0) {
            connect(new d(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(this), mo37681j, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        C9935o.m41851k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.zzt.get(i10).m41892d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        T t10;
        InterfaceC9926l interfaceC9926l;
        synchronized (this.zzp) {
            i10 = this.zzv;
            t10 = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC9926l = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t10 == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t10.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC9926l == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC9926l.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String format = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 21);
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C9316b.m39315a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C8808d[] getApiFeatures() {
        return zze;
    }

    public final C8808d[] getAvailableFeatures() {
        C9910f1 c9910f1 = this.zzD;
        if (c9910f1 == null) {
            return null;
        }
        return c9910f1.f45564e;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C9943q1 c9943q1;
        if (!isConnected() || (c9943q1 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c9943q1.m41870b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C8814g.f40848a;
    }

    public void getRemoteService(InterfaceC9917i interfaceC9917i, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        C9908f c9908f = new C9908f(this.zzy, this.zzA);
        c9908f.f45551g = this.zzl.getPackageName();
        c9908f.f45554j = getServiceRequestExtraArgs;
        if (set != null) {
            c9908f.f45553i = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            Account account2 = account;
            if (account == null) {
                account2 = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c9908f.f45555k = account2;
            if (interfaceC9917i != null) {
                c9908f.f45552h = interfaceC9917i.asBinder();
            }
        } else if (requiresAccount()) {
            c9908f.f45555k = getAccount();
        }
        c9908f.f45556l = zze;
        c9908f.f45557m = getApiFeatures();
        if (usesClientTelemetry()) {
            c9908f.f45560p = true;
        }
        try {
            synchronized (this.zzq) {
                InterfaceC9926l interfaceC9926l = this.zzr;
                if (interfaceC9926l != null) {
                    interfaceC9926l.mo41826J(new BinderC9965z0(this, this.zzd.get()), c9908f);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t10 = this.zzs;
            C9935o.m41851k(t10, "Client is connected but service is null");
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            InterfaceC9926l interfaceC9926l = this.zzr;
            if (interfaceC9926l == null) {
                return null;
            }
            return interfaceC9926l.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C9905e getTelemetryConfiguration() {
        C9910f1 c9910f1 = this.zzD;
        if (c9910f1 == null) {
            return null;
        }
        return c9910f1.f45566g;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2) {
                z10 = i10 == 3;
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C8804b c8804b) {
        this.zzi = c8804b.m37659P();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new C9898b1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo39863a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        C9935o.m41851k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        String str2 = str;
        if (str == null) {
            str2 = this.zzl.getClass().getName();
        }
        return str2;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new C9901c1(this, i10, null)));
    }
}
