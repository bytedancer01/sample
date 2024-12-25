package org.minidns.edns;

import java.nio.charset.StandardCharsets;
import org.minidns.edns.Edns;
import org.minidns.util.Hex;

/* loaded from: combined.jar:classes3.jar:org/minidns/edns/Nsid.class */
public class Nsid extends EdnsOption {
    public static final Nsid REQUEST = new Nsid();

    private Nsid() {
        this(new byte[0]);
    }

    public Nsid(byte[] bArr) {
        super(bArr);
    }

    @Override // org.minidns.edns.EdnsOption
    public CharSequence asTerminalOutputInternal() {
        return Hex.from(this.optionData);
    }

    @Override // org.minidns.edns.EdnsOption
    public Edns.OptionCode getOptionCode() {
        return Edns.OptionCode.NSID;
    }

    @Override // org.minidns.edns.EdnsOption
    public CharSequence toStringInternal() {
        return (Edns.OptionCode.NSID + ": ") + new String(this.optionData, StandardCharsets.US_ASCII);
    }
}
