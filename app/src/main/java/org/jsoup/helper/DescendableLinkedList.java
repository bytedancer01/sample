package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: combined.jar:classes3.jar:org/jsoup/helper/DescendableLinkedList.class */
public class DescendableLinkedList<E> extends LinkedList<E> {

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/DescendableLinkedList$DescendingIterator.class */
    public class DescendingIterator<E> implements Iterator<E> {
        private final ListIterator<E> iter;
        public final DescendableLinkedList this$0;

        private DescendingIterator(DescendableLinkedList descendableLinkedList, int i10) {
            this.this$0 = descendableLinkedList;
            this.iter = descendableLinkedList.listIterator(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iter.previous();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iter.remove();
        }
    }

    @Override // java.util.LinkedList, java.util.Deque
    public Iterator<E> descendingIterator() {
        return new DescendingIterator(size());
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E peekLast() {
        return size() == 0 ? null : getLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E pollLast() {
        return size() == 0 ? null : removeLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void push(E e10) {
        addFirst(e10);
    }
}
