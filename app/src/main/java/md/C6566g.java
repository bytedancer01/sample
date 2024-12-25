package md;

import java.math.BigDecimal;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/g.class
 */
/* renamed from: md.g */
/* loaded from: combined.jar:classes2.jar:md/g.class */
public final class C6566g extends Number {

    /* renamed from: b */
    public final String f34367b;

    public C6566g(String str) {
        this.f34367b = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f34367b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6566g)) {
            return false;
        }
        String str = this.f34367b;
        String str2 = ((C6566g) obj).f34367b;
        boolean z10 = true;
        if (str != str2) {
            z10 = str.equals(str2);
        }
        return z10;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f34367b);
    }

    public int hashCode() {
        return this.f34367b.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            return Integer.parseInt(this.f34367b);
        } catch (NumberFormatException e10) {
            try {
                return (int) Long.parseLong(this.f34367b);
            } catch (NumberFormatException e11) {
                return new BigDecimal(this.f34367b).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f34367b);
        } catch (NumberFormatException e10) {
            return new BigDecimal(this.f34367b).longValue();
        }
    }

    public String toString() {
        return this.f34367b;
    }
}
