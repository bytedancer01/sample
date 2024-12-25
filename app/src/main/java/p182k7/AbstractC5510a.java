package p182k7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/a.class
 */
/* renamed from: k7.a */
/* loaded from: combined.jar:classes2.jar:k7/a.class */
public abstract class AbstractC5510a {

    /* renamed from: a */
    public final int f31391a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/a$a.class
     */
    /* renamed from: k7.a$a */
    /* loaded from: combined.jar:classes2.jar:k7/a$a.class */
    public static final class a extends AbstractC5510a {

        /* renamed from: b */
        public final long f31392b;

        /* renamed from: c */
        public final List<b> f31393c;

        /* renamed from: d */
        public final List<a> f31394d;

        public a(int i10, long j10) {
            super(i10);
            this.f31392b = j10;
            this.f31393c = new ArrayList();
            this.f31394d = new ArrayList();
        }

        /* renamed from: d */
        public void m27343d(a aVar) {
            this.f31394d.add(aVar);
        }

        /* renamed from: e */
        public void m27344e(b bVar) {
            this.f31393c.add(bVar);
        }

        /* renamed from: f */
        public a m27345f(int i10) {
            int size = this.f31394d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f31394d.get(i11);
                if (aVar.f31391a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public b m27346g(int i10) {
            int size = this.f31393c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f31393c.get(i11);
                if (bVar.f31391a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p182k7.AbstractC5510a
        public String toString() {
            return AbstractC5510a.m27340a(this.f31391a) + " leaves: " + Arrays.toString(this.f31393c.toArray()) + " containers: " + Arrays.toString(this.f31394d.toArray());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:k7/a$b.class
     */
    /* renamed from: k7.a$b */
    /* loaded from: combined.jar:classes2.jar:k7/a$b.class */
    public static final class b extends AbstractC5510a {

        /* renamed from: b */
        public final C4361f0 f31395b;

        public b(int i10, C4361f0 c4361f0) {
            super(i10);
            this.f31395b = c4361f0;
        }
    }

    public AbstractC5510a(int i10) {
        this.f31391a = i10;
    }

    /* renamed from: a */
    public static String m27340a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    /* renamed from: b */
    public static int m27341b(int i10) {
        return i10 & 16777215;
    }

    /* renamed from: c */
    public static int m27342c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return m27340a(this.f31391a);
    }
}
