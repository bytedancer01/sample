package ve;

import android.content.Context;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ve/c.class
 */
/* renamed from: ve.c */
/* loaded from: combined.jar:classes2.jar:ve/c.class */
public class C9342c {

    /* renamed from: b */
    public static WeakReference<Context> f42784b;

    /* renamed from: c */
    public static C9342c f42785c;

    /* renamed from: a */
    public Toast f42786a;

    public C9342c(Context context) {
        f42784b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C9342c m39377a(Context context) {
        if (f42785c == null || f42784b.get() == null) {
            f42785c = new C9342c(context);
        }
        return f42785c;
    }

    /* renamed from: b */
    public void m39378b(int i10) {
        m39379c(f42784b.get().getResources().getString(i10));
    }

    /* renamed from: c */
    public void m39379c(String str) {
        Toast toast = this.f42786a;
        if (toast == null) {
            this.f42786a = Toast.makeText(f42784b.get(), str, 0);
        } else {
            toast.setText(str);
            this.f42786a.setDuration(0);
        }
        this.f42786a.show();
    }
}
