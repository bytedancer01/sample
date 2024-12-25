package p301r6;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7583h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/x.class
 */
/* renamed from: r6.x */
/* loaded from: combined.jar:classes2.jar:r6/x.class */
public final class C8006x {

    /* renamed from: A */
    public long f38737A;

    /* renamed from: B */
    public long f38738B;

    /* renamed from: C */
    public long f38739C;

    /* renamed from: D */
    public boolean f38740D;

    /* renamed from: E */
    public long f38741E;

    /* renamed from: F */
    public long f38742F;

    /* renamed from: a */
    public final a f38743a;

    /* renamed from: b */
    public final long[] f38744b;

    /* renamed from: c */
    public AudioTrack f38745c;

    /* renamed from: d */
    public int f38746d;

    /* renamed from: e */
    public int f38747e;

    /* renamed from: f */
    public C8005w f38748f;

    /* renamed from: g */
    public int f38749g;

    /* renamed from: h */
    public boolean f38750h;

    /* renamed from: i */
    public long f38751i;

    /* renamed from: j */
    public float f38752j;

    /* renamed from: k */
    public boolean f38753k;

    /* renamed from: l */
    public long f38754l;

    /* renamed from: m */
    public long f38755m;

    /* renamed from: n */
    public Method f38756n;

    /* renamed from: o */
    public long f38757o;

    /* renamed from: p */
    public boolean f38758p;

    /* renamed from: q */
    public boolean f38759q;

    /* renamed from: r */
    public long f38760r;

    /* renamed from: s */
    public long f38761s;

    /* renamed from: t */
    public long f38762t;

    /* renamed from: u */
    public long f38763u;

    /* renamed from: v */
    public int f38764v;

    /* renamed from: w */
    public int f38765w;

    /* renamed from: x */
    public long f38766x;

    /* renamed from: y */
    public long f38767y;

    /* renamed from: z */
    public long f38768z;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/x$a.class
     */
    /* renamed from: r6.x$a */
    /* loaded from: combined.jar:classes2.jar:r6/x$a.class */
    public interface a {
        /* renamed from: a */
        void mo34677a(int i10, long j10);

        /* renamed from: b */
        void mo34678b(long j10);

        /* renamed from: c */
        void mo34679c(long j10);

        /* renamed from: d */
        void mo34680d(long j10, long j11, long j12, long j13);

        /* renamed from: e */
        void mo34681e(long j10, long j11, long j12, long j13);
    }

    public C8006x(a aVar) {
        this.f38743a = (a) C4349a.m21882e(aVar);
        if (C4401z0.f26679a >= 18) {
            try {
                this.f38756n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException e10) {
            }
        }
        this.f38744b = new long[10];
    }

    /* renamed from: p */
    public static boolean m34823p(int i10) {
        return C4401z0.f26679a < 23 && (i10 == 5 || i10 == 6);
    }

    /* renamed from: a */
    public final boolean m34824a() {
        return this.f38750h && ((AudioTrack) C4349a.m21882e(this.f38745c)).getPlayState() == 2 && m34829f() == 0;
    }

    /* renamed from: b */
    public final long m34825b(long j10) {
        return (j10 * 1000000) / this.f38749g;
    }

    /* renamed from: c */
    public int m34826c(long j10) {
        return this.f38747e - ((int) (j10 - (m34829f() * this.f38746d)));
    }

