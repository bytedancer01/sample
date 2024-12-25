package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/LdhLabel.class */
public abstract class LdhLabel extends DnsLabel {
    public static final boolean $assertionsDisabled = false;

    public LdhLabel(String str) {
        super(str);
    }

    public static LdhLabel fromInternal(String str) {
        return ReservedLdhLabel.isReservedLdhLabel(str) ? XnLabel.isXnLabelInternal(str) ? XnLabel.fromInternal(str) : new ReservedLdhLabel(str) : new NonReservedLdhLabel(str);
    }

    public static boolean isLdhLabel(String str) {
        if (str.isEmpty() || LeadingOrTrailingHyphenLabel.isLeadingOrTrailingHypenLabelInternal(str)) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
