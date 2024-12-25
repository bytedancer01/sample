package p064df;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:df/d.class
 */
/* renamed from: df.d */
/* loaded from: combined.jar:classes2.jar:df/d.class */
public class C4455d extends Thread {

    /* renamed from: c */
    public String f26859c;

    /* renamed from: d */
    public int f26860d;

    /* renamed from: b */
    public HashMap<String, Object> f26858b = new HashMap<>();

    /* renamed from: e */
    public double f26861e = 0.0d;

    /* renamed from: f */
    public double f26862f = 0.0d;

    /* renamed from: g */
    public boolean f26863g = false;

    /* renamed from: h */
    public boolean f26864h = false;

    public C4455d(String str, int i10) {
        this.f26859c = str;
        this.f26860d = i10;
    }

    /* renamed from: a */
    public double m22610a() {
        return this.f26862f;
    }

    /* renamed from: b */
    public double m22611b() {
        return this.f26861e;
    }

    /* renamed from: c */
    public boolean m22612c() {
        return this.f26863g;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c" + this.f26860d, this.f26859c);
            processBuilder.redirectErrorStream(true);
            Process start = processBuilder.start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.contains("icmp_seq")) {
                    this.f26861e = Double.parseDouble(readLine.split(" ")[readLine.split(" ").length - 2].replace("time=", ""));
                }
                if (readLine.startsWith("rtt ")) {
                    this.f26862f = Double.parseDouble(readLine.split("/")[4]);
                    break;
                }
            }
            start.waitFor();
            bufferedReader.close();
        } catch (IOException | InterruptedException | Exception e10) {
            e10.printStackTrace();
        }
        this.f26863g = true;
    }
}
