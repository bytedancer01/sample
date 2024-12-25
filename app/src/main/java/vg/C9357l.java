package vg;

import java.net.ProtocolException;
import p411xi.C9758c0;
import p411xi.C9761e;
import p411xi.InterfaceC9782z;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/l.class
 */
/* renamed from: vg.l */
/* loaded from: combined.jar:classes2.jar:vg/l.class */
public final class C9357l implements InterfaceC9782z {

    /* renamed from: b */
    public boolean f42863b;

    /* renamed from: c */
    public final int f42864c;

    /* renamed from: d */
    public final C9761e f42865d;

    public C9357l() {
        this(-1);
    }

    public C9357l(int i10) {
        this.f42865d = new C9761e();
        this.f42864c = i10;
    }

    @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42863b) {
            return;
        }
        this.f42863b = true;
        if (this.f42865d.size() >= this.f42864c) {
            return;
        }
        throw new ProtocolException("content-length promised " + this.f42864c + " bytes, but received " + this.f42865d.size());
    }

    /* renamed from: f */
    public long m39495f() {
        return this.f42865d.size();
    }

    @Override // p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(C9761e c9761e, long j10) {
        if (this.f42863b) {
            throw new IllegalStateException("closed");
        }
        C9183h.m38681a(c9761e.size(), 0L, j10);
        if (this.f42864c == -1 || this.f42865d.size() <= this.f42864c - j10) {
            this.f42865d.mo32031h(c9761e, j10);
            return;
        }
        throw new ProtocolException("exceeded content-length limit of " + this.f42864c + " bytes");
    }

    /* renamed from: l */
    public void m39496l(InterfaceC9782z interfaceC9782z) {
        C9761e clone = this.f42865d.clone();
        interfaceC9782z.mo32031h(clone, clone.size());
    }

    @Override // p411xi.InterfaceC9782z
    public C9758c0 timeout() {
        return C9758c0.f44503d;
    }
}
