package ni;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ni/a.class
 */
/* renamed from: ni.a */
/* loaded from: combined.jar:classes2.jar:ni/a.class */
public abstract class AbstractC6794a {

    /* renamed from: a */
    @Nullable
    public C6797d f35419a;

    /* renamed from: b */
    public long f35420b;

    /* renamed from: c */
    @NotNull
    public final String f35421c;

    /* renamed from: d */
    public final boolean f35422d;

    public AbstractC6794a(@NotNull String str, boolean z10) {
        C9367f.m39526e(str, "name");
        this.f35421c = str;
        this.f35422d = z10;
        this.f35420b = -1L;
    }

    public /* synthetic */ AbstractC6794a(String str, boolean z10, int i10, C9365d c9365d) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    /* renamed from: a */
    public final boolean m31310a() {
        return this.f35422d;
    }

    @NotNull
    /* renamed from: b */
    public final String m31311b() {
        return this.f35421c;
    }

    /* renamed from: c */
    public final long m31312c() {
        return this.f35420b;
    }

    @Nullable
    /* renamed from: d */
    public final C6797d m31313d() {
        return this.f35419a;
    }

    /* renamed from: e */
    public final void m31314e(@NotNull C6797d c6797d) {
        C9367f.m39526e(c6797d, "queue");
        C6797d c6797d2 = this.f35419a;
        if (c6797d2 == c6797d) {
            return;
        }
        if (!(c6797d2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f35419a = c6797d;
    }

    /* renamed from: f */
    public abstract long mo31315f();

    /* renamed from: g */
    public final void m31316g(long j10) {
        this.f35420b = j10;
    }

    @NotNull
    public String toString() {
        return this.f35421c;
    }
}
