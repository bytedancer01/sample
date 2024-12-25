package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/LeadingOrTrailingHyphenLabel.class */
public final class LeadingOrTrailingHyphenLabel extends NonLdhLabel {
    public LeadingOrTrailingHyphenLabel(String str) {
        super(str);
    }

    public static boolean isLeadingOrTrailingHypenLabelInternal(String str) {
        if (str.isEmpty()) {
            return false;
        }
        return str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-';
    }
}
