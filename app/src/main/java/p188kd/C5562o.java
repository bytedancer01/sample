package p188kd;

import md.C6560a;
import md.C6566g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/o.class
 */
/* renamed from: kd.o */
/* loaded from: combined.jar:classes2.jar:kd/o.class */
public final class C5562o extends AbstractC5557j {

    /* renamed from: b */
    public final Object f31650b;

    public C5562o(Boolean bool) {
        this.f31650b = C6560a.m30268b(bool);
    }

    public C5562o(Number number) {
        this.f31650b = C6560a.m30268b(number);
    }

    public C5562o(String str) {
        this.f31650b = C6560a.m30268b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r0 instanceof java.lang.Byte) != false) goto L14;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m27587F(p188kd.C5562o r2) {
        /*
            r0 = r2
            java.lang.Object r0 = r0.f31650b
            r2 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Number
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r5
            if (r0 == 0) goto L3e
            r0 = r2
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 != 0) goto L3c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Long
            if (r0 != 0) goto L3c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 != 0) goto L3c
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Short
            if (r0 != 0) goto L3c
            r0 = r4
            r3 = r0
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Byte
            if (r0 == 0) goto L3e
        L3c:
            r0 = 1
            r3 = r0
        L3e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p188kd.C5562o.m27587F(kd.o):boolean");
    }

    /* renamed from: A */
    public int m27588A() {
        return m27592G() ? m27590D().intValue() : Integer.parseInt(mo27575i());
    }

    /* renamed from: B */
    public long m27589B() {
        return m27592G() ? m27590D().longValue() : Long.parseLong(mo27575i());
    }

    /* renamed from: D */
    public Number m27590D() {
        Object obj = this.f31650b;
        return obj instanceof String ? new C6566g((String) obj) : (Number) obj;
    }

    /* renamed from: E */
    public boolean m27591E() {
        return this.f31650b instanceof Boolean;
    }

    /* renamed from: G */
    public boolean m27592G() {
        return this.f31650b instanceof Number;
    }

    /* renamed from: H */
    public boolean m27593H() {
        return this.f31650b instanceof String;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5562o.class != obj.getClass()) {
            return false;
        }
        C5562o c5562o = (C5562o) obj;
        if (this.f31650b == null) {
            if (c5562o.f31650b != null) {
                z10 = false;
            }
            return z10;
        }
        if (m27587F(this) && m27587F(c5562o)) {
            return m27590D().longValue() == c5562o.m27590D().longValue();
        }
        Object obj2 = this.f31650b;
        if (!(obj2 instanceof Number) || !(c5562o.f31650b instanceof Number)) {
            return obj2.equals(c5562o.f31650b);
        }
        double doubleValue = m27590D().doubleValue();
        double doubleValue2 = c5562o.m27590D().doubleValue();
        boolean z11 = true;
        if (doubleValue != doubleValue2) {
            z11 = Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return z11;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f31650b == null) {
            return 31;
        }
        if (m27587F(this)) {
            doubleToLongBits = m27590D().longValue();
        } else {
            Object obj = this.f31650b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m27590D().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // p188kd.AbstractC5557j
    /* renamed from: i */
    public String mo27575i() {
        return m27592G() ? m27590D().toString() : m27591E() ? ((Boolean) this.f31650b).toString() : (String) this.f31650b;
    }

    /* renamed from: x */
    public boolean m27594x() {
        return m27591E() ? ((Boolean) this.f31650b).booleanValue() : Boolean.parseBoolean(mo27575i());
    }

    /* renamed from: y */
    public double m27595y() {
        return m27592G() ? m27590D().doubleValue() : Double.parseDouble(mo27575i());
    }
}
