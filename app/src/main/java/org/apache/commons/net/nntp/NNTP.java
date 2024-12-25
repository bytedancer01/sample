package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p255io.CRLFLineReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/NNTP.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/NNTP.class */
public class NNTP extends SocketClient {
    public static final int DEFAULT_PORT = 119;
    private static final String __DEFAULT_ENCODING = "ISO-8859-1";
    public ProtocolCommandSupport _commandSupport_;
    public boolean _isAllowedToPost;
    public BufferedReader _reader_;
    public int _replyCode;
    public String _replyString;
    public BufferedWriter _writer_;

    public NNTP() {
        setDefaultPort(119);
        this._replyString = null;
        this._reader_ = null;
        this._writer_ = null;
        this._isAllowedToPost = false;
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private void __getReply() {
        String readLine = this._reader_.readLine();
        this._replyString = readLine;
        if (readLine == null) {
            throw new NNTPConnectionClosedException("Connection closed without indication.");
        }
        if (readLine.length() < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + this._replyString);
        }
        try {
            int parseInt = Integer.parseInt(this._replyString.substring(0, 3));
            this._replyCode = parseInt;
            fireReplyReceived(parseInt, this._replyString + SocketClient.NETASCII_EOL);
            if (this._replyCode == 400) {
                throw new NNTPConnectionClosedException("NNTP response 400 received.  Server closed connection.");
            }
        } catch (NumberFormatException e10) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + this._replyString);
        }
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        this._reader_ = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer_ = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        __getReply();
        this._isAllowedToPost = this._replyCode == 200;
    }

    public int article() {
        return sendCommand(0);
    }

    @Deprecated
    public int article(int i10) {
        return article(i10);
    }

    public int article(long j10) {
        return sendCommand(0, Long.toString(j10));
    }

    public int article(String str) {
        return sendCommand(0, str);
    }

    public int authinfoPass(String str) {
        return sendCommand(15, "PASS " + str);
    }

    public int authinfoUser(String str) {
        return sendCommand(15, "USER " + str);
    }

    public int body() {
        return sendCommand(1);
    }

    @Deprecated
    public int body(int i10) {
        return body(i10);
    }

    public int body(long j10) {
        return sendCommand(1, Long.toString(j10));
    }

    public int body(String str) {
        return sendCommand(1, str);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._reader_ = null;
        this._writer_ = null;
        this._replyString = null;
        this._isAllowedToPost = false;
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
        return this._replyString;
    }

    public int group(String str) {
        return sendCommand(2, str);
    }

    public int head() {
        return sendCommand(3);
    }

    @Deprecated
    public int head(int i10) {
        return head(i10);
    }

    public int head(long j10) {
        return sendCommand(3, Long.toString(j10));
    }

    public int head(String str) {
        return sendCommand(3, str);
    }

    public int help() {
        return sendCommand(4);
    }

    public int ihave(String str) {
        return sendCommand(5, str);
    }

    public boolean isAllowedToPost() {
        return this._isAllowedToPost;
    }

    public int last() {
        return sendCommand(6);
    }

    public int list() {
        return sendCommand(7);
    }

    public int listActive(String str) {
        return sendCommand(7, "ACTIVE " + str);
    }

    public int newgroups(String str, String str2, boolean z10, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        sb2.append(str2);
        if (z10) {
            sb2.append(' ');
            sb2.append("GMT");
        }
        if (str3 != null) {
            sb2.append(" <");
            sb2.append(str3);
            sb2.append('>');
        }
        return sendCommand(8, sb2.toString());
    }

    public int newnews(String str, String str2, String str3, boolean z10, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        sb2.append(str2);
        sb2.append(' ');
        sb2.append(str3);
        if (z10) {
            sb2.append(' ');
            sb2.append("GMT");
        }
        if (str4 != null) {
            sb2.append(" <");
            sb2.append(str4);
            sb2.append('>');
        }
        return sendCommand(9, sb2.toString());
    }

    public int next() {
        return sendCommand(10);
    }

    public int post() {
        return sendCommand(11);
    }

    public int quit() {
        return sendCommand(12);
    }

    public int sendCommand(int i10) {
        return sendCommand(i10, (String) null);
    }

    public int sendCommand(int i10, String str) {
        return sendCommand(NNTPCommand.getCommand(i10), str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(str2);
        }
        sb2.append(SocketClient.NETASCII_EOL);
        BufferedWriter bufferedWriter = this._writer_;
        String sb3 = sb2.toString();
        bufferedWriter.write(sb3);
        this._writer_.flush();
        fireCommandSent(str, sb3);
        __getReply();
        return this._replyCode;
    }

    public int stat() {
        return sendCommand(14);
    }

    @Deprecated
    public int stat(int i10) {
        return stat(i10);
    }

    public int stat(long j10) {
        return sendCommand(14, Long.toString(j10));
    }

    public int stat(String str) {
        return sendCommand(14, str);
    }

    public int xhdr(String str, String str2) {
        return sendCommand(17, str + " " + str2);
    }

    public int xover(String str) {
        return sendCommand(16, str);
    }
}
