package org.apache.http;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HeaderIterator.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HeaderIterator.class */
public interface HeaderIterator extends Iterator<Object> {
    @Override // java.util.Iterator
    boolean hasNext();

    Header nextHeader();
}
