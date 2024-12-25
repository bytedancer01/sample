package org.apache.commons.net.smtp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p255io.CRLFLineReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/smtp/SMTP.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/SMTP.class */
public class SMTP extends SocketClient {
    public static final int DEFAULT_PORT = 25;
    private static final String __DEFAULT_ENCODING = "ISO-8859-1";
    public ProtocolCommandSupport _commandSupport_;
    private boolean _newReplyString;
    public BufferedReader _reader;
    private int _replyCode;
    private final ArrayList<String> _replyLines;
    private String _replyString;
    public BufferedWriter _writer;
    public final String encoding;

    public SMTP() {
        this("ISO-8859-1");
    }

    public SMTP(String str) {
        setDefaultPort(25);
        this._replyLines = new ArrayList<>();
        this._newReplyString = false;
        this._replyString = null;
        this._commandSupport_ = new ProtocolCommandSupport(this);
        this.encoding = str;
    }

    private void __getReply() {
        this._newReplyString = true;
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new SMTPConnectionClosedException("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + readLine);
        }
        try {
            this._replyCode = Integer.parseInt(readLine.substring(0, 3));
            this._replyLines.add(readLine);
            if (length > 3 && readLine.charAt(3) == '-') {
                while (true) {
                    String readLine2 = this._reader.readLine();
                    if (readLine2 == null) {
                        throw new SMTPConnectionClosedException("Connection closed without indication.");
                    }
                    this._replyLines.add(readLine2);
                    if (readLine2.length() >= 4 && readLine2.charAt(3) != '-' && Character.isDigit(readLine2.charAt(0))) {
                        break;
                    }
                }
            }
            fireReplyReceived(this._replyCode, getReplyString());
            if (this._replyCode == 421) {
                throw new SMTPConnectionClosedException("SMTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException e10) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + readLine);
        }
    }

    private int __sendCommand(int i10, String str, boolean z10) {
        return __sendCommand(SMTPCommand.getCommand(i10), str, z10);
    }

    private int __sendCommand(String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            if (z10) {
                sb2.append(' ');
            }
            sb2.append(str2);
        }
        sb2.append(SocketClient.NETASCII_EOL);
        BufferedWriter bufferedWriter = this._writer;
        String sb3 = sb2.toString();
        bufferedWriter.write(sb3);
        this._writer.flush();
        fireCommandSent(str, sb3);
        __getReply();
        return this._replyCode;
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, this.encoding));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, this.encoding));
        __getReply();
    }

    public int data() {
        return sendCommand(3);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this._writer = null;
        this._replyString = null;
        this._replyLines.clear();
        this._newReplyString = false;
    }

    public int expn(String str) {
        return sendCommand(9, str);
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public int getReply() {
        __getReply();
        return this._replyCode;
    }

    public int getReplyCode() {
        return this._replyCode;
    }

    public String getReplyString() {
        if (!this._newReplyString) {
            return this._replyString;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this._replyLines.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(SocketClient.NETASCII_EOL);
        }
        this._newReplyString = false;
        String sb3 = sb2.toString();
        this._replyString = sb3;
        return sb3;
    }

    public String[] getReplyStrings() {
        ArrayList<String> arrayList = this._replyLines;
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public int helo(String str) {
        return sendCommand(0, str);
    }

    public int help() {
        return sendCommand(10);
    }

    public int help(String str) {
        return sendCommand(10, str);
    }

    public int mail(String str) {
        return __sendCommand(1, str, false);
    }

    public int noop() {
        return sendCommand(11);
    }

    public int quit() {
        return sendCommand(13);
    }

    public int rcpt(String str) {
        return __sendCommand(2, str, false);
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    public int rset() {
        return sendCommand(7);
    }

    public int saml(String str) {
        return sendCommand(6, str);
    }

    public int send(String str) {
        return sendCommand(4, str);
    }

    public int sendCommand(int i10) {
        return sendCommand(i10, (String) null);
    }

    public int sendCommand(int i10, String str) {
        return sendCommand(SMTPCommand.getCommand(i10), str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        return __sendCommand(str, str2, true);
    }

    public int soml(String str) {
        return sendCommand(5, str);
    }

    public int turn() {
        return sendCommand(12);
    }

    public int vrfy(String str) {
        return sendCommand(8, str);
    }
}
