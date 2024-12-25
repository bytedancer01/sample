package kh;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/s.class
 */
/* renamed from: kh.s */
/* loaded from: combined.jar:classes2.jar:kh/s.class */
public final class C5625s implements ListIterator, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public static final C5625s f31700b = new C5625s();

    @Override // java.util.ListIterator, java.util.Iterator
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
