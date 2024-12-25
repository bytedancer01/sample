package p411xi;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/c0.class
 */
/* renamed from: xi.c0 */
/* loaded from: combined.jar:classes2.jar:xi/c0.class */
public class C9758c0 {

    /* renamed from: a */
    public boolean f44505a;

    /* renamed from: b */
    public long f44506b;

    /* renamed from: c */
    public long f44507c;

    /* renamed from: e */
    public static final b f44504e = new b(null);

    /* renamed from: d */
    @NotNull
    public static final C9758c0 f44503d = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/c0$a.class
     */
    /* renamed from: xi.c0$a */
    /* loaded from: combined.jar:classes2.jar:xi/c0$a.class */
    public static final class a extends C9758c0 {
        @Override // p411xi.C9758c0
        @NotNull
        /* renamed from: d */
        public C9758c0 mo41089d(long j10) {
            return this;
        }

        @Override // p411xi.C9758c0
        /* renamed from: f */
        public void mo41091f() {
        }

        @Override // p411xi.C9758c0
        @NotNull
        /* renamed from: g */
        public C9758c0 mo41092g(long j10, @NotNull TimeUnit timeUnit) {
            C9367f.m39526e(timeUnit, "unit");
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/c0$b.class
     */
    /* renamed from: xi.c0$b */
    /* loaded from: combined.jar:classes2.jar:xi/c0$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }
    }

    @NotNull
    /* renamed from: a */
    public C9758c0 mo41086a() {
        this.f44505a = false;
        return this;
    }

    @NotNull
    /* renamed from: b */
    public C9758c0 mo41087b() {
        this.f44507c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo41088c() {
        if (this.f44505a) {
            return this.f44506b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @NotNull
    /* renamed from: d */
    public C9758c0 mo41089d(long j10) {
        this.f44505a = true;
        this.f44506b = j10;
        return this;
    }

    /* renamed from: e */
    public boolean mo41090e() {
        return this.f44505a;
    }

    /* renamed from: f */
    public void mo41091f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f44505a && this.f44506b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    /* renamed from: g */
    public C9758c0 mo41092g(long j10, @NotNull TimeUnit timeUnit) {
        C9367f.m39526e(timeUnit, "unit");
        if (j10 >= 0) {
            this.f44507c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    /* renamed from: h */
    public long mo41093h() {
        return this.f44507c;
    }
}
