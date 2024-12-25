package org.pcap4j.core;

import org.pcap4j.core.NativeMappings;
import org.pcap4j.packet.Packet;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/core/BpfProgram.class */
public final class BpfProgram {
    private final String expression;
    private volatile boolean freed = false;
    private final Object lock = new Object();
    private final NativeMappings.bpf_program program;

    /* loaded from: combined.jar:classes3.jar:org/pcap4j/core/BpfProgram$BpfCompileMode.class */
    public enum BpfCompileMode {
        OPTIMIZE(1),
        NONOPTIMIZE(0);

        private final int value;

        BpfCompileMode(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public BpfProgram(NativeMappings.bpf_program bpf_programVar, String str) {
        this.program = bpf_programVar;
        this.expression = str;
    }

    public boolean applyFilter(Packet packet) {
        return applyFilter(packet.getRawData());
    }

    public boolean applyFilter(byte[] bArr) {
        return applyFilter(bArr, bArr.length, bArr.length);
    }

    public boolean applyFilter(byte[] bArr, int i10, int i11) {
        synchronized (this.lock) {
            boolean z10 = false;
            if (this.freed) {
                return false;
            }
            NativeMappings.bpf_program bpf_programVar = this.program;
            if (bpf_programVar.bf_insns == null) {
                bpf_programVar.read();
            }
            if (NativeMappings.bpf_filter(this.program.bf_insns, bArr, i10, i11) != 0) {
                z10 = true;
            }
            return z10;
        }
    }

    public void free() {
        if (this.freed) {
            return;
        }
        synchronized (this.lock) {
            if (this.freed) {
                return;
            }
            NativeMappings.pcap_freecode(this.program);
            this.freed = true;
        }
    }

    public String getExpression() {
        return this.expression;
    }

    public NativeMappings.bpf_program getProgram() {
        return this.program;
    }

    public boolean isFreed() {
        return this.freed;
    }
}