    /* renamed from: d */
    public long m34827d(boolean z10) {
        long j10;
        if (((AudioTrack) C4349a.m21882e(this.f38745c)).getPlayState() == 3) {
            m34837n();
        }
        long nanoTime = System.nanoTime() / 1000;
        C8005w c8005w = (C8005w) C4349a.m21882e(this.f38748f);
        boolean m34815d = c8005w.m34815d();
        if (m34815d) {
            j10 = m34825b(c8005w.m34813b()) + C4401z0.m22363Z(nanoTime - c8005w.m34814c(), this.f38752j);
        } else {
            long m34830g = this.f38765w == 0 ? m34830g() : this.f38754l + nanoTime;
            j10 = m34830g;
            if (!z10) {
                j10 = Math.max(0L, m34830g - this.f38757o);
            }
        }
        if (this.f38740D != m34815d) {
            this.f38742F = this.f38739C;
            this.f38741E = this.f38738B;
        }
        long j11 = nanoTime - this.f38742F;
        long j12 = j10;
        if (j11 < 1000000) {
            long j13 = this.f38741E;
            long m22363Z = C4401z0.m22363Z(j11, this.f38752j);
            long j14 = (j11 * 1000) / 1000000;
            j12 = ((j10 * j14) + ((1000 - j14) * (j13 + m22363Z))) / 1000;
        }
        if (!this.f38753k) {
            long j15 = this.f38738B;
            if (j12 > j15) {
                this.f38753k = true;
                this.f38743a.mo34679c(System.currentTimeMillis() - C7583h.m32761e(C4401z0.m22378e0(C7583h.m32761e(j12 - j15), this.f38752j)));
            }
        }
        this.f38739C = nanoTime;
        this.f38738B = j12;
        this.f38740D = m34815d;
        return j12;
    }

    /* renamed from: e */
    public long m34828e(long j10) {
        return C7583h.m32761e(m34825b(j10 - m34829f()));
    }

