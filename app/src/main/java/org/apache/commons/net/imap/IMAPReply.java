package org.apache.commons.net.imap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/imap/IMAPReply.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/IMAPReply.class */
public final class IMAPReply {
    public static final int BAD = 2;
    public static final int CONT = 3;
    private static final String IMAP_BAD = "BAD";
    private static final String IMAP_CONTINUATION_PREFIX = "+";
    private static final String IMAP_NO = "NO";
    private static final String IMAP_OK = "OK";
    private static final String IMAP_UNTAGGED_PREFIX = "* ";

    /* renamed from: NO */
    public static final int f36126NO = 1;

    /* renamed from: OK */
    public static final int f36127OK = 0;
    public static final int PARTIAL = 3;
    private static final String TAGGED_RESPONSE = "^\\w+ (\\S+).*";
    private static final Pattern TAGGED_PATTERN = Pattern.compile(TAGGED_RESPONSE);
    private static final String UNTAGGED_RESPONSE = "^\\* (\\S+).*";
    private static final Pattern UNTAGGED_PATTERN = Pattern.compile(UNTAGGED_RESPONSE);
    private static final Pattern LITERAL_PATTERN = Pattern.compile("\\{(\\d+)\\}$");

    private IMAPReply() {
    }

    public static int getReplyCode(String str) {
        return getReplyCode(str, TAGGED_PATTERN);
    }

    private static int getReplyCode(String str, Pattern pattern) {
        if (isContinuation(str)) {
            return 3;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group.equals(IMAP_OK)) {
                return 0;
            }
            if (group.equals(IMAP_BAD)) {
                return 2;
            }
            if (group.equals(IMAP_NO)) {
                return 1;
            }
        }
        throw new MalformedServerReplyException("Received unexpected IMAP protocol response from server: '" + str + "'.");
    }

    public static int getUntaggedReplyCode(String str) {
        return getReplyCode(str, UNTAGGED_PATTERN);
    }

    public static boolean isContinuation(int i10) {
        return i10 == 3;
    }

    public static boolean isContinuation(String str) {
        return str.startsWith("+");
    }

    public static boolean isSuccess(int i10) {
        return i10 == 0;
    }

    public static boolean isUntagged(String str) {
        return str.startsWith(IMAP_UNTAGGED_PREFIX);
    }

    public static int literalCount(String str) {
        Matcher matcher = LITERAL_PATTERN.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }
}
