package org.apache.commons.net.imap;

import org.apache.commons.net.imap.IMAP;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/imap/IMAPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPClient.class */
public class IMAPClient extends IMAP {
    private static final char DQUOTE = '\"';
    private static final String DQUOTE_S = "\"";

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/IMAPClient$FETCH_ITEM_NAMES.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPClient$FETCH_ITEM_NAMES.class */
    public enum FETCH_ITEM_NAMES {
        ALL,
        FAST,
        FULL,
        BODY,
        BODYSTRUCTURE,
        ENVELOPE,
        FLAGS,
        INTERNALDATE,
        RFC822,
        UID
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/IMAPClient$SEARCH_CRITERIA.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPClient$SEARCH_CRITERIA.class */
    public enum SEARCH_CRITERIA {
        ALL,
        ANSWERED,
        BCC,
        BEFORE,
        BODY,
        CC,
        DELETED,
        DRAFT,
        FLAGGED,
        FROM,
        HEADER,
        KEYWORD,
        LARGER,
        NEW,
        NOT,
        OLD,
        ON,
        OR,
        RECENT,
        SEEN,
        SENTBEFORE,
        SENTON,
        SENTSINCE,
        SINCE,
        SMALLER,
        SUBJECT,
        TEXT,
        TO,
        UID,
        UNANSWERED,
        UNDELETED,
        UNDRAFT,
        UNFLAGGED,
        UNKEYWORD,
        UNSEEN
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/IMAPClient$STATUS_DATA_ITEMS.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPClient$STATUS_DATA_ITEMS.class */
    public enum STATUS_DATA_ITEMS {
        MESSAGES,
        RECENT,
        UIDNEXT,
        UIDVALIDITY,
        UNSEEN
    }

    @Deprecated
    public boolean append(String str) {
        return append(str, null, null);
    }

    @Deprecated
    public boolean append(String str, String str2, String str3) {
        StringBuilder sb2;
        String str4 = str;
        if (str2 != null) {
            str4 = str + " " + str2;
        }
        String str5 = str4;
        if (str3 != null) {
            if (str3.charAt(0) == '{') {
                sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(" ");
                sb2.append(str3);
            } else {
                sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(" {");
                sb2.append(str3);
                sb2.append("}");
            }
            str5 = sb2.toString();
        }
        return doCommand(IMAPCommand.APPEND, str5);
    }

    public boolean append(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        if (str2 != null) {
            sb2.append(" ");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append(" ");
            if (str3.charAt(0) == '\"') {
                sb2.append(str3);
            } else {
                sb2.append('\"');
                sb2.append(str3);
                sb2.append('\"');
            }
        }
        sb2.append(" ");
        if (str4.startsWith("\"") && str4.endsWith("\"")) {
            sb2.append(str4);
            return doCommand(IMAPCommand.APPEND, sb2.toString());
        }
        sb2.append('{');
        sb2.append(str4.length());
        sb2.append('}');
        boolean z10 = false;
        if (IMAPReply.isContinuation(sendCommand(IMAPCommand.APPEND, sb2.toString()))) {
            z10 = false;
            if (IMAPReply.isSuccess(sendData(str4))) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean capability() {
        return doCommand(IMAPCommand.CAPABILITY);
    }

    public boolean check() {
        return doCommand(IMAPCommand.CHECK);
    }

    public boolean close() {
        return doCommand(IMAPCommand.CLOSE);
    }

    public boolean copy(String str, String str2) {
        return doCommand(IMAPCommand.COPY, str + " " + str2);
    }

    public boolean create(String str) {
        return doCommand(IMAPCommand.CREATE, str);
    }

    public boolean delete(String str) {
        return doCommand(IMAPCommand.DELETE, str);
    }

    public boolean examine(String str) {
        return doCommand(IMAPCommand.EXAMINE, str);
    }

    public boolean expunge() {
        return doCommand(IMAPCommand.EXPUNGE);
    }

    public boolean fetch(String str, String str2) {
        return doCommand(IMAPCommand.FETCH, str + " " + str2);
    }

    public boolean list(String str, String str2) {
        return doCommand(IMAPCommand.LIST, str + " " + str2);
    }

    public boolean login(String str, String str2) {
        if (getState() != IMAP.IMAPState.NOT_AUTH_STATE) {
            return false;
        }
        if (!doCommand(IMAPCommand.LOGIN, str + " " + str2)) {
            return false;
        }
        setState(IMAP.IMAPState.AUTH_STATE);
        return true;
    }

    public boolean logout() {
        return doCommand(IMAPCommand.LOGOUT);
    }

    public boolean lsub(String str, String str2) {
        return doCommand(IMAPCommand.LSUB, str + " " + str2);
    }

    public boolean noop() {
        return doCommand(IMAPCommand.NOOP);
    }

    public boolean rename(String str, String str2) {
        return doCommand(IMAPCommand.RENAME, str + " " + str2);
    }

    public boolean search(String str) {
        return search(null, str);
    }

    public boolean search(String str, String str2) {
        String str3 = "";
        if (str != null) {
            str3 = "CHARSET " + str;
        }
        return doCommand(IMAPCommand.SEARCH, str3 + str2);
    }

    public boolean select(String str) {
        return doCommand(IMAPCommand.SELECT, str);
    }

    public boolean status(String str, String[] strArr) {
        if (strArr == null || strArr.length < 1) {
            throw new IllegalArgumentException("STATUS command requires at least one data item name");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" (");
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(" ");
            }
            sb2.append(strArr[i10]);
        }
        sb2.append(")");
        return doCommand(IMAPCommand.STATUS, sb2.toString());
    }

    public boolean store(String str, String str2, String str3) {
        return doCommand(IMAPCommand.STORE, str + " " + str2 + " " + str3);
    }

    public boolean subscribe(String str) {
        return doCommand(IMAPCommand.SUBSCRIBE, str);
    }

    public boolean uid(String str, String str2) {
        return doCommand(IMAPCommand.UID, str + " " + str2);
    }

    public boolean unsubscribe(String str) {
        return doCommand(IMAPCommand.UNSUBSCRIBE, str);
    }
}
