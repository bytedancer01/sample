package p360v1;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v1/d.class
 */
/* renamed from: v1.d */
/* loaded from: combined.jar:classes1.jar:v1/d.class */
public class C9226d {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static void m38895a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
