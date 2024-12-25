package p064df;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:df/a.class
 */
/* renamed from: df.a */
/* loaded from: combined.jar:classes2.jar:df/a.class */
public class C4452a extends Thread {

    /* renamed from: b */
    public String f26840b;

    /* renamed from: c */
    public long f26841c = 0;

    /* renamed from: d */
    public long f26842d = 0;

    /* renamed from: e */
    public double f26843e = 0.0d;

    /* renamed from: f */
    public int f26844f = 0;

    /* renamed from: g */
    public double f26845g = 0.0d;

    /* renamed from: h */
    public boolean f26846h = false;

    /* renamed from: i */
    public double f26847i = 0.0d;

    /* renamed from: j */
    public int f26848j = 15;

    /* renamed from: k */
    public HttpURLConnection f26849k = null;

    public C4452a(String str) {
        this.f26840b = str;
    }

    /* renamed from: a */
    public double m22601a() {
        return m22604d(this.f26845g, 2);
    }

    /* renamed from: b */
    public double m22602b() {
        return this.f26847i;
    }

    /* renamed from: c */
    public boolean m22603c() {
        return this.f26846h;
    }

    /* renamed from: d */
    public final double m22604d(double d10, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        try {
            return new BigDecimal(d10).setScale(i10, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception e10) {
            return 0.0d;
        }
    }

    /* renamed from: e */
    public void m22605e(int i10, double d10) {
        this.f26847i = i10 >= 0 ? m22604d(Double.valueOf(((i10 * 8) / 1000000) / d10).doubleValue(), 2) : 0.0d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i10 = 0;
        this.f26844f = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f26840b + "random4000x4000.jpg");
        arrayList.add(this.f26840b + "random3000x3000.jpg");
        this.f26841c = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        loop0: while (it.hasNext()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) it.next()).openConnection();
                this.f26849k = httpURLConnection;
                i10 = httpURLConnection.getResponseCode();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (i10 == 200) {
                try {
                    byte[] bArr = new byte[10240];
                    InputStream inputStream = this.f26849k.getInputStream();
                    do {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            this.f26844f += read;
                            this.f26842d = System.currentTimeMillis();
                            double d10 = (r0 - this.f26841c) / 1000.0d;
                            this.f26843e = d10;
                            m22605e(this.f26844f, d10);
                        } else {
                            inputStream.close();
                            this.f26849k.disconnect();
                        }
                    } while (this.f26843e < this.f26848j);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                System.out.println("Link not found...");
            }
        }
        this.f26842d = System.currentTimeMillis();
        double d11 = (r0 - this.f26841c) / 1000.0d;
        this.f26843e = d11;
        this.f26845g = ((this.f26844f * 8) / 1000000.0d) / d11;
        this.f26846h = true;
    }
}
