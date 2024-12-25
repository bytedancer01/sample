package org.simpleframework.xml.util;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.simpleframework.xml.util.Match;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Resolver.class */
public class Resolver<M extends Match> extends AbstractSet<M> {
    public final Resolver<M>.Stack stack = new Stack();
    public final Resolver<M>.Cache cache = new Cache(this);

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Resolver$Cache.class */
    public class Cache extends LimitedCache<List<M>> {
        public final Resolver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cache(Resolver resolver) {
            super(1024);
            this.this$0 = resolver;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Resolver$Stack.class */
    public class Stack extends LinkedList<M> {
        public final Resolver this$0;

        /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/util/Resolver$Stack$Sequence.class */
        public class Sequence implements Iterator<M> {
            private int cursor;
            public final Stack this$1;

            public Sequence(Stack stack) {
                this.this$1 = stack;
                this.cursor = stack.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.cursor > 0;
            }

            @Override // java.util.Iterator
            public M next() {
                if (!hasNext()) {
                    return null;
                }
                Stack stack = this.this$1;
                int i10 = this.cursor - 1;
                this.cursor = i10;
                return (M) stack.get(i10);
            }

            @Override // java.util.Iterator
            public void remove() {
                this.this$1.purge(this.cursor);
            }
        }

        private Stack(Resolver resolver) {
            this.this$0 = resolver;
        }

        public void purge(int i10) {
            this.this$0.cache.clear();
            remove(i10);
        }

        @Override // java.util.LinkedList, java.util.Deque
        public void push(M m10) {
            this.this$0.cache.clear();
            addFirst(m10);
        }

        public Iterator<M> sequence() {
            return new Sequence(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        if (r9.length != r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r7.length != r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
    
        if (r9[r11] != '*') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        r0 = r11 + 1;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        if (r0 < r9.length) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0111, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean match(char[] r7, int r8, char[] r9, int r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.util.Resolver.match(char[], int, char[], int):boolean");
    }

    private boolean match(char[] cArr, char[] cArr2) {
        return match(cArr, 0, cArr2, 0);
    }

    private List<M> resolveAll(String str, char[] cArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<M> it = this.stack.iterator();
        while (it.hasNext()) {
            Match match = (Match) it.next();
            if (match(cArr, match.getPattern().toCharArray())) {
                this.cache.put(str, arrayList);
                arrayList.add(match);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(M m10) {
        this.stack.push((Resolver<M>.Stack) m10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.cache.clear();
        this.stack.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<M> iterator() {
        return (Iterator<M>) this.stack.sequence();
    }

    public boolean remove(M m10) {
        this.cache.clear();
        return this.stack.remove(m10);
    }

    public M resolve(String str) {
        List<M> list = (List) this.cache.get(str);
        List<M> list2 = list;
        if (list == null) {
            list2 = resolveAll(str);
        }
        if (list2.isEmpty()) {
            return null;
        }
        return list2.get(0);
    }

    public List<M> resolveAll(String str) {
        List<M> list = (List) this.cache.get(str);
        if (list != null) {
            return list;
        }
        char[] charArray = str.toCharArray();
        if (charArray == null) {
            return null;
        }
        return resolveAll(str, charArray);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.stack.size();
    }
}
