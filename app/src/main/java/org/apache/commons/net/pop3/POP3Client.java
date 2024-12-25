package org.apache.commons.net.pop3;

import java.io.Reader;
import java.security.MessageDigest;
import java.util.ListIterator;
import java.util.StringTokenizer;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.net.p255io.DotTerminatedMessageReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/pop3/POP3Client.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/POP3Client.class */
public class POP3Client extends POP3 {
    private static POP3MessageInfo __parseStatus(String str) {
        int parseInt;
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        POP3MessageInfo pOP3MessageInfo = null;
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            parseInt = Integer.parseInt(stringTokenizer.nextToken());
        } catch (NumberFormatException e10) {
        }
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        pOP3MessageInfo = new POP3MessageInfo(parseInt, Integer.parseInt(stringTokenizer.nextToken()));
        return pOP3MessageInfo;
    }

    private static POP3MessageInfo __parseUID(String str) {
        int parseInt;
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        POP3MessageInfo pOP3MessageInfo = null;
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        try {
            parseInt = Integer.parseInt(stringTokenizer.nextToken());
        } catch (NumberFormatException e10) {
        }
        if (!stringTokenizer.hasMoreElements()) {
            return null;
        }
        pOP3MessageInfo = new POP3MessageInfo(parseInt, stringTokenizer.nextToken());
        return pOP3MessageInfo;
    }

    public boolean capa() {
        if (sendCommand(12) != 0) {
            return false;
        }
        getAdditionalReply();
        return true;
    }

    public boolean deleteMessage(int i10) {
        boolean z10 = false;
        if (getState() == 1) {
            z10 = false;
            if (sendCommand(6, Integer.toString(i10)) == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    public POP3MessageInfo listMessage(int i10) {
        if (getState() == 1 && sendCommand(4, Integer.toString(i10)) == 0) {
            return __parseStatus(this._lastReplyLine.substring(3));
        }
        return null;
    }

    public POP3MessageInfo[] listMessages() {
        if (getState() != 1 || sendCommand(4) != 0) {
            return null;
        }
        getAdditionalReply();
        int size = this._replyLines.size() - 2;
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[size];
        ListIterator<String> listIterator = this._replyLines.listIterator(1);
        for (int i10 = 0; i10 < size; i10++) {
            pOP3MessageInfoArr[i10] = __parseStatus(listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public POP3MessageInfo listUniqueIdentifier(int i10) {
        if (getState() == 1 && sendCommand(11, Integer.toString(i10)) == 0) {
            return __parseUID(this._lastReplyLine.substring(3));
        }
        return null;
    }

    public POP3MessageInfo[] listUniqueIdentifiers() {
        if (getState() != 1 || sendCommand(11) != 0) {
            return null;
        }
        getAdditionalReply();
        int size = this._replyLines.size() - 2;
        POP3MessageInfo[] pOP3MessageInfoArr = new POP3MessageInfo[size];
        ListIterator<String> listIterator = this._replyLines.listIterator(1);
        for (int i10 = 0; i10 < size; i10++) {
            pOP3MessageInfoArr[i10] = __parseUID(listIterator.next());
        }
        return pOP3MessageInfoArr;
    }

    public boolean login(String str, String str2) {
        if (getState() != 0 || sendCommand(0, str) != 0 || sendCommand(1, str2) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean login(String str, String str2, String str3) {
        if (getState() != 0) {
            return false;
        }
        byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest((str2 + str3).getBytes(getCharset()));
        StringBuilder sb2 = new StringBuilder(128);
        for (int i10 = 0; i10 < digest.length; i10++) {
            int i11 = digest[i10] & 255;
            if (i11 <= 15) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i11));
        }
        StringBuilder sb3 = new StringBuilder(256);
        sb3.append(str);
        sb3.append(' ');
        sb3.append(sb2.toString());
        if (sendCommand(9, sb3.toString()) != 0) {
            return false;
        }
        setState(1);
        return true;
    }

    public boolean logout() {
        boolean z10 = true;
        if (getState() == 1) {
            setState(2);
        }
        sendCommand(2);
        if (this._replyCode != 0) {
            z10 = false;
        }
        return z10;
    }

    public boolean noop() {
        boolean z10 = false;
        if (getState() == 1) {
            z10 = false;
            if (sendCommand(7) == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean reset() {
        boolean z10 = false;
        if (getState() == 1) {
            z10 = false;
            if (sendCommand(8) == 0) {
                z10 = true;
            }
        }
        return z10;
    }

    public Reader retrieveMessage(int i10) {
        if (getState() == 1 && sendCommand(5, Integer.toString(i10)) == 0) {
            return new DotTerminatedMessageReader(this._reader);
        }
        return null;
    }

    public Reader retrieveMessageTop(int i10, int i11) {
        if (i11 < 0 || getState() != 1) {
            return null;
        }
        if (sendCommand(10, Integer.toString(i10) + " " + Integer.toString(i11)) != 0) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader);
    }

    public POP3MessageInfo status() {
        if (getState() == 1 && sendCommand(3) == 0) {
            return __parseStatus(this._lastReplyLine.substring(3));
        }
        return null;
    }
}
