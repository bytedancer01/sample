package org.apache.commons.net.imap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/imap/IMAPCommand.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPCommand.class */
public enum IMAPCommand {
    CAPABILITY(0),
    NOOP(0),
    LOGOUT(0),
    STARTTLS(0),
    AUTHENTICATE(1),
    LOGIN(2),
    XOAUTH(1),
    SELECT(1),
    EXAMINE(1),
    CREATE(1),
    DELETE(1),
    RENAME(2),
    SUBSCRIBE(1),
    UNSUBSCRIBE(1),
    LIST(2),
    LSUB(2),
    STATUS(2),
    APPEND(2, 4),
    CHECK(0),
    CLOSE(0),
    EXPUNGE(0),
    SEARCH(1, Integer.MAX_VALUE),
    FETCH(2),
    STORE(3),
    COPY(2),
    UID(2, Integer.MAX_VALUE);

    private final String imapCommand;
    private final int maxParamCount;
    private final int minParamCount;

    IMAPCommand() {
        this((String) null);
    }

    IMAPCommand(int i10) {
        this(null, i10, i10);
    }

    IMAPCommand(int i10, int i11) {
        this(null, i10, i11);
    }

    IMAPCommand(String str) {
        this(str, 0);
    }

    IMAPCommand(String str, int i10) {
        this(str, i10, i10);
    }

    IMAPCommand(String str, int i10, int i11) {
        this.imapCommand = str;
        this.minParamCount = i10;
        this.maxParamCount = i11;
    }

    public static final String getCommand(IMAPCommand iMAPCommand) {
        return iMAPCommand.getIMAPCommand();
    }

    public String getIMAPCommand() {
        String str = this.imapCommand;
        if (str == null) {
            str = name();
        }
        return str;
    }
}
