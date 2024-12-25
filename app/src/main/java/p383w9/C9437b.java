package p383w9;

import com.google.android.gms.common.api.C2414a;
import com.google.android.gms.common.api.C2414a.d;
import p422y9.C9932n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/b.class
 */
/* renamed from: w9.b */
/* loaded from: combined.jar:classes2.jar:w9/b.class */
public final class C9437b<O extends C2414a.d> {

    /* renamed from: a */
    public final int f43206a;

    /* renamed from: b */
    public final C2414a<O> f43207b;

    /* renamed from: c */
    public final O f43208c;

    /* renamed from: d */
    public final String f43209d;

    public C9437b(C2414a<O> c2414a, O o10, String str) {
        this.f43207b = c2414a;
        this.f43208c = o10;
        this.f43209d = str;
        this.f43206a = C9932n.m41833c(c2414a, o10, str);
    }

    /* renamed from: a */
    public static <O extends C2414a.d> C9437b<O> m39799a(C2414a<O> c2414a, O o10, String str) {
        return new C9437b<>(c2414a, o10, str);
    }

    /* renamed from: b */
    public final String m39800b() {
        return this.f43207b.m13131d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9437b)) {
            return false;
        }
        C9437b c9437b = (C9437b) obj;
        return C9932n.m41832b(this.f43207b, c9437b.f43207b) && C9932n.m41832b(this.f43208c, c9437b.f43208c) && C9932n.m41832b(this.f43209d, c9437b.f43209d);
    }

    public final int hashCode() {
        return this.f43206a;
    }
}
