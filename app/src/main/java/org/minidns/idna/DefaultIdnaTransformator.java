package org.minidns.idna;

import java.net.IDN;
import org.minidns.dnsname.DnsName;

/* loaded from: combined.jar:classes3.jar:org/minidns/idna/DefaultIdnaTransformator.class */
public class DefaultIdnaTransformator implements IdnaTransformator {
    @Override // org.minidns.idna.IdnaTransformator
    public String toASCII(String str) {
        DnsName dnsName = DnsName.ROOT;
        return dnsName.ace.equals(str) ? dnsName.ace : IDN.toASCII(str);
    }

    @Override // org.minidns.idna.IdnaTransformator
    public String toUnicode(String str) {
        return IDN.toUnicode(str);
    }
}
