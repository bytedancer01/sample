package p228n7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p057d7.InterfaceC4325h;
import p059d9.C4361f0;
import p059d9.C4389t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/i0.class
 */
/* renamed from: n7.i0 */
/* loaded from: combined.jar:classes2.jar:n7/i0.class */
public interface InterfaceC6677i0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/i0$a.class
     */
    /* renamed from: n7.i0$a */
    /* loaded from: combined.jar:classes2.jar:n7/i0$a.class */
    public static final class a {

        /* renamed from: a */
        public final String f34826a;

        /* renamed from: b */
        public final int f34827b;

        /* renamed from: c */
        public final byte[] f34828c;

        public a(String str, int i10, byte[] bArr) {
            this.f34826a = str;
            this.f34827b = i10;
            this.f34828c = bArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/i0$b.class
     */
    /* renamed from: n7.i0$b */
    /* loaded from: combined.jar:classes2.jar:n7/i0$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f34829a;

        /* renamed from: b */
        public final String f34830b;

        /* renamed from: c */
        public final List<a> f34831c;

        /* renamed from: d */
        public final byte[] f34832d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f34829a = i10;
            this.f34830b = str;
            this.f34831c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f34832d = bArr;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/i0$c.class
     */
    /* renamed from: n7.i0$c */
    /* loaded from: combined.jar:classes2.jar:n7/i0$c.class */
    public interface c {
        /* renamed from: a */
        InterfaceC6677i0 mo30753a(int i10, b bVar);

        /* renamed from: b */
        SparseArray<InterfaceC6677i0> mo30754b();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/i0$d.class
     */
    /* renamed from: n7.i0$d */
    /* loaded from: combined.jar:classes2.jar:n7/i0$d.class */
    public static final class d {

        /* renamed from: a */
        public final String f34833a;

        /* renamed from: b */
        public final int f34834b;

        /* renamed from: c */
        public final int f34835c;

        /* renamed from: d */
        public int f34836d;

        /* renamed from: e */
        public String f34837e;

        public d(int i10, int i11) {
            this(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f34833a = str;
            this.f34834b = i11;
            this.f34835c = i12;
            this.f34836d = NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            this.f34837e = "";
        }

        /* renamed from: a */
        public void m30755a() {
            int i10 = this.f34836d;
            this.f34836d = i10 == Integer.MIN_VALUE ? this.f34834b : i10 + this.f34835c;
            this.f34837e = this.f34833a + this.f34836d;
        }

        /* renamed from: b */
        public String m30756b() {
            m30758d();
            return this.f34837e;
        }

        /* renamed from: c */
        public int m30757c() {
            m30758d();
            return this.f34836d;
        }

        /* renamed from: d */
        public final void m30758d() {
            if (this.f34836d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* renamed from: a */
    void mo30685a(C4361f0 c4361f0, int i10);

    /* renamed from: b */
    void mo30686b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, d dVar);

    /* renamed from: c */
    void mo30687c();
}
