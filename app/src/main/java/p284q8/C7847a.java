package p284q8;

import java.util.List;
import p059d9.C4361f0;
import p243o8.AbstractC6921c;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q8/a.class
 */
/* renamed from: q8.a */
/* loaded from: combined.jar:classes2.jar:q8/a.class */
public final class C7847a extends AbstractC6921c {

    /* renamed from: o */
    public final C7848b f37817o;

    public C7847a(List<byte[]> list) {
        super("DvbDecoder");
        C4361f0 c4361f0 = new C4361f0(list.get(0));
        this.f37817o = new C7848b(c4361f0.m21977J(), c4361f0.m21977J());
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f37817o.m34119r();
        }
        return new C7849c(this.f37817o.m34118b(bArr, i10));
    }
}
