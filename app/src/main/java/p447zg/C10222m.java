package p447zg;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/m.class
 */
/* renamed from: zg.m */
/* loaded from: combined.jar:classes2.jar:zg/m.class */
public class C10222m extends Pointer {

    /* renamed from: d */
    public static final Map<C10222m, Reference<C10222m>> f46789d = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: e */
    public static final C10211b0 f46790e = new C10211b0();

    /* renamed from: c */
    public long f46791c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/m$a.class
     */
    /* renamed from: zg.m$a */
    /* loaded from: combined.jar:classes2.jar:zg/m$a.class */
    public class a extends C10222m {

        /* renamed from: f */
        public final C10222m f46792f;

        public a(C10222m c10222m, long j10, long j11) {
            this.f46792f = c10222m;
            this.f46791c = j11;
            this.f26142a = c10222m.f26142a + j10;
        }

        @Override // p447zg.C10222m
        /* renamed from: b0 */
        public void mo42760b0(long j10, long j11) {
            C10222m c10222m = this.f46792f;
            c10222m.mo42760b0((this.f26142a - c10222m.f26142a) + j10, j11);
        }

        @Override // p447zg.C10222m
        /* renamed from: d0 */
        public void mo42762d0() {
            synchronized (this) {
                this.f26142a = 0L;
            }
        }

        @Override // p447zg.C10222m, com.sun.jna.Pointer
        public String toString() {
            return super.toString() + " (shared from " + this.f46792f.toString() + ")";
        }
    }

    public C10222m() {
    }

