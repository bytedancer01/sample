package p301r6;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/w.class
 */
/* renamed from: r6.w */
/* loaded from: combined.jar:classes2.jar:r6/w.class */
public final class C8005w {

    /* renamed from: a */
    public final a f38726a;

    /* renamed from: b */
    public int f38727b;

    /* renamed from: c */
    public long f38728c;

    /* renamed from: d */
    public long f38729d;

    /* renamed from: e */
    public long f38730e;

    /* renamed from: f */
    public long f38731f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:r6/w$a.class
     */
    /* renamed from: r6.w$a */
    /* loaded from: combined.jar:classes2.jar:r6/w$a.class */
    public static final class a {

        /* renamed from: a */
        public final AudioTrack f38732a;

        /* renamed from: b */
        public final AudioTimestamp f38733b = new AudioTimestamp();

        /* renamed from: c */
        public long f38734c;

        /* renamed from: d */
        public long f38735d;

        /* renamed from: e */
        public long f38736e;

        public a(AudioTrack audioTrack) {
            this.f38732a = audioTrack;
        }

        /* renamed from: a */
        public long m34820a() {
            return this.f38736e;
        }

        /* renamed from: b */
        public long m34821b() {
            return this.f38733b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m34822c() {
            boolean timestamp = this.f38732a.getTimestamp(this.f38733b);
            if (timestamp) {
                long j10 = this.f38733b.framePosition;
                if (this.f38735d > j10) {
                    this.f38734c++;
                }
                this.f38735d = j10;
                this.f38736e = j10 + (this.f38734c << 32);
            }
            return timestamp;
        }
    }

    public C8005w(AudioTrack audioTrack) {
        if (C4401z0.f26679a >= 19) {
            this.f38726a = new a(audioTrack);
            m34818g();
        } else {
            this.f38726a = null;
            m34819h(3);
        }
    }

    /* renamed from: a */
    public void m34812a() {
        if (this.f38727b == 4) {
            m34818g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long m34813b() {
        a aVar = this.f38726a;
        return aVar != null ? aVar.m34820a() : -1L;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long m34814c() {
        a aVar = this.f38726a;
        return aVar != null ? aVar.m34821b() : -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m34815d() {
        return this.f38727b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r0 == false) goto L31;
     */
    @android.annotation.TargetApi(19)
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m34816e(long r6) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p301r6.C8005w.m34816e(long):boolean");
    }

    /* renamed from: f */
    public void m34817f() {
        m34819h(4);
    }

    /* renamed from: g */
    public void m34818g() {
        if (this.f38726a != null) {
            m34819h(0);
        }
    }

    /* renamed from: h */
    public final void m34819h(int i10) {
        this.f38727b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f38730e = 0L;
            this.f38731f = -1L;
            this.f38728c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                j10 = 500000;
            }
        }
        this.f38729d = j10;
    }
}
