package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicHttpResponse.class */
public class BasicHttpResponse extends AbstractHttpMessage implements HttpResponse {
    private int code;
    private HttpEntity entity;
    private Locale locale;
    private final ReasonPhraseCatalog reasonCatalog;
    private String reasonPhrase;
    private StatusLine statusline;
    private ProtocolVersion ver;

    public BasicHttpResponse(ProtocolVersion protocolVersion, int i10, String str) {
        Args.notNegative(i10, "Status code");
        this.statusline = null;
        this.ver = protocolVersion;
        this.code = i10;
        this.reasonPhrase = str;
        this.reasonCatalog = null;
        this.locale = null;
    }

    public BasicHttpResponse(StatusLine statusLine) {
        this.statusline = (StatusLine) Args.notNull(statusLine, "Status line");
        this.ver = statusLine.getProtocolVersion();
        this.code = statusLine.getStatusCode();
        this.reasonPhrase = statusLine.getReasonPhrase();
        this.reasonCatalog = null;
        this.locale = null;
    }

    public BasicHttpResponse(StatusLine statusLine, ReasonPhraseCatalog reasonPhraseCatalog, Locale locale) {
        this.statusline = (StatusLine) Args.notNull(statusLine, "Status line");
        this.ver = statusLine.getProtocolVersion();
        this.code = statusLine.getStatusCode();
        this.reasonPhrase = statusLine.getReasonPhrase();
        this.reasonCatalog = reasonPhraseCatalog;
        this.locale = locale;
    }

    @Override // org.apache.http.HttpResponse
    public HttpEntity getEntity() {
        return this.entity;
    }

    @Override // org.apache.http.HttpResponse
    public Locale getLocale() {
        return this.locale;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        return this.ver;
    }

    public String getReason(int i10) {
        String str;
        ReasonPhraseCatalog reasonPhraseCatalog = this.reasonCatalog;
        if (reasonPhraseCatalog != null) {
            Locale locale = this.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            str = reasonPhraseCatalog.getReason(i10, locale);
        } else {
            str = null;
        }
        return str;
    }

    @Override // org.apache.http.HttpResponse
    public StatusLine getStatusLine() {
        if (this.statusline == null) {
            ProtocolVersion protocolVersion = this.ver;
            if (protocolVersion == null) {
                protocolVersion = HttpVersion.HTTP_1_1;
            }
            int i10 = this.code;
            String str = this.reasonPhrase;
            if (str == null) {
                str = getReason(i10);
            }
            this.statusline = new BasicStatusLine(protocolVersion, i10, str);
        }
        return this.statusline;
    }

    @Override // org.apache.http.HttpResponse
    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }

    @Override // org.apache.http.HttpResponse
    public void setLocale(Locale locale) {
        this.locale = (Locale) Args.notNull(locale, "Locale");
        this.statusline = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setReasonPhrase(String str) {
        this.statusline = null;
        this.reasonPhrase = str;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusCode(int i10) {
        Args.notNegative(i10, "Status code");
        this.statusline = null;
        this.code = i10;
        this.reasonPhrase = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i10) {
        Args.notNegative(i10, "Status code");
        this.statusline = null;
        this.ver = protocolVersion;
        this.code = i10;
        this.reasonPhrase = null;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(ProtocolVersion protocolVersion, int i10, String str) {
        Args.notNegative(i10, "Status code");
        this.statusline = null;
        this.ver = protocolVersion;
        this.code = i10;
        this.reasonPhrase = str;
    }

    @Override // org.apache.http.HttpResponse
    public void setStatusLine(StatusLine statusLine) {
        this.statusline = (StatusLine) Args.notNull(statusLine, "Status line");
        this.ver = statusLine.getProtocolVersion();
        this.code = statusLine.getStatusCode();
        this.reasonPhrase = statusLine.getReasonPhrase();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getStatusLine());
        sb2.append(' ');
        sb2.append(this.headergroup);
        if (this.entity != null) {
            sb2.append(' ');
            sb2.append(this.entity);
        }
        return sb2.toString();
    }
}
