package org.apache.commons.net.ftp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/FTPSCommand.class
 */
@Deprecated
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/FTPSCommand.class */
public final class FTPSCommand {
    public static final int ADAT = 1;
    public static final int AUTH = 0;
    public static final int AUTHENTICATION_SECURITY_DATA = 1;
    public static final int AUTHENTICATION_SECURITY_MECHANISM = 0;
    public static final int CCC = 4;
    public static final int CLEAR_COMMAND_CHANNEL = 4;
    public static final int DATA_CHANNEL_PROTECTION_LEVEL = 3;
    public static final int PBSZ = 2;
    public static final int PROT = 3;
    public static final int PROTECTION_BUFFER_SIZE = 2;
    private static final String[] _commands = {"AUTH", "ADAT", "PBSZ", "PROT", "CCC"};

    public static final String getCommand(int i10) {
        return _commands[i10];
    }
}
