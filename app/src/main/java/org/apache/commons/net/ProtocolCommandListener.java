package org.apache.commons.net;

import java.util.EventListener;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ProtocolCommandListener.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ProtocolCommandListener.class */
public interface ProtocolCommandListener extends EventListener {
    void protocolCommandSent(ProtocolCommandEvent protocolCommandEvent);

    void protocolReplyReceived(ProtocolCommandEvent protocolCommandEvent);
}
