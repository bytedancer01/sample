package p038c8;

import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/n.class
 */
/* renamed from: c8.n */
/* loaded from: combined.jar:classes2.jar:c8/n.class */
public abstract class AbstractC1028n extends AbstractC1020f {

    /* renamed from: j */
    public final long f6919j;

    public AbstractC1028n(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, long j10, long j11, long j12) {
        super(interfaceC0854m, c0858p, 1, c7629w0, i10, obj, j10, j11);
        C4349a.m21882e(c7629w0);
        this.f6919j = j12;
    }

    /* renamed from: g */
    public long mo6045g() {
        long j10 = this.f6919j;
        long j11 = -1;
        if (j10 != -1) {
            j11 = 1 + j10;
        }
        return j11;
    }

    /* renamed from: h */
    public abstract boolean mo6046h();
}
