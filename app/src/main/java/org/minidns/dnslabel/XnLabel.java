package org.minidns.dnslabel;

import java.util.Locale;
import org.minidns.idna.MiniDnsIdna;

/* loaded from: combined.jar:classes3.jar:org/minidns/dnslabel/XnLabel.class */
public abstract class XnLabel extends ReservedLdhLabel {
    public static final boolean $assertionsDisabled = false;

    public XnLabel(String str) {
        super(str);
    }

    public static LdhLabel fromInternal(String str) {
        return str.equals(MiniDnsIdna.toUnicode(str)) ? new FakeALabel(str) : new ALabel(str);
    }

    public static boolean isXnLabel(String str) {
        if (LdhLabel.isLdhLabel(str)) {
            return isXnLabelInternal(str);
        }
        return false;
    }

    public static boolean isXnLabelInternal(String str) {
        return str.substring(0, 2).toLowerCase(Locale.US).equals("xn");
    }
}
