package p228n7;

import p057d7.InterfaceC4325h;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;
import p228n7.InterfaceC6677i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/c0.class
 */
/* renamed from: n7.c0 */
/* loaded from: combined.jar:classes2.jar:n7/c0.class */
public final class C6665c0 implements InterfaceC6677i0 {

    /* renamed from: a */
    public final InterfaceC6663b0 f34726a;

    /* renamed from: b */
    public final C4361f0 f34727b = new C4361f0(32);

    /* renamed from: c */
    public int f34728c;

    /* renamed from: d */
    public int f34729d;

    /* renamed from: e */
    public boolean f34730e;

    /* renamed from: f */
    public boolean f34731f;

    public C6665c0(InterfaceC6663b0 interfaceC6663b0) {
        this.f34726a = interfaceC6663b0;
    }

    @Override // p228n7.InterfaceC6677i0
    /* renamed from: a */
    public void mo30685a(C4361f0 c4361f0, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int m21989e = z10 ? c4361f0.m21989e() + c4361f0.m21971D() : -1;
        if (this.f34731f) {
            if (!z10) {
                return;
            }
            this.f34731f = false;
            c4361f0.m21983P(m21989e);
            this.f34729d = 0;
        }
        while (c4361f0.m21985a() > 0) {
            int i11 = this.f34729d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int m21971D = c4361f0.m21971D();
                    c4361f0.m21983P(c4361f0.m21989e() - 1);
                    if (m21971D == 255) {
                        this.f34731f = true;
                        return;
                    }
                }
                int min = Math.min(c4361f0.m21985a(), 3 - this.f34729d);
                c4361f0.m21994j(this.f34727b.m21988d(), this.f34729d, min);
                int i12 = this.f34729d + min;
                this.f34729d = i12;
                if (i12 == 3) {
                    this.f34727b.m21983P(0);
                    this.f34727b.m21982O(3);
                    this.f34727b.m21984Q(1);
                    int m21971D2 = this.f34727b.m21971D();
                    int m21971D3 = this.f34727b.m21971D();
                    this.f34730e = (m21971D2 & 128) != 0;
                    this.f34728c = (((m21971D2 & 15) << 8) | m21971D3) + 3;
                    int m21986b = this.f34727b.m21986b();
                    int i13 = this.f34728c;
                    if (m21986b < i13) {
                        this.f34727b.m21987c(Math.min(4098, Math.max(i13, this.f34727b.m21986b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c4361f0.m21985a(), this.f34728c - this.f34729d);
                c4361f0.m21994j(this.f34727b.m21988d(), this.f34729d, min2);
                int i14 = this.f34729d + min2;
                this.f34729d = i14;
                int i15 = this.f34728c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f34730e) {
                        this.f34727b.m21982O(i15);
                    } else {
                        if (C4401z0.m22415v(this.f34727b.m21988d(), 0, this.f34728c, -1) != 0) {
                            this.f34731f = true;
                            return;
                        }
                        this.f34727b.m21982O(this.f34728c - 4);
                    }
                    this.f34727b.m21983P(0);
                    this.f34726a.mo30675a(this.f34727b);
                    this.f34729d = 0;
                }
            }
        }
    }

    @Override // p228n7.InterfaceC6677i0
    /* renamed from: b */
    public void mo30686b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        this.f34726a.mo30676b(c4389t0, interfaceC4325h, dVar);
        this.f34731f = true;
    }

    @Override // p228n7.InterfaceC6677i0
    /* renamed from: c */
    public void mo30687c() {
        this.f34731f = true;
    }
}
