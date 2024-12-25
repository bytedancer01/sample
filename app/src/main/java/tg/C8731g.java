package tg;

import com.amplifyframework.core.model.ModelIdentifier;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/g.class
 */
/* renamed from: tg.g */
/* loaded from: combined.jar:classes2.jar:tg/g.class */
public final class C8731g {

    /* renamed from: a */
    public final String f40606a;

    /* renamed from: b */
    public final String f40607b;

    public C8731g(String str, String str2) {
        this.f40606a = str;
        this.f40607b = str2;
    }

    /* renamed from: a */
    public String m37337a() {
        return this.f40607b;
    }

    /* renamed from: b */
    public String m37338b() {
        return this.f40606a;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof C8731g) {
            C8731g c8731g = (C8731g) obj;
            if (C9183h.m38686f(this.f40606a, c8731g.f40606a) && C9183h.m38686f(this.f40607b, c8731g.f40607b)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        String str = this.f40607b;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f40606a;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((899 + hashCode) * 31) + i10;
    }

    public String toString() {
        return this.f40606a + " realm=\"" + this.f40607b + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }
}
