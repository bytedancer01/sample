package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/NonLdhLabel.class */
public abstract class NonLdhLabel extends DnsLabel {
    public NonLdhLabel(String str) {
        super(str);
    }

    public static DnsLabel fromInternal(String str) {
        return UnderscoreLabel.isUnderscoreLabelInternal(str) ? new UnderscoreLabel(str) : LeadingOrTrailingHyphenLabel.isLeadingOrTrailingHypenLabelInternal(str) ? new LeadingOrTrailingHyphenLabel(str) : new OtherNonLdhLabel(str);
    }
}
