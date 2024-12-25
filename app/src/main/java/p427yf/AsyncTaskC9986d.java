package p427yf;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import p083eh.C4726a;
import p135hh.C5092c;
import p135hh.C5118z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yf/d.class
 */
/* renamed from: yf.d */
/* loaded from: combined.jar:classes2.jar:yf/d.class */
public class AsyncTaskC9986d extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a */
    public WeakReference<Context> f45722a;

    /* renamed from: b */
    public a f45723b;

    /* renamed from: c */
    public FileInputStream f45724c;

    /* renamed from: d */
    public String f45725d;

    /* renamed from: e */
    public String f45726e;

    /* renamed from: f */
    public String f45727f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yf/d$a.class
     */
    /* renamed from: yf.d$a */
    /* loaded from: combined.jar:classes2.jar:yf/d$a.class */
    public interface a {
        /* renamed from: a */
        void mo19845a();

        /* renamed from: b */
        void mo19846b(String str);
    }

    public AsyncTaskC9986d(Context context, FileInputStream fileInputStream, String str, String str2, String str3, a aVar) {
        this.f45722a = new WeakReference<>(context);
        this.f45723b = aVar;
        this.f45724c = fileInputStream;
        this.f45725d = str;
        this.f45726e = str2;
        this.f45727f = str3;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        a aVar;
        String str;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f45724c));
            C5092c c5092c = new C5092c();
            c5092c.m25429o(bufferedReader, this.f45726e, this.f45727f, this.f45722a.get());
            C4726a m25420f = c5092c.m25420f();
            C5118z m25663g = C5118z.m25663g(this.f45722a.get());
            m25420f.f27826d = this.f45725d;
            m25420f.f27837j0 = "com.maxdigitall.maxdigitaliptvbox";
            m25420f.f27799B = null;
            m25420f.f27797A = null;
            m25663g.m25670a(m25420f);
            m25663g.m25673l(this.f45722a.get(), m25420f);
            m25663g.m25674n(this.f45722a.get());
            return Boolean.TRUE;
        } catch (C5092c.a e10) {
            cancel(true);
            aVar = this.f45723b;
            str = "ConfigParseError";
            aVar.mo19846b(str);
            return Boolean.FALSE;
        } catch (MalformedURLException e11) {
            cancel(true);
            aVar = this.f45723b;
            str = "MalformedURLException";
            aVar.mo19846b(str);
            return Boolean.FALSE;
        } catch (IOException e12) {
            cancel(true);
            aVar = this.f45723b;
            str = "IOException";
            aVar.mo19846b(str);
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public final boolean m41939b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        if (activeNetworkInfo != null) {
            z10 = false;
            if (activeNetworkInfo.isAvailable()) {
                z10 = false;
                if (activeNetworkInfo.isConnected()) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            this.f45723b.mo19845a();
        } else {
            this.f45723b.mo19846b("unknown error");
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        Context context = this.f45722a.get();
        if (context == null || this.f45723b == null) {
            cancel(true);
        } else {
            if (m41939b(context)) {
                return;
            }
            cancel(true);
            this.f45723b.mo19846b("No Network");
        }
    }
}
