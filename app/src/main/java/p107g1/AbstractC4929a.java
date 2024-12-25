package p107g1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p175k0.C5449j;
import p221n0.C6617i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g1/a.class
 */
/* renamed from: g1.a */
/* loaded from: combined.jar:classes1.jar:g1/a.class */
public abstract class AbstractC4929a<D> extends C4931c<D> {

    /* renamed from: j */
    public final Executor f28634j;

    /* renamed from: k */
    public volatile AbstractC4929a<D>.a f28635k;

    /* renamed from: l */
    public volatile AbstractC4929a<D>.a f28636l;

    /* renamed from: m */
    public long f28637m;

    /* renamed from: n */
    public long f28638n;

    /* renamed from: o */
    public Handler f28639o;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:g1/a$a.class
     */
    /* renamed from: g1.a$a */
    /* loaded from: combined.jar:classes1.jar:g1/a$a.class */
    public final class a extends AbstractC4932d<Void, Void, D> implements Runnable {

        /* renamed from: l */
        public final CountDownLatch f28640l = new CountDownLatch(1);

        /* renamed from: m */
        public boolean f28641m;

        /* renamed from: n */
        public final AbstractC4929a f28642n;

        public a(AbstractC4929a abstractC4929a) {
            this.f28642n = abstractC4929a;
        }

        @Override // p107g1.AbstractC4932d
        /* renamed from: h */
        public void mo24881h(D d10) {
            try {
                this.f28642n.m24870B(this, d10);
            } finally {
                this.f28640l.countDown();
            }
        }

        @Override // p107g1.AbstractC4932d
        /* renamed from: i */
        public void mo24882i(D d10) {
            try {
                this.f28642n.m24871C(this, d10);
            } finally {
                this.f28640l.countDown();
            }
        }

        @Override // p107g1.AbstractC4932d
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo24880b(Void... voidArr) {
            try {
                return (D) this.f28642n.m24876H();
            } catch (C5449j e10) {
                if (m24920f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28641m = false;
            this.f28642n.m24872D();
        }
    }

    public AbstractC4929a(Context context) {
        this(context, AbstractC4932d.f28663i);
    }

    public AbstractC4929a(Context context, Executor executor) {
        super(context);
        this.f28638n = -10000L;
        this.f28634j = executor;
    }

    /* renamed from: A */
    public void mo24869A() {
    }

    /* renamed from: B */
    public void m24870B(AbstractC4929a<D>.a aVar, D d10) {
        mo24875G(d10);
        if (this.f28636l == aVar) {
            m24910v();
            this.f28638n = SystemClock.uptimeMillis();
            this.f28636l = null;
            m24900e();
            m24872D();
        }
    }

    /* renamed from: C */
    public void m24871C(AbstractC4929a<D>.a aVar, D d10) {
        if (this.f28635k != aVar) {
            m24870B(aVar, d10);
            return;
        }
        if (m24903j()) {
            mo24875G(d10);
            return;
        }
        m24898c();
        this.f28638n = SystemClock.uptimeMillis();
        this.f28635k = null;
        mo24892f(d10);
    }

    /* renamed from: D */
    public void m24872D() {
        if (this.f28636l != null || this.f28635k == null) {
            return;
        }
        if (this.f28635k.f28641m) {
            this.f28635k.f28641m = false;
            this.f28639o.removeCallbacks(this.f28635k);
        }
        if (this.f28637m <= 0 || SystemClock.uptimeMillis() >= this.f28638n + this.f28637m) {
            this.f28635k.m24918c(this.f28634j, null);
        } else {
            this.f28635k.f28641m = true;
            this.f28639o.postAtTime(this.f28635k, this.f28638n + this.f28637m);
        }
    }

    /* renamed from: E */
    public boolean m24873E() {
        return this.f28636l != null;
    }

    /* renamed from: F */
    public abstract D mo24874F();

    /* renamed from: G */
    public abstract void mo24875G(D d10);

    /* renamed from: H */
    public D m24876H() {
        return mo24874F();
    }

    @Override // p107g1.C4931c
    @Deprecated
    /* renamed from: g */
    public void mo24877g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo24877g(str, fileDescriptor, printWriter, strArr);
        if (this.f28635k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f28635k);
            printWriter.print(" waiting=");
            printWriter.println(this.f28635k.f28641m);
        }
        if (this.f28636l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f28636l);
            printWriter.print(" waiting=");
            printWriter.println(this.f28636l.f28641m);
        }
        if (this.f28637m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C6617i.m30531c(this.f28637m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C6617i.m30530b(this.f28638n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p107g1.C4931c
    /* renamed from: n */
    public boolean mo24878n() {
        if (this.f28635k == null) {
            return false;
        }
        if (!this.f28655e) {
            this.f28658h = true;
        }
        if (this.f28636l != null) {
            if (this.f28635k.f28641m) {
                this.f28635k.f28641m = false;
                this.f28639o.removeCallbacks(this.f28635k);
            }
            this.f28635k = null;
            return false;
        }
        if (this.f28635k.f28641m) {
            this.f28635k.f28641m = false;
            this.f28639o.removeCallbacks(this.f28635k);
            this.f28635k = null;
            return false;
        }
        boolean m24917a = this.f28635k.m24917a(false);
        if (m24917a) {
            this.f28636l = this.f28635k;
            mo24869A();
        }
        this.f28635k = null;
        return m24917a;
    }

    @Override // p107g1.C4931c
    /* renamed from: p */
    public void mo24879p() {
        super.mo24879p();
        m24897b();
        this.f28635k = new a(this);
        m24872D();
    }
}
