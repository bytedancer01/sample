package cg;

import cg.AbstractC1093f;
import cg.C1092e;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/k.class
 */
/* renamed from: cg.k */
/* loaded from: combined.jar:classes2.jar:cg/k.class */
public class ConcurrentMapC1098k<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: v */
    public static final Logger f7311v = Logger.getLogger(ConcurrentMapC1098k.class.getName());

    /* renamed from: w */
    public static final y<Object, Object> f7312w = new a();

    /* renamed from: x */
    public static final Queue<? extends Object> f7313x = new b();

    /* renamed from: b */
    public final int f7314b;

    /* renamed from: c */
    public final int f7315c;

    /* renamed from: d */
    public final p<K, V>[] f7316d;

    /* renamed from: e */
    public final int f7317e;

    /* renamed from: f */
    public final AbstractC1095h<Object> f7318f;

    /* renamed from: g */
    public final AbstractC1095h<Object> f7319g;

    /* renamed from: h */
    public final r f7320h;

    /* renamed from: i */
    public final r f7321i;

    /* renamed from: j */
    public final long f7322j;

    /* renamed from: k */
    public final InterfaceC1111x<K, V> f7323k;

    /* renamed from: l */
    public final long f7324l;

    /* renamed from: m */
    public final long f7325m;

    /* renamed from: n */
    public final long f7326n;

    /* renamed from: o */
    public final Queue<C1105r<K, V>> f7327o;

    /* renamed from: p */
    public final InterfaceC1104q<K, V> f7328p;

    /* renamed from: q */
    public final AbstractC1108u f7329q;

    /* renamed from: r */
    public final f f7330r;

    /* renamed from: s */
    public Set<K> f7331s;

    /* renamed from: t */
    public Collection<V> f7332t;

    /* renamed from: u */
    public Set<Map.Entry<K, V>> f7333u;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$a.class
     */
    /* renamed from: cg.k$a */
    /* loaded from: combined.jar:classes2.jar:cg/k$a.class */
    public final class a implements y<Object, Object> {
        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: a */
        public void mo6577a(Object obj) {
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: b */
        public boolean mo6578b() {
            return false;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return 0;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<Object, Object> mo6580d(ReferenceQueue<Object> referenceQueue, Object obj, o<Object, Object> oVar) {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public Object get() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public o<Object, Object> getEntry() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public boolean isActive() {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$a0.class
     */
    /* renamed from: cg.k$a0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$a0.class */
    public static final class a0<K, V> extends c0<K, V> {

        /* renamed from: e */
        public volatile long f7334e;

        /* renamed from: f */
        public o<K, V> f7335f;

        /* renamed from: g */
        public o<K, V> f7336g;

        public a0(ReferenceQueue<K> referenceQueue, K k10, int i10, o<K, V> oVar) {
            super(referenceQueue, k10, i10, oVar);
            this.f7334e = Long.MAX_VALUE;
            this.f7335f = ConcurrentMapC1098k.m6549q();
            this.f7336g = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            return this.f7334e;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInAccessQueue() {
            return this.f7335f;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInAccessQueue() {
            return this.f7336g;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
            this.f7334e = j10;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<K, V> oVar) {
            this.f7335f = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<K, V> oVar) {
            this.f7336g = oVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$b.class
     */
    /* renamed from: cg.k$b */
    /* loaded from: combined.jar:classes2.jar:cg/k$b.class */
    public final class b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new HashSet().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$b0.class
     */
    /* renamed from: cg.k$b0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$b0.class */
    public static final class b0<K, V> extends c0<K, V> {

        /* renamed from: e */
        public volatile long f7337e;

        /* renamed from: f */
        public o<K, V> f7338f;

        /* renamed from: g */
        public o<K, V> f7339g;

        /* renamed from: h */
        public volatile long f7340h;

        /* renamed from: i */
        public o<K, V> f7341i;

        /* renamed from: j */
        public o<K, V> f7342j;

        public b0(ReferenceQueue<K> referenceQueue, K k10, int i10, o<K, V> oVar) {
            super(referenceQueue, k10, i10, oVar);
            this.f7337e = Long.MAX_VALUE;
            this.f7338f = ConcurrentMapC1098k.m6549q();
            this.f7339g = ConcurrentMapC1098k.m6549q();
            this.f7340h = Long.MAX_VALUE;
            this.f7341i = ConcurrentMapC1098k.m6549q();
            this.f7342j = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            return this.f7337e;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInAccessQueue() {
            return this.f7338f;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInWriteQueue() {
            return this.f7341i;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInAccessQueue() {
            return this.f7339g;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInWriteQueue() {
            return this.f7342j;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            return this.f7340h;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
            this.f7337e = j10;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<K, V> oVar) {
            this.f7338f = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<K, V> oVar) {
            this.f7341i = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<K, V> oVar) {
            this.f7339g = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<K, V> oVar) {
            this.f7342j = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
            this.f7340h = j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$c.class
     */
    /* renamed from: cg.k$c */
    /* loaded from: combined.jar:classes2.jar:cg/k$c.class */
    public abstract class c<T> extends AbstractSet<T> {

        /* renamed from: b */
        public final ConcurrentMap<?, ?> f7343b;

        /* renamed from: c */
        public final ConcurrentMapC1098k f7344c;

        public c(ConcurrentMapC1098k concurrentMapC1098k, ConcurrentMap<?, ?> concurrentMap) {
            this.f7344c = concurrentMapC1098k;
            this.f7343b = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f7343b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f7343b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7343b.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return ConcurrentMapC1098k.m6543E(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC1098k.m6543E(this).toArray(eArr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$c0.class
     */
    /* renamed from: cg.k$c0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$c0.class */
    public static class c0<K, V> extends WeakReference<K> implements o<K, V> {

        /* renamed from: b */
        public final int f7345b;

        /* renamed from: c */
        public final o<K, V> f7346c;

        /* renamed from: d */
        public volatile y<K, V> f7347d;

        public c0(ReferenceQueue<K> referenceQueue, K k10, int i10, o<K, V> oVar) {
            super(k10, referenceQueue);
            this.f7347d = ConcurrentMapC1098k.m6544F();
            this.f7345b = i10;
            this.f7346c = oVar;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public int getHash() {
            return this.f7345b;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public K getKey() {
            return get();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getNext() {
            return this.f7346c;
        }

        public o<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public o<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public o<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public o<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public y<K, V> getValueReference() {
            return this.f7347d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setValueReference(y<K, V> yVar) {
            this.f7347d = yVar;
        }

        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$d.class
     */
    /* renamed from: cg.k$d */
    /* loaded from: combined.jar:classes2.jar:cg/k$d.class */
    public static abstract class d<K, V> implements o<K, V> {
        @Override // cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public y<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<K, V> oVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setValueReference(y<K, V> yVar) {
            throw new UnsupportedOperationException();
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$d0.class
     */
    /* renamed from: cg.k$d0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$d0.class */
    public static class d0<K, V> extends WeakReference<V> implements y<K, V> {

        /* renamed from: b */
        public final o<K, V> f7348b;

        public d0(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            super(v10, referenceQueue);
            this.f7348b = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: a */
        public void mo6577a(V v10) {
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: b */
        public boolean mo6578b() {
            return false;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return 1;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return new d0(referenceQueue, v10, oVar);
        }

        @Override // cg.ConcurrentMapC1098k.y
        public o<K, V> getEntry() {
            return this.f7348b;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$e.class
     */
    /* renamed from: cg.k$e */
    /* loaded from: combined.jar:classes2.jar:cg/k$e.class */
    public static final class e<K, V> extends AbstractQueue<o<K, V>> {

        /* renamed from: b */
        public final o<K, V> f7349b = new a(this);

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$e$a.class
         */
        /* renamed from: cg.k$e$a */
        /* loaded from: combined.jar:classes2.jar:cg/k$e$a.class */
        public class a extends d<K, V> {

            /* renamed from: b */
            public o<K, V> f7350b = this;

            /* renamed from: c */
            public o<K, V> f7351c = this;

            /* renamed from: d */
            public final e f7352d;

            public a(e eVar) {
                this.f7352d = eVar;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public o<K, V> getNextInAccessQueue() {
                return this.f7350b;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public o<K, V> getPreviousInAccessQueue() {
                return this.f7351c;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setAccessTime(long j10) {
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setNextInAccessQueue(o<K, V> oVar) {
                this.f7350b = oVar;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setPreviousInAccessQueue(o<K, V> oVar) {
                this.f7351c = oVar;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$e$b.class
         */
        /* renamed from: cg.k$e$b */
        /* loaded from: combined.jar:classes2.jar:cg/k$e$b.class */
        public class b extends AbstractC1089b<o<K, V>> {

            /* renamed from: c */
            public final e f7353c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, o oVar) {
                super(oVar);
                this.f7353c = eVar;
            }

            @Override // cg.AbstractC1089b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o<K, V> mo6510a(o<K, V> oVar) {
                o<K, V> nextInAccessQueue = oVar.getNextInAccessQueue();
                o<K, V> oVar2 = nextInAccessQueue;
                if (nextInAccessQueue == this.f7353c.f7349b) {
                    oVar2 = null;
                }
                return oVar2;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(o<K, V> oVar) {
            ConcurrentMapC1098k.m6546c(oVar.getPreviousInAccessQueue(), oVar.getNextInAccessQueue());
            ConcurrentMapC1098k.m6546c(this.f7349b.getPreviousInAccessQueue(), oVar);
            ConcurrentMapC1098k.m6546c(oVar, this.f7349b);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o<K, V> nextInAccessQueue = this.f7349b.getNextInAccessQueue();
            while (true) {
                o<K, V> oVar = nextInAccessQueue;
                o<K, V> oVar2 = this.f7349b;
                if (oVar == oVar2) {
                    oVar2.setNextInAccessQueue(oVar2);
                    o<K, V> oVar3 = this.f7349b;
                    oVar3.setPreviousInAccessQueue(oVar3);
                    return;
                } else {
                    o<K, V> nextInAccessQueue2 = oVar.getNextInAccessQueue();
                    ConcurrentMapC1098k.m6550r(oVar);
                    nextInAccessQueue = nextInAccessQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((o) obj).getNextInAccessQueue() != n.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o<K, V> peek() {
            o<K, V> nextInAccessQueue = this.f7349b.getNextInAccessQueue();
            o<K, V> oVar = nextInAccessQueue;
            if (nextInAccessQueue == this.f7349b) {
                oVar = null;
            }
            return oVar;
        }

        @Override // java.util.Queue
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public o<K, V> poll() {
            o<K, V> nextInAccessQueue = this.f7349b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f7349b) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f7349b.getNextInAccessQueue() == this.f7349b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<o<K, V>> iterator() {
            return new b(this, peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o<K, V> previousInAccessQueue = oVar.getPreviousInAccessQueue();
            o<K, V> nextInAccessQueue = oVar.getNextInAccessQueue();
            ConcurrentMapC1098k.m6546c(previousInAccessQueue, nextInAccessQueue);
            ConcurrentMapC1098k.m6550r(oVar);
            return nextInAccessQueue != n.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (o<K, V> nextInAccessQueue = this.f7349b.getNextInAccessQueue(); nextInAccessQueue != this.f7349b; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i10++;
            }
            return i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$e0.class
     */
    /* renamed from: cg.k$e0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$e0.class */
    public static final class e0<K, V> extends c0<K, V> {

        /* renamed from: e */
        public volatile long f7354e;

        /* renamed from: f */
        public o<K, V> f7355f;

        /* renamed from: g */
        public o<K, V> f7356g;

        public e0(ReferenceQueue<K> referenceQueue, K k10, int i10, o<K, V> oVar) {
            super(referenceQueue, k10, i10, oVar);
            this.f7354e = Long.MAX_VALUE;
            this.f7355f = ConcurrentMapC1098k.m6549q();
            this.f7356g = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInWriteQueue() {
            return this.f7355f;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInWriteQueue() {
            return this.f7356g;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            return this.f7354e;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<K, V> oVar) {
            this.f7355f = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<K, V> oVar) {
            this.f7356g = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.c0, cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
            this.f7354e = j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$f.class
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Found several "values" enum fields: [] */
    /* renamed from: cg.k$f */
    /* loaded from: combined.jar:classes2.jar:cg/k$f.class */
    public static abstract class f {
        private static final f[] $VALUES;
        public static final int ACCESS_MASK = 1;
        public static final f STRONG;
        public static final f STRONG_ACCESS;
        public static final f STRONG_ACCESS_WRITE;
        public static final f STRONG_WRITE;
        public static final f WEAK;
        public static final f WEAK_ACCESS;
        public static final f WEAK_ACCESS_WRITE;
        public static final int WEAK_MASK = 4;
        public static final f WEAK_WRITE;
        public static final int WRITE_MASK = 2;
        public static final f[] factories;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$a.class
         */
        /* renamed from: cg.k$f$a */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$a.class */
        public enum a extends f {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new u(k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$b.class
         */
        /* renamed from: cg.k$f$b */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$b.class */
        public enum b extends f {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new s(k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$c.class
         */
        /* renamed from: cg.k$f$c */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$c.class */
        public enum c extends f {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyWriteEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new w(k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$d.class
         */
        /* renamed from: cg.k$f$d */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$d.class */
        public enum d extends f {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, copyEntry);
                copyWriteEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new t(k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$e.class
         */
        /* renamed from: cg.k$f$e */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$e.class */
        public enum e extends f {
            public e(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new c0(pVar.f7391i, k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$f.class
         */
        /* renamed from: cg.k$f$f, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$f.class */
        public enum C10261f extends f {
            public C10261f(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new a0(pVar.f7391i, k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$g.class
         */
        /* renamed from: cg.k$f$g */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$g.class */
        public enum g extends f {
            public g(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyWriteEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new e0(pVar.f7391i, k10, i10, oVar);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$f$h.class
         */
        /* renamed from: cg.k$f$h */
        /* loaded from: combined.jar:classes2.jar:cg/k$f$h.class */
        public enum h extends f {
            public h(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
                o<K, V> copyEntry = super.copyEntry(pVar, oVar, oVar2);
                copyAccessEntry(oVar, copyEntry);
                copyWriteEntry(oVar, copyEntry);
                return copyEntry;
            }

            @Override // cg.ConcurrentMapC1098k.f
            public <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar) {
                return new b0(pVar.f7391i, k10, i10, oVar);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            STRONG_ACCESS = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            STRONG_WRITE = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e("WEAK", 4);
            WEAK = eVar;
            C10261f c10261f = new C10261f("WEAK_ACCESS", 5);
            WEAK_ACCESS = c10261f;
            g gVar = new g("WEAK_WRITE", 6);
            WEAK_WRITE = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = new f[]{aVar, bVar, cVar, dVar, eVar, c10261f, gVar, hVar};
            factories = new f[]{aVar, bVar, cVar, dVar, eVar, c10261f, gVar, hVar};
        }

        private f(String str, int i10) {
        }

        public /* synthetic */ f(String str, int i10, a aVar) {
            this(str, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static f getFactory(r rVar, boolean z10, boolean z11) {
            byte b10 = false;
            byte b11 = rVar == r.WEAK ? 4 : false;
            if (z11) {
                b10 = 2;
            }
            return factories[(b11 == true ? 1 : 0) | (z10 ? 1 : 0) | (b10 == true ? 1 : 0)];
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        public <K, V> void copyAccessEntry(o<K, V> oVar, o<K, V> oVar2) {
            oVar2.setAccessTime(oVar.getAccessTime());
            ConcurrentMapC1098k.m6546c(oVar.getPreviousInAccessQueue(), oVar2);
            ConcurrentMapC1098k.m6546c(oVar2, oVar.getNextInAccessQueue());
            ConcurrentMapC1098k.m6550r(oVar);
        }

        public <K, V> o<K, V> copyEntry(p<K, V> pVar, o<K, V> oVar, o<K, V> oVar2) {
            return newEntry(pVar, oVar.getKey(), oVar.getHash(), oVar2);
        }

        public <K, V> void copyWriteEntry(o<K, V> oVar, o<K, V> oVar2) {
            oVar2.setWriteTime(oVar.getWriteTime());
            ConcurrentMapC1098k.m6547d(oVar.getPreviousInWriteQueue(), oVar2);
            ConcurrentMapC1098k.m6547d(oVar2, oVar.getNextInWriteQueue());
            ConcurrentMapC1098k.m6551s(oVar);
        }

        public abstract <K, V> o<K, V> newEntry(p<K, V> pVar, K k10, int i10, o<K, V> oVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$f0.class
     */
    /* renamed from: cg.k$f0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$f0.class */
    public static final class f0<K, V> extends q<K, V> {

        /* renamed from: c */
        public final int f7357c;

        public f0(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar, int i10) {
            super(referenceQueue, v10, oVar);
            this.f7357c = i10;
        }

        @Override // cg.ConcurrentMapC1098k.q, cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return this.f7357c;
        }

        @Override // cg.ConcurrentMapC1098k.q, cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return new f0(referenceQueue, v10, oVar, this.f7357c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$g.class
     */
    /* renamed from: cg.k$g */
    /* loaded from: combined.jar:classes2.jar:cg/k$g.class */
    public final class g extends ConcurrentMapC1098k<K, V>.i<Map.Entry<K, V>> {

        /* renamed from: j */
        public final ConcurrentMapC1098k f7358j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ConcurrentMapC1098k concurrentMapC1098k) {
            super(concurrentMapC1098k);
            this.f7358j = concurrentMapC1098k;
        }

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return m6588c();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$g0.class
     */
    /* renamed from: cg.k$g0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$g0.class */
    public static final class g0<K, V> extends v<K, V> {

        /* renamed from: c */
        public final int f7359c;

        public g0(V v10, int i10) {
            super(v10);
            this.f7359c = i10;
        }

        @Override // cg.ConcurrentMapC1098k.v, cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return this.f7359c;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$h.class
     */
    /* renamed from: cg.k$h */
    /* loaded from: combined.jar:classes2.jar:cg/k$h.class */
    public final class h extends ConcurrentMapC1098k<K, V>.c<Map.Entry<K, V>> {

        /* renamed from: d */
        public final ConcurrentMapC1098k f7360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ConcurrentMapC1098k concurrentMapC1098k, ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMapC1098k, concurrentMap);
            this.f7360d = concurrentMapC1098k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null) {
                return false;
            }
            Object obj2 = this.f7360d.get(key);
            boolean z10 = false;
            if (obj2 != null) {
                z10 = false;
                if (this.f7360d.f7319g.m6538d(entry.getValue(), obj2)) {
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g(this.f7360d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            boolean z10 = false;
            if (key != null) {
                z10 = false;
                if (this.f7360d.remove(key, entry.getValue())) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$h0.class
     */
    /* renamed from: cg.k$h0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$h0.class */
    public static final class h0<K, V> extends d0<K, V> {

        /* renamed from: c */
        public final int f7361c;

        public h0(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar, int i10) {
            super(referenceQueue, v10, oVar);
            this.f7361c = i10;
        }

        @Override // cg.ConcurrentMapC1098k.d0, cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return this.f7361c;
        }

        @Override // cg.ConcurrentMapC1098k.d0, cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return new h0(referenceQueue, v10, oVar, this.f7361c);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$i.class
     */
    /* renamed from: cg.k$i */
    /* loaded from: combined.jar:classes2.jar:cg/k$i.class */
    public abstract class i<T> implements Iterator<T> {

        /* renamed from: b */
        public int f7362b;

        /* renamed from: c */
        public int f7363c = -1;

        /* renamed from: d */
        public p<K, V> f7364d;

        /* renamed from: e */
        public AtomicReferenceArray<o<K, V>> f7365e;

        /* renamed from: f */
        public o<K, V> f7366f;

        /* renamed from: g */
        public ConcurrentMapC1098k<K, V>.j0 f7367g;

        /* renamed from: h */
        public ConcurrentMapC1098k<K, V>.j0 f7368h;

        /* renamed from: i */
        public final ConcurrentMapC1098k f7369i;

        public i(ConcurrentMapC1098k concurrentMapC1098k) {
            this.f7369i = concurrentMapC1098k;
            this.f7362b = concurrentMapC1098k.f7316d.length - 1;
            m6586a();
        }

        /* renamed from: a */
        public final void m6586a() {
            this.f7367g = null;
            if (m6589d() || m6590e()) {
                return;
            }
            while (true) {
                int i10 = this.f7362b;
                if (i10 < 0) {
                    return;
                }
                p<K, V>[] pVarArr = this.f7369i.f7316d;
                this.f7362b = i10 - 1;
                p<K, V> pVar = pVarArr[i10];
                this.f7364d = pVar;
                if (pVar.f7385c != 0) {
                    AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7364d.f7389g;
                    this.f7365e = atomicReferenceArray;
                    this.f7363c = atomicReferenceArray.length() - 1;
                    if (m6590e()) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean m6587b(o<K, V> oVar) {
            boolean z10;
            try {
                long mo6533a = this.f7369i.f7329q.mo6533a();
                K key = oVar.getKey();
                Object m6566l = this.f7369i.m6566l(oVar, mo6533a);
                if (m6566l != null) {
                    this.f7367g = new j0(this.f7369i, key, m6566l);
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f7364d.m6602C();
                return z10;
            } catch (Throwable th2) {
                this.f7364d.m6602C();
                throw th2;
            }
        }

        /* renamed from: c */
        public ConcurrentMapC1098k<K, V>.j0 m6588c() {
            ConcurrentMapC1098k<K, V>.j0 j0Var = this.f7367g;
            if (j0Var == null) {
                throw new NoSuchElementException();
            }
            this.f7368h = j0Var;
            m6586a();
            return this.f7368h;
        }

        /* renamed from: d */
        public boolean m6589d() {
            o<K, V> oVar = this.f7366f;
            if (oVar == null) {
                return false;
            }
            while (true) {
                this.f7366f = oVar.getNext();
                o<K, V> oVar2 = this.f7366f;
                if (oVar2 == null) {
                    return false;
                }
                if (m6587b(oVar2)) {
                    return true;
                }
                oVar = this.f7366f;
            }
        }

        /* renamed from: e */
        public boolean m6590e() {
            while (true) {
                int i10 = this.f7363c;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7365e;
                this.f7363c = i10 - 1;
                o<K, V> oVar = atomicReferenceArray.get(i10);
                this.f7366f = oVar;
                if (oVar != null && (m6587b(oVar) || m6589d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7367g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            C1102o.m6667c(this.f7368h != null);
            this.f7369i.remove(this.f7368h.getKey());
            this.f7368h = null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$i0.class
     */
    /* renamed from: cg.k$i0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$i0.class */
    public static final class i0<K, V> extends AbstractQueue<o<K, V>> {

        /* renamed from: b */
        public final o<K, V> f7370b = new a(this);

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$i0$a.class
         */
        /* renamed from: cg.k$i0$a */
        /* loaded from: combined.jar:classes2.jar:cg/k$i0$a.class */
        public class a extends d<K, V> {

            /* renamed from: b */
            public o<K, V> f7371b = this;

            /* renamed from: c */
            public o<K, V> f7372c = this;

            /* renamed from: d */
            public final i0 f7373d;

            public a(i0 i0Var) {
                this.f7373d = i0Var;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public o<K, V> getNextInWriteQueue() {
                return this.f7371b;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public o<K, V> getPreviousInWriteQueue() {
                return this.f7372c;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setNextInWriteQueue(o<K, V> oVar) {
                this.f7371b = oVar;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setPreviousInWriteQueue(o<K, V> oVar) {
                this.f7372c = oVar;
            }

            @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
            public void setWriteTime(long j10) {
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$i0$b.class
         */
        /* renamed from: cg.k$i0$b */
        /* loaded from: combined.jar:classes2.jar:cg/k$i0$b.class */
        public class b extends AbstractC1089b<o<K, V>> {

            /* renamed from: c */
            public final i0 f7374c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i0 i0Var, o oVar) {
                super(oVar);
                this.f7374c = i0Var;
            }

            @Override // cg.AbstractC1089b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o<K, V> mo6510a(o<K, V> oVar) {
                o<K, V> nextInWriteQueue = oVar.getNextInWriteQueue();
                o<K, V> oVar2 = nextInWriteQueue;
                if (nextInWriteQueue == this.f7374c.f7370b) {
                    oVar2 = null;
                }
                return oVar2;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(o<K, V> oVar) {
            ConcurrentMapC1098k.m6547d(oVar.getPreviousInWriteQueue(), oVar.getNextInWriteQueue());
            ConcurrentMapC1098k.m6547d(this.f7370b.getPreviousInWriteQueue(), oVar);
            ConcurrentMapC1098k.m6547d(oVar, this.f7370b);
            return true;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o<K, V> nextInWriteQueue = this.f7370b.getNextInWriteQueue();
            while (true) {
                o<K, V> oVar = nextInWriteQueue;
                o<K, V> oVar2 = this.f7370b;
                if (oVar == oVar2) {
                    oVar2.setNextInWriteQueue(oVar2);
                    o<K, V> oVar3 = this.f7370b;
                    oVar3.setPreviousInWriteQueue(oVar3);
                    return;
                } else {
                    o<K, V> nextInWriteQueue2 = oVar.getNextInWriteQueue();
                    ConcurrentMapC1098k.m6551s(oVar);
                    nextInWriteQueue = nextInWriteQueue2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((o) obj).getNextInWriteQueue() != n.INSTANCE;
        }

        @Override // java.util.Queue
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o<K, V> peek() {
            o<K, V> nextInWriteQueue = this.f7370b.getNextInWriteQueue();
            o<K, V> oVar = nextInWriteQueue;
            if (nextInWriteQueue == this.f7370b) {
                oVar = null;
            }
            return oVar;
        }

        @Override // java.util.Queue
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public o<K, V> poll() {
            o<K, V> nextInWriteQueue = this.f7370b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f7370b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f7370b.getNextInWriteQueue() == this.f7370b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<o<K, V>> iterator() {
            return new b(this, peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            o oVar = (o) obj;
            o<K, V> previousInWriteQueue = oVar.getPreviousInWriteQueue();
            o<K, V> nextInWriteQueue = oVar.getNextInWriteQueue();
            ConcurrentMapC1098k.m6547d(previousInWriteQueue, nextInWriteQueue);
            ConcurrentMapC1098k.m6551s(oVar);
            return nextInWriteQueue != n.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i10 = 0;
            for (o<K, V> nextInWriteQueue = this.f7370b.getNextInWriteQueue(); nextInWriteQueue != this.f7370b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i10++;
            }
            return i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$j.class
     */
    /* renamed from: cg.k$j */
    /* loaded from: combined.jar:classes2.jar:cg/k$j.class */
    public final class j extends ConcurrentMapC1098k<K, V>.i<K> {

        /* renamed from: j */
        public final ConcurrentMapC1098k f7375j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ConcurrentMapC1098k concurrentMapC1098k) {
            super(concurrentMapC1098k);
            this.f7375j = concurrentMapC1098k;
        }

        @Override // java.util.Iterator
        public K next() {
            return m6588c().getKey();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$j0.class
     */
    /* renamed from: cg.k$j0 */
    /* loaded from: combined.jar:classes2.jar:cg/k$j0.class */
    public final class j0 implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f7376b;

        /* renamed from: c */
        public V f7377c;

        /* renamed from: d */
        public final ConcurrentMapC1098k f7378d;

        public j0(ConcurrentMapC1098k concurrentMapC1098k, K k10, V v10) {
            this.f7378d = concurrentMapC1098k;
            this.f7376b = k10;
            this.f7377c = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                z10 = false;
                if (this.f7376b.equals(entry.getKey())) {
                    z10 = false;
                    if (this.f7377c.equals(entry.getValue())) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7376b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7377c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f7376b.hashCode() ^ this.f7377c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$k.class
     */
    /* renamed from: cg.k$k */
    /* loaded from: combined.jar:classes2.jar:cg/k$k.class */
    public final class k extends ConcurrentMapC1098k<K, V>.c<K> {

        /* renamed from: d */
        public final ConcurrentMapC1098k f7379d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ConcurrentMapC1098k concurrentMapC1098k, ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMapC1098k, concurrentMap);
            this.f7379d = concurrentMapC1098k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7343b.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(this.f7379d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.f7343b.remove(obj) != null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$l.class
     */
    /* renamed from: cg.k$l */
    /* loaded from: combined.jar:classes2.jar:cg/k$l.class */
    public static class l<K, V> implements y<K, V> {

        /* renamed from: b */
        public volatile y<K, V> f7380b;

        /* renamed from: c */
        public final C1106s<V> f7381c;

        /* renamed from: d */
        public final C1107t f7382d;

        public l() {
            this(ConcurrentMapC1098k.m6544F());
        }

        public l(y<K, V> yVar) {
            this.f7381c = C1106s.m6670w();
            this.f7382d = C1107t.m6673c();
            this.f7380b = yVar;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: a */
        public void mo6577a(V v10) {
            if (v10 != null) {
                m6598h(v10);
            } else {
                this.f7380b = ConcurrentMapC1098k.m6544F();
            }
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: b */
        public boolean mo6578b() {
            return true;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return this.f7380b.mo6579c();
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return this;
        }

        /* renamed from: e */
        public final InterfaceFutureC1097j<V> m6595e(Throwable th2) {
            return C1096i.m6540a(th2);
        }

        /* renamed from: f */
        public y<K, V> m6596f() {
            return this.f7380b;
        }

        /* renamed from: g */
        public InterfaceFutureC1097j<V> m6597g(K k10, AbstractC1093f<? super K, V> abstractC1093f) {
            try {
                this.f7382d.m6675e();
                this.f7380b.get().getClass();
                throw null;
            } catch (Throwable th2) {
                InterfaceFutureC1097j<V> m6595e = m6599i(th2) ? this.f7381c : m6595e(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return m6595e;
            }
        }

        @Override // cg.ConcurrentMapC1098k.y
        public V get() {
            return this.f7380b.get();
        }

        @Override // cg.ConcurrentMapC1098k.y
        public o<K, V> getEntry() {
            return null;
        }

        /* renamed from: h */
        public boolean m6598h(V v10) {
            return this.f7381c.mo6501u(v10);
        }

        /* renamed from: i */
        public boolean m6599i(Throwable th2) {
            return this.f7381c.mo6502v(th2);
        }

        @Override // cg.ConcurrentMapC1098k.y
        public boolean isActive() {
            return this.f7380b.isActive();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$m.class
     */
    /* renamed from: cg.k$m */
    /* loaded from: combined.jar:classes2.jar:cg/k$m.class */
    public static class m<K, V> implements InterfaceC1091d<K, V>, Serializable {

        /* renamed from: b */
        public final ConcurrentMapC1098k<K, V> f7383b;

        public m(C1092e<? super K, ? super V> c1092e) {
            this(new ConcurrentMapC1098k(c1092e, null));
        }

        public m(ConcurrentMapC1098k<K, V> concurrentMapC1098k) {
            this.f7383b = concurrentMapC1098k;
        }

        @Override // cg.InterfaceC1091d
        /* renamed from: a */
        public void mo6513a(Object obj) {
            C1102o.m6665a(obj);
            this.f7383b.remove(obj);
        }

        @Override // cg.InterfaceC1091d
        /* renamed from: b */
        public V mo6514b(Object obj) {
            return this.f7383b.m6565k(obj);
        }

        @Override // cg.InterfaceC1091d
        /* renamed from: c */
        public void mo6515c() {
            this.f7383b.clear();
        }

        @Override // cg.InterfaceC1091d
        public void put(K k10, V v10) {
            this.f7383b.put(k10, v10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$n.class
     */
    /* renamed from: cg.k$n */
    /* loaded from: combined.jar:classes2.jar:cg/k$n.class */
    public enum n implements o<Object, Object> {
        INSTANCE;

        @Override // cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            return 0L;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public int getHash() {
            return 0;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public Object getKey() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<Object, Object> getNext() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public o<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public y<Object, Object> getValueReference() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            return 0L;
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<Object, Object> oVar) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<Object, Object> oVar) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<Object, Object> oVar) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<Object, Object> oVar) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setValueReference(y<Object, Object> yVar) {
        }

        @Override // cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$o.class
     */
    /* renamed from: cg.k$o */
    /* loaded from: combined.jar:classes2.jar:cg/k$o.class */
    public interface o<K, V> {
        long getAccessTime();

        int getHash();

        K getKey();

        o<K, V> getNext();

        o<K, V> getNextInAccessQueue();

        o<K, V> getNextInWriteQueue();

        o<K, V> getPreviousInAccessQueue();

        o<K, V> getPreviousInWriteQueue();

        y<K, V> getValueReference();

        long getWriteTime();

        void setAccessTime(long j10);

        void setNextInAccessQueue(o<K, V> oVar);

        void setNextInWriteQueue(o<K, V> oVar);

        void setPreviousInAccessQueue(o<K, V> oVar);

        void setPreviousInWriteQueue(o<K, V> oVar);

        void setValueReference(y<K, V> yVar);

        void setWriteTime(long j10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$p.class
     */
    /* renamed from: cg.k$p */
    /* loaded from: combined.jar:classes2.jar:cg/k$p.class */
    public static class p<K, V> extends ReentrantLock {

        /* renamed from: b */
        public final ConcurrentMapC1098k<K, V> f7384b;

        /* renamed from: c */
        public volatile int f7385c;

        /* renamed from: d */
        public long f7386d;

        /* renamed from: e */
        public int f7387e;

        /* renamed from: f */
        public int f7388f;

        /* renamed from: g */
        public volatile AtomicReferenceArray<o<K, V>> f7389g;

        /* renamed from: h */
        public final long f7390h;

        /* renamed from: i */
        public final ReferenceQueue<K> f7391i;

        /* renamed from: j */
        public final ReferenceQueue<V> f7392j;

        /* renamed from: k */
        public final Queue<o<K, V>> f7393k;

        /* renamed from: l */
        public final AtomicInteger f7394l = new AtomicInteger();

        /* renamed from: m */
        public final Queue<o<K, V>> f7395m;

        /* renamed from: n */
        public final Queue<o<K, V>> f7396n;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$p$a.class
         */
        /* renamed from: cg.k$p$a */
        /* loaded from: combined.jar:classes2.jar:cg/k$p$a.class */
        public class a implements Runnable {

            /* renamed from: b */
            public final Object f7397b;

            /* renamed from: c */
            public final int f7398c;

            /* renamed from: d */
            public final l f7399d;

            /* renamed from: e */
            public final InterfaceFutureC1097j f7400e;

            /* renamed from: f */
            public final p f7401f;

            public a(p pVar, Object obj, int i10, l lVar, InterfaceFutureC1097j interfaceFutureC1097j) {
                this.f7401f = pVar;
                this.f7397b = obj;
                this.f7398c = i10;
                this.f7399d = lVar;
                this.f7400e = interfaceFutureC1097j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f7401f.m6645r(this.f7397b, this.f7398c, this.f7399d, this.f7400e);
                } catch (Throwable th2) {
                    ConcurrentMapC1098k.f7311v.log(Level.WARNING, "Exception thrown during refresh", th2);
                    this.f7399d.m6599i(th2);
                }
            }
        }

        public p(ConcurrentMapC1098k<K, V> concurrentMapC1098k, int i10, long j10) {
            this.f7384b = concurrentMapC1098k;
            this.f7390h = j10;
            m6651x(m6601B(i10));
            this.f7391i = concurrentMapC1098k.m6556I() ? new ReferenceQueue<>() : null;
            this.f7392j = concurrentMapC1098k.m6557J() ? new ReferenceQueue<>() : null;
            this.f7393k = concurrentMapC1098k.m6555H() ? new ConcurrentLinkedQueue() : ConcurrentMapC1098k.m6548g();
            this.f7395m = concurrentMapC1098k.m6559L() ? new i0() : ConcurrentMapC1098k.m6548g();
            this.f7396n = concurrentMapC1098k.m6555H() ? new e() : ConcurrentMapC1098k.m6548g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: A */
        public o<K, V> m6600A(K k10, int i10, o<K, V> oVar) {
            return this.f7384b.f7330r.newEntry(this, C1102o.m6665a(k10), i10, oVar);
        }

        /* renamed from: B */
        public AtomicReferenceArray<o<K, V>> m6601B(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        /* renamed from: C */
        public void m6602C() {
            if ((this.f7394l.incrementAndGet() & 63) == 0) {
                m6626a();
            }
        }

        /* renamed from: D */
        public void m6603D() {
            m6622W();
        }

        /* renamed from: E */
        public void m6604E(long j10) {
            m6621V(j10);
        }

        /* renamed from: F */
        public V m6605F(K k10, int i10, V v10, boolean z10) {
            int i11;
            lock();
            try {
                long mo6533a = this.f7384b.f7329q.mo6533a();
                m6604E(mo6533a);
                if (this.f7385c + 1 > this.f7388f) {
                    m6642o();
                }
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                o<K, V> oVar = atomicReferenceArray.get(length);
                o<K, V> oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        this.f7387e++;
                        o<K, V> m6600A = m6600A(k10, i10, oVar);
                        m6624Y(m6600A, k10, v10, mo6533a);
                        atomicReferenceArray.set(length, m6600A);
                        this.f7385c++;
                        m6641n(m6600A);
                        break;
                    }
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        y<K, V> valueReference = oVar2.getValueReference();
                        V v11 = valueReference.get();
                        if (v11 != null) {
                            if (z10) {
                                m6608I(oVar2, mo6533a);
                            } else {
                                this.f7387e++;
                                m6640m(k10, i10, valueReference, EnumC1103p.REPLACED);
                                m6624Y(oVar2, k10, v10, mo6533a);
                                m6641n(oVar2);
                            }
                            return v11;
                        }
                        this.f7387e++;
                        if (valueReference.isActive()) {
                            m6640m(k10, i10, valueReference, EnumC1103p.COLLECTED);
                            m6624Y(oVar2, k10, v10, mo6533a);
                            i11 = this.f7385c;
                        } else {
                            m6624Y(oVar2, k10, v10, mo6533a);
                            i11 = this.f7385c + 1;
                        }
                        this.f7385c = i11;
                        m6641n(oVar2);
                    } else {
                        oVar2 = oVar2.getNext();
                    }
                }
                unlock();
                m6603D();
                return null;
            } finally {
                unlock();
                m6603D();
            }
        }

        /* renamed from: G */
        public boolean m6606G(o<K, V> oVar, int i10) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                o<K, V> oVar2 = atomicReferenceArray.get(length);
                for (o<K, V> oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.getNext()) {
                    if (oVar3 == oVar) {
                        this.f7387e++;
                        o<K, V> m6618S = m6618S(oVar2, oVar3, oVar3.getKey(), i10, oVar3.getValueReference(), EnumC1103p.COLLECTED);
                        int i11 = this.f7385c;
                        atomicReferenceArray.set(length, m6618S);
                        this.f7385c = i11 - 1;
                        unlock();
                        m6603D();
                        return true;
                    }
                }
                unlock();
                m6603D();
                return false;
            } catch (Throwable th2) {
                unlock();
                m6603D();
                throw th2;
            }
        }

        /* renamed from: H */
        public boolean m6607H(K k10, int i10, y<K, V> yVar) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                o<K, V> oVar = atomicReferenceArray.get(length);
                for (o<K, V> oVar2 = oVar; oVar2 != null; oVar2 = oVar2.getNext()) {
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        if (oVar2.getValueReference() != yVar) {
                            unlock();
                            if (isHeldByCurrentThread()) {
                                return false;
                            }
                            m6603D();
                            return false;
                        }
                        this.f7387e++;
                        o<K, V> m6618S = m6618S(oVar, oVar2, key, i10, yVar, EnumC1103p.COLLECTED);
                        int i11 = this.f7385c;
                        atomicReferenceArray.set(length, m6618S);
                        this.f7385c = i11 - 1;
                    }
                }
                unlock();
                if (isHeldByCurrentThread()) {
                    return false;
                }
                m6603D();
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m6603D();
                }
            }
        }

        /* renamed from: I */
        public void m6608I(o<K, V> oVar, long j10) {
            if (this.f7384b.m6574w()) {
                oVar.setAccessTime(j10);
            }
            this.f7396n.add(oVar);
        }

        /* renamed from: J */
        public void m6609J(o<K, V> oVar, long j10) {
            if (this.f7384b.m6574w()) {
                oVar.setAccessTime(j10);
            }
            this.f7393k.add(oVar);
        }

        /* renamed from: K */
        public void m6610K(o<K, V> oVar, int i10, long j10) {
            m6636i();
            this.f7386d += i10;
            if (this.f7384b.m6574w()) {
                oVar.setAccessTime(j10);
            }
            if (this.f7384b.m6576z()) {
                oVar.setWriteTime(j10);
            }
            this.f7396n.add(oVar);
            this.f7395m.add(oVar);
        }

        /* renamed from: L */
        public V m6611L(K k10, int i10, AbstractC1093f<? super K, V> abstractC1093f, boolean z10) {
            l<K, V> m6652y = m6652y(k10, i10, z10);
            if (m6652y == null) {
                return null;
            }
            InterfaceFutureC1097j<V> m6653z = m6653z(k10, i10, m6652y, abstractC1093f);
            if (!m6653z.isDone()) {
                return null;
            }
            try {
                return (V) C1109v.m6677a(m6653z);
            } catch (Throwable th2) {
                return null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            r0 = r12.getValueReference();
            r0 = r0.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            if (r0 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            r9 = cg.EnumC1103p.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        
            r8.f7387e++;
            r0 = m6618S(r0, r12, r0, r10, r0, r9);
            r0 = r8.f7385c;
            r0.set(r0, r0);
            r8.f7385c = r0 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (r0.isActive() == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        
            r9 = cg.EnumC1103p.COLLECTED;
         */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V m6612M(java.lang.Object r9, int r10) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.ConcurrentMapC1098k.p.m6612M(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            r0 = r14.getValueReference();
            r0 = r0.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
        
            if (r8.f7384b.f7319g.m6538d(r11, r0) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            r9 = cg.EnumC1103p.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
        
            r8.f7387e++;
            r0 = m6618S(r0, r14, r0, r10, r0, r9);
            r0 = r8.f7385c;
            r0.set(r0, r0);
            r8.f7385c = r0 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
        
            if (r9 != cg.EnumC1103p.EXPLICIT) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
        
            r13 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        
            unlock();
            m6603D();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            if (r0 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        
            if (r0.isActive() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        
            r9 = cg.EnumC1103p.COLLECTED;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m6613N(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.ConcurrentMapC1098k.p.m6613N(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* renamed from: O */
        public void m6614O(o<K, V> oVar) {
            m6639l(oVar, EnumC1103p.COLLECTED);
            this.f7395m.remove(oVar);
            this.f7396n.remove(oVar);
        }

        /* renamed from: P */
        public boolean m6615P(o<K, V> oVar, int i10, EnumC1103p enumC1103p) {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
            int length = (atomicReferenceArray.length() - 1) & i10;
            o<K, V> oVar2 = atomicReferenceArray.get(length);
            o<K, V> oVar3 = oVar2;
            while (true) {
                o<K, V> oVar4 = oVar3;
                if (oVar4 == null) {
                    return false;
                }
                if (oVar4 == oVar) {
                    this.f7387e++;
                    o<K, V> m6618S = m6618S(oVar2, oVar4, oVar4.getKey(), i10, oVar4.getValueReference(), enumC1103p);
                    int i11 = this.f7385c;
                    atomicReferenceArray.set(length, m6618S);
                    this.f7385c = i11 - 1;
                    return true;
                }
                oVar3 = oVar4.getNext();
            }
        }

        /* renamed from: Q */
        public o<K, V> m6616Q(o<K, V> oVar, o<K, V> oVar2) {
            int i10 = this.f7385c;
            o<K, V> next = oVar2.getNext();
            while (oVar != oVar2) {
                o<K, V> m6634g = m6634g(oVar, next);
                if (m6634g != null) {
                    next = m6634g;
                } else {
                    m6614O(oVar);
                    i10--;
                }
                oVar = oVar.getNext();
            }
            this.f7385c = i10;
            return next;
        }

        /* renamed from: R */
        public boolean m6617R(K k10, int i10, l<K, V> lVar) {
            lock();
            try {
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                o<K, V> oVar = atomicReferenceArray.get(length);
                o<K, V> oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    K key = oVar2.getKey();
                    if (oVar2.getHash() != i10 || key == null || !this.f7384b.f7318f.m6538d(k10, key)) {
                        oVar2 = oVar2.getNext();
                    } else if (oVar2.getValueReference() == lVar) {
                        if (lVar.isActive()) {
                            oVar2.setValueReference(lVar.m6596f());
                        } else {
                            atomicReferenceArray.set(length, m6616Q(oVar, oVar2));
                        }
                        unlock();
                        m6603D();
                        return true;
                    }
                }
                unlock();
                m6603D();
                return false;
            } catch (Throwable th2) {
                unlock();
                m6603D();
                throw th2;
            }
        }

        /* renamed from: S */
        public o<K, V> m6618S(o<K, V> oVar, o<K, V> oVar2, K k10, int i10, y<K, V> yVar, EnumC1103p enumC1103p) {
            m6640m(k10, i10, yVar, enumC1103p);
            this.f7395m.remove(oVar2);
            this.f7396n.remove(oVar2);
            if (!yVar.mo6578b()) {
                return m6616Q(oVar, oVar2);
            }
            yVar.mo6577a(null);
            return oVar;
        }

        /* renamed from: T */
        public V m6619T(K k10, int i10, V v10) {
            lock();
            try {
                long mo6533a = this.f7384b.f7329q.mo6533a();
                m6604E(mo6533a);
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                o<K, V> oVar = atomicReferenceArray.get(length);
                o<K, V> oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        y<K, V> valueReference = oVar2.getValueReference();
                        V v11 = valueReference.get();
                        if (v11 != null) {
                            this.f7387e++;
                            m6640m(k10, i10, valueReference, EnumC1103p.REPLACED);
                            m6624Y(oVar2, k10, v10, mo6533a);
                            m6641n(oVar2);
                            return v11;
                        }
                        if (valueReference.isActive()) {
                            this.f7387e++;
                            o<K, V> m6618S = m6618S(oVar, oVar2, key, i10, valueReference, EnumC1103p.COLLECTED);
                            int i11 = this.f7385c;
                            atomicReferenceArray.set(length, m6618S);
                            this.f7385c = i11 - 1;
                        }
                    } else {
                        oVar2 = oVar2.getNext();
                    }
                }
                unlock();
                m6603D();
                return null;
            } finally {
                unlock();
                m6603D();
            }
        }

        /* renamed from: U */
        public boolean m6620U(K k10, int i10, V v10, V v11) {
            lock();
            try {
                long mo6533a = this.f7384b.f7329q.mo6533a();
                m6604E(mo6533a);
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                o<K, V> oVar = atomicReferenceArray.get(length);
                o<K, V> oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        break;
                    }
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        y<K, V> valueReference = oVar2.getValueReference();
                        V v12 = valueReference.get();
                        if (v12 == null) {
                            if (valueReference.isActive()) {
                                this.f7387e++;
                                o<K, V> m6618S = m6618S(oVar, oVar2, key, i10, valueReference, EnumC1103p.COLLECTED);
                                int i11 = this.f7385c;
                                atomicReferenceArray.set(length, m6618S);
                                this.f7385c = i11 - 1;
                            }
                        } else {
                            if (this.f7384b.f7319g.m6538d(v10, v12)) {
                                this.f7387e++;
                                m6640m(k10, i10, valueReference, EnumC1103p.REPLACED);
                                m6624Y(oVar2, k10, v11, mo6533a);
                                m6641n(oVar2);
                                unlock();
                                m6603D();
                                return true;
                            }
                            m6608I(oVar2, mo6533a);
                        }
                    } else {
                        oVar2 = oVar2.getNext();
                    }
                }
                unlock();
                m6603D();
                return false;
            } catch (Throwable th2) {
                unlock();
                m6603D();
                throw th2;
            }
        }

        /* renamed from: V */
        public void m6621V(long j10) {
            if (tryLock()) {
                try {
                    m6637j();
                    m6643p(j10);
                    this.f7394l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: W */
        public void m6622W() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f7384b.m6571t();
        }

        /* renamed from: X */
        public V m6623X(o<K, V> oVar, K k10, int i10, V v10, long j10, AbstractC1093f<? super K, V> abstractC1093f) {
            V m6611L;
            return (!this.f7384b.m6552A() || j10 - oVar.getWriteTime() <= this.f7384b.f7326n || oVar.getValueReference().mo6578b() || (m6611L = m6611L(k10, i10, abstractC1093f, true)) == null) ? v10 : m6611L;
        }

        /* renamed from: Y */
        public void m6624Y(o<K, V> oVar, K k10, V v10, long j10) {
            y<K, V> valueReference = oVar.getValueReference();
            int weigh = this.f7384b.f7323k.weigh(k10, v10);
            C1102o.m6668d(weigh >= 0, "Weights must be non-negative");
            oVar.setValueReference(this.f7384b.f7321i.referenceValue(this, oVar, v10, weigh));
            m6610K(oVar, weigh, j10);
            valueReference.mo6577a(v10);
        }

        /* renamed from: Z */
        public boolean m6625Z(K k10, int i10, l<K, V> lVar, V v10) {
            lock();
            try {
                long mo6533a = this.f7384b.f7329q.mo6533a();
                m6604E(mo6533a);
                int i11 = this.f7385c + 1;
                int i12 = i11;
                if (i11 > this.f7388f) {
                    m6642o();
                    i12 = this.f7385c + 1;
                }
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = i10 & (atomicReferenceArray.length() - 1);
                o<K, V> oVar = atomicReferenceArray.get(length);
                o<K, V> oVar2 = oVar;
                while (true) {
                    if (oVar2 == null) {
                        this.f7387e++;
                        o<K, V> m6600A = m6600A(k10, i10, oVar);
                        m6624Y(m6600A, k10, v10, mo6533a);
                        atomicReferenceArray.set(length, m6600A);
                        this.f7385c = i12;
                        m6641n(m6600A);
                        break;
                    }
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        y<K, V> valueReference = oVar2.getValueReference();
                        V v11 = valueReference.get();
                        if (lVar != valueReference && (v11 != null || valueReference == ConcurrentMapC1098k.f7312w)) {
                            m6640m(k10, i10, new g0(v10, 0), EnumC1103p.REPLACED);
                            unlock();
                            m6603D();
                            return false;
                        }
                        this.f7387e++;
                        int i13 = i12;
                        if (lVar.isActive()) {
                            m6640m(k10, i10, lVar, v11 == null ? EnumC1103p.COLLECTED : EnumC1103p.REPLACED);
                            i13 = i12 - 1;
                        }
                        m6624Y(oVar2, k10, v10, mo6533a);
                        this.f7385c = i13;
                        m6641n(oVar2);
                    } else {
                        oVar2 = oVar2.getNext();
                    }
                }
                unlock();
                m6603D();
                return true;
            } catch (Throwable th2) {
                unlock();
                m6603D();
                throw th2;
            }
        }

        /* renamed from: a */
        public void m6626a() {
            m6621V(this.f7384b.f7329q.mo6533a());
            m6622W();
        }

        /* renamed from: a0 */
        public void m6627a0() {
            if (tryLock()) {
                try {
                    m6637j();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        public void m6628b() {
            if (this.f7385c != 0) {
                lock();
                try {
                    AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        for (o<K, V> oVar = atomicReferenceArray.get(i10); oVar != null; oVar = oVar.getNext()) {
                            if (oVar.getValueReference().isActive()) {
                                m6639l(oVar, EnumC1103p.EXPLICIT);
                            }
                        }
                    }
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    m6631d();
                    this.f7395m.clear();
                    this.f7396n.clear();
                    this.f7394l.set(0);
                    this.f7387e++;
                    this.f7385c = 0;
                } finally {
                    unlock();
                    m6603D();
                }
            }
        }

        /* renamed from: b0 */
        public void m6629b0(long j10) {
            if (tryLock()) {
                try {
                    m6643p(j10);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: c */
        public void m6630c() {
            while (this.f7391i.poll() != null) {
            }
        }

        /* renamed from: d */
        public void m6631d() {
            if (this.f7384b.m6556I()) {
                m6630c();
            }
            if (this.f7384b.m6557J()) {
                m6632e();
            }
        }

        /* renamed from: e */
        public void m6632e() {
            while (this.f7392j.poll() != null) {
            }
        }

        /* renamed from: f */
        public boolean m6633f(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f7385c == 0) {
                    m6602C();
                    return false;
                }
                o<K, V> m6648u = m6648u(obj, i10, this.f7384b.f7329q.mo6533a());
                if (m6648u == null) {
                    m6602C();
                    return false;
                }
                if (m6648u.getValueReference().get() != null) {
                    z10 = true;
                }
                m6602C();
                return z10;
            } catch (Throwable th2) {
                m6602C();
                throw th2;
            }
        }

        /* renamed from: g */
        public o<K, V> m6634g(o<K, V> oVar, o<K, V> oVar2) {
            if (oVar.getKey() == null) {
                return null;
            }
            y<K, V> valueReference = oVar.getValueReference();
            V v10 = valueReference.get();
            if (v10 == null && valueReference.isActive()) {
                return null;
            }
            o<K, V> copyEntry = this.f7384b.f7330r.copyEntry(this, oVar, oVar2);
            copyEntry.setValueReference(valueReference.mo6580d(this.f7392j, v10, copyEntry));
            return copyEntry;
        }

        /* renamed from: h */
        public void m6635h() {
            int i10;
            int i11 = 0;
            do {
                Reference<? extends K> poll = this.f7391i.poll();
                if (poll == null) {
                    return;
                }
                this.f7384b.m6572u((o) poll);
                i10 = i11 + 1;
                i11 = i10;
            } while (i10 != 16);
        }

        /* renamed from: i */
        public void m6636i() {
            while (true) {
                o<K, V> poll = this.f7393k.poll();
                if (poll == null) {
                    return;
                }
                if (this.f7396n.contains(poll)) {
                    this.f7396n.add(poll);
                }
            }
        }

        /* renamed from: j */
        public void m6637j() {
            if (this.f7384b.m6556I()) {
                m6635h();
            }
            if (this.f7384b.m6557J()) {
                m6638k();
            }
        }

        /* renamed from: k */
        public void m6638k() {
            int i10;
            int i11 = 0;
            do {
                Reference<? extends V> poll = this.f7392j.poll();
                if (poll == null) {
                    return;
                }
                this.f7384b.m6573v((y) poll);
                i10 = i11 + 1;
                i11 = i10;
            } while (i10 != 16);
        }

        /* renamed from: l */
        public void m6639l(o<K, V> oVar, EnumC1103p enumC1103p) {
            m6640m(oVar.getKey(), oVar.getHash(), oVar.getValueReference(), enumC1103p);
        }

        /* renamed from: m */
        public void m6640m(K k10, int i10, y<K, V> yVar, EnumC1103p enumC1103p) {
            this.f7386d -= yVar.mo6579c();
            if (this.f7384b.f7327o != ConcurrentMapC1098k.f7313x) {
                this.f7384b.f7327o.offer(C1105r.m6669a(k10, yVar.get(), enumC1103p));
            }
        }

        /* renamed from: n */
        public void m6641n(o<K, V> oVar) {
            if (this.f7384b.m6562h()) {
                m6636i();
                if (oVar.getValueReference().mo6579c() > this.f7390h && !m6615P(oVar, oVar.getHash(), EnumC1103p.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f7386d > this.f7390h) {
                    o<K, V> m6650w = m6650w();
                    if (!m6615P(m6650w, m6650w.getHash(), EnumC1103p.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        /* renamed from: o */
        public void m6642o() {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f7385c;
            AtomicReferenceArray<o<K, V>> m6601B = m6601B(length << 1);
            this.f7388f = (m6601B.length() * 3) / 4;
            int length2 = m6601B.length() - 1;
            int i11 = 0;
            while (i11 < length) {
                o<K, V> oVar = atomicReferenceArray.get(i11);
                int i12 = i10;
                if (oVar != null) {
                    o<K, V> next = oVar.getNext();
                    int hash = oVar.getHash() & length2;
                    if (next == null) {
                        m6601B.set(hash, oVar);
                        i12 = i10;
                    } else {
                        o<K, V> oVar2 = oVar;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            int i13 = hash;
                            if (hash2 != hash) {
                                oVar2 = next;
                                i13 = hash2;
                            }
                            next = next.getNext();
                            hash = i13;
                        }
                        m6601B.set(hash, oVar2);
                        while (true) {
                            i12 = i10;
                            if (oVar != oVar2) {
                                int hash3 = oVar.getHash() & length2;
                                o<K, V> m6634g = m6634g(oVar, m6601B.get(hash3));
                                if (m6634g != null) {
                                    m6601B.set(hash3, m6634g);
                                } else {
                                    m6614O(oVar);
                                    i10--;
                                }
                                oVar = oVar.getNext();
                            }
                        }
                    }
                }
                i11++;
                i10 = i12;
            }
            this.f7389g = m6601B;
            this.f7385c = i10;
        }

        /* renamed from: p */
        public void m6643p(long j10) {
            o<K, V> peek;
            o<K, V> peek2;
            m6636i();
            do {
                peek = this.f7395m.peek();
                if (peek == null || !this.f7384b.m6568n(peek, j10)) {
                    do {
                        peek2 = this.f7396n.peek();
                        if (peek2 == null || !this.f7384b.m6568n(peek2, j10)) {
                            return;
                        }
                    } while (m6615P(peek2, peek2.getHash(), EnumC1103p.EXPIRED));
                    throw new AssertionError();
                }
            } while (m6615P(peek, peek.getHash(), EnumC1103p.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: q */
        public V m6644q(Object obj, int i10) {
            try {
                if (this.f7385c != 0) {
                    long mo6533a = this.f7384b.f7329q.mo6533a();
                    o<K, V> m6648u = m6648u(obj, i10, mo6533a);
                    if (m6648u == null) {
                        m6602C();
                        return null;
                    }
                    V v10 = m6648u.getValueReference().get();
                    if (v10 != null) {
                        m6609J(m6648u, mo6533a);
                        K key = m6648u.getKey();
                        this.f7384b.getClass();
                        return m6623X(m6648u, key, i10, v10, mo6533a, null);
                    }
                    m6627a0();
                }
                m6602C();
                return null;
            } finally {
                m6602C();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: r */
        public V m6645r(K k10, int i10, l<K, V> lVar, InterfaceFutureC1097j<V> interfaceFutureC1097j) {
            V v10;
            try {
                v10 = C1109v.m6677a(interfaceFutureC1097j);
                try {
                    if (v10 != null) {
                        m6625Z(k10, i10, lVar, v10);
                        return v10;
                    }
                    throw new AbstractC1093f.a("CacheLoader returned null for key " + k10 + InstructionFileId.DOT);
                } catch (Throwable th2) {
                    th = th2;
                    if (v10 == null) {
                        m6617R(k10, i10, lVar);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                v10 = null;
            }
        }

        /* renamed from: s */
        public o<K, V> m6646s(Object obj, int i10) {
            o<K, V> m6647t = m6647t(i10);
            while (true) {
                o<K, V> oVar = m6647t;
                if (oVar == null) {
                    return null;
                }
                if (oVar.getHash() == i10) {
                    K key = oVar.getKey();
                    if (key == null) {
                        m6627a0();
                    } else if (this.f7384b.f7318f.m6538d(obj, key)) {
                        return oVar;
                    }
                }
                m6647t = oVar.getNext();
            }
        }

        /* renamed from: t */
        public o<K, V> m6647t(int i10) {
            AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
            return atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: u */
        public o<K, V> m6648u(Object obj, int i10, long j10) {
            o<K, V> m6646s = m6646s(obj, i10);
            if (m6646s == null) {
                return null;
            }
            if (!this.f7384b.m6568n(m6646s, j10)) {
                return m6646s;
            }
            m6629b0(j10);
            return null;
        }

        /* renamed from: v */
        public V m6649v(o<K, V> oVar, long j10) {
            if (oVar.getKey() == null) {
                m6627a0();
                return null;
            }
            V v10 = oVar.getValueReference().get();
            if (v10 == null) {
                m6627a0();
                return null;
            }
            if (!this.f7384b.m6568n(oVar, j10)) {
                return v10;
            }
            m6629b0(j10);
            return null;
        }

        /* renamed from: w */
        public o<K, V> m6650w() {
            for (o<K, V> oVar : this.f7396n) {
                if (oVar.getValueReference().mo6579c() > 0) {
                    return oVar;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: x */
        public void m6651x(AtomicReferenceArray<o<K, V>> atomicReferenceArray) {
            this.f7388f = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f7384b.m6561f()) {
                int i10 = this.f7388f;
                if (i10 == this.f7390h) {
                    this.f7388f = i10 + 1;
                }
            }
            this.f7389g = atomicReferenceArray;
        }

        /* renamed from: y */
        public l<K, V> m6652y(K k10, int i10, boolean z10) {
            lock();
            try {
                long mo6533a = this.f7384b.f7329q.mo6533a();
                m6604E(mo6533a);
                AtomicReferenceArray<o<K, V>> atomicReferenceArray = this.f7389g;
                int length = (atomicReferenceArray.length() - 1) & i10;
                o<K, V> oVar = (o) atomicReferenceArray.get(length);
                for (o<K, V> oVar2 = oVar; oVar2 != null; oVar2 = oVar2.getNext()) {
                    K key = oVar2.getKey();
                    if (oVar2.getHash() == i10 && key != null && this.f7384b.f7318f.m6538d(k10, key)) {
                        y<K, V> valueReference = oVar2.getValueReference();
                        if (!valueReference.mo6578b() && (!z10 || mo6533a - oVar2.getWriteTime() >= this.f7384b.f7326n)) {
                            this.f7387e++;
                            l<K, V> lVar = new l<>(valueReference);
                            oVar2.setValueReference(lVar);
                            return lVar;
                        }
                        unlock();
                        m6603D();
                        return null;
                    }
                }
                this.f7387e++;
                l<K, V> lVar2 = new l<>();
                o<K, V> m6600A = m6600A(k10, i10, oVar);
                m6600A.setValueReference(lVar2);
                atomicReferenceArray.set(length, m6600A);
                return lVar2;
            } finally {
                unlock();
                m6603D();
            }
        }

        /* renamed from: z */
        public InterfaceFutureC1097j<V> m6653z(K k10, int i10, l<K, V> lVar, AbstractC1093f<? super K, V> abstractC1093f) {
            InterfaceFutureC1097j<V> m6597g = lVar.m6597g(k10, abstractC1093f);
            m6597g.mo6492a(new a(this, k10, i10, lVar, m6597g), EnumC1094g.INSTANCE);
            return m6597g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$q.class
     */
    /* renamed from: cg.k$q */
    /* loaded from: combined.jar:classes2.jar:cg/k$q.class */
    public static class q<K, V> extends SoftReference<V> implements y<K, V> {

        /* renamed from: b */
        public final o<K, V> f7402b;

        public q(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            super(v10, referenceQueue);
            this.f7402b = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: a */
        public void mo6577a(V v10) {
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: b */
        public boolean mo6578b() {
            return false;
        }

        /* renamed from: c */
        public int mo6579c() {
            return 1;
        }

        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return new q(referenceQueue, v10, oVar);
        }

        @Override // cg.ConcurrentMapC1098k.y
        public o<K, V> getEntry() {
            return this.f7402b;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$r.class
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: cg.k$r */
    /* loaded from: combined.jar:classes2.jar:cg/k$r.class */
    public static abstract class r {
        private static final r[] $VALUES;
        public static final r SOFT;
        public static final r STRONG;
        public static final r WEAK;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$r$a.class
         */
        /* renamed from: cg.k$r$a */
        /* loaded from: combined.jar:classes2.jar:cg/k$r$a.class */
        public enum a extends r {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.r
            public AbstractC1095h<Object> defaultEquivalence() {
                return AbstractC1095h.m6534c();
            }

            @Override // cg.ConcurrentMapC1098k.r
            public <K, V> y<K, V> referenceValue(p<K, V> pVar, o<K, V> oVar, V v10, int i10) {
                return i10 == 1 ? new v(v10) : new g0(v10, i10);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$r$b.class
         */
        /* renamed from: cg.k$r$b */
        /* loaded from: combined.jar:classes2.jar:cg/k$r$b.class */
        public enum b extends r {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.r
            public AbstractC1095h<Object> defaultEquivalence() {
                return AbstractC1095h.m6535f();
            }

            @Override // cg.ConcurrentMapC1098k.r
            public <K, V> y<K, V> referenceValue(p<K, V> pVar, o<K, V> oVar, V v10, int i10) {
                return i10 == 1 ? new q(pVar.f7392j, v10, oVar) : new f0(pVar.f7392j, v10, oVar, i10);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:cg/k$r$c.class
         */
        /* renamed from: cg.k$r$c */
        /* loaded from: combined.jar:classes2.jar:cg/k$r$c.class */
        public enum c extends r {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // cg.ConcurrentMapC1098k.r
            public AbstractC1095h<Object> defaultEquivalence() {
                return AbstractC1095h.m6535f();
            }

            @Override // cg.ConcurrentMapC1098k.r
            public <K, V> y<K, V> referenceValue(p<K, V> pVar, o<K, V> oVar, V v10, int i10) {
                return i10 == 1 ? new d0(pVar.f7392j, v10, oVar) : new h0(pVar.f7392j, v10, oVar, i10);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("SOFT", 1);
            SOFT = bVar;
            c cVar = new c("WEAK", 2);
            WEAK = cVar;
            $VALUES = new r[]{aVar, bVar, cVar};
        }

        private r(String str, int i10) {
        }

        public /* synthetic */ r(String str, int i10, a aVar) {
            this(str, i10);
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        public abstract AbstractC1095h<Object> defaultEquivalence();

        public abstract <K, V> y<K, V> referenceValue(p<K, V> pVar, o<K, V> oVar, V v10, int i10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$s.class
     */
    /* renamed from: cg.k$s */
    /* loaded from: combined.jar:classes2.jar:cg/k$s.class */
    public static final class s<K, V> extends u<K, V> {

        /* renamed from: f */
        public volatile long f7403f;

        /* renamed from: g */
        public o<K, V> f7404g;

        /* renamed from: h */
        public o<K, V> f7405h;

        public s(K k10, int i10, o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f7403f = Long.MAX_VALUE;
            this.f7404g = ConcurrentMapC1098k.m6549q();
            this.f7405h = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            return this.f7403f;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInAccessQueue() {
            return this.f7404g;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInAccessQueue() {
            return this.f7405h;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
            this.f7403f = j10;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<K, V> oVar) {
            this.f7404g = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<K, V> oVar) {
            this.f7405h = oVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$t.class
     */
    /* renamed from: cg.k$t */
    /* loaded from: combined.jar:classes2.jar:cg/k$t.class */
    public static final class t<K, V> extends u<K, V> {

        /* renamed from: f */
        public volatile long f7406f;

        /* renamed from: g */
        public o<K, V> f7407g;

        /* renamed from: h */
        public o<K, V> f7408h;

        /* renamed from: i */
        public volatile long f7409i;

        /* renamed from: j */
        public o<K, V> f7410j;

        /* renamed from: k */
        public o<K, V> f7411k;

        public t(K k10, int i10, o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f7406f = Long.MAX_VALUE;
            this.f7407g = ConcurrentMapC1098k.m6549q();
            this.f7408h = ConcurrentMapC1098k.m6549q();
            this.f7409i = Long.MAX_VALUE;
            this.f7410j = ConcurrentMapC1098k.m6549q();
            this.f7411k = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public long getAccessTime() {
            return this.f7406f;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInAccessQueue() {
            return this.f7407g;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInWriteQueue() {
            return this.f7410j;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInAccessQueue() {
            return this.f7408h;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInWriteQueue() {
            return this.f7411k;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            return this.f7409i;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setAccessTime(long j10) {
            this.f7406f = j10;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setNextInAccessQueue(o<K, V> oVar) {
            this.f7407g = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<K, V> oVar) {
            this.f7410j = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setPreviousInAccessQueue(o<K, V> oVar) {
            this.f7408h = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<K, V> oVar) {
            this.f7411k = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
            this.f7409i = j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$u.class
     */
    /* renamed from: cg.k$u */
    /* loaded from: combined.jar:classes2.jar:cg/k$u.class */
    public static class u<K, V> extends d<K, V> {

        /* renamed from: b */
        public final K f7412b;

        /* renamed from: c */
        public final int f7413c;

        /* renamed from: d */
        public final o<K, V> f7414d;

        /* renamed from: e */
        public volatile y<K, V> f7415e = ConcurrentMapC1098k.m6544F();

        public u(K k10, int i10, o<K, V> oVar) {
            this.f7412b = k10;
            this.f7413c = i10;
            this.f7414d = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public int getHash() {
            return this.f7413c;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public K getKey() {
            return this.f7412b;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getNext() {
            return this.f7414d;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public y<K, V> getValueReference() {
            return this.f7415e;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setValueReference(y<K, V> yVar) {
            this.f7415e = yVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$v.class
     */
    /* renamed from: cg.k$v */
    /* loaded from: combined.jar:classes2.jar:cg/k$v.class */
    public static class v<K, V> implements y<K, V> {

        /* renamed from: b */
        public final V f7416b;

        public v(V v10) {
            this.f7416b = v10;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: a */
        public void mo6577a(V v10) {
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: b */
        public boolean mo6578b() {
            return false;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: c */
        public int mo6579c() {
            return 1;
        }

        @Override // cg.ConcurrentMapC1098k.y
        /* renamed from: d */
        public y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar) {
            return this;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public V get() {
            return this.f7416b;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public o<K, V> getEntry() {
            return null;
        }

        @Override // cg.ConcurrentMapC1098k.y
        public boolean isActive() {
            return true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$w.class
     */
    /* renamed from: cg.k$w */
    /* loaded from: combined.jar:classes2.jar:cg/k$w.class */
    public static final class w<K, V> extends u<K, V> {

        /* renamed from: f */
        public volatile long f7417f;

        /* renamed from: g */
        public o<K, V> f7418g;

        /* renamed from: h */
        public o<K, V> f7419h;

        public w(K k10, int i10, o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f7417f = Long.MAX_VALUE;
            this.f7418g = ConcurrentMapC1098k.m6549q();
            this.f7419h = ConcurrentMapC1098k.m6549q();
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getNextInWriteQueue() {
            return this.f7418g;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public o<K, V> getPreviousInWriteQueue() {
            return this.f7419h;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public long getWriteTime() {
            return this.f7417f;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setNextInWriteQueue(o<K, V> oVar) {
            this.f7418g = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setPreviousInWriteQueue(o<K, V> oVar) {
            this.f7419h = oVar;
        }

        @Override // cg.ConcurrentMapC1098k.d, cg.ConcurrentMapC1098k.o
        public void setWriteTime(long j10) {
            this.f7417f = j10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$x.class
     */
    /* renamed from: cg.k$x */
    /* loaded from: combined.jar:classes2.jar:cg/k$x.class */
    public final class x extends ConcurrentMapC1098k<K, V>.i<V> {

        /* renamed from: j */
        public final ConcurrentMapC1098k f7420j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ConcurrentMapC1098k concurrentMapC1098k) {
            super(concurrentMapC1098k);
            this.f7420j = concurrentMapC1098k;
        }

        @Override // java.util.Iterator
        public V next() {
            return m6588c().getValue();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$y.class
     */
    /* renamed from: cg.k$y */
    /* loaded from: combined.jar:classes2.jar:cg/k$y.class */
    public interface y<K, V> {
        /* renamed from: a */
        void mo6577a(V v10);

        /* renamed from: b */
        boolean mo6578b();

        /* renamed from: c */
        int mo6579c();

        /* renamed from: d */
        y<K, V> mo6580d(ReferenceQueue<V> referenceQueue, V v10, o<K, V> oVar);

        V get();

        o<K, V> getEntry();

        boolean isActive();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/k$z.class
     */
    /* renamed from: cg.k$z */
    /* loaded from: combined.jar:classes2.jar:cg/k$z.class */
    public final class z extends AbstractCollection<V> {

        /* renamed from: b */
        public final ConcurrentMap<?, ?> f7421b;

        /* renamed from: c */
        public final ConcurrentMapC1098k f7422c;

        public z(ConcurrentMapC1098k concurrentMapC1098k, ConcurrentMap<?, ?> concurrentMap) {
            this.f7422c = concurrentMapC1098k;
            this.f7421b = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f7421b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f7421b.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f7421b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new x(this.f7422c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7421b.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return ConcurrentMapC1098k.m6543E(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) ConcurrentMapC1098k.m6543E(this).toArray(eArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.Queue] */
    public ConcurrentMapC1098k(C1092e<? super K, ? super V> c1092e, AbstractC1093f<? super K, V> abstractC1093f) {
        this.f7317e = Math.min(c1092e.m6520d(), 65536);
        r m6525i = c1092e.m6525i();
        this.f7320h = m6525i;
        this.f7321i = c1092e.m6531o();
        this.f7318f = c1092e.m6524h();
        this.f7319g = c1092e.m6530n();
        long m6526j = c1092e.m6526j();
        this.f7322j = m6526j;
        this.f7323k = (InterfaceC1111x<K, V>) c1092e.m6532p();
        this.f7324l = c1092e.m6521e();
        this.f7325m = c1092e.m6522f();
        this.f7326n = c1092e.m6527k();
        C1092e.b bVar = (InterfaceC1104q<K, V>) c1092e.m6528l();
        this.f7328p = bVar;
        this.f7327o = bVar == C1092e.b.INSTANCE ? m6548g() : new ConcurrentLinkedQueue();
        this.f7329q = c1092e.m6529m(m6575y());
        this.f7330r = f.getFactory(m6525i, m6554G(), m6558K());
        int min = Math.min(c1092e.m6523g(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH);
        int i10 = min;
        if (m6562h()) {
            i10 = min;
            if (!m6561f()) {
                i10 = Math.min(min, (int) m6526j);
            }
        }
        int i11 = 1;
        int i12 = 0;
        while (i11 < this.f7317e && (!m6562h() || i11 * 20 <= this.f7322j)) {
            i12++;
            i11 <<= 1;
        }
        this.f7315c = 32 - i12;
        this.f7314b = i11 - 1;
        this.f7316d = m6570p(i11);
        int i13 = i10 / i11;
        int i14 = 1;
        int i15 = i13;
        if (i13 * i11 < i10) {
            i15 = i13 + 1;
            i14 = 1;
        }
        while (i14 < i15) {
            i14 <<= 1;
        }
        int i16 = 0;
        if (m6562h()) {
            long j10 = this.f7322j;
            long j11 = i11;
            long j12 = (j10 / j11) + 1;
            int i17 = 0;
            while (true) {
                p<K, V>[] pVarArr = this.f7316d;
                if (i17 >= pVarArr.length) {
                    return;
                }
                long j13 = j12;
                if (i17 == j10 % j11) {
                    j13 = j12 - 1;
                }
                pVarArr[i17] = m6560e(i14, j13);
                i17++;
                j12 = j13;
            }
        } else {
            while (true) {
                p<K, V>[] pVarArr2 = this.f7316d;
                if (i16 >= pVarArr2.length) {
                    return;
                }
                pVarArr2[i16] = m6560e(i14, -1L);
                i16++;
            }
        }
    }

    /* renamed from: B */
    public static int m6541B(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* renamed from: C */
    public static char m6542C(long j10) {
        if (j10 > 65535) {
            return (char) 65535;
        }
        if (j10 < 0) {
            return (char) 0;
        }
        return (char) j10;
    }

    /* renamed from: E */
    public static <E> ArrayList<E> m6543E(Collection<E> collection) {
        return new ArrayList<>(collection);
    }

    /* renamed from: F */
    public static <K, V> y<K, V> m6544F() {
        return (y<K, V>) f7312w;
    }

    /* renamed from: c */
    public static <K, V> void m6546c(o<K, V> oVar, o<K, V> oVar2) {
        oVar.setNextInAccessQueue(oVar2);
        oVar2.setPreviousInAccessQueue(oVar);
    }

    /* renamed from: d */
    public static <K, V> void m6547d(o<K, V> oVar, o<K, V> oVar2) {
        oVar.setNextInWriteQueue(oVar2);
        oVar2.setPreviousInWriteQueue(oVar);
    }

    /* renamed from: g */
    public static <E> Queue<E> m6548g() {
        return (Queue<E>) f7313x;
    }

    /* renamed from: q */
    public static <K, V> o<K, V> m6549q() {
        return n.INSTANCE;
    }

    /* renamed from: r */
    public static <K, V> void m6550r(o<K, V> oVar) {
        o<K, V> m6549q = m6549q();
        oVar.setNextInAccessQueue(m6549q);
        oVar.setPreviousInAccessQueue(m6549q);
    }

    /* renamed from: s */
    public static <K, V> void m6551s(o<K, V> oVar) {
        o<K, V> m6549q = m6549q();
        oVar.setNextInWriteQueue(m6549q);
        oVar.setPreviousInWriteQueue(m6549q);
    }

    /* renamed from: A */
    public boolean m6552A() {
        return this.f7326n > 0;
    }

    /* renamed from: D */
    public p<K, V> m6553D(int i10) {
        return this.f7316d[(i10 >>> this.f7315c) & this.f7314b];
    }

    /* renamed from: G */
    public boolean m6554G() {
        return m6555H() || m6574w();
    }

    /* renamed from: H */
    public boolean m6555H() {
        return m6563i() || m6562h();
    }

    /* renamed from: I */
    public boolean m6556I() {
        return this.f7320h != r.STRONG;
    }

    /* renamed from: J */
    public boolean m6557J() {
        return this.f7321i != r.STRONG;
    }

    /* renamed from: K */
    public boolean m6558K() {
        return m6559L() || m6576z();
    }

    /* renamed from: L */
    public boolean m6559L() {
        return m6564j();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (p<K, V> pVar : this.f7316d) {
            pVar.m6628b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m6567m = m6567m(obj);
        return m6553D(m6567m).m6633f(obj, m6567m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        r9 = r9 + 1;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsValue(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            cg.u r0 = r0.f7329q
            long r0 = r0.mo6533a()
            r11 = r0
            r0 = r5
            cg.k$p<K, V>[] r0 = r0.f7316d
            r17 = r0
            r0 = -1
            r15 = r0
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            r1 = 3
            if (r0 >= r1) goto Lba
            r0 = 0
            r13 = r0
            r0 = r17
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r8 = r0
        L2b:
            r0 = r8
            r1 = r10
            if (r0 >= r1) goto La5
            r0 = r17
            r1 = r8
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            int r0 = r0.f7385c
            r9 = r0
            r0 = r19
            java.util.concurrent.atomic.AtomicReferenceArray<cg.k$o<K, V>> r0 = r0.f7389g
            r20 = r0
            r0 = 0
            r9 = r0
        L48:
            r0 = r9
            r1 = r20
            int r1 = r1.length()
            if (r0 >= r1) goto L94
            r0 = r20
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            cg.k$o r0 = (cg.ConcurrentMapC1098k.o) r0
            r18 = r0
        L5e:
            r0 = r18
            if (r0 == 0) goto L8e
            r0 = r19
            r1 = r18
            r2 = r11
            java.lang.Object r0 = r0.m6649v(r1, r2)
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L82
            r0 = r5
            cg.h<java.lang.Object> r0 = r0.f7319g
            r1 = r6
            r2 = r21
            boolean r0 = r0.m6538d(r1, r2)
            if (r0 == 0) goto L82
            r0 = 1
            return r0
        L82:
            r0 = r18
            cg.k$o r0 = r0.getNext()
            r18 = r0
            goto L5e
        L8e:
            int r9 = r9 + 1
            goto L48
        L94:
            r0 = r13
            r1 = r19
            int r1 = r1.f7387e
            long r1 = (long) r1
            long r0 = r0 + r1
            r13 = r0
            int r8 = r8 + 1
            goto L2b
        La5:
            r0 = r13
            r1 = r15
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb0
            goto Lba
        Lb0:
            int r7 = r7 + 1
            r0 = r13
            r15 = r0
            goto L1c
        Lba:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.ConcurrentMapC1098k.containsValue(java.lang.Object):boolean");
    }

    /* renamed from: e */
    public p<K, V> m6560e(int i10, long j10) {
        return new p<>(this, i10, j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7333u;
        if (set == null) {
            set = new h(this, this);
            this.f7333u = set;
        }
        return set;
    }

    /* renamed from: f */
    public boolean m6561f() {
        return this.f7323k != C1092e.c.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m6567m = m6567m(obj);
        return m6553D(m6567m).m6644q(obj, m6567m);
    }

    /* renamed from: h */
    public boolean m6562h() {
        return this.f7322j >= 0;
    }

    /* renamed from: i */
    public boolean m6563i() {
        return this.f7324l > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        p<K, V>[] pVarArr = this.f7316d;
        long j10 = 0;
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            if (pVarArr[i10].f7385c != 0) {
                return false;
            }
            j10 += pVarArr[i10].f7387e;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            if (pVarArr[i11].f7385c != 0) {
                return false;
            }
            j10 -= pVarArr[i11].f7387e;
        }
        return j10 == 0;
    }

    /* renamed from: j */
    public boolean m6564j() {
        return this.f7325m > 0;
    }

    /* renamed from: k */
    public V m6565k(Object obj) {
        int m6567m = m6567m(C1102o.m6665a(obj));
        return m6553D(m6567m).m6644q(obj, m6567m);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f7331s;
        if (set == null) {
            set = new k(this, this);
            this.f7331s = set;
        }
        return set;
    }

    /* renamed from: l */
    public V m6566l(o<K, V> oVar, long j10) {
        V v10;
        if (oVar.getKey() == null || (v10 = oVar.getValueReference().get()) == null || m6568n(oVar, j10)) {
            return null;
        }
        return v10;
    }

    /* renamed from: m */
    public int m6567m(Object obj) {
        return m6541B(this.f7318f.m6539e(obj));
    }

    /* renamed from: n */
    public boolean m6568n(o<K, V> oVar, long j10) {
        C1102o.m6665a(oVar);
        if (!m6563i() || j10 - oVar.getAccessTime() < this.f7324l) {
            return m6564j() && j10 - oVar.getWriteTime() >= this.f7325m;
        }
        return true;
    }

    /* renamed from: o */
    public long m6569o() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f7316d.length; i10++) {
            j10 += Math.max(0, r0[i10].f7385c);
        }
        return j10;
    }

    /* renamed from: p */
    public final p<K, V>[] m6570p(int i10) {
        return new p[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        C1102o.m6665a(k10);
        C1102o.m6665a(v10);
        int m6567m = m6567m(k10);
        return m6553D(m6567m).m6605F(k10, m6567m, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k10, V v10) {
        C1102o.m6665a(k10);
        C1102o.m6665a(v10);
        int m6567m = m6567m(k10);
        return m6553D(m6567m).m6605F(k10, m6567m, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m6567m = m6567m(obj);
        return m6553D(m6567m).m6612M(obj, m6567m);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m6567m = m6567m(obj);
        return m6553D(m6567m).m6613N(obj, m6567m, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k10, V v10) {
        C1102o.m6665a(k10);
        C1102o.m6665a(v10);
        int m6567m = m6567m(k10);
        return m6553D(m6567m).m6619T(k10, m6567m, v10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k10, V v10, V v11) {
        C1102o.m6665a(k10);
        C1102o.m6665a(v11);
        if (v10 == null) {
            return false;
        }
        int m6567m = m6567m(k10);
        return m6553D(m6567m).m6620U(k10, m6567m, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return m6542C(m6569o());
    }

    /* renamed from: t */
    public void m6571t() {
        while (true) {
            C1105r<K, V> poll = this.f7327o.poll();
            if (poll == null) {
                return;
            }
            try {
                this.f7328p.onRemoval(poll);
            } catch (Throwable th2) {
                f7311v.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    /* renamed from: u */
    public void m6572u(o<K, V> oVar) {
        int hash = oVar.getHash();
        m6553D(hash).m6606G(oVar, hash);
    }

    /* renamed from: v */
    public void m6573v(y<K, V> yVar) {
        o<K, V> entry = yVar.getEntry();
        int hash = entry.getHash();
        m6553D(hash).m6607H(entry.getKey(), hash, yVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f7332t;
        if (collection == null) {
            collection = new z(this, this);
            this.f7332t = collection;
        }
        return collection;
    }

    /* renamed from: w */
    public boolean m6574w() {
        return m6563i();
    }

    /* renamed from: y */
    public boolean m6575y() {
        return m6576z() || m6574w();
    }

    /* renamed from: z */
    public boolean m6576z() {
        return m6564j() || m6552A();
    }
}
