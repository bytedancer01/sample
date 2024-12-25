package p181k6;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.achartengine.chart.TimeChart;
import p181k6.C5488c;
import p227n6.InterfaceC6654a;
import p437z5.EnumC10056d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k6/f.class
 */
@AutoValue
/* renamed from: k6.f */
/* loaded from: combined.jar:classes1.jar:k6/f.class */
public abstract class AbstractC5491f {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k6/f$a.class
     */
    /* renamed from: k6.f$a */
    /* loaded from: combined.jar:classes1.jar:k6/f$a.class */
    public static class a {

        /* renamed from: a */
        public InterfaceC6654a f31336a;

        /* renamed from: b */
        public Map<EnumC10056d, b> f31337b = new HashMap();

        /* renamed from: a */
        public a m27303a(EnumC10056d enumC10056d, b bVar) {
            this.f31337b.put(enumC10056d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC5491f m27304b() {
            if (this.f31336a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f31337b.keySet().size() < EnumC10056d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC10056d, b> map = this.f31337b;
            this.f31337b = new HashMap();
            return AbstractC5491f.m27296d(this.f31336a, map);
        }

        /* renamed from: c */
        public a m27305c(InterfaceC6654a interfaceC6654a) {
            this.f31336a = interfaceC6654a;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k6/f$b.class
     */
    @AutoValue
    /* renamed from: k6.f$b */
    /* loaded from: combined.jar:classes1.jar:k6/f$b.class */
    public static abstract class b {

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:k6/f$b$a.class
         */
        @AutoValue.Builder
        /* renamed from: k6.f$b$a */
        /* loaded from: combined.jar:classes1.jar:k6/f$b$a.class */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo27287a();

            /* renamed from: b */
            public abstract a mo27288b(long j10);

            /* renamed from: c */
            public abstract a mo27289c(Set<c> set);

            /* renamed from: d */
            public abstract a mo27290d(long j10);
        }

        /* renamed from: a */
        public static a m27306a() {
            return new C5488c.b().mo27289c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo27284b();

        /* renamed from: c */
        public abstract Set<c> mo27285c();

        /* renamed from: d */
        public abstract long mo27286d();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k6/f$c.class
     */
    /* renamed from: k6.f$c */
    /* loaded from: combined.jar:classes1.jar:k6/f$c.class */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static a m27295b() {
        return new a();
    }

    /* renamed from: d */
    public static AbstractC5491f m27296d(InterfaceC6654a interfaceC6654a, Map<EnumC10056d, b> map) {
        return new C5487b(interfaceC6654a, map);
    }

    /* renamed from: f */
    public static AbstractC5491f m27297f(InterfaceC6654a interfaceC6654a) {
        return m27295b().m27303a(EnumC10056d.DEFAULT, b.m27306a().mo27288b(30000L).mo27290d(TimeChart.DAY).mo27287a()).m27303a(EnumC10056d.HIGHEST, b.m27306a().mo27288b(1000L).mo27290d(TimeChart.DAY).mo27287a()).m27303a(EnumC10056d.VERY_LOW, b.m27306a().mo27288b(TimeChart.DAY).mo27290d(TimeChart.DAY).mo27289c(m27298i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).mo27287a()).m27305c(interfaceC6654a).m27304b();
    }

    /* renamed from: i */
    public static <T> Set<T> m27298i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long m27299a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r10)));
    }

    /* renamed from: c */
    public JobInfo.Builder m27300c(JobInfo.Builder builder, EnumC10056d enumC10056d, long j10, int i10) {
        builder.setMinimumLatency(m27301g(enumC10056d, j10, i10));
        m27302j(builder, mo27283h().get(enumC10056d).mo27285c());
        return builder;
    }

    /* renamed from: e */
    public abstract InterfaceC6654a mo27282e();

    /* renamed from: g */
    public long m27301g(EnumC10056d enumC10056d, long j10, int i10) {
        long mo30655a = mo27282e().mo30655a();
        b bVar = mo27283h().get(enumC10056d);
        return Math.min(Math.max(m27299a(i10, bVar.mo27284b()), j10 - mo30655a), bVar.mo27286d());
    }

    /* renamed from: h */
    public abstract Map<EnumC10056d, b> mo27283h();

    /* renamed from: j */
    public final void m27302j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
