package p022b4;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b4/i.class
 */
/* renamed from: b4.i */
/* loaded from: combined.jar:classes1.jar:b4/i.class */
public class C0799i {

    /* renamed from: a */
    public final int f5544a;

    /* renamed from: b */
    public final int f5545b;

    /* renamed from: c */
    public final Context f5546c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/i$a.class
     */
    /* renamed from: b4.i$a */
    /* loaded from: combined.jar:classes1.jar:b4/i$a.class */
    public static class a implements b {

        /* renamed from: a */
        public final DisplayMetrics f5547a;

        public a(DisplayMetrics displayMetrics) {
            this.f5547a = displayMetrics;
        }

        @Override // p022b4.C0799i.b
        /* renamed from: a */
        public int mo5115a() {
            return this.f5547a.heightPixels;
        }

        @Override // p022b4.C0799i.b
        /* renamed from: b */
        public int mo5116b() {
            return this.f5547a.widthPixels;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b4/i$b.class
     */
    /* renamed from: b4.i$b */
    /* loaded from: combined.jar:classes1.jar:b4/i$b.class */
    public interface b {
        /* renamed from: a */
        int mo5115a();

        /* renamed from: b */
        int mo5116b();
    }

    public C0799i(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new a(context.getResources().getDisplayMetrics()));
    }

    public C0799i(Context context, ActivityManager activityManager, b bVar) {
        this.f5546c = context;
        int m5110b = m5110b(activityManager);
        int mo5116b = bVar.mo5116b() * bVar.mo5115a() * 4;
        int i10 = mo5116b * 4;
        int i11 = mo5116b * 2;
        int i12 = i11 + i10;
        if (i12 <= m5110b) {
            this.f5545b = i11;
        } else {
            int round = Math.round(m5110b / 6.0f);
            this.f5545b = round * 2;
            i10 = round * 4;
        }
        this.f5544a = i10;
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculated memory cache size: ");
            sb2.append(m5114e(this.f5545b));
            sb2.append(" pool size: ");
            sb2.append(m5114e(this.f5544a));
            sb2.append(" memory class limited? ");
            sb2.append(i12 > m5110b);
            sb2.append(" max size: ");
            sb2.append(m5114e(m5110b));
            sb2.append(" memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(" isLowMemoryDevice: ");
            sb2.append(m5111d(activityManager));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    /* renamed from: b */
    public static int m5110b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (m5111d(activityManager) ? 0.33f : 0.4f));
    }

    @TargetApi(19)
    /* renamed from: d */
    public static boolean m5111d(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m5112a() {
        return this.f5544a;
    }

    /* renamed from: c */
    public int m5113c() {
        return this.f5545b;
    }

    /* renamed from: e */
    public final String m5114e(int i10) {
        return Formatter.formatFileSize(this.f5546c, i10);
    }
}
