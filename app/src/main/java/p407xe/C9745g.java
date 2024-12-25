package p407xe;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:xe/g.class
 */
/* renamed from: xe.g */
/* loaded from: combined.jar:classes2.jar:xe/g.class */
public class C9745g {

    /* renamed from: b */
    public static List<C9743e> f44476b = new ArrayList();

    /* renamed from: c */
    public static C9745g f44477c;

    /* renamed from: a */
    public Context f44478a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:xe/g$a.class
     */
    /* renamed from: xe.g$a */
    /* loaded from: combined.jar:classes2.jar:xe/g$a.class */
    public static class a {

        /* renamed from: a */
        public static String f44479a = "http://akdenizvize.net/";

        /* renamed from: b */
        public static String f44480b = "ver.php";

        /* renamed from: c */
        public static String f44481c = "rapi.php";
    }

    public C9745g(Context context) {
        this.f44478a = context;
    }

    /* renamed from: a */
    public static C9743e m41047a(String str, String str2) {
        return new C9743e(str, str2);
    }

    /* renamed from: b */
    public void m41048b(InterfaceC9741c<String> interfaceC9741c) {
        new AsyncTaskC9742d(this.f44478a, a.f44480b, 1, interfaceC9741c, "Form", f44476b, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* renamed from: c */
    public void m41049c(InterfaceC9741c<String> interfaceC9741c) {
        new AsyncTaskC9742d(this.f44478a, a.f44481c, 1, interfaceC9741c, "Form", f44476b, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }
}
