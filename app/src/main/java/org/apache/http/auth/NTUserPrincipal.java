package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/NTUserPrincipal.class
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/NTUserPrincipal.class */
public class NTUserPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -6870169797924406894L;
    private final String domain;
    private final String ntname;
    private final String username;

    public NTUserPrincipal(String str, String str2) {
        Args.notNull(str2, "User name");
        this.username = str2;
        this.domain = str != null ? str.toUpperCase(Locale.ROOT) : null;
        String str3 = this.domain;
        if (str3 == null || str3.isEmpty()) {
            this.ntname = str2;
            return;
        }
        this.ntname = this.domain + '\\' + str2;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NTUserPrincipal)) {
            return false;
        }
        NTUserPrincipal nTUserPrincipal = (NTUserPrincipal) obj;
        return LangUtils.equals(this.username, nTUserPrincipal.username) && LangUtils.equals(this.domain, nTUserPrincipal.domain);
    }

    public String getDomain() {
        return this.domain;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.ntname;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, this.username), this.domain);
    }

    @Override // java.security.Principal
    public String toString() {
        return this.ntname;
    }
}
