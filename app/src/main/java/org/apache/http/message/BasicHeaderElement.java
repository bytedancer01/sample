package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* loaded from: combined.jar:classes3.jar:org/apache/http/message/BasicHeaderElement.class */
public class BasicHeaderElement implements HeaderElement, Cloneable {
    private final String name;
    private final NameValuePair[] parameters;
    private final String value;

    public BasicHeaderElement(String str, String str2) {
        this(str, str2, null);
    }

    public BasicHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        this.name = (String) Args.notNull(str, "Name");
        this.value = str2;
        if (nameValuePairArr != null) {
            this.parameters = nameValuePairArr;
        } else {
            this.parameters = new NameValuePair[0];
        }
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderElement)) {
            return false;
        }
        BasicHeaderElement basicHeaderElement = (BasicHeaderElement) obj;
        if (!this.name.equals(basicHeaderElement.name) || !LangUtils.equals(this.value, basicHeaderElement.value) || !LangUtils.equals((Object[]) this.parameters, (Object[]) basicHeaderElement.parameters)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.apache.http.HeaderElement
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair getParameter(int i10) {
        return this.parameters[i10];
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair getParameterByName(String str) {
        NameValuePair nameValuePair;
        Args.notNull(str, "Name");
        NameValuePair[] nameValuePairArr = this.parameters;
        int length = nameValuePairArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                nameValuePair = null;
                break;
            }
            NameValuePair nameValuePair2 = nameValuePairArr[i10];
            if (nameValuePair2.getName().equalsIgnoreCase(str)) {
                nameValuePair = nameValuePair2;
                break;
            }
            i10++;
        }
        return nameValuePair;
    }

    @Override // org.apache.http.HeaderElement
    public int getParameterCount() {
        return this.parameters.length;
    }

    @Override // org.apache.http.HeaderElement
    public NameValuePair[] getParameters() {
        return (NameValuePair[]) this.parameters.clone();
    }

    @Override // org.apache.http.HeaderElement
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.name), this.value);
        for (NameValuePair nameValuePair : this.parameters) {
            hashCode = LangUtils.hashCode(hashCode, nameValuePair);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        if (this.value != null) {
            sb2.append("=");
            sb2.append(this.value);
        }
        for (NameValuePair nameValuePair : this.parameters) {
            sb2.append("; ");
            sb2.append(nameValuePair);
        }
        return sb2.toString();
    }
}
