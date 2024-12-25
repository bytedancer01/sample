package org.apache.http.impl.client;

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/client/ClientParamsStack.class */
public class ClientParamsStack extends AbstractHttpParams {
    public final HttpParams applicationParams;
    public final HttpParams clientParams;
    public final HttpParams overrideParams;
    public final HttpParams requestParams;

    public ClientParamsStack(ClientParamsStack clientParamsStack) {
        this(clientParamsStack.getApplicationParams(), clientParamsStack.getClientParams(), clientParamsStack.getRequestParams(), clientParamsStack.getOverrideParams());
    }

    public ClientParamsStack(ClientParamsStack clientParamsStack, HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this(httpParams == null ? clientParamsStack.getApplicationParams() : httpParams, httpParams2 == null ? clientParamsStack.getClientParams() : httpParams2, httpParams3 == null ? clientParamsStack.getRequestParams() : httpParams3, httpParams4 == null ? clientParamsStack.getOverrideParams() : httpParams4);
    }

    public ClientParamsStack(HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this.applicationParams = httpParams;
        this.clientParams = httpParams2;
        this.requestParams = httpParams3;
        this.overrideParams = httpParams4;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        return this;
    }

    public final HttpParams getApplicationParams() {
        return this.applicationParams;
    }

    public final HttpParams getClientParams() {
        return this.clientParams;
    }

    public final HttpParams getOverrideParams() {
        return this.overrideParams;
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        Args.notNull(str, "Parameter name");
        HttpParams httpParams = this.overrideParams;
        Object parameter = httpParams != null ? httpParams.getParameter(str) : null;
        Object obj = parameter;
        if (parameter == null) {
            HttpParams httpParams2 = this.requestParams;
            obj = parameter;
            if (httpParams2 != null) {
                obj = httpParams2.getParameter(str);
            }
        }
        Object obj2 = obj;
        if (obj == null) {
            HttpParams httpParams3 = this.clientParams;
            obj2 = obj;
            if (httpParams3 != null) {
                obj2 = httpParams3.getParameter(str);
            }
        }
        Object obj3 = obj2;
        if (obj2 == null) {
            HttpParams httpParams4 = this.applicationParams;
            obj3 = obj2;
            if (httpParams4 != null) {
                obj3 = httpParams4.getParameter(str);
            }
        }
        return obj3;
    }

    public final HttpParams getRequestParams() {
        return this.requestParams;
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
