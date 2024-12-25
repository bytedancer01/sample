package p219mi;

import ci.C1128n;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import ki.C5634b;
import org.achartengine.chart.TimeChart;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5405d;
import p173ji.C5406d0;
import p173ji.C5410f0;
import p173ji.C5432w;
import p274pi.C7726c;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mi/b.class
 */
/* renamed from: mi.b */
/* loaded from: combined.jar:classes2.jar:mi/b.class */
public final class C6607b {

    /* renamed from: c */
    public static final a f34504c = new a(null);

    /* renamed from: a */
    @Nullable
    public final C5406d0 f34505a;

    /* renamed from: b */
    @Nullable
    public final C5410f0 f34506b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mi/b$a.class
     */
    /* renamed from: mi.b$a */
    /* loaded from: combined.jar:classes2.jar:mi/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final boolean m30508a(@NotNull C5410f0 c5410f0, @NotNull C5406d0 c5406d0) {
            C9367f.m39526e(c5410f0, "response");
            C9367f.m39526e(c5406d0, "request");
            int m26925q = c5410f0.m26925q();
            if (m26925q != 200 && m26925q != 410 && m26925q != 414 && m26925q != 501 && m26925q != 203 && m26925q != 204) {
                if (m26925q != 307) {
                    if (m26925q != 308 && m26925q != 404 && m26925q != 405) {
                        switch (m26925q) {
                            case 300:
                            case 301:
                                break;
                            case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C5410f0.m26912B(c5410f0, "Expires", null, 2, null) == null && c5410f0.m26921l().m26857c() == -1 && !c5410f0.m26921l().m26856b() && !c5410f0.m26921l().m26855a()) {
                    return false;
                }
            }
            boolean z10 = false;
            if (!c5410f0.m26921l().m26862h()) {
                z10 = false;
                if (!c5406d0.m26872b().m26862h()) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mi/b$b.class
     */
    /* renamed from: mi.b$b */
    /* loaded from: combined.jar:classes2.jar:mi/b$b.class */
    public static final class b {

        /* renamed from: a */
        public Date f34507a;

        /* renamed from: b */
        public String f34508b;

        /* renamed from: c */
        public Date f34509c;

        /* renamed from: d */
        public String f34510d;

        /* renamed from: e */
        public Date f34511e;

        /* renamed from: f */
        public long f34512f;

        /* renamed from: g */
        public long f34513g;

        /* renamed from: h */
        public String f34514h;

        /* renamed from: i */
        public int f34515i;

        /* renamed from: j */
        public final long f34516j;

        /* renamed from: k */
        @NotNull
        public final C5406d0 f34517k;

        /* renamed from: l */
        public final C5410f0 f34518l;

