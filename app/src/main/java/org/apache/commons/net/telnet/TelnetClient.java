package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetClient.class */
public class TelnetClient extends Telnet {
    private InputStream __input;
    private OutputStream __output;
    private TelnetInputListener inputListener;
    public boolean readerThread;

    public TelnetClient() {
        super("VT100");
        this.readerThread = true;
        this.__input = null;
        this.__output = null;
    }

    public TelnetClient(String str) {
        super(str);
        this.readerThread = true;
        this.__input = null;
        this.__output = null;
    }

    public void _closeOutputStream() {
        try {
            this._output_.close();
        } finally {
            this._output_ = null;
        }
    }

    @Override // org.apache.commons.net.telnet.Telnet, org.apache.commons.net.SocketClient
    public void _connectAction_() {
        super._connectAction_();
        TelnetInputStream telnetInputStream = new TelnetInputStream(this._input_, this, this.readerThread);
        if (this.readerThread) {
            telnetInputStream._start();
        }
        this.__input = new BufferedInputStream(telnetInputStream);
        this.__output = new TelnetOutputStream(this);
    }

    public void _flushOutputStream() {
        this._output_.flush();
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) {
        super.addOptionHandler(telnetOptionHandler);
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void deleteOptionHandler(int i10) {
        super.deleteOptionHandler(i10);
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() {
        try {
            InputStream inputStream = this.__input;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.__output;
            if (outputStream != null) {
                outputStream.close();
            }
        } finally {
            this.__output = null;
            this.__input = null;
            super.disconnect();
        }
    }

    public InputStream getInputStream() {
        return this.__input;
    }

    public boolean getLocalOptionState(int i10) {
        return _stateIsWill(i10) && _requestedWill(i10);
    }

    public OutputStream getOutputStream() {
        return this.__output;
    }

    public boolean getReaderThread() {
        return this.readerThread;
    }

    public boolean getRemoteOptionState(int i10) {
        return _stateIsDo(i10) && _requestedDo(i10);
    }

    public void notifyInputListener() {
        TelnetInputListener telnetInputListener;
        synchronized (this) {
            telnetInputListener = this.inputListener;
        }
        if (telnetInputListener != null) {
            telnetInputListener.telnetInputAvailable();
        }
    }

    public void registerInputListener(TelnetInputListener telnetInputListener) {
        synchronized (this) {
            this.inputListener = telnetInputListener;
        }
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        super.registerNotifHandler(telnetNotificationHandler);
    }

    public void registerSpyStream(OutputStream outputStream) {
        super._registerSpyStream(outputStream);
    }

    public boolean sendAYT(long j10) {
        return _sendAYT(j10);
    }

    public void sendCommand(byte b10) {
        _sendCommand(b10);
    }

    public void sendSubnegotiation(int[] iArr) {
        if (iArr.length < 1) {
            throw new IllegalArgumentException("zero length message");
        }
        _sendSubnegotiation(iArr);
    }

    public void setReaderThread(boolean z10) {
        this.readerThread = z10;
    }

    public void stopSpyStream() {
        super._stopSpyStream();
    }

    public void unregisterInputListener() {
        synchronized (this) {
            this.inputListener = null;
        }
    }

    @Override // org.apache.commons.net.telnet.Telnet
    public void unregisterNotifHandler() {
        super.unregisterNotifHandler();
    }
}
