package org.apache.commons.net.smtp;

import java.io.Writer;
import org.apache.commons.net.p255io.DotTerminatedMessageWriter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/smtp/SMTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/SMTPClient.class */
public class SMTPClient extends SMTP {
    public SMTPClient() {
    }

    public SMTPClient(String str) {
        super(str);
    }

    public boolean addRecipient(String str) {
        return SMTPReply.isPositiveCompletion(rcpt("<" + str + ">"));
    }

    public boolean addRecipient(RelayPath relayPath) {
        return SMTPReply.isPositiveCompletion(rcpt(relayPath.toString()));
    }

    public boolean completePendingCommand() {
        return SMTPReply.isPositiveCompletion(getReply());
    }

    public String listHelp() {
        if (SMTPReply.isPositiveCompletion(help())) {
            return getReplyString();
        }
        return null;
    }

    public String listHelp(String str) {
        if (SMTPReply.isPositiveCompletion(help(str))) {
            return getReplyString();
        }
        return null;
    }

    public boolean login() {
        String hostName = getLocalAddress().getHostName();
        if (hostName == null) {
            return false;
        }
        return SMTPReply.isPositiveCompletion(helo(hostName));
    }

    public boolean login(String str) {
        return SMTPReply.isPositiveCompletion(helo(str));
    }

    public boolean logout() {
        return SMTPReply.isPositiveCompletion(quit());
    }

    public boolean reset() {
        return SMTPReply.isPositiveCompletion(rset());
    }

    public Writer sendMessageData() {
        if (SMTPReply.isPositiveIntermediate(data())) {
            return new DotTerminatedMessageWriter(this._writer);
        }
        return null;
    }

    public boolean sendNoOp() {
        return SMTPReply.isPositiveCompletion(noop());
    }

    public boolean sendShortMessageData(String str) {
        Writer sendMessageData = sendMessageData();
        if (sendMessageData == null) {
            return false;
        }
        sendMessageData.write(str);
        sendMessageData.close();
        return completePendingCommand();
    }

    public boolean sendSimpleMessage(String str, String str2, String str3) {
        if (setSender(str) && addRecipient(str2)) {
            return sendShortMessageData(str3);
        }
        return false;
    }

    public boolean sendSimpleMessage(String str, String[] strArr, String str2) {
        if (!setSender(str)) {
            return false;
        }
        boolean z10 = false;
        for (String str3 : strArr) {
            if (addRecipient(str3)) {
                z10 = true;
            }
        }
        if (z10) {
            return sendShortMessageData(str2);
        }
        return false;
    }

    public boolean setSender(String str) {
        return SMTPReply.isPositiveCompletion(mail("<" + str + ">"));
    }

    public boolean setSender(RelayPath relayPath) {
        return SMTPReply.isPositiveCompletion(mail(relayPath.toString()));
    }

    public boolean verify(String str) {
        int vrfy = vrfy(str);
        return vrfy == 250 || vrfy == 251;
    }
}
