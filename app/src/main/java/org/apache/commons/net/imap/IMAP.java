package org.apache.commons.net.imap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p255io.CRLFLineReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/imap/IMAP.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAP.class */
public class IMAP extends SocketClient {
    public static final int DEFAULT_PORT = 143;
    public static final IMAPChunkListener TRUE_CHUNK_LISTENER = new IMAPChunkListener() { // from class: org.apache.commons.net.imap.IMAP.1
        @Override // org.apache.commons.net.imap.IMAP.IMAPChunkListener
        public boolean chunkReceived(IMAP imap) {
            return true;
        }
    };
    public static final String __DEFAULT_ENCODING = "ISO-8859-1";
    private volatile IMAPChunkListener __chunkListener;
    private IMAPState __state;
    public BufferedWriter __writer;
    private final char[] _initialID = {'A', 'A', 'A', 'A'};
    public BufferedReader _reader;
    private int _replyCode;
    private final List<String> _replyLines;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/IMAP$IMAPChunkListener.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAP$IMAPChunkListener.class */
    public interface IMAPChunkListener {
        boolean chunkReceived(IMAP imap);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/IMAP$IMAPState.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAP$IMAPState.class */
    public enum IMAPState {
        DISCONNECTED_STATE,
        NOT_AUTH_STATE,
        AUTH_STATE,
        LOGOUT_STATE
    }

    public IMAP() {
        setDefaultPort(DEFAULT_PORT);
        this.__state = IMAPState.DISCONNECTED_STATE;
        this._reader = null;
        this.__writer = null;
        this._replyLines = new ArrayList();
        createCommandSupport();
    }

    private void __getReply() {
        __getReply(true);
    }

    private void __getReply(boolean z10) {
        int untaggedReplyCode;
        IMAPChunkListener iMAPChunkListener;
        this._replyLines.clear();
        String readLine = this._reader.readLine();
        if (readLine == null) {
            throw new EOFException("Connection closed without indication.");
        }
        this._replyLines.add(readLine);
        if (z10) {
            while (IMAPReply.isUntagged(readLine)) {
                int literalCount = IMAPReply.literalCount(readLine);
                boolean z11 = literalCount >= 0;
                while (literalCount >= 0) {
                    String readLine2 = this._reader.readLine();
                    if (readLine2 == null) {
                        throw new EOFException("Connection closed without indication.");
                    }
                    this._replyLines.add(readLine2);
                    literalCount -= readLine2.length() + 2;
                }
                if (z11 && (iMAPChunkListener = this.__chunkListener) != null && iMAPChunkListener.chunkReceived(this)) {
                    fireReplyReceived(3, getReplyString());
                    this._replyLines.clear();
                }
                readLine = this._reader.readLine();
                if (readLine == null) {
                    throw new EOFException("Connection closed without indication.");
                }
                this._replyLines.add(readLine);
            }
            untaggedReplyCode = IMAPReply.getReplyCode(readLine);
        } else {
            untaggedReplyCode = IMAPReply.getUntaggedReplyCode(readLine);
        }
        this._replyCode = untaggedReplyCode;
        fireReplyReceived(this._replyCode, getReplyString());
    }

    private int sendCommandWithID(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        sb2.append(str2);
        if (str3 != null) {
            sb2.append(' ');
            sb2.append(str3);
        }
        sb2.append(SocketClient.NETASCII_EOL);
        String sb3 = sb2.toString();
        this.__writer.write(sb3);
        this.__writer.flush();
        fireCommandSent(str2, sb3);
        __getReply();
        return this._replyCode;
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this.__writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        int soTimeout = getSoTimeout();
        if (soTimeout <= 0) {
            setSoTimeout(this.connectTimeout);
        }
        __getReply(false);
        if (soTimeout <= 0) {
            setSoTimeout(soTimeout);
        }
        setState(IMAPState.NOT_AUTH_STATE);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._reader = null;
        this.__writer = null;
        this._replyLines.clear();
        setState(IMAPState.DISCONNECTED_STATE);
    }

    public boolean doCommand(IMAPCommand iMAPCommand) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand));
    }

    public boolean doCommand(IMAPCommand iMAPCommand, String str) {
        return IMAPReply.isSuccess(sendCommand(iMAPCommand, str));
    }

    @Override // org.apache.commons.net.SocketClient
    public void fireReplyReceived(int i10, String str) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireReplyReceived(i10, getReplyString());
        }
    }

    public String generateCommandID() {
        String str = new String(this._initialID);
        int length = this._initialID.length;
        boolean z10 = true;
        while (true) {
            length--;
            if (!z10 || length < 0) {
                break;
            }
            char[] cArr = this._initialID;
            char c10 = cArr[length];
            if (c10 == 'Z') {
                cArr[length] = 'A';
            } else {
                cArr[length] = (char) (c10 + 1);
                z10 = false;
            }
        }
        return str;
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

    public IMAPState getState() {
        return this.__state;
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        return sendCommandWithID(generateCommandID(), str, str2);
    }

    public int sendCommand(IMAPCommand iMAPCommand) {
        return sendCommand(iMAPCommand, (String) null);
    }

    public int sendCommand(IMAPCommand iMAPCommand, String str) {
        return sendCommand(iMAPCommand.getIMAPCommand(), str);
    }

    public int sendData(String str) {
        return sendCommandWithID(null, str, null);
    }

    public void setChunkListener(IMAPChunkListener iMAPChunkListener) {
        this.__chunkListener = iMAPChunkListener;
    }

    public void setState(IMAPState iMAPState) {
        this.__state = iMAPState;
    }
}
