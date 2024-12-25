package bj;

import android.content.Context;
import java.io.File;

/* renamed from: bj.c */
/* loaded from: combined.jar:classes3.jar:bj/c.class */
public class C0915c {

    /* renamed from: bj.c$a */
    /* loaded from: combined.jar:classes3.jar:bj/c$a.class */
    public interface a {
        /* renamed from: a */
        void mo5601a(Context context, String[] strArr, String str, File file, C0916d c0916d);
    }

    /* renamed from: bj.c$b */
    /* loaded from: combined.jar:classes3.jar:bj/c$b.class */
    public interface b {
        /* renamed from: a */
        String mo5609a(String str);

        /* renamed from: b */
        String mo5610b(String str);

        /* renamed from: c */
        String[] mo5611c();

        /* renamed from: d */
        void mo5612d(String str);

        void loadLibrary(String str);
    }

    /* renamed from: bj.c$c */
    /* loaded from: combined.jar:classes3.jar:bj/c$c.class */
    public interface c {
        /* renamed from: a */
        void m5613a();

        /* renamed from: b */
        void m5614b(Throwable th2);
    }

    /* renamed from: bj.c$d */
    /* loaded from: combined.jar:classes3.jar:bj/c$d.class */
    public interface d {
        /* renamed from: a */
        void m5615a(String str);
    }

    /* renamed from: a */
    public static void m5607a(Context context, String str) {
        m5608b(context, str, null, null);
    }

    /* renamed from: b */
    public static void m5608b(Context context, String str, String str2, c cVar) {
        new C0916d().m5621f(context, str, str2, cVar);
    }
}
