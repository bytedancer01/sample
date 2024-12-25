package org.minidns.edns;

import java.io.DataOutputStream;
import org.minidns.edns.Edns;

/* loaded from: combined.jar:classes3.jar:org/minidns/edns/EdnsOption.class */
public abstract class EdnsOption {
    public final int optionCode;
    public final byte[] optionData;
    public final int optionLength;
    private String terminalOutputCache;
    private String toStringCache;

    /* renamed from: org.minidns.edns.EdnsOption$1 */
    /* loaded from: combined.jar:classes3.jar:org/minidns/edns/EdnsOption$1.class */
    public static /* synthetic */ class C71931 {
        public static final int[] $SwitchMap$org$minidns$edns$Edns$OptionCode;

        static {
            int[] iArr = new int[Edns.OptionCode.values().length];
            $SwitchMap$org$minidns$edns$Edns$OptionCode = iArr;
            try {
                iArr[Edns.OptionCode.NSID.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    public EdnsOption(int i10, byte[] bArr) {
        this.optionCode = i10;
        this.optionLength = bArr.length;
        this.optionData = bArr;
    }

    public EdnsOption(byte[] bArr) {
        this.optionCode = getOptionCode().asInt;
        this.optionLength = bArr.length;
        this.optionData = bArr;
    }

    public static EdnsOption parse(int i10, byte[] bArr) {
        return C71931.$SwitchMap$org$minidns$edns$Edns$OptionCode[Edns.OptionCode.from(i10).ordinal()] != 1 ? new UnknownEdnsOption(i10, bArr) : new Nsid(bArr);
    }

    public final String asTerminalOutput() {
        if (this.terminalOutputCache == null) {
            this.terminalOutputCache = asTerminalOutputInternal().toString();
        }
        return this.terminalOutputCache;
    }

    public abstract CharSequence asTerminalOutputInternal();

    public abstract Edns.OptionCode getOptionCode();

    public final String toString() {
        if (this.toStringCache == null) {
            this.toStringCache = toStringInternal().toString();
        }
        return this.toStringCache;
    }

    public abstract CharSequence toStringInternal();

    public final void writeToDos(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.optionCode);
        dataOutputStream.writeShort(this.optionLength);
        dataOutputStream.write(this.optionData);
    }
}
