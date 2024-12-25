package org.apache.commons.net.pop3;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.net.util.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client.class */
public class ExtendedPOP3Client extends POP3SClient {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client$1.class
     */
    /* renamed from: org.apache.commons.net.pop3.ExtendedPOP3Client$1 */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client$1.class */
    public static /* synthetic */ class C70251 {

        /* renamed from: $SwitchMap$org$apache$commons$net$pop3$ExtendedPOP3Client$AUTH_METHOD */
        public static final int[] f36133x62a82643;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.commons.net.pop3.ExtendedPOP3Client.C70251.f36133x62a82643 = r0
                r0 = r4
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.C70251.f36133x62a82643     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.pop3.ExtendedPOP3Client.C70251.m45255clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client$AUTH_METHOD.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/ExtendedPOP3Client$AUTH_METHOD.class */
    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5");

        private final String methodName;

        AUTH_METHOD(String str) {
            this.methodName = str;
        }

        public final String getAuthName() {
            return this.methodName;
        }
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
        boolean z10 = false;
        if (sendCommand(13, auth_method.getAuthName()) != 2) {
            return false;
        }
        int i10 = C70251.f36133x62a82643[auth_method.ordinal()];
        if (i10 == 1) {
            if (sendCommand(new String(Base64.encodeBase64(("��" + str + "��" + str2).getBytes(getCharset())), getCharset())) == 0) {
                z10 = true;
            }
            return z10;
        }
        if (i10 != 2) {
            return false;
        }
        byte[] decodeBase64 = Base64.decodeBase64(getReplyString().substring(2).trim());
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(new SecretKeySpec(str2.getBytes(getCharset()), "HmacMD5"));
        byte[] bytes = _convertToHexString(mac.doFinal(decodeBase64)).getBytes(getCharset());
        byte[] bytes2 = str.getBytes(getCharset());
        byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        bArr[bytes2.length] = 32;
        System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
        boolean z11 = false;
        if (sendCommand(Base64.encodeBase64StringUnChunked(bArr)) == 0) {
            z11 = true;
        }
        return z11;
    }
}
