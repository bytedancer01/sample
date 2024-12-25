package ph;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6789d;
import p372vh.C9367f;
import p372vh.C9372k;
import p372vh.InterfaceC9366e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/j.class
 */
/* renamed from: ph.j */
/* loaded from: combined.jar:classes2.jar:ph/j.class */
public abstract class AbstractC7723j extends AbstractC7716c implements InterfaceC9366e<Object> {

    /* renamed from: e */
    public final int f37489e;

    public AbstractC7723j(int i10, @Nullable InterfaceC6789d<Object> interfaceC6789d) {
        super(interfaceC6789d);
        this.f37489e = i10;
    }

    @Override // p372vh.InterfaceC9366e
    /* renamed from: l */
    public int mo33723l() {
        return this.f37489e;
    }

    @Override // ph.AbstractC7714a
    @NotNull
    public String toString() {
        String abstractC7714a;
        if (m33705i() == null) {
            abstractC7714a = C9372k.m39539a(this);
            C9367f.m39525d(abstractC7714a, "renderLambdaToString(this)");
        } else {
            abstractC7714a = super.toString();
        }
        return abstractC7714a;
    }
}
