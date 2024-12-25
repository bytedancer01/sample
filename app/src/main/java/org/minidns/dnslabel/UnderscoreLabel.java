package org.minidns.dnslabel;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/UnderscoreLabel.class */
public final class UnderscoreLabel extends NonLdhLabel {
    public UnderscoreLabel(String str) {
        super(str);
    }

    public static boolean isUnderscoreLabelInternal(String str) {
        boolean z10 = false;
        if (str.charAt(0) == '_') {
            z10 = true;
        }
        return z10;
    }
}
