package p123h5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p074e5.C4640q;
import p111g5.C4951e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h5/a.class
 */
/* renamed from: h5.a */
/* loaded from: combined.jar:classes1.jar:h5/a.class */
public abstract class AbstractC5027a extends AbstractC5032f implements Serializable {

    /* renamed from: d */
    public static final Class<?> f29070d = Object.class;

    /* renamed from: e */
    public static final Class<?> f29071e = String.class;

    /* renamed from: f */
    public static final Class<?> f29072f = CharSequence.class;

    /* renamed from: g */
    public static final Class<?> f29073g = Iterable.class;

    /* renamed from: h */
    public static final Class<?> f29074h = Map.Entry.class;

    /* renamed from: i */
    public static final C4640q f29075i = new C4640q("@JsonUnwrapped");

    /* renamed from: j */
    public static final HashMap<String, Class<? extends Map>> f29076j;

    /* renamed from: k */
    public static final HashMap<String, Class<? extends Collection>> f29077k;

    /* renamed from: c */
    public final C4951e f29078c;

    static {
        HashMap<String, Class<? extends Map>> hashMap = new HashMap<>();
        f29076j = hashMap;
        hashMap.put(Map.class.getName(), LinkedHashMap.class);
        hashMap.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        hashMap.put(SortedMap.class.getName(), TreeMap.class);
        hashMap.put(NavigableMap.class.getName(), TreeMap.class);
        hashMap.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        HashMap<String, Class<? extends Collection>> hashMap2 = new HashMap<>();
        f29077k = hashMap2;
        hashMap2.put(Collection.class.getName(), ArrayList.class);
        hashMap2.put(List.class.getName(), ArrayList.class);
        hashMap2.put(Set.class.getName(), HashSet.class);
        hashMap2.put(SortedSet.class.getName(), TreeSet.class);
        hashMap2.put(Queue.class.getName(), LinkedList.class);
        hashMap2.put("java.util.Deque", LinkedList.class);
        hashMap2.put("java.util.NavigableSet", TreeSet.class);
    }

    public AbstractC5027a(C4951e c4951e) {
        this.f29078c = c4951e;
    }
}
