package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/e9.class
 */
/* renamed from: ua.e9 */
/* loaded from: combined.jar:classes2.jar:ua/e9.class */
public final class RunnableC8898e9 implements Runnable {

    /* renamed from: b */
    public final long f41042b;

    /* renamed from: c */
    public final long f41043c;

    /* renamed from: d */
    public final C8910f9 f41044d;

    public RunnableC8898e9(C8910f9 c8910f9, long j10, long j11) {
        this.f41044d = c8910f9;
        this.f41042b = j10;
        this.f41043c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41044d.f41087b.f41723a.mo37782e().m38436r(new Runnable(this) { // from class: ua.d9

            /* renamed from: b */
            public final RunnableC8898e9 f41029b;

            {
                this.f41029b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC8898e9 runnableC8898e9 = this.f41029b;
                C8910f9 c8910f9 = runnableC8898e9.f41044d;
                long j10 = runnableC8898e9.f41042b;
                long j11 = runnableC8898e9.f41043c;
                c8910f9.f41087b.mo37811h();
                c8910f9.f41087b.f41723a.mo37780c().m38415v().m38326a("Application going to the background");
                boolean z10 = true;
                if (c8910f9.f41087b.f41723a.m37797z().m37900w(null, C8988m3.f41394v0)) {
                    c8910f9.f41087b.f41723a.m37759A().f41499v.m38091b(true);
                }
                Bundle bundle = new Bundle();
                if (!c8910f9.f41087b.f41723a.m37797z().m37881C()) {
                    c8910f9.f41087b.f41271e.m38038b(j11);
                    if (c8910f9.f41087b.f41723a.m37797z().m37900w(null, C8988m3.f41376m0)) {
                        C8934h9 c8934h9 = c8910f9.f41087b.f41271e;
                        long j12 = c8934h9.f41169b;
                        c8934h9.f41169b = j11;
                        bundle.putLong("_et", j11 - j12);
                        C9088u7.m38264x(c8910f9.f41087b.f41723a.m37775Q().m38273s(true), bundle, true);
                    } else {
                        z10 = false;
                    }
                    c8910f9.f41087b.f41271e.m38040d(false, z10, j11);
                }
                c8910f9.f41087b.f41723a.m37764F().m37934Y("auto", "_ab", j10, bundle);
            }
        });
    }
}
