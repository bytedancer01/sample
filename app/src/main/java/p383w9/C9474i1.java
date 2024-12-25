package p383w9;

import p350u9.C8808d;
import p422y9.C9932n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/i1.class
 */
/* renamed from: w9.i1 */
/* loaded from: combined.jar:classes2.jar:w9/i1.class */
public final class C9474i1 {

    /* renamed from: a */
    public final C9437b<?> f43296a;

    /* renamed from: b */
    public final C8808d f43297b;

    public /* synthetic */ C9474i1(C9437b c9437b, C8808d c8808d, C9469h1 c9469h1) {
        this.f43296a = c9437b;
        this.f43297b = c8808d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C9474i1)) {
            return false;
        }
        C9474i1 c9474i1 = (C9474i1) obj;
        return C9932n.m41832b(this.f43296a, c9474i1.f43296a) && C9932n.m41832b(this.f43297b, c9474i1.f43297b);
    }

    public final int hashCode() {
        return C9932n.m41833c(this.f43296a, this.f43297b);
    }

    public final String toString() {
        return C9932n.m41834d(this).m41835a("key", this.f43296a).m41835a("feature", this.f43297b).toString();
    }
}
