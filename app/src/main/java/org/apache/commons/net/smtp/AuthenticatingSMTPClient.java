package org.apache.commons.net.smtp;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.util.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/smtp/AuthenticatingSMTPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/AuthenticatingSMTPClient.class */
public class AuthenticatingSMTPClient extends SMTPSClient {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/smtp/AuthenticatingSMTPClient$AUTH_METHOD.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/smtp/AuthenticatingSMTPClient$AUTH_METHOD.class */
    public enum AUTH_METHOD {
        PLAIN,
        CRAM_MD5,
        LOGIN,
        XOAUTH;

        public static final String getAuthName(AUTH_METHOD auth_method) {
            if (auth_method.equals(PLAIN)) {
                return "PLAIN";
            }
            if (auth_method.equals(CRAM_MD5)) {
                return "CRAM-MD5";
            }
            if (auth_method.equals(LOGIN)) {
                return "LOGIN";
            }
            if (auth_method.equals(XOAUTH)) {
                return "XOAUTH";
            }
            return null;
        }
    }

    public AuthenticatingSMTPClient() {
    }

    public AuthenticatingSMTPClient(String str) {
        super(str);
    }

    public AuthenticatingSMTPClient(String str, String str2) {
        super(str, false, str2);
    }

    public AuthenticatingSMTPClient(String str, boolean z10) {
        super(str, z10);
    }

    public AuthenticatingSMTPClient(String str, boolean z10, String str2) {
        super(str, z10, str2);
    }

    public AuthenticatingSMTPClient(boolean z10, SSLContext sSLContext) {
        super(z10, sSLContext);
    }

    private String _convertToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 <= 15) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i10));
        }
        return sb2.toString();
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) {
        if (!SMTPReply.isPositiveIntermediate(sendCommand(14, AUTH_METHOD.getAuthName(auth_method)))) {
            return false;
        }
        if (auth_method.equals(AUTH_METHOD.PLAIN)) {
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(("��" + str + "��" + str2).getBytes(getCharset()))));
        }
        if (!auth_method.equals(AUTH_METHOD.CRAM_MD5)) {
            if (auth_method.equals(AUTH_METHOD.LOGIN)) {
                if (SMTPReply.isPositiveIntermediate(sendCommand(Base64.encodeBase64StringUnChunked(str.getBytes(getCharset()))))) {
                    return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(str2.getBytes(getCharset()))));
                }
                return false;
            }
            if (auth_method.equals(AUTH_METHOD.XOAUTH)) {
                return SMTPReply.isPositiveIntermediate(sendCommand(Base64.encodeBase64StringUnChunked(str.getBytes(getCharset()))));
            }
            return false;
        }
        byte[] decodeBase64 = Base64.decodeBase64(getReplyString().substring(4).trim());
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(new SecretKeySpec(str2.getBytes(getCharset()), "HmacMD5"));
        byte[] bytes = _convertToHexString(mac.doFinal(decodeBase64)).getBytes(getCharset());
        byte[] bytes2 = str.getBytes(getCharset());
        byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        bArr[bytes2.length] = 32;
        System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
        return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(bArr)));
    }

    public int ehlo(String str) {
        return sendCommand(15, str);
    }

    public boolean elogin() {
        String hostName = getLocalAddress().getHostName();
        if (hostName == null) {
            return false;
        }
        return SMTPReply.isPositiveCompletion(ehlo(hostName));
    }

    public boolean elogin(String str) {
        return SMTPReply.isPositiveCompletion(ehlo(str));
    }

    public int[] getEnhancedReplyCode() {
        String substring = getReplyString().substring(4);
        String[] split = substring.substring(0, substring.indexOf(32)).split("\\.");
        int[] iArr = new int[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            iArr[i10] = Integer.parseInt(split[i10]);
        }
        return iArr;
    }
}
