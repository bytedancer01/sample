package p448zh;

import kh.AbstractC5629w;
import org.jetbrains.annotations.NotNull;
import p292qh.C7925c;
import p372vh.C9365d;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zh/a.class
 */
/* renamed from: zh.a */
/* loaded from: combined.jar:classes2.jar:zh/a.class */
public class C10236a implements Iterable<Integer>, InterfaceC9591a {

    /* renamed from: e */
    @NotNull
    public static final a f46832e = new a(null);

    /* renamed from: b */
    public final int f46833b;

    /* renamed from: c */
    public final int f46834c;

    /* renamed from: d */
    public final int f46835d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zh/a$a.class
     */
    /* renamed from: zh.a$a */
    /* loaded from: combined.jar:classes2.jar:zh/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C10236a m42828a(int i10, int i11, int i12) {
            return new C10236a(i10, i11, i12);
        }
    }

    public C10236a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f46833b = i10;
        this.f46834c = C7925c.m34328b(i10, i11, i12);
        this.f46835d = i12;
    }

    /* renamed from: d */
    public final int m42824d() {
        return this.f46833b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r3.f46835d == r0.f46835d) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof p448zh.C10236a
            if (r0 == 0) goto L45
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            zh.a r0 = (p448zh.C10236a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
        L18:
            r0 = r3
            int r0 = r0.f46833b
            r5 = r0
            r0 = r4
            zh.a r0 = (p448zh.C10236a) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.f46833b
            if (r0 != r1) goto L45
            r0 = r3
            int r0 = r0.f46834c
            r1 = r4
            int r1 = r1.f46834c
            if (r0 != r1) goto L45
            r0 = r3
            int r0 = r0.f46835d
            r1 = r4
            int r1 = r1.f46835d
            if (r0 != r1) goto L45
        L40:
            r0 = 1
            r6 = r0
            goto L47
        L45:
            r0 = 0
            r6 = r0
        L47:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p448zh.C10236a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int m42825f() {
        return this.f46834c;
    }

    /* renamed from: g */
    public final int m42826g() {
        return this.f46835d;
    }

    public int hashCode() {
        return isEmpty() ? -1 : (((this.f46833b * 31) + this.f46834c) * 31) + this.f46835d;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC5629w iterator() {
        return new C10237b(this.f46833b, this.f46834c, this.f46835d);
    }

    public boolean isEmpty() {
        boolean z10 = true;
        if (this.f46835d <= 0 ? this.f46833b >= this.f46834c : this.f46833b <= this.f46834c) {
            z10 = false;
        }
        return z10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f46835d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f46833b);
            sb2.append("..");
            sb2.append(this.f46834c);
            sb2.append(" step ");
            i10 = this.f46835d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f46833b);
            sb2.append(" downTo ");
            sb2.append(this.f46834c);
            sb2.append(" step ");
            i10 = -this.f46835d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
