package p027b9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/h.class
 */
/* renamed from: b9.h */
/* loaded from: combined.jar:classes2.jar:b9/h.class */
public final class C0844h extends AbstractC0842g {

    /* renamed from: e */
    public final ContentResolver f5802e;

    /* renamed from: f */
    public Uri f5803f;

    /* renamed from: g */
    public AssetFileDescriptor f5804g;

    /* renamed from: h */
    public FileInputStream f5805h;

    /* renamed from: i */
    public long f5806i;

    /* renamed from: j */
    public boolean f5807j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:b9/h$a.class
     */
    /* renamed from: b9.h$a */
    /* loaded from: combined.jar:classes2.jar:b9/h$a.class */
    public static class a extends C0856n {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public C0844h(Context context) {
        super(false);
        this.f5802e = context.getContentResolver();
    }

    @Override // p027b9.InterfaceC0854m
    /* renamed from: a */
    public long mo521a(C0858p c0858p) {
        int i10 = 2000;
        try {
            Uri uri = c0858p.f5847a;
            this.f5803f = uri;
            m5355t(c0858p);
            AssetFileDescriptor openAssetFileDescriptor = this.f5802e.openAssetFileDescriptor(uri, "r");
            this.f5804g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f5805h = fileInputStream;
            if (length != -1 && c0858p.f5853g > length) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(c0858p.f5853g + startOffset) - startOffset;
            if (skip != c0858p.f5853g) {
                throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f5806i = -1L;
                } else {
                    long position = size - channel.position();
                    this.f5806i = position;
                    if (position < 0) {
                        throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            } else {
                long j10 = length - skip;
                this.f5806i = j10;
                if (j10 < 0) {
                    throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
            long j11 = c0858p.f5854h;
            if (j11 != -1) {
                long j12 = this.f5806i;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f5806i = j11;
            }
            this.f5807j = true;
            m5356u(c0858p);
            long j13 = c0858p.f5854h;
            if (j13 == -1) {
                j13 = this.f5806i;
            }
            return j13;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            if (e11 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new a(e11, i10);
        }
    }

    @Override // p027b9.InterfaceC0854m
    public void close() {
        this.f5803f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5805h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5805h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5804g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(e10, 2000);
                    }
                } finally {
                    this.f5804g = null;
                    if (this.f5807j) {
                        this.f5807j = false;
                        m5354s();
                    }
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f5805h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f5804g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f5804g = null;
                    if (this.f5807j) {
                        this.f5807j = false;
                        m5354s();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f5804g = null;
                if (this.f5807j) {
                    this.f5807j = false;
                    m5354s();
                }
            }
        }
    }

    @Override // p027b9.InterfaceC0854m
    public Uri getUri() {
        return this.f5803f;
    }

    @Override // p027b9.InterfaceC0846i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f5806i;
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
        int read = ((FileInputStream) C4401z0.m22391j(this.f5805h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f5806i;
        if (j11 != -1) {
            this.f5806i = j11 - read;
        }
        m5353r(read);
        return read;
    }
}
