package org.apache.http.params;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/params/SyncBasicHttpParams.class */
public class SyncBasicHttpParams extends BasicHttpParams {
    private static final long serialVersionUID = 5387834869062660642L;

    @Override // org.apache.http.params.BasicHttpParams
    public void clear() {
        synchronized (this) {
            super.clear();
        }
    }

    @Override // org.apache.http.params.BasicHttpParams
    public Object clone() {
        Object clone;
        synchronized (this) {
            clone = super.clone();
        }
        return clone;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        Object parameter;
        synchronized (this) {
            parameter = super.getParameter(str);
        }
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public boolean isParameterSet(String str) {
        boolean isParameterSet;
        synchronized (this) {
            isParameterSet = super.isParameterSet(str);
        }
        return isParameterSet;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public boolean isParameterSetLocally(String str) {
        boolean isParameterSetLocally;
        synchronized (this) {
            isParameterSetLocally = super.isParameterSetLocally(str);
        }
        return isParameterSetLocally;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        boolean removeParameter;
        synchronized (this) {
            removeParameter = super.removeParameter(str);
        }
        return removeParameter;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        HttpParams parameter;
        synchronized (this) {
            parameter = super.setParameter(str, obj);
        }
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public void setParameters(String[] strArr, Object obj) {
        synchronized (this) {
            super.setParameters(strArr, obj);
        }
    }
}
