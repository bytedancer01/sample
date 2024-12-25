package p039c9;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/p.class
 */
/* renamed from: c9.p */
/* loaded from: combined.jar:classes2.jar:c9/p.class */
public class C1046p {

    /* renamed from: a */
    public final Map<String, Object> f7016a = new HashMap();

    /* renamed from: b */
    public final List<String> f7017b = new ArrayList();

    /* renamed from: g */
    public static C1046p m6181g(C1046p c1046p, long j10) {
        return c1046p.m6187e("exo_len", j10);
    }

    /* renamed from: h */
    public static C1046p m6182h(C1046p c1046p, Uri uri) {
        return uri == null ? c1046p.m6186d("exo_redir") : c1046p.m6188f("exo_redir", uri.toString());
    }

    /* renamed from: a */
    public final C1046p m6183a(String str, Object obj) {
        this.f7016a.put((String) C4349a.m21882e(str), C4349a.m21882e(obj));
        this.f7017b.remove(str);
        return this;
    }

    /* renamed from: b */
    public Map<String, Object> m6184b() {
        HashMap hashMap = new HashMap(this.f7016a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: c */
    public List<String> m6185c() {
        return Collections.unmodifiableList(new ArrayList(this.f7017b));
    }

    /* renamed from: d */
    public C1046p m6186d(String str) {
        this.f7017b.add(str);
        this.f7016a.remove(str);
        return this;
    }

    /* renamed from: e */
    public C1046p m6187e(String str, long j10) {
        return m6183a(str, Long.valueOf(j10));
    }

    /* renamed from: f */
    public C1046p m6188f(String str, String str2) {
        return m6183a(str, str2);
    }
}
