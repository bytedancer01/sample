package sd;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:sd/c.class
 */
/* renamed from: sd.c */
/* loaded from: combined.jar:classes2.jar:sd/c.class */
public class C8557c implements Closeable, Flushable {

    /* renamed from: k */
    public static final String[] f39979k = new String[128];

    /* renamed from: l */
    public static final String[] f39980l;

    /* renamed from: b */
    public final Writer f39981b;

    /* renamed from: c */
    public int[] f39982c = new int[32];

    /* renamed from: d */
    public int f39983d = 0;

    /* renamed from: e */
    public String f39984e;

    /* renamed from: f */
    public String f39985f;

    /* renamed from: g */
    public boolean f39986g;

    /* renamed from: h */
    public boolean f39987h;

    /* renamed from: i */
    public String f39988i;

    /* renamed from: j */
    public boolean f39989j;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f39979k[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f39979k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f39980l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8557c(Writer writer) {
        m36809C0(6);
        this.f39985f = ":";
        this.f39989j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f39981b = writer;
    }

    /* renamed from: A0 */
    public final C8557c m36806A0(int i10, char c10) {
        m36818l();
        m36809C0(i10);
        this.f39981b.write(c10);
        return this;
    }

    /* renamed from: B */
    public boolean m36807B() {
        return this.f39986g;
    }

    /* renamed from: B0 */
    public final int m36808B0() {
        int i10 = this.f39983d;
        if (i10 != 0) {
            return this.f39982c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: C0 */
    public final void m36809C0(int i10) {
        int i11 = this.f39983d;
        int[] iArr = this.f39982c;
        if (i11 == iArr.length) {
            this.f39982c = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f39982c;
        int i12 = this.f39983d;
        this.f39983d = i12 + 1;
        iArr2[i12] = i10;
    }

    /* renamed from: D0 */
    public final void m36810D0(int i10) {
        this.f39982c[this.f39983d - 1] = i10;
    }

    /* renamed from: E0 */
    public final void m36811E0(boolean z10) {
        this.f39987h = z10;
    }

    /* renamed from: F0 */
    public final void m36812F0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f39984e = null;
            str2 = ":";
        } else {
            this.f39984e = str;
            str2 = ": ";
        }
        this.f39985f = str2;
    }

    /* renamed from: G0 */
    public final void m36813G0(boolean z10) {
        this.f39986g = z10;
    }

    /* renamed from: H0 */
    public final void m36814H0(boolean z10) {
        this.f39989j = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m36815I0(java.lang.String r7) {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.f39987h
            if (r0 == 0) goto Lf
            java.lang.String[] r0 = sd.C8557c.f39980l
            r14 = r0
            goto L14
        Lf:
            java.lang.String[] r0 = sd.C8557c.f39979k
            r14 = r0
        L14:
            r0 = r6
            java.io.Writer r0 = r0.f39981b
            r1 = 34
            r0.write(r1)
            r0 = r7
            int r0 = r0.length()
            r11 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r8 = r0
        L28:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L9a
            r0 = r7
            r1 = r10
            char r0 = r0.charAt(r1)
            r12 = r0
            r0 = r12
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L54
            r0 = r14
            r1 = r12
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            r13 = r0
            r0 = r15
            if (r0 != 0) goto L71
            r0 = r8
            r9 = r0
            goto L92
        L54:
            r0 = r12
            r1 = 8232(0x2028, float:1.1535E-41)
            if (r0 != r1) goto L63
            java.lang.String r0 = "\\u2028"
            r13 = r0
            goto L71
        L63:
            r0 = r8
            r9 = r0
            r0 = r12
            r1 = 8233(0x2029, float:1.1537E-41)
            if (r0 != r1) goto L92
            java.lang.String r0 = "\\u2029"
            r13 = r0
        L71:
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto L84
            r0 = r6
            java.io.Writer r0 = r0.f39981b
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r8
            int r3 = r3 - r4
            r0.write(r1, r2, r3)
        L84:
            r0 = r6
            java.io.Writer r0 = r0.f39981b
            r1 = r13
            r0.write(r1)
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L92:
            int r10 = r10 + 1
            r0 = r9
            r8 = r0
            goto L28
        L9a:
            r0 = r8
            r1 = r11
            if (r0 >= r1) goto Lad
            r0 = r6
            java.io.Writer r0 = r0.f39981b
            r1 = r7
            r2 = r8
            r3 = r11
            r4 = r8
            int r3 = r3 - r4
            r0.write(r1, r2, r3)
        Lad:
            r0 = r6
            java.io.Writer r0 = r0.f39981b
            r1 = 34
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.C8557c.m36815I0(java.lang.String):void");
    }

    /* renamed from: J0 */
    public C8557c mo31119J0(double d10) {
        m36816P0();
        if (this.f39986g || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            m36818l();
            this.f39981b.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    /* renamed from: K0 */
    public C8557c mo31120K0(long j10) {
        m36816P0();
        m36818l();
        this.f39981b.write(Long.toString(j10));
        return this;
    }

    /* renamed from: L0 */
    public C8557c mo31121L0(Boolean bool) {
        if (bool == null) {
            return mo31133v0();
        }
        m36816P0();
        m36818l();
        this.f39981b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: M0 */
    public C8557c mo31122M0(Number number) {
        if (number == null) {
            return mo31133v0();
        }
        m36816P0();
        String obj = number.toString();
        if (this.f39986g || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m36818l();
            this.f39981b.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: N0 */
    public C8557c mo31123N0(String str) {
        if (str == null) {
            return mo31133v0();
        }
        m36816P0();
        m36818l();
        m36815I0(str);
        return this;
    }

    /* renamed from: O0 */
    public C8557c mo31124O0(boolean z10) {
        m36816P0();
        m36818l();
        this.f39981b.write(z10 ? "true" : "false");
        return this;
    }

    /* renamed from: P0 */
    public final void m36816P0() {
        if (this.f39988i != null) {
            m36817f();
            m36815I0(this.f39988i);
            this.f39988i = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39981b.close();
        int i10 = this.f39983d;
        if (i10 > 1 || (i10 == 1 && this.f39982c[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f39983d = 0;
    }

    /* renamed from: f */
    public final void m36817f() {
        int m36808B0 = m36808B0();
        if (m36808B0 == 5) {
            this.f39981b.write(44);
        } else if (m36808B0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m36820q0();
        m36810D0(4);
    }

    public void flush() {
        if (this.f39983d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f39981b.flush();
    }

    /* renamed from: l */
    public final void m36818l() {
        int m36808B0 = m36808B0();
        if (m36808B0 == 1) {
            m36810D0(2);
        } else {
            if (m36808B0 != 2) {
                if (m36808B0 == 4) {
                    this.f39981b.append((CharSequence) this.f39985f);
                    m36810D0(5);
                    return;
                }
                if (m36808B0 != 6) {
                    if (m36808B0 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f39986g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                m36810D0(7);
                return;
            }
            this.f39981b.append(',');
        }
        m36820q0();
    }

    /* renamed from: o */
    public C8557c mo31128o() {
        m36816P0();
        return m36806A0(1, '[');
    }

    /* renamed from: o0 */
    public C8557c mo31129o0(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f39988i != null) {
            throw new IllegalStateException();
        }
        if (this.f39983d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f39988i = str;
        return this;
    }

    /* renamed from: p */
    public C8557c mo31130p() {
        m36816P0();
        return m36806A0(3, '{');
    }

    /* renamed from: q */
    public final C8557c m36819q(int i10, int i11, char c10) {
        int m36808B0 = m36808B0();
        if (m36808B0 != i11 && m36808B0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f39988i != null) {
            throw new IllegalStateException("Dangling name: " + this.f39988i);
        }
        this.f39983d--;
        if (m36808B0 == i11) {
            m36820q0();
        }
        this.f39981b.write(c10);
        return this;
    }

    /* renamed from: q0 */
    public final void m36820q0() {
        if (this.f39984e == null) {
            return;
        }
        this.f39981b.write(10);
        int i10 = this.f39983d;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f39981b.write(this.f39984e);
        }
    }

    /* renamed from: t */
    public C8557c mo31131t() {
        return m36819q(1, 2, ']');
    }

    /* renamed from: v */
    public C8557c mo31132v() {
        return m36819q(3, 5, '}');
    }

    /* renamed from: v0 */
    public C8557c mo31133v0() {
        if (this.f39988i != null) {
            if (!this.f39989j) {
                this.f39988i = null;
                return this;
            }
            m36816P0();
        }
        m36818l();
        this.f39981b.write("null");
        return this;
    }

    /* renamed from: w */
    public final boolean m36821w() {
        return this.f39989j;
    }

    /* renamed from: y */
    public final boolean m36822y() {
        return this.f39987h;
    }
}
