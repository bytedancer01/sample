package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/ReservedLdhLabel.class */
public class ReservedLdhLabel extends LdhLabel {
    public static final boolean $assertionsDisabled = false;

    public ReservedLdhLabel(String str) {
        super(str);
    }

    public static boolean isReservedLdhLabel(String str) {
        if (LdhLabel.isLdhLabel(str)) {
            return isReservedLdhLabelInternal(str);
        }
        return false;
    }

    public static boolean isReservedLdhLabelInternal(String str) {
        return str.length() >= 4 && str.charAt(2) == '-' && str.charAt(3) == '-';
    }
}
