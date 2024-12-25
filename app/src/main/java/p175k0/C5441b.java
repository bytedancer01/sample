package p175k0;

import android.os.CancellationSignal;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:k0/b.class
 */
/* renamed from: k0.b */
/* loaded from: combined.jar:classes1.jar:k0/b.class */
public final class C5441b {

    /* renamed from: a */
    public boolean f31184a;

    /* renamed from: b */
    public a f31185b;

    /* renamed from: c */
    public Object f31186c;

    /* renamed from: d */
    public boolean f31187d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:k0/b$a.class
     */
    /* renamed from: k0.b$a */
    /* loaded from: combined.jar:classes1.jar:k0/b$a.class */
    public interface a {
        void onCancel();
    }

    /* renamed from: a */
    public void m27190a() {
        synchronized (this) {
            if (this.f31184a) {
                return;
            }
            this.f31184a = true;
            this.f31187d = true;
            a aVar = this.f31185b;
            Object obj = this.f31186c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f31187d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f31187d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public Object m27191b() {
        Object obj;
        synchronized (this) {
            if (this.f31186c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f31186c = cancellationSignal;
                if (this.f31184a) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    cancellationSignal.cancel();
                }
            }
            obj = this.f31186c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean m27192c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f31184a;
        }
        return z10;
    }

    /* renamed from: d */
    public void m27193d(a aVar) {
        synchronized (this) {
            m27194e();
            if (this.f31185b == aVar) {
                return;
            }
            this.f31185b = aVar;
            if (!this.f31184a || aVar == null) {
                return;
            }
            aVar.onCancel();
        }
    }

    /* renamed from: e */
    public final void m27194e() {
        while (this.f31187d) {
            try {
                wait();
            } catch (InterruptedException e10) {
            }
        }
    }
}
