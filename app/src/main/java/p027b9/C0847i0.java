package p027b9;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/i0.class
 */
/* renamed from: b9.i0 */
/* loaded from: combined.jar:classes2.jar:b9/i0.class */
public final class C0847i0 extends AbstractC0842g {

    /* renamed from: e */
    public final Resources f5811e;

    /* renamed from: f */
    public final String f5812f;

    /* renamed from: g */
    public Uri f5813g;

    /* renamed from: h */
    public AssetFileDescriptor f5814h;

    /* renamed from: i */
    public InputStream f5815i;

    /* renamed from: j */
    public long f5816j;

    /* renamed from: k */
    public boolean f5817k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/i0$a.class
     */
    /* renamed from: b9.i0$a */
    /* loaded from: combined.jar:classes2.jar:b9/i0$a.class */
    public static class a extends C0856n {
        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public C0847i0(Context context) {
        super(false);
        this.f5811e = context.getResources();
        this.f5812f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        int parseInt;
        String str;
        Uri uri = c0858p.f5847a;
        this.f5813g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C4349a.m21882e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) C4349a.m21882e(uri.getLastPathSegment()));
            } catch (NumberFormatException e10) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String str2 = (String) C4349a.m21882e(uri.getPath());
            String str3 = str2;
            if (str2.startsWith("/")) {
                str3 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(str3);
            parseInt = this.f5811e.getIdentifier(sb2.toString(), "raw", this.f5812f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        m5355t(c0858p);
        try {
            AssetFileDescriptor openRawResourceFd = this.f5811e.openRawResourceFd(parseInt);
            this.f5814h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f5815i = fileInputStream;
            if (length != -1) {
                try {
                    if (c0858p.f5853g > length) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                } catch (a e11) {
                    throw e11;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(c0858p.f5853g + startOffset) - startOffset;
            if (skip != c0858p.f5853g) {
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f5816j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f5816j = size;
                    if (size < 0) {
                        throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f5816j = j10;
                if (j10 < 0) {
                    throw new C0856n(AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = c0858p.f5854h;
            if (j11 != -1) {
                long j12 = this.f5816j;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f5816j = j11;
            }
            this.f5817k = true;
            m5356u(c0858p);
            long j13 = c0858p.f5854h;
            if (j13 == -1) {
                j13 = this.f5816j;
            }
            return j13;
        } catch (Resources.NotFoundException e13) {
            throw new a(null, e13, 2005);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5813g = null;
        try {
            try {
                InputStream inputStream = this.f5815i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f5815i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5814h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f5814h = null;
                    if (this.f5817k) {
                        this.f5817k = false;
                        m5354s();
                    }
                }
            } catch (Throwable th2) {
                this.f5815i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f5814h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f5814h = null;
                        if (this.f5817k) {
                            this.f5817k = false;
                            m5354s();
                        }
                        throw th2;
                    } catch (IOException e11) {
                        throw new a(null, e11, 2000);
                    }
                } finally {
                    this.f5814h = null;
                    if (this.f5817k) {
                        this.f5817k = false;
                        m5354s();
                    }
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5813g;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5816j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) C4401z0.m22391j(this.f5815i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f5816j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f5816j;
        if (j11 != -1) {
            this.f5816j = j11 - read;
        }
        m5353r(read);
        return read;
    }
}
