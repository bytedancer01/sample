package org.minidns.edns;

import org.minidns.edns.Edns;
import org.minidns.util.Hex;

/* loaded from: combined.jar:classes3.jar:org/minidns/edns/UnknownEdnsOption.class */
public class UnknownEdnsOption extends EdnsOption {
    public UnknownEdnsOption(int i10, byte[] bArr) {
        super(i10, bArr);
    }

    @Override // org.minidns.edns.EdnsOption
    public CharSequence asTerminalOutputInternal() {
        return Hex.from(this.optionData);
    }

    @Override // org.minidns.edns.EdnsOption
    public Edns.OptionCode getOptionCode() {
        return Edns.OptionCode.UNKNOWN;
    }

    @Override // org.minidns.edns.EdnsOption
    public CharSequence toStringInternal() {
        return asTerminalOutputInternal();
    }
}
