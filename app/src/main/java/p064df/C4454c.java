package p064df;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:df/c.class
 */
/* renamed from: df.c */
/* loaded from: combined.jar:classes2.jar:df/c.class */
public class C4454c extends Thread {

    /* renamed from: h */
    public static int f26851h;

    /* renamed from: b */
    public String f26852b;

    /* renamed from: c */
    public double f26853c = 0.0d;

    /* renamed from: d */
    public boolean f26854d = false;

    /* renamed from: e */
    public double f26855e = 0.0d;

    /* renamed from: f */
    public double f26856f = 0.0d;

    /* renamed from: g */
    public long f26857g;

    public C4454c(String str) {
        this.f26852b = str;
    }

    /* renamed from: a */
    public double m22606a() {
        return m22609d(this.f26856f, 2);
    }

    /* renamed from: b */
    public double m22607b() {
        double d10 = 0.0d;
        try {
            new BigDecimal(f26851h);
            if (f26851h >= 0) {
                double currentTimeMillis = (System.currentTimeMillis() - this.f26857g) / 1000.0d;
                this.f26855e = currentTimeMillis;
                d10 = m22609d(Double.valueOf(((f26851h / 1000.0d) * 8.0d) / currentTimeMillis).doubleValue(), 2);
            }
        } catch (Exception e10) {
        }
        return d10;
    }

    /* renamed from: c */
    public boolean m22608c() {
        return this.f26854d;
    }

    /* renamed from: d */
    public final double m22609d(double d10, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        try {
            return new BigDecimal(d10).setScale(i10, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception e10) {
            return 0.0d;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            URL url = new URL(this.f26852b);
            f26851h = 0;
            this.f26857g = System.currentTimeMillis();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
            for (int i10 = 0; i10 < 4; i10++) {
                newFixedThreadPool.execute(new C4453b(url));
            }
            newFixedThreadPool.shutdown();
            while (!newFixedThreadPool.isTerminated()) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e10) {
                }
            }
            double currentTimeMillis = (System.currentTimeMillis() - this.f26857g) / 1000.0d;
            this.f26853c = currentTimeMillis;
            this.f26856f = Double.valueOf(((f26851h / 1000.0d) * 8.0d) / currentTimeMillis).doubleValue();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f26854d = true;
    }
}
