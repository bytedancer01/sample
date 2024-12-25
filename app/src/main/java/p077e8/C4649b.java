package p077e8;

import ec.C4705h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/b.class
 */
/* renamed from: e8.b */
/* loaded from: combined.jar:classes2.jar:e8/b.class */
public final class C4649b {

    /* renamed from: a */
    public final String f27407a;

    /* renamed from: b */
    public final String f27408b;

    /* renamed from: c */
    public final int f27409c;

    /* renamed from: d */
    public final int f27410d;

    public C4649b(String str) {
        this(str, str, 1, 1);
    }

    public C4649b(String str, String str2, int i10, int i11) {
        this.f27407a = str;
        this.f27408b = str2;
        this.f27409c = i10;
        this.f27410d = i11;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4649b)) {
            return false;
        }
        C4649b c4649b = (C4649b) obj;
        if (this.f27409c != c4649b.f27409c || this.f27410d != c4649b.f27410d || !C4705h.m23655a(this.f27407a, c4649b.f27407a) || !C4705h.m23655a(this.f27408b, c4649b.f27408b)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return C4705h.m23656b(this.f27407a, this.f27408b, Integer.valueOf(this.f27409c), Integer.valueOf(this.f27410d));
    }
}
