package p411xi;

import java.io.Closeable;
import java.io.Flushable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/z.class
 */
/* renamed from: xi.z */
/* loaded from: combined.jar:classes2.jar:xi/z.class */
public interface InterfaceC9782z extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    /* renamed from: h */
    void mo32031h(@NotNull C9761e c9761e, long j10);

    @NotNull
    C9758c0 timeout();
}
