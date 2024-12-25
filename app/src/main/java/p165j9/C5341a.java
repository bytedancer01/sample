package p165j9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j9/a.class
 */
/* renamed from: j9.a */
/* loaded from: combined.jar:classes2.jar:j9/a.class */
public class C5341a {

    /* renamed from: c */
    public static final Lock f30640c = new ReentrantLock();

    /* renamed from: d */
    public static C5341a f30641d;

    /* renamed from: a */
    public final Lock f30642a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f30643b;

    public C5341a(Context context) {
        this.f30643b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C5341a m26618a(Context context) {
        C9935o.m41850j(context);
        Lock lock = f30640c;
        lock.lock();
        try {
            if (f30641d == null) {
                f30641d = new C5341a(context.getApplicationContext());
            }
            C5341a c5341a = f30641d;
            lock.unlock();
            return c5341a;
        } catch (Throwable th2) {
            f30640c.unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    public static final String m26619d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: b */
    public GoogleSignInAccount m26620b() {
        GoogleSignInAccount googleSignInAccount;
        String m26621c = m26621c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m26621c)) {
            googleSignInAccount = null;
        } else {
            String m26621c2 = m26621c(m26619d("googleSignInAccount", m26621c));
            googleSignInAccount = null;
            if (m26621c2 != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m13026a0(m26621c2);
                } catch (JSONException e10) {
                    googleSignInAccount = null;
                }
            }
        }
        return googleSignInAccount;
    }

    /* renamed from: c */
    public final String m26621c(String str) {
        this.f30642a.lock();
        try {
            return this.f30643b.getString(str, null);
        } finally {
            this.f30642a.unlock();
        }
    }
}
