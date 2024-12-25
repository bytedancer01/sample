package p039c9;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p027b9.C0858p;
import p027b9.InterfaceC0850k;
import p039c9.InterfaceC1031a;
import p059d9.C4349a;
import p059d9.C4369j0;
import p059d9.C4392v;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/b.class
 */
/* renamed from: c9.b */
/* loaded from: combined.jar:classes2.jar:c9/b.class */
public final class C1032b implements InterfaceC0850k {

    /* renamed from: a */
    public final InterfaceC1031a f6925a;

    /* renamed from: b */
    public final long f6926b;

    /* renamed from: c */
    public final int f6927c;

    /* renamed from: d */
    public C0858p f6928d;

    /* renamed from: e */
    public long f6929e;

    /* renamed from: f */
    public File f6930f;

    /* renamed from: g */
    public OutputStream f6931g;

    /* renamed from: h */
    public long f6932h;

    /* renamed from: i */
    public long f6933i;

    /* renamed from: j */
    public C4369j0 f6934j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/b$a.class
     */
    /* renamed from: c9.b$a */
    /* loaded from: combined.jar:classes2.jar:c9/b$a.class */
    public static final class a extends InterfaceC1031a.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/b$b.class
     */
    /* renamed from: c9.b$b */
    /* loaded from: combined.jar:classes2.jar:c9/b$b.class */
    public static final class b implements InterfaceC0850k.a {

        /* renamed from: a */
        public InterfaceC1031a f6935a;

        /* renamed from: b */
        public long f6936b = 5242880;

        /* renamed from: c */
        public int f6937c = 20480;

        @Override // p027b9.InterfaceC0850k.a
        /* renamed from: a */
        public InterfaceC0850k mo5368a() {
            return new C1032b((InterfaceC1031a) C4349a.m21882e(this.f6935a), this.f6936b, this.f6937c);
        }

        /* renamed from: b */
        public b m6070b(InterfaceC1031a interfaceC1031a) {
            this.f6935a = interfaceC1031a;
            return this;
        }
    }

    public C1032b(InterfaceC1031a interfaceC1031a, long j10, int i10) {
        C4349a.m21885h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            C4392v.m22275i("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f6925a = (InterfaceC1031a) C4349a.m21882e(interfaceC1031a);
        this.f6926b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f6927c = i10;
    }

    @Override // p027b9.InterfaceC0850k
    /* renamed from: a */
    public void mo5367a(C0858p c0858p) {
        C4349a.m21882e(c0858p.f5855i);
        if (c0858p.f5854h == -1 && c0858p.m5379d(2)) {
            this.f6928d = null;
            return;
        }
        this.f6928d = c0858p;
        this.f6929e = c0858p.m5379d(4) ? this.f6926b : Long.MAX_VALUE;
        this.f6933i = 0L;
        try {
            m6069c(c0858p);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    /* renamed from: b */
    public final void m6068b() {
        OutputStream outputStream = this.f6931g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            C4401z0.m22403p(this.f6931g);
            this.f6931g = null;
            File file = (File) C4401z0.m22391j(this.f6930f);
            this.f6930f = null;
            this.f6925a.mo6062i(file, this.f6932h);
        } catch (Throwable th2) {
            C4401z0.m22403p(this.f6931g);
            this.f6931g = null;
            File file2 = (File) C4401z0.m22391j(this.f6930f);
            this.f6930f = null;
            file2.delete();
            throw th2;
        }
    }

    /* renamed from: c */
    public final void m6069c(C0858p c0858p) {
        long j10 = c0858p.f5854h;
        long j11 = -1;
        if (j10 != -1) {
            j11 = Math.min(j10 - this.f6933i, this.f6929e);
        }
        this.f6930f = this.f6925a.mo6054a((String) C4401z0.m22391j(c0858p.f5855i), c0858p.f5853g + this.f6933i, j11);
        OutputStream fileOutputStream = new FileOutputStream(this.f6930f);
        OutputStream outputStream = fileOutputStream;
        if (this.f6927c > 0) {
            C4369j0 c4369j0 = this.f6934j;
            if (c4369j0 == null) {
                this.f6934j = new C4369j0(fileOutputStream, this.f6927c);
            } else {
                c4369j0.m22053f(fileOutputStream);
            }
            outputStream = this.f6934j;
        }
        this.f6931g = outputStream;
        this.f6932h = 0L;
    }

    @Override // p027b9.InterfaceC0850k
    public void close() {
        if (this.f6928d == null) {
            return;
        }
        try {
            m6068b();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // p027b9.InterfaceC0850k
    public void write(byte[] bArr, int i10, int i11) {
        C0858p c0858p = this.f6928d;
        if (c0858p == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f6932h == this.f6929e) {
                    m6068b();
                    m6069c(c0858p);
                }
                int min = (int) Math.min(i11 - i12, this.f6929e - this.f6932h);
                ((OutputStream) C4401z0.m22391j(this.f6931g)).write(bArr, i10 + i12, min);
                i12 += min;
                long j10 = min;
                this.f6932h += j10;
                this.f6933i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
