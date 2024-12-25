package p319s5;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s5/c.class
 */
/* renamed from: s5.c */
/* loaded from: combined.jar:classes1.jar:s5/c.class */
public class C8534c<K, V> implements Serializable {

    /* renamed from: b */
    public final transient int f39915b;

    /* renamed from: c */
    public final transient ConcurrentHashMap<K, V> f39916c;

    public C8534c(int i10, int i11) {
        this.f39916c = new ConcurrentHashMap<>(i10, 0.8f, 4);
        this.f39915b = i11;
    }
}
