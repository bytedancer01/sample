package org.apache.commons.net.nntp;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/ArticleIterator.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/ArticleIterator.class */
class ArticleIterator implements Iterator<Article>, Iterable<Article> {
    private final Iterator<String> stringIterator;

    public ArticleIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    @Override // java.lang.Iterable
    public Iterator<Article> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Article next() {
        return NNTPClient.__parseArticleEntry(this.stringIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.stringIterator.remove();
    }
}