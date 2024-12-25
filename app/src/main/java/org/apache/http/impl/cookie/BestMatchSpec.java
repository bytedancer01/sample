package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/BestMatchSpec.class */
public class BestMatchSpec extends DefaultCookieSpec {
    public BestMatchSpec() {
        this(null, false);
    }

    public BestMatchSpec(String[] strArr, boolean z10) {
        super(strArr, z10);
    }

    @Override // org.apache.http.impl.cookie.DefaultCookieSpec
    public String toString() {
        return "best-match";
    }
}
