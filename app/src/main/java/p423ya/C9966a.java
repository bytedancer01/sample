package p423ya;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import ba.C0869a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p060da.C4416o;
import p060da.C4418q;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ya/a.class
 */
/* renamed from: ya.a */
/* loaded from: combined.jar:classes2.jar:ya/a.class */
public class C9966a {

    /* renamed from: n */
    public static ScheduledExecutorService f45660n;

    /* renamed from: o */
    public static volatile a f45661o = new C9967b();

    /* renamed from: a */
    public final Object f45662a;

    /* renamed from: b */
    public final PowerManager.WakeLock f45663b;

    /* renamed from: c */
    public WorkSource f45664c;

    /* renamed from: d */
    public final int f45665d;

    /* renamed from: e */
    public final String f45666e;

    /* renamed from: f */
    public final String f45667f;

    /* renamed from: g */
    public final String f45668g;

    /* renamed from: h */
    public final Context f45669h;

    /* renamed from: i */
    public boolean f45670i;

    /* renamed from: j */
    public final Map<String, Integer[]> f45671j;

    /* renamed from: k */
    public final Set<Future<?>> f45672k;

    /* renamed from: l */
    public int f45673l;

    /* renamed from: m */
    public AtomicInteger f45674m;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ya/a$a.class
     */
    /* renamed from: ya.a$a */
    /* loaded from: combined.jar:classes2.jar:ya/a$a.class */
    public interface a {
    }

    public C9966a(Context context, int i10, String str) {
        this(context, i10, str, null, context == null ? null : context.getPackageName());
    }

    public C9966a(Context context, int i10, String str, String str2, String str3) {
        this(context, i10, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public C9966a(Context context, int i10, String str, String str2, String str3, String str4) {
        this.f45662a = this;
        this.f45670i = true;
        this.f45671j = new HashMap();
        this.f45672k = Collections.synchronizedSet(new HashSet());
        this.f45674m = new AtomicInteger(0);
        C9935o.m41851k(context, "WakeLock: context must not be null");
        C9935o.m41847g(str, "WakeLock: wakeLockName must not be empty");
        this.f45665d = i10;
        this.f45667f = null;
        this.f45668g = null;
        Context applicationContext = context.getApplicationContext();
        this.f45669h = applicationContext;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f45666e = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f45666e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i10, str);
        this.f45663b = newWakeLock;
        if (C4418q.m22469d(context)) {
            WorkSource m22467b = C4418q.m22467b(context, C4416o.m22463a(str3) ? context.getPackageName() : str3);
            this.f45664c = m22467b;
            if (m22467b != null && C4418q.m22469d(applicationContext)) {
                WorkSource workSource = this.f45664c;
                if (workSource != null) {
                    workSource.add(m22467b);
                } else {
                    this.f45664c = m22467b;
                }
                try {
                    newWakeLock.setWorkSource(this.f45664c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        if (f45660n == null) {
            f45660n = C0869a.m5435a().mo5436a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        if (r15 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        ca.C1054d.m6232a().m6234c(r12.f45669h, ca.C1053c.m6231a(r12.f45663b, r0), 7, r12.f45666e, r0, null, r12.f45665d, m41899e(), r13);
        r12.f45673l++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r12.f45673l == 0) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m41895a(long r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423ya.C9966a.m41895a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r11 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        ca.C1054d.m6232a().m6233b(r10.f45669h, ca.C1053c.m6231a(r10.f45663b, r0), 8, r10.f45666e, r0, null, r10.f45665d, m41899e());
        r10.f45673l--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r10.f45673l == 1) goto L23;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m41896b() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p423ya.C9966a.m41896b():void");
    }

    /* renamed from: c */
    public void m41897c(boolean z10) {
        this.f45663b.setReferenceCounted(z10);
        this.f45670i = z10;
    }

    /* renamed from: d */
    public final String m41898d(String str) {
        if (this.f45670i && !TextUtils.isEmpty(str)) {
            return str;
        }
        return this.f45667f;
    }

    /* renamed from: e */
    public final List<String> m41899e() {
        return C4418q.m22468c(this.f45664c);
    }

    /* renamed from: f */
    public final void m41900f(int i10) {
        if (this.f45663b.isHeld()) {
            try {
                this.f45663b.release();
            } catch (RuntimeException e10) {
                if (!e10.getClass().equals(RuntimeException.class)) {
                    throw e10;
                }
                Log.e("WakeLock", String.valueOf(this.f45666e).concat(" was already released!"), e10);
            }
            this.f45663b.isHeld();
        }
    }
}
