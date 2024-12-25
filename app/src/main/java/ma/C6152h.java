package ma;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/h.class
 */
/* renamed from: ma.h */
/* loaded from: combined.jar:classes2.jar:ma/h.class */
public final class C6152h {
    /* renamed from: a */
    public static Map m29655a(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return AbstractC6407t2.m30034e();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
