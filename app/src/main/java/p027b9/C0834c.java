package p027b9;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/c.class
 */
/* renamed from: b9.c */
/* loaded from: combined.jar:classes2.jar:b9/c.class */
public final class C0834c extends AbstractC0842g {

    /* renamed from: e */
    public final AssetManager f5749e;

    /* renamed from: f */
    public Uri f5750f;

    /* renamed from: g */
    public InputStream f5751g;

    /* renamed from: h */
    public long f5752h;

    /* renamed from: i */
    public boolean f5753i;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/c$a.class
     */
    /* renamed from: b9.c$a */
    /* loaded from: combined.jar:classes2.jar:b9/c$a.class */
    public static final class a extends C0856n {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C0834c(Context context) {
        super(false);
        this.f5749e = context.getAssets();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        String str;
        try {
            Uri uri = c0858p.f5847a;
            this.f5750f = uri;
            String str2 = (String) C4349a.m21882e(uri.getPath());
            if (str2.startsWith("/android_asset/")) {
                str = str2.substring(15);
            } else {
                str = str2;
                if (str2.startsWith("/")) {
                    str = str2.substring(1);
                }
            }
            m5355t(c0858p);
            InputStream open = this.f5749e.open(str, 1);
            this.f5751g = open;
            if (open.skip(c0858p.f5853g) < c0858p.f5853g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long j10 = c0858p.f5854h;
            if (j10 != -1) {
                this.f5752h = j10;
            } else {
                long available = this.f5751g.available();
                this.f5752h = available;
                if (available == 2147483647L) {
                    this.f5752h = -1L;
                }
            }
            this.f5753i = true;
            m5356u(c0858p);
            return this.f5752h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5750f = null;
        try {
            try {
                InputStream inputStream = this.f5751g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f5751g = null;
            if (this.f5753i) {
                this.f5753i = false;
                m5354s();
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5750f;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5752h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) C4401z0.m22391j(this.f5751g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f5752h;
        if (j11 != -1) {
            this.f5752h = j11 - read;
        }
        m5353r(read);
        return read;
    }
}
