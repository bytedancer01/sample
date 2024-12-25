package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.net.p255io.DotTerminatedMessageReader;
import org.apache.commons.net.p255io.Util;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/ReplyIterator.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/ReplyIterator.class */
class ReplyIterator implements Iterator<String>, Iterable<String> {
    private String line;
    private final BufferedReader reader;
    private Exception savedException;

    public ReplyIterator(BufferedReader bufferedReader) {
        this(bufferedReader, true);
    }

    public ReplyIterator(BufferedReader bufferedReader, boolean z10) {
        BufferedReader dotTerminatedMessageReader = z10 ? new DotTerminatedMessageReader(bufferedReader) : bufferedReader;
        this.reader = dotTerminatedMessageReader;
        String readLine = dotTerminatedMessageReader.readLine();
        this.line = readLine;
        if (readLine == null) {
            Util.closeQuietly(dotTerminatedMessageReader);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.savedException == null) {
            return this.line != null;
        }
        throw new NoSuchElementException(this.savedException.toString());
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public String next() {
        if (this.savedException != null) {
            throw new NoSuchElementException(this.savedException.toString());
        }
        String str = this.line;
        if (str == null) {
            throw new NoSuchElementException();
        }
        try {
            String readLine = this.reader.readLine();
            this.line = readLine;
            if (readLine == null) {
                Util.closeQuietly(this.reader);
            }
        } catch (IOException e10) {
            this.savedException = e10;
            Util.closeQuietly(this.reader);
        }
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
