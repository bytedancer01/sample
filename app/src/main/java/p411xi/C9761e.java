package p411xi;

import ci.C1117c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kh.C5612f;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;
import p372vh.C9374m;
import p430yi.C10022a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xi/e.class
 */
/* renamed from: xi.e */
/* loaded from: combined.jar:classes2.jar:xi/e.class */
public final class C9761e implements InterfaceC9763g, InterfaceC9762f, Cloneable, ByteChannel {

    /* renamed from: b */
    @Nullable
    public C9779w f44519b;

    /* renamed from: c */
    public long f44520c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/e$a.class
     */
    /* renamed from: xi.e$a */
    /* loaded from: combined.jar:classes2.jar:xi/e$a.class */
    public static final class a implements Closeable {

        /* renamed from: b */
        @Nullable
        public C9761e f44521b;

        /* renamed from: c */
        public boolean f44522c;

        /* renamed from: d */
        public C9779w f44523d;

        /* renamed from: f */
        @Nullable
        public byte[] f44525f;

        /* renamed from: e */
        public long f44524e = -1;

        /* renamed from: g */
        public int f44526g = -1;

        /* renamed from: h */
        public int f44527h = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f44521b != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f44521b = null;
            this.f44523d = null;
            this.f44524e = -1L;
            this.f44525f = null;
            this.f44526g = -1;
            this.f44527h = -1;
        }

