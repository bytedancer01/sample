package p172jh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jh/e.class
 */
/* renamed from: jh.e */
/* loaded from: combined.jar:classes2.jar:jh/e.class */
public final class C5386e implements Comparable<C5386e> {

    /* renamed from: f */
    @NotNull
    public static final a f30755f = new a(null);

    /* renamed from: g */
    @NotNull
    public static final C5386e f30756g = C5387f.m26735a();

    /* renamed from: b */
    public final int f30757b;

    /* renamed from: c */
    public final int f30758c;

    /* renamed from: d */
    public final int f30759d;

    /* renamed from: e */
    public final int f30760e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:jh/e$a.class
     */
    /* renamed from: jh.e$a */
    /* loaded from: combined.jar:classes2.jar:jh/e$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C5386e(int i10, int i11, int i12) {
        this.f30757b = i10;
        this.f30758c = i11;
        this.f30759d = i12;
        this.f30760e = m26734b(i10, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C5386e c5386e) {
        C9367f.m39526e(c5386e, "other");
        return this.f30760e - c5386e.f30760e;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m26734b(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 1
            r9 = r0
            r0 = r5
            if (r0 < 0) goto L14
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L14
            r0 = 1
            r8 = r0
            goto L17
        L14:
            r0 = 0
            r8 = r0
        L17:
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r6
            if (r0 < 0) goto L2d
            r0 = r6
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L2d
            r0 = 1
            r8 = r0
            goto L30
        L2d:
            r0 = 0
            r8 = r0
        L30:
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r7
            if (r0 < 0) goto L46
            r0 = r7
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L46
            r0 = 1
            r8 = r0
            goto L49
        L46:
            r0 = 0
            r8 = r0
        L49:
            r0 = r8
            if (r0 == 0) goto L55
            r0 = r9
            r8 = r0
            goto L58
        L55:
            r0 = 0
            r8 = r0
        L58:
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r5
            r1 = 16
            int r0 = r0 << r1
            r1 = r6
            r2 = 8
            int r1 = r1 << r2
            int r0 = r0 + r1
            r1 = r7
            int r0 = r0 + r1
            return r0
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "Version components are out of range: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p172jh.C5386e.m26734b(int, int, int):int");
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        C5386e c5386e = obj instanceof C5386e ? (C5386e) obj : null;
        if (c5386e == null) {
            return false;
        }
        if (this.f30760e != c5386e.f30760e) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.f30760e;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30757b);
        sb2.append('.');
        sb2.append(this.f30758c);
        sb2.append('.');
        sb2.append(this.f30759d);
        return sb2.toString();
    }
}
