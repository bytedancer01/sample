package p127h9;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p185ka.C5543i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h9/d.class
 */
/* renamed from: h9.d */
/* loaded from: combined.jar:classes2.jar:h9/d.class */
public final class C5046d {
    /* renamed from: a */
    public static final void m25273a(String str) {
        try {
            try {
                C5543i.m27529b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    httpURLConnection.disconnect();
                    C5543i.m27528a();
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                String message = e.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message);
                Log.w("HttpUrlPinger", sb3.toString(), e);
                C5543i.m27528a();
            } catch (IndexOutOfBoundsException e11) {
                String message2 = e11.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb4.append("Error while parsing ping URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message2);
                Log.w("HttpUrlPinger", sb4.toString(), e11);
                C5543i.m27528a();
            } catch (RuntimeException e12) {
                e = e12;
                String message3 = e.getMessage();
                StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb32.append("Error while pinging URL: ");
                sb32.append(str);
                sb32.append(". ");
                sb32.append(message3);
                Log.w("HttpUrlPinger", sb32.toString(), e);
                C5543i.m27528a();
            }
        } catch (Throwable th3) {
            C5543i.m27528a();
            throw th3;
        }
    }
}
