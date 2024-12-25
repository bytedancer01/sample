package p038c8;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/b.class
 */
/* renamed from: c8.b */
/* loaded from: combined.jar:classes2.jar:c8/b.class */
public abstract class AbstractC1016b implements InterfaceC1029o {

    /* renamed from: b */
    public final long f6845b;

    /* renamed from: c */
    public final long f6846c;

    /* renamed from: d */
    public long f6847d;

    public AbstractC1016b(long j10, long j11) {
        this.f6845b = j10;
        this.f6846c = j11;
        m5991f();
    }

    /* renamed from: c */
    public final void m5988c() {
        long j10 = this.f6847d;
        if (j10 < this.f6845b || j10 > this.f6846c) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final long m5989d() {
        return this.f6847d;
    }

    /* renamed from: e */
    public boolean m5990e() {
        return this.f6847d > this.f6846c;
    }

    /* renamed from: f */
    public void m5991f() {
        this.f6847d = this.f6845b - 1;
    }

    @Override // p038c8.InterfaceC1029o
    public boolean next() {
        this.f6847d++;
        return !m5990e();
    }
}
