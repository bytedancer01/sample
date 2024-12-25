package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.net.SocketClient;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/Telnet.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/Telnet.class */
class Telnet extends SocketClient {
    public static final int DEFAULT_PORT = 23;
    public static final int TERMINAL_TYPE = 24;
    public static final int TERMINAL_TYPE_IS = 0;
    public static final int TERMINAL_TYPE_SEND = 1;
    public static final int _DO_MASK = 2;
    public static final int _REQUESTED_DO_MASK = 8;
    public static final int _REQUESTED_WILL_MASK = 4;
    public static final int _WILL_MASK = 1;
    public static final boolean debug = false;
    public static final boolean debugoptions = false;
    private TelnetNotificationHandler __notifhand;
    public int[] _doResponse;
    public int[] _options;
    public int[] _willResponse;
    private volatile boolean aytFlag;
    private final Object aytMonitor;
    private final TelnetOptionHandler[] optionHandlers;
    private volatile OutputStream spyStream;
    private String terminalType;
    public static final byte[] _COMMAND_DO = {-1, -3};
    public static final byte[] _COMMAND_DONT = {-1, -2};
    public static final byte[] _COMMAND_WILL = {-1, -5};
    public static final byte[] _COMMAND_WONT = {-1, -4};
    public static final byte[] _COMMAND_SB = {-1, -6};
    public static final byte[] _COMMAND_SE = {-1, -16};
    public static final byte[] _COMMAND_IS = {24, 0};
    public static final byte[] _COMMAND_AYT = {-1, -10};

    public Telnet() {
        this.terminalType = null;
        this.aytMonitor = new Object();
        this.aytFlag = true;
        this.spyStream = null;
        this.__notifhand = null;
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    public Telnet(String str) {
        this.terminalType = null;
        this.aytMonitor = new Object();
        this.aytFlag = true;
        this.spyStream = null;
        this.__notifhand = null;
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.terminalType = str;
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() {
        for (int i10 = 0; i10 < 256; i10++) {
            this._doResponse[i10] = 0;
            this._willResponse[i10] = 0;
            this._options[i10] = 0;
            TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i10];
            if (telnetOptionHandler != null) {
                telnetOptionHandler.setDo(false);
                this.optionHandlers[i10].setWill(false);
            }
        }
        super._connectAction_();
        this._input_ = new BufferedInputStream(this._input_);
        this._output_ = new BufferedOutputStream(this._output_);
        for (int i11 = 0; i11 < 256; i11++) {
            TelnetOptionHandler telnetOptionHandler2 = this.optionHandlers[i11];
            if (telnetOptionHandler2 != null) {
                if (telnetOptionHandler2.getInitLocal()) {
                    _requestWill(this.optionHandlers[i11].getOptionCode());
                }
                if (this.optionHandlers[i11].getInitRemote()) {
                    _requestDo(this.optionHandlers[i11].getOptionCode());
                }
            }
        }
    }

    public final void _processAYTResponse() {
        synchronized (this) {
            if (!this.aytFlag) {
                synchronized (this.aytMonitor) {
                    this.aytFlag = true;
                    this.aytMonitor.notifyAll();
                }
            }
        }
    }

    public void _processCommand(int i10) {
        TelnetNotificationHandler telnetNotificationHandler = this.__notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(5, i10);
        }
    }

