package p099fc;

import ec.C4708k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/s0.class
 */
/* renamed from: fc.s0 */
/* loaded from: combined.jar:classes2.jar:fc/s0.class */
public final class C4833s0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/s0$a.class
     */
    /* renamed from: fc.s0$a */
    /* loaded from: combined.jar:classes2.jar:fc/s0$a.class */
    public static final class a<E> extends c<E> {

        /* renamed from: b */
        public final Set f28411b;

        /* renamed from: c */
        public final Set f28412c;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:fc/s0$a$a.class
         */
        /* renamed from: fc.s0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:fc/s0$a$a.class */
        public class C10293a extends AbstractC4798b<E> {

            /* renamed from: d */
            public final Iterator<E> f28413d;

            /* renamed from: e */
            public final a f28414e;

            public C10293a(a aVar) {
                this.f28414e = aVar;
                this.f28413d = aVar.f28411b.iterator();
            }

            @Override // p099fc.AbstractC4798b
            /* renamed from: a */
            public E mo24289a() {
                while (this.f28413d.hasNext()) {
                    E next = this.f28413d.next();
                    if (this.f28414e.f28412c.contains(next)) {
                        return next;
                    }
                }
                return m24290b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f28411b = set;
            this.f28412c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f28411b.contains(obj) && this.f28412c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f28411b.containsAll(collection) && this.f28412c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC4841w0<E> iterator() {
            return new C10293a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f28412c, this.f28411b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f28411b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f28412c.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/s0$b.class
     */
    /* renamed from: fc.s0$b */
    /* loaded from: combined.jar:classes2.jar:fc/s0$b.class */
    public static abstract class b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C4833s0.m24535g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C4708k.m23668j(collection));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/s0$c.class
     */
    /* renamed from: fc.s0$c */
    /* loaded from: combined.jar:classes2.jar:fc/s0$c.class */
    public static abstract class c<E> extends AbstractSet<E> {
        public c() {
        }

        public /* synthetic */ c(C4831r0 c4831r0) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r3.containsAll(r0) != false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24529a(java.util.Set<?> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
        /*
            r0 = 1
            r5 = r0
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L37
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L39
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            if (r0 != r1) goto L33
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L39
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r5
            return r0
        L37:
            r0 = 0
            return r0
        L39:
            r3 = move-exception
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: p099fc.C4833s0.m24529a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public static int m24530b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            Object next = it.next();
            i10 = ((i11 + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
    }

    /* renamed from: c */
    public static <E> c<E> m24531c(Set<E> set, Set<?> set2) {
        C4708k.m23669k(set, "set1");
        C4708k.m23669k(set2, "set2");
        return new a(set, set2);
    }

    /* renamed from: d */
    public static <E> HashSet<E> m24532d() {
        return new HashSet<>();
    }

    /* renamed from: e */
    public static <E> HashSet<E> m24533e(int i10) {
        return new HashSet<>(C4803d0.m24358a(i10));
    }

    /* renamed from: f */
    public static <E> Set<E> m24534f() {
        return Collections.newSetFromMap(C4803d0.m24363f());
    }

    /* renamed from: g */
    public static boolean m24535g(Set<?> set, Collection<?> collection) {
        C4708k.m23668j(collection);
        Collection<?> collection2 = collection;
        if (collection instanceof InterfaceC4811h0) {
            collection2 = ((InterfaceC4811h0) collection).m24395C();
        }
        return (!(collection2 instanceof Set) || collection2.size() <= set.size()) ? m24536h(set, collection2.iterator()) : C4845z.m24618k(set.iterator(), collection2);
    }

    /* renamed from: h */
    public static boolean m24536h(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                return z11;
            }
            z10 = z11 | set.remove(it.next());
        }
    }
}
