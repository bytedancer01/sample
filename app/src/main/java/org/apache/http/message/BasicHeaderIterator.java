package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicHeaderIterator.class */
public class BasicHeaderIterator implements HeaderIterator {
    public final Header[] allHeaders;
    public int currentIndex = findNext(-1);
    public String headerName;

    public BasicHeaderIterator(Header[] headerArr, String str) {
        this.allHeaders = (Header[]) Args.notNull(headerArr, "Header array");
        this.headerName = str;
    }

    public boolean filterHeader(int i10) {
        String str = this.headerName;
        return str == null || str.equalsIgnoreCase(this.allHeaders[i10].getName());
    }

    public int findNext(int i10) {
        boolean z10;
        int i11 = -1;
        if (i10 < -1) {
            return -1;
        }
        int length = this.allHeaders.length;
        boolean z11 = false;
        while (true) {
            z10 = z11;
            if (z10 || i10 >= length - 1) {
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
        this.currentIndex = findNext(i10);
        return this.allHeaders[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
