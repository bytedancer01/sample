package p411xi;

import java.nio.ByteBuffer;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/u.class
 */
/* renamed from: xi.u */
/* loaded from: combined.jar:classes2.jar:xi/u.class */
public final class C9777u implements InterfaceC9762f {

    /* renamed from: b */
    @NotNull
    public final C9761e f44558b;

    /* renamed from: c */
    public boolean f44559c;

    /* renamed from: d */
    @NotNull
    public final InterfaceC9782z f44560d;

    public C9777u(@NotNull InterfaceC9782z interfaceC9782z) {
        C9367f.m39526e(interfaceC9782z, "sink");
        this.f44560d = interfaceC9782z;
        this.f44558b = new C9761e();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: G */
    public InterfaceC9762f mo41124G() {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.f44558b.size();
        if (size > 0) {
            this.f44560d.mo32031h(this.f44558b, size);
        }
        return this;
    }

    @Override // p411xi.InterfaceC9762f
    /* renamed from: I */
    public long mo41127I(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "source");
        long j10 = 0;
        while (true) {
            long mo22901x = interfaceC9756b0.mo22901x(this.f44558b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            if (mo22901x == -1) {
                return j10;
            }
            j10 += mo22901x;
            mo41131M();
        }
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: M */
    public InterfaceC9762f mo41131M() {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        long m41169p = this.f44558b.m41169p();
        if (m41169p > 0) {
            this.f44560d.mo32031h(this.f44558b, m41169p);
        }
        return this;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: Q */
    public InterfaceC9762f mo41136Q(@NotNull String str) {
        C9367f.m39526e(str, "string");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo41136Q(str);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: T */
    public InterfaceC9762f mo41140T(@NotNull String str, int i10, int i11) {
        C9367f.m39526e(str, "string");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo41140T(str, i10, i11);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9782z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th2;
        if (this.f44559c) {
            return;
        }
        Throwable th3 = null;
        try {
            if (this.f44558b.size() > 0) {
                InterfaceC9782z interfaceC9782z = this.f44560d;
                C9761e c9761e = this.f44558b;
                interfaceC9782z.mo32031h(c9761e, c9761e.size());
                th3 = null;
            }
        } catch (Throwable th4) {
            th3 = th4;
        }
        try {
            this.f44560d.close();
            th2 = th3;
        } catch (Throwable th5) {
            th2 = th3;
            if (th3 == null) {
                th2 = th5;
            }
        }
        this.f44559c = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: d0 */
    public InterfaceC9762f mo41155d0(long j10) {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo41155d0(j10);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f, p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f44558b.size() > 0) {
            InterfaceC9782z interfaceC9782z = this.f44560d;
            C9761e c9761e = this.f44558b;
            interfaceC9782z.mo32031h(c9761e, c9761e.size());
        }
        this.f44560d.flush();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public C9761e getBuffer() {
        return this.f44558b;
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "source");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo32031h(c9761e, j10);
        mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: i0 */
    public InterfaceC9762f mo41162i0(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "byteString");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo41162i0(c9764h);
        return mo41131M();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f44559c;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: s0 */
    public InterfaceC9762f mo41174s0(long j10) {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.mo41174s0(j10);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9782z
    @NotNull
    public C9758c0 timeout() {
        return this.f44560d.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.f44560d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) {
        C9367f.m39526e(byteBuffer, "source");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f44558b.write(byteBuffer);
        mo41131M();
        return write;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public InterfaceC9762f write(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "source");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.write(bArr);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public InterfaceC9762f write(@NotNull byte[] bArr, int i10, int i11) {
        C9367f.m39526e(bArr, "source");
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.write(bArr, i10, i11);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public InterfaceC9762f writeByte(int i10) {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.writeByte(i10);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public InterfaceC9762f writeInt(int i10) {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.writeInt(i10);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    public InterfaceC9762f writeShort(int i10) {
        if (!(!this.f44559c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f44558b.writeShort(i10);
        return mo41131M();
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: z */
    public C9761e mo41177z() {
        return this.f44558b;
    }
}