    /* renamed from: f */
    public final long m34829f() {
        AudioTrack audioTrack = (AudioTrack) C4349a.m21882e(this.f38745c);
        if (this.f38766x != -9223372036854775807L) {
            return Math.min(this.f38737A, this.f38768z + ((((SystemClock.elapsedRealtime() * 1000) - this.f38766x) * this.f38749g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        long j10 = playbackHeadPosition;
        if (this.f38750h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f38763u = this.f38761s;
            }
            j10 = playbackHeadPosition + this.f38763u;
        }
        if (C4401z0.f26679a <= 29) {
            if (j10 == 0 && this.f38761s > 0 && playState == 3) {
                if (this.f38767y == -9223372036854775807L) {
                    this.f38767y = SystemClock.elapsedRealtime();
                }
                return this.f38761s;
            }
            this.f38767y = -9223372036854775807L;
        }
        if (this.f38761s > j10) {
            this.f38762t++;
        }
        this.f38761s = j10;
        return j10 + (this.f38762t << 32);
    }

    /* renamed from: g */
    public final long m34830g() {
        return m34825b(m34829f());
    }

    /* renamed from: h */
    public void m34831h(long j10) {
        this.f38768z = m34829f();
        this.f38766x = SystemClock.elapsedRealtime() * 1000;
        this.f38737A = j10;
    }

    /* renamed from: i */
    public boolean m34832i(long j10) {
        return j10 > m34829f() || m34824a();
    }

    /* renamed from: j */
    public boolean m34833j() {
        return ((AudioTrack) C4349a.m21882e(this.f38745c)).getPlayState() == 3;
    }

    /* renamed from: k */
    public boolean m34834k(long j10) {
        return this.f38767y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f38767y >= 200;
    }

    /* renamed from: l */
    public boolean m34835l(long j10) {
        int playState = ((AudioTrack) C4349a.m21882e(this.f38745c)).getPlayState();
        if (this.f38750h) {
            if (playState == 2) {
                this.f38758p = false;
                return false;
            }
            if (playState == 1 && m34829f() == 0) {
                return false;
            }
        }
        boolean z10 = this.f38758p;
        boolean m34832i = m34832i(j10);
        this.f38758p = m34832i;
        if (!z10 || m34832i || playState == 1) {
            return true;
        }
        this.f38743a.mo34677a(this.f38747e, C7583h.m32761e(this.f38751i));
        return true;
    }

    /* renamed from: m */
    public final void m34836m(long j10, long j11) {
        C8005w c8005w = (C8005w) C4349a.m21882e(this.f38748f);
        if (c8005w.m34816e(j10)) {
            long m34814c = c8005w.m34814c();
            long m34813b = c8005w.m34813b();
            if (Math.abs(m34814c - j10) > 5000000) {
                this.f38743a.mo34681e(m34813b, m34814c, j10, j11);
            } else {
                if (Math.abs(m34825b(m34813b) - j11) <= 5000000) {
                    c8005w.m34812a();
                    return;
                }
                this.f38743a.mo34680d(m34813b, m34814c, j10, j11);
            }
            c8005w.m34817f();
        }
    }

    /* renamed from: n */
    public final void m34837n() {
        long m34830g = m34830g();
        if (m34830g == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f38755m >= 30000) {
            long[] jArr = this.f38744b;
            int i10 = this.f38764v;
            jArr[i10] = m34830g - nanoTime;
            this.f38764v = (i10 + 1) % 10;
            int i11 = this.f38765w;
            if (i11 < 10) {
                this.f38765w = i11 + 1;
            }
            this.f38755m = nanoTime;
            this.f38754l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f38765w;
                if (i12 >= i13) {
                    break;
                }
                this.f38754l += this.f38744b[i12] / i13;
                i12++;
            }
        }
        if (this.f38750h) {
            return;
        }
        m34836m(nanoTime, m34830g);
        m34838o(nanoTime);
    }

    /* renamed from: o */
    public final void m34838o(long j10) {
        Method method;
        if (!this.f38759q || (method = this.f38756n) == null || j10 - this.f38760r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) C4401z0.m22391j((Integer) method.invoke(C4349a.m21882e(this.f38745c), new Object[0]))).intValue() * 1000) - this.f38751i;
            this.f38757o = intValue;
            long max = Math.max(intValue, 0L);
            this.f38757o = max;
            if (max > 5000000) {
                this.f38743a.mo34678b(max);
                this.f38757o = 0L;
            }
        } catch (Exception e10) {
            this.f38756n = null;
        }
        this.f38760r = j10;
    }

    /* renamed from: q */
    public boolean m34839q() {
        m34841s();
        if (this.f38766x != -9223372036854775807L) {
            return false;
        }
        ((C8005w) C4349a.m21882e(this.f38748f)).m34818g();
        return true;
    }

    /* renamed from: r */
    public void m34840r() {
        m34841s();
        this.f38745c = null;
        this.f38748f = null;
    }

    /* renamed from: s */
    public final void m34841s() {
        this.f38754l = 0L;
        this.f38765w = 0;
        this.f38764v = 0;
        this.f38755m = 0L;
        this.f38739C = 0L;
        this.f38742F = 0L;
        this.f38753k = false;
    }

    /* renamed from: t */
    public void m34842t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f38745c = audioTrack;
        this.f38746d = i11;
        this.f38747e = i12;
        this.f38748f = new C8005w(audioTrack);
        this.f38749g = audioTrack.getSampleRate();
        this.f38750h = z10 && m34823p(i10);
        boolean m22410s0 = C4401z0.m22410s0(i10);
        this.f38759q = m22410s0;
        this.f38751i = m22410s0 ? m34825b(i12 / i11) : -9223372036854775807L;
        this.f38761s = 0L;
        this.f38762t = 0L;
        this.f38763u = 0L;
        this.f38758p = false;
        this.f38766x = -9223372036854775807L;
        this.f38767y = -9223372036854775807L;
        this.f38760r = 0L;
        this.f38757o = 0L;
        this.f38752j = 1.0f;
    }

    /* renamed from: u */
    public void m34843u(float f10) {
        this.f38752j = f10;
        C8005w c8005w = this.f38748f;
        if (c8005w != null) {
            c8005w.m34818g();
        }
    }

    /* renamed from: v */
    public void m34844v() {
        ((C8005w) C4349a.m21882e(this.f38748f)).m34818g();
    }
}
