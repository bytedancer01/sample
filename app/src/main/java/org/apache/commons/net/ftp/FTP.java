package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p255io.CRLFLineReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTP.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTP.class */
public class FTP extends SocketClient {
    public static final int ASCII_FILE_TYPE = 0;
    public static final int BINARY_FILE_TYPE = 2;
    public static final int BLOCK_TRANSFER_MODE = 11;
    public static final int CARRIAGE_CONTROL_TEXT_FORMAT = 6;
    public static final int COMPRESSED_TRANSFER_MODE = 12;
    public static final String DEFAULT_CONTROL_ENCODING = "ISO-8859-1";
    public static final int DEFAULT_DATA_PORT = 20;
    public static final int DEFAULT_PORT = 21;
    public static final int EBCDIC_FILE_TYPE = 1;
    public static final int FILE_STRUCTURE = 7;
    public static final int LOCAL_FILE_TYPE = 3;
    public static final int NON_PRINT_TEXT_FORMAT = 4;
    public static final int PAGE_STRUCTURE = 9;
    public static final int RECORD_STRUCTURE = 8;
    public static final int REPLY_CODE_LEN = 3;
    public static final int STREAM_TRANSFER_MODE = 10;
    public static final int TELNET_TEXT_FORMAT = 5;
    private static final String __modes = "AEILNTCFRPSBC";
    public ProtocolCommandSupport _commandSupport_;
    public String _controlEncoding;
    public BufferedReader _controlInput_;
    public BufferedWriter _controlOutput_;
    public boolean _newReplyString;
    public int _replyCode;
    public ArrayList<String> _replyLines;
    public String _replyString;
    public boolean strictMultilineParsing = false;
    private boolean strictReplyParsing = true;

    public FTP() {
        setDefaultPort(21);
        this._replyLines = new ArrayList<>();
        this._newReplyString = false;
        this._replyString = null;
        this._controlEncoding = "ISO-8859-1";
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private String __buildMessage(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            sb2.append(' ');
            sb2.append(str2);
        }
        sb2.append(SocketClient.NETASCII_EOL);
        return sb2.toString();
    }

    private void __getReply() {
        __getReply(true);
    }

