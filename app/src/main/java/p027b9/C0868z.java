package p027b9;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p027b9.InterfaceC0854m;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/z.class
 */
/* renamed from: b9.z */
/* loaded from: combined.jar:classes2.jar:b9/z.class */
public final class C0868z extends AbstractC0842g {

    /* renamed from: e */
    public RandomAccessFile f5945e;

    /* renamed from: f */
    public Uri f5946f;

    /* renamed from: g */
    public long f5947g;

    /* renamed from: h */
    public boolean f5948h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/z$a.class
     */
    /* renamed from: b9.z$a */
    /* loaded from: combined.jar:classes2.jar:b9/z$a.class */
    public static final class a implements InterfaceC0854m.a {

        /* renamed from: a */
        public InterfaceC0853l0 f5949a;

        @Override // p027b9.InterfaceC0854m.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0868z mo5296a() {
            C0868z c0868z = new C0868z();
            InterfaceC0853l0 interfaceC0853l0 = this.f5949a;
            if (interfaceC0853l0 != null) {
                c0868z.mo522c(interfaceC0853l0);
            }
            return c0868z;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/z$b.class
     */
    /* renamed from: b9.z$b */
    /* loaded from: combined.jar:classes2.jar:b9/z$b.class */
    public static class b extends C0856n {
        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/z$c.class
     */
    /* renamed from: b9.z$c */
    /* loaded from: combined.jar:classes2.jar:b9/z$c.class */
    public static final class c {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m5434b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public C0868z() {
        super(false);
    }

    /* renamed from: v */
    public static RandomAccessFile m5431v(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) C4349a.m21882e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
            }
            if (C4401z0.f26679a < 21 || !c.m5434b(e10.getCause())) {
                i10 = 2005;
            }
            throw new b(e10, i10);
        } catch (SecurityException e11) {
            throw new b(e11, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        Uri uri = c0858p.f5847a;
        this.f5946f = uri;
        m5355t(c0858p);
        RandomAccessFile m5431v = m5431v(uri);
        this.f5945e = m5431v;
        try {
            m5431v.seek(c0858p.f5853g);
            long j10 = c0858p.f5854h;
            long j11 = j10;
            if (j10 == -1) {
                j11 = this.f5945e.length() - c0858p.f5853g;
            }
            this.f5947g = j11;
            if (j11 < 0) {
                throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            this.f5948h = true;
            m5356u(c0858p);
            return this.f5947g;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5946f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f5945e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f5945e = null;
            if (this.f5948h) {
                this.f5948h = false;
                m5354s();
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5946f;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5947g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C4401z0.m22391j(this.f5945e)).read(bArr, i10, (int) Math.min(this.f5947g, i11));
            if (read > 0) {
                this.f5947g -= read;
                m5353r(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
