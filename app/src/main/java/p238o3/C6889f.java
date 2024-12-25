package p238o3;

import java.io.IOException;
import p411xi.InterfaceC9762f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o3/f.class
 */
/* renamed from: o3.f */
/* loaded from: combined.jar:classes1.jar:o3/f.class */
public final class C6889f extends AbstractC6890g {

    /* renamed from: m */
    public static final String[] f35699m = new String[128];

    /* renamed from: j */
    public final InterfaceC9762f f35700j;

    /* renamed from: k */
    public String f35701k = ":";

    /* renamed from: l */
    public String f35702l;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f35699m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f35699m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C6889f(InterfaceC9762f interfaceC9762f) {
        if (interfaceC9762f == null) {
            throw new NullPointerException("sink == null");
        }
        this.f35700j = interfaceC9762f;
        m31774y(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m31754G0(p411xi.InterfaceC9762f r5, java.lang.String r6) {
        /*
            java.lang.String[] r0 = p238o3.C6889f.f35699m
            r14 = r0
            r0 = r5
            r1 = 34
            xi.f r0 = r0.writeByte(r1)
            r0 = r6
            int r0 = r0.length()
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r7 = r0
        L19:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L89
            r0 = r6
            r1 = r9
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L45
            r0 = r14
            r1 = r11
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            r12 = r0
            r0 = r13
            if (r0 != 0) goto L62
            r0 = r7
            r8 = r0
            goto L81
        L45:
            r0 = r11
            r1 = 8232(0x2028, float:1.1535E-41)
            if (r0 != r1) goto L54
            java.lang.String r0 = "\\u2028"
            r12 = r0
            goto L62
        L54:
            r0 = r7
            r8 = r0
            r0 = r11
            r1 = 8233(0x2029, float:1.1537E-41)
            if (r0 != r1) goto L81
            java.lang.String r0 = "\\u2029"
            r12 = r0
        L62:
            r0 = r7
            r1 = r9
            if (r0 >= r1) goto L73
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r9
            xi.f r0 = r0.mo41140T(r1, r2, r3)
        L73:
            r0 = r5
            r1 = r12
            xi.f r0 = r0.mo41136Q(r1)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r8 = r0
        L81:
            int r9 = r9 + 1
            r0 = r8
            r7 = r0
            goto L19
        L89:
            r0 = r7
            r1 = r10
            if (r0 >= r1) goto L9a
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            xi.f r0 = r0.mo41140T(r1, r2, r3)
        L9a:
            r0 = r5
            r1 = 34
            xi.f r0 = r0.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238o3.C6889f.m31754G0(xi.f, java.lang.String):void");
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: A0 */
    public AbstractC6890g mo31755A0(boolean z10) {
        m31761H0();
        m31757C0();
        this.f35700j.mo41136Q(z10 ? "true" : "false");
        int[] iArr = this.f35706e;
        int i10 = this.f35703b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* renamed from: B0 */
    public final void m31756B0() {
        int m31773w = m31773w();
        if (m31773w == 5) {
            this.f35700j.writeByte(44);
        } else if (m31773w != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m31759E0();
        m31771B(4);
    }

    /* renamed from: C0 */
    public final void m31757C0() {
        int m31773w = m31773w();
        if (m31773w == 1) {
            m31771B(2);
        } else {
            if (m31773w != 2) {
                if (m31773w == 4) {
                    this.f35700j.mo41136Q(this.f35701k);
                    m31771B(5);
                    return;
                }
                if (m31773w != 6) {
                    if (m31773w != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f35708g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                m31771B(7);
                return;
            }
            this.f35700j.writeByte(44);
        }
        m31759E0();
    }

    /* renamed from: D0 */
    public final AbstractC6890g m31758D0(int i10, int i11, String str) {
        int m31773w = m31773w();
        if (m31773w != i11 && m31773w != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f35702l != null) {
            throw new IllegalStateException("Dangling name: " + this.f35702l);
        }
        int i12 = this.f35703b - 1;
        this.f35703b = i12;
        this.f35705d[i12] = null;
        int[] iArr = this.f35706e;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        if (m31773w == i11) {
            m31759E0();
        }
        this.f35700j.mo41136Q(str);
        return this;
    }

    /* renamed from: E0 */
    public final void m31759E0() {
        if (this.f35707f == null) {
            return;
        }
        this.f35700j.writeByte(10);
        int i10 = this.f35703b;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f35700j.mo41136Q(this.f35707f);
        }
    }

    /* renamed from: F0 */
    public final AbstractC6890g m31760F0(int i10, String str) {
        m31757C0();
        m31774y(i10);
        this.f35706e[this.f35703b - 1] = 0;
        this.f35700j.mo41136Q(str);
        return this;
    }

    /* renamed from: H0 */
    public final void m31761H0() {
        if (this.f35702l != null) {
            m31756B0();
            m31754G0(this.f35700j, this.f35702l);
            this.f35702l = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35700j.close();
        int i10 = this.f35703b;
        if (i10 > 1 || (i10 == 1 && this.f35704c[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f35703b = 0;
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: f */
    public AbstractC6890g mo31762f() {
        m31761H0();
        return m31760F0(1, "[");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f35703b == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f35700j.flush();
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: l */
    public AbstractC6890g mo31763l() {
        m31761H0();
        return m31760F0(3, "{");
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: o */
    public AbstractC6890g mo31764o() {
        return m31758D0(1, 2, "]");
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: p */
    public AbstractC6890g mo31765p() {
        this.f35710i = false;
        return m31758D0(3, 5, "}");
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: q */
    public AbstractC6890g mo31766q(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        int i10 = this.f35703b;
        if (i10 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.f35702l != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f35702l = str;
        this.f35705d[i10 - 1] = str;
        this.f35710i = false;
        return this;
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: q0 */
    public AbstractC6890g mo31767q0(Number number) {
        if (number == null) {
            return mo31768t();
        }
        String obj = number.toString();
        if (!this.f35708g && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f35710i) {
            return mo31766q(obj);
        }
        m31761H0();
        m31757C0();
        this.f35700j.mo41136Q(obj);
        int[] iArr = this.f35706e;
        int i10 = this.f35703b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: t */
    public AbstractC6890g mo31768t() {
        if (this.f35702l != null) {
            if (!this.f35709h) {
                this.f35702l = null;
                return this;
            }
            m31761H0();
        }
        m31757C0();
        this.f35700j.mo41136Q("null");
        int[] iArr = this.f35706e;
        int i10 = this.f35703b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p238o3.AbstractC6890g
    /* renamed from: v0 */
    public AbstractC6890g mo31769v0(String str) {
        if (str == null) {
            return mo31768t();
        }
        if (this.f35710i) {
            return mo31766q(str);
        }
        m31761H0();
        m31757C0();
        m31754G0(this.f35700j, str);
        int[] iArr = this.f35706e;
        int i10 = this.f35703b - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
