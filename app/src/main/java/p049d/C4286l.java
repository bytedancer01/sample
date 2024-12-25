package p049d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/l.class
 */
/* renamed from: d.l */
/* loaded from: combined.jar:classes1.jar:d/l.class */
public class C4286l {

    /* renamed from: d */
    public static C4286l f26361d;

    /* renamed from: a */
    public long f26362a;

    /* renamed from: b */
    public long f26363b;

    /* renamed from: c */
    public int f26364c;

    /* renamed from: b */
    public static C4286l m21680b() {
        if (f26361d == null) {
            f26361d = new C4286l();
        }
        return f26361d;
    }

    /* renamed from: a */
    public void m21681a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r0) * 3.4906598739326E-4d) + (Math.sin(r0 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = Math.round((r0 - 9.0E-4f) - r0) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f26364c = 1;
        } else {
            if (sin2 > -1.0d) {
                double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
                this.f26362a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
                long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
                this.f26363b = round2;
                if (round2 >= j10 || this.f26362a <= j10) {
                    this.f26364c = 1;
                    return;
                } else {
                    this.f26364c = 0;
                    return;
                }
            }
            this.f26364c = 0;
        }
        this.f26362a = -1L;
        this.f26363b = -1L;
    }
}
