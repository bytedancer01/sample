package p421y8;

import p059d9.C4401z0;
import p267p6.C7636y1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/p.class
 */
/* renamed from: y8.p */
/* loaded from: combined.jar:classes2.jar:y8/p.class */
public final class C9892p {

    /* renamed from: a */
    public final int f45509a;

    /* renamed from: b */
    public final C7636y1[] f45510b;

    /* renamed from: c */
    public final InterfaceC9884h[] f45511c;

    /* renamed from: d */
    public final Object f45512d;

    public C9892p(C7636y1[] c7636y1Arr, InterfaceC9884h[] interfaceC9884hArr, Object obj) {
        this.f45510b = c7636y1Arr;
        this.f45511c = (InterfaceC9884h[]) interfaceC9884hArr.clone();
        this.f45512d = obj;
        this.f45509a = c7636y1Arr.length;
    }

    /* renamed from: a */
    public boolean m41748a(C9892p c9892p) {
        if (c9892p == null || c9892p.f45511c.length != this.f45511c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f45511c.length; i10++) {
            if (!m41749b(c9892p, i10)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m41749b(C9892p c9892p, int i10) {
        if (c9892p == null) {
            return false;
        }
        boolean z10 = false;
        if (C4401z0.m22371c(this.f45510b[i10], c9892p.f45510b[i10])) {
            z10 = false;
            if (C4401z0.m22371c(this.f45511c[i10], c9892p.f45511c[i10])) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public boolean m41750c(int i10) {
        return this.f45510b[i10] != null;
    }
}
