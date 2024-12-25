package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetOptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetOptionHandler.class */
public abstract class TelnetOptionHandler {
    private boolean acceptLocal;
    private boolean acceptRemote;
    private boolean initialLocal;
    private boolean initialRemote;
    private int optionCode;
    private boolean doFlag = false;
    private boolean willFlag = false;

    public TelnetOptionHandler(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.optionCode = i10;
        this.initialLocal = z10;
        this.initialRemote = z11;
        this.acceptLocal = z12;
        this.acceptRemote = z13;
    }

    public int[] answerSubnegotiation(int[] iArr, int i10) {
        return null;
    }

    public boolean getAcceptLocal() {
        return this.acceptLocal;
    }

    public boolean getAcceptRemote() {
        return this.acceptRemote;
    }

    public boolean getDo() {
        return this.doFlag;
    }

    public boolean getInitLocal() {
        return this.initialLocal;
    }

    public boolean getInitRemote() {
        return this.initialRemote;
    }

    public int getOptionCode() {
        return this.optionCode;
    }

    public boolean getWill() {
        return this.willFlag;
    }

    public void setAcceptLocal(boolean z10) {
        this.acceptLocal = z10;
    }

    public void setAcceptRemote(boolean z10) {
        this.acceptRemote = z10;
    }

    public void setDo(boolean z10) {
        this.doFlag = z10;
    }

    public void setInitLocal(boolean z10) {
        this.initialLocal = z10;
    }

    public void setInitRemote(boolean z10) {
        this.initialRemote = z10;
    }

    public void setWill(boolean z10) {
        this.willFlag = z10;
    }

    public int[] startSubnegotiationLocal() {
        return null;
    }

    public int[] startSubnegotiationRemote() {
        return null;
    }
}
