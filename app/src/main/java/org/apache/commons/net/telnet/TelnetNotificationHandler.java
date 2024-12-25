package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetNotificationHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetNotificationHandler.class */
public interface TelnetNotificationHandler {
    public static final int RECEIVED_COMMAND = 5;
    public static final int RECEIVED_DO = 1;
    public static final int RECEIVED_DONT = 2;
    public static final int RECEIVED_WILL = 3;
    public static final int RECEIVED_WONT = 4;

    void receivedNegotiation(int i10, int i11);
}
