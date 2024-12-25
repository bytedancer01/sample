package p407xe;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xe/d.class
 */
/* renamed from: xe.d */
/* loaded from: combined.jar:classes2.jar:xe/d.class */
public class AsyncTaskC9742d extends AsyncTask<String, Void, String> {

    /* renamed from: a */
    public C9739a f44456a;

    /* renamed from: b */
    public InterfaceC9741c<String> f44457b;

    /* renamed from: c */
    public int f44458c;

    /* renamed from: d */
    public boolean f44459d = false;

    /* renamed from: e */
    public Context f44460e;

    /* renamed from: f */
    public String f44461f;

    /* renamed from: g */
    public String f44462g;

    /* renamed from: h */
    public List<C9743e> f44463h;

    /* renamed from: i */
    public Boolean f44464i;

    /* renamed from: j */
    public Dialog f44465j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xe/d$a.class
     */
    /* renamed from: xe.d$a */
    /* loaded from: combined.jar:classes2.jar:xe/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final AsyncTaskC9742d f44466b;

        public a(AsyncTaskC9742d asyncTaskC9742d) {
            this.f44466b = asyncTaskC9742d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncTaskC9742d asyncTaskC9742d = this.f44466b;
            asyncTaskC9742d.m41033d(asyncTaskC9742d.f44460e, "Loading data...");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xe/d$b.class
     */
    /* renamed from: xe.d$b */
    /* loaded from: combined.jar:classes2.jar:xe/d$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final AsyncTaskC9742d f44467b;

        public b(AsyncTaskC9742d asyncTaskC9742d) {
            this.f44467b = asyncTaskC9742d;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xe/d$c.class
     */
    /* renamed from: xe.d$c */
    /* loaded from: combined.jar:classes2.jar:xe/d$c.class */
    public class c implements Runnable {

        /* renamed from: b */
        public final AsyncTaskC9742d f44468b;

        public c(AsyncTaskC9742d asyncTaskC9742d) {
            this.f44468b = asyncTaskC9742d;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AsyncTaskC9742d(Context context, String str, int i10, InterfaceC9741c<String> interfaceC9741c, String str2, List<C9743e> list, Boolean bool) {
        this.f44460e = context;
        this.f44461f = str;
        this.f44458c = i10;
        this.f44457b = interfaceC9741c;
        this.f44462g = str2;
        this.f44463h = list;
        this.f44464i = bool;
    }

    /* renamed from: a */
    public void m41030a() {
        try {
            Dialog dialog = this.f44465j;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.f44465j.cancel();
        } catch (Exception e10) {
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String str = null;
        try {
            String m41029a = C9739a.m41029a(this.f44460e, this.f44461f, this.f44458c, this.f44462g, this.f44463h);
            if (m41029a != null) {
                this.f44459d = true;
                str = m41029a;
            } else {
                new Handler(Looper.getMainLooper()).post(new b(this));
                str = m41029a;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }

    @Override // android.os.AsyncTask
    @TargetApi(11)
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        try {
            if (this.f44459d) {
                if (str == null) {
                    new Handler(Looper.getMainLooper()).post(new c(this));
                }
                this.f44457b.mo15571Y(str, this.f44458c, this.f44459d);
            } else {
                this.f44457b.mo15570E(this.f44458c);
            }
        } catch (Exception e10) {
        }
        if (this.f44464i.booleanValue()) {
            try {
                m41030a();
            } catch (Exception e11) {
            }
        }
    }

    /* renamed from: d */
    public void m41033d(Context context, String str) {
        Dialog dialog = new Dialog(context, R.style.Theme.Translucent.NoTitleBar);
        this.f44465j = dialog;
        dialog.setContentView(2131624245);
        this.f44465j.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f44465j.setCancelable(false);
        ((TextView) this.f44465j.findViewById(2131428647)).setText(str);
        try {
            if (((Activity) this.f44460e).isFinishing()) {
                Log.e("FINISHED", "FINISHED");
            } else {
                this.f44465j.show();
            }
        } catch (Exception e10) {
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.f44456a = new C9739a();
        if (this.f44464i.booleanValue()) {
            try {
                Dialog dialog = this.f44465j;
                if (dialog != null && dialog.isShowing()) {
                    m41030a();
                }
                new Handler(Looper.getMainLooper()).post(new a(this));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
