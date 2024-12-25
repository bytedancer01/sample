package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4458a;
import p067di.C4532z;
import p233nh.InterfaceC6789d;
import p252oh.C6975b;
import ph.InterfaceC7717d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/s.class
 */
/* renamed from: fi.s */
/* loaded from: combined.jar:classes2.jar:fi/s.class */
public class C4880s<T> extends AbstractC4458a<T> implements InterfaceC7717d {

    /* renamed from: d */
    @NotNull
    public final InterfaceC6789d<T> f28584d;

    @Override // p067di.C4487j1
    /* renamed from: P */
    public final boolean mo22696P() {
        return true;
    }

    @Override // ph.InterfaceC7717d
    @Nullable
    /* renamed from: a */
    public final InterfaceC7717d mo22751a() {
        InterfaceC6789d<T> interfaceC6789d = this.f28584d;
        return interfaceC6789d instanceof InterfaceC7717d ? (InterfaceC7717d) interfaceC6789d : null;
    }

    @Override // p067di.C4487j1
    /* renamed from: k */
    public void mo22716k(@Nullable Object obj) {
        C4867f.m24751c(C6975b.m32003c(this.f28584d), C4532z.m22849a(obj, this.f28584d), null, 2, null);
    }

    @Override // p067di.AbstractC4458a
    /* renamed from: p0 */
    public void mo22621p0(@Nullable Object obj) {
        InterfaceC6789d<T> interfaceC6789d = this.f28584d;
        interfaceC6789d.mo22620c(C4532z.m22849a(obj, interfaceC6789d));
    }
}
