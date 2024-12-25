package net.butterflytv.rtmp_client;

import com.amazonaws.services.p045s3.internal.Constants;
import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:net/butterflytv/rtmp_client/RtmpClient.class
 */
/* loaded from: combined.jar:classes2.jar:net/butterflytv/rtmp_client/RtmpClient.class */
public class RtmpClient {

    /* renamed from: a */
    public long f35385a = 0;

    /* renamed from: b */
    public int f35386b = Constants.MAXIMUM_UPLOAD_PARTS;

    /* renamed from: c */
    public int f35387c = Constants.MAXIMUM_UPLOAD_PARTS;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:net/butterflytv/rtmp_client/RtmpClient$a.class
     */
    /* renamed from: net.butterflytv.rtmp_client.RtmpClient$a */
    /* loaded from: combined.jar:classes2.jar:net/butterflytv/rtmp_client/RtmpClient$a.class */
    public static class C6782a extends IOException {

        /* renamed from: b */
        public final int f35388b;

        public C6782a(int i10) {
            super("RTMP error: " + i10);
            this.f35388b = i10;
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j10);

    private native int nativeOpen(String str, boolean z10, long j10, int i10, int i11);

    private native int nativeRead(byte[] bArr, int i10, int i11, long j10);

    /* renamed from: a */
    public void m31239a() {
        nativeClose(this.f35385a);
        this.f35385a = 0L;
    }

    /* renamed from: b */
    public void m31240b(String str, boolean z10) {
        long nativeAlloc = nativeAlloc();
        this.f35385a = nativeAlloc;
        if (nativeAlloc == 0) {
            throw new C6782a(-2);
        }
        int nativeOpen = nativeOpen(str, z10, nativeAlloc, this.f35386b, this.f35387c);
        if (nativeOpen == 0) {
            return;
        }
        this.f35385a = 0L;
        throw new C6782a(nativeOpen);
    }

    /* renamed from: c */
    public int m31241c(byte[] bArr, int i10, int i11) {
        int nativeRead = nativeRead(bArr, i10, i11, this.f35385a);
        if (nativeRead >= 0 || nativeRead == -1) {
            return nativeRead;
        }
        throw new C6782a(nativeRead);
    }
}
