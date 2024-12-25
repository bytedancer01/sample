package org.minidns.dnslabel;

import org.minidns.idna.MiniDnsIdna;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/ALabel.class */
public final class ALabel extends XnLabel {
    public ALabel(String str) {
        super(str);
    }

    @Override // org.minidns.dnslabel.DnsLabel
    public String getInternationalizedRepresentationInternal() {
        return MiniDnsIdna.toUnicode(this.label);
    }
}