        /* renamed from: f */
        public final int m41179f() {
            long j10 = this.f44524e;
            C9761e c9761e = this.f44521b;
            C9367f.m39524c(c9761e);
            if (!(j10 != c9761e.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j11 = this.f44524e;
            return m41181o(j11 == -1 ? 0L : j11 + (this.f44527h - this.f44526g));
        }

        /* renamed from: l */
        public final long m41180l(long j10) {
            C9761e c9761e = this.f44521b;
            if (c9761e == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f44522c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = c9761e.size();
            if (j10 <= size) {
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size;
                long j12 = j10;
                while (true) {
                    long j13 = j11 - j12;
                    if (j13 <= 0) {
                        break;
                    }
                    C9779w c9779w = c9761e.f44519b;
                    C9367f.m39524c(c9779w);
                    C9779w c9779w2 = c9779w.f44572g;
                    C9367f.m39524c(c9779w2);
                    int i10 = c9779w2.f44568c;
                    long j14 = i10 - c9779w2.f44567b;
                    if (j14 > j13) {
                        c9779w2.f44568c = i10 - ((int) j13);
                        break;
                    }
                    c9761e.f44519b = c9779w2.m41267b();
                    C9780x.m41273b(c9779w2);
                    j11 = j13;
                    j12 = j14;
                }
                this.f44523d = null;
                this.f44524e = j10;
                this.f44525f = null;
                this.f44526g = -1;
                this.f44527h = -1;
            } else if (j10 > size) {
                long j15 = j10 - size;
                boolean z10 = true;
                while (true) {
                    boolean z11 = z10;
                    if (j15 <= 0) {
                        break;
                    }
                    C9779w m41141T0 = c9761e.m41141T0(1);
                    int min = (int) Math.min(j15, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - m41141T0.f44568c);
                    int i11 = m41141T0.f44568c + min;
                    m41141T0.f44568c = i11;
                    j15 -= min;
                    boolean z12 = z11;
                    if (z11) {
                        this.f44523d = m41141T0;
                        this.f44524e = size;
                        this.f44525f = m41141T0.f44566a;
                        this.f44526g = i11 - min;
                        this.f44527h = i11;
                        z12 = false;
                    }
                    z10 = z12;
                }
            }
            c9761e.m41137Q0(j10);
            return size;
        }

        /* renamed from: o */
        public final int m41181o(long j10) {
            C9779w c9779w;
            long j11;
            long j12;
            C9779w c9779w2;
            C9761e c9761e = this.f44521b;
            if (c9761e == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 < -1 || j10 > c9761e.size()) {
                C9374m c9374m = C9374m.f42907a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(c9761e.size())}, 2));
                C9367f.m39525d(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            }
            if (j10 == -1 || j10 == c9761e.size()) {
                this.f44523d = null;
                this.f44524e = j10;
                this.f44525f = null;
                this.f44526g = -1;
                this.f44527h = -1;
                return -1;
            }
            long j13 = 0;
            long size = c9761e.size();
            C9779w c9779w3 = c9761e.f44519b;
            C9779w c9779w4 = this.f44523d;
            if (c9779w4 != null) {
                long j14 = this.f44524e;
                int i10 = this.f44526g;
                C9367f.m39524c(c9779w4);
                j11 = j14 - (i10 - c9779w4.f44567b);
                if (j11 > j10) {
                    c9779w = c9779w3;
                    c9779w3 = this.f44523d;
                } else {
                    c9779w = this.f44523d;
                    j13 = j11;
                    j11 = size;
                }
            } else {
                c9779w = c9779w3;
                j11 = size;
            }
            long j15 = j11;
            if (j11 - j10 > j10 - j13) {
                C9779w c9779w5 = c9779w;
                while (true) {
                    C9779w c9779w6 = c9779w5;
                    C9367f.m39524c(c9779w6);
                    int i11 = c9779w6.f44568c;
                    int i12 = c9779w6.f44567b;
                    j12 = j13;
                    c9779w2 = c9779w6;
                    if (j10 < (i11 - i12) + j13) {
                        break;
                    }
                    j13 += i11 - i12;
                    c9779w5 = c9779w6.f44571f;
                }
            } else {
                while (j15 > j10) {
                    C9367f.m39524c(c9779w3);
                    c9779w3 = c9779w3.f44572g;
                    C9367f.m39524c(c9779w3);
                    j15 -= c9779w3.f44568c - c9779w3.f44567b;
                }
                j12 = j15;
                c9779w2 = c9779w3;
            }
            C9779w c9779w7 = c9779w2;
            if (this.f44522c) {
                C9367f.m39524c(c9779w2);
                c9779w7 = c9779w2;
                if (c9779w2.f44569d) {
                    C9779w m41271f = c9779w2.m41271f();
                    if (c9761e.f44519b == c9779w2) {
                        c9761e.f44519b = m41271f;
                    }
                    c9779w7 = c9779w2.m41268c(m41271f);
                    C9779w c9779w8 = c9779w7.f44572g;
                    C9367f.m39524c(c9779w8);
                    c9779w8.m41267b();
                }
            }
            this.f44523d = c9779w7;
            this.f44524e = j10;
            C9367f.m39524c(c9779w7);
            this.f44525f = c9779w7.f44566a;
            int i13 = c9779w7.f44567b + ((int) (j10 - j12));
            this.f44526g = i13;
            int i14 = c9779w7.f44568c;
            this.f44527h = i14;
            return i14 - i13;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/e$b.class
     */
    /* renamed from: xi.e$b */
    /* loaded from: combined.jar:classes2.jar:xi/e$b.class */
    public static final class b extends InputStream {

        /* renamed from: b */
        public final C9761e f44528b;

        public b(C9761e c9761e) {
            this.f44528b = c9761e;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(this.f44528b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            return this.f44528b.size() > 0 ? this.f44528b.readByte() & 255 : -1;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i10, int i11) {
            C9367f.m39526e(bArr, "sink");
            return this.f44528b.read(bArr, i10, i11);
        }

        @NotNull
        public String toString() {
            return this.f44528b + ".inputStream()";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xi/e$c.class
     */
    /* renamed from: xi.e$c */
    /* loaded from: combined.jar:classes2.jar:xi/e$c.class */
    public static final class c extends OutputStream {

        /* renamed from: b */
        public final C9761e f44529b;

        public c(C9761e c9761e) {
            this.f44529b = c9761e;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @NotNull
        public String toString() {
            return this.f44529b + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            this.f44529b.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i10, int i11) {
            C9367f.m39526e(bArr, "data");
            this.f44529b.write(bArr, i10, i11);
        }
    }

    /* renamed from: I0 */
    public static /* synthetic */ a m41117I0(C9761e c9761e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new a();
        }
        return c9761e.m41126H0(aVar);
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C9761e mo41131M() {
        return this;
    }

    /* renamed from: B0 */
    public final byte m41119B0(long j10) {
        long j11;
        byte b10;
        long j12;
        C9757c.m41081b(size(), j10, 1L);
        C9779w c9779w = this.f44519b;
        if (c9779w == null) {
            C9367f.m39524c(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (true) {
                j12 = size;
                if (j12 <= j10) {
                    break;
                }
                c9779w = c9779w.f44572g;
                C9367f.m39524c(c9779w);
                size = j12 - (c9779w.f44568c - c9779w.f44567b);
            }
            C9367f.m39524c(c9779w);
            b10 = c9779w.f44566a[(int) ((c9779w.f44567b + j10) - j12)];
        } else {
            long j13 = 0;
            while (true) {
                j11 = j13;
                long j14 = (c9779w.f44568c - c9779w.f44567b) + j11;
                if (j14 > j10) {
                    break;
                }
                c9779w = c9779w.f44571f;
                C9367f.m39524c(c9779w);
                j13 = j14;
            }
            C9367f.m39524c(c9779w);
            b10 = c9779w.f44566a[(int) ((c9779w.f44567b + j10) - j11)];
        }
        return b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        r15 = (r13 - r23.f44567b) + r9;
     */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m41120C0(byte r8, long r9, long r11) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9761e.m41120C0(byte, long, long):long");
    }

    /* renamed from: D0 */
    public long m41121D0(@NotNull C9764h c9764h, long j10) {
        C9779w c9779w;
        long j11;
        int i10;
        C9367f.m39526e(c9764h, "targetBytes");
        long j12 = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        C9779w c9779w2 = this.f44519b;
        long j13 = -1;
        if (c9779w2 != null) {
            C9779w c9779w3 = c9779w2;
            if (size() - j10 < j10) {
                long size = size();
                C9779w c9779w4 = c9779w2;
                while (size > j10) {
                    c9779w4 = c9779w4.f44572g;
                    C9367f.m39524c(c9779w4);
                    size -= c9779w4.f44568c - c9779w4.f44567b;
                }
                if (c9764h.size() == 2) {
                    byte m41193i = c9764h.m41193i(0);
                    byte m41193i2 = c9764h.m41193i(1);
                    loop1: while (true) {
                        j13 = -1;
                        if (size >= size()) {
                            break;
                        }
                        byte[] bArr = c9779w4.f44566a;
                        int i11 = c9779w4.f44568c;
                        for (int i12 = (int) ((c9779w4.f44567b + j10) - size); i12 < i11; i12++) {
                            byte b10 = bArr[i12];
                            j11 = size;
                            c9779w = c9779w4;
                            i10 = i12;
                            if (b10 == m41193i) {
                                break loop1;
                            }
                            if (b10 == m41193i2) {
                                j11 = size;
                                c9779w = c9779w4;
                                i10 = i12;
                                break loop1;
                            }
                        }
                        size += c9779w4.f44568c - c9779w4.f44567b;
                        c9779w4 = c9779w4.f44571f;
                        C9367f.m39524c(c9779w4);
                        j10 = size;
                    }
                    j13 = (i10 - c9779w.f44567b) + j11;
                } else {
                    byte[] mo41199q = c9764h.mo41199q();
                    long j14 = j10;
                    c9779w = c9779w4;
                    j11 = size;
                    loop3: while (true) {
                        j13 = -1;
                        if (j11 >= size()) {
                            break;
                        }
                        byte[] bArr2 = c9779w.f44566a;
                        i10 = (int) ((c9779w.f44567b + j14) - j11);
                        int i13 = c9779w.f44568c;
                        while (i10 < i13) {
                            byte b11 = bArr2[i10];
                            for (byte b12 : mo41199q) {
                                if (b11 == b12) {
                                    break loop3;
                                }
                            }
                            i10++;
                        }
                        j11 += c9779w.f44568c - c9779w.f44567b;
                        c9779w = c9779w.f44571f;
                        C9367f.m39524c(c9779w);
                        j14 = j11;
                    }
                    j13 = (i10 - c9779w.f44567b) + j11;
                }
            } else {
                while (true) {
                    long j15 = (c9779w3.f44568c - c9779w3.f44567b) + j12;
                    if (j15 > j10) {
                        break;
                    }
                    c9779w3 = c9779w3.f44571f;
                    C9367f.m39524c(c9779w3);
                    j12 = j15;
                }
                if (c9764h.size() == 2) {
                    byte m41193i3 = c9764h.m41193i(0);
                    byte m41193i4 = c9764h.m41193i(1);
                    loop7: while (true) {
                        j13 = -1;
                        if (j12 >= size()) {
                            break;
                        }
                        byte[] bArr3 = c9779w3.f44566a;
                        int i14 = c9779w3.f44568c;
                        for (int i15 = (int) ((c9779w3.f44567b + j10) - j12); i15 < i14; i15++) {
                            byte b13 = bArr3[i15];
                            j11 = j12;
                            c9779w = c9779w3;
                            i10 = i15;
                            if (b13 == m41193i3) {
                                break loop7;
                            }
                            if (b13 == m41193i4) {
                                j11 = j12;
                                c9779w = c9779w3;
                                i10 = i15;
                                break loop7;
                            }
                        }
                        j12 += c9779w3.f44568c - c9779w3.f44567b;
                        c9779w3 = c9779w3.f44571f;
                        C9367f.m39524c(c9779w3);
                        j10 = j12;
                    }
                    j13 = (i10 - c9779w.f44567b) + j11;
                } else {
                    byte[] mo41199q2 = c9764h.mo41199q();
                    long j16 = j10;
                    c9779w = c9779w3;
                    j11 = j12;
                    loop9: while (true) {
                        j13 = -1;
                        if (j11 >= size()) {
                            break;
                        }
                        byte[] bArr4 = c9779w.f44566a;
                        i10 = (int) ((c9779w.f44567b + j16) - j11);
                        int i16 = c9779w.f44568c;
                        while (i10 < i16) {
                            byte b14 = bArr4[i10];
                            for (byte b15 : mo41199q2) {
                                if (b14 == b15) {
                                    break loop9;
                                }
                            }
                            i10++;
                        }
                        j11 += c9779w.f44568c - c9779w.f44567b;
                        c9779w = c9779w.f44571f;
                        C9367f.m39524c(c9779w);
                        j16 = j11;
                    }
                    j13 = (i10 - c9779w.f44567b) + j11;
                }
            }
        }
        return j13;
    }

    @NotNull
    /* renamed from: E0 */
    public OutputStream m41122E0() {
        return new c(this);
    }

    /* renamed from: F0 */
    public boolean m41123F0(long j10, @NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "bytes");
        return m41125G0(j10, c9764h, 0, c9764h.size());
    }

    /* renamed from: G0 */
    public boolean m41125G0(long j10, @NotNull C9764h c9764h, int i10, int i11) {
        C9367f.m39526e(c9764h, "bytes");
        boolean z10 = false;
        if (j10 >= 0) {
            z10 = false;
            if (i10 >= 0) {
                z10 = false;
                if (i11 >= 0) {
                    z10 = false;
                    if (size() - j10 >= i11) {
                        if (c9764h.size() - i10 >= i11) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    z10 = true;
                                    break;
                                }
                                if (m41119B0(i12 + j10) != c9764h.m41193i(i10 + i12)) {
                                    z10 = false;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
        }
        return z10;
    }

    @NotNull
    /* renamed from: H0 */
    public final a m41126H0(@NotNull a aVar) {
        C9367f.m39526e(aVar, "unsafeCursor");
        if (!(aVar.f44521b == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f44521b = this;
        aVar.f44522c = true;
        return aVar;
    }

    @Override // p411xi.InterfaceC9762f
    /* renamed from: I */
    public long mo41127I(@NotNull InterfaceC9756b0 interfaceC9756b0) {
        C9367f.m39526e(interfaceC9756b0, "source");
        long j10 = 0;
        while (true) {
            long j11 = j10;
            long mo22901x = interfaceC9756b0.mo22901x(this, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
            if (mo22901x == -1) {
                return j11;
            }
            j10 = j11 + mo22901x;
        }
    }

    @NotNull
    /* renamed from: J0 */
    public byte[] m41128J0() {
        return mo41145W(size());
    }

    @NotNull
    /* renamed from: K0 */
    public C9764h m41129K0() {
        return mo41159g0(size());
    }

    /* renamed from: L0 */
    public int m41130L0() {
        return C9757c.m41082c(readInt());
    }

    /* renamed from: M0 */
    public short m41132M0() {
        return C9757c.m41083d(readShort());
    }

    @NotNull
    /* renamed from: N0 */
    public String m41133N0(long j10, @NotNull Charset charset) {
        C9367f.m39526e(charset, "charset");
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f44520c < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        C9779w c9779w = this.f44519b;
        C9367f.m39524c(c9779w);
        int i10 = c9779w.f44567b;
        if (i10 + j10 > c9779w.f44568c) {
            return new String(mo41145W(j10), charset);
        }
        byte[] bArr = c9779w.f44566a;
        int i11 = (int) j10;
        String str = new String(bArr, i10, i11, charset);
        int i12 = c9779w.f44567b + i11;
        c9779w.f44567b = i12;
        this.f44520c -= j10;
        if (i12 == c9779w.f44568c) {
            this.f44519b = c9779w.m41267b();
            C9780x.m41273b(c9779w);
        }
        return str;
    }

    @NotNull
    /* renamed from: O0 */
    public String m41134O0() {
        return m41133N0(this.f44520c, C1117c.f7455b);
    }

    @NotNull
    /* renamed from: P0 */
    public String m41135P0(long j10) {
        return m41133N0(j10, C1117c.f7455b);
    }

    /* renamed from: Q0 */
    public final void m41137Q0(long j10) {
        this.f44520c = j10;
    }

    @NotNull
    /* renamed from: R0 */
    public final C9764h m41138R0() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return m41139S0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [xi.h] */
    @NotNull
    /* renamed from: S0 */
    public final C9764h m41139S0(int i10) {
        C9781y c9781y;
        if (i10 == 0) {
            c9781y = C9764h.f44530e;
        } else {
            C9757c.m41081b(size(), 0L, i10);
            C9779w c9779w = this.f44519b;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                C9367f.m39524c(c9779w);
                int i14 = c9779w.f44568c;
                int i15 = c9779w.f44567b;
                if (i14 == i15) {
                    throw new AssertionError("s.limit == s.pos");
                }
                i12 += i14 - i15;
                i13++;
                c9779w = c9779w.f44571f;
            }
            ?? r02 = new byte[i13];
            int[] iArr = new int[i13 * 2];
            C9779w c9779w2 = this.f44519b;
            int i16 = 0;
            while (i11 < i10) {
                C9367f.m39524c(c9779w2);
                r02[i16] = c9779w2.f44566a;
                i11 += c9779w2.f44568c - c9779w2.f44567b;
                iArr[i16] = Math.min(i11, i10);
                iArr[i16 + i13] = c9779w2.f44567b;
                c9779w2.f44569d = true;
                i16++;
                c9779w2 = c9779w2.f44571f;
            }
            c9781y = new C9781y(r02, iArr);
        }
        return c9781y;
    }

    @NotNull
    /* renamed from: T0 */
    public final C9779w m41141T0(int i10) {
        C9779w c9779w;
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C9779w c9779w2 = this.f44519b;
        if (c9779w2 == null) {
            c9779w = C9780x.m41274c();
            this.f44519b = c9779w;
            c9779w.f44572g = c9779w;
            c9779w.f44571f = c9779w;
        } else {
            C9367f.m39524c(c9779w2);
            c9779w = c9779w2.f44572g;
            C9367f.m39524c(c9779w);
            if (c9779w.f44568c + i10 > 8192 || !c9779w.f44570e) {
                c9779w = c9779w.m41268c(C9780x.m41274c());
            }
        }
        return c9779w;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public C9761e mo41162i0(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "byteString");
        c9764h.mo41189E(this, 0, c9764h.size());
        return this;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: V */
    public String mo41143V() {
        return mo41166m(Long.MAX_VALUE);
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C9761e write(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: W */
    public byte[] mo41145W(long j10) {
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C9761e write(@NotNull byte[] bArr, int i10, int i11) {
        C9367f.m39526e(bArr, "source");
        long j10 = i11;
        C9757c.m41081b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C9779w m41141T0 = m41141T0(1);
            int min = Math.min(i12 - i10, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - m41141T0.f44568c);
            byte[] bArr2 = m41141T0.f44566a;
            int i13 = m41141T0.f44568c;
            int i14 = i10 + min;
            C5612f.m27677c(bArr, bArr2, i13, i10, i14);
            m41141T0.f44568c += min;
            i10 = i14;
        }
        m41137Q0(size() + j10);
        return this;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C9761e writeByte(int i10) {
        C9779w m41141T0 = m41141T0(1);
        byte[] bArr = m41141T0.f44566a;
        int i11 = m41141T0.f44568c;
        m41141T0.f44568c = i11 + 1;
        bArr[i11] = (byte) i10;
        m41137Q0(size() + 1);
        return this;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C9761e mo41155d0(long j10) {
        C9761e c9761e;
        if (j10 == 0) {
            c9761e = writeByte(48);
        } else {
            boolean z10 = false;
            int i10 = 1;
            long j11 = j10;
            if (j10 < 0) {
                j11 = -j10;
                if (j11 < 0) {
                    c9761e = mo41136Q("-9223372036854775808");
                } else {
                    z10 = true;
                }
            }
            if (j11 >= 100000000) {
                i10 = j11 < 1000000000000L ? j11 < 10000000000L ? j11 < 1000000000 ? 9 : 10 : j11 < 100000000000L ? 11 : 12 : j11 < 1000000000000000L ? j11 < 10000000000000L ? 13 : j11 < 100000000000000L ? 14 : 15 : j11 < 100000000000000000L ? j11 < 10000000000000000L ? 16 : 17 : j11 < 1000000000000000000L ? 18 : 19;
            } else if (j11 >= 10000) {
                i10 = j11 < 1000000 ? j11 < 100000 ? 5 : 6 : j11 < 10000000 ? 7 : 8;
            } else if (j11 >= 100) {
                i10 = j11 < 1000 ? 3 : 4;
            } else if (j11 >= 10) {
                i10 = 2;
            }
            int i11 = i10;
            if (z10) {
                i11 = i10 + 1;
            }
            C9779w m41141T0 = m41141T0(i11);
            byte[] bArr = m41141T0.f44566a;
            int i12 = m41141T0.f44568c + i11;
            while (j11 != 0) {
                long j12 = 10;
                i12--;
                bArr[i12] = C10022a.m42166a()[(int) (j11 % j12)];
                j11 /= j12;
            }
            if (z10) {
                bArr[i12 - 1] = (byte) 45;
            }
            m41141T0.f44568c += i11;
            m41137Q0(size() + i11);
            c9761e = this;
        }
        return c9761e;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C9761e mo41174s0(long j10) {
        C9761e c9761e;
        if (j10 == 0) {
            c9761e = writeByte(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            C9779w m41141T0 = m41141T0(i10);
            byte[] bArr = m41141T0.f44566a;
            int i11 = m41141T0.f44568c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = C10022a.m42166a()[(int) (15 & j10)];
                j10 >>>= 4;
            }
            m41141T0.f44568c += i10;
            m41137Q0(size() + i10);
            c9761e = this;
        }
        return c9761e;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C9761e writeInt(int i10) {
        C9779w m41141T0 = m41141T0(4);
        byte[] bArr = m41141T0.f44566a;
        int i11 = m41141T0.f44568c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        m41141T0.f44568c = i14 + 1;
        m41137Q0(size() + 4);
        return this;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: b0 */
    public void mo41151b0(long j10) {
        if (this.f44520c < j10) {
            throw new EOFException();
        }
    }

    @NotNull
    /* renamed from: b1 */
    public C9761e m41152b1(long j10) {
        C9779w m41141T0 = m41141T0(8);
        byte[] bArr = m41141T0.f44566a;
        int i10 = m41141T0.f44568c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        m41141T0.f44568c = i17 + 1;
        m41137Q0(size() + 8);
        return this;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: c0 */
    public long mo41153c0(@NotNull C9764h c9764h) {
        C9367f.m39526e(c9764h, "targetBytes");
        return m41121D0(c9764h, 0L);
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C9761e writeShort(int i10) {
        C9779w m41141T0 = m41141T0(2);
        byte[] bArr = m41141T0.f44566a;
        int i11 = m41141T0.f44568c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        m41141T0.f44568c = i12 + 1;
        m41137Q0(size() + 2);
        return this;
    }

    @Override // p411xi.InterfaceC9756b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    /* renamed from: d1 */
    public C9761e m41156d1(@NotNull String str, int i10, int i11, @NotNull Charset charset) {
        C9367f.m39526e(str, "string");
        C9367f.m39526e(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        if (C9367f.m39522a(charset, C1117c.f7455b)) {
            return mo41140T(str, i10, i11);
        }
        String substring = str.substring(i10, i11);
        C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = substring.getBytes(charset);
        C9367f.m39525d(bytes, "(this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @NotNull
    /* renamed from: e1 */
    public C9761e m41157e1(@NotNull String str, @NotNull Charset charset) {
        C9367f.m39526e(str, "string");
        C9367f.m39526e(charset, "charset");
        return m41156d1(str, 0, str.length(), charset);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10 = false;
        if (this != obj) {
            if (obj instanceof C9761e) {
                C9761e c9761e = (C9761e) obj;
                if (size() == c9761e.size()) {
                    if (size() != 0) {
                        C9779w c9779w = this.f44519b;
                        C9367f.m39524c(c9779w);
                        C9779w c9779w2 = c9761e.f44519b;
                        C9367f.m39524c(c9779w2);
                        int i10 = c9779w.f44567b;
                        int i11 = c9779w2.f44567b;
                        long j10 = 0;
                        loop0: while (j10 < size()) {
                            long min = Math.min(c9779w.f44568c - i10, c9779w2.f44568c - i11);
                            long j11 = 0;
                            int i12 = i10;
                            while (j11 < min) {
                                if (c9779w.f44566a[i12] != c9779w2.f44566a[i11]) {
                                    break loop0;
                                }
                                j11++;
                                i12++;
                                i11++;
                            }
                            C9779w c9779w3 = c9779w;
                            i10 = i12;
                            if (i12 == c9779w.f44568c) {
                                c9779w3 = c9779w.f44571f;
                                C9367f.m39524c(c9779w3);
                                i10 = c9779w3.f44567b;
                            }
                            C9779w c9779w4 = c9779w2;
                            int i13 = i11;
                            if (i11 == c9779w2.f44568c) {
                                c9779w4 = c9779w2.f44571f;
                                C9367f.m39524c(c9779w4);
                                i13 = c9779w4.f44567b;
                            }
                            j10 += min;
                            c9779w2 = c9779w4;
                            c9779w = c9779w3;
                            i11 = i13;
                        }
                    }
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public C9761e mo41136Q(@NotNull String str) {
        C9367f.m39526e(str, "string");
        return mo41140T(str, 0, str.length());
    }

    @Override // p411xi.InterfaceC9762f, p411xi.InterfaceC9782z, java.io.Flushable
    public void flush() {
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: g0 */
    public C9764h mo41159g0(long j10) {
        C9764h c9764h;
        if (!(j10 >= 0 && j10 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 >= 4096) {
            c9764h = m41139S0((int) j10);
            skip(j10);
        } else {
            c9764h = new C9764h(mo41145W(j10));
        }
        return c9764h;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C9761e mo41140T(@NotNull String str, int i10, int i11) {
        char charAt;
        long size;
        long j10;
        C9367f.m39526e(str, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        while (i10 < i11) {
            char charAt2 = str.charAt(i10);
            if (charAt2 < 128) {
                C9779w m41141T0 = m41141T0(1);
                byte[] bArr = m41141T0.f44566a;
                int i12 = m41141T0.f44568c - i10;
                int min = Math.min(i11, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - i12);
                bArr[i10 + i12] = (byte) charAt2;
                i10++;
                while (i10 < min && (charAt = str.charAt(i10)) < 128) {
                    bArr[i10 + i12] = (byte) charAt;
                    i10++;
                }
                int i13 = m41141T0.f44568c;
                int i14 = (i12 + i10) - i13;
                m41141T0.f44568c = i13 + i14;
                m41137Q0(size() + i14);
            } else {
                if (charAt2 < 2048) {
                    C9779w m41141T02 = m41141T0(2);
                    byte[] bArr2 = m41141T02.f44566a;
                    int i15 = m41141T02.f44568c;
                    bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                    m41141T02.f44568c = i15 + 2;
                    size = size();
                    j10 = 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C9779w m41141T03 = m41141T0(3);
                    byte[] bArr3 = m41141T03.f44566a;
                    int i16 = m41141T03.f44568c;
                    bArr3[i16] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                    m41141T03.f44568c = i16 + 3;
                    size = size();
                    j10 = 3;
                } else {
                    int i17 = i10 + 1;
                    char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        writeByte(63);
                        i10 = i17;
                    } else {
                        int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        C9779w m41141T04 = m41141T0(4);
                        byte[] bArr4 = m41141T04.f44566a;
                        int i19 = m41141T04.f44568c;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        m41141T04.f44568c = i19 + 4;
                        m41137Q0(size() + 4);
                        i10 += 2;
                    }
                }
                m41137Q0(size + j10);
                i10++;
            }
        }
        return this;
    }

    @Override // p411xi.InterfaceC9763g, p411xi.InterfaceC9762f
    @NotNull
    public C9761e getBuffer() {
        return this;
    }

    @Override // p411xi.InterfaceC9782z
    /* renamed from: h */
    public void mo32031h(@NotNull C9761e c9761e, long j10) {
        C9779w c9779w;
        C9367f.m39526e(c9761e, "source");
        if (!(c9761e != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C9757c.m41081b(c9761e.size(), 0L, j10);
        while (j10 > 0) {
            C9779w c9779w2 = c9761e.f44519b;
            C9367f.m39524c(c9779w2);
            int i10 = c9779w2.f44568c;
            C9367f.m39524c(c9761e.f44519b);
            if (j10 < i10 - r0.f44567b) {
                C9779w c9779w3 = this.f44519b;
                if (c9779w3 != null) {
                    C9367f.m39524c(c9779w3);
                    c9779w = c9779w3.f44572g;
                } else {
                    c9779w = null;
                }
                if (c9779w != null && c9779w.f44570e) {
                    if ((c9779w.f44568c + j10) - (c9779w.f44569d ? 0 : c9779w.f44567b) <= NTLMEngineImpl.FLAG_WORKSTATION_PRESENT) {
                        C9779w c9779w4 = c9761e.f44519b;
                        C9367f.m39524c(c9779w4);
                        c9779w4.m41272g(c9779w, (int) j10);
                        c9761e.m41137Q0(c9761e.size() - j10);
                        m41137Q0(size() + j10);
                        return;
                    }
                }
                C9779w c9779w5 = c9761e.f44519b;
                C9367f.m39524c(c9779w5);
                c9761e.f44519b = c9779w5.m41270e((int) j10);
            }
            C9779w c9779w6 = c9761e.f44519b;
            C9367f.m39524c(c9779w6);
            long j11 = c9779w6.f44568c - c9779w6.f44567b;
            c9761e.f44519b = c9779w6.m41267b();
            C9779w c9779w7 = this.f44519b;
            if (c9779w7 == null) {
                this.f44519b = c9779w6;
                c9779w6.f44572g = c9779w6;
                c9779w6.f44571f = c9779w6;
            } else {
                C9367f.m39524c(c9779w7);
                C9779w c9779w8 = c9779w7.f44572g;
                C9367f.m39524c(c9779w8);
                c9779w8.m41268c(c9779w6).m41266a();
            }
            c9761e.m41137Q0(c9761e.size() - j11);
            m41137Q0(size() + j11);
            j10 -= j11;
        }
    }

    @NotNull
    /* renamed from: h1 */
    public C9761e m41161h1(int i10) {
        long size;
        long j10;
        if (i10 < 128) {
            writeByte(i10);
        } else {
            if (i10 < 2048) {
                C9779w m41141T0 = m41141T0(2);
                byte[] bArr = m41141T0.f44566a;
                int i11 = m41141T0.f44568c;
                bArr[i11] = (byte) ((i10 >> 6) | 192);
                bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
                m41141T0.f44568c = i11 + 2;
                size = size();
                j10 = 2;
            } else if (55296 <= i10 && 57343 >= i10) {
                writeByte(63);
            } else if (i10 < 65536) {
                C9779w m41141T02 = m41141T0(3);
                byte[] bArr2 = m41141T02.f44566a;
                int i12 = m41141T02.f44568c;
                bArr2[i12] = (byte) ((i10 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                m41141T02.f44568c = i12 + 3;
                size = size();
                j10 = 3;
            } else {
                if (i10 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + C9757c.m41085f(i10));
                }
                C9779w m41141T03 = m41141T0(4);
                byte[] bArr3 = m41141T03.f44566a;
                int i13 = m41141T03.f44568c;
                bArr3[i13] = (byte) ((i10 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                m41141T03.f44568c = i13 + 4;
                size = size();
                j10 = 4;
            }
            m41137Q0(size + j10);
        }
        return this;
    }

    public int hashCode() {
        int i10;
        C9779w c9779w;
        C9779w c9779w2 = this.f44519b;
        if (c9779w2 != null) {
            int i11 = 1;
            do {
                int i12 = c9779w2.f44568c;
                i10 = i11;
                for (int i13 = c9779w2.f44567b; i13 < i12; i13++) {
                    i10 = (i10 * 31) + c9779w2.f44566a[i13];
                }
                c9779w = c9779w2.f44571f;
                C9367f.m39524c(c9779w);
                c9779w2 = c9779w;
                i11 = i10;
            } while (c9779w != this.f44519b);
        } else {
            i10 = 0;
        }
        return i10;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    public InputStream inputStream() {
        return new b(this);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: k */
    public void mo41163k(@NotNull C9761e c9761e, long j10) {
        C9367f.m39526e(c9761e, "sink");
        if (size() >= j10) {
            c9761e.mo32031h(this, j10);
        } else {
            c9761e.mo32031h(this, size());
            throw new EOFException();
        }
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: k0 */
    public boolean mo41164k0() {
        return this.f44520c == 0;
    }

    /* renamed from: l */
    public final void m41165l() {
        skip(size());
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: m */
    public String mo41166m(long j10) {
        String m42167b;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = Long.MAX_VALUE;
        if (j10 != Long.MAX_VALUE) {
            j11 = j10 + 1;
        }
        byte b10 = (byte) 10;
        long m41120C0 = m41120C0(b10, 0L, j11);
        if (m41120C0 != -1) {
            m42167b = C10022a.m42167b(this, m41120C0);
        } else {
            if (j11 >= size() || m41119B0(j11 - 1) != ((byte) 13) || m41119B0(j11) != b10) {
                C9761e c9761e = new C9761e();
                m41170q0(c9761e, 0L, Math.min(32, size()));
                throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + c9761e.m41129K0().mo41198p() + (char) 8230);
            }
            m42167b = C10022a.m42167b(this, j11);
        }
        return m42167b;
    }

    @NotNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C9761e clone() {
        return m41168o0();
    }

    @NotNull
    /* renamed from: o0 */
    public final C9761e m41168o0() {
        C9761e c9761e = new C9761e();
        if (size() != 0) {
            C9779w c9779w = this.f44519b;
            C9367f.m39524c(c9779w);
            C9779w m41269d = c9779w.m41269d();
            c9761e.f44519b = m41269d;
            m41269d.f44572g = m41269d;
            m41269d.f44571f = m41269d;
            C9779w c9779w2 = c9779w.f44571f;
            while (true) {
                C9779w c9779w3 = c9779w2;
                if (c9779w3 == c9779w) {
                    break;
                }
                C9779w c9779w4 = m41269d.f44572g;
                C9367f.m39524c(c9779w4);
                C9367f.m39524c(c9779w3);
                c9779w4.m41268c(c9779w3.m41269d());
                c9779w2 = c9779w3.f44571f;
            }
            c9761e.m41137Q0(size());
        }
        return c9761e;
    }

    /* renamed from: p */
    public final long m41169p() {
        long size = size();
        long j10 = 0;
        if (size != 0) {
            C9779w c9779w = this.f44519b;
            C9367f.m39524c(c9779w);
            C9779w c9779w2 = c9779w.f44572g;
            C9367f.m39524c(c9779w2);
            j10 = size;
            if (c9779w2.f44568c < 8192) {
                j10 = size;
                if (c9779w2.f44570e) {
                    j10 = size - (r0 - c9779w2.f44567b);
                }
            }
        }
        return j10;
    }

    @NotNull
    /* renamed from: q0 */
    public final C9761e m41170q0(@NotNull C9761e c9761e, long j10, long j11) {
        C9779w c9779w;
        long j12;
        long j13;
        C9367f.m39526e(c9761e, "out");
        C9757c.m41081b(size(), j10, j11);
        if (j11 != 0) {
            c9761e.m41137Q0(c9761e.size() + j11);
            C9779w c9779w2 = this.f44519b;
            while (true) {
                C9779w c9779w3 = c9779w2;
                C9367f.m39524c(c9779w3);
                int i10 = c9779w3.f44568c;
                int i11 = c9779w3.f44567b;
                c9779w = c9779w3;
                j12 = j10;
                j13 = j11;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                c9779w2 = c9779w3.f44571f;
            }
            while (j13 > 0) {
                C9367f.m39524c(c9779w);
                C9779w m41269d = c9779w.m41269d();
                int i12 = m41269d.f44567b + ((int) j12);
                m41269d.f44567b = i12;
                m41269d.f44568c = Math.min(i12 + ((int) j13), m41269d.f44568c);
                C9779w c9779w4 = c9761e.f44519b;
                if (c9779w4 == null) {
                    m41269d.f44572g = m41269d;
                    m41269d.f44571f = m41269d;
                    c9761e.f44519b = m41269d;
                } else {
                    C9367f.m39524c(c9779w4);
                    C9779w c9779w5 = c9779w4.f44572g;
                    C9367f.m39524c(c9779w5);
                    c9779w5.m41268c(m41269d);
                }
                j13 -= m41269d.f44568c - m41269d.f44567b;
                c9779w = c9779w.f44571f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: r */
    public long mo41171r(@NotNull InterfaceC9782z interfaceC9782z) {
        C9367f.m39526e(interfaceC9782z, "sink");
        long size = size();
        if (size > 0) {
            interfaceC9782z.mo32031h(this, size);
        }
        return size;
    }

    @Override // p411xi.InterfaceC9763g
    @NotNull
    /* renamed from: r0 */
    public String mo41172r0(@NotNull Charset charset) {
        C9367f.m39526e(charset, "charset");
        return m41133N0(this.f44520c, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
        C9367f.m39526e(byteBuffer, "sink");
        C9779w c9779w = this.f44519b;
        if (c9779w == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c9779w.f44568c - c9779w.f44567b);
        byteBuffer.put(c9779w.f44566a, c9779w.f44567b, min);
        int i10 = c9779w.f44567b + min;
        c9779w.f44567b = i10;
        this.f44520c -= min;
        if (i10 == c9779w.f44568c) {
            this.f44519b = c9779w.m41267b();
            C9780x.m41273b(c9779w);
        }
        return min;
    }

    public int read(@NotNull byte[] bArr, int i10, int i11) {
        int i12;
        C9367f.m39526e(bArr, "sink");
        C9757c.m41081b(bArr.length, i10, i11);
        C9779w c9779w = this.f44519b;
        if (c9779w != null) {
            int min = Math.min(i11, c9779w.f44568c - c9779w.f44567b);
            byte[] bArr2 = c9779w.f44566a;
            int i13 = c9779w.f44567b;
            C5612f.m27677c(bArr2, bArr, i10, i13, i13 + min);
            c9779w.f44567b += min;
            m41137Q0(size() - min);
            i12 = min;
            if (c9779w.f44567b == c9779w.f44568c) {
                this.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
                i12 = min;
            }
        } else {
            i12 = -1;
        }
        return i12;
    }

    @Override // p411xi.InterfaceC9763g
    public byte readByte() {
        if (size() == 0) {
            throw new EOFException();
        }
        C9779w c9779w = this.f44519b;
        C9367f.m39524c(c9779w);
        int i10 = c9779w.f44567b;
        int i11 = c9779w.f44568c;
        byte[] bArr = c9779w.f44566a;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        m41137Q0(size() - 1);
        if (i12 == i11) {
            this.f44519b = c9779w.m41267b();
            C9780x.m41273b(c9779w);
        } else {
            c9779w.f44567b = i12;
        }
        return b10;
    }

    @Override // p411xi.InterfaceC9763g
    public void readFully(@NotNull byte[] bArr) {
        C9367f.m39526e(bArr, "sink");
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= bArr.length) {
                return;
            }
            int read = read(bArr, i11, bArr.length - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i10 = i11 + read;
        }
    }

    @Override // p411xi.InterfaceC9763g
    public int readInt() {
        int i10;
        if (size() < 4) {
            throw new EOFException();
        }
        C9779w c9779w = this.f44519b;
        C9367f.m39524c(c9779w);
        int i11 = c9779w.f44567b;
        int i12 = c9779w.f44568c;
        if (i12 - i11 < 4) {
            i10 = ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        } else {
            byte[] bArr = c9779w.f44566a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            int i15 = i14 + 1;
            byte b12 = bArr[i14];
            int i16 = i15 + 1;
            byte b13 = bArr[i15];
            m41137Q0(size() - 4);
            if (i16 == i12) {
                this.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
            } else {
                c9779w.f44567b = i16;
            }
            i10 = ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
        }
        return i10;
    }

    @Override // p411xi.InterfaceC9763g
    public long readLong() {
        long j10;
        if (size() < 8) {
            throw new EOFException();
        }
        C9779w c9779w = this.f44519b;
        C9367f.m39524c(c9779w);
        int i10 = c9779w.f44567b;
        int i11 = c9779w.f44568c;
        if (i11 - i10 < 8) {
            j10 = ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        } else {
            byte[] bArr = c9779w.f44566a;
            int i12 = i10 + 1;
            long j11 = bArr[i10];
            int i13 = i12 + 1;
            long j12 = bArr[i12];
            int i14 = i13 + 1;
            long j13 = bArr[i13];
            int i15 = i14 + 1;
            long j14 = bArr[i14];
            int i16 = i15 + 1;
            long j15 = bArr[i15];
            int i17 = i16 + 1;
            long j16 = bArr[i16];
            int i18 = i17 + 1;
            long j17 = bArr[i17];
            int i19 = i18 + 1;
            long j18 = bArr[i18];
            m41137Q0(size() - 8);
            if (i19 == i11) {
                this.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
            } else {
                c9779w.f44567b = i19;
            }
            j10 = ((j14 & 255) << 32) | ((j11 & 255) << 56) | ((j12 & 255) << 48) | ((j13 & 255) << 40) | ((j15 & 255) << 24) | ((j16 & 255) << 16) | ((j17 & 255) << 8) | (j18 & 255);
        }
        return j10;
    }

    @Override // p411xi.InterfaceC9763g
    public short readShort() {
        short s10;
        if (size() < 2) {
            throw new EOFException();
        }
        C9779w c9779w = this.f44519b;
        C9367f.m39524c(c9779w);
        int i10 = c9779w.f44567b;
        int i11 = c9779w.f44568c;
        if (i11 - i10 < 2) {
            s10 = (short) (((readByte() & 255) << 8) | (readByte() & 255));
        } else {
            byte[] bArr = c9779w.f44566a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            m41137Q0(size() - 2);
            if (i13 == i11) {
                this.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
            } else {
                c9779w.f44567b = i13;
            }
            s10 = (short) (((b10 & 255) << 8) | (b11 & 255));
        }
        return s10;
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: s */
    public int mo41173s(@NotNull C9775s c9775s) {
        C9367f.m39526e(c9775s, "options");
        int m42169d = C10022a.m42169d(this, c9775s, false, 2, null);
        if (m42169d == -1) {
            m42169d = -1;
        } else {
            skip(c9775s.m41253i()[m42169d].size());
        }
        return m42169d;
    }

    public final long size() {
        return this.f44520c;
    }

    @Override // p411xi.InterfaceC9763g
    public void skip(long j10) {
        while (j10 > 0) {
            C9779w c9779w = this.f44519b;
            if (c9779w == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, c9779w.f44568c - c9779w.f44567b);
            long j11 = min;
            m41137Q0(size() - j11);
            long j12 = j10 - j11;
            int i10 = c9779w.f44567b + min;
            c9779w.f44567b = i10;
            j10 = j12;
            if (i10 == c9779w.f44568c) {
                this.f44519b = c9779w.m41267b();
                C9780x.m41273b(c9779w);
                j10 = j12;
            }
        }
    }

    @Override // p411xi.InterfaceC9756b0
    @NotNull
    public C9758c0 timeout() {
        return C9758c0.f44503d;
    }

    @NotNull
    public String toString() {
        return m41138R0().toString();
    }

    @Override // p411xi.InterfaceC9763g
    /* renamed from: u */
    public boolean mo41175u(long j10) {
        return this.f44520c >= j10;
    }

    @Override // p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public C9761e mo41124G() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) {
        C9367f.m39526e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            C9779w m41141T0 = m41141T0(1);
            int min = Math.min(i10, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT - m41141T0.f44568c);
            byteBuffer.get(m41141T0.f44566a, m41141T0.f44568c, min);
            i10 -= min;
            m41141T0.f44568c += min;
        }
        this.f44520c += remaining;
        return remaining;
    }

    @Override // p411xi.InterfaceC9756b0
    /* renamed from: x */
    public long mo22901x(@NotNull C9761e c9761e, long j10) {
        long j11;
        C9367f.m39526e(c9761e, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            j11 = -1;
        } else {
            j11 = j10;
            if (j10 > size()) {
                j11 = size();
            }
            c9761e.mo32031h(this, j11);
        }
        return j11;
    }

    @Override // p411xi.InterfaceC9763g, p411xi.InterfaceC9762f
    @NotNull
    /* renamed from: z */
    public C9761e mo41177z() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        if (r9 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + p411xi.C9757c.m41084e(r0));
     */
    @Override // p411xi.InterfaceC9763g
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo41178z0() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p411xi.C9761e.mo41178z0():long");
    }
}
