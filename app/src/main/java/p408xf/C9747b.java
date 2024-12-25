package p408xf;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.joda.time.LocalDate;
import p151if.C5251a;
import p428yg.C10013s;
import p428yg.C10014t;
import p428yg.InterfaceC9993c0;
import tg.C8741q;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xf/b.class
 */
/* renamed from: xf.b */
/* loaded from: combined.jar:classes2.jar:xf/b.class */
public class C9747b {

    /* renamed from: a */
    public static SimpleDateFormat f44484a;

    /* renamed from: b */
    public static C10014t f44485b;

    /* renamed from: c */
    public static SharedPreferences f44486c;

    /* renamed from: d */
    public static Context f44487d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xf/b$a.class
     */
    /* renamed from: xf.b$a */
    /* loaded from: combined.jar:classes2.jar:xf/b$a.class */
    public class a implements C10014t.d {
        @Override // p428yg.C10014t.d
        /* renamed from: a */
        public void mo41056a(C10014t c10014t, Uri uri, Exception exc) {
            Log.e("EPGUtil", exc.getMessage());
        }
    }

    /* renamed from: a */
    public static String m41052a(long j10) {
        LocalDate localDate = new LocalDate(j10);
        return localDate.dayOfWeek().getAsShortText() + " " + localDate.getDayOfMonth() + "/" + localDate.getMonthOfYear();
    }

    /* renamed from: b */
    public static String m41053b(Context context, long j10) {
        f44487d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f44486c = sharedPreferences;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sharedPreferences.getString("timeFormat", C5251a.f30053m0), Locale.US);
        f44484a = simpleDateFormat;
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    /* renamed from: c */
    public static void m41054c(Context context) {
        if (f44485b == null) {
            f44485b = new C10014t.b(context).m42122b(new C10013s(new C8741q())).m42123c(new a()).m42121a();
        }
    }

    /* renamed from: d */
    public static void m41055d(Context context, String str, int i10, int i11, InterfaceC9993c0 interfaceC9993c0) {
        m41054c(context);
        ((str == null || str.equals("")) ? f44485b.m42114j(2131231571) : f44485b.m42116l(str).m42155k(i10, i11).m42146b()).m42153i(interfaceC9993c0);
    }
}
