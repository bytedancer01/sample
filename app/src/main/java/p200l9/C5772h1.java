package p200l9;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/h1.class
 */
/* renamed from: l9.h1 */
/* loaded from: combined.jar:classes2.jar:l9/h1.class */
public final class C5772h1 {

    /* renamed from: a */
    public final Map f32247a = new HashMap();

    /* renamed from: b */
    public final Map f32248b = new HashMap();

    /* renamed from: c */
    public final Map f32249c = new HashMap();

    /* renamed from: a */
    public final int m28203a(String str) {
        Integer num = (Integer) this.f32249c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public final C5772h1 m28204b(String str, String str2, int i10) {
        this.f32247a.put(str, str2);
        this.f32248b.put(str2, str);
        this.f32249c.put(str, Integer.valueOf(i10));
        return this;
    }

    /* renamed from: c */
    public final String m28205c(String str) {
        return (String) this.f32247a.get(str);
    }

    /* renamed from: d */
    public final String m28206d(String str) {
        return (String) this.f32248b.get(str);
    }
}
