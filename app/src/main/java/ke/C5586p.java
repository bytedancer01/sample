package ke;

import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/p.class
 */
/* renamed from: ke.p */
/* loaded from: combined.jar:classes2.jar:ke/p.class */
public final class C5586p extends AbstractC5587q {

    /* renamed from: b */
    public final int f31664b;

    /* renamed from: c */
    public final int f31665c;

    public C5586p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw C8691f.m37197a();
        }
        this.f31664b = i11;
        this.f31665c = i12;
    }

    /* renamed from: b */
    public int m27625b() {
        return this.f31664b;
    }

    /* renamed from: c */
    public int m27626c() {
        return this.f31665c;
    }

    /* renamed from: d */
    public boolean m27627d() {
        return this.f31664b == 10;
    }

    /* renamed from: e */
    public boolean m27628e() {
        return this.f31665c == 10;
    }
}
