package p232nd;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p188kd.AbstractC5557j;
import p188kd.C5554g;
import p188kd.C5559l;
import p188kd.C5560m;
import p188kd.C5562o;
import sd.C8555a;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/f.class
 */
/* renamed from: nd.f */
/* loaded from: combined.jar:classes2.jar:nd/f.class */
public final class C6770f extends C8555a {

    /* renamed from: u */
    public static final Reader f35256u = new a();

    /* renamed from: v */
    public static final Object f35257v = new Object();

    /* renamed from: q */
    public Object[] f35258q;

    /* renamed from: r */
    public int f35259r;

    /* renamed from: s */
    public String[] f35260s;

    /* renamed from: t */
    public int[] f35261t;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/f$a.class
     */
    /* renamed from: nd.f$a */
    /* loaded from: combined.jar:classes2.jar:nd/f$a.class */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    /* renamed from: q0 */
    private String m31098q0() {
        return " at path " + getPath();
    }

    @Override // sd.C8555a
    /* renamed from: A0 */
    public double mo31099A0() {
        EnumC8556b mo31105J0 = mo31105J0();
        EnumC8556b enumC8556b = EnumC8556b.NUMBER;
        if (mo31105J0 != enumC8556b && mo31105J0 != EnumC8556b.STRING) {
            throw new IllegalStateException("Expected " + enumC8556b + " but was " + mo31105J0 + m31098q0());
        }
        double m27595y = ((C5562o) m31109X0()).m27595y();
        if (!m36786B() && (Double.isNaN(m27595y) || Double.isInfinite(m27595y))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m27595y);
        }
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m27595y;
    }

    @Override // sd.C8555a
    /* renamed from: B0 */
    public int mo31100B0() {
        EnumC8556b mo31105J0 = mo31105J0();
        EnumC8556b enumC8556b = EnumC8556b.NUMBER;
        if (mo31105J0 != enumC8556b && mo31105J0 != EnumC8556b.STRING) {
            throw new IllegalStateException("Expected " + enumC8556b + " but was " + mo31105J0 + m31098q0());
        }
        int m27588A = ((C5562o) m31109X0()).m27588A();
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m27588A;
    }

    @Override // sd.C8555a
    /* renamed from: C0 */
    public long mo31101C0() {
        EnumC8556b mo31105J0 = mo31105J0();
        EnumC8556b enumC8556b = EnumC8556b.NUMBER;
        if (mo31105J0 != enumC8556b && mo31105J0 != EnumC8556b.STRING) {
            throw new IllegalStateException("Expected " + enumC8556b + " but was " + mo31105J0 + m31098q0());
        }
        long m27589B = ((C5562o) m31109X0()).m27589B();
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m27589B;
    }

    @Override // sd.C8555a
    /* renamed from: D0 */
    public String mo31102D0() {
        m31107V0(EnumC8556b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m31109X0()).next();
        String str = (String) entry.getKey();
        this.f35260s[this.f35259r - 1] = str;
        m31112a1(entry.getValue());
        return str;
    }

    @Override // sd.C8555a
    /* renamed from: F0 */
    public void mo31103F0() {
        m31107V0(EnumC8556b.NULL);
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // sd.C8555a
    /* renamed from: H0 */
    public String mo31104H0() {
        EnumC8556b mo31105J0 = mo31105J0();
        EnumC8556b enumC8556b = EnumC8556b.STRING;
        if (mo31105J0 == enumC8556b || mo31105J0 == EnumC8556b.NUMBER) {
            String mo27575i = ((C5562o) m31110Y0()).mo27575i();
            int i10 = this.f35259r;
            if (i10 > 0) {
                int[] iArr = this.f35261t;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return mo27575i;
        }
        throw new IllegalStateException("Expected " + enumC8556b + " but was " + mo31105J0 + m31098q0());
    }

    @Override // sd.C8555a
    /* renamed from: J0 */
    public EnumC8556b mo31105J0() {
        if (this.f35259r == 0) {
            return EnumC8556b.END_DOCUMENT;
        }
        Object m31109X0 = m31109X0();
        if (m31109X0 instanceof Iterator) {
            boolean z10 = this.f35258q[this.f35259r - 2] instanceof C5560m;
            Iterator it = (Iterator) m31109X0;
            if (!it.hasNext()) {
                return z10 ? EnumC8556b.END_OBJECT : EnumC8556b.END_ARRAY;
            }
            if (z10) {
                return EnumC8556b.NAME;
            }
            m31112a1(it.next());
            return mo31105J0();
        }
        if (m31109X0 instanceof C5560m) {
            return EnumC8556b.BEGIN_OBJECT;
        }
        if (m31109X0 instanceof C5554g) {
            return EnumC8556b.BEGIN_ARRAY;
        }
        if (!(m31109X0 instanceof C5562o)) {
            if (m31109X0 instanceof C5559l) {
                return EnumC8556b.NULL;
            }
            if (m31109X0 == f35257v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        C5562o c5562o = (C5562o) m31109X0;
        if (c5562o.m27593H()) {
            return EnumC8556b.STRING;
        }
        if (c5562o.m27591E()) {
            return EnumC8556b.BOOLEAN;
        }
        if (c5562o.m27592G()) {
            return EnumC8556b.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // sd.C8555a
    /* renamed from: T0 */
    public void mo31106T0() {
        if (mo31105J0() == EnumC8556b.NAME) {
            mo31102D0();
            this.f35260s[this.f35259r - 2] = "null";
        } else {
            m31110Y0();
            int i10 = this.f35259r;
            if (i10 > 0) {
                this.f35260s[i10 - 1] = "null";
            }
        }
        int i11 = this.f35259r;
        if (i11 > 0) {
            int[] iArr = this.f35261t;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    /* renamed from: V0 */
    public final void m31107V0(EnumC8556b enumC8556b) {
        if (mo31105J0() == enumC8556b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC8556b + " but was " + mo31105J0() + m31098q0());
    }

    /* renamed from: W0 */
    public AbstractC5557j m31108W0() {
        EnumC8556b mo31105J0 = mo31105J0();
        if (mo31105J0 != EnumC8556b.NAME && mo31105J0 != EnumC8556b.END_ARRAY && mo31105J0 != EnumC8556b.END_OBJECT && mo31105J0 != EnumC8556b.END_DOCUMENT) {
            AbstractC5557j abstractC5557j = (AbstractC5557j) m31109X0();
            mo31106T0();
            return abstractC5557j;
        }
        throw new IllegalStateException("Unexpected " + mo31105J0 + " when reading a JsonElement.");
    }

    /* renamed from: X0 */
    public final Object m31109X0() {
        return this.f35258q[this.f35259r - 1];
    }

    /* renamed from: Y0 */
    public final Object m31110Y0() {
        Object[] objArr = this.f35258q;
        int i10 = this.f35259r - 1;
        this.f35259r = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* renamed from: Z0 */
    public void m31111Z0() {
        m31107V0(EnumC8556b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m31109X0()).next();
        m31112a1(entry.getValue());
        m31112a1(new C5562o((String) entry.getKey()));
    }

    /* renamed from: a1 */
    public final void m31112a1(Object obj) {
        int i10 = this.f35259r;
        Object[] objArr = this.f35258q;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f35258q = Arrays.copyOf(objArr, i11);
            this.f35261t = Arrays.copyOf(this.f35261t, i11);
            this.f35260s = (String[]) Arrays.copyOf(this.f35260s, i11);
        }
        Object[] objArr2 = this.f35258q;
        int i12 = this.f35259r;
        this.f35259r = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override // sd.C8555a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35258q = new Object[]{f35257v};
        this.f35259r = 1;
    }

    @Override // sd.C8555a
    /* renamed from: f */
    public void mo31113f() {
        m31107V0(EnumC8556b.BEGIN_ARRAY);
        m31112a1(((C5554g) m31109X0()).iterator());
        this.f35261t[this.f35259r - 1] = 0;
    }

    @Override // sd.C8555a
    public String getPath() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = 0;
        while (true) {
            int i12 = i11;
            int i13 = this.f35259r;
            if (i12 >= i13) {
                return sb2.toString();
            }
            Object[] objArr = this.f35258q;
            Object obj = objArr[i12];
            if (obj instanceof C5554g) {
                int i14 = i12 + 1;
                i10 = i14;
                if (i14 < i13) {
                    i10 = i14;
                    if (objArr[i14] instanceof Iterator) {
                        sb2.append('[');
                        sb2.append(this.f35261t[i14]);
                        sb2.append(']');
                        i10 = i14;
                    }
                }
            } else {
                i10 = i12;
                if (obj instanceof C5560m) {
                    int i15 = i12 + 1;
                    i10 = i15;
                    if (i15 < i13) {
                        i10 = i15;
                        if (objArr[i15] instanceof Iterator) {
                            sb2.append('.');
                            String str = this.f35260s[i15];
                            i10 = i15;
                            if (str != null) {
                                sb2.append(str);
                                i10 = i15;
                            }
                        }
                    }
                }
            }
            i11 = i10 + 1;
        }
    }

    @Override // sd.C8555a
    /* renamed from: l */
    public void mo31114l() {
        m31107V0(EnumC8556b.BEGIN_OBJECT);
        m31112a1(((C5560m) m31109X0()).m27584A().iterator());
    }

    @Override // sd.C8555a
    /* renamed from: t */
    public void mo31115t() {
        m31107V0(EnumC8556b.END_ARRAY);
        m31110Y0();
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // sd.C8555a
    public String toString() {
        return C6770f.class.getSimpleName() + m31098q0();
    }

    @Override // sd.C8555a
    /* renamed from: v */
    public void mo31116v() {
        m31107V0(EnumC8556b.END_OBJECT);
        m31110Y0();
        m31110Y0();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // sd.C8555a
    /* renamed from: v0 */
    public boolean mo31117v0() {
        m31107V0(EnumC8556b.BOOLEAN);
        boolean m27594x = ((C5562o) m31110Y0()).m27594x();
        int i10 = this.f35259r;
        if (i10 > 0) {
            int[] iArr = this.f35261t;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return m27594x;
    }

    @Override // sd.C8555a
    /* renamed from: y */
    public boolean mo31118y() {
        EnumC8556b mo31105J0 = mo31105J0();
        return (mo31105J0 == EnumC8556b.END_OBJECT || mo31105J0 == EnumC8556b.END_ARRAY) ? false : true;
    }
}
