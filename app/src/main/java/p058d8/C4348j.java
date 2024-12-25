package p058d8;

import p009a8.InterfaceC0120s0;
import p059d9.C4401z0;
import p077e8.C4653f;
import p267p6.C7629w0;
import p267p6.C7632x0;
import p321s7.C8544c;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d8/j.class
 */
/* renamed from: d8.j */
/* loaded from: combined.jar:classes2.jar:d8/j.class */
public final class C4348j implements InterfaceC0120s0 {

    /* renamed from: b */
    public final C7629w0 f26512b;

    /* renamed from: d */
    public long[] f26514d;

    /* renamed from: e */
    public boolean f26515e;

    /* renamed from: f */
    public C4653f f26516f;

    /* renamed from: g */
    public boolean f26517g;

    /* renamed from: h */
    public int f26518h;

    /* renamed from: c */
    public final C8544c f26513c = new C8544c();

    /* renamed from: i */
    public long f26519i = -9223372036854775807L;

    public C4348j(C4653f c4653f, C7629w0 c7629w0, boolean z10) {
        this.f26512b = c7629w0;
        this.f26516f = c4653f;
        this.f26514d = c4653f.f27440b;
        m21877d(c4653f, z10);
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: a */
    public void mo354a() {
    }

    /* renamed from: b */
    public String m21875b() {
        return this.f26516f.m23370a();
    }

    /* renamed from: c */
    public void m21876c(long j10) {
        boolean z10 = true;
        int m22377e = C4401z0.m22377e(this.f26514d, j10, true, false);
        this.f26518h = m22377e;
        if (!this.f26515e || m22377e != this.f26514d.length) {
            z10 = false;
        }
        if (!z10) {
            j10 = -9223372036854775807L;
        }
        this.f26519i = j10;
    }

    /* renamed from: d */
    public void m21877d(C4653f c4653f, boolean z10) {
        int i10 = this.f26518h;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f26514d[i10 - 1];
        this.f26515e = z10;
        this.f26516f = c4653f;
        long[] jArr = c4653f.f27440b;
        this.f26514d = jArr;
        long j11 = this.f26519i;
        if (j11 != -9223372036854775807L) {
            m21876c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f26518h = C4401z0.m22377e(jArr, j10, false, false);
        }
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: e */
    public boolean mo356e() {
        return true;
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: p */
    public int mo357p(C7632x0 c7632x0, C8638f c8638f, int i10) {
        int i11 = this.f26518h;
        boolean z10 = i11 == this.f26514d.length;
        if (z10 && !this.f26515e) {
            c8638f.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f26517g) {
            c7632x0.f37132b = this.f26512b;
            this.f26517g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        this.f26518h = i11 + 1;
        byte[] m36773a = this.f26513c.m36773a(this.f26516f.f27439a[i11]);
        c8638f.m37081f(m36773a.length);
        c8638f.f40327c.put(m36773a);
        c8638f.f40329e = this.f26514d[i11];
        c8638f.setFlags(1);
        return -4;
    }

    @Override // p009a8.InterfaceC0120s0
    /* renamed from: t */
    public int mo358t(long j10) {
        int max = Math.max(this.f26518h, C4401z0.m22377e(this.f26514d, j10, true, false));
        int i10 = this.f26518h;
        this.f26518h = max;
        return max - i10;
    }
}
