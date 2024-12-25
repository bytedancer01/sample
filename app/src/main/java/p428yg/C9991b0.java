package p428yg;

import java.io.PrintWriter;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/b0.class
 */
/* renamed from: yg.b0 */
/* loaded from: combined.jar:classes2.jar:yg/b0.class */
public class C9991b0 {

    /* renamed from: a */
    public final int f45787a;

    /* renamed from: b */
    public final int f45788b;

    /* renamed from: c */
    public final long f45789c;

    /* renamed from: d */
    public final long f45790d;

    /* renamed from: e */
    public final long f45791e;

    /* renamed from: f */
    public final long f45792f;

    /* renamed from: g */
    public final long f45793g;

    /* renamed from: h */
    public final long f45794h;

    /* renamed from: i */
    public final long f45795i;

    /* renamed from: j */
    public final long f45796j;

    /* renamed from: k */
    public final int f45797k;

    /* renamed from: l */
    public final int f45798l;

    /* renamed from: m */
    public final int f45799m;

    /* renamed from: n */
    public final long f45800n;

    public C9991b0(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f45787a = i10;
        this.f45788b = i11;
        this.f45789c = j10;
        this.f45790d = j11;
        this.f45791e = j12;
        this.f45792f = j13;
        this.f45793g = j14;
        this.f45794h = j15;
        this.f45795i = j16;
        this.f45796j = j17;
        this.f45797k = i12;
        this.f45798l = i13;
        this.f45799m = i14;
        this.f45800n = j18;
    }

    /* renamed from: a */
    public void m42000a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f45787a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f45788b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f45788b / this.f45787a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f45789c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f45790d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f45797k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f45791e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f45794h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f45798l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f45792f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f45799m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f45793g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f45795i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f45796j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f45787a + ", size=" + this.f45788b + ", cacheHits=" + this.f45789c + ", cacheMisses=" + this.f45790d + ", downloadCount=" + this.f45797k + ", totalDownloadSize=" + this.f45791e + ", averageDownloadSize=" + this.f45794h + ", totalOriginalBitmapSize=" + this.f45792f + ", totalTransformedBitmapSize=" + this.f45793g + ", averageOriginalBitmapSize=" + this.f45795i + ", averageTransformedBitmapSize=" + this.f45796j + ", originalBitmapCount=" + this.f45798l + ", transformedBitmapCount=" + this.f45799m + ", timeStamp=" + this.f45800n + '}';
    }
}
