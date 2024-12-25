package p009a8;

import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4329l;
import p059d9.C4349a;
import p163j7.C5310f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/c.class
 */
/* renamed from: a8.c */
/* loaded from: combined.jar:classes2.jar:a8/c.class */
public final class C0087c implements InterfaceC0098h0 {

    /* renamed from: a */
    public final InterfaceC4329l f269a;

    /* renamed from: b */
    public InterfaceC4323f f270b;

    /* renamed from: c */
    public InterfaceC4324g f271c;

    public C0087c(InterfaceC4329l interfaceC4329l) {
        this.f269a = interfaceC4329l;
    }

    @Override // p009a8.InterfaceC0098h0
    /* renamed from: a */
    public void mo328a(long j10, long j11) {
        ((InterfaceC4323f) C4349a.m21882e(this.f270b)).mo12027a(j10, j11);
    }

    @Override // p009a8.InterfaceC0098h0
    /* renamed from: b */
    public int mo329b(C4334q c4334q) {
        return ((InterfaceC4323f) C4349a.m21882e(this.f270b)).mo12033h((InterfaceC4324g) C4349a.m21882e(this.f271c), c4334q);
    }

    @Override // p009a8.InterfaceC0098h0
    /* renamed from: c */
    public void mo330c() {
        InterfaceC4323f interfaceC4323f = this.f270b;
        if (interfaceC4323f instanceof C5310f) {
            ((C5310f) interfaceC4323f).m26514j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r0.getPosition() != r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (r0.getPosition() != r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r0.getPosition() == r12) goto L26;
     */
    @Override // p009a8.InterfaceC0098h0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo331d(p027b9.InterfaceC0846i r9, android.net.Uri r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11, long r12, long r14, p057d7.InterfaceC4325h r16) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0087c.mo331d(b9.i, android.net.Uri, java.util.Map, long, long, d7.h):void");
    }

    @Override // p009a8.InterfaceC0098h0
    /* renamed from: e */
    public long mo332e() {
        InterfaceC4324g interfaceC4324g = this.f271c;
        return interfaceC4324g != null ? interfaceC4324g.getPosition() : -1L;
    }

    @Override // p009a8.InterfaceC0098h0
    public void release() {
        InterfaceC4323f interfaceC4323f = this.f270b;
        if (interfaceC4323f != null) {
            interfaceC4323f.release();
            this.f270b = null;
        }
        this.f271c = null;
    }
}
