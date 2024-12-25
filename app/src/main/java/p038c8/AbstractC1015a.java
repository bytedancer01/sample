package p038c8;

import p027b9.C0858p;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c8/a.class
 */
/* renamed from: c8.a */
/* loaded from: combined.jar:classes2.jar:c8/a.class */
public abstract class AbstractC1015a extends AbstractC1028n {

    /* renamed from: k */
    public final long f6841k;

    /* renamed from: l */
    public final long f6842l;

    /* renamed from: m */
    public C1017c f6843m;

    /* renamed from: n */
    public int[] f6844n;

    public AbstractC1015a(InterfaceC0854m interfaceC0854m, C0858p c0858p, C7629w0 c7629w0, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(interfaceC0854m, c0858p, c7629w0, i10, obj, j10, j11, j14);
        this.f6841k = j12;
        this.f6842l = j13;
    }

    /* renamed from: i */
    public final int m5985i(int i10) {
        return ((int[]) C4349a.m21886i(this.f6844n))[i10];
    }

    /* renamed from: j */
    public final C1017c m5986j() {
        return (C1017c) C4349a.m21886i(this.f6843m);
    }

    /* renamed from: k */
    public void m5987k(C1017c c1017c) {
        this.f6843m = c1017c;
        this.f6844n = c1017c.m5992a();
    }
}
