package p312ri;

import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/m.class
 */
/* renamed from: ri.m */
/* loaded from: combined.jar:classes2.jar:ri/m.class */
public final class C8487m {

    /* renamed from: c */
    public static final a f39789c = new a(null);

    /* renamed from: a */
    public int f39790a;

    /* renamed from: b */
    public final int[] f39791b = new int[10];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/m$a.class
     */
    /* renamed from: ri.m$a */
    /* loaded from: combined.jar:classes2.jar:ri/m$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    /* renamed from: a */
    public final int m36606a(int i10) {
        return this.f39791b[i10];
    }

    /* renamed from: b */
    public final int m36607b() {
        return (this.f39790a & 2) != 0 ? this.f39791b[1] : -1;
    }

    /* renamed from: c */
    public final int m36608c() {
        return (this.f39790a & 128) != 0 ? this.f39791b[7] : 65535;
    }

    /* renamed from: d */
    public final int m36609d() {
        return (this.f39790a & 16) != 0 ? this.f39791b[4] : Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m36610e(int i10) {
        if ((this.f39790a & 32) != 0) {
            i10 = this.f39791b[5];
        }
        return i10;
    }

    /* renamed from: f */
    public final boolean m36611f(int i10) {
        boolean z10 = true;
        if (((1 << i10) & this.f39790a) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: g */
    public final void m36612g(@NotNull C8487m c8487m) {
        C9367f.m39526e(c8487m, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (c8487m.m36611f(i10)) {
                m36613h(i10, c8487m.m36606a(i10));
            }
        }
    }

    @NotNull
    /* renamed from: h */
    public final C8487m m36613h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f39791b;
            if (i10 < iArr.length) {
                this.f39790a = (1 << i10) | this.f39790a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m36614i() {
        return Integer.bitCount(this.f39790a);
    }
}
