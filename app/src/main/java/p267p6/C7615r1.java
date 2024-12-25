package p267p6;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p059d9.C4349a;
import p059d9.InterfaceC4354c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/r1.class
 */
/* renamed from: p6.r1 */
/* loaded from: combined.jar:classes2.jar:p6/r1.class */
public final class C7615r1 {

    /* renamed from: a */
    public final b f36965a;

    /* renamed from: b */
    public final a f36966b;

    /* renamed from: c */
    public final InterfaceC4354c f36967c;

    /* renamed from: d */
    public final AbstractC7574e2 f36968d;

    /* renamed from: e */
    public int f36969e;

    /* renamed from: f */
    public Object f36970f;

    /* renamed from: g */
    public Looper f36971g;

    /* renamed from: h */
    public int f36972h;

    /* renamed from: i */
    public long f36973i = -9223372036854775807L;

    /* renamed from: j */
    public boolean f36974j = true;

    /* renamed from: k */
    public boolean f36975k;

    /* renamed from: l */
    public boolean f36976l;

    /* renamed from: m */
    public boolean f36977m;

    /* renamed from: n */
    public boolean f36978n;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/r1$a.class
     */
    /* renamed from: p6.r1$a */
    /* loaded from: combined.jar:classes2.jar:p6/r1$a.class */
    public interface a {
        /* renamed from: d */
        void mo33022d(C7615r1 c7615r1);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:p6/r1$b.class
     */
    /* renamed from: p6.r1$b */
    /* loaded from: combined.jar:classes2.jar:p6/r1$b.class */
    public interface b {
        /* renamed from: i */
        void mo23432i(int i10, Object obj);
    }

    public C7615r1(a aVar, b bVar, AbstractC7574e2 abstractC7574e2, int i10, InterfaceC4354c interfaceC4354c, Looper looper) {
        this.f36966b = aVar;
        this.f36965a = bVar;
        this.f36968d = abstractC7574e2;
        this.f36971g = looper;
        this.f36967c = interfaceC4354c;
        this.f36972h = i10;
    }

    /* renamed from: a */
    public boolean m33008a(long j10) {
        boolean z10;
        boolean z11;
        synchronized (this) {
            C4349a.m21884g(this.f36975k);
            C4349a.m21884g(this.f36971g.getThread() != Thread.currentThread());
            long mo21913b = this.f36967c.mo21913b();
            long j11 = j10;
            while (true) {
                z10 = this.f36977m;
                if (z10 || j11 <= 0) {
                    break;
                }
                this.f36967c.mo21916e();
                wait(j11);
                j11 = (mo21913b + j10) - this.f36967c.mo21913b();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
            z11 = this.f36976l;
        }
        return z11;
    }

    /* renamed from: b */
    public boolean m33009b() {
        return this.f36974j;
    }

    /* renamed from: c */
    public Looper m33010c() {
        return this.f36971g;
    }

    /* renamed from: d */
    public Object m33011d() {
        return this.f36970f;
    }

    /* renamed from: e */
    public long m33012e() {
        return this.f36973i;
    }

    /* renamed from: f */
    public b m33013f() {
        return this.f36965a;
    }

    /* renamed from: g */
    public AbstractC7574e2 m33014g() {
        return this.f36968d;
    }

    /* renamed from: h */
    public int m33015h() {
        return this.f36969e;
    }

    /* renamed from: i */
    public int m33016i() {
        return this.f36972h;
    }

    /* renamed from: j */
    public boolean m33017j() {
        boolean z10;
        synchronized (this) {
            z10 = this.f36978n;
        }
        return z10;
    }

    /* renamed from: k */
    public void m33018k(boolean z10) {
        synchronized (this) {
            this.f36976l = z10 | this.f36976l;
            this.f36977m = true;
            notifyAll();
        }
    }

    /* renamed from: l */
    public C7615r1 m33019l() {
        C4349a.m21884g(!this.f36975k);
        if (this.f36973i == -9223372036854775807L) {
            C4349a.m21878a(this.f36974j);
        }
        this.f36975k = true;
        this.f36966b.mo33022d(this);
        return this;
    }

    /* renamed from: m */
    public C7615r1 m33020m(Object obj) {
        C4349a.m21884g(!this.f36975k);
        this.f36970f = obj;
        return this;
    }

    /* renamed from: n */
    public C7615r1 m33021n(int i10) {
        C4349a.m21884g(!this.f36975k);
        this.f36969e = i10;
        return this;
    }
}
