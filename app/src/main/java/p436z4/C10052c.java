package p436z4;

import java.io.Serializable;
import p397x4.InterfaceC9661k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z4/c.class
 */
/* renamed from: z4.c */
/* loaded from: combined.jar:classes1.jar:z4/c.class */
public class C10052c implements InterfaceC9661k, Serializable {

    /* renamed from: b */
    public final String f46126b;

    public C10052c(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f46126b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f46126b.equals(((C10052c) obj).f46126b);
    }

    public final int hashCode() {
        return this.f46126b.hashCode();
    }

    public final String toString() {
        return this.f46126b;
    }
}
