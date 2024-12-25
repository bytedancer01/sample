package p059d9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/f.class
 */
/* renamed from: d9.f */
/* loaded from: combined.jar:classes2.jar:d9/f.class */
public class C4360f {

    /* renamed from: a */
    public final InterfaceC4354c f26565a;

    /* renamed from: b */
    public boolean f26566b;

    public C4360f() {
        this(InterfaceC4354c.f26546a);
    }

    public C4360f(InterfaceC4354c interfaceC4354c) {
        this.f26565a = interfaceC4354c;
    }

    /* renamed from: a */
    public void m21962a() {
        synchronized (this) {
            while (!this.f26566b) {
                wait();
            }
        }
    }

    /* renamed from: b */
    public boolean m21963b(long j10) {
        synchronized (this) {
            if (j10 <= 0) {
                return this.f26566b;
            }
            long mo21913b = this.f26565a.mo21913b();
            long j11 = j10 + mo21913b;
            long j12 = mo21913b;
            if (j11 < mo21913b) {
                m21962a();
            } else {
                while (!this.f26566b && j12 < j11) {
                    wait(j11 - j12);
                    j12 = this.f26565a.mo21913b();
                }
            }
            return this.f26566b;
        }
    }

    /* renamed from: c */
    public void m21964c() {
        synchronized (this) {
            boolean z10 = false;
            while (!this.f26566b) {
                try {
                    wait();
                } catch (InterruptedException e10) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: d */
    public boolean m21965d() {
        boolean z10;
        synchronized (this) {
            z10 = this.f26566b;
            this.f26566b = false;
        }
        return z10;
    }

    /* renamed from: e */
    public boolean m21966e() {
        boolean z10;
        synchronized (this) {
            z10 = this.f26566b;
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m21967f() {
        synchronized (this) {
            if (this.f26566b) {
                return false;
            }
            this.f26566b = true;
            notifyAll();
            return true;
        }
    }
}
