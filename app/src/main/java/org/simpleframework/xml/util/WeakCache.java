package org.simpleframework.xml.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/WeakCache.class */
public class WeakCache<T> implements Cache<T> {
    private WeakCache<T>.SegmentList list;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/WeakCache$Segment.class */
    public class Segment extends WeakHashMap<Object, T> {
        public final WeakCache this$0;

        private Segment(WeakCache weakCache) {
            this.this$0 = weakCache;
        }

        public void cache(Object obj, T t10) {
            synchronized (this) {
                put(obj, t10);
            }
        }

        public boolean contains(Object obj) {
            boolean containsKey;
            synchronized (this) {
                containsKey = containsKey(obj);
            }
            return containsKey;
        }

        public T fetch(Object obj) {
            T t10;
            synchronized (this) {
                t10 = get(obj);
            }
            return t10;
        }

        public T take(Object obj) {
            T remove;
            synchronized (this) {
                remove = remove(obj);
            }
            return remove;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/WeakCache$SegmentList.class */
    public class SegmentList implements Iterable<WeakCache<T>.Segment> {
        private List<WeakCache<T>.Segment> list = new ArrayList();
        private int size;
        public final WeakCache this$0;

        public SegmentList(WeakCache weakCache, int i10) {
            this.this$0 = weakCache;
            this.size = i10;
            create(i10);
        }

        private void create(int i10) {
            while (i10 > 0) {
                this.list.add(new Segment());
                i10--;
            }
        }

        private int segment(Object obj) {
            return Math.abs(obj.hashCode() % this.size);
        }

        public WeakCache<T>.Segment get(Object obj) {
            int segment = segment(obj);
            if (segment < this.size) {
                return this.list.get(segment);
            }
            return null;
        }

        @Override // java.lang.Iterable
        public Iterator<WeakCache<T>.Segment> iterator() {
            return this.list.iterator();
        }
    }

    public WeakCache() {
        this(10);
    }

    public WeakCache(int i10) {
        this.list = new SegmentList(this, i10);
    }

    private WeakCache<T>.Segment map(Object obj) {
        return this.list.get(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public void cache(Object obj, T t10) {
        map(obj).cache(obj, t10);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean contains(Object obj) {
        return map(obj).contains(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public T fetch(Object obj) {
        return map(obj).fetch(obj);
    }

    @Override // org.simpleframework.xml.util.Cache
    public boolean isEmpty() {
        Iterator<WeakCache<T>.Segment> it = this.list.iterator();
        while (it.hasNext()) {
            if (!it.next().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.simpleframework.xml.util.Cache
    public T take(Object obj) {
        return map(obj).take(obj);
    }
}
