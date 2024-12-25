package p057d7;

import java.io.EOFException;
import p059d9.C4361f0;
import p283q7.C7839a;
import p366v7.C9300h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/p.class
 */
/* renamed from: d7.p */
/* loaded from: combined.jar:classes2.jar:d7/p.class */
public final class C4333p {

    /* renamed from: a */
    public final C4361f0 f26490a = new C4361f0(10);

    /* renamed from: a */
    public C7839a m21840a(InterfaceC4324g interfaceC4324g, C9300h.a aVar) {
        int i10;
        C7839a c7839a = null;
        int i11 = 0;
        while (true) {
            try {
                i10 = i11;
                interfaceC4324g.mo21811q(this.f26490a.m21988d(), 0, 10);
                this.f26490a.m21983P(0);
                if (this.f26490a.m21974G() != 4801587) {
                    break;
                }
                this.f26490a.m21984Q(3);
                int m21970C = this.f26490a.m21970C();
                int i12 = m21970C + 10;
                if (c7839a == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.f26490a.m21988d(), 0, bArr, 0, 10);
                    interfaceC4324g.mo21811q(bArr, 10, m21970C);
                    c7839a = new C9300h(aVar).m39222e(bArr, i12);
                } else {
                    interfaceC4324g.mo21805k(m21970C);
                }
                i11 = i10 + i12;
            } catch (EOFException e10) {
            }
        }
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21805k(i10);
        return c7839a;
    }
}
