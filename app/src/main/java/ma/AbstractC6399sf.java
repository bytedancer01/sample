package ma;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/sf.class
 */
/* renamed from: ma.sf */
/* loaded from: combined.jar:classes2.jar:ma/sf.class */
public abstract class AbstractC6399sf implements Iterable, Serializable {

    /* renamed from: c */
    public static final AbstractC6399sf f34033c = new C6336pf(C6482wg.f34133d);

    /* renamed from: d */
    public static final Comparator f34034d;

    /* renamed from: e */
    public static final C6378rf f34035e;

    /* renamed from: b */
    public int f34036b = 0;

    static {
        int i10 = C6168hf.f33799a;
        f34035e = new C6378rf(null);
        f34034d = new C6231kf();
    }

    /* renamed from: q */
    public static int m30020q(int i10, int i11, int i12) {
        if (((i12 - i11) | i11) >= 0) {
            return i11;
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    /* renamed from: a */
    public abstract byte mo29848a(int i10);

    /* renamed from: b */
    public abstract byte mo29849b(int i10);

    /* renamed from: d */
    public abstract int mo29850d();

    /* renamed from: e */
    public abstract int mo29963e(int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract AbstractC6399sf mo29964f(int i10, int i11);

    /* renamed from: g */
    public abstract String mo29965g(Charset charset);

    /* renamed from: h */
    public abstract void mo29966h(C6189if c6189if);

    public final int hashCode() {
        int i10 = this.f34036b;
        int i11 = i10;
        if (i10 == 0) {
            int mo29850d = mo29850d();
            int mo29963e = mo29963e(mo29850d, 0, mo29850d);
            i11 = mo29963e;
            if (mo29963e == 0) {
                i11 = 1;
            }
            this.f34036b = i11;
        }
        return i11;
    }

    /* renamed from: i */
    public abstract boolean mo29967i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C6210jf(this);
    }

    /* renamed from: t */
    public final int m30021t() {
        return this.f34036b;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo29850d()), mo29850d() <= 50 ? C6464vi.m30082a(this) : C6464vi.m30082a(mo29964f(0, 47)).concat("..."));
    }

    /* renamed from: v */
    public final String m30022v(Charset charset) {
        return mo29850d() == 0 ? "" : mo29965g(charset);
    }
}
