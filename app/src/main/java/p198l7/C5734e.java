package p198l7;

import java.util.Arrays;
import p057d7.C4326i;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/e.class
 */
/* renamed from: l7.e */
/* loaded from: combined.jar:classes2.jar:l7/e.class */
public final class C5734e {

    /* renamed from: a */
    public final C5735f f32120a = new C5735f();

    /* renamed from: b */
    public final C4361f0 f32121b = new C4361f0(new byte[65025], 0);

    /* renamed from: c */
    public int f32122c = -1;

    /* renamed from: d */
    public int f32123d;

    /* renamed from: e */
    public boolean f32124e;

    /* renamed from: a */
    public final int m28105a(int i10) {
        int i11;
        int i12;
        int i13 = 0;
        this.f32123d = 0;
        do {
            int i14 = this.f32123d;
            C5735f c5735f = this.f32120a;
            i11 = i13;
            if (i10 + i14 >= c5735f.f32131g) {
                break;
            }
            int[] iArr = c5735f.f32134j;
            this.f32123d = i14 + 1;
            i12 = iArr[i14 + i10];
            i11 = i13 + i12;
            i13 = i11;
        } while (i12 == 255);
        return i11;
    }

    /* renamed from: b */
    public C5735f m28106b() {
        return this.f32120a;
    }

    /* renamed from: c */
    public C4361f0 m28107c() {
        return this.f32121b;
    }

    /* renamed from: d */
    public boolean m28108d(InterfaceC4324g interfaceC4324g) {
        int i10;
        C4349a.m21884g(interfaceC4324g != null);
        if (this.f32124e) {
            this.f32124e = false;
            this.f32121b.m21979L(0);
        }
        while (!this.f32124e) {
            if (this.f32122c < 0) {
                if (!this.f32120a.m28113c(interfaceC4324g) || !this.f32120a.m28111a(interfaceC4324g, true)) {
                    return false;
                }
                C5735f c5735f = this.f32120a;
                int i11 = c5735f.f32132h;
                if ((c5735f.f32126b & 1) == 1 && this.f32121b.m21990f() == 0) {
                    i11 += m28105a(0);
                    i10 = this.f32123d + 0;
                } else {
                    i10 = 0;
                }
                if (!C4326i.m21823e(interfaceC4324g, i11)) {
                    return false;
                }
                this.f32122c = i10;
            }
            int m28105a = m28105a(this.f32122c);
            int i12 = this.f32122c + this.f32123d;
            if (m28105a > 0) {
                C4361f0 c4361f0 = this.f32121b;
                c4361f0.m21987c(c4361f0.m21990f() + m28105a);
                if (!C4326i.m21822d(interfaceC4324g, this.f32121b.m21988d(), this.f32121b.m21990f(), m28105a)) {
                    return false;
                }
                C4361f0 c4361f02 = this.f32121b;
                c4361f02.m21982O(c4361f02.m21990f() + m28105a);
                this.f32124e = this.f32120a.f32134j[i12 - 1] != 255;
            }
            int i13 = i12;
            if (i12 == this.f32120a.f32131g) {
                i13 = -1;
            }
            this.f32122c = i13;
        }
        return true;
    }

    /* renamed from: e */
    public void m28109e() {
        this.f32120a.m28112b();
        this.f32121b.m21979L(0);
        this.f32122c = -1;
        this.f32124e = false;
    }

    /* renamed from: f */
    public void m28110f() {
        if (this.f32121b.m21988d().length == 65025) {
            return;
        }
        C4361f0 c4361f0 = this.f32121b;
        c4361f0.m21981N(Arrays.copyOf(c4361f0.m21988d(), Math.max(65025, this.f32121b.m21990f())), this.f32121b.m21990f());
    }
}
