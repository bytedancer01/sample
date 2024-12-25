package ve;

import android.content.Context;
import android.content.Intent;
import org.achartengine.chart.TimeChart;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ve/d.class
 */
/* renamed from: ve.d */
/* loaded from: combined.jar:classes2.jar:ve/d.class */
public class C9343d {
    /* renamed from: a */
    public static boolean m39380a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    /* renamed from: b */
    public static String m39381b(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    /* renamed from: c */
    public static String m39382c(String str) {
        return str.substring(0, str.lastIndexOf("/"));
    }

    /* renamed from: d */
    public static String m39383d(long j10) {
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        long j11 = (j10 % TimeChart.DAY) / 3600000;
        long j12 = (j10 % 3600000) / 60000;
        long j13 = (j10 % 60000) / 1000;
        if (j11 < 10) {
            sb2 = new StringBuilder();
            sb2.append("0");
            sb2.append(j11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j11);
            sb2.append("");
        }
        String sb6 = sb2.toString();
        if (j12 < 10) {
            sb3 = new StringBuilder();
            sb3.append("0");
            sb3.append(j12);
        } else {
            sb3 = new StringBuilder();
            sb3.append(j12);
            sb3.append("");
        }
        String sb7 = sb3.toString();
        if (j13 < 10) {
            sb4 = new StringBuilder();
            sb4.append("0");
            sb4.append(j13);
        } else {
            sb4 = new StringBuilder();
            sb4.append(j13);
            sb4.append("");
        }
        String sb8 = sb4.toString();
        if (j11 != 0) {
            sb5 = new StringBuilder();
            sb5.append(sb6);
            sb5.append(":");
        } else {
            sb5 = new StringBuilder();
        }
        sb5.append(sb7);
        sb5.append(":");
        sb5.append(sb8);
        return sb5.toString();
    }
}
