package p365v6;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/g0.class
 */
/* renamed from: v6.g0 */
/* loaded from: combined.jar:classes2.jar:v6/g0.class */
public interface InterfaceC9260g0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/g0$a.class
     */
    /* renamed from: v6.g0$a */
    /* loaded from: combined.jar:classes2.jar:v6/g0$a.class */
    public static final class a {

        /* renamed from: a */
        public final byte[] f42256a;

        /* renamed from: b */
        public final String f42257b;

        /* renamed from: c */
        public final int f42258c;

        public a(byte[] bArr, String str, int i10) {
            this.f42256a = bArr;
            this.f42257b = str;
            this.f42258c = i10;
        }

        /* renamed from: a */
        public byte[] m39030a() {
            return this.f42256a;
        }

        /* renamed from: b */
        public String m39031b() {
            return this.f42257b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/g0$b.class
     */
    /* renamed from: v6.g0$b */
    /* loaded from: combined.jar:classes2.jar:v6/g0$b.class */
    public interface b {
        /* renamed from: a */
        void mo39032a(InterfaceC9260g0 interfaceC9260g0, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/g0$c.class
     */
    /* renamed from: v6.g0$c */
    /* loaded from: combined.jar:classes2.jar:v6/g0$c.class */
    public interface c {
        /* renamed from: a */
        InterfaceC9260g0 mo39033a(UUID uuid);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/g0$d.class
     */
    /* renamed from: v6.g0$d */
    /* loaded from: combined.jar:classes2.jar:v6/g0$d.class */
    public static final class d {

        /* renamed from: a */
        public final byte[] f42259a;

        /* renamed from: b */
        public final String f42260b;

        public d(byte[] bArr, String str) {
            this.f42259a = bArr;
            this.f42260b = str;
        }

        /* renamed from: a */
        public byte[] m39034a() {
            return this.f42259a;
        }

        /* renamed from: b */
        public String m39035b() {
            return this.f42260b;
        }
    }

    /* renamed from: a */
    Class<? extends ExoMediaCrypto> mo39012a();

    /* renamed from: b */
    Map<String, String> mo39013b(byte[] bArr);

    /* renamed from: c */
    ExoMediaCrypto mo39014c(byte[] bArr);

    /* renamed from: d */
    d mo39015d();

    /* renamed from: e */
    byte[] mo39016e();

    /* renamed from: f */
    void mo39017f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo39018g(b bVar);

    /* renamed from: h */
    void mo39019h(byte[] bArr);

    /* renamed from: i */
    void mo39020i(byte[] bArr);

    /* renamed from: j */
    byte[] mo39021j(byte[] bArr, byte[] bArr2);

    /* renamed from: k */
    a mo39022k(byte[] bArr, List<C9273n.b> list, int i10, HashMap<String, String> hashMap);

    void release();
}
