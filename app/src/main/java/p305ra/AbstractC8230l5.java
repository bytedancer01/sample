package p305ra;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l5.class
 */
/* renamed from: ra.l5 */
/* loaded from: combined.jar:classes2.jar:ra/l5.class */
public abstract class AbstractC8230l5 implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final AbstractC8230l5 f39165c = new C8200j5(C8366u6.f39300c);

    /* renamed from: d */
    public static final InterfaceC8140f5 f39166d;

    /* renamed from: e */
    public static final Comparator<AbstractC8230l5> f39167e;

    /* renamed from: b */
    public int f39168b = 0;

    static {
        f39166d = C8379v4.m35962a() ? new C8215k5(null) : new C8110d5(null);
        f39167e = new C8080b5();
    }

    /* renamed from: A */
    public static int m35568A(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    /* renamed from: t */
    public static AbstractC8230l5 m35569t(byte[] bArr, int i10, int i11) {
        m35568A(i10, i10 + i11, bArr.length);
        return new C8200j5(f39166d.mo35202a(bArr, i10, i11));
    }

    /* renamed from: v */
    public static AbstractC8230l5 m35570v(String str) {
        return new C8200j5(str.getBytes(C8366u6.f39298a));
    }

    /* renamed from: x */
    public static C8170h5 m35571x(int i10) {
        return new C8170h5(i10, null);
    }

    /* renamed from: a */
    public abstract byte mo35262a(int i10);

    /* renamed from: b */
    public abstract byte mo35263b(int i10);

    /* renamed from: d */
    public abstract int mo35264d();

    /* renamed from: e */
    public abstract AbstractC8230l5 mo35510e(int i10, int i11);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract void mo35511f(C8439z4 c8439z4);

    /* renamed from: g */
    public abstract String mo35512g(Charset charset);

    public final int hashCode() {
        int i10 = this.f39168b;
        int i11 = i10;
        if (i10 == 0) {
            int mo35264d = mo35264d();
            int mo35514q = mo35514q(mo35264d, 0, mo35264d);
            i11 = mo35514q;
            if (mo35514q == 0) {
                i11 = 1;
            }
            this.f39168b = i11;
        }
        return i11;
    }

    /* renamed from: i */
    public abstract boolean mo35513i();

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new C8065a5(this);
    }

    /* renamed from: q */
    public abstract int mo35514q(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo35264d()), mo35264d() <= 50 ? C8278o8.m35655a(this) : String.valueOf(C8278o8.m35655a(mo35510e(0, 47))).concat("..."));
    }

    /* renamed from: w */
    public final String m35572w(Charset charset) {
        return mo35264d() == 0 ? "" : mo35512g(charset);
    }

    /* renamed from: y */
    public final int m35573y() {
        return this.f39168b;
    }
}
