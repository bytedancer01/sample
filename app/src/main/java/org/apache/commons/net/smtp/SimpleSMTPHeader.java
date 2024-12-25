package org.apache.commons.net.smtp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/smtp/SimpleSMTPHeader.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/SimpleSMTPHeader.class */
public class SimpleSMTPHeader {
    private StringBuffer __cc;
    private final String __from;
    private final StringBuffer __headerFields;
    private final String __subject;
    private final String __to;
    private boolean hasHeaderDate;

    public SimpleSMTPHeader(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("From cannot be null");
        }
        this.__to = str2;
        this.__from = str;
        this.__subject = str3;
        this.__headerFields = new StringBuffer();
        this.__cc = null;
    }

    public void addCC(String str) {
        StringBuffer stringBuffer = this.__cc;
        if (stringBuffer == null) {
            this.__cc = new StringBuffer();
        } else {
            stringBuffer.append(", ");
        }
        this.__cc.append(str);
    }

    public void addHeaderField(String str, String str2) {
        if (!this.hasHeaderDate && "Date".equals(str)) {
            this.hasHeaderDate = true;
        }
        this.__headerFields.append(str);
        this.__headerFields.append(": ");
        this.__headerFields.append(str2);
        this.__headerFields.append('\n');
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        if (!this.hasHeaderDate) {
            addHeaderField("Date", simpleDateFormat.format(new Date()));
        }
        if (this.__headerFields.length() > 0) {
            sb2.append(this.__headerFields.toString());
        }
        sb2.append("From: ");
        sb2.append(this.__from);
        sb2.append("\n");
        if (this.__to != null) {
            sb2.append("To: ");
            sb2.append(this.__to);
            sb2.append("\n");
        }
        if (this.__cc != null) {
            sb2.append("Cc: ");
            sb2.append(this.__cc.toString());
            sb2.append("\n");
        }
        if (this.__subject != null) {
            sb2.append("Subject: ");
            sb2.append(this.__subject);
            sb2.append("\n");
        }
        sb2.append('\n');
        return sb2.toString();
    }
}
