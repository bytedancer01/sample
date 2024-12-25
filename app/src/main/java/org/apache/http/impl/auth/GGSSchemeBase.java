package org.apache.http.impl.auth;

import java.net.InetAddress;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/GGSSchemeBase.class */
public abstract class GGSSchemeBase extends AuthSchemeBase {
    private final Base64 base64codec;
    private final Log log;
    private State state;
    private final boolean stripPort;
    private byte[] token;
    private final boolean useCanonicalHostname;

    /* renamed from: org.apache.http.impl.auth.GGSSchemeBase$1 */
    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/GGSSchemeBase$1.class */
    public static /* synthetic */ class C70391 {
        public static final int[] $SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.apache.http.impl.auth.GGSSchemeBase$State[] r0 = org.apache.http.impl.auth.GGSSchemeBase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.apache.http.impl.auth.GGSSchemeBase.C70391.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State = r0
                r0 = r4
                org.apache.http.impl.auth.GGSSchemeBase$State r1 = org.apache.http.impl.auth.GGSSchemeBase.State.UNINITIATED     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = org.apache.http.impl.auth.GGSSchemeBase.C70391.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                org.apache.http.impl.auth.GGSSchemeBase$State r1 = org.apache.http.impl.auth.GGSSchemeBase.State.FAILED     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = org.apache.http.impl.auth.GGSSchemeBase.C70391.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                org.apache.http.impl.auth.GGSSchemeBase$State r1 = org.apache.http.impl.auth.GGSSchemeBase.State.CHALLENGE_RECEIVED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = org.apache.http.impl.auth.GGSSchemeBase.C70391.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                org.apache.http.impl.auth.GGSSchemeBase$State r1 = org.apache.http.impl.auth.GGSSchemeBase.State.TOKEN_GENERATED     // Catch: java.lang.NoSuchFieldError -> L42
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
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.GGSSchemeBase.C70391.m45321clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/GGSSchemeBase$State.class */
    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    public GGSSchemeBase() {
        this(true, true);
    }

    public GGSSchemeBase(boolean z10) {
        this(z10, true);
    }

    public GGSSchemeBase(boolean z10, boolean z11) {
        this.log = LogFactory.getLog(getClass());
        this.base64codec = new Base64(0);
        this.stripPort = z10;
        this.useCanonicalHostname = z11;
        this.state = State.UNINITIATED;
    }

    private String resolveCanonicalHostname(String str) {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        return byName.getHostAddress().contentEquals(canonicalHostName) ? str : canonicalHostName;
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r0 == null) goto L20;
     */
    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.Header authenticate(org.apache.http.auth.Credentials r7, org.apache.http.HttpRequest r8, org.apache.http.protocol.HttpContext r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.GGSSchemeBase.authenticate(org.apache.http.auth.Credentials, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.Header");
    }

    public GSSContext createGSSContext(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) {
        GSSContext createContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        createContext.requestMutualAuth(true);
        return createContext;
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str) {
        return generateGSSToken(bArr, oid, str, null);
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str, Credentials credentials) {
        GSSManager manager = getManager();
        GSSContext createGSSContext = createGSSContext(manager, oid, manager.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE), credentials instanceof KerberosCredentials ? ((KerberosCredentials) credentials).getGSSCredential() : null);
        return bArr != null ? createGSSContext.initSecContext(bArr, 0, bArr.length) : createGSSContext.initSecContext(new byte[0], 0, 0);
    }

    @Deprecated
    public byte[] generateToken(byte[] bArr, String str) {
        return null;
    }

    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) {
        return generateToken(bArr, str);
    }

    public GSSManager getManager() {
        return GSSManager.getInstance();
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        State state = this.state;
        return state == State.TOKEN_GENERATED || state == State.FAILED;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        State state;
        String substringTrimmed = charArrayBuffer.substringTrimmed(i10, i11);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Received challenge '" + substringTrimmed + "' from the auth server");
        }
        if (this.state == State.UNINITIATED) {
            this.token = Base64.decodeBase64(substringTrimmed.getBytes());
            state = State.CHALLENGE_RECEIVED;
        } else {
            this.log.debug("Authentication already attempted");
            state = State.FAILED;
        }
        this.state = state;
    }
}
