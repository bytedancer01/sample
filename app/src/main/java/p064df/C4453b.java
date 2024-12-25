package p064df;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.protocol.HTTP;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:df/b.class
 */
/* renamed from: df.b */
/* loaded from: combined.jar:classes2.jar:df/b.class */
public class C4453b extends Thread {

    /* renamed from: b */
    public URL f26850b;

    public C4453b(URL url) {
        this.f26850b = url;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        byte[] bArr = new byte[153600];
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            try {
                httpURLConnection = (HttpURLConnection) this.f26850b.openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", HTTP.CONN_KEEP_ALIVE);
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr, 0, 153600);
                dataOutputStream.flush();
                httpURLConnection.getResponseCode();
                C4454c.f26851h = (int) (C4454c.f26851h + (153600 / 1024.0d));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if ((System.currentTimeMillis() - currentTimeMillis) / 1000.0d >= 10) {
                return;
            }
            dataOutputStream.close();
            httpURLConnection.disconnect();
        }
    }
}
