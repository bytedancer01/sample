package org.apache.commons.net.ftp;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ftp.parser.DefaultFTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.FTPFileEntryParserFactory;
import org.apache.commons.net.ftp.parser.MLSxEntryParser;
import org.apache.commons.net.p255io.CRLFLineReader;
import org.apache.commons.net.p255io.CopyStreamAdapter;
import org.apache.commons.net.p255io.CopyStreamEvent;
import org.apache.commons.net.p255io.CopyStreamListener;
import org.apache.commons.net.p255io.FromNetASCIIInputStream;
import org.apache.commons.net.p255io.SocketInputStream;
import org.apache.commons.net.p255io.SocketOutputStream;
import org.apache.commons.net.p255io.ToNetASCIIOutputStream;
import org.apache.commons.net.p255io.Util;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPClient.class */
public class FTPClient extends FTP implements Configurable {
    public static final int ACTIVE_LOCAL_DATA_CONNECTION_MODE = 0;
    public static final int ACTIVE_REMOTE_DATA_CONNECTION_MODE = 1;
    public static final String FTP_SYSTEM_TYPE = "org.apache.commons.net.ftp.systemType";
    public static final String FTP_SYSTEM_TYPE_DEFAULT = "org.apache.commons.net.ftp.systemType.default";
    public static final int PASSIVE_LOCAL_DATA_CONNECTION_MODE = 2;
    public static final int PASSIVE_REMOTE_DATA_CONNECTION_MODE = 3;
    public static final String SYSTEM_TYPE_PROPERTIES = "/systemType.properties";
    private static final Pattern __PARMS_PAT = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    private InetAddress __activeExternalHost;
    private int __activeMaxPort;
    private int __activeMinPort;
    private int __bufferSize;
    private FTPClientConfig __configuration;
    private long __controlKeepAliveTimeout;
    private CopyStreamListener __copyStreamListener;
    private int __dataConnectionMode;
    private int __dataTimeout;
    private FTPFileEntryParser __entryParser;
    private String __entryParserKey;
    private HashMap<String, Set<String>> __featuresMap;
    private int __fileFormat;
    private int __fileStructure;
    private int __fileTransferMode;
    private int __fileType;
    private boolean __listHiddenFiles;
    private FTPFileEntryParserFactory __parserFactory;
    private String __passiveHost;
    private InetAddress __passiveLocalHost;
    private int __passivePort;
    private final Random __random;
    private int __receiveDataSocketBufferSize;
    private boolean __remoteVerificationEnabled;
    private InetAddress __reportActiveExternalHost;
    private long __restartOffset;
    private int __sendDataSocketBufferSize;
    private String __systemName;
    private boolean __useEPSVwithIPv4;
    private int __controlKeepAliveReplyTimeout = 1000;
    private HostnameResolver __passiveNatWorkaroundStrategy = new NatServerResolverImpl(this);
    private boolean __autodetectEncoding = false;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/ftp/FTPClient$CSL.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPClient$CSL.class */
    public static class CSL implements CopyStreamListener {
        private final int currentSoTimeout;
        private final long idle;
        private int notAcked;
        private final FTPClient parent;
        private long time = System.currentTimeMillis();

        public CSL(FTPClient fTPClient, long j10, int i10) {
            this.idle = j10;
            this.parent = fTPClient;
            this.currentSoTimeout = fTPClient.getSoTimeout();
            fTPClient.setSoTimeout(i10);
        }

