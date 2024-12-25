package p411xi;

import ci.C1115a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p430yi.C10022a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/v.class
 */
/* renamed from: xi.v */
/* loaded from: combined.jar:classes2.jar:xi/v.class */
public final class C9778v implements InterfaceC9763g {

    /* renamed from: b */
    @NotNull
    public final C9761e f44561b;

    /* renamed from: c */
    public boolean f44562c;

    /* renamed from: d */
    @NotNull
    public final InterfaceC9756b0 f44563d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/v$a.class
     */
    /* renamed from: xi.v$a */
    /* loaded from: combined.jar:classes2.jar:xi/v$a.class */
    public static final class a extends InputStream {

        /* renamed from: b */
        public final C9778v f44564b;

        public a(C9778v c9778v) {
            this.f44564b = c9778v;
        }

        @Override // java.io.InputStream
        public int available() {
            C9778v c9778v = this.f44564b;
            if (c9778v.f44562c) {
                throw new IOException("closed");
            }
            return (int) Math.min(c9778v.f44561b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f44564b.close();
        }

        @Override // java.io.InputStream
        public int read() {
            C9778v c9778v = this.f44564b;
            if (c9778v.f44562c) {
                throw new IOException("closed");
            }
            if (c9778v.f44561b.size() == 0) {
                C9778v c9778v2 = this.f44564b;
                if (c9778v2.f44563d.mo22901x(c9778v2.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                    return -1;
                }
            }
            return this.f44564b.f44561b.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i10, int i11) {
            C9367f.m39526e(bArr, "data");
            if (this.f44564b.f44562c) {
                throw new IOException("closed");
            }
            C9757c.m41081b(bArr.length, i10, i11);
            if (this.f44564b.f44561b.size() == 0) {
                C9778v c9778v = this.f44564b;
                if (c9778v.f44563d.mo22901x(c9778v.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                    return -1;
                }
            }
            return this.f44564b.f44561b.read(bArr, i10, i11);
        }

        @NotNull
        public String toString() {
            return this.f44564b + ".inputStream()";
        }
    }

    public C9778v(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "source");
        this.f44563d = interfaceC9756b0;
        this.f44561b = new C9761e();
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: V */
    public String mo41143V() {
        return mo41166m(Long.MAX_VALUE);
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: W */
    public byte[] mo41145W(long j10) {
        mo41151b0(j10);
        return this.f44561b.mo41145W(j10);
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: b0 */
    public void mo41151b0(long j10) {
        if (!mo41175u(j10)) {
            throw new EOFException();
        }
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: c0 */
    public long mo41153c0(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "targetBytes");
        return m41263o(c9764h, 0L);
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f44562c) {
            return;
        }
        this.f44562c = true;
        this.f44563d.close();
        this.f44561b.m41165l();
    }

    /* renamed from: f */
    public long m41261f(byte b10) {
        return m41262l(b10, 0L, Long.MAX_VALUE);
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: g0 */
    public C9764h mo41159g0(long j10) {
        mo41151b0(j10);
        return this.f44561b.mo41159g0(j10);
    }

    @Override // p411xi.InterfaceC9763g, p411xi.InterfaceC9762f
    @NotNull
    public C9761e getBuffer() {
        return this.f44561b;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    public InputStream inputStream() {
        return new a(this);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f44562c;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: k */
    public void mo41163k(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        try {
            mo41151b0(j10);
            this.f44561b.mo41163k(c9761e, j10);
        } catch (EOFException e10) {
            c9761e.mo41127I(this.f44561b);
            throw e10;
        }
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: k0 */
    public boolean mo41164k0() {
        boolean z10 = true;
        if (!(!this.f44562c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!this.f44561b.mo41164k0() || this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) != -1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: l */
    public long m41262l(byte b10, long j10, long j11) {
        long j12;
        boolean z10 = true;
        if (!(!this.f44562c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j10 || j11 < j10) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (true) {
            j12 = -1;
            if (j10 >= j11) {
                break;
            }
            j12 = this.f44561b.m41120C0(b10, j10, j11);
            if (j12 != -1) {
                break;
            }
            long size = this.f44561b.size();
            j12 = -1;
            if (size >= j11) {
                break;
            }
            if (this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                j12 = -1;
                break;
            }
            j10 = Math.max(j10, size);
        }
        return j12;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: m */
    public String mo41166m(long j10) {
        String m42167b;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        byte b10 = (byte) 10;
        long m41262l = m41262l(b10, 0L, j11);
        if (m41262l != -1) {
            m42167b = C10022a.m42167b(this.f44561b, m41262l);
        } else {
            if (j11 >= Long.MAX_VALUE || !mo41175u(j11) || this.f44561b.m41119B0(j11 - 1) != ((byte) 13) || !mo41175u(1 + j11) || this.f44561b.m41119B0(j11) != b10) {
                C9761e c9761e = new C9761e();
                C9761e c9761e2 = this.f44561b;
                c9761e2.m41170q0(c9761e, 0L, Math.min(32, c9761e2.size()));
                throw new EOFException("\\n not found: limit=" + Math.min(this.f44561b.size(), j10) + " content=" + c9761e.m41129K0().mo41198p() + "…");
            }
            m42167b = C10022a.m42167b(this.f44561b, j11);
        }
        return m42167b;
    }

    /* renamed from: o */
    public long m41263o(@NotNull C9764h c9764h, long j10) {
        long j11;
        C9367f.m39526e(c9764h, "targetBytes");
        if (!(!this.f44562c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long m41121D0 = this.f44561b.m41121D0(c9764h, j10);
            if (m41121D0 != -1) {
                j11 = m41121D0;
                break;
            }
            long size = this.f44561b.size();
            if (this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                j11 = -1;
                break;
            }
            j10 = Math.max(j10, size);
        }
        return j11;
    }

    /* renamed from: p */
    public int m41264p() {
        mo41151b0(4L);
        return this.f44561b.m41130L0();
    }

    /* renamed from: q */
    public short m41265q() {
        mo41151b0(2L);
        return this.f44561b.m41132M0();
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: r */
    public long mo41171r(@NotNull InterfaceC9782z interfaceC9782z) {
        C9761e c9761e;
        C9367f.m39526e(interfaceC9782z, "sink");
        long j10 = 0;
        while (true) {
            long mo22901x = this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            c9761e = this.f44561b;
            if (mo22901x == -1) {
                break;
            }
            long m41169p = c9761e.m41169p();
            if (m41169p > 0) {
                j10 += m41169p;
                interfaceC9782z.mo32031h(this.f44561b, m41169p);
            }
        }
        long j11 = j10;
        if (c9761e.size() > 0) {
            j11 = j10 + this.f44561b.size();
            C9761e c9761e2 = this.f44561b;
            interfaceC9782z.mo32031h(c9761e2, c9761e2.size());
        }
        return j11;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: r0 */
    public String mo41172r0(@NotNull Charset charset) {
        C9367f.m39526e(charset, "charset");
        this.f44561b.mo41127I(this.f44563d);
        return this.f44561b.mo41172r0(charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
        C9367f.m39526e(byteBuffer, "sink");
        if (this.f44561b.size() == 0 && this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
            return -1;
        }
        return this.f44561b.read(byteBuffer);
    }

    @Override // p411xi.InterfaceC9763g
    public byte readByte() {
        mo41151b0(1L);
        return this.f44561b.readByte();
    }

    @Override // p411xi.InterfaceC9763g
    public void readFully(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "sink");
        try {
            mo41151b0(bArr.length);
            this.f44561b.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (this.f44561b.size() <= 0) {
                    throw e10;
                }
                C9761e c9761e = this.f44561b;
                int read = c9761e.read(bArr, i11, (int) c9761e.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i10 = i11 + read;
            }
        }
    }

    @Override // p411xi.InterfaceC9763g
    public int readInt() {
        mo41151b0(4L);
        return this.f44561b.readInt();
    }

    @Override // p411xi.InterfaceC9763g
    public long readLong() {
        mo41151b0(8L);
        return this.f44561b.readLong();
    }

    @Override // p411xi.InterfaceC9763g
    public short readShort() {
        mo41151b0(2L);
        return this.f44561b.readShort();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        r7 = -1;
     */
    @Override // p411xi.InterfaceC9763g
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo41173s(@org.jetbrains.annotations.NotNull p411xi.C9775s r6) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "options"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r5
            boolean r0 = r0.f44562c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L5c
        Lf:
            r0 = r5
            xi.e r0 = r0.f44561b
            r1 = r6
            r2 = 1
            int r0 = p430yi.C10022a.m42168c(r0, r1, r2)
            r7 = r0
            r0 = r7
            r1 = -2
            if (r0 == r1) goto L3f
            r0 = r7
            r1 = -1
            if (r0 == r1) goto L3a
            r0 = r6
            xi.h[] r0 = r0.m41253i()
            r1 = r7
            r0 = r0[r1]
            int r0 = r0.size()
            r8 = r0
            r0 = r5
            xi.e r0 = r0.f44561b
            r1 = r8
            long r1 = (long) r1
            r0.skip(r1)
            goto L5a
        L3a:
            r0 = -1
            r7 = r0
            goto L5a
        L3f:
            r0 = r5
            xi.b0 r0 = r0.f44563d
            r1 = r5
            xi.e r1 = r1.f44561b
            r2 = 8192(0x2000, float:1.148E-41)
            long r2 = (long) r2
            long r0 = r0.mo22901x(r1, r2)
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L3a
        L5a:
            r0 = r7
            return r0
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "closed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9778v.mo41173s(xi.s):int");
    }

    @Override // p411xi.InterfaceC9763g
    public void skip(long j10) {
        if (!(!this.f44562c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (this.f44561b.size() == 0 && this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f44561b.size());
            this.f44561b.skip(min);
            j10 -= min;
        }
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return this.f44563d.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.f44563d + ')';
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: u */
    public boolean mo41175u(long j10) {
        boolean z10 = false;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f44562c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            if (this.f44561b.size() >= j10) {
                z10 = true;
                break;
            }
            if (this.f44563d.mo22901x(this.f44561b, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) {
                break;
            }
        }
        return z10;
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        if (j10 >= 0) {
            if (true ^ this.f44562c) {
                return (this.f44561b.size() == 0 && this.f44563d.mo22901x(this.f44561b, (long) NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) == -1) ? -1L : this.f44561b.mo22901x(c9761e, Math.min(j10, this.f44561b.size()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // p411xi.InterfaceC9763g, p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: z */
    public C9761e mo41177z() {
        return this.f44561b;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: z0 */
    public long mo41178z0() {
        int i10;
        byte m41119B0;
        mo41151b0(1L);
        int i11 = 0;
        while (true) {
            i10 = i11;
            int i12 = i10 + 1;
            if (!mo41175u(i12)) {
                break;
            }
            m41119B0 = this.f44561b.m41119B0(i10);
            if ((m41119B0 < ((byte) 48) || m41119B0 > ((byte) 57)) && ((m41119B0 < ((byte) 97) || m41119B0 > ((byte) 102)) && (m41119B0 < ((byte) 65) || m41119B0 > ((byte) 70)))) {
                break;
            }
            i11 = i12;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(m41119B0, C1115a.m6691a(C1115a.m6691a(16)));
            C9367f.m39525d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f44561b.mo41178z0();
    }
}
