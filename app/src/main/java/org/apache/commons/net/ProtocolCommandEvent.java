package org.apache.commons.net;

import java.util.EventObject;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ProtocolCommandEvent.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ProtocolCommandEvent.class */
public class ProtocolCommandEvent extends EventObject {
    private static final long serialVersionUID = 403743538418947240L;
    private final String __command;
    private final boolean __isCommand;
    private final String __message;
    private final int __replyCode;

    public ProtocolCommandEvent(Object obj, int i10, String str) {
        super(obj);
        this.__replyCode = i10;
        this.__message = str;
        this.__isCommand = false;
        this.__command = null;
    }

    public ProtocolCommandEvent(Object obj, String str, String str2) {
        super(obj);
        this.__replyCode = 0;
        this.__message = str2;
        this.__isCommand = true;
        this.__command = str;
    }

    public String getCommand() {
        return this.__command;
    }

    public String getMessage() {
        return this.__message;
    }

    public int getReplyCode() {
        return this.__replyCode;
    }

    public boolean isCommand() {
        return this.__isCommand;
    }

    public boolean isReply() {
        return !isCommand();
    }
}
