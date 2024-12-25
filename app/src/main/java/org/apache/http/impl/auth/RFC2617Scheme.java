package org.apache.http.impl.auth;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.params.AuthPNames;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.CharsetUtils;

/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/auth/RFC2617Scheme.class */
public abstract class RFC2617Scheme extends AuthSchemeBase implements Serializable {
    private static final long serialVersionUID = -2845454858205884623L;
    private transient Charset credentialsCharset;
    private final Map<String, String> params;

    public RFC2617Scheme() {
        this(Consts.ASCII);
    }

    public RFC2617Scheme(Charset charset) {
        this.params = new HashMap();
        this.credentialsCharset = charset == null ? Consts.ASCII : charset;
    }

    @Deprecated
    public RFC2617Scheme(ChallengeState challengeState) {
        super(challengeState);
        this.params = new HashMap();
        this.credentialsCharset = Consts.ASCII;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Charset charset = CharsetUtils.get(objectInputStream.readUTF());
        this.credentialsCharset = charset;
        if (charset == null) {
            this.credentialsCharset = Consts.ASCII;
        }
        this.challengeState = (ChallengeState) objectInputStream.readObject();
    }

    private void readObjectNoData() {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.credentialsCharset.name());
        objectOutputStream.writeObject(this.challengeState);
    }

    public String getCredentialsCharset(HttpRequest httpRequest) {
        String str = (String) httpRequest.getParams().getParameter(AuthPNames.CREDENTIAL_CHARSET);
        String str2 = str;
        if (str == null) {
            str2 = getCredentialsCharset().name();
        }
        return str2;
    }

    public Charset getCredentialsCharset() {
        Charset charset = this.credentialsCharset;
        if (charset == null) {
            charset = Consts.ASCII;
        }
        return charset;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        if (str == null) {
            return null;
        }
        return this.params.get(str.toLowerCase(Locale.ROOT));
    }

    public Map<String, String> getParameters() {
        return this.params;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return getParameter("realm");
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        HeaderElement[] parseElements = BasicHeaderValueParser.INSTANCE.parseElements(charArrayBuffer, new ParserCursor(i10, charArrayBuffer.length()));
        this.params.clear();
        for (HeaderElement headerElement : parseElements) {
            this.params.put(headerElement.getName().toLowerCase(Locale.ROOT), headerElement.getValue());
        }
    }
}
