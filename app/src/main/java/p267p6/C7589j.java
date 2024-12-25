package p267p6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/j.class
 */
@Deprecated
/* renamed from: p6.j */
/* loaded from: combined.jar:classes2.jar:p6/j.class */
public class C7589j implements InterfaceC7586i {

    /* renamed from: b */
    public final long f36785b = -9223372036854775807L;

    /* renamed from: a */
    public final long f36784a = -9223372036854775807L;

    /* renamed from: c */
    public final boolean f36786c = false;

    /* renamed from: o */
    public static void m32776o(InterfaceC7606o1 interfaceC7606o1, long j10) {
        long currentPosition = interfaceC7606o1.getCurrentPosition() + j10;
        long duration = interfaceC7606o1.getDuration();
        long j11 = currentPosition;
        if (duration != -9223372036854775807L) {
            j11 = Math.min(currentPosition, duration);
        }
        interfaceC7606o1.seekTo(Math.max(j11, 0L));
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: a */
    public boolean mo32764a(InterfaceC7606o1 interfaceC7606o1, boolean z10) {
        interfaceC7606o1.mo32482z(z10);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: b */
    public boolean mo32765b(InterfaceC7606o1 interfaceC7606o1) {
        interfaceC7606o1.mo32657j();
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: c */
    public boolean mo32766c(InterfaceC7606o1 interfaceC7606o1) {
        if (!this.f36786c) {
            interfaceC7606o1.mo32637M();
            return true;
        }
        if (!mo32774k() || !interfaceC7606o1.mo32654f()) {
            return true;
        }
        m32776o(interfaceC7606o1, this.f36785b);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: d */
    public boolean mo32767d(InterfaceC7606o1 interfaceC7606o1) {
        interfaceC7606o1.prepare();
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: e */
    public boolean mo32768e(InterfaceC7606o1 interfaceC7606o1, int i10) {
        interfaceC7606o1.setRepeatMode(i10);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: f */
    public boolean mo32769f(InterfaceC7606o1 interfaceC7606o1) {
        interfaceC7606o1.mo32659t();
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: g */
    public boolean mo32770g(InterfaceC7606o1 interfaceC7606o1, int i10, long j10) {
        interfaceC7606o1.mo32476w(i10, j10);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: h */
    public boolean mo32771h() {
        return !this.f36786c || this.f36784a > 0;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: i */
    public boolean mo32772i(InterfaceC7606o1 interfaceC7606o1, C7603n1 c7603n1) {
        interfaceC7606o1.mo32440c(c7603n1);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: j */
    public boolean mo32773j(InterfaceC7606o1 interfaceC7606o1) {
        if (!this.f36786c) {
            interfaceC7606o1.mo32638N();
            return true;
        }
        if (!mo32771h() || !interfaceC7606o1.mo32654f()) {
            return true;
        }
        m32776o(interfaceC7606o1, -this.f36784a);
        return true;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: k */
    public boolean mo32774k() {
        return !this.f36786c || this.f36785b > 0;
    }

    @Override // p267p6.InterfaceC7586i
    /* renamed from: l */
    public boolean mo32775l(InterfaceC7606o1 interfaceC7606o1, boolean z10) {
        interfaceC7606o1.mo32456l(z10);
        return true;
    }

    /* renamed from: m */
    public long m32777m(InterfaceC7606o1 interfaceC7606o1) {
        return this.f36786c ? this.f36785b : interfaceC7606o1.mo32416G();
    }

    /* renamed from: n */
    public long m32778n(InterfaceC7606o1 interfaceC7606o1) {
        return this.f36786c ? this.f36784a : interfaceC7606o1.mo32426P();
    }
}