    private void __getReply(boolean z10) {
        this._newReplyString = true;
        this._replyLines.clear();
        String readLine = this._controlInput_.readLine();
        if (readLine == null) {
            throw new FTPConnectionClosedException("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + readLine);
        }
        try {
            String substring = readLine.substring(0, 3);
            this._replyCode = Integer.parseInt(substring);
            this._replyLines.add(readLine);
            if (length > 3) {
                char charAt = readLine.charAt(3);
                if (charAt == '-') {
                    while (true) {
                        String readLine2 = this._controlInput_.readLine();
                        if (readLine2 == null) {
                            throw new FTPConnectionClosedException("Connection closed without indication.");
                        }
                        this._replyLines.add(readLine2);
                        if (isStrictMultilineParsing()) {
                            if (!__strictCheck(readLine2, substring)) {
                                break;
                            }
                        } else if (!__lenientCheck(readLine2)) {
                            break;
                        }
                    }
                } else if (isStrictReplyParsing()) {
                    if (length == 4) {
                        throw new MalformedServerReplyException("Truncated server reply: '" + readLine + "'");
                    }
                    if (charAt != ' ') {
                        throw new MalformedServerReplyException("Invalid server reply: '" + readLine + "'");
                    }
                }
            } else if (isStrictReplyParsing()) {
                throw new MalformedServerReplyException("Truncated server reply: '" + readLine + "'");
            }
            if (z10) {
                fireReplyReceived(this._replyCode, getReplyString());
            }
            if (this._replyCode == 421) {
                throw new FTPConnectionClosedException("FTP response 421 received.  Server closed connection.");
            }
        } catch (NumberFormatException e10) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + readLine);
        }
    }

    private boolean __lenientCheck(String str) {
        boolean z10 = false;
        if (str.length() <= 3 || str.charAt(3) == '-' || !Character.isDigit(str.charAt(0))) {
            z10 = true;
        }
        return z10;
    }

    private void __send(String str) {
        try {
            this._controlOutput_.write(str);
            this._controlOutput_.flush();
        } catch (SocketException e10) {
            if (!isConnected()) {
                throw new FTPConnectionClosedException("Connection unexpectedly closed.");
            }
            throw e10;
        }
    }

    private boolean __strictCheck(String str, String str2) {
        return (str.startsWith(str2) && str.charAt(3) == ' ') ? false : true;
    }

    public void __getReplyNoReport() {
        __getReply(false);
    }

    public void __noop() {
        __send(__buildMessage(FTPCmd.NOOP.getCommand(), null));
        __getReplyNoReport();
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        _connectAction_(null);
    }

    public void _connectAction_(Reader reader) {
        super._connectAction_();
        if (reader == null) {
            this._controlInput_ = new CRLFLineReader(new InputStreamReader(this._input_, getControlEncoding()));
        } else {
            this._controlInput_ = new CRLFLineReader(reader);
        }
        this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._output_, getControlEncoding()));
        if (this.connectTimeout <= 0) {
            __getReply();
            if (FTPReply.isPositivePreliminary(this._replyCode)) {
                __getReply();
                return;
            }
            return;
        }
        int soTimeout = this._socket_.getSoTimeout();
        this._socket_.setSoTimeout(this.connectTimeout);
        try {
            try {
                __getReply();
                if (FTPReply.isPositivePreliminary(this._replyCode)) {
                    __getReply();
                }
            } catch (SocketTimeoutException e10) {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(e10);
                throw iOException;
            }
        } finally {
            this._socket_.setSoTimeout(soTimeout);
        }
    }

    public int abor() {
        return sendCommand(FTPCmd.ABOR);
    }

    public int acct(String str) {
        return sendCommand(FTPCmd.ACCT, str);
    }

    public int allo(int i10) {
        return sendCommand(FTPCmd.ALLO, Integer.toString(i10));
    }

    public int allo(int i10, int i11) {
        return sendCommand(FTPCmd.ALLO, Integer.toString(i10) + " R " + Integer.toString(i11));
    }

    public int appe(String str) {
        return sendCommand(FTPCmd.APPE, str);
    }

    public int cdup() {
        return sendCommand(FTPCmd.CDUP);
    }

    public int cwd(String str) {
        return sendCommand(FTPCmd.CWD, str);
    }

    public int dele(String str) {
        return sendCommand(FTPCmd.DELE, str);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        this._controlInput_ = null;
        this._controlOutput_ = null;
        this._newReplyString = false;
        this._replyString = null;
    }

    public int eprt(InetAddress inetAddress, int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String hostAddress = inetAddress.getHostAddress();
        int indexOf = hostAddress.indexOf("%");
        String str2 = hostAddress;
        if (indexOf > 0) {
            str2 = hostAddress.substring(0, indexOf);
        }
        sb2.append("|");
        if (!(inetAddress instanceof Inet4Address)) {
            str = inetAddress instanceof Inet6Address ? "2" : "1";
            sb2.append("|");
            sb2.append(str2);
            sb2.append("|");
            sb2.append(i10);
            sb2.append("|");
            return sendCommand(FTPCmd.EPRT, sb2.toString());
        }
        sb2.append(str);
        sb2.append("|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(i10);
        sb2.append("|");
        return sendCommand(FTPCmd.EPRT, sb2.toString());
    }

    public int epsv() {
        return sendCommand(FTPCmd.EPSV);
    }

    public int feat() {
        return sendCommand(FTPCmd.FEAT);
    }

    @Override // org.apache.commons.net.SocketClient
    public ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }

    public String getControlEncoding() {
        return this._controlEncoding;
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
        StringBuilder sb2 = new StringBuilder(256);
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

    public int help() {
        return sendCommand(FTPCmd.HELP);
    }

    public int help(String str) {
        return sendCommand(FTPCmd.HELP, str);
    }

    public boolean isStrictMultilineParsing() {
        return this.strictMultilineParsing;
    }

    public boolean isStrictReplyParsing() {
        return this.strictReplyParsing;
    }

    public int list() {
        return sendCommand(FTPCmd.LIST);
    }

    public int list(String str) {
        return sendCommand(FTPCmd.LIST, str);
    }

    public int mdtm(String str) {
        return sendCommand(FTPCmd.MDTM, str);
    }

    public int mfmt(String str, String str2) {
        return sendCommand(FTPCmd.MFMT, str2 + " " + str);
    }

    public int mkd(String str) {
        return sendCommand(FTPCmd.MKD, str);
    }

    public int mlsd() {
        return sendCommand(FTPCmd.MLSD);
    }

    public int mlsd(String str) {
        return sendCommand(FTPCmd.MLSD, str);
    }

    public int mlst() {
        return sendCommand(FTPCmd.MLST);
    }

    public int mlst(String str) {
        return sendCommand(FTPCmd.MLST, str);
    }

    public int mode(int i10) {
        return sendCommand(FTPCmd.MODE, __modes.substring(i10, i10 + 1));
    }

    public int nlst() {
        return sendCommand(FTPCmd.NLST);
    }

    public int nlst(String str) {
        return sendCommand(FTPCmd.NLST, str);
    }

    public int noop() {
        return sendCommand(FTPCmd.NOOP);
    }

    public int pass(String str) {
        return sendCommand(FTPCmd.PASS, str);
    }

    public int pasv() {
        return sendCommand(FTPCmd.PASV);
    }

    public int port(InetAddress inetAddress, int i10) {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(inetAddress.getHostAddress().replace('.', ','));
        sb2.append(',');
        sb2.append(i10 >>> 8);
        sb2.append(',');
        sb2.append(i10 & 255);
        return sendCommand(FTPCmd.PORT, sb2.toString());
    }

    public int pwd() {
        return sendCommand(FTPCmd.PWD);
    }

    public int quit() {
        return sendCommand(FTPCmd.QUIT);
    }

    public int rein() {
        return sendCommand(FTPCmd.REIN);
    }

    public int rest(String str) {
        return sendCommand(FTPCmd.REST, str);
    }

    public int retr(String str) {
        return sendCommand(FTPCmd.RETR, str);
    }

    public int rmd(String str) {
        return sendCommand(FTPCmd.RMD, str);
    }

    public int rnfr(String str) {
        return sendCommand(FTPCmd.RNFR, str);
    }

    public int rnto(String str) {
        return sendCommand(FTPCmd.RNTO, str);
    }

    public int sendCommand(int i10) {
        return sendCommand(i10, (String) null);
    }

    @Deprecated
    public int sendCommand(int i10, String str) {
        return sendCommand(FTPCommand.getCommand(i10), str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(String str, String str2) {
        if (this._controlOutput_ == null) {
            throw new IOException("Connection is not open");
        }
        String __buildMessage = __buildMessage(str, str2);
        __send(__buildMessage);
        fireCommandSent(str, __buildMessage);
        __getReply();
        return this._replyCode;
    }

    public int sendCommand(FTPCmd fTPCmd) {
        return sendCommand(fTPCmd, (String) null);
    }

    public int sendCommand(FTPCmd fTPCmd, String str) {
        return sendCommand(fTPCmd.getCommand(), str);
    }

    public void setControlEncoding(String str) {
        this._controlEncoding = str;
    }

    public void setStrictMultilineParsing(boolean z10) {
        this.strictMultilineParsing = z10;
    }

    public void setStrictReplyParsing(boolean z10) {
        this.strictReplyParsing = z10;
    }

    public int site(String str) {
        return sendCommand(FTPCmd.SITE, str);
    }

    public int smnt(String str) {
        return sendCommand(FTPCmd.SMNT, str);
    }

    public int stat() {
        return sendCommand(FTPCmd.STAT);
    }

    public int stat(String str) {
        return sendCommand(FTPCmd.STAT, str);
    }

    public int stor(String str) {
        return sendCommand(FTPCmd.STOR, str);
    }

    public int stou() {
        return sendCommand(FTPCmd.STOU);
    }

    public int stou(String str) {
        return sendCommand(FTPCmd.STOU, str);
    }

    public int stru(int i10) {
        return sendCommand(FTPCmd.STRU, __modes.substring(i10, i10 + 1));
    }

    public int syst() {
        return sendCommand(FTPCmd.SYST);
    }

    public int type(int i10) {
        return sendCommand(FTPCmd.TYPE, __modes.substring(i10, i10 + 1));
    }

    public int type(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(__modes.charAt(i10));
        sb2.append(' ');
        if (i10 == 3) {
            sb2.append(i11);
        } else {
            sb2.append(__modes.charAt(i11));
        }
        return sendCommand(FTPCmd.TYPE, sb2.toString());
    }

    public int user(String str) {
        return sendCommand(FTPCmd.USER, str);
    }
}
