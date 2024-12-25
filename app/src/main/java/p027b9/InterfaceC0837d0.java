package p027b9;

import java.io.IOException;
import p009a8.C0111o;
import p009a8.C0117r;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/d0.class
 */
/* renamed from: b9.d0 */
/* loaded from: combined.jar:classes2.jar:b9/d0.class */
public interface InterfaceC0837d0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/d0$a.class
     */
    /* renamed from: b9.d0$a */
    /* loaded from: combined.jar:classes2.jar:b9/d0$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f5754a;

        /* renamed from: b */
        public final int f5755b;

        /* renamed from: c */
        public final int f5756c;

        /* renamed from: d */
        public final int f5757d;

        public a(int i10, int i11, int i12, int i13) {
            this.f5754a = i10;
            this.f5755b = i11;
            this.f5756c = i12;
            this.f5757d = i13;
        }

        /* renamed from: a */
        public boolean m5314a(int i10) {
            boolean z10 = false;
            if (i10 != 1 ? this.f5756c - this.f5757d > 1 : this.f5754a - this.f5755b > 1) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/d0$b.class
     */
    /* renamed from: b9.d0$b */
    /* loaded from: combined.jar:classes2.jar:b9/d0$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f5758a;

        /* renamed from: b */
        public final long f5759b;

        public b(int i10, long j10) {
            C4349a.m21878a(j10 >= 0);
            this.f5758a = i10;
            this.f5759b = j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/d0$c.class
     */
    /* renamed from: b9.d0$c */
    /* loaded from: combined.jar:classes2.jar:b9/d0$c.class */
    public static final class c {

        /* renamed from: a */
        public final C0111o f5760a;

        /* renamed from: b */
        public final C0117r f5761b;

        /* renamed from: c */
        public final IOException f5762c;

        /* renamed from: d */
        public final int f5763d;

        public c(C0111o c0111o, C0117r c0117r, IOException iOException, int i10) {
            this.f5760a = c0111o;
            this.f5761b = c0117r;
            this.f5762c = iOException;
            this.f5763d = i10;
        }
    }

    /* renamed from: a */
    long mo5310a(c cVar);

    /* renamed from: b */
    int mo5311b(int i10);

    /* renamed from: c */
    b mo5312c(a aVar, c cVar);

    /* renamed from: d */
    void mo5313d(long j10);
}
