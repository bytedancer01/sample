package org.apache.commons.net.ntp;

import com.amazonaws.services.p045s3.model.InstructionFileId;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ntp/NtpUtils.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ntp/NtpUtils.class */
public final class NtpUtils {
    public static String getHostAddress(int i10) {
        return ((i10 >>> 24) & 255) + InstructionFileId.DOT + ((i10 >>> 16) & 255) + InstructionFileId.DOT + ((i10 >>> 8) & 255) + InstructionFileId.DOT + ((i10 >>> 0) & 255);
    }

    public static String getModeName(int i10) {
        switch (i10) {
            case 0:
                return "Reserved";
            case 1:
                return "Symmetric Active";
            case 2:
                return "Symmetric Passive";
            case 3:
                return "Client";
            case 4:
                return "Server";
            case 5:
                return "Broadcast";
            case 6:
                return "Control";
            case 7:
                return "Private";
            default:
                return "Unknown";
        }
    }

    public static String getRefAddress(NtpV3Packet ntpV3Packet) {
        return getHostAddress(ntpV3Packet == null ? 0 : ntpV3Packet.getReferenceId());
    }

    public static String getReferenceClock(NtpV3Packet ntpV3Packet) {
        int referenceId;
        char c10;
        if (ntpV3Packet == null || (referenceId = ntpV3Packet.getReferenceId()) == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(4);
        for (int i10 = 24; i10 >= 0 && (c10 = (char) ((referenceId >>> i10) & 255)) != 0; i10 -= 8) {
            if (!Character.isLetterOrDigit(c10)) {
                return "";
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
