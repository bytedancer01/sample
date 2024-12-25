package p049d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import org.achartengine.chart.TimeChart;
import p050d0.C4298j;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d/m.class
 */
/* renamed from: d.m */
/* loaded from: combined.jar:classes1.jar:d/m.class */
public class C4287m {

    /* renamed from: d */
    public static C4287m f26365d;

    /* renamed from: a */
    public final Context f26366a;

    /* renamed from: b */
    public final LocationManager f26367b;

    /* renamed from: c */
    public final a f26368c = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:d/m$a.class
     */
    /* renamed from: d.m$a */
    /* loaded from: combined.jar:classes1.jar:d/m$a.class */
    public static class a {

        /* renamed from: a */
        public boolean f26369a;

        /* renamed from: b */
        public long f26370b;

        /* renamed from: c */
        public long f26371c;

        /* renamed from: d */
        public long f26372d;

        /* renamed from: e */
        public long f26373e;

        /* renamed from: f */
        public long f26374f;
    }

    public C4287m(Context context, LocationManager locationManager) {
        this.f26366a = context;
        this.f26367b = locationManager;
    }

    /* renamed from: a */
    public static C4287m m21682a(Context context) {
        if (f26365d == null) {
            Context applicationContext = context.getApplicationContext();
            f26365d = new C4287m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f26365d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location m21683b() {
        Location location = null;
        Location m21684c = C4298j.m21759b(this.f26366a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m21684c("network") : null;
        if (C4298j.m21759b(this.f26366a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m21684c("gps");
        }
        if (location == null || m21684c == null) {
            if (location != null) {
                m21684c = location;
            }
            return m21684c;
        }
        Location location2 = m21684c;
        if (location.getTime() > m21684c.getTime()) {
            location2 = location;
        }
        return location2;
    }

    /* renamed from: c */
    public final Location m21684c(String str) {
        try {
            if (this.f26367b.isProviderEnabled(str)) {
                return this.f26367b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* renamed from: d */
    public boolean m21685d() {
        a aVar = this.f26368c;
        if (m21686e()) {
            return aVar.f26369a;
        }
        Location m21683b = m21683b();
        if (m21683b != null) {
            m21687f(m21683b);
            return aVar.f26369a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    /* renamed from: e */
    public final boolean m21686e() {
        return this.f26368c.f26374f > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void m21687f(Location location) {
        long j10;
        a aVar = this.f26368c;
        long currentTimeMillis = System.currentTimeMillis();
        C4286l m21680b = C4286l.m21680b();
        m21680b.m21681a(currentTimeMillis - TimeChart.DAY, location.getLatitude(), location.getLongitude());
        long j11 = m21680b.f26362a;
        m21680b.m21681a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = m21680b.f26364c == 1;
        long j12 = m21680b.f26363b;
        long j13 = m21680b.f26362a;
        m21680b.m21681a(TimeChart.DAY + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = m21680b.f26363b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f26369a = z10;
        aVar.f26370b = j11;
        aVar.f26371c = j12;
        aVar.f26372d = j13;
        aVar.f26373e = j14;
        aVar.f26374f = j10;
    }
}
