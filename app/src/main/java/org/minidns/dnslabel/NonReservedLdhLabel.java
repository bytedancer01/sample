package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/NonReservedLdhLabel.class */
public final class NonReservedLdhLabel extends LdhLabel {
    public static final boolean $assertionsDisabled = false;

    public NonReservedLdhLabel(String str) {
        super(str);
    }

    public static boolean isNonReservedLdhLabel(String str) {
        if (LdhLabel.isLdhLabel(str)) {
            return isNonReservedLdhLabelInternal(str);
        }
        return false;
    }

    public static boolean isNonReservedLdhLabelInternal(String str) {
        return !ReservedLdhLabel.isReservedLdhLabelInternal(str);
    }
}