    public void _processDo(int i10) {
        boolean z10;
        TelnetNotificationHandler telnetNotificationHandler = this.__notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(1, i10);
        }
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i10];
        if (telnetOptionHandler != null) {
            z10 = telnetOptionHandler.getAcceptLocal();
        } else {
            z10 = false;
            if (i10 == 24) {
                String str = this.terminalType;
                z10 = false;
                if (str != null) {
                    z10 = false;
                    if (str.length() > 0) {
                        z10 = true;
                    }
                }
            }
        }
        int[] iArr = this._willResponse;
        int i11 = iArr[i10];
        if (i11 > 0) {
            int i12 = i11 - 1;
            iArr[i10] = i12;
            if (i12 > 0 && _stateIsWill(i10)) {
                int[] iArr2 = this._willResponse;
                iArr2[i10] = iArr2[i10] - 1;
            }
        }
        if (this._willResponse[i10] == 0 && _requestedWont(i10)) {
            if (z10) {
                _setWantWill(i10);
                _sendWill(i10);
            } else {
                int[] iArr3 = this._willResponse;
                iArr3[i10] = iArr3[i10] + 1;
                _sendWont(i10);
            }
        }
        _setWill(i10);
    }

    public void _processDont(int i10) {
        TelnetNotificationHandler telnetNotificationHandler = this.__notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(2, i10);
        }
        int[] iArr = this._willResponse;
        int i11 = iArr[i10];
        if (i11 > 0) {
            int i12 = i11 - 1;
            iArr[i10] = i12;
            if (i12 > 0 && _stateIsWont(i10)) {
                int[] iArr2 = this._willResponse;
                iArr2[i10] = iArr2[i10] - 1;
            }
        }
        if (this._willResponse[i10] == 0 && _requestedWill(i10)) {
            if (_stateIsWill(i10) || _requestedWill(i10)) {
                _sendWont(i10);
            }
            _setWantWont(i10);
        }
        _setWont(i10);
    }

    public void _processSuboption(int[] iArr, int i10) {
        if (i10 > 0) {
            TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
            int i11 = iArr[0];
            TelnetOptionHandler telnetOptionHandler = telnetOptionHandlerArr[i11];
            if (telnetOptionHandler != null) {
                _sendSubnegotiation(telnetOptionHandler.answerSubnegotiation(iArr, i10));
            } else if (i10 > 1 && i11 == 24 && iArr[1] == 1) {
                _sendTerminalType();
            }
        }
    }

    public void _processWill(int i10) {
        TelnetNotificationHandler telnetNotificationHandler = this.__notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(3, i10);
        }
        boolean z10 = false;
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i10];
        if (telnetOptionHandler != null) {
            z10 = telnetOptionHandler.getAcceptRemote();
        }
        int[] iArr = this._doResponse;
        int i11 = iArr[i10];
        if (i11 > 0) {
            int i12 = i11 - 1;
            iArr[i10] = i12;
            if (i12 > 0 && _stateIsDo(i10)) {
                int[] iArr2 = this._doResponse;
                iArr2[i10] = iArr2[i10] - 1;
            }
        }
        if (this._doResponse[i10] == 0 && _requestedDont(i10)) {
            if (z10) {
                _setWantDo(i10);
                _sendDo(i10);
            } else {
                int[] iArr3 = this._doResponse;
                iArr3[i10] = iArr3[i10] + 1;
                _sendDont(i10);
            }
        }
        _setDo(i10);
    }

    public void _processWont(int i10) {
        TelnetNotificationHandler telnetNotificationHandler = this.__notifhand;
        if (telnetNotificationHandler != null) {
            telnetNotificationHandler.receivedNegotiation(4, i10);
        }
        int[] iArr = this._doResponse;
        int i11 = iArr[i10];
        if (i11 > 0) {
            int i12 = i11 - 1;
            iArr[i10] = i12;
            if (i12 > 0 && _stateIsDont(i10)) {
                int[] iArr2 = this._doResponse;
                iArr2[i10] = iArr2[i10] - 1;
            }
        }
        if (this._doResponse[i10] == 0 && _requestedDo(i10)) {
            if (_stateIsDo(i10) || _requestedDo(i10)) {
                _sendDont(i10);
            }
            _setWantDont(i10);
        }
        _setDont(i10);
    }

    public void _registerSpyStream(OutputStream outputStream) {
        this.spyStream = outputStream;
    }

    public final void _requestDo(int i10) {
        synchronized (this) {
            if ((this._doResponse[i10] == 0 && _stateIsDo(i10)) || _requestedDo(i10)) {
                return;
            }
            _setWantDo(i10);
            int[] iArr = this._doResponse;
            iArr[i10] = iArr[i10] + 1;
            _sendDo(i10);
        }
    }

    public final void _requestDont(int i10) {
        synchronized (this) {
            if ((this._doResponse[i10] == 0 && _stateIsDont(i10)) || _requestedDont(i10)) {
                return;
            }
            _setWantDont(i10);
            int[] iArr = this._doResponse;
            iArr[i10] = iArr[i10] + 1;
            _sendDont(i10);
        }
    }

    public final void _requestWill(int i10) {
        synchronized (this) {
            if ((this._willResponse[i10] == 0 && _stateIsWill(i10)) || _requestedWill(i10)) {
                return;
            }
            _setWantWill(i10);
            int[] iArr = this._doResponse;
            iArr[i10] = iArr[i10] + 1;
            _sendWill(i10);
        }
    }

    public final void _requestWont(int i10) {
        synchronized (this) {
            if ((this._willResponse[i10] == 0 && _stateIsWont(i10)) || _requestedWont(i10)) {
                return;
            }
            _setWantWont(i10);
            int[] iArr = this._doResponse;
            iArr[i10] = iArr[i10] + 1;
            _sendWont(i10);
        }
    }

    public boolean _requestedDo(int i10) {
        return (this._options[i10] & 8) != 0;
    }

    public boolean _requestedDont(int i10) {
        return !_requestedDo(i10);
    }

    public boolean _requestedWill(int i10) {
        return (this._options[i10] & 4) != 0;
    }

    public boolean _requestedWont(int i10) {
        return !_requestedWill(i10);
    }

    public final boolean _sendAYT(long j10) {
        boolean z10;
        synchronized (this.aytMonitor) {
            synchronized (this) {
                z10 = false;
                this.aytFlag = false;
                this._output_.write(_COMMAND_AYT);
                this._output_.flush();
            }
            this.aytMonitor.wait(j10);
            if (this.aytFlag) {
                z10 = true;
            } else {
                this.aytFlag = true;
            }
        }
        return z10;
    }

    public final void _sendByte(int i10) {
        synchronized (this) {
            this._output_.write(i10);
            _spyWrite(i10);
        }
    }

    public final void _sendCommand(byte b10) {
        synchronized (this) {
            this._output_.write(255);
            this._output_.write(b10);
            this._output_.flush();
        }
    }

    public final void _sendDo(int i10) {
        synchronized (this) {
            this._output_.write(_COMMAND_DO);
            this._output_.write(i10);
            this._output_.flush();
        }
    }

    public final void _sendDont(int i10) {
        synchronized (this) {
            this._output_.write(_COMMAND_DONT);
            this._output_.write(i10);
            this._output_.flush();
        }
    }

    public final void _sendSubnegotiation(int[] iArr) {
        synchronized (this) {
            if (iArr != null) {
                this._output_.write(_COMMAND_SB);
                for (int i10 : iArr) {
                    byte b10 = (byte) i10;
                    if (b10 == -1) {
                        this._output_.write(b10);
                    }
                    this._output_.write(b10);
                }
                this._output_.write(_COMMAND_SE);
                this._output_.flush();
            }
        }
    }

    public final void _sendTerminalType() {
        synchronized (this) {
            if (this.terminalType != null) {
                this._output_.write(_COMMAND_SB);
                this._output_.write(_COMMAND_IS);
                this._output_.write(this.terminalType.getBytes(getCharset()));
                this._output_.write(_COMMAND_SE);
                this._output_.flush();
            }
        }
    }

    public final void _sendWill(int i10) {
        synchronized (this) {
            this._output_.write(_COMMAND_WILL);
            this._output_.write(i10);
            this._output_.flush();
        }
    }

    public final void _sendWont(int i10) {
        synchronized (this) {
            this._output_.write(_COMMAND_WONT);
            this._output_.write(i10);
            this._output_.flush();
        }
    }

    public void _setDo(int i10) {
        TelnetOptionHandler telnetOptionHandler;
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] | 2;
        if (!_requestedDo(i10) || (telnetOptionHandler = this.optionHandlers[i10]) == null) {
            return;
        }
        telnetOptionHandler.setDo(true);
        int[] startSubnegotiationRemote = this.optionHandlers[i10].startSubnegotiationRemote();
        if (startSubnegotiationRemote != null) {
            _sendSubnegotiation(startSubnegotiationRemote);
        }
    }

    public void _setDont(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] & (-3);
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i10];
        if (telnetOptionHandler != null) {
            telnetOptionHandler.setDo(false);
        }
    }

    public void _setWantDo(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] | 8;
    }

    public void _setWantDont(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] & (-9);
    }

    public void _setWantWill(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] | 4;
    }

    public void _setWantWont(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] & (-5);
    }

    public void _setWill(int i10) {
        TelnetOptionHandler telnetOptionHandler;
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] | 1;
        if (!_requestedWill(i10) || (telnetOptionHandler = this.optionHandlers[i10]) == null) {
            return;
        }
        telnetOptionHandler.setWill(true);
        int[] startSubnegotiationLocal = this.optionHandlers[i10].startSubnegotiationLocal();
        if (startSubnegotiationLocal != null) {
            _sendSubnegotiation(startSubnegotiationLocal);
        }
    }

    public void _setWont(int i10) {
        int[] iArr = this._options;
        iArr[i10] = iArr[i10] & (-2);
        TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i10];
        if (telnetOptionHandler != null) {
            telnetOptionHandler.setWill(false);
        }
    }

    public void _spyRead(int i10) {
        OutputStream outputStream = this.spyStream;
        if (outputStream == null || i10 == 13) {
            return;
        }
        if (i10 == 10) {
            try {
                outputStream.write(13);
            } catch (IOException e10) {
                this.spyStream = null;
                return;
            }
        }
        outputStream.write(i10);
        outputStream.flush();
    }

    public void _spyWrite(int i10) {
        OutputStream outputStream;
        if ((_stateIsDo(1) && _requestedDo(1)) || (outputStream = this.spyStream) == null) {
            return;
        }
        try {
            outputStream.write(i10);
            outputStream.flush();
        } catch (IOException e10) {
            this.spyStream = null;
        }
    }

    public boolean _stateIsDo(int i10) {
        return (this._options[i10] & 2) != 0;
    }

    public boolean _stateIsDont(int i10) {
        return !_stateIsDo(i10);
    }

    public boolean _stateIsWill(int i10) {
        boolean z10 = true;
        if ((this._options[i10] & 1) == 0) {
            z10 = false;
        }
        return z10;
    }

    public boolean _stateIsWont(int i10) {
        return !_stateIsWill(i10);
    }

    public void _stopSpyStream() {
        this.spyStream = null;
    }

    public void addOptionHandler(TelnetOptionHandler telnetOptionHandler) {
        int optionCode = telnetOptionHandler.getOptionCode();
        if (!TelnetOption.isValidOption(optionCode)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", optionCode);
        }
        TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
        if (telnetOptionHandlerArr[optionCode] != null) {
            throw new InvalidTelnetOptionException("Already registered option", optionCode);
        }
        telnetOptionHandlerArr[optionCode] = telnetOptionHandler;
        if (isConnected()) {
            if (telnetOptionHandler.getInitLocal()) {
                _requestWill(optionCode);
            }
            if (telnetOptionHandler.getInitRemote()) {
                _requestDo(optionCode);
            }
        }
    }

    public void deleteOptionHandler(int i10) {
        if (!TelnetOption.isValidOption(i10)) {
            throw new InvalidTelnetOptionException("Invalid Option Code", i10);
        }
        TelnetOptionHandler[] telnetOptionHandlerArr = this.optionHandlers;
        TelnetOptionHandler telnetOptionHandler = telnetOptionHandlerArr[i10];
        if (telnetOptionHandler == null) {
            throw new InvalidTelnetOptionException("Unregistered option", i10);
        }
        telnetOptionHandlerArr[i10] = null;
        if (telnetOptionHandler.getWill()) {
            _requestWont(i10);
        }
        if (telnetOptionHandler.getDo()) {
            _requestDont(i10);
        }
    }

    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        this.__notifhand = telnetNotificationHandler;
    }

    public void unregisterNotifHandler() {
        this.__notifhand = null;
    }
}
