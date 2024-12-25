package p151if;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:if/c.class
 */
/* renamed from: if.c */
/* loaded from: combined.jar:classes2.jar:if/c.class */
public class C5253c extends Thread {

    /* renamed from: b */
    public HashMap<Integer, String> f30079b = new HashMap<>();

    /* renamed from: c */
    public HashMap<Integer, List<String>> f30080c = new HashMap<>();

    /* renamed from: d */
    public double f30081d = 0.0d;

    /* renamed from: e */
    public double f30082e = 0.0d;

    /* renamed from: f */
    public boolean f30083f = false;

    /* renamed from: a */
    public HashMap<Integer, String> m26193a() {
        return this.f30079b;
    }

    /* renamed from: b */
    public double m26194b() {
        return this.f30081d;
    }

    /* renamed from: c */
    public double m26195c() {
        return this.f30082e;
    }

    /* renamed from: d */
    public HashMap<Integer, List<String>> m26196d() {
        return this.f30080c;
    }

    /* renamed from: e */
    public boolean m26197e() {
        return this.f30083f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-config.php").openConnection();
            httpURLConnection.getContentLength();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains("isp=")) {
                            this.f30081d = Double.parseDouble(readLine.split("lat=\"")[1].split(" ")[0].replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ""));
                            this.f30082e = Double.parseDouble(readLine.split("lon=\"")[1].split(" ")[0].replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, ""));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            }
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-servers-static.php").openConnection();
                if (httpURLConnection2.getResponseCode() == 200) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    int i10 = 0;
                    while (true) {
                        String readLine2 = bufferedReader2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        if (readLine2.contains("<server url")) {
                            String str = readLine2.split("server url=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0];
                            List<String> asList = Arrays.asList(readLine2.split("lat=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("lon=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("name=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("country=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("cc=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("sponsor=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0], readLine2.split("host=\"")[1].split(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)[0]);
                            this.f30079b.put(Integer.valueOf(i10), str);
                            this.f30080c.put(Integer.valueOf(i10), asList);
                            i10++;
                        }
                    }
                    bufferedReader2.close();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f30083f = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
