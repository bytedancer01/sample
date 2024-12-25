package vg;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHeaders;
import tg.C8743s;
import tg.C8745u;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/c.class
 */
/* renamed from: vg.c */
/* loaded from: combined.jar:classes2.jar:vg/c.class */
public final class C9348c {

    /* renamed from: a */
    public final C8743s f42788a;

    /* renamed from: b */
    public final C8745u f42789b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/c$b.class
     */
    /* renamed from: vg.c$b */
    /* loaded from: combined.jar:classes2.jar:vg/c$b.class */
    public static class b {

        /* renamed from: a */
        public final long f42790a;

        /* renamed from: b */
        public final C8743s f42791b;

        /* renamed from: c */
        public final C8745u f42792c;

        /* renamed from: d */
        public Date f42793d;

        /* renamed from: e */
        public String f42794e;

        /* renamed from: f */
        public Date f42795f;

        /* renamed from: g */
        public String f42796g;

        /* renamed from: h */
        public Date f42797h;

        /* renamed from: i */
        public long f42798i;

        /* renamed from: j */
        public long f42799j;

        /* renamed from: k */
        public String f42800k;

        /* renamed from: l */
        public int f42801l;

        public b(long j10, C8743s c8743s, C8745u c8745u) {
            this.f42801l = -1;
            this.f42790a = j10;
            this.f42791b = c8743s;
            this.f42792c = c8745u;
            if (c8745u != null) {
                for (int i10 = 0; i10 < c8745u.m37505s().m37401f(); i10++) {
                    String m37399d = c8745u.m37505s().m37399d(i10);
                    String m37402g = c8745u.m37505s().m37402g(i10);
                    if ("Date".equalsIgnoreCase(m37399d)) {
                        this.f42793d = C9351f.m39435b(m37402g);
                        this.f42794e = m37402g;
                    } else if ("Expires".equalsIgnoreCase(m37399d)) {
                        this.f42797h = C9351f.m39435b(m37402g);
                    } else if ("Last-Modified".equalsIgnoreCase(m37399d)) {
                        this.f42795f = C9351f.m39435b(m37402g);
                        this.f42796g = m37402g;
                    } else if ("ETag".equalsIgnoreCase(m37399d)) {
                        this.f42800k = m37402g;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(m37399d)) {
                        this.f42801l = C9349d.m39398a(m37402g, -1);
                    } else if (C9355j.f42860c.equalsIgnoreCase(m37399d)) {
                        this.f42798i = Long.parseLong(m37402g);
                    } else if (C9355j.f42861d.equalsIgnoreCase(m37399d)) {
                        this.f42799j = Long.parseLong(m37402g);
                    }
                }
            }
        }

        /* renamed from: e */
        public static boolean m39392e(C8743s c8743s) {
            return (c8743s.m37459i("If-Modified-Since") == null && c8743s.m37459i("If-None-Match") == null) ? false : true;
        }

        /* renamed from: a */
        public final long m39393a() {
            Date date = this.f42793d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.f42799j - date.getTime());
            }
            int i10 = this.f42801l;
            long j11 = j10;
            if (i10 != -1) {
                j11 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            long j12 = this.f42799j;
            return j11 + (j12 - this.f42798i) + (this.f42790a - j12);
        }

        /* renamed from: b */
        public final long m39394b() {
            if (this.f42792c.m37498l().m37319a() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m37319a());
            }
            long j10 = 0;
            if (this.f42797h != null) {
                Date date = this.f42793d;
                long time = this.f42797h.getTime() - (date != null ? date.getTime() : this.f42799j);
                if (time > 0) {
                    j10 = time;
                }
                return j10;
            }
            long j11 = 0;
            if (this.f42795f != null) {
                j11 = 0;
                if (this.f42792c.m37511y().m37466p().getQuery() == null) {
                    Date date2 = this.f42793d;
                    long time2 = (date2 != null ? date2.getTime() : this.f42798i) - this.f42795f.getTime();
                    j11 = 0;
                    if (time2 > 0) {
                        j11 = time2 / 10;
                    }
                }
            }
            return j11;
        }

        /* renamed from: c */
        public C9348c m39395c() {
            C9348c m39396d = m39396d();
            C9348c c9348c = m39396d;
            if (m39396d.f42788a != null) {
                c9348c = m39396d;
                if (this.f42791b.m37458h().m37325g()) {
                    c9348c = new C9348c(null, null);
                }
            }
            return c9348c;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01b3  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final vg.C9348c m39396d() {
            /*
                Method dump skipped, instructions count: 465
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vg.C9348c.b.m39396d():vg.c");
        }

        /* renamed from: f */
        public final boolean m39397f() {
            return this.f42792c.m37498l().m37319a() == -1 && this.f42797h == null;
        }
    }

    public C9348c(C8743s c8743s, C8745u c8745u) {
        this.f42788a = c8743s;
        this.f42789b = c8745u;
    }

    /* renamed from: a */
    public static boolean m39391a(C8745u c8745u, C8743s c8743s) {
        int m37501o = c8745u.m37501o();
        if (m37501o == 200 || m37501o == 203 || m37501o == 300 || m37501o == 301 || m37501o == 410 || m37501o == 308) {
            return (c8745u.m37498l().m37324f() || c8743s.m37458h().m37324f()) ? false : true;
        }
        return false;
    }
}
