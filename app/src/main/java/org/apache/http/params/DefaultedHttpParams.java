package org.apache.http.params;

import java.util.HashSet;
import java.util.Set;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/params/DefaultedHttpParams.class */
public final class DefaultedHttpParams extends AbstractHttpParams {
    private final HttpParams defaults;
    private final HttpParams local;

    public DefaultedHttpParams(HttpParams httpParams, HttpParams httpParams2) {
        this.local = (HttpParams) Args.notNull(httpParams, "Local HTTP parameters");
        this.defaults = httpParams2;
    }

    private Set<String> getNames(HttpParams httpParams) {
        if (httpParams instanceof HttpParamsNames) {
            return ((HttpParamsNames) httpParams).getNames();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        return new DefaultedHttpParams(this.local.copy(), this.defaults);
    }

    public Set<String> getDefaultNames() {
        return new HashSet(getNames(this.defaults));
    }

    public HttpParams getDefaults() {
        return this.defaults;
    }

    public Set<String> getLocalNames() {
        return new HashSet(getNames(this.local));
    }

    @Override // org.apache.http.params.AbstractHttpParams, org.apache.http.params.HttpParamsNames
    public Set<String> getNames() {
        HashSet hashSet = new HashSet(getNames(this.defaults));
        hashSet.addAll(getNames(this.local));
        return hashSet;
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        Object parameter = this.local.getParameter(str);
        Object obj = parameter;
        if (parameter == null) {
            HttpParams httpParams = this.defaults;
            obj = parameter;
            if (httpParams != null) {
                obj = httpParams.getParameter(str);
            }
        }
        return obj;
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        return this.local.removeParameter(str);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        return this.local.setParameter(str, obj);
    }
}
