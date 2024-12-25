package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/WeakHashtable.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/WeakHashtable.class */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/logging/impl/WeakHashtable$Entry.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/WeakHashtable$Entry.class */
    public static final class Entry implements Map.Entry {
        private final Object key;
        private final Object value;

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        
            if (getValue() != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
        
            if (r0.getValue() != null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        
            if (getValue().equals(r0.getValue()) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (getKey().equals(r0.getKey()) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r0.getKey() == null) goto L13;
         */
        @Override // java.util.Map.Entry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 0
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r4
                if (r0 == 0) goto L66
                r0 = r6
                r5 = r0
                r0 = r4
                boolean r0 = r0 instanceof java.util.Map.Entry
                if (r0 == 0) goto L66
                r0 = r4
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                r4 = r0
                r0 = r3
                java.lang.Object r0 = r0.getKey()
                if (r0 != 0) goto L2b
                r0 = r6
                r5 = r0
                r0 = r4
                java.lang.Object r0 = r0.getKey()
                if (r0 != 0) goto L66
                goto L3d
            L2b:
                r0 = r6
                r5 = r0
                r0 = r3
                java.lang.Object r0 = r0.getKey()
                r1 = r4
                java.lang.Object r1 = r1.getKey()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L66
            L3d:
                r0 = r3
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L52
                r0 = r6
                r5 = r0
                r0 = r4
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L66
                goto L64
            L52:
                r0 = r6
                r5 = r0
                r0 = r3
                java.lang.Object r0 = r0.getValue()
                r1 = r4
                java.lang.Object r1 = r1.getValue()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L66
            L64:
                r0 = 1
                r5 = r0
            L66:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.WeakHashtable.Entry.equals(java.lang.Object):boolean");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i10 = 0;
            int hashCode = getKey() == null ? 0 : getKey().hashCode();
            if (getValue() != null) {
                i10 = getValue().hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/logging/impl/WeakHashtable$Referenced.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/WeakHashtable$Referenced.class */
    public static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this);
            this.hashCode = obj.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getValue() {
            return this.reference.get();
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof Referenced) {
                Referenced referenced = (Referenced) obj;
                Object value = getValue();
                Object value2 = referenced.getValue();
                if (value == null) {
                    z10 = false;
                    if (value2 == null) {
                        z10 = false;
                        if (hashCode() == referenced.hashCode()) {
                            z10 = true;
                        }
                    }
                } else {
                    z10 = value.equals(value2);
                }
            }
            return z10;
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/logging/impl/WeakHashtable$WeakKey.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/WeakHashtable$WeakKey.class */
    public static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced) {
            super(obj, referenceQueue);
            this.referenced = referenced;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Referenced getReferenced() {
            return this.referenced;
        }
    }

    private void purge() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.queue) {
            while (true) {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey == null) {
                    break;
                } else {
                    arrayList.add(weakKey.getReferenced());
                }
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            super.remove(arrayList.get(i10));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            WeakKey weakKey = (WeakKey) this.queue.poll();
            if (weakKey != null) {
                super.remove(weakKey.getReferenced());
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        purge();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object value = ((Referenced) entry.getKey()).getValue();
            Object value2 = entry.getValue();
            if (value != null) {
                hashSet.add(new Entry(value, value2));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new Referenced(obj));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        purge();
        Set keySet = super.keySet();
        HashSet hashSet = new HashSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object value = ((Referenced) it.next()).getValue();
            if (value != null) {
                hashSet.add(value);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        purge();
        return new Enumeration(this, super.keys()) { // from class: org.apache.commons.logging.impl.WeakHashtable.1
            private final WeakHashtable this$0;
            private final Enumeration val$enumer;

            {
                this.this$0 = this;
                this.val$enumer = r5;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.val$enumer.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return ((Referenced) this.val$enumer.nextElement()).getValue();
            }
        };
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this) {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed");
            }
            if (obj2 == null) {
                throw new NullPointerException("Null values are not allowed");
            }
            int i10 = this.changeCount;
            int i11 = i10 + 1;
            this.changeCount = i11;
            if (i10 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i11 % 10 == 0) {
                purgeOne();
            }
            put = super.put(new Referenced(obj, this.queue), obj2);
        }
        return put;
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    public void rehash() {
        purge();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object remove(Object obj) {
        Object remove;
        synchronized (this) {
            int i10 = this.changeCount;
            int i11 = i10 + 1;
            this.changeCount = i11;
            if (i10 > 100) {
                purge();
                this.changeCount = 0;
            } else if (i11 % 10 == 0) {
                purgeOne();
            }
            remove = super.remove(new Referenced(obj));
        }
        return remove;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        purge();
        return super.values();
    }
}
