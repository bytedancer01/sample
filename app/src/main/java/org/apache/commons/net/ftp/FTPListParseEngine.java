package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.net.util.Charsets;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPListParseEngine.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPListParseEngine.class */
public class FTPListParseEngine {
    private ListIterator<String> _internalIterator;
    private List<String> entries;
    private final FTPFileEntryParser parser;
    private final boolean saveUnparseableEntries;

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser) {
        this(fTPFileEntryParser, null);
    }

    public FTPListParseEngine(FTPFileEntryParser fTPFileEntryParser, FTPClientConfig fTPClientConfig) {
        LinkedList linkedList = new LinkedList();
        this.entries = linkedList;
        this._internalIterator = linkedList.listIterator();
        this.parser = fTPFileEntryParser;
        this.saveUnparseableEntries = fTPClientConfig != null ? fTPClientConfig.getUnparseableEntries() : false;
    }

    private void readStream(InputStream inputStream, String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.toCharset(str)));
        while (true) {
            String readNextEntry = this.parser.readNextEntry(bufferedReader);
            if (readNextEntry == null) {
                bufferedReader.close();
                return;
            }
            this.entries.add(readNextEntry);
        }
    }

    public FTPFile[] getFiles() {
        return getFiles(FTPFileFilters.NON_NULL);
    }

    public FTPFile[] getFiles(FTPFileFilter fTPFileFilter) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.entries) {
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(str);
            FTPFile fTPFile = parseFTPEntry;
            if (parseFTPEntry == null) {
                fTPFile = parseFTPEntry;
                if (this.saveUnparseableEntries) {
                    fTPFile = new FTPFile(str);
                }
            }
            if (fTPFileFilter.accept(fTPFile)) {
                arrayList.add(fTPFile);
            }
        }
        return (FTPFile[]) arrayList.toArray(new FTPFile[arrayList.size()]);
    }

    public FTPFile[] getNext(int i10) {
        LinkedList linkedList = new LinkedList();
        while (i10 > 0 && this._internalIterator.hasNext()) {
            String next = this._internalIterator.next();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(next);
            FTPFile fTPFile = parseFTPEntry;
            if (parseFTPEntry == null) {
                fTPFile = parseFTPEntry;
                if (this.saveUnparseableEntries) {
                    fTPFile = new FTPFile(next);
                }
            }
            linkedList.add(fTPFile);
            i10--;
        }
        return (FTPFile[]) linkedList.toArray(new FTPFile[linkedList.size()]);
    }

    public FTPFile[] getPrevious(int i10) {
        LinkedList linkedList = new LinkedList();
        while (i10 > 0 && this._internalIterator.hasPrevious()) {
            String previous = this._internalIterator.previous();
            FTPFile parseFTPEntry = this.parser.parseFTPEntry(previous);
            FTPFile fTPFile = parseFTPEntry;
            if (parseFTPEntry == null) {
                fTPFile = parseFTPEntry;
                if (this.saveUnparseableEntries) {
                    fTPFile = new FTPFile(previous);
                }
            }
            linkedList.add(0, fTPFile);
            i10--;
        }
        return (FTPFile[]) linkedList.toArray(new FTPFile[linkedList.size()]);
    }

    public boolean hasNext() {
        return this._internalIterator.hasNext();
    }

    public boolean hasPrevious() {
        return this._internalIterator.hasPrevious();
    }

    @Deprecated
    public void readServerList(InputStream inputStream) {
        readServerList(inputStream, null);
    }

    public void readServerList(InputStream inputStream, String str) {
        this.entries = new LinkedList();
        readStream(inputStream, str);
        this.parser.preParse(this.entries);
        resetIterator();
    }

    public void resetIterator() {
        this._internalIterator = this.entries.listIterator();
    }
}
