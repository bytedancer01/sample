package p330t4;

import org.apache.http.impl.auth.NTLMEngineImpl;
import p363v4.C9242h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/g.class
 */
/* renamed from: t4.g */
/* loaded from: combined.jar:classes1.jar:t4/g.class */
public abstract class AbstractC8627g<Z> extends AbstractC8621a<Z> {

    /* renamed from: b */
    public final int f40282b;

    /* renamed from: c */
    public final int f40283c;

    public AbstractC8627g() {
        this(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    }

    public AbstractC8627g(int i10, int i11) {
        this.f40282b = i10;
        this.f40283c = i11;
    }

    @Override // p330t4.InterfaceC8630j
    /* renamed from: a */
    public final void mo37053a(InterfaceC8628h interfaceC8628h) {
        if (C9242h.m38973k(this.f40282b, this.f40283c)) {
            interfaceC8628h.mo34487d(this.f40282b, this.f40283c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f40282b + " and height: " + this.f40283c + ", either provide dimensions in the constructor or call override()");
    }
}
