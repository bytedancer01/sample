package p344u3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u3/b.class
 */
/* renamed from: u3.b */
/* loaded from: combined.jar:classes1.jar:u3/b.class */
public class C8787b implements Closeable {

    /* renamed from: b */
    public final InputStream f40777b;

    /* renamed from: c */
    public final Charset f40778c;

    /* renamed from: d */
    public byte[] f40779d;

    /* renamed from: e */
    public int f40780e;

    /* renamed from: f */
    public int f40781f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u3/b$a.class
     */
    /* renamed from: u3.b$a */
    /* loaded from: combined.jar:classes1.jar:u3/b$a.class */
    public class a extends ByteArrayOutputStream {

        /* renamed from: b */
        public final C8787b f40782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8787b c8787b, int i10) {
            super(i10);
            this.f40782b = c8787b;
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            int i11 = i10;
            if (i10 > 0) {
                i11 = i10;
                if (((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                    i11 = i10 - 1;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, this.f40782b.f40778c.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C8787b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C8788c.f40783a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f40777b = inputStream;
        this.f40778c = charset;
        this.f40779d = new byte[i10];
    }

    public C8787b(InputStream inputStream, Charset charset) {
        this(inputStream, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f40777b) {
            if (this.f40779d != null) {
                this.f40779d = null;
                this.f40777b.close();
            }
        }
    }

    /* renamed from: l */
    public final void m37640l() {
        InputStream inputStream = this.f40777b;
        byte[] bArr = this.f40779d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f40780e = 0;
        this.f40781f = read;
    }

    /* renamed from: o */
    public boolean m37641o() {
        return this.f40781f == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r0[r8] == 13) goto L24;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m37642p() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p344u3.C8787b.m37642p():java.lang.String");
    }
}
