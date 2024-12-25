package p425yc;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yc/g.class
 */
/* renamed from: yc.g */
/* loaded from: combined.jar:classes2.jar:yc/g.class */
public class C9980g {

    /* renamed from: c */
    public static C9980g f45701c;

    /* renamed from: d */
    public static final SimpleDateFormat f45702d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    public final SharedPreferences f45703a;

    /* renamed from: b */
    public final SharedPreferences f45704b;

    public C9980g(Context context) {
        this.f45703a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f45704b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* renamed from: a */
    public static C9980g m41922a(Context context) {
        C9980g c9980g;
        synchronized (C9980g.class) {
            try {
                if (f45701c == null) {
                    f45701c = new C9980g(context);
                }
                c9980g = f45701c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9980g;
    }

    /* renamed from: b */
    public static boolean m41923b(long j10, long j11) {
        Date date = new Date(j10);
        Date date2 = new Date(j11);
        SimpleDateFormat simpleDateFormat = f45702d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* renamed from: c */
    public boolean m41924c(long j10) {
        boolean m41925d;
        synchronized (this) {
            m41925d = m41925d("fire-global", j10);
        }
        return m41925d;
    }

    /* renamed from: d */
    public boolean m41925d(String str, long j10) {
        synchronized (this) {
            if (!this.f45703a.contains(str)) {
                this.f45703a.edit().putLong(str, j10).apply();
                return true;
            }
            if (!m41923b(this.f45703a.getLong(str, -1L), j10)) {
                return false;
            }
            this.f45703a.edit().putLong(str, j10).apply();
            return true;
        }
    }
}
