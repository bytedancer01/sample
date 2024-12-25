package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/SuppressGAOptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/SuppressGAOptionHandler.class */
public class SuppressGAOptionHandler extends TelnetOptionHandler {
    public SuppressGAOptionHandler() {
        super(3, false, false, false, false);
    }

    public SuppressGAOptionHandler(boolean z10, boolean z11, boolean z12, boolean z13) {
        super(3, z10, z11, z12, z13);
    }
}
