package org.apache.commons.net.pop3;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p255io.CRLFLineReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/pop3/POP3.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/POP3.class */
public class POP3 extends SocketClient {
    public static final int AUTHORIZATION_STATE = 0;
    public static final int DEFAULT_PORT = 110;
    public static final int DISCONNECTED_STATE = -1;
    public static final int TRANSACTION_STATE = 1;
    public static final int UPDATE_STATE = 2;
    public static final String _DEFAULT_ENCODING = "ISO-8859-1";
    public static final String _ERROR = "-ERR";
    public static final String _OK = "+OK";
    public static final String _OK_INT = "+ ";
    private int __popState;
    public ProtocolCommandSupport _commandSupport_;
    public String _lastReplyLine;
    public BufferedReader _reader;
    public int _replyCode;
    public List<String> _replyLines;
    public BufferedWriter _writer;

    public POP3() {
        setDefaultPort(110);
        this.__popState = -1;
        this._reader = null;
        this._writer = null;
        this._replyLines = new ArrayList();
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private void __getReply() {
        int i10;
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new EOFException("Connection closed without indication.");
        }
        if (readLine.startsWith(_OK)) {
            i10 = 0;
        } else if (readLine.startsWith(_ERROR)) {
            i10 = 1;
        } else {
            if (!readLine.startsWith(_OK_INT)) {
                throw new MalformedServerReplyException("Received invalid POP3 protocol response from server." + readLine);
            }
            i10 = 2;
        }
        this._replyCode = i10;
        this._replyLines.add(readLine);
        this._lastReplyLine = readLine;
        fireReplyReceived(this._replyCode, getReplyString());
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        __getReply();
        setState(0);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this._writer = null;
        this._lastReplyLine = null;
        this._replyLines.clear();
        setState(-1);
    }

    public void getAdditionalReply() {
        String readLine;
        do {
            readLine = this._reader.readLine();
            if (readLine == null) {
                return;
            } else {
                this._replyLines.add(readLine);
            }
        } while (!readLine.equals(InstructionFileId.DOT));
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public String getReplyString() {
        StringBuilder sb2 = new StringBuilder(256);
        Iterator<String> it = this._replyLines.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(SocketClient.NETASCII_EOL);
        }
        return sb2.toString();
    }

    public String[] getReplyStrings() {
        List<String> list = this._replyLines;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public int getState() {
        return this.__popState;
    }

    public void removeProtocolCommandistener(ProtocolCommandListener protocolCommandListener) {
        removeProtocolCommandListener(protocolCommandListener);
    }

    public int sendCommand(int i10) {
        return sendCommand(POP3Command._commands[i10], (String) null);
    }

    public int sendCommand(int i10, String str) {
        return sendCommand(POP3Command._commands[i10], str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        if (this._writer == null) {
            throw new IllegalStateException("Socket is not connected");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(str2);
        }
        sb2.append(SocketClient.NETASCII_EOL);
        String sb3 = sb2.toString();
        this._writer.write(sb3);
        this._writer.flush();
        fireCommandSent(str, sb3);
        __getReply();
        return this._replyCode;
    }

    public void setState(int i10) {
        this.__popState = i10;
    }
}
