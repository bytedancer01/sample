package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/HeaderGroup.class */
public class HeaderGroup implements Cloneable, Serializable {
    private static final long serialVersionUID = 2608834160639271617L;
    private final Header[] EMPTY = new Header[0];
    private final List<Header> headers = new ArrayList(16);

    public void addHeader(Header header) {
        if (header == null) {
            return;
        }
        this.headers.add(header);
    }

    public void clear() {
        this.headers.clear();
    }

    public Object clone() {
        return super.clone();
    }

    public boolean containsHeader(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            if (this.headers.get(i10).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public HeaderGroup copy() {
        HeaderGroup headerGroup = new HeaderGroup();
        headerGroup.headers.addAll(this.headers);
        return headerGroup;
    }

    public Header[] getAllHeaders() {
        List<Header> list = this.headers;
        return (Header[]) list.toArray(new Header[list.size()]);
    }

    public Header getCondensedHeader(String str) {
        Header[] headers = getHeaders(str);
        if (headers.length == 0) {
            return null;
        }
        if (headers.length == 1) {
            return headers[0];
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
        charArrayBuffer.append(headers[0].getValue());
        for (int i10 = 1; i10 < headers.length; i10++) {
            charArrayBuffer.append(", ");
            charArrayBuffer.append(headers[i10].getValue());
        }
        return new BasicHeader(str.toLowerCase(Locale.ROOT), charArrayBuffer.toString());
    }

    public Header getFirstHeader(String str) {
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            Header header = this.headers.get(i10);
            if (header.getName().equalsIgnoreCase(str)) {
                return header;
            }
        }
        return null;
    }

    public Header[] getHeaders(String str) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < this.headers.size()) {
            Header header = this.headers.get(i10);
            ArrayList arrayList2 = arrayList;
            if (header.getName().equalsIgnoreCase(str)) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(header);
            }
            i10++;
            arrayList = arrayList2;
        }
        return arrayList != null ? (Header[]) arrayList.toArray(new Header[arrayList.size()]) : this.EMPTY;
    }

    public Header getLastHeader(String str) {
        for (int size = this.headers.size() - 1; size >= 0; size--) {
            Header header = this.headers.get(size);
            if (header.getName().equalsIgnoreCase(str)) {
                return header;
            }
        }
        return null;
    }

    public HeaderIterator iterator() {
        return new BasicListHeaderIterator(this.headers, null);
    }

    public HeaderIterator iterator(String str) {
        return new BasicListHeaderIterator(this.headers, str);
    }

    public void removeHeader(Header header) {
        if (header == null) {
            return;
        }
        this.headers.remove(header);
    }

    public void setHeaders(Header[] headerArr) {
        clear();
        if (headerArr == null) {
            return;
        }
        Collections.addAll(this.headers, headerArr);
    }

    public String toString() {
        return this.headers.toString();
    }

    public void updateHeader(Header header) {
        if (header == null) {
            return;
        }
        for (int i10 = 0; i10 < this.headers.size(); i10++) {
            if (this.headers.get(i10).getName().equalsIgnoreCase(header.getName())) {
                this.headers.set(i10, header);
                return;
            }
        }
        this.headers.add(header);
    }
}
