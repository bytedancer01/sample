package org.apache.commons.net.smtp;

import java.util.Enumeration;
import java.util.Vector;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/smtp/RelayPath.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/RelayPath.class */
public final class RelayPath {
    public String _emailAddress;
    public Vector<String> _path = new Vector<>();

    public RelayPath(String str) {
        this._emailAddress = str;
    }

    public void addRelay(String str) {
        this._path.addElement(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        Enumeration<String> elements = this._path.elements();
        if (elements.hasMoreElements()) {
            sb2.append('@');
            while (true) {
                sb2.append(elements.nextElement());
                if (!elements.hasMoreElements()) {
                    break;
                }
                sb2.append(",@");
            }
            sb2.append(':');
        }
        sb2.append(this._emailAddress);
        sb2.append('>');
        return sb2.toString();
    }
}
