package p448zh;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p448zh.C10236a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zh/e.class
 */
/* renamed from: zh.e */
/* loaded from: combined.jar:classes2.jar:zh/e.class */
public class C10240e extends C10239d {
    /* renamed from: b */
    public static final int m42834b(int i10, int i11) {
        int i12 = i10;
        if (i10 < i11) {
            i12 = i11;
        }
        return i12;
    }

    /* renamed from: c */
    public static final long m42835c(long j10, long j11) {
        long j12 = j10;
        if (j10 < j11) {
            j12 = j11;
        }
        return j12;
    }

    /* renamed from: d */
    public static final int m42836d(int i10, int i11) {
        int i12 = i10;
        if (i10 > i11) {
            i12 = i11;
        }
        return i12;
    }

    /* renamed from: e */
    public static final long m42837e(long j10, long j11) {
        long j12 = j10;
        if (j10 > j11) {
            j12 = j11;
        }
        return j12;
    }

    /* renamed from: f */
    public static final int m42838f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    @NotNull
    /* renamed from: g */
    public static final C10236a m42839g(int i10, int i11) {
        return C10236a.f46832e.m42828a(i10, i11, -1);
    }

    @NotNull
    /* renamed from: h */
    public static final C10236a m42840h(@NotNull C10236a c10236a, int i10) {
        C9367f.m39526e(c10236a, "<this>");
        C10239d.m42833a(i10 > 0, Integer.valueOf(i10));
        C10236a.a aVar = C10236a.f46832e;
        int m42824d = c10236a.m42824d();
        int m42825f = c10236a.m42825f();
        if (c10236a.m42826g() <= 0) {
            i10 = -i10;
        }
        return aVar.m42828a(m42824d, m42825f, i10);
    }

    @NotNull
    /* renamed from: i */
    public static final C10238c m42841i(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C10238c.f46840f.m42832a() : new C10238c(i10, i11 - 1);
    }
}
