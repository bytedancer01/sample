package p232nd;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p188kd.AbstractC5557j;
import p188kd.C5554g;
import p188kd.C5559l;
import p188kd.C5560m;
import p188kd.C5562o;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/g.class
 */
/* renamed from: nd.g */
/* loaded from: combined.jar:classes2.jar:nd/g.class */
public final class C6771g extends C8557c {

    /* renamed from: p */
    public static final Writer f35262p = new a();

    /* renamed from: q */
    public static final C5562o f35263q = new C5562o("closed");

    /* renamed from: m */
    public final List<AbstractC5557j> f35264m;

    /* renamed from: n */
    public String f35265n;

    /* renamed from: o */
    public AbstractC5557j f35266o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/g$a.class
     */
    /* renamed from: nd.g$a */
    /* loaded from: combined.jar:classes2.jar:nd/g$a.class */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public C6771g() {
        super(f35262p);
        this.f35264m = new ArrayList();
        this.f35266o = C5559l.f31648b;
    }

    @Override // sd.C8557c
    /* renamed from: J0 */
    public C8557c mo31119J0(double d10) {
        if (m36807B() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            m31127S0(new C5562o(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // sd.C8557c
    /* renamed from: K0 */
    public C8557c mo31120K0(long j10) {
        m31127S0(new C5562o(Long.valueOf(j10)));
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: L0 */
    public C8557c mo31121L0(Boolean bool) {
        if (bool == null) {
            return mo31133v0();
        }
        m31127S0(new C5562o(bool));
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: M0 */
    public C8557c mo31122M0(Number number) {
        if (number == null) {
            return mo31133v0();
        }
        if (!m36807B()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m31127S0(new C5562o(number));
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: N0 */
    public C8557c mo31123N0(String str) {
        if (str == null) {
            return mo31133v0();
        }
        m31127S0(new C5562o(str));
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: O0 */
    public C8557c mo31124O0(boolean z10) {
        m31127S0(new C5562o(Boolean.valueOf(z10)));
        return this;
    }

    /* renamed from: Q0 */
    public AbstractC5557j m31125Q0() {
        if (this.f35264m.isEmpty()) {
            return this.f35266o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f35264m);
    }

    /* renamed from: R0 */
    public final AbstractC5557j m31126R0() {
        List<AbstractC5557j> list = this.f35264m;
        return list.get(list.size() - 1);
    }

    /* renamed from: S0 */
    public final void m31127S0(AbstractC5557j abstractC5557j) {
        if (this.f35265n != null) {
            if (!abstractC5557j.m27581t() || m36821w()) {
                ((C5560m) m31126R0()).m27585x(this.f35265n, abstractC5557j);
            }
            this.f35265n = null;
            return;
        }
        if (this.f35264m.isEmpty()) {
            this.f35266o = abstractC5557j;
            return;
        }
        AbstractC5557j m31126R0 = m31126R0();
        if (!(m31126R0 instanceof C5554g)) {
            throw new IllegalStateException();
        }
        ((C5554g) m31126R0).m27576x(abstractC5557j);
    }

    @Override // sd.C8557c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f35264m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f35264m.add(f35263q);
    }

    @Override // sd.C8557c, java.io.Flushable
    public void flush() {
    }

    @Override // sd.C8557c
    /* renamed from: o */
    public C8557c mo31128o() {
        C5554g c5554g = new C5554g();
        m31127S0(c5554g);
        this.f35264m.add(c5554g);
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: o0 */
    public C8557c mo31129o0(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f35264m.isEmpty() || this.f35265n != null) {
            throw new IllegalStateException();
        }
        if (!(m31126R0() instanceof C5560m)) {
            throw new IllegalStateException();
        }
        this.f35265n = str;
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: p */
    public C8557c mo31130p() {
        C5560m c5560m = new C5560m();
        m31127S0(c5560m);
        this.f35264m.add(c5560m);
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: t */
    public C8557c mo31131t() {
        if (this.f35264m.isEmpty() || this.f35265n != null) {
            throw new IllegalStateException();
        }
        if (!(m31126R0() instanceof C5554g)) {
            throw new IllegalStateException();
        }
        List<AbstractC5557j> list = this.f35264m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: v */
    public C8557c mo31132v() {
        if (this.f35264m.isEmpty() || this.f35265n != null) {
            throw new IllegalStateException();
        }
        if (!(m31126R0() instanceof C5560m)) {
            throw new IllegalStateException();
        }
        List<AbstractC5557j> list = this.f35264m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // sd.C8557c
    /* renamed from: v0 */
    public C8557c mo31133v0() {
        m31127S0(C5559l.f31648b);
        return this;
    }
}
