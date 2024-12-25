package org.simpleframework.xml.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/OutputStack.class */
class OutputStack extends ArrayList<OutputNode> {
    private final Set active;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/OutputStack$Sequence.class */
    public class Sequence implements Iterator<OutputNode> {
        private int cursor;
        public final OutputStack this$0;

        public Sequence(OutputStack outputStack) {
            this.this$0 = outputStack;
            this.cursor = outputStack.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.cursor > 0;
        }

        @Override // java.util.Iterator
        public OutputNode next() {
            if (!hasNext()) {
                return null;
            }
            OutputStack outputStack = this.this$0;
            int i10 = this.cursor - 1;
            this.cursor = i10;
            return outputStack.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            this.this$0.purge(this.cursor);
        }
    }

    public OutputStack(Set set) {
        this.active = set;
    }

    public OutputNode bottom() {
        if (size() <= 0) {
            return null;
        }
        return get(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<OutputNode> iterator() {
        return new Sequence(this);
    }

    public OutputNode pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return purge(size - 1);
    }

    public OutputNode purge(int i10) {
        OutputNode remove = remove(i10);
        if (remove != null) {
            this.active.remove(remove);
        }
        return remove;
    }

    public OutputNode push(OutputNode outputNode) {
        this.active.add(outputNode);
        add(outputNode);
        return outputNode;
    }

    public OutputNode top() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }
}
