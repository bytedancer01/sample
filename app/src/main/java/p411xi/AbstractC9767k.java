package p411xi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/k.class
 */
/* renamed from: xi.k */
/* loaded from: combined.jar:classes2.jar:xi/k.class */
public abstract class AbstractC9767k implements InterfaceC9756b0 {

    /* renamed from: b */
    @NotNull
    public final InterfaceC9756b0 f44539b;

    public AbstractC9767k(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "delegate");
        this.f44539b = interfaceC9756b0;
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44539b.close();
    }

    @NotNull
    /* renamed from: f */
    public final InterfaceC9756b0 m41217f() {
        return this.f44539b;
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return this.f44539b.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f44539b + ')';
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        return this.f44539b.mo22901x(c9761e, j10);
    }
}
