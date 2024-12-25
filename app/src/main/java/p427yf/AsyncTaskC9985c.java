package p427yf;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yf/c.class
 */
/* renamed from: yf.c */
/* loaded from: combined.jar:classes2.jar:yf/c.class */
public class AsyncTaskC9985c extends AsyncTask<String, String, String> {

    /* renamed from: a */
    public a f45717a;

    /* renamed from: b */
    public Context f45718b;

    /* renamed from: c */
    public FileDescriptor f45719c;

    /* renamed from: d */
    public File f45720d;

    /* renamed from: e */
    public String f45721e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/c$a.class
     */
    /* renamed from: yf.c$a */
    /* loaded from: combined.jar:classes2.jar:yf/c$a.class */
    public interface a {
        /* renamed from: a */
        void mo19815a(File file);
    }

    public AsyncTaskC9985c(String str, Context context, a aVar) {
        this.f45718b = context;
        this.f45717a = aVar;
        this.f45721e = str;
    }

    /* renamed from: a */
    public void m41934a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        HttpURLConnection httpURLConnection;
        boolean z10;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection2.setInstanceFollowRedirects(true);
            httpURLConnection2.connect();
            do {
                if (httpURLConnection2.getResponseCode() != 301 && httpURLConnection2.getResponseCode() != 302) {
                    z10 = false;
                    httpURLConnection = httpURLConnection2;
                    httpURLConnection2 = httpURLConnection;
                }
                httpURLConnection = (HttpURLConnection) new URL(httpURLConnection2.getHeaderField("Location")).openConnection();
                httpURLConnection.connect();
                z10 = true;
                httpURLConnection2 = httpURLConnection;
            } while (z10);
            int contentLength = httpURLConnection.getContentLength();
            Log.d("DOWNLOADFILE", "Length of the file: " + contentLength);
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f45721e);
            this.f45720d = file;
            m41934a(file.getParent());
            FileOutputStream fileOutputStream = new FileOutputStream(this.f45720d);
            Log.d("DOWNLOADFILE", "file saved at " + this.f45720d.getAbsolutePath());
            this.f45719c = fileOutputStream.getFD();
            byte[] bArr = new byte[1024];
            long j10 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return null;
                }
                j10 += read;
                publishProgress("" + ((int) ((100 * j10) / contentLength)));
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e10) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f45717a;
        if (aVar != null) {
            aVar.mo19815a(this.f45720d);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(String... strArr) {
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }
}
