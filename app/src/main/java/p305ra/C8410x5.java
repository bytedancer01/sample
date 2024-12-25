package p305ra;

import org.jsoup.parser.CharacterReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x5.class
 */
/* renamed from: ra.x5 */
/* loaded from: combined.jar:classes2.jar:ra/x5.class */
public final class C8410x5 {

    /* renamed from: a */
    public final Object f39383a;

    /* renamed from: b */
    public final int f39384b;

    public C8410x5(Object obj, int i10) {
        this.f39383a = obj;
        this.f39384b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8410x5)) {
            return false;
        }
        C8410x5 c8410x5 = (C8410x5) obj;
        return this.f39383a == c8410x5.f39383a && this.f39384b == c8410x5.f39384b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f39383a) * CharacterReader.EOF) + this.f39384b;
    }
}
