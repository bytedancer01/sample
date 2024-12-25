package p140i2;

import android.app.job.JobInfo;
import android.app.job.JobInfo$TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p071e2.AbstractC4582k;
import p071e2.C4573b;
import p071e2.C4574c;
import p071e2.EnumC4572a;
import p071e2.EnumC4583l;
import p175k0.C5440a;
import p223n2.C6636p;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:i2/j.class
 */
/* renamed from: i2.j */
/* loaded from: combined.jar:classes1.jar:i2/j.class */
public class C5163j {

    /* renamed from: b */
    public static final String f29527b = AbstractC4582k.m23128f("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f29528a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:i2/j$a.class
     */
    /* renamed from: i2.j$a */
    /* loaded from: combined.jar:classes1.jar:i2/j$a.class */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final int[] f29529a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x004d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                e2.l[] r0 = p071e2.EnumC4583l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                p140i2.C5163j.a.f29529a = r0
                r0 = r4
                e2.l r1 = p071e2.EnumC4583l.NOT_REQUIRED     // Catch: java.lang.NoSuchFieldError -> L41
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L14:
                int[] r0 = p140i2.C5163j.a.f29529a     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                e2.l r1 = p071e2.EnumC4583l.CONNECTED     // Catch: java.lang.NoSuchFieldError -> L45
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L1f:
                int[] r0 = p140i2.C5163j.a.f29529a     // Catch: java.lang.NoSuchFieldError -> L45 java.lang.NoSuchFieldError -> L49
                e2.l r1 = p071e2.EnumC4583l.UNMETERED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L2a:
                int[] r0 = p140i2.C5163j.a.f29529a     // Catch: java.lang.NoSuchFieldError -> L49 java.lang.NoSuchFieldError -> L4d
                e2.l r1 = p071e2.EnumC4583l.NOT_ROAMING     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L35:
                int[] r0 = p140i2.C5163j.a.f29529a     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                e2.l r1 = p071e2.EnumC4583l.METERED     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L40:
                return
            L41:
                r4 = move-exception
                goto L14
            L45:
                r4 = move-exception
                goto L1f
            L49:
                r4 = move-exception
                goto L2a
            L4d:
                r4 = move-exception
                goto L35
            L51:
                r4 = move-exception
                goto L40
            */
            throw new UnsupportedOperationException("Method not decompiled: p140i2.C5163j.a.m44619clinit():void");
        }
    }

    public C5163j(Context context) {
        this.f29528a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.job.JobInfo$TriggerContentUri] */
    /* renamed from: b */
    public static JobInfo$TriggerContentUri m25800b(C4574c.a aVar) {
        boolean m23112b = aVar.m23112b();
        final Uri m23111a = aVar.m23111a();
        final int i10 = m23112b ? 1 : 0;
        return new Parcelable(m23111a, i10) { // from class: android.app.job.JobInfo$TriggerContentUri
            static {
                throw new NoClassDefFoundError();
            }
        };
    }

    /* renamed from: c */
    public static int m25801c(EnumC4583l enumC4583l) {
        int i10 = a.f29529a[enumC4583l.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        AbstractC4582k.m23126c().mo23129a(f29527b, String.format("API version too low. Cannot convert network type value %s", enumC4583l), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    public static void m25802d(JobInfo.Builder builder, EnumC4583l enumC4583l) {
        if (Build.VERSION.SDK_INT < 30 || enumC4583l != EnumC4583l.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m25801c(enumC4583l));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* renamed from: a */
    public JobInfo m25803a(C6636p c6636p, int i10) {
        C4573b c4573b = c6636p.f34582j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c6636p.f34573a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c6636p.m30590d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f29528a).setRequiresCharging(c4573b.m23095g()).setRequiresDeviceIdle(c4573b.m23096h()).setExtras(persistableBundle);
        m25802d(extras, c4573b.m23090b());
        if (!c4573b.m23096h()) {
            extras.setBackoffCriteria(c6636p.f34585m, c6636p.f34584l == EnumC4572a.LINEAR ? 0 : 1);
        }
        long max = Math.max(c6636p.m30587a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c6636p.f34589q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && c4573b.m23093e()) {
            Iterator<C4574c.a> it = c4573b.m23089a().m23109b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m25800b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c4573b.m23091c());
            extras.setTriggerContentMaxDelay(c4573b.m23092d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(c4573b.m23094f());
            extras.setRequiresStorageNotLow(c4573b.m23097i());
        }
        boolean z10 = false;
        if (c6636p.f34583k > 0) {
            z10 = true;
        }
        if (C5440a.m27189c() && c6636p.f34589q && !z10) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
