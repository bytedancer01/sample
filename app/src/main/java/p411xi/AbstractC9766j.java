package p411xi;

import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/j.class
 */
/* renamed from: xi.j */
/* loaded from: combined.jar:classes2.jar:xi/j.class */
public abstract class AbstractC9766j implements InterfaceC9782z {

    /* renamed from: b */
    @NotNull
    public final InterfaceC9782z f44538b;

    public AbstractC9766j(@NotNull InterfaceC9782z interfaceC9782z) {
        C9367f.m39526e(interfaceC9782z, "delegate");
        this.f44538b = interfaceC9782z;
    }

    @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44538b.close();
    }

    @Override // p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
        this.f44538b.flush();
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "source");
        this.f44538b.mo32031h(c9761e, j10);
    }

    @Override // p411xi.InterfaceC9782z
    @NotNull
    public C9758c0 timeout() {
        return this.f44538b.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.f44538b + ')';
    }
}
