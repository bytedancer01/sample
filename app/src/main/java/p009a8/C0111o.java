package p009a8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p027b9.C0858p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/o.class
 */
/* renamed from: a8.o */
/* loaded from: combined.jar:classes2.jar:a8/o.class */
public final class C0111o {

    /* renamed from: h */
    public static final AtomicLong f455h = new AtomicLong();

    /* renamed from: a */
    public final long f456a;

    /* renamed from: b */
    public final C0858p f457b;

    /* renamed from: c */
    public final Uri f458c;

    /* renamed from: d */
    public final Map<String, List<String>> f459d;

    /* renamed from: e */
    public final long f460e;

    /* renamed from: f */
    public final long f461f;

    /* renamed from: g */
    public final long f462g;

    public C0111o(long j10, C0858p c0858p, long j11) {
        this(j10, c0858p, c0858p.f5847a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public C0111o(long j10, C0858p c0858p, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f456a = j10;
        this.f457b = c0858p;
        this.f458c = uri;
        this.f459d = map;
        this.f460e = j11;
        this.f461f = j12;
        this.f462g = j13;
    }

    /* renamed from: a */
    public static long m525a() {
        return f455h.getAndIncrement();
    }
}
