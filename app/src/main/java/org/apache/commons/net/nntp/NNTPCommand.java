package org.apache.commons.net.nntp;

import org.apache.http.client.methods.HttpHead;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/NNTPCommand.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/NNTPCommand.class */
public final class NNTPCommand {
    public static final int ARTICLE = 0;
    public static final int AUTHINFO = 15;
    public static final int BODY = 1;
    public static final int GROUP = 2;
    public static final int HEAD = 3;
    public static final int HELP = 4;
    public static final int IHAVE = 5;
    public static final int LAST = 6;
    public static final int LIST = 7;
    public static final int NEWGROUPS = 8;
    public static final int NEWNEWS = 9;
    public static final int NEXT = 10;
    public static final int POST = 11;
    public static final int QUIT = 12;
    public static final int SLAVE = 13;
    public static final int STAT = 14;
    public static final int XHDR = 17;
    public static final int XOVER = 16;
    private static final String[] _commands = {"ARTICLE", "BODY", "GROUP", HttpHead.METHOD_NAME, "HELP", "IHAVE", "LAST", "LIST", "NEWGROUPS", "NEWNEWS", "NEXT", "POST", "QUIT", "SLAVE", "STAT", "AUTHINFO", "XOVER", "XHDR"};

    private NNTPCommand() {
    }

    public static final String getCommand(int i10) {
        return _commands[i10];
    }
}
