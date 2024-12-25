package p168jc;

import ec.C4708k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jc/d.class
 */
/* renamed from: jc.d */
/* loaded from: combined.jar:classes2.jar:jc/d.class */
public final class C5355d {
    /* renamed from: a */
    public static int m26648a(long j10, long j11) {
        return j10 < j11 ? -1 : j10 > j11 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m26649b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: c */
    public static long m26650c(long... jArr) {
        int i10 = 1;
        C4708k.m23662d(jArr.length > 0);
        long j10 = jArr[0];
        while (true) {
            long j11 = j10;
            if (i10 >= jArr.length) {
                return j11;
            }
            long j12 = jArr[i10];
            long j13 = j11;
            if (j12 > j11) {
                j13 = j12;
            }
            i10++;
            j10 = j13;
        }
    }

    /* renamed from: d */
    public static long m26651d(long... jArr) {
        int i10 = 1;
        C4708k.m23662d(jArr.length > 0);
        long j10 = jArr[0];
        while (true) {
            long j11 = j10;
            if (i10 >= jArr.length) {
                return j11;
            }
            long j12 = jArr[i10];
            long j13 = j11;
            if (j12 < j11) {
                j13 = j12;
            }
            i10++;
            j10 = j13;
        }
    }
}