        @Override // org.apache.commons.net.p255io.CopyStreamListener
        public void bytesTransferred(long j10, int i10, long j11) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.time > this.idle) {
                try {
                    this.parent.__noop();
                } catch (SocketTimeoutException e10) {
                    this.notAcked++;
                } catch (IOException e11) {
                }
                this.time = currentTimeMillis;
            }
        }

        @Override // org.apache.commons.net.p255io.CopyStreamListener
        public void bytesTransferred(CopyStreamEvent copyStreamEvent) {
            bytesTransferred(copyStreamEvent.getTotalBytesTransferred(), copyStreamEvent.getBytesTransferred(), copyStreamEvent.getStreamSize());
        }

        public void cleanUp() {
            while (true) {
                try {
                    int i10 = this.notAcked;
                    this.notAcked = i10 - 1;
                    if (i10 <= 0) {
                        return;
                    } else {
                        this.parent.__getReplyNoReport();
                    }
                } finally {
                    this.parent.setSoTimeout(this.currentSoTimeout);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/ftp/FTPClient$HostnameResolver.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPClient$HostnameResolver.class */
    public interface HostnameResolver {
        String resolve(String str);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/ftp/FTPClient$NatServerResolverImpl.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPClient$NatServerResolverImpl.class */
    public static class NatServerResolverImpl implements HostnameResolver {
        private FTPClient client;

        public NatServerResolverImpl(FTPClient fTPClient) {
            this.client = fTPClient;
        }

        @Override // org.apache.commons.net.ftp.FTPClient.HostnameResolver
        public String resolve(String str) {
            String str2 = str;
            if (InetAddress.getByName(str).isSiteLocalAddress()) {
                InetAddress remoteAddress = this.client.getRemoteAddress();
                str2 = str;
                if (!remoteAddress.isSiteLocalAddress()) {
                    str2 = remoteAddress.getHostAddress();
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/ftp/FTPClient$PropertiesSingleton.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPClient$PropertiesSingleton.class */
    public static class PropertiesSingleton {
        public static final Properties PROPERTIES;

        static {
            Properties properties;
            InputStream resourceAsStream = FTPClient.class.getResourceAsStream(FTPClient.SYSTEM_TYPE_PROPERTIES);
            if (resourceAsStream != null) {
                properties = new Properties();
                try {
                    properties.load(resourceAsStream);
                } catch (IOException e10) {
                } catch (Throwable th2) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e11) {
                    }
                    throw th2;
                }
                try {
                    resourceAsStream.close();
                } catch (IOException e12) {
                }
            } else {
                properties = null;
            }
            PROPERTIES = properties;
        }

        private PropertiesSingleton() {
        }
    }

    public FTPClient() {
        __initDefaults();
        this.__dataTimeout = -1;
        this.__remoteVerificationEnabled = true;
        this.__parserFactory = new DefaultFTPFileEntryParserFactory();
        this.__configuration = null;
        this.__listHiddenFiles = false;
        this.__useEPSVwithIPv4 = false;
        this.__random = new Random();
        this.__passiveLocalHost = null;
    }

    private void __initDefaults() {
        this.__dataConnectionMode = 0;
        this.__passiveHost = null;
        this.__passivePort = -1;
        this.__activeExternalHost = null;
        this.__reportActiveExternalHost = null;
        this.__activeMinPort = 0;
        this.__activeMaxPort = 0;
        this.__fileType = 0;
        this.__fileStructure = 7;
        this.__fileFormat = 4;
        this.__fileTransferMode = 10;
        this.__restartOffset = 0L;
        this.__systemName = null;
        this.__entryParser = null;
        this.__entryParserKey = "";
        this.__featuresMap = null;
    }

    private CopyStreamListener __mergeListeners(CopyStreamListener copyStreamListener) {
        if (copyStreamListener == null) {
            return this.__copyStreamListener;
        }
        if (this.__copyStreamListener == null) {
            return copyStreamListener;
        }
        CopyStreamAdapter copyStreamAdapter = new CopyStreamAdapter();
        copyStreamAdapter.addCopyStreamListener(copyStreamListener);
        copyStreamAdapter.addCopyStreamListener(this.__copyStreamListener);
        return copyStreamAdapter;
    }

    public static String __parsePathname(String str) {
        String substring = str.substring(4);
        String str2 = substring;
        if (substring.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            for (int i10 = 1; i10 < substring.length(); i10++) {
                char charAt = substring.charAt(i10);
                if (charAt != '\"') {
                    if (z10) {
                        return sb2.toString();
                    }
                    sb2.append(charAt);
                } else if (z10) {
                    sb2.append(charAt);
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            str2 = substring;
            if (z10) {
                str2 = sb2.toString();
            }
        }
        return str2;
    }

    private boolean __storeFile(FTPCmd fTPCmd, String str, InputStream inputStream) {
        return _storeFile(fTPCmd.getCommand(), str, inputStream);
    }

    private OutputStream __storeFileStream(FTPCmd fTPCmd, String str) {
        return _storeFileStream(fTPCmd.getCommand(), str);
    }

    private int getActivePort() {
        int i10;
        int i11 = this.__activeMinPort;
        if (i11 <= 0 || (i10 = this.__activeMaxPort) < i11) {
            return 0;
        }
        return i10 == i11 ? i10 : this.__random.nextInt((i10 - i11) + 1) + this.__activeMinPort;
    }

    private InputStream getBufferedInputStream(InputStream inputStream) {
        return this.__bufferSize > 0 ? new BufferedInputStream(inputStream, this.__bufferSize) : new BufferedInputStream(inputStream);
    }

    private OutputStream getBufferedOutputStream(OutputStream outputStream) {
        return this.__bufferSize > 0 ? new BufferedOutputStream(outputStream, this.__bufferSize) : new BufferedOutputStream(outputStream);
    }

    private InetAddress getHostAddress() {
        InetAddress inetAddress = this.__activeExternalHost;
        return inetAddress != null ? inetAddress : getLocalAddress();
    }

    private static Properties getOverrideProperties() {
        return PropertiesSingleton.PROPERTIES;
    }

    private InetAddress getReportHostAddress() {
        InetAddress inetAddress = this.__reportActiveExternalHost;
        return inetAddress != null ? inetAddress : getHostAddress();
    }

    private boolean initFeatureMap() {
        String substring;
        String str;
        if (this.__featuresMap != null) {
            return true;
        }
        int feat = feat();
        if (feat == 530) {
            return false;
        }
        boolean isPositiveCompletion = FTPReply.isPositiveCompletion(feat);
        this.__featuresMap = new HashMap<>();
        if (!isPositiveCompletion) {
            return false;
        }
        for (String str2 : getReplyStrings()) {
            if (str2.startsWith(" ")) {
                int indexOf = str2.indexOf(32, 1);
                if (indexOf > 0) {
                    substring = str2.substring(1, indexOf);
                    str = str2.substring(indexOf + 1);
                } else {
                    substring = str2.substring(1);
                    str = "";
                }
                String upperCase = substring.toUpperCase(Locale.ENGLISH);
                Set<String> set = this.__featuresMap.get(upperCase);
                Set<String> set2 = set;
                if (set == null) {
                    set2 = new HashSet();
                    this.__featuresMap.put(upperCase, set2);
                }
                set2.add(str);
            }
        }
        return true;
    }

    private FTPListParseEngine initiateListParsing(FTPFileEntryParser fTPFileEntryParser, String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.LIST, getListArguments(str));
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(fTPFileEntryParser, this.__configuration);
        if (_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(_openDataConnection_.getInputStream(), getControlEncoding());
            Util.closeQuietly(_openDataConnection_);
            completePendingCommand();
            return fTPListParseEngine;
        } catch (Throwable th2) {
            Util.closeQuietly(_openDataConnection_);
            throw th2;
        }
    }

    private FTPListParseEngine initiateMListParsing(String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.MLSD, str);
        FTPListParseEngine fTPListParseEngine = new FTPListParseEngine(MLSxEntryParser.getInstance(), this.__configuration);
        if (_openDataConnection_ == null) {
            return fTPListParseEngine;
        }
        try {
            fTPListParseEngine.readServerList(_openDataConnection_.getInputStream(), getControlEncoding());
            return fTPListParseEngine;
        } finally {
            Util.closeQuietly(_openDataConnection_);
            completePendingCommand();
        }
    }

    public void __createParser(String str) {
        FTPFileEntryParser createFileEntryParser;
        if (this.__entryParser == null || !(str == null || this.__entryParserKey.equals(str))) {
            if (str != null) {
                createFileEntryParser = this.__parserFactory.createFileEntryParser(str);
            } else {
                FTPClientConfig fTPClientConfig = this.__configuration;
                if (fTPClientConfig != null && fTPClientConfig.getServerSystemKey().length() > 0) {
                    this.__entryParser = this.__parserFactory.createFileEntryParser(this.__configuration);
                    str = this.__configuration.getServerSystemKey();
                    this.__entryParserKey = str;
                }
                String property = System.getProperty(FTP_SYSTEM_TYPE);
                str = property;
                if (property == null) {
                    String systemType = getSystemType();
                    Properties overrideProperties = getOverrideProperties();
                    str = systemType;
                    if (overrideProperties != null) {
                        String property2 = overrideProperties.getProperty(systemType);
                        str = systemType;
                        if (property2 != null) {
                            str = property2;
                        }
                    }
                }
                createFileEntryParser = this.__configuration != null ? this.__parserFactory.createFileEntryParser(new FTPClientConfig(str, this.__configuration)) : this.__parserFactory.createFileEntryParser(str);
            }
            this.__entryParser = createFileEntryParser;
            this.__entryParserKey = str;
        }
    }

    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        _connectAction_(null);
    }

    @Override // org.apache.commons.net.ftp.FTP
    public void _connectAction_(Reader reader) {
        super._connectAction_(reader);
        __initDefaults();
        if (this.__autodetectEncoding) {
            ArrayList arrayList = new ArrayList(this._replyLines);
            int i10 = this._replyCode;
            if (hasFeature("UTF8") || hasFeature("UTF-8")) {
                setControlEncoding("UTF-8");
                this._controlInput_ = new CRLFLineReader(new InputStreamReader(this._input_, getControlEncoding()));
                this._controlOutput_ = new BufferedWriter(new OutputStreamWriter(this._output_, getControlEncoding()));
            }
            this._replyLines.clear();
            this._replyLines.addAll(arrayList);
            this._replyCode = i10;
            this._newReplyString = true;
        }
    }

    @Deprecated
    public Socket _openDataConnection_(int i10, String str) {
        return _openDataConnection_(FTPCommand.getCommand(i10), str);
    }

    public Socket _openDataConnection_(String str, String str2) {
        Socket socket;
        int i10 = this.__dataConnectionMode;
        if (i10 != 0 && i10 != 2) {
            return null;
        }
        boolean z10 = getRemoteAddress() instanceof Inet6Address;
        if (this.__dataConnectionMode == 0) {
            ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(getActivePort(), 1, getHostAddress());
            try {
                if (z10) {
                    if (!FTPReply.isPositiveCompletion(eprt(getReportHostAddress(), createServerSocket.getLocalPort()))) {
                        createServerSocket.close();
                        return null;
                    }
                } else if (!FTPReply.isPositiveCompletion(port(getReportHostAddress(), createServerSocket.getLocalPort()))) {
                    createServerSocket.close();
                    return null;
                }
                long j10 = this.__restartOffset;
                if (j10 > 0 && !restart(j10)) {
                    createServerSocket.close();
                    return null;
                }
                if (!FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                    createServerSocket.close();
                    return null;
                }
                int i11 = this.__dataTimeout;
                if (i11 >= 0) {
                    createServerSocket.setSoTimeout(i11);
                }
                socket = createServerSocket.accept();
                int i12 = this.__dataTimeout;
                if (i12 >= 0) {
                    socket.setSoTimeout(i12);
                }
                int i13 = this.__receiveDataSocketBufferSize;
                if (i13 > 0) {
                    socket.setReceiveBufferSize(i13);
                }
                int i14 = this.__sendDataSocketBufferSize;
                if (i14 > 0) {
                    socket.setSendBufferSize(i14);
                }
            } finally {
                createServerSocket.close();
            }
        } else {
            boolean z11 = true;
            if (!isUseEPSVwithIPv4()) {
                z11 = z10;
            }
            if (z11 && epsv() == 229) {
                _parseExtendedPassiveModeReply(this._replyLines.get(0));
            } else {
                if (z10 || pasv() != 227) {
                    return null;
                }
                _parsePassiveModeReply(this._replyLines.get(0));
            }
            Socket createSocket = this._socketFactory_.createSocket();
            int i15 = this.__receiveDataSocketBufferSize;
            if (i15 > 0) {
                createSocket.setReceiveBufferSize(i15);
            }
            int i16 = this.__sendDataSocketBufferSize;
            if (i16 > 0) {
                createSocket.setSendBufferSize(i16);
            }
            if (this.__passiveLocalHost != null) {
                createSocket.bind(new InetSocketAddress(this.__passiveLocalHost, 0));
            }
            int i17 = this.__dataTimeout;
            if (i17 >= 0) {
                createSocket.setSoTimeout(i17);
            }
            createSocket.connect(new InetSocketAddress(this.__passiveHost, this.__passivePort), this.connectTimeout);
            long j11 = this.__restartOffset;
            if (j11 > 0 && !restart(j11)) {
                createSocket.close();
                return null;
            }
            if (!FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
                createSocket.close();
                return null;
            }
            socket = createSocket;
        }
        if (!this.__remoteVerificationEnabled || verifyRemote(socket)) {
            return socket;
        }
        socket.close();
        throw new IOException("Host attempting data connection " + socket.getInetAddress().getHostAddress() + " is not same as server " + getRemoteAddress().getHostAddress());
    }

    public Socket _openDataConnection_(FTPCmd fTPCmd, String str) {
        return _openDataConnection_(fTPCmd.getCommand(), str);
    }

    public void _parseExtendedPassiveModeReply(String str) {
        String trim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char charAt = trim.charAt(0);
        char charAt2 = trim.charAt(1);
        char charAt3 = trim.charAt(2);
        char charAt4 = trim.charAt(trim.length() - 1);
        if (charAt != charAt2 || charAt2 != charAt3 || charAt3 != charAt4) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + trim);
        }
        try {
            int parseInt = Integer.parseInt(trim.substring(3, trim.length() - 1));
            this.__passiveHost = getRemoteAddress().getHostAddress();
            this.__passivePort = parseInt;
        } catch (NumberFormatException e10) {
            throw new MalformedServerReplyException("Could not parse extended passive host information.\nServer Reply: " + trim);
        }
    }

    public void _parsePassiveModeReply(String str) {
        Matcher matcher = __PARMS_PAT.matcher(str);
        if (!matcher.find()) {
            throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
        }
        this.__passiveHost = matcher.group(1).replace(',', '.');
        try {
            this.__passivePort = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            HostnameResolver hostnameResolver = this.__passiveNatWorkaroundStrategy;
            if (hostnameResolver != null) {
                try {
                    String resolve = hostnameResolver.resolve(this.__passiveHost);
                    if (this.__passiveHost.equals(resolve)) {
                        return;
                    }
                    fireReplyReceived(0, "[Replacing PASV mode reply address " + this.__passiveHost + " with " + resolve + "]\n");
                    this.__passiveHost = resolve;
                } catch (UnknownHostException e10) {
                    throw new MalformedServerReplyException("Could not parse passive host information.\nServer Reply: " + str);
                }
            }
        } catch (NumberFormatException e11) {
            throw new MalformedServerReplyException("Could not parse passive port information.\nServer Reply: " + str);
        }
    }

    public boolean _retrieveFile(String str, String str2, OutputStream outputStream) {
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return false;
        }
        InputStream fromNetASCIIInputStream = this.__fileType == 0 ? new FromNetASCIIInputStream(getBufferedInputStream(_openDataConnection_.getInputStream())) : getBufferedInputStream(_openDataConnection_.getInputStream());
        CSL csl = null;
        long j10 = this.__controlKeepAliveTimeout;
        if (j10 > 0) {
            csl = new CSL(this, j10, this.__controlKeepAliveReplyTimeout);
        }
        try {
            Util.copyStream(fromNetASCIIInputStream, outputStream, getBufferSize(), -1L, __mergeListeners(csl), false);
            Util.closeQuietly(fromNetASCIIInputStream);
            Util.closeQuietly(_openDataConnection_);
            if (csl != null) {
                csl.cleanUp();
            }
            return completePendingCommand();
        } catch (Throwable th2) {
            Util.closeQuietly(fromNetASCIIInputStream);
            Util.closeQuietly(_openDataConnection_);
            if (csl != null) {
                csl.cleanUp();
            }
            throw th2;
        }
    }

    public InputStream _retrieveFileStream(String str, String str2) {
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return null;
        }
        return new SocketInputStream(_openDataConnection_, this.__fileType == 0 ? new FromNetASCIIInputStream(getBufferedInputStream(_openDataConnection_.getInputStream())) : _openDataConnection_.getInputStream());
    }

    public boolean _storeFile(String str, String str2, InputStream inputStream) {
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return false;
        }
        OutputStream toNetASCIIOutputStream = this.__fileType == 0 ? new ToNetASCIIOutputStream(getBufferedOutputStream(_openDataConnection_.getOutputStream())) : getBufferedOutputStream(_openDataConnection_.getOutputStream());
        CSL csl = null;
        long j10 = this.__controlKeepAliveTimeout;
        if (j10 > 0) {
            csl = new CSL(this, j10, this.__controlKeepAliveReplyTimeout);
        }
        try {
            Util.copyStream(inputStream, toNetASCIIOutputStream, getBufferSize(), -1L, __mergeListeners(csl), false);
            toNetASCIIOutputStream.close();
            _openDataConnection_.close();
            if (csl != null) {
                csl.cleanUp();
            }
            return completePendingCommand();
        } catch (IOException e10) {
            Util.closeQuietly(_openDataConnection_);
            if (csl != null) {
                csl.cleanUp();
            }
            throw e10;
        }
    }

    public OutputStream _storeFileStream(String str, String str2) {
        Socket _openDataConnection_ = _openDataConnection_(str, str2);
        if (_openDataConnection_ == null) {
            return null;
        }
        return new SocketOutputStream(_openDataConnection_, this.__fileType == 0 ? new ToNetASCIIOutputStream(getBufferedOutputStream(_openDataConnection_.getOutputStream())) : _openDataConnection_.getOutputStream());
    }

    public boolean abort() {
        return FTPReply.isPositiveCompletion(abor());
    }

    public boolean allocate(int i10) {
        return FTPReply.isPositiveCompletion(allo(i10));
    }

    public boolean allocate(int i10, int i11) {
        return FTPReply.isPositiveCompletion(allo(i10, i11));
    }

    public boolean appendFile(String str, InputStream inputStream) {
        return __storeFile(FTPCmd.APPE, str, inputStream);
    }

    public OutputStream appendFileStream(String str) {
        return __storeFileStream(FTPCmd.APPE, str);
    }

    public boolean changeToParentDirectory() {
        return FTPReply.isPositiveCompletion(cdup());
    }

    public boolean changeWorkingDirectory(String str) {
        return FTPReply.isPositiveCompletion(cwd(str));
    }

    public boolean completePendingCommand() {
        return FTPReply.isPositiveCompletion(getReply());
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        this.__configuration = fTPClientConfig;
    }

    public boolean deleteFile(String str) {
        return FTPReply.isPositiveCompletion(dele(str));
    }

    @Override // org.apache.commons.net.ftp.FTP, org.apache.commons.net.SocketClient
    public void disconnect() {
        super.disconnect();
        __initDefaults();
    }

    public boolean doCommand(String str, String str2) {
        return FTPReply.isPositiveCompletion(sendCommand(str, str2));
    }

    public String[] doCommandAsStrings(String str, String str2) {
        if (FTPReply.isPositiveCompletion(sendCommand(str, str2))) {
            return getReplyStrings();
        }
        return null;
    }

    public void enterLocalActiveMode() {
        this.__dataConnectionMode = 0;
        this.__passiveHost = null;
        this.__passivePort = -1;
    }

    public void enterLocalPassiveMode() {
        this.__dataConnectionMode = 2;
        this.__passiveHost = null;
        this.__passivePort = -1;
    }

    public boolean enterRemoteActiveMode(InetAddress inetAddress, int i10) {
        if (!FTPReply.isPositiveCompletion(port(inetAddress, i10))) {
            return false;
        }
        this.__dataConnectionMode = 1;
        this.__passiveHost = null;
        this.__passivePort = -1;
        return true;
    }

    public boolean enterRemotePassiveMode() {
        if (pasv() != 227) {
            return false;
        }
        this.__dataConnectionMode = 3;
        _parsePassiveModeReply(this._replyLines.get(0));
        return true;
    }

    public String featureValue(String str) {
        String[] featureValues = featureValues(str);
        if (featureValues != null) {
            return featureValues[0];
        }
        return null;
    }

    public String[] featureValues(String str) {
        Set<String> set;
        if (initFeatureMap() && (set = this.__featuresMap.get(str.toUpperCase(Locale.ENGLISH))) != null) {
            return (String[]) set.toArray(new String[set.size()]);
        }
        return null;
    }

    public boolean features() {
        return FTPReply.isPositiveCompletion(feat());
    }

    public boolean getAutodetectUTF8() {
        return this.__autodetectEncoding;
    }

    public int getBufferSize() {
        return this.__bufferSize;
    }

    public int getControlKeepAliveReplyTimeout() {
        return this.__controlKeepAliveReplyTimeout;
    }

    public long getControlKeepAliveTimeout() {
        return this.__controlKeepAliveTimeout / 1000;
    }

    public CopyStreamListener getCopyStreamListener() {
        return this.__copyStreamListener;
    }

    public int getDataConnectionMode() {
        return this.__dataConnectionMode;
    }

    public FTPFileEntryParser getEntryParser() {
        return this.__entryParser;
    }

    public String getListArguments(String str) {
        String str2 = str;
        if (getListHiddenFiles()) {
            if (str != null) {
                StringBuilder sb2 = new StringBuilder(str.length() + 3);
                sb2.append("-a ");
                sb2.append(str);
                return sb2.toString();
            }
            str2 = "-a";
        }
        return str2;
    }

    public boolean getListHiddenFiles() {
        return this.__listHiddenFiles;
    }

    public String getModificationTime(String str) {
        if (FTPReply.isPositiveCompletion(mdtm(str))) {
            return getReplyStrings()[0].substring(4);
        }
        return null;
    }

    public String getPassiveHost() {
        return this.__passiveHost;
    }

    public InetAddress getPassiveLocalIPAddress() {
        return this.__passiveLocalHost;
    }

    public int getPassivePort() {
        return this.__passivePort;
    }

    public int getReceiveDataSocketBufferSize() {
        return this.__receiveDataSocketBufferSize;
    }

    public long getRestartOffset() {
        return this.__restartOffset;
    }

    public int getSendDataSocketBufferSize() {
        return this.__sendDataSocketBufferSize;
    }

    public String getStatus() {
        if (FTPReply.isPositiveCompletion(stat())) {
            return getReplyString();
        }
        return null;
    }

    public String getStatus(String str) {
        if (FTPReply.isPositiveCompletion(stat(str))) {
            return getReplyString();
        }
        return null;
    }

    @Deprecated
    public String getSystemName() {
        if (this.__systemName == null && FTPReply.isPositiveCompletion(syst())) {
            ArrayList<String> arrayList = this._replyLines;
            this.__systemName = arrayList.get(arrayList.size() - 1).substring(4);
        }
        return this.__systemName;
    }

    public String getSystemType() {
        String property;
        if (this.__systemName == null) {
            if (FTPReply.isPositiveCompletion(syst())) {
                ArrayList<String> arrayList = this._replyLines;
                property = arrayList.get(arrayList.size() - 1).substring(4);
            } else {
                property = System.getProperty(FTP_SYSTEM_TYPE_DEFAULT);
                if (property == null) {
                    throw new IOException("Unable to determine system type - response: " + getReplyString());
                }
            }
            this.__systemName = property;
        }
        return this.__systemName;
    }

    public boolean hasFeature(String str) {
        if (initFeatureMap()) {
            return this.__featuresMap.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    public boolean hasFeature(String str, String str2) {
        Set<String> set;
        if (initFeatureMap() && (set = this.__featuresMap.get(str.toUpperCase(Locale.ENGLISH))) != null) {
            return set.contains(str2);
        }
        return false;
    }

    public FTPListParseEngine initiateListParsing() {
        return initiateListParsing(null);
    }

    public FTPListParseEngine initiateListParsing(String str) {
        return initiateListParsing((String) null, str);
    }

    public FTPListParseEngine initiateListParsing(String str, String str2) {
        __createParser(str);
        return initiateListParsing(this.__entryParser, str2);
    }

    public boolean isRemoteVerificationEnabled() {
        return this.__remoteVerificationEnabled;
    }

    public boolean isUseEPSVwithIPv4() {
        return this.__useEPSVwithIPv4;
    }

    public FTPFile[] listDirectories() {
        return listDirectories(null);
    }

    public FTPFile[] listDirectories(String str) {
        return listFiles(str, FTPFileFilters.DIRECTORIES);
    }

    public FTPFile[] listFiles() {
        return listFiles(null);
    }

    public FTPFile[] listFiles(String str) {
        return initiateListParsing((String) null, str).getFiles();
    }

    public FTPFile[] listFiles(String str, FTPFileFilter fTPFileFilter) {
        return initiateListParsing((String) null, str).getFiles(fTPFileFilter);
    }

    public String listHelp() {
        if (FTPReply.isPositiveCompletion(help())) {
            return getReplyString();
        }
        return null;
    }

    public String listHelp(String str) {
        if (FTPReply.isPositiveCompletion(help(str))) {
            return getReplyString();
        }
        return null;
    }

    public String[] listNames() {
        return listNames(null);
    }

    public String[] listNames(String str) {
        Socket _openDataConnection_ = _openDataConnection_(FTPCmd.NLST, getListArguments(str));
        if (_openDataConnection_ == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(_openDataConnection_.getInputStream(), getControlEncoding()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        _openDataConnection_.close();
        if (completePendingCommand()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public boolean login(String str, String str2) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (FTPReply.isPositiveIntermediate(this._replyCode)) {
            return FTPReply.isPositiveCompletion(pass(str2));
        }
        return false;
    }

    public boolean login(String str, String str2, String str3) {
        user(str);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (!FTPReply.isPositiveIntermediate(this._replyCode)) {
            return false;
        }
        pass(str2);
        if (FTPReply.isPositiveCompletion(this._replyCode)) {
            return true;
        }
        if (FTPReply.isPositiveIntermediate(this._replyCode)) {
            return FTPReply.isPositiveCompletion(acct(str3));
        }
        return false;
    }

    public boolean logout() {
        return FTPReply.isPositiveCompletion(quit());
    }

    public boolean makeDirectory(String str) {
        return FTPReply.isPositiveCompletion(mkd(str));
    }

    public FTPFile mdtmFile(String str) {
        if (!FTPReply.isPositiveCompletion(mdtm(str))) {
            return null;
        }
        String substring = getReplyStrings()[0].substring(4);
        FTPFile fTPFile = new FTPFile();
        fTPFile.setName(str);
        fTPFile.setRawListing(substring);
        fTPFile.setTimestamp(MLSxEntryParser.parseGMTdateTime(substring));
        return fTPFile;
    }

    public FTPFile[] mlistDir() {
        return mlistDir(null);
    }

    public FTPFile[] mlistDir(String str) {
        return initiateMListParsing(str).getFiles();
    }

    public FTPFile[] mlistDir(String str, FTPFileFilter fTPFileFilter) {
        return initiateMListParsing(str).getFiles(fTPFileFilter);
    }

    public FTPFile mlistFile(String str) {
        if (!FTPReply.isPositiveCompletion(sendCommand(FTPCmd.MLST, str))) {
            return null;
        }
        String str2 = getReplyStrings()[1];
        if (str2.length() >= 3 && str2.charAt(0) == ' ') {
            return MLSxEntryParser.parseEntry(str2.substring(1));
        }
        throw new MalformedServerReplyException("Invalid server reply (MLST): '" + str2 + "'");
    }

    public String printWorkingDirectory() {
        if (pwd() != 257) {
            return null;
        }
        ArrayList<String> arrayList = this._replyLines;
        return __parsePathname(arrayList.get(arrayList.size() - 1));
    }

    public boolean reinitialize() {
        rein();
        if (!FTPReply.isPositiveCompletion(this._replyCode) && (!FTPReply.isPositivePreliminary(this._replyCode) || !FTPReply.isPositiveCompletion(getReply()))) {
            return false;
        }
        __initDefaults();
        return true;
    }

    public boolean remoteAppend(String str) {
        int i10 = this.__dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(appe(str));
        }
        return false;
    }

    public boolean remoteRetrieve(String str) {
        int i10 = this.__dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(retr(str));
        }
        return false;
    }

    public boolean remoteStore(String str) {
        int i10 = this.__dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(stor(str));
        }
        return false;
    }

    public boolean remoteStoreUnique() {
        int i10 = this.__dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(stou());
        }
        return false;
    }

    public boolean remoteStoreUnique(String str) {
        int i10 = this.__dataConnectionMode;
        if (i10 == 1 || i10 == 3) {
            return FTPReply.isPositivePreliminary(stou(str));
        }
        return false;
    }

    public boolean removeDirectory(String str) {
        return FTPReply.isPositiveCompletion(rmd(str));
    }

    public boolean rename(String str, String str2) {
        if (FTPReply.isPositiveIntermediate(rnfr(str))) {
            return FTPReply.isPositiveCompletion(rnto(str2));
        }
        return false;
    }

    public boolean restart(long j10) {
        this.__restartOffset = 0L;
        return FTPReply.isPositiveIntermediate(rest(Long.toString(j10)));
    }

    public boolean retrieveFile(String str, OutputStream outputStream) {
        return _retrieveFile(FTPCmd.RETR.getCommand(), str, outputStream);
    }

    public InputStream retrieveFileStream(String str) {
        return _retrieveFileStream(FTPCmd.RETR.getCommand(), str);
    }

    public boolean sendNoOp() {
        return FTPReply.isPositiveCompletion(noop());
    }

    public boolean sendSiteCommand(String str) {
        return FTPReply.isPositiveCompletion(site(str));
    }

    public void setActiveExternalIPAddress(String str) {
        this.__activeExternalHost = InetAddress.getByName(str);
    }

    public void setActivePortRange(int i10, int i11) {
        this.__activeMinPort = i10;
        this.__activeMaxPort = i11;
    }

    public void setAutodetectUTF8(boolean z10) {
        this.__autodetectEncoding = z10;
    }

    public void setBufferSize(int i10) {
        this.__bufferSize = i10;
    }

    public void setControlKeepAliveReplyTimeout(int i10) {
        this.__controlKeepAliveReplyTimeout = i10;
    }

    public void setControlKeepAliveTimeout(long j10) {
        this.__controlKeepAliveTimeout = j10 * 1000;
    }

    public void setCopyStreamListener(CopyStreamListener copyStreamListener) {
        this.__copyStreamListener = copyStreamListener;
    }

    public void setDataTimeout(int i10) {
        this.__dataTimeout = i10;
    }

    public boolean setFileStructure(int i10) {
        if (!FTPReply.isPositiveCompletion(stru(i10))) {
            return false;
        }
        this.__fileStructure = i10;
        return true;
    }

    public boolean setFileTransferMode(int i10) {
        if (!FTPReply.isPositiveCompletion(mode(i10))) {
            return false;
        }
        this.__fileTransferMode = i10;
        return true;
    }

    public boolean setFileType(int i10) {
        if (!FTPReply.isPositiveCompletion(type(i10))) {
            return false;
        }
        this.__fileType = i10;
        this.__fileFormat = 4;
        return true;
    }

    public boolean setFileType(int i10, int i11) {
        if (!FTPReply.isPositiveCompletion(type(i10, i11))) {
            return false;
        }
        this.__fileType = i10;
        this.__fileFormat = i11;
        return true;
    }

    public void setListHiddenFiles(boolean z10) {
        this.__listHiddenFiles = z10;
    }

    public boolean setModificationTime(String str, String str2) {
        return FTPReply.isPositiveCompletion(mfmt(str, str2));
    }

    public void setParserFactory(FTPFileEntryParserFactory fTPFileEntryParserFactory) {
        this.__parserFactory = fTPFileEntryParserFactory;
    }

    public void setPassiveLocalIPAddress(String str) {
        this.__passiveLocalHost = InetAddress.getByName(str);
    }

    public void setPassiveLocalIPAddress(InetAddress inetAddress) {
        this.__passiveLocalHost = inetAddress;
    }

    @Deprecated
    public void setPassiveNatWorkaround(boolean z10) {
        this.__passiveNatWorkaroundStrategy = z10 ? new NatServerResolverImpl(this) : null;
    }

    public void setPassiveNatWorkaroundStrategy(HostnameResolver hostnameResolver) {
        this.__passiveNatWorkaroundStrategy = hostnameResolver;
    }

    public void setReceieveDataSocketBufferSize(int i10) {
        this.__receiveDataSocketBufferSize = i10;
    }

    public void setRemoteVerificationEnabled(boolean z10) {
        this.__remoteVerificationEnabled = z10;
    }

    public void setReportActiveExternalIPAddress(String str) {
        this.__reportActiveExternalHost = InetAddress.getByName(str);
    }

    public void setRestartOffset(long j10) {
        if (j10 >= 0) {
            this.__restartOffset = j10;
        }
    }

    public void setSendDataSocketBufferSize(int i10) {
        this.__sendDataSocketBufferSize = i10;
    }

    public void setUseEPSVwithIPv4(boolean z10) {
        this.__useEPSVwithIPv4 = z10;
    }

    public boolean storeFile(String str, InputStream inputStream) {
        return __storeFile(FTPCmd.STOR, str, inputStream);
    }

    public OutputStream storeFileStream(String str) {
        return __storeFileStream(FTPCmd.STOR, str);
    }

    public boolean storeUniqueFile(InputStream inputStream) {
        return __storeFile(FTPCmd.STOU, null, inputStream);
    }

    public boolean storeUniqueFile(String str, InputStream inputStream) {
        return __storeFile(FTPCmd.STOU, str, inputStream);
    }

    public OutputStream storeUniqueFileStream() {
        return __storeFileStream(FTPCmd.STOU, null);
    }

    public OutputStream storeUniqueFileStream(String str) {
        return __storeFileStream(FTPCmd.STOU, str);
    }

    public boolean structureMount(String str) {
        return FTPReply.isPositiveCompletion(smnt(str));
    }
}
