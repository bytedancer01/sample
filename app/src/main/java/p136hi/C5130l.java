package p136hi;

import fi.C4882u;
import fi.C4884w;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/l.class
 */
/* renamed from: hi.l */
/* loaded from: combined.jar:classes2.jar:hi/l.class */
public final class C5130l {

    /* renamed from: a */
    public static final long f29430a;

    /* renamed from: b */
    public static final int f29431b;

    /* renamed from: c */
    public static final int f29432c;

    /* renamed from: d */
    public static final int f29433d;

    /* renamed from: e */
    public static final long f29434e;

    /* renamed from: f */
    @NotNull
    public static AbstractC5126h f29435f;

    static {
        long m24815e;
        int m24814d;
        int m24814d2;
        int m24814d3;
        long m24815e2;
        m24815e = C4884w.m24815e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f29430a = m24815e;
        m24814d = C4884w.m24814d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f29431b = m24814d;
        m24814d2 = C4884w.m24814d("kotlinx.coroutines.scheduler.core.pool.size", C10240e.m42834b(C4882u.m24802a(), 2), 1, 0, 8, null);
        f29432c = m24814d2;
        m24814d3 = C4884w.m24814d("kotlinx.coroutines.scheduler.max.pool.size", C10240e.m42838f(C4882u.m24802a() * 128, m24814d2, 2097150), 0, 2097150, 4, null);
        f29433d = m24814d3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m24815e2 = C4884w.m24815e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f29434e = timeUnit.toNanos(m24815e2);
        f29435f = C5124f.f29424a;
    }
}