        public b(long j10, @NotNull C5406d0 c5406d0, @Nullable C5410f0 c5410f0) {
            C9367f.m39526e(c5406d0, "request");
            this.f34516j = j10;
            this.f34517k = c5406d0;
            this.f34518l = c5410f0;
            this.f34515i = -1;
            if (c5410f0 != null) {
                this.f34512f = c5410f0.m26919G0();
                this.f34513g = c5410f0.m26917E0();
                C5432w m26923o0 = c5410f0.m26923o0();
                int size = m26923o0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String m27082b = m26923o0.m27082b(i10);
                    String m27085h = m26923o0.m27085h(i10);
                    if (C1128n.m6719l(m27082b, "Date", true)) {
                        this.f34507a = C7726c.m33725a(m27085h);
                        this.f34508b = m27085h;
                    } else if (C1128n.m6719l(m27082b, "Expires", true)) {
                        this.f34511e = C7726c.m33725a(m27085h);
                    } else if (C1128n.m6719l(m27082b, "Last-Modified", true)) {
                        this.f34509c = C7726c.m33725a(m27085h);
                        this.f34510d = m27085h;
                    } else if (C1128n.m6719l(m27082b, "ETag", true)) {
                        this.f34514h = m27085h;
                    } else if (C1128n.m6719l(m27082b, HttpHeaders.AGE, true)) {
                        this.f34515i = C5634b.m27776T(m27085h, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m30509a() {
            Date date = this.f34507a;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.f34513g - date.getTime());
            }
            int i10 = this.f34515i;
            long j11 = j10;
            if (i10 != -1) {
                j11 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            long j12 = this.f34513g;
            return j11 + (j12 - this.f34512f) + (this.f34516j - j12);
        }

        @NotNull
        /* renamed from: b */
        public final C6607b m30510b() {
            C6607b m30511c = m30511c();
            C6607b c6607b = m30511c;
            if (m30511c.m30507b() != null) {
                c6607b = m30511c;
                if (this.f34517k.m26872b().m26863i()) {
                    c6607b = new C6607b(null, null);
                }
            }
            return c6607b;
        }

        /* renamed from: c */
        public final C6607b m30511c() {
            if (this.f34518l == null) {
                return new C6607b(this.f34517k, null);
            }
            if ((!this.f34517k.m26876f() || this.f34518l.m26928v() != null) && C6607b.f34504c.m30508a(this.f34518l, this.f34517k)) {
                C5405d m26872b = this.f34517k.m26872b();
                if (m26872b.m26861g() || m30513e(this.f34517k)) {
                    return new C6607b(this.f34517k, null);
                }
                C5405d m26921l = this.f34518l.m26921l();
                long m30509a = m30509a();
                long m30512d = m30512d();
                long j10 = m30512d;
                if (m26872b.m26857c() != -1) {
                    j10 = Math.min(m30512d, TimeUnit.SECONDS.toMillis(m26872b.m26857c()));
                }
                long millis = m26872b.m26859e() != -1 ? TimeUnit.SECONDS.toMillis(m26872b.m26859e()) : 0L;
                long j11 = 0;
                if (!m26921l.m26860f()) {
                    j11 = 0;
                    if (m26872b.m26858d() != -1) {
                        j11 = TimeUnit.SECONDS.toMillis(m26872b.m26858d());
                    }
                }
                if (!m26921l.m26861g()) {
                    long j12 = millis + m30509a;
                    if (j12 < j11 + j10) {
                        C5410f0.a m26914B0 = this.f34518l.m26914B0();
                        if (j12 >= j10) {
                            m26914B0.m26932a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m30509a > TimeChart.DAY && m30514f()) {
                            m26914B0.m26932a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C6607b(null, m26914B0.m26934c());
                    }
                }
                String str = this.f34514h;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f34509c != null) {
                    str = this.f34510d;
                } else {
                    if (this.f34507a == null) {
                        return new C6607b(this.f34517k, null);
                    }
                    str = this.f34508b;
                }
                C5432w.a m27084f = this.f34517k.m26875e().m27084f();
                C9367f.m39524c(str);
                m27084f.m27090d(str2, str);
                return new C6607b(this.f34517k.m26878h().m26887g(m27084f.m27092f()).m26883b(), this.f34518l);
            }
            return new C6607b(this.f34517k, null);
        }

        /* renamed from: d */
        public final long m30512d() {
            C5410f0 c5410f0 = this.f34518l;
            C9367f.m39524c(c5410f0);
            if (c5410f0.m26921l().m26857c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m26857c());
            }
            Date date = this.f34511e;
            long j10 = 0;
            if (date != null) {
                Date date2 = this.f34507a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f34513g);
                if (time > 0) {
                    j10 = time;
                }
                return j10;
            }
            long j11 = 0;
            if (this.f34509c != null) {
                j11 = 0;
                if (this.f34518l.m26918F0().m26880j().m27118p() == null) {
                    Date date3 = this.f34507a;
                    long time2 = date3 != null ? date3.getTime() : this.f34512f;
                    Date date4 = this.f34509c;
                    C9367f.m39524c(date4);
                    long time3 = time2 - date4.getTime();
                    j11 = 0;
                    if (time3 > 0) {
                        j11 = time3 / 10;
                    }
                }
            }
            return j11;
        }

        /* renamed from: e */
        public final boolean m30513e(C5406d0 c5406d0) {
            return (c5406d0.m26874d("If-Modified-Since") == null && c5406d0.m26874d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m30514f() {
            C5410f0 c5410f0 = this.f34518l;
            C9367f.m39524c(c5410f0);
            return c5410f0.m26921l().m26857c() == -1 && this.f34511e == null;
        }
    }

    public C6607b(@Nullable C5406d0 c5406d0, @Nullable C5410f0 c5410f0) {
        this.f34505a = c5406d0;
        this.f34506b = c5410f0;
    }

    @Nullable
    /* renamed from: a */
    public final C5410f0 m30506a() {
        return this.f34506b;
    }

    @Nullable
    /* renamed from: b */
    public final C5406d0 m30507b() {
        return this.f34505a;
    }
}
