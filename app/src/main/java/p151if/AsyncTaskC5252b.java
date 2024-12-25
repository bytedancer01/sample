package p151if;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.maxdigitall.maxdigitaliptvbox.model.database.SharepreferenceDBHandler;
import org.apache.http.protocol.HttpRequestExecutor;
import org.jsoup.Jsoup;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:if/b.class
 */
/* renamed from: if.b */
/* loaded from: combined.jar:classes2.jar:if/b.class */
public class AsyncTaskC5252b extends AsyncTask<Void, String, String> {

    /* renamed from: a */
    public Context f30077a;

    /* renamed from: b */
    public String f30078b;

    public AsyncTaskC5252b(Context context) {
        this.f30078b = "";
        this.f30077a = context;
        try {
            this.f30078b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public String m26190a(String str) {
        return str.replaceAll("[\\-\\+\\.\\^:,]", "");
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        String str;
        try {
            str = Jsoup.connect("https://play.google.com/store/apps/details?id=com.maxdigitall.maxdigitaliptvbox&hl=en").timeout(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE).userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6").referrer("http://www.google.com").get().select(" div.hAyfc:nth-child(4) > span:nth-child(2) >div:nth-child(1) > span:nth-child(1)").first().ownText();
        } catch (Exception e10) {
            str = null;
        }
        return str;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        String str2;
        String str3;
        int i10;
        int i11;
        super.onPostExecute(str);
        if (str == null || str.isEmpty()) {
            SharepreferenceDBHandler.m15354R(false, this.f30077a);
            SharepreferenceDBHandler.m15353Q(false, this.f30077a);
            return;
        }
        SharepreferenceDBHandler.m15353Q(true, this.f30077a);
        if (str.matches("\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d") || str.matches("\\d\\.\\d\\.\\d\\.\\d")) {
            String m26190a = m26190a(str);
            String m26190a2 = m26190a(this.f30078b);
            if (m26190a.length() > m26190a2.length()) {
                int length = m26190a.length();
                int length2 = m26190a2.length();
                StringBuffer stringBuffer = new StringBuffer(m26190a2);
                for (int i12 = 0; i12 < length - length2; i12++) {
                    stringBuffer.append(0);
                }
                str2 = stringBuffer.toString();
                str3 = m26190a;
            } else {
                str2 = m26190a2;
                str3 = m26190a;
                if (m26190a.length() < m26190a2.length()) {
                    int length3 = m26190a2.length();
                    int length4 = m26190a.length();
                    StringBuffer stringBuffer2 = new StringBuffer(m26190a);
                    for (int i13 = 0; i13 < length3 - length4; i13++) {
                        stringBuffer2.append(0);
                    }
                    str3 = stringBuffer2.toString();
                    str2 = m26190a2;
                }
            }
            try {
                i10 = Integer.parseInt(str3);
                i11 = Integer.parseInt(str2);
            } catch (NumberFormatException e10) {
                i10 = 1;
                i11 = 1;
            }
            if (i10 > i11) {
                SharepreferenceDBHandler.m15354R(true, this.f30077a);
                return;
            }
        }
        SharepreferenceDBHandler.m15354R(false, this.f30077a);
    }
}
