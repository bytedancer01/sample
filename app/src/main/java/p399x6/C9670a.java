package p399x6;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x6/a.class
 */
/* renamed from: x6.a */
/* loaded from: combined.jar:classes2.jar:x6/a.class */
public final class C9670a extends UploadDataProvider {

    /* renamed from: b */
    public final byte[] f44092b;

    /* renamed from: c */
    public int f44093c;

    public C9670a(byte[] bArr) {
        this.f44092b = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.f44092b.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.f44092b.length - this.f44093c);
        byteBuffer.put(this.f44092b, this.f44093c, min);
        this.f44093c += min;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.f44093c = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
