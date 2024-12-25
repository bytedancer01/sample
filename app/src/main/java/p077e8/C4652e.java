package p077e8;

import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/e.class
 */
/* renamed from: e8.e */
/* loaded from: combined.jar:classes2.jar:e8/e.class */
public final class C4652e {

    /* renamed from: a */
    public final String f27436a;

    /* renamed from: b */
    public final String f27437b;

    /* renamed from: c */
    public final String f27438c;

    public C4652e(String str, String str2, String str3) {
        this.f27436a = str;
        this.f27437b = str2;
        this.f27438c = str3;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4652e.class != obj.getClass()) {
            return false;
        }
        C4652e c4652e = (C4652e) obj;
        if (!C4401z0.m22371c(this.f27436a, c4652e.f27436a) || !C4401z0.m22371c(this.f27437b, c4652e.f27437b) || !C4401z0.m22371c(this.f27438c, c4652e.f27438c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f27436a.hashCode();
        String str = this.f27437b;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f27438c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i10;
    }
}
