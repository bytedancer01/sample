package p073e4;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p363v4.C9235a;
import p396x3.InterfaceC9645b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/o.class
 */
/* renamed from: e4.o */
/* loaded from: combined.jar:classes1.jar:e4/o.class */
public class C4620o implements InterfaceC9645b<InputStream> {
    @Override // p396x3.InterfaceC9645b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo23245a(InputStream inputStream, OutputStream outputStream) {
        byte[] m38943b = C9235a.m38942a().m38943b();
        while (true) {
            try {
                try {
                    int read = inputStream.read(m38943b);
                    if (read == -1) {
                        C9235a.m38942a().m38944c(m38943b);
                        return true;
                    }
                    outputStream.write(m38943b, 0, read);
                } catch (IOException e10) {
                    if (Log.isLoggable("StreamEncoder", 3)) {
                        Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e10);
                    }
                    C9235a.m38942a().m38944c(m38943b);
                    return false;
                }
            } catch (Throwable th2) {
                C9235a.m38942a().m38944c(m38943b);
                throw th2;
            }
        }
    }

    @Override // p396x3.InterfaceC9645b
    public String getId() {
        return "";
    }
}
