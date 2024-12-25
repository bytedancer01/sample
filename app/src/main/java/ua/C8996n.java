package ua;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.achartengine.chart.TimeChart;
import p050d0.C4290b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/n.class
 */
/* renamed from: ua.n */
/* loaded from: combined.jar:classes2.jar:ua/n.class */
public final class C8996n extends AbstractC9119x5 {

    /* renamed from: c */
    public long f41426c;

    /* renamed from: d */
    public String f41427d;

    /* renamed from: e */
    public AccountManager f41428e;

    /* renamed from: f */
    public Boolean f41429f;

    /* renamed from: g */
    public long f41430g;

    public C8996n(C8870c5 c8870c5) {
        super(c8870c5);
    }

    @Override // ua.AbstractC9119x5
    /* renamed from: i */
    public final boolean mo37851i() {
        Calendar calendar = Calendar.getInstance();
        this.f41426c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f41427d = sb2.toString();
        return false;
    }

    /* renamed from: o */
    public final long m38135o() {
        m38335l();
        return this.f41426c;
    }

    /* renamed from: p */
    public final String m38136p() {
        m38335l();
        return this.f41427d;
    }

    /* renamed from: q */
    public final long m38137q() {
        mo37811h();
        return this.f41430g;
    }

    /* renamed from: r */
    public final void m38138r() {
        mo37811h();
        this.f41429f = null;
        this.f41430g = 0L;
    }

    /* renamed from: s */
    public final boolean m38139s() {
        mo37811h();
        long mo22432a = this.f41723a.mo37778a().mo22432a();
        if (mo22432a - this.f41430g > TimeChart.DAY) {
            this.f41429f = null;
        }
        Boolean bool = this.f41429f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C4290b.m21722a(this.f41723a.mo37779b(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f41723a.mo37780c().m38412s().m38326a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f41428e == null) {
                this.f41428e = AccountManager.get(this.f41723a.mo37779b());
            }
            try {
                Account[] result = this.f41428e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f41429f = Boolean.TRUE;
                    this.f41430g = mo22432a;
                    return true;
                }
                Account[] result2 = this.f41428e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f41429f = Boolean.TRUE;
                    this.f41430g = mo22432a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.f41723a.mo37780c().m38409p().m38327b("Exception checking account types", e10);
            }
        }
        this.f41430g = mo22432a;
        this.f41429f = Boolean.FALSE;
        return false;
    }
}
