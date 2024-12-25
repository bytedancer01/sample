package p125h7;

import java.util.List;
import p381w7.C9426b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h7/b.class
 */
/* renamed from: h7.b */
/* loaded from: combined.jar:classes2.jar:h7/b.class */
public final class C5038b {

    /* renamed from: a */
    public final long f29095a;

    /* renamed from: b */
    public final List<a> f29096b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:h7/b$a.class
     */
    /* renamed from: h7.b$a */
    /* loaded from: combined.jar:classes2.jar:h7/b$a.class */
    public static final class a {

        /* renamed from: a */
        public final String f29097a;

        /* renamed from: b */
        public final String f29098b;

        /* renamed from: c */
        public final long f29099c;

        /* renamed from: d */
        public final long f29100d;

        public a(String str, String str2, long j10, long j11) {
            this.f29097a = str;
            this.f29098b = str2;
            this.f29099c = j10;
            this.f29100d = j11;
        }
    }

    public C5038b(long j10, List<a> list) {
        this.f29095a = j10;
        this.f29096b = list;
    }

    /* renamed from: a */
    public C9426b m25251a(long j10) {
        long j11;
        if (this.f29096b.size() < 2) {
            return null;
        }
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        boolean z10 = false;
        long j15 = -1;
        long j16 = j10;
        for (int size = this.f29096b.size() - 1; size >= 0; size--) {
            a aVar = this.f29096b.get(size);
            z10 = "video/mp4".equals(aVar.f29097a) | z10;
            if (size == 0) {
                j11 = j16 - aVar.f29100d;
                j16 = 0;
            } else {
                j11 = j16;
                j16 -= aVar.f29099c;
            }
            if (z10 && j16 != j11) {
                j14 = j11 - j16;
                j15 = j16;
                z10 = false;
            }
            if (size == 0) {
                j12 = j16;
                j13 = j11;
            }
        }
        if (j15 == -1 || j14 == -1 || j12 == -1 || j13 == -1) {
            return null;
        }
        return new C9426b(j12, j13, this.f29095a, j15, j14);
    }
}
