package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicListHeaderIterator.class */
public class BasicListHeaderIterator implements HeaderIterator {
    public final List<Header> allHeaders;
    public String headerName;
    public int currentIndex = findNext(-1);
    public int lastIndex = -1;

    public BasicListHeaderIterator(List<Header> list, String str) {
        this.allHeaders = (List) Args.notNull(list, "Header list");
        this.headerName = str;
    }

    public boolean filterHeader(int i10) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(this.allHeaders.get(i10).getName());
    }

    public int findNext(int i10) {
        boolean z10;
        int i11 = -1;
        if (i10 < -1) {
            return -1;
        }
        int size = this.allHeaders.size();
        boolean z11 = false;
        while (true) {
            z10 = z11;
            if (z10 || i10 >= size - 1) {
                break;
            }
            i10++;
            z11 = filterHeader(i10);
        }
        if (z10) {
            i11 = i10;
        }
        return i11;
    }

    @Override // org.apache.http.HeaderIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextHeader();
    }

    @Override // org.apache.http.HeaderIterator
    public Header nextHeader() {
        int i10 = this.currentIndex;
        if (i10 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.lastIndex = i10;
        this.currentIndex = findNext(i10);
        return this.allHeaders.get(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        Asserts.check(this.lastIndex >= 0, "No header to remove");
        this.allHeaders.remove(this.lastIndex);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
