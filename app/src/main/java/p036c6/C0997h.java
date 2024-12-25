package p036c6;

import java.util.Arrays;
import p437z5.C10054b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c6/h.class
 */
/* renamed from: c6.h */
/* loaded from: combined.jar:classes1.jar:c6/h.class */
public final class C0997h {

    /* renamed from: a */
    public final C10054b f6812a;

    /* renamed from: b */
    public final byte[] f6813b;

    public C0997h(C10054b c10054b, byte[] bArr) {
        if (c10054b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f6812a = c10054b;
        this.f6813b = bArr;
    }

    /* renamed from: a */
    public byte[] m5940a() {
        return this.f6813b;
    }

    /* renamed from: b */
    public C10054b m5941b() {
        return this.f6812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0997h)) {
            return false;
        }
        C0997h c0997h = (C0997h) obj;
        if (this.f6812a.equals(c0997h.f6812a)) {
            return Arrays.equals(this.f6813b, c0997h.f6813b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6812a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6813b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f6812a + ", bytes=[...]}";
    }
}
