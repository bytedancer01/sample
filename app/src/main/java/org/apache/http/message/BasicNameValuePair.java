package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicNameValuePair.class */
public class BasicNameValuePair implements NameValuePair, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    public BasicNameValuePair(String str, String str2) {
        this.name = (String) Args.notNull(str, "Name");
        this.value = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
        if (!this.name.equals(basicNameValuePair.name) || !LangUtils.equals(this.value, basicNameValuePair.value)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.apache.http.NameValuePair
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.NameValuePair
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, this.name), this.value);
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb2 = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb2.append(this.name);
        sb2.append("=");
        sb2.append(this.value);
        return sb2.toString();
    }
}
