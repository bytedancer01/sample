package org.apache.commons.net.imap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.util.Base64;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient.class */
public class AuthenticatingIMAPClient extends IMAPSClient {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient$1.class
     */
    /* renamed from: org.apache.commons.net.imap.AuthenticatingIMAPClient$1 */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient$1.class */
    public static /* synthetic */ class C70231 {

        /* renamed from: $SwitchMap$org$apache$commons$net$imap$AuthenticatingIMAPClient$AUTH_METHOD */
        public static final int[] f36121xf15dac1c;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.commons.net.imap.AuthenticatingIMAPClient.C70231.f36121xf15dac1c = r0
                r0 = r4
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.PLAIN     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.C70231.f36121xf15dac1c     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.CRAM_MD5     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.C70231.f36121xf15dac1c     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.LOGIN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.C70231.f36121xf15dac1c     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.XOAUTH     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.imap.AuthenticatingIMAPClient.C70231.m45244clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient$AUTH_METHOD.class
     */
    /* loaded from: combined.jar:classes2.jar:org/apache/commons/net/imap/AuthenticatingIMAPClient$AUTH_METHOD.class */
    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH");

        private final String authName;

        AUTH_METHOD(String str) {
            this.authName = str;
        }

        public final String getAuthName() {
            return this.authName;
        }
    }

    public AuthenticatingIMAPClient() {
        this("TLS", false);
    }

    public AuthenticatingIMAPClient(String str) {
        this(str, false);
    }

    public AuthenticatingIMAPClient(String str, boolean z10) {
        this(str, z10, null);
    }

    public AuthenticatingIMAPClient(String str, boolean z10, SSLContext sSLContext) {
        super(str, z10, sSLContext);
    }

    public AuthenticatingIMAPClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public AuthenticatingIMAPClient(boolean z10) {
        this("TLS", z10);
    }

    public AuthenticatingIMAPClient(boolean z10, SSLContext sSLContext) {
        this("TLS", z10, sSLContext);
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
        if (!IMAPReply.isContinuation(sendCommand(IMAPCommand.AUTHENTICATE, auth_method.getAuthName()))) {
            return false;
        }
        int i10 = C70231.f36121xf15dac1c[auth_method.ordinal()];
        if (i10 == 1) {
            int sendData = sendData(Base64.encodeBase64StringUnChunked(("��" + str + "��" + str2).getBytes(getCharset())));
            if (sendData == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            if (sendData == 0) {
                z10 = true;
            }
            return z10;
        }
        if (i10 == 2) {
            byte[] decodeBase64 = Base64.decodeBase64(getReplyString().substring(2).trim());
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(new SecretKeySpec(str2.getBytes(getCharset()), "HmacMD5"));
            byte[] bytes = _convertToHexString(mac.doFinal(decodeBase64)).getBytes(getCharset());
            byte[] bytes2 = str.getBytes(getCharset());
            byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
            System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
            bArr[bytes2.length] = 32;
            System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
            int sendData2 = sendData(Base64.encodeBase64StringUnChunked(bArr));
            if (sendData2 == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            boolean z11 = false;
            if (sendData2 == 0) {
                z11 = true;
            }
            return z11;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return false;
            }
            int sendData3 = sendData(str);
            if (sendData3 == 0) {
                setState(IMAP.IMAPState.AUTH_STATE);
            }
            boolean z12 = false;
            if (sendData3 == 0) {
                z12 = true;
            }
            return z12;
        }
        if (sendData(Base64.encodeBase64StringUnChunked(str.getBytes(getCharset()))) != 3) {
            return false;
        }
        int sendData4 = sendData(Base64.encodeBase64StringUnChunked(str2.getBytes(getCharset())));
        if (sendData4 == 0) {
            setState(IMAP.IMAPState.AUTH_STATE);
        }
        boolean z13 = false;
        if (sendData4 == 0) {
            z13 = true;
        }
        return z13;
    }

    public boolean authenticate(AUTH_METHOD auth_method, String str, String str2) {
        return auth(auth_method, str, str2);
    }
}
