package org.apache.commons.net.nntp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/SimpleNNTPHeader.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/SimpleNNTPHeader.class */
public class SimpleNNTPHeader {
    private final String __from;
    private final String __subject;
    private final StringBuilder __newsgroups = new StringBuilder();
    private final StringBuilder __headerFields = new StringBuilder();
    private int __newsgroupCount = 0;

    public SimpleNNTPHeader(String str, String str2) {
        this.__from = str;
        this.__subject = str2;
    }

    public void addHeaderField(String str, String str2) {
        this.__headerFields.append(str);
        this.__headerFields.append(": ");
        this.__headerFields.append(str2);
        this.__headerFields.append('\n');
    }

    public void addNewsgroup(String str) {
        int i10 = this.__newsgroupCount;
        this.__newsgroupCount = i10 + 1;
        if (i10 > 0) {
            this.__newsgroups.append(',');
        }
        this.__newsgroups.append(str);
    }

    public String getFromAddress() {
        return this.__from;
    }

    public String getNewsgroups() {
        return this.__newsgroups.toString();
    }

    public String getSubject() {
        return this.__subject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("From: ");
        sb2.append(this.__from);
        sb2.append("\nNewsgroups: ");
        sb2.append(this.__newsgroups.toString());
        sb2.append("\nSubject: ");
        sb2.append(this.__subject);
        sb2.append('\n');
        if (this.__headerFields.length() > 0) {
            sb2.append(this.__headerFields.toString());
        }
        sb2.append('\n');
        return sb2.toString();
    }
}
