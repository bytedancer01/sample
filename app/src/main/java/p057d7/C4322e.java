package p057d7;

import java.io.EOFException;
import p027b9.InterfaceC0846i;
import p057d7.InterfaceC4337t;
import p059d9.C4361f0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/e.class
 */
/* renamed from: d7.e */
/* loaded from: combined.jar:classes2.jar:d7/e.class */
public final class C4322e implements InterfaceC4337t {

    /* renamed from: a */
    public final byte[] f26482a = new byte[4096];

    @Override // p057d7.InterfaceC4337t
    /* renamed from: a */
    public void mo598a(C4361f0 c4361f0, int i10, int i11) {
        c4361f0.m21984Q(i10);
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: b */
    public void mo600b(long j10, int i10, int i11, int i12, InterfaceC4337t.a aVar) {
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: c */
    public int mo602c(InterfaceC0846i interfaceC0846i, int i10, boolean z10, int i11) {
        int read = interfaceC0846i.read(this.f26482a, 0, Math.min(this.f26482a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: d */
    public /* synthetic */ int mo604d(InterfaceC0846i interfaceC0846i, int i10, boolean z10) {
        return C4336s.m21841a(this, interfaceC0846i, i10, z10);
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: e */
    public /* synthetic */ void mo606e(C4361f0 c4361f0, int i10) {
        C4336s.m21842b(this, c4361f0, i10);
    }

    @Override // p057d7.InterfaceC4337t
    /* renamed from: f */
    public void mo608f(C7629w0 c7629w0) {
    }
}
