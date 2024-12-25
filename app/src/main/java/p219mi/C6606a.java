package p219mi;

import ci.C1128n;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.Nullable;
import p173ji.C5403c;
import p173ji.C5410f0;
import p173ji.C5432w;
import p173ji.InterfaceC5434y;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:mi/a.class
 */
/* renamed from: mi.a */
/* loaded from: combined.jar:classes2.jar:mi/a.class */
public final class C6606a implements InterfaceC5434y {

    /* renamed from: a */
    public static final a f34503a = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:mi/a$a.class
     */
    /* renamed from: mi.a$a */
    /* loaded from: combined.jar:classes2.jar:mi/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: c */
        public final C5432w m30502c(C5432w c5432w, C5432w c5432w2) {
            C5432w.a aVar = new C5432w.a();
            int size = c5432w.size();
            for (int i10 = 0; i10 < size; i10++) {
                String m27082b = c5432w.m27082b(i10);
                String m27085h = c5432w.m27085h(i10);
                if ((!C1128n.m6719l(HttpHeaders.WARNING, m27082b, true) || !C1128n.m6732y(m27085h, "1", false, 2, null)) && (m30503d(m27082b) || !m30504e(m27082b) || c5432w2.m27081a(m27082b) == null)) {
                    aVar.m27090d(m27082b, m27085h);
                }
            }
            int size2 = c5432w2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String m27082b2 = c5432w2.m27082b(i11);
                if (!m30503d(m27082b2) && m30504e(m27082b2)) {
                    aVar.m27090d(m27082b2, c5432w2.m27085h(i11));
                }
            }
            return aVar.m27092f();
        }

        /* renamed from: d */
        public final boolean m30503d(String str) {
            boolean z10 = true;
            if (!C1128n.m6719l("Content-Length", str, true)) {
                z10 = true;
                if (!C1128n.m6719l("Content-Encoding", str, true)) {
                    z10 = C1128n.m6719l("Content-Type", str, true);
                }
            }
            return z10;
        }

        /* renamed from: e */
        public final boolean m30504e(String str) {
            boolean z10 = true;
            if (C1128n.m6719l("Connection", str, true) || C1128n.m6719l(HTTP.CONN_KEEP_ALIVE, str, true) || C1128n.m6719l("Proxy-Authenticate", str, true) || C1128n.m6719l("Proxy-Authorization", str, true) || C1128n.m6719l(HttpHeaders.f36150TE, str, true) || C1128n.m6719l("Trailers", str, true) || C1128n.m6719l("Transfer-Encoding", str, true) || C1128n.m6719l(HttpHeaders.UPGRADE, str, true)) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: f */
        public final C5410f0 m30505f(C5410f0 c5410f0) {
            C5410f0 c5410f02 = c5410f0;
            if ((c5410f0 != null ? c5410f0.m26920f() : null) != null) {
                c5410f02 = c5410f0.m26914B0().m26933b(null).m26934c();
            }
            return c5410f02;
        }
    }

    public C6606a(@Nullable C5403c c5403c) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        if (r9 != null) goto L12;
     */
    @Override // p173ji.InterfaceC5434y
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p173ji.C5410f0 intercept(@org.jetbrains.annotations.NotNull p173ji.InterfaceC5434y.a r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p219mi.C6606a.intercept(ji.y$a):ji.f0");
    }
}
