package p281q5;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q5/m.class
 */
/* renamed from: q5.m */
/* loaded from: combined.jar:classes1.jar:q5/m.class */
public class C7770m {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/m$a.class
     */
    /* renamed from: q5.m$a */
    /* loaded from: combined.jar:classes1.jar:q5/m$a.class */
    public static class a extends AbstractC7771n<AtomicBoolean> {
        public a() {
            super(AtomicBoolean.class, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/m$b.class
     */
    /* renamed from: q5.m$b */
    /* loaded from: combined.jar:classes1.jar:q5/m$b.class */
    public static class b extends AbstractC7771n<AtomicInteger> {
        public b() {
            super(AtomicInteger.class, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:q5/m$c.class
     */
    /* renamed from: q5.m$c */
    /* loaded from: combined.jar:classes1.jar:q5/m$c.class */
    public static class c extends AbstractC7771n<AtomicLong> {
        public c() {
            super(AtomicLong.class, false);
        }
    }

    /* renamed from: a */
    public static Collection<Map.Entry<Class<?>, Object>> m33914a() {
        HashMap hashMap = new HashMap();
        C7774q c7774q = C7774q.f37641d;
        hashMap.put(URL.class, c7774q);
        hashMap.put(URI.class, c7774q);
        hashMap.put(Currency.class, c7774q);
        hashMap.put(UUID.class, new C7776s());
        hashMap.put(Pattern.class, c7774q);
        hashMap.put(Locale.class, c7774q);
        hashMap.put(AtomicBoolean.class, a.class);
        hashMap.put(AtomicInteger.class, b.class);
        hashMap.put(AtomicLong.class, c.class);
        hashMap.put(File.class, C7763f.class);
        hashMap.put(Class.class, C7760c.class);
        C7765h c7765h = C7765h.f37630d;
        hashMap.put(Void.class, c7765h);
        hashMap.put(Void.TYPE, c7765h);
        try {
            hashMap.put(Timestamp.class, C7761d.f37627f);
            hashMap.put(Date.class, C7768k.class);
            hashMap.put(Time.class, C7769l.class);
        } catch (NoClassDefFoundError e10) {
        }
        return hashMap.entrySet();
    }
}
