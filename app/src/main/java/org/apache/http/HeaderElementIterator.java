package org.apache.http;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/HeaderElementIterator.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/HeaderElementIterator.class */
public interface HeaderElementIterator extends Iterator<Object> {
    @Override // java.util.Iterator
    boolean hasNext();

    HeaderElement nextElement();
}
