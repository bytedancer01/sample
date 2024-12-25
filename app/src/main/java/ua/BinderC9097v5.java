package ua;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p060da.C4417p;
import p305ra.C8175ha;
import p305ra.C8386vb;
import p350u9.C8822k;
import p350u9.C8824l;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v5.class
 */
/* renamed from: ua.v5 */
/* loaded from: combined.jar:classes2.jar:ua/v5.class */
public final class BinderC9097v5 extends AbstractBinderC9012o3 {

    /* renamed from: b */
    public final C9123x9 f41698b;

    /* renamed from: c */
    public Boolean f41699c;

    /* renamed from: d */
    public String f41700d;

    public BinderC9097v5(C9123x9 c9123x9, String str) {
        C9935o.m41850j(c9123x9);
        this.f41698b = c9123x9;
        this.f41700d = null;
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: B0 */
    public final void mo38140B0(C8959ja c8959ja) {
        m38319D1(c8959ja, false);
        m38321U0(new RunnableC8990m5(this, c8959ja));
    }

    /* renamed from: B1 */
    public final /* synthetic */ void m38318B1(C8959ja c8959ja, Bundle bundle) {
        C8948j m38363Z = this.f41698b.m38363Z();
        String str = c8959ja.f41228d;
        m38363Z.mo37811h();
        m38363Z.m38183j();
        byte[] m35811f = m38363Z.f41516b.m38369e0().m38466w(new C9008o(m38363Z.f41723a, "", str, "dep", 0L, 0L, bundle)).m35811f();
        m38363Z.f41723a.mo37780c().m38416w().m38328c("Saving default event parameters, appId, data size", m38363Z.f41723a.m37766H().m38231p(str), Integer.valueOf(m35811f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m35811f);
        try {
            if (m38363Z.m38058N().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m38363Z.f41723a.mo37780c().m38408o().m38327b("Failed to insert default event parameters (got -1). appId", C9128y3.m38407x(str));
            }
        } catch (SQLiteException e10) {
            m38363Z.f41723a.mo37780c().m38408o().m38328c("Error storing default event parameters. appId", C9128y3.m38407x(str), e10);
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: C0 */
    public final void mo38141C0(C8852b c8852b, C8959ja c8959ja) {
        C9935o.m41850j(c8852b);
        C9935o.m41850j(c8852b.f40914f);
        m38319D1(c8959ja, false);
        C8852b c8852b2 = new C8852b(c8852b);
        c8852b2.f40912d = c8959ja.f41228d;
        m38321U0(new RunnableC8894e5(this, c8852b2, c8959ja));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: D */
    public final List<C8851aa> mo38142D(String str, String str2, boolean z10, C8959ja c8959ja) {
        m38319D1(c8959ja, false);
        try {
            List<C8875ca> list = (List) this.f41698b.mo37782e().m38434p(new CallableC8930h5(this, c8959ja, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C8875ca c8875ca : list) {
                if (z10 || !C8899ea.m37819F(c8875ca.f41004c)) {
                    arrayList.add(new C8851aa(c8875ca));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38328c("Failed to query user properties. appId", C9128y3.m38407x(c8959ja.f41228d), e10);
            return Collections.emptyList();
        }
    }

    /* renamed from: D1 */
    public final void m38319D1(C8959ja c8959ja, boolean z10) {
        C9935o.m41850j(c8959ja);
        m38320E1(c8959ja.f41228d, false);
        this.f41698b.m38374h0().m37858o(c8959ja.f41229e, c8959ja.f41244t, c8959ja.f41248x);
    }

    /* renamed from: E1 */
    public final void m38320E1(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f41698b.mo37780c().m38408o().m38326a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f41699c == null) {
                    if (!"com.google.android.gms".equals(this.f41700d) && !C4417p.m22464a(this.f41698b.mo37779b(), Binder.getCallingUid()) && !C8824l.m37720a(this.f41698b.mo37779b()).m37724c(Binder.getCallingUid())) {
                        z11 = false;
                        this.f41699c = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f41699c = Boolean.valueOf(z11);
                }
                if (this.f41699c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f41698b.mo37780c().m38408o().m38327b("Measurement Service called with invalid calling package. appId", C9128y3.m38407x(str));
                throw e10;
            }
        }
        if (this.f41700d == null && C8822k.m37717l(this.f41698b.mo37779b(), Binder.getCallingUid(), str)) {
            this.f41700d = str;
        }
        if (str.equals(this.f41700d)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: P0 */
    public final void mo38143P0(C8959ja c8959ja) {
        m38319D1(c8959ja, false);
        m38321U0(new RunnableC9074t5(this, c8959ja));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: Q0 */
    public final void mo38144Q0(long j10, String str, String str2, String str3) {
        m38321U0(new RunnableC9086u5(this, str2, str3, str, j10));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: S */
    public final List<C8852b> mo38145S(String str, String str2, String str3) {
        m38320E1(str, true);
        try {
            return (List) this.f41698b.mo37782e().m38434p(new CallableC8966k5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38327b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    /* renamed from: U0 */
    public final void m38321U0(Runnable runnable) {
        C9935o.m41850j(runnable);
        if (this.f41698b.mo37782e().m38433o()) {
            runnable.run();
        } else {
            this.f41698b.mo37782e().m38436r(runnable);
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: X0 */
    public final List<C8852b> mo38146X0(String str, String str2, C8959ja c8959ja) {
        m38319D1(c8959ja, false);
        try {
            return (List) this.f41698b.mo37782e().m38434p(new CallableC8954j5(this, c8959ja, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38327b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: Y0 */
    public final void mo38147Y0(C8959ja c8959ja) {
        C8175ha.m35418a();
        if (this.f41698b.m38360W().m37900w(null, C8988m3.f41327I0)) {
            C9935o.m41846f(c8959ja.f41228d);
            C9935o.m41850j(c8959ja.f41249y);
            RunnableC9002n5 runnableC9002n5 = new RunnableC9002n5(this, c8959ja);
            C9935o.m41850j(runnableC9002n5);
            if (this.f41698b.mo37782e().m38433o()) {
                runnableC9002n5.run();
            } else {
                this.f41698b.mo37782e().m38438t(runnableC9002n5);
            }
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: a0 */
    public final void mo38179a0(C8852b c8852b) {
        C9935o.m41850j(c8852b);
        C9935o.m41850j(c8852b.f40914f);
        m38320E1(c8852b.f40912d, true);
        m38321U0(new RunnableC8906f5(this, new C8852b(c8852b)));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: c0 */
    public final List<C8851aa> mo38180c0(C8959ja c8959ja, boolean z10) {
        m38319D1(c8959ja, false);
        try {
            List<C8875ca> list = (List) this.f41698b.mo37782e().m38434p(new CallableC9062s5(this, c8959ja)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C8875ca c8875ca : list) {
                if (z10 || !C8899ea.m37819F(c8875ca.f41004c)) {
                    arrayList.add(new C8851aa(c8875ca));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38328c("Failed to get user properties. appId", C9128y3.m38407x(c8959ja.f41228d), e10);
            return null;
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: d1 */
    public final void mo38148d1(C8959ja c8959ja) {
        m38320E1(c8959ja.f41228d, false);
        m38321U0(new RunnableC8978l5(this, c8959ja));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: f0 */
    public final String mo38149f0(C8959ja c8959ja) {
        m38319D1(c8959ja, false);
        return this.f41698b.m38347D(c8959ja);
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: g1 */
    public final void mo38150g1(final Bundle bundle, final C8959ja c8959ja) {
        C8386vb.m35974a();
        if (this.f41698b.m38360W().m37900w(null, C8988m3.f41313B0)) {
            m38319D1(c8959ja, false);
            m38321U0(new Runnable(this, c8959ja, bundle) { // from class: ua.d5

                /* renamed from: b */
                public final BinderC9097v5 f41020b;

                /* renamed from: c */
                public final C8959ja f41021c;

                /* renamed from: d */
                public final Bundle f41022d;

                {
                    this.f41020b = this;
                    this.f41021c = c8959ja;
                    this.f41022d = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f41020b.m38318B1(this.f41021c, this.f41022d);
                }
            });
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: i1 */
    public final byte[] mo38151i1(C9068t c9068t, String str) {
        C9935o.m41846f(str);
        C9935o.m41850j(c9068t);
        m38320E1(str, true);
        this.f41698b.mo37780c().m38415v().m38327b("Log and bundle. event", this.f41698b.m38372g0().m38231p(c9068t.f41627d));
        long mo22434c = this.f41698b.mo37778a().mo22434c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f41698b.mo37782e().m38435q(new CallableC9038q5(this, c9068t, str)).get();
            byte[] bArr2 = bArr;
            if (bArr == null) {
                this.f41698b.mo37780c().m38408o().m38327b("Log and bundle returned null. appId", C9128y3.m38407x(str));
                bArr2 = new byte[0];
            }
            this.f41698b.mo37780c().m38415v().m38329d("Log and bundle processed. event, size, time_ms", this.f41698b.m38372g0().m38231p(c9068t.f41627d), Integer.valueOf(bArr2.length), Long.valueOf((this.f41698b.mo37778a().mo22434c() / 1000000) - mo22434c));
            return bArr2;
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38329d("Failed to log and bundle. appId, event, error", C9128y3.m38407x(str), this.f41698b.m38372g0().m38231p(c9068t.f41627d), e10);
            return null;
        }
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: n1 */
    public final void mo38181n1(C9068t c9068t, String str, String str2) {
        C9935o.m41850j(c9068t);
        C9935o.m41846f(str);
        m38320E1(str, true);
        m38321U0(new RunnableC9026p5(this, c9068t, str));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: q1 */
    public final void mo38152q1(C8851aa c8851aa, C8959ja c8959ja) {
        C9935o.m41850j(c8851aa);
        m38319D1(c8959ja, false);
        m38321U0(new RunnableC9050r5(this, c8851aa, c8959ja));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: t1 */
    public final void mo38153t1(C9068t c9068t, C8959ja c8959ja) {
        C9935o.m41850j(c9068t);
        m38319D1(c8959ja, false);
        m38321U0(new RunnableC9014o5(this, c9068t, c8959ja));
    }

    @Override // ua.InterfaceC9024p3
    /* renamed from: w0 */
    public final List<C8851aa> mo38154w0(String str, String str2, String str3, boolean z10) {
        m38320E1(str, true);
        try {
            List<C8875ca> list = (List) this.f41698b.mo37782e().m38434p(new CallableC8942i5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C8875ca c8875ca : list) {
                if (z10 || !C8899ea.m37819F(c8875ca.f41004c)) {
                    arrayList.add(new C8851aa(c8875ca));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f41698b.mo37780c().m38408o().m38328c("Failed to get user properties as. appId", C9128y3.m38407x(str), e10);
            return Collections.emptyList();
        }
    }

    /* renamed from: y0 */
    public final C9068t m38322y0(C9068t c9068t, C8959ja c8959ja) {
        C9044r c9044r;
        if ("_cmp".equals(c9068t.f41627d) && (c9044r = c9068t.f41628e) != null && c9044r.m38210S() != 0) {
            String m38209R = c9068t.f41628e.m38209R("_cis");
            if ("referrer broadcast".equals(m38209R) || "referrer API".equals(m38209R)) {
                this.f41698b.mo37780c().m38414u().m38327b("Event has been filtered ", c9068t.toString());
                return new C9068t("_cmpx", c9068t.f41628e, c9068t.f41629f, c9068t.f41630g);
            }
        }
        return c9068t;
    }
}
