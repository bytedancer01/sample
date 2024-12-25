package p421y8;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p009a8.C0134z0;
import p038c8.AbstractC1020f;
import p038c8.AbstractC1028n;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/c.class
 */
/* renamed from: y8.c */
/* loaded from: combined.jar:classes2.jar:y8/c.class */
public abstract class AbstractC9879c implements InterfaceC9884h {

    /* renamed from: a */
    public final C0134z0 f45369a;

    /* renamed from: b */
    public final int f45370b;

    /* renamed from: c */
    public final int[] f45371c;

    /* renamed from: d */
    public final int f45372d;

    /* renamed from: e */
    public final C7629w0[] f45373e;

    /* renamed from: f */
    public final long[] f45374f;

    /* renamed from: g */
    public int f45375g;

    public AbstractC9879c(C0134z0 c0134z0, int... iArr) {
        this(c0134z0, iArr, 0);
    }

    public AbstractC9879c(C0134z0 c0134z0, int[] iArr, int i10) {
        C4349a.m21884g(iArr.length > 0);
        this.f45372d = i10;
        this.f45369a = (C0134z0) C4349a.m21882e(c0134z0);
        int length = iArr.length;
        this.f45370b = length;
        this.f45373e = new C7629w0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f45373e[i11] = c0134z0.m663b(iArr[i11]);
        }
        Arrays.sort(this.f45373e, new Comparator() { // from class: y8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m41603u;
                m41603u = AbstractC9879c.m41603u((C7629w0) obj, (C7629w0) obj2);
                return m41603u;
            }
        });
        this.f45371c = new int[this.f45370b];
        int i12 = 0;
        while (true) {
            int i13 = this.f45370b;
            if (i12 >= i13) {
                this.f45374f = new long[i13];
                return;
            } else {
                this.f45371c[i12] = c0134z0.m664c(this.f45373e[i12]);
                i12++;
            }
        }
    }

    /* renamed from: u */
    public static /* synthetic */ int m41603u(C7629w0 c7629w0, C7629w0 c7629w02) {
        return c7629w02.f37082i - c7629w0.f37082i;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: b */
    public boolean mo41604b(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo41605c = mo41605c(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f45370b && !mo41605c) {
            mo41605c = (i11 == i10 || mo41605c(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!mo41605c) {
            return false;
        }
        long[] jArr = this.f45374f;
        jArr[i10] = Math.max(jArr[i10], C4401z0.m22368b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: c */
    public boolean mo41605c(int i10, long j10) {
        return this.f45374f[i10] > j10;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: d */
    public /* synthetic */ boolean mo41606d(long j10, AbstractC1020f abstractC1020f, List list) {
        return C9883g.m41699d(this, j10, abstractC1020f, list);
    }

    @Override // p421y8.InterfaceC9884h
    public void disable() {
    }

    @Override // p421y8.InterfaceC9887k
    /* renamed from: e */
    public final C7629w0 mo41607e(int i10) {
        return this.f45373e[i10];
    }

    @Override // p421y8.InterfaceC9884h
    public void enable() {
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC9879c abstractC9879c = (AbstractC9879c) obj;
        if (this.f45369a != abstractC9879c.f45369a || !Arrays.equals(this.f45371c, abstractC9879c.f45371c)) {
            z10 = false;
        }
        return z10;
    }

    @Override // p421y8.InterfaceC9887k
    /* renamed from: f */
    public final int mo41608f(int i10) {
        return this.f45371c[i10];
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: g */
    public void mo41597g(float f10) {
    }

    public int hashCode() {
        if (this.f45375g == 0) {
            this.f45375g = (System.identityHashCode(this.f45369a) * 31) + Arrays.hashCode(this.f45371c);
        }
        return this.f45375g;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: i */
    public /* synthetic */ void mo41609i() {
        C9883g.m41696a(this);
    }

    @Override // p421y8.InterfaceC9887k
    /* renamed from: j */
    public final int mo41610j(C7629w0 c7629w0) {
        for (int i10 = 0; i10 < this.f45370b; i10++) {
            if (this.f45373e[i10] == c7629w0) {
                return i10;
            }
        }
        return -1;
    }

    @Override // p421y8.InterfaceC9887k
    /* renamed from: k */
    public final int mo41611k(int i10) {
        for (int i11 = 0; i11 < this.f45370b; i11++) {
            if (this.f45371c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // p421y8.InterfaceC9887k
    /* renamed from: l */
    public final C0134z0 mo41612l() {
        return this.f45369a;
    }

    @Override // p421y8.InterfaceC9887k
    public final int length() {
        return this.f45371c.length;
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: m */
    public /* synthetic */ void mo41613m(boolean z10) {
        C9883g.m41697b(this, z10);
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: o */
    public int mo41598o(long j10, List<? extends AbstractC1028n> list) {
        return list.size();
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: p */
    public final int mo41614p() {
        return this.f45371c[mo25051a()];
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: q */
    public final C7629w0 mo41615q() {
        return this.f45373e[mo25051a()];
    }

    @Override // p421y8.InterfaceC9884h
    /* renamed from: s */
    public /* synthetic */ void mo41616s() {
        C9883g.m41698c(this);
    }
}
