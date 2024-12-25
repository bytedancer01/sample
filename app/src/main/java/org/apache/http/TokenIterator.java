package org.apache.http;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/TokenIterator.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/TokenIterator.class */
public interface TokenIterator extends Iterator<Object> {
    @Override // java.util.Iterator
    boolean hasNext();

    String nextToken();
}
