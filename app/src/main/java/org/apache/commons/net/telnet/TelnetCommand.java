package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TelnetCommand.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TelnetCommand.class */
public final class TelnetCommand {
    public static final int ABORT = 238;

    /* renamed from: AO */
    public static final int f36135AO = 245;
    public static final int AYT = 246;
    public static final int BREAK = 243;

    /* renamed from: DM */
    public static final int f36136DM = 242;

    /* renamed from: DO */
    public static final int f36137DO = 253;
    public static final int DONT = 254;

    /* renamed from: EC */
    public static final int f36138EC = 247;

    /* renamed from: EL */
    public static final int f36139EL = 248;
    public static final int EOF = 236;
    public static final int EOR = 239;

    /* renamed from: GA */
    public static final int f36140GA = 249;
    public static final int IAC = 255;

    /* renamed from: IP */
    public static final int f36141IP = 244;
    public static final int MAX_COMMAND_VALUE = 255;
    public static final int NOP = 241;

    /* renamed from: SB */
    public static final int f36142SB = 250;

    /* renamed from: SE */
    public static final int f36143SE = 240;
    public static final int SUSP = 237;
    public static final int SYNCH = 242;
    public static final int WILL = 251;
    public static final int WONT = 252;
    private static final int __FIRST_COMMAND = 255;
    private static final int __LAST_COMMAND = 236;
    private static final String[] __commandString = {"IAC", "DONT", "DO", "WONT", "WILL", "SB", "GA", "EL", "EC", "AYT", "AO", "IP", "BRK", "DMARK", "NOP", "SE", "EOR", "ABORT", "SUSP", "EOF"};

    private TelnetCommand() {
    }

    public static final String getCommand(int i10) {
        return __commandString[255 - i10];
    }

    public static final boolean isValidCommand(int i10) {
        return i10 <= 255 && i10 >= 236;
    }
}
