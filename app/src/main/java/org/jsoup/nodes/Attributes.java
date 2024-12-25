package org.jsoup.nodes;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Attributes.class */
public class Attributes implements Iterable<Attribute>, Cloneable {
    public static final String dataPrefix = "data-";
    private LinkedHashMap<String, Attribute> attributes = null;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Attributes$Dataset.class */
    public class Dataset extends AbstractMap<String, String> {
        public final Attributes this$0;

        /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Attributes$Dataset$DatasetIterator.class */
        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Attribute attr;
            private Iterator<Attribute> attrIter;
            public final Dataset this$1;

            private DatasetIterator(Dataset dataset) {
                this.this$1 = dataset;
                this.attrIter = dataset.this$0.attributes.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.attrIter.hasNext()) {
                    Attribute next = this.attrIter.next();
                    this.attr = next;
                    if (next.isDataAttribute()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public Map.Entry<String, String> next() {
                return new Attribute(this.attr.getKey().substring(5), this.attr.getValue());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.this$1.this$0.attributes.remove(this.attr.getKey());
            }
        }

        /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Attributes$Dataset$EntrySet.class */
        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            public final Dataset this$1;

            private EntrySet(Dataset dataset) {
                this.this$1 = dataset;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new DatasetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i10 = 0;
                while (new DatasetIterator().hasNext()) {
                    i10++;
                }
                return i10;
            }
        }

        private Dataset(Attributes attributes) {
            this.this$0 = attributes;
            if (attributes.attributes == null) {
                attributes.attributes = new LinkedHashMap(2);
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String put(String str, String str2) {
            String dataKey = Attributes.dataKey(str);
            String value = this.this$0.hasKey(dataKey) ? ((Attribute) this.this$0.attributes.get(dataKey)).getValue() : null;
            this.this$0.attributes.put(dataKey, new Attribute(dataKey, str2));
            return value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String dataKey(String str) {
        return dataPrefix + str;
    }

    public void addAll(Attributes attributes) {
        if (attributes.size() == 0) {
            return;
        }
        if (this.attributes == null) {
            this.attributes = new LinkedHashMap<>(attributes.size());
        }
        this.attributes.putAll(attributes.attributes);
    }

    public List<Attribute> asList() {
        if (this.attributes == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.attributes.size());
        Iterator<Map.Entry<String, Attribute>> it = this.attributes.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes clone() {
        if (this.attributes == null) {
            return new Attributes();
        }
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.attributes = new LinkedHashMap<>(this.attributes.size());
            Iterator<Attribute> it = iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                attributes.attributes.put(next.getKey(), next.clone());
            }
            return attributes;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Map<String, String> dataset() {
        return new Dataset();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        LinkedHashMap<String, Attribute> linkedHashMap2 = ((Attributes) obj).attributes;
        if (linkedHashMap == null ? linkedHashMap2 != null : !linkedHashMap.equals(linkedHashMap2)) {
            z10 = false;
        }
        return z10;
    }

    public String get(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return "";
        }
        Attribute attribute = linkedHashMap.get(str.toLowerCase());
        return attribute != null ? attribute.getValue() : "";
    }

    public boolean hasKey(String str) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null && linkedHashMap.containsKey(str.toLowerCase());
    }

    public int hashCode() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null ? linkedHashMap.hashCode() : 0;
    }

    public String html() {
        StringBuilder sb2 = new StringBuilder();
        html(sb2, new Document("").outputSettings());
        return sb2.toString();
    }

    public void html(StringBuilder sb2, Document.OutputSettings outputSettings) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return;
        }
        Iterator<Map.Entry<String, Attribute>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Attribute value = it.next().getValue();
            sb2.append(" ");
            value.html(sb2, outputSettings);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return asList().iterator();
    }

    public void put(String str, String str2) {
        put(new Attribute(str, str2));
    }

    public void put(String str, boolean z10) {
        if (z10) {
            put(new BooleanAttribute(str));
        } else {
            remove(str);
        }
    }

    public void put(Attribute attribute) {
        Validate.notNull(attribute);
        if (this.attributes == null) {
            this.attributes = new LinkedHashMap<>(2);
        }
        this.attributes.put(attribute.getKey(), attribute);
    }

    public void remove(String str) {
        Validate.notEmpty(str);
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return;
        }
        linkedHashMap.remove(str.toLowerCase());
    }

    public int size() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public String toString() {
        return html();
    }
}
