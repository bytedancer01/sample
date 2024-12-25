package org.apache.commons.net;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/PrintCommandListener.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/PrintCommandListener.class */
public class PrintCommandListener implements ProtocolCommandListener {
    private final boolean __directionMarker;
    private final char __eolMarker;
    private final boolean __nologin;
    private final PrintWriter __writer;

    public PrintCommandListener(PrintStream printStream) {
        this(new PrintWriter(printStream));
    }

    public PrintCommandListener(PrintStream printStream, boolean z10) {
        this(new PrintWriter(printStream), z10);
    }

    public PrintCommandListener(PrintStream printStream, boolean z10, char c10) {
        this(new PrintWriter(printStream), z10, c10);
    }

    public PrintCommandListener(PrintStream printStream, boolean z10, char c10, boolean z11) {
        this(new PrintWriter(printStream), z10, c10, z11);
    }

    public PrintCommandListener(PrintWriter printWriter) {
        this(printWriter, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z10) {
        this(printWriter, z10, (char) 0);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z10, char c10) {
        this(printWriter, z10, c10, false);
    }

    public PrintCommandListener(PrintWriter printWriter, boolean z10, char c10, boolean z11) {
        this.__writer = printWriter;
        this.__nologin = z10;
        this.__eolMarker = c10;
        this.__directionMarker = z11;
    }

    private String getPrintableString(String str) {
        if (this.__eolMarker == 0) {
            return str;
        }
        int indexOf = str.indexOf(SocketClient.NETASCII_EOL);
        String str2 = str;
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf) + this.__eolMarker + str.substring(indexOf);
        }
        return str2;
    }

    @Override // org.apache.commons.net.ProtocolCommandListener
    public void protocolCommandSent(ProtocolCommandEvent protocolCommandEvent) {
        if (this.__directionMarker) {
            this.__writer.print("> ");
        }
        if (this.__nologin) {
            String command = protocolCommandEvent.getCommand();
            if ("PASS".equalsIgnoreCase(command) || "USER".equalsIgnoreCase(command)) {
                this.__writer.print(command);
            } else if ("LOGIN".equalsIgnoreCase(command)) {
                String message = protocolCommandEvent.getMessage();
                this.__writer.print(message.substring(0, message.indexOf("LOGIN") + 5));
            }
            this.__writer.println(" *******");
            this.__writer.flush();
        }
        this.__writer.print(getPrintableString(protocolCommandEvent.getMessage()));
        this.__writer.flush();
    }

    @Override // org.apache.commons.net.ProtocolCommandListener
    public void protocolReplyReceived(ProtocolCommandEvent protocolCommandEvent) {
        if (this.__directionMarker) {
            this.__writer.print("< ");
        }
        this.__writer.print(protocolCommandEvent.getMessage());
        this.__writer.flush();
    }
}