    public C10222m(long j10) {
        this.f46791c = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("Allocation size must be greater than zero");
        }
        long m42759g0 = m42759g0(j10);
        this.f26142a = m42759g0;
        if (m42759g0 != 0) {
            f46789d.put(this, new WeakReference(this));
            return;
        }
        throw new OutOfMemoryError("Cannot allocate " + j10 + " bytes");
    }

    /* renamed from: e0 */
    public static void m42757e0() {
        Iterator it = new LinkedList(f46789d.keySet()).iterator();
        while (it.hasNext()) {
            ((C10222m) it.next()).mo42762d0();
        }
    }

    /* renamed from: f0 */
    public static void m42758f0(long j10) {
        if (j10 != 0) {
            Native.free(j10);
        }
    }

    /* renamed from: g0 */
    public static long m42759g0(long j10) {
        return Native.malloc(j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: A */
    public void mo21388A(long j10, int[] iArr, int i10, int i11) {
        mo42760b0(j10, i11 * 4);
        super.mo21388A(j10, iArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: B */
    public void mo21389B(long j10, long[] jArr, int i10, int i11) {
        mo42760b0(j10, i11 * 8);
        super.mo21389B(j10, jArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: D */
    public void mo21391D(long j10, short[] sArr, int i10, int i11) {
        mo42760b0(j10, i11 * 2);
        super.mo21391D(j10, sArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: F */
    public void mo21393F(long j10, byte b10) {
        mo42760b0(j10, 1L);
        super.mo21393F(j10, b10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: G */
    public void mo21394G(long j10, char c10) {
        mo42760b0(j10, Native.f26129n);
        super.mo21394G(j10, c10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: H */
    public void mo21395H(long j10, double d10) {
        mo42760b0(j10, 8L);
        super.mo21395H(j10, d10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: I */
    public void mo21396I(long j10, float f10) {
        mo42760b0(j10, 4L);
        super.mo21396I(j10, f10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: J */
    public void mo21397J(long j10, int i10) {
        mo42760b0(j10, 4L);
        super.mo21397J(j10, i10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: K */
    public void mo21398K(long j10, long j11) {
        mo42760b0(j10, 8L);
        super.mo21398K(j10, j11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: M */
    public void mo21400M(long j10, Pointer pointer) {
        mo42760b0(j10, Native.f26127l);
        super.mo21400M(j10, pointer);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: N */
    public void mo21401N(long j10, short s10) {
        mo42760b0(j10, 2L);
        super.mo21401N(j10, s10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: P */
    public void mo21403P(long j10, String str) {
        mo42760b0(j10, (str.length() + 1) * Native.f26129n);
        super.mo21403P(j10, str);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: Q */
    public Pointer mo21404Q(long j10) {
        return mo21405R(j10, m42763h0() - j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: R */
    public Pointer mo21405R(long j10, long j11) {
        mo42760b0(j10, j11);
        return new a(this, j10, j11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: S */
    public void mo21406S(long j10, byte[] bArr, int i10, int i11) {
        mo42760b0(j10, i11 * 1);
        super.mo21406S(j10, bArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: T */
    public void mo21407T(long j10, char[] cArr, int i10, int i11) {
        mo42760b0(j10, i11 * 2);
        super.mo21407T(j10, cArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: U */
    public void mo21408U(long j10, double[] dArr, int i10, int i11) {
        mo42760b0(j10, i11 * 8);
        super.mo21408U(j10, dArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: V */
    public void mo21409V(long j10, float[] fArr, int i10, int i11) {
        mo42760b0(j10, i11 * 4);
        super.mo21409V(j10, fArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: W */
    public void mo21410W(long j10, int[] iArr, int i10, int i11) {
        mo42760b0(j10, i11 * 4);
        super.mo21410W(j10, iArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: X */
    public void mo21411X(long j10, long[] jArr, int i10, int i11) {
        mo42760b0(j10, i11 * 8);
        super.mo21411X(j10, jArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: Z */
    public void mo21413Z(long j10, short[] sArr, int i10, int i11) {
        mo42760b0(j10, i11 * 2);
        super.mo21413Z(j10, sArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: b */
    public byte mo21416b(long j10) {
        mo42760b0(j10, 1L);
        return super.mo21416b(j10);
    }

    /* renamed from: b0 */
    public void mo42760b0(long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("Invalid offset: " + j10);
        }
        long j12 = j10 + j11;
        if (j12 <= this.f46791c) {
            return;
        }
        throw new IndexOutOfBoundsException("Bounds exceeds available space : size=" + this.f46791c + ", offset=" + j12);
    }

    /* renamed from: c0 */
    public void m42761c0() {
        m21414a(this.f46791c);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: d */
    public char mo21418d(long j10) {
        mo42760b0(j10, 1L);
        return super.mo21418d(j10);
    }

    /* renamed from: d0 */
    public void mo42762d0() {
        synchronized (this) {
            try {
                m42758f0(this.f26142a);
                f46789d.remove(this);
                this.f26142a = 0L;
            } catch (Throwable th2) {
                f46789d.remove(this);
                this.f26142a = 0L;
                throw th2;
            }
        }
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: e */
    public double mo21419e(long j10) {
        mo42760b0(j10, 8L);
        return super.mo21419e(j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: f */
    public float mo21420f(long j10) {
        mo42760b0(j10, 4L);
        return super.mo21420f(j10);
    }

    public void finalize() {
        mo42762d0();
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: g */
    public int mo21421g(long j10) {
        mo42760b0(j10, 4L);
        return super.mo21421g(j10);
    }

    /* renamed from: h0 */
    public long m42763h0() {
        return this.f46791c;
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: i */
    public long mo21423i(long j10) {
        mo42760b0(j10, 8L);
        return super.mo21423i(j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: k */
    public Pointer mo21425k(long j10) {
        mo42760b0(j10, Native.f26127l);
        return super.mo21425k(j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: n */
    public short mo21428n(long j10) {
        mo42760b0(j10, 2L);
        return super.mo21428n(j10);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: p */
    public String mo21430p(long j10, String str) {
        mo42760b0(j10, 0L);
        return super.mo21430p(j10, str);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: t */
    public String mo21434t(long j10) {
        mo42760b0(j10, 0L);
        return super.mo21434t(j10);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        return "allocated@0x" + Long.toHexString(this.f26142a) + " (" + this.f46791c + " bytes)";
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: w */
    public void mo21437w(long j10, byte[] bArr, int i10, int i11) {
        mo42760b0(j10, i11 * 1);
        super.mo21437w(j10, bArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: x */
    public void mo21438x(long j10, char[] cArr, int i10, int i11) {
        mo42760b0(j10, i11 * 2);
        super.mo21438x(j10, cArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: y */
    public void mo21439y(long j10, double[] dArr, int i10, int i11) {
        mo42760b0(j10, i11 * 8);
        super.mo21439y(j10, dArr, i10, i11);
    }

    @Override // com.sun.jna.Pointer
    /* renamed from: z */
    public void mo21440z(long j10, float[] fArr, int i10, int i11) {
        mo42760b0(j10, i11 * 4);
        super.mo21440z(j10, fArr, i10, i11);
    }
}
