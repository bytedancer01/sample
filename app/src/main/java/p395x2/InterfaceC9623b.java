package p395x2;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/b.class
 */
/* renamed from: x2.b */
/* loaded from: combined.jar:classes1.jar:x2/b.class */
public interface InterfaceC9623b {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/b$a.class
     */
    /* renamed from: x2.b$a */
    /* loaded from: combined.jar:classes1.jar:x2/b$a.class */
    public static class a {

        /* renamed from: a */
        public byte[] f43944a;

        /* renamed from: b */
        public String f43945b;

        /* renamed from: c */
        public long f43946c;

        /* renamed from: d */
        public long f43947d;

        /* renamed from: e */
        public long f43948e;

        /* renamed from: f */
        public long f43949f;

        /* renamed from: g */
        public Map<String, String> f43950g = Collections.emptyMap();

        /* renamed from: h */
        public List<C9628g> f43951h;

        /* renamed from: a */
        public boolean m40500a() {
            return this.f43948e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m40501b() {
            return this.f43949f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    void mo40499a(String str, a aVar);

    a get(String str);

    void initialize();
}
