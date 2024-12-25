package org.apache.http.impl.auth;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/NegotiateScheme.class */
public class NegotiateScheme extends GGSSchemeBase {
    private static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
    private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
    private final Log log;
    private final SpnegoTokenGenerator spengoGenerator;

    public NegotiateScheme() {
        this(null, false);
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator, boolean z10) {
        super(z10);
        this.log = LogFactory.getLog(getClass());
        this.spengoGenerator = spnegoTokenGenerator;
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return super.authenticate(credentials, httpRequest, httpContext);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str) {
        return super.generateToken(bArr, str);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) {
        boolean z10;
        byte[] bArr2;
        try {
            bArr2 = generateGSSToken(bArr, new Oid(SPNEGO_OID), str, credentials);
            z10 = false;
        } catch (GSSException e10) {
            if (e10.getMajor() != 2) {
                throw e10;
            }
            this.log.debug("GSSException BAD_MECH, retry with Kerberos MECH");
            z10 = true;
            bArr2 = bArr;
        }
        byte[] bArr3 = bArr2;
        if (z10) {
            this.log.debug("Using Kerberos MECH 1.2.840.113554.1.2.2");
            byte[] generateGSSToken = generateGSSToken(bArr2, new Oid(KERBEROS_OID), str, credentials);
            bArr3 = generateGSSToken;
            if (generateGSSToken != null) {
                SpnegoTokenGenerator spnegoTokenGenerator = this.spengoGenerator;
                bArr3 = generateGSSToken;
                if (spnegoTokenGenerator != null) {
                    try {
                        bArr3 = spnegoTokenGenerator.generateSpnegoDERObject(generateGSSToken);
                    } catch (IOException e11) {
                        this.log.error(e11.getMessage(), e11);
                        bArr3 = generateGSSToken;
                    }
                }
            }
        }
        return bArr3;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        Args.notNull(str, "Parameter name");
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "Negotiate";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }
}
