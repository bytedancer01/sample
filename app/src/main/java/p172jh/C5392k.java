package p172jh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jh/k.class
 */
/* renamed from: jh.k */
/* loaded from: combined.jar:classes2.jar:jh/k.class */
public final class C5392k<T> implements Serializable {

    /* renamed from: b */
    @NotNull
    public static final a f30764b = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jh/k$a.class
     */
    /* renamed from: jh.k$a */
    /* loaded from: combined.jar:classes2.jar:jh/k$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jh/k$b.class
     */
    /* renamed from: jh.k$b */
    /* loaded from: combined.jar:classes2.jar:jh/k$b.class */
    public static final class b implements Serializable {

        /* renamed from: b */
        @NotNull
        public final Throwable f30765b;

        public b(@NotNull Throwable th2) {
            C9367f.m39526e(th2, "exception");
            this.f30765b = th2;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && C9367f.m39522a(this.f30765b, ((b) obj).f30765b);
        }

        public int hashCode() {
            return this.f30765b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.f30765b + ')';
        }
    }

    @NotNull
    /* renamed from: a */
    public static <T> Object m26741a(@Nullable Object obj) {
        return obj;
    }

    @Nullable
    /* renamed from: b */
    public static final Throwable m26742b(Object obj) {
        return obj instanceof b ? ((b) obj).f30765b : null;
    }

    /* renamed from: c */
    public static final boolean m26743c(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: d */
    public static final boolean m26744d(Object obj) {
        return !(obj instanceof b);
    }
}
