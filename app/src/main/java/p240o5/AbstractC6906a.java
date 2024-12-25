package p240o5;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p074e5.AbstractC4635l;
import p111g5.C4955i;
import p281q5.C7758a;
import p281q5.C7759b;
import p281q5.C7761d;
import p281q5.C7766i;
import p281q5.C7767j;
import p281q5.C7770m;
import p281q5.C7773p;
import p281q5.C7774q;
import p281q5.C7775r;
import p319s5.C8537f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o5/a.class
 */
/* renamed from: o5.a */
/* loaded from: combined.jar:classes1.jar:o5/a.class */
public abstract class AbstractC6906a extends AbstractC6911f implements Serializable {

    /* renamed from: c */
    public static final HashMap<String, AbstractC4635l<?>> f35744c;

    /* renamed from: d */
    public static final HashMap<String, Class<? extends AbstractC4635l<?>>> f35745d;

    /* renamed from: b */
    public final C4955i f35746b;

    static {
        HashMap<String, Class<? extends AbstractC4635l<?>>> hashMap = new HashMap<>();
        HashMap<String, AbstractC4635l<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new C7773p());
        C7774q c7774q = C7774q.f37641d;
        hashMap2.put(StringBuffer.class.getName(), c7774q);
        hashMap2.put(StringBuilder.class.getName(), c7774q);
        hashMap2.put(Character.class.getName(), c7774q);
        hashMap2.put(Character.TYPE.getName(), c7774q);
        C7767j.m33913a(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new C7758a(true));
        hashMap2.put(Boolean.class.getName(), new C7758a(false));
        hashMap2.put(BigInteger.class.getName(), new C7766i(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new C7766i(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), C7759b.f37626f);
        hashMap2.put(Date.class.getName(), C7761d.f37627f);
        for (Map.Entry<Class<?>, Object> entry : C7770m.m33914a()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC4635l) {
                hashMap2.put(entry.getKey().getName(), (AbstractC4635l) value);
            } else {
                if (!(value instanceof Class)) {
                    throw new IllegalStateException("Internal error: unrecognized value of type " + entry.getClass().getName());
                }
                hashMap.put(entry.getKey().getName(), (Class) value);
            }
        }
        hashMap.put(C8537f.class.getName(), C7775r.class);
        f35744c = hashMap2;
        f35745d = hashMap;
    }

    public AbstractC6906a(C4955i c4955i) {
        this.f35746b = c4955i == null ? new C4955i() : c4955i;
    }
}
