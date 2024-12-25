package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/EchoOptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/EchoOptionHandler.class */
public class EchoOptionHandler extends TelnetOptionHandler {
    public EchoOptionHandler() {
        super(1, false, false, false, false);
    }

    public EchoOptionHandler(boolean z10, boolean z11, boolean z12, boolean z13) {
        super(1, z10, z11, z12, z13);
    }
}
