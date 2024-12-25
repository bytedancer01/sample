package p301r6;

import java.nio.ByteBuffer;
import p267p6.C7603n1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/u.class
 */
/* renamed from: r6.u */
/* loaded from: combined.jar:classes2.jar:r6/u.class */
public interface InterfaceC8003u {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/u$a.class
     */
    /* renamed from: r6.u$a */
    /* loaded from: combined.jar:classes2.jar:r6/u$a.class */
    public static final class a extends Exception {

        /* renamed from: b */
        public final C7629w0 f38717b;

        public a(String str, C7629w0 c7629w0) {
            super(str);
            this.f38717b = c7629w0;
        }

        public a(Throwable th2, C7629w0 c7629w0) {
            super(th2);
            this.f38717b = c7629w0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/u$b.class
     */
    /* renamed from: r6.u$b */
    /* loaded from: combined.jar:classes2.jar:r6/u$b.class */
    public static final class b extends Exception {

        /* renamed from: b */
        public final int f38718b;

        /* renamed from: c */
        public final boolean f38719c;

        /* renamed from: d */
        public final C7629w0 f38720d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r5, int r6, int r7, int r8, p267p6.C7629w0 r9, boolean r10, java.lang.Exception r11) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r13 = r0
                r0 = r13
                java.lang.String r1 = "AudioTrack init failed "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                java.lang.String r1 = " "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                java.lang.String r1 = "Config("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                r1 = r7
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r13
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r10
                if (r0 == 0) goto L62
                java.lang.String r0 = " (recoverable)"
                r12 = r0
                goto L66
            L62:
                java.lang.String r0 = ""
                r12 = r0
            L66:
                r0 = r13
                r1 = r12
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r13
                java.lang.String r1 = r1.toString()
                r2 = r11
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.f38718b = r1
                r0 = r4
                r1 = r10
                r0.f38719c = r1
                r0 = r4
                r1 = r9
                r0.f38720d = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p301r6.InterfaceC8003u.b.<init>(int, int, int, int, p6.w0, boolean, java.lang.Exception):void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/u$c.class
     */
    /* renamed from: r6.u$c */
    /* loaded from: combined.jar:classes2.jar:r6/u$c.class */
    public interface c {
        /* renamed from: a */
        void mo34561a(boolean z10);

        /* renamed from: b */
        void mo34562b(Exception exc);

        /* renamed from: c */
        void mo34563c(long j10);

        /* renamed from: d */
        void mo34564d(long j10);

        /* renamed from: e */
        void mo34565e(int i10, long j10, long j11);

        /* renamed from: f */
        void mo34566f();

        /* renamed from: g */
        void mo34567g();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/u$d.class
     */
    /* renamed from: r6.u$d */
    /* loaded from: combined.jar:classes2.jar:r6/u$d.class */
    public static final class d extends Exception {

        /* renamed from: b */
        public final long f38721b;

        /* renamed from: c */
        public final long f38722c;

        public d(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f38721b = j10;
            this.f38722c = j11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/u$e.class
     */
    /* renamed from: r6.u$e */
    /* loaded from: combined.jar:classes2.jar:r6/u$e.class */
    public static final class e extends Exception {

        /* renamed from: b */
        public final int f38723b;

        /* renamed from: c */
        public final boolean f38724c;

        /* renamed from: d */
        public final C7629w0 f38725d;

        public e(int i10, C7629w0 c7629w0, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f38724c = z10;
            this.f38723b = i10;
            this.f38725d = c7629w0;
        }
    }

    /* renamed from: a */
    boolean mo34623a(C7629w0 c7629w0);

    /* renamed from: b */
    C7603n1 mo34625b();

    /* renamed from: c */
    void mo34627c(C7603n1 c7603n1);

    /* renamed from: d */
    boolean mo34629d();

    /* renamed from: e */
    boolean mo34631e();

    /* renamed from: f */
    void mo34633f(c cVar);

    void flush();

    /* renamed from: g */
    void mo34635g(int i10);

    /* renamed from: h */
    void mo34637h();

    /* renamed from: i */
    void mo34638i(C7629w0 c7629w0, int i10, int[] iArr);

    /* renamed from: j */
    void mo34639j(C8007y c8007y);

    /* renamed from: k */
    boolean mo34641k(ByteBuffer byteBuffer, long j10, int i10);

    /* renamed from: l */
    void mo34643l();

    /* renamed from: m */
    void mo34645m();

    /* renamed from: n */
    long mo34647n(boolean z10);

    /* renamed from: o */
    void mo34649o();

    /* renamed from: p */
    int mo34650p(C7629w0 c7629w0);

    void pause();

    void play();

    /* renamed from: q */
    void mo34652q();

    /* renamed from: r */
    void mo34653r(C7972d c7972d);

    void reset();

    /* renamed from: s */
    void mo34654s(boolean z10);

    void setVolume(float f10);
}
