package fi;

import ci.C1127m;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/w.class
 */
/* renamed from: fi.w */
/* loaded from: combined.jar:classes2.jar:fi/w.class */
public final /* synthetic */ class C4884w {
    /* renamed from: a */
    public static final int m24811a(@NotNull String str, int i10, int i11, int i12) {
        return (int) C4882u.m24804c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m24812b(@NotNull String str, long j10, long j11, long j12) {
        String m24805d = C4882u.m24805d(str);
        if (m24805d == null) {
            return j10;
        }
        Long m6715h = C1127m.m6715h(m24805d);
        if (m6715h == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m24805d + '\'').toString());
        }
        long longValue = m6715h.longValue();
        boolean z10 = false;
        if (j11 <= longValue) {
            z10 = false;
            if (longValue <= j12) {
                z10 = true;
            }
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m24813c(@NotNull String str, boolean z10) {
        String m24805d = C4882u.m24805d(str);
        if (m24805d != null) {
            z10 = Boolean.parseBoolean(m24805d);
        }
        return z10;
    }

    /* renamed from: d */
    public static /* synthetic */ int m24814d(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return C4882u.m24803b(str, i10, i11, i12);
    }

    /* renamed from: e */
    public static /* synthetic */ long m24815e(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C4882u.m24804c(str, j10, j11, j12);
    }
}
