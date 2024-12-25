package p125h7;

import p057d7.C4331n;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h7/c.class
 */
/* renamed from: h7.c */
/* loaded from: combined.jar:classes2.jar:h7/c.class */
public final class C5039c extends C4331n {

    /* renamed from: b */
    public final long f29101b;

    public C5039c(InterfaceC4324g interfaceC4324g, long j10) {
        super(interfaceC4324g);
        C4349a.m21878a(interfaceC4324g.getPosition() >= j10);
        this.f29101b = j10;
    }

    @Override // p057d7.C4331n, p057d7.InterfaceC4324g
    public long getLength() {
        return super.getLength() - this.f29101b;
    }

    @Override // p057d7.C4331n, p057d7.InterfaceC4324g
    public long getPosition() {
        return super.getPosition() - this.f29101b;
    }

    @Override // p057d7.C4331n, p057d7.InterfaceC4324g
    /* renamed from: i */
    public long mo21804i() {
        return super.mo21804i() - this.f29101b;
    }

    @Override // p057d7.C4331n, p057d7.InterfaceC4324g
    /* renamed from: m */
    public <E extends Throwable> void mo21807m(long j10, E e10) {
        super.mo21807m(j10 + this.f29101b, e10);
    }
}
