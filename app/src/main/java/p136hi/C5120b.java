package p136hi;

import fi.C4882u;
import fi.C4884w;
import org.jetbrains.annotations.NotNull;
import p067di.AbstractC4462b0;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/b.class
 */
/* renamed from: hi.b */
/* loaded from: combined.jar:classes2.jar:hi/b.class */
public final class C5120b extends C5121c {

    /* renamed from: i */
    @NotNull
    public static final C5120b f29411i;

    /* renamed from: j */
    @NotNull
    public static final AbstractC4462b0 f29412j;

    static {
        int m24814d;
        C5120b c5120b = new C5120b();
        f29411i = c5120b;
        m24814d = C4884w.m24814d("kotlinx.coroutines.io.parallelism", C10240e.m42834b(64, C4882u.m24802a()), 0, 0, 12, null);
        f29412j = new ExecutorC5123e(c5120b, m24814d, "Dispatchers.IO", 1);
    }

    public C5120b() {
        super(0, 0, null, 7, null);
    }

    @NotNull
    /* renamed from: E0 */
    public final AbstractC4462b0 m25713E0() {
        return f29412j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
