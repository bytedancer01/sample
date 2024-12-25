package p305ra;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x3.class
 */
/* renamed from: ra.x3 */
/* loaded from: combined.jar:classes2.jar:ra/x3.class */
public abstract class AbstractC8408x3<T> {

    /* renamed from: h */
    public static volatile AbstractC8393w3 f39373h;

    /* renamed from: a */
    public final C8378v3 f39377a;

    /* renamed from: b */
    public final String f39378b;

    /* renamed from: c */
    public final T f39379c;

    /* renamed from: d */
    public volatile int f39380d = -1;

    /* renamed from: e */
    public volatile T f39381e;

    /* renamed from: f */
    public final boolean f39382f;

    /* renamed from: g */
    public static final Object f39372g = new Object();

    /* renamed from: i */
    public static final AtomicReference<Collection<AbstractC8408x3<?>>> f39374i = new AtomicReference<>();

    /* renamed from: j */
    public static final C8438z3 f39375j = new C8438z3(C8288p3.f39233a);

    /* renamed from: k */
    public static final AtomicInteger f39376k = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AbstractC8408x3(C8378v3 c8378v3, String str, Object obj, boolean z10, C8318r3 c8318r3) {
        if (c8378v3.f39331b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f39377a = c8378v3;
        this.f39378b = str;
        this.f39379c = obj;
        this.f39382f = true;
    }

    @Deprecated
    /* renamed from: b */
    public static void m36062b(Context context) {
        synchronized (f39372g) {
            AbstractC8393w3 abstractC8393w3 = f39373h;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (abstractC8393w3 == null || abstractC8393w3.mo34994a() != context) {
                C8108d3.m35195d();
                C8423y3.m36222b();
                C8213k3.m35526c();
                final Context context2 = context;
                f39373h = new C8063a3(context, C8199j4.m35508a(new InterfaceC8139f4(context2) { // from class: ra.o3

                    /* renamed from: b */
                    public final Context f39223b;

                    {
                        this.f39223b = context2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0178, code lost:
                    
                        if (r0 == r0) goto L60;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
                    @Override // p305ra.InterfaceC8139f4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object zza() {
                        /*
                            Method dump skipped, instructions count: 552
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p305ra.C8273o3.zza():java.lang.Object");
                    }
                }));
                f39376k.incrementAndGet();
            }
        }
    }

    /* renamed from: c */
    public static void m36063c() {
        f39376k.incrementAndGet();
    }

    /* renamed from: a */
    public abstract T mo35760a(Object obj);

    /* renamed from: d */
    public final String m36064d() {
        String str = this.f39377a.f39333d;
        return this.f39378b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112 A[Catch: all -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x002c, B:15:0x0034, B:17:0x003e, B:19:0x0058, B:21:0x0065, B:23:0x006e, B:25:0x007d, B:27:0x0093, B:28:0x0087, B:33:0x0112, B:35:0x0138, B:38:0x014d, B:41:0x0154, B:43:0x0163, B:45:0x0169, B:47:0x0190, B:48:0x0198, B:50:0x019f, B:51:0x009d, B:53:0x00a7, B:55:0x00b9, B:58:0x00f6, B:60:0x0105, B:62:0x00dc, B:63:0x01ab, B:64:0x01b6, B:66:0x01b8), top: B:12:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169 A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x002c, B:15:0x0034, B:17:0x003e, B:19:0x0058, B:21:0x0065, B:23:0x006e, B:25:0x007d, B:27:0x0093, B:28:0x0087, B:33:0x0112, B:35:0x0138, B:38:0x014d, B:41:0x0154, B:43:0x0163, B:45:0x0169, B:47:0x0190, B:48:0x0198, B:50:0x019f, B:51:0x009d, B:53:0x00a7, B:55:0x00b9, B:58:0x00f6, B:60:0x0105, B:62:0x00dc, B:63:0x01ab, B:64:0x01b6, B:66:0x01b8), top: B:12:0x002c }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T m36065e() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p305ra.AbstractC8408x3.m36065e():java.lang.Object");
    }
}
