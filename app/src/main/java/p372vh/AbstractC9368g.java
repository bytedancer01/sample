package p372vh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/g.class
 */
/* renamed from: vh.g */
/* loaded from: combined.jar:classes2.jar:vh/g.class */
public abstract class AbstractC9368g<R> implements InterfaceC9366e<R>, Serializable {

    /* renamed from: b */
    public final int f42901b;

    public AbstractC9368g(int i10) {
        this.f42901b = i10;
    }

    @Override // p372vh.InterfaceC9366e
    /* renamed from: l */
    public int mo33723l() {
        return this.f42901b;
    }

    @NotNull
    public String toString() {
        String m39540b = C9372k.m39540b(this);
        C9367f.m39525d(m39540b, "renderLambdaToString(this)");
        return m39540b;
    }
}
