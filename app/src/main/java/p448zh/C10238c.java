package p448zh;

import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zh/c.class
 */
/* renamed from: zh.c */
/* loaded from: combined.jar:classes2.jar:zh/c.class */
public final class C10238c extends C10236a {

    /* renamed from: f */
    @NotNull
    public static final a f46840f = new a(null);

    /* renamed from: g */
    @NotNull
    public static final C10238c f46841g = new C10238c(1, 0);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zh/c$a.class
     */
    /* renamed from: zh.c$a */
    /* loaded from: combined.jar:classes2.jar:zh/c$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C10238c m42832a() {
            return C10238c.f46841g;
        }
    }

    public C10238c(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (m42825f() == r0.m42825f()) goto L12;
     */
    @Override // p448zh.C10236a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof p448zh.C10238c
            if (r0 == 0) goto L3a
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            zh.c r0 = (p448zh.C10238c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
        L18:
            r0 = r3
            int r0 = r0.m42824d()
            r5 = r0
            r0 = r4
            zh.c r0 = (p448zh.C10238c) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.m42824d()
            if (r0 != r1) goto L3a
            r0 = r3
            int r0 = r0.m42825f()
            r1 = r4
            int r1 = r1.m42825f()
            if (r0 != r1) goto L3a
        L35:
            r0 = 1
            r6 = r0
            goto L3c
        L3a:
            r0 = 0
            r6 = r0
        L3c:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p448zh.C10238c.equals(java.lang.Object):boolean");
    }

    @Override // p448zh.C10236a
    public int hashCode() {
        return isEmpty() ? -1 : (m42824d() * 31) + m42825f();
    }

    @Override // p448zh.C10236a
    public boolean isEmpty() {
        return m42824d() > m42825f();
    }

    @NotNull
    /* renamed from: t */
    public Integer m42830t() {
        return Integer.valueOf(m42825f());
    }

    @Override // p448zh.C10236a
    @NotNull
    public String toString() {
        return m42824d() + ".." + m42825f();
    }

    @NotNull
    /* renamed from: v */
    public Integer m42831v() {
        return Integer.valueOf(m42824d());
    }
}
