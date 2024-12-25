package p191l0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.amazonaws.services.p045s3.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p087f0.C4741d;
import p191l0.C5643f;
import p221n0.InterfaceC6609a;
import p294r.C7934g;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l0/e.class
 */
/* renamed from: l0.e */
/* loaded from: combined.jar:classes1.jar:l0/e.class */
public class C5642e {

    /* renamed from: a */
    public static final C7934g<String, Typeface> f31747a = new C7934g<>(16);

    /* renamed from: b */
    public static final ExecutorService f31748b = C5644g.m27859a("fonts-androidx", 10, Constants.MAXIMUM_UPLOAD_PARTS);

    /* renamed from: c */
    public static final Object f31749c = new Object();

    /* renamed from: d */
    public static final C7936i<String, ArrayList<InterfaceC6609a<e>>> f31750d = new C7936i<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/e$a.class
     */
    /* renamed from: l0.e$a */
    /* loaded from: combined.jar:classes1.jar:l0/e$a.class */
    public class a implements Callable<e> {

        /* renamed from: a */
        public final String f31751a;

        /* renamed from: b */
        public final Context f31752b;

        /* renamed from: c */
        public final C5641d f31753c;

        /* renamed from: d */
        public final int f31754d;

        public a(String str, Context context, C5641d c5641d, int i10) {
            this.f31751a = str;
            this.f31752b = context;
            this.f31753c = c5641d;
            this.f31754d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C5642e.m27841c(this.f31751a, this.f31752b, this.f31753c, this.f31754d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/e$b.class
     */
    /* renamed from: l0.e$b */
    /* loaded from: combined.jar:classes1.jar:l0/e$b.class */
    public class b implements InterfaceC6609a<e> {

        /* renamed from: a */
        public final C5638a f31755a;

        public b(C5638a c5638a) {
            this.f31755a = c5638a;
        }

        @Override // p221n0.InterfaceC6609a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            this.f31755a.m27822b(eVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/e$c.class
     */
    /* renamed from: l0.e$c */
    /* loaded from: combined.jar:classes1.jar:l0/e$c.class */
    public class c implements Callable<e> {

        /* renamed from: a */
        public final String f31756a;

        /* renamed from: b */
        public final Context f31757b;

        /* renamed from: c */
        public final C5641d f31758c;

        /* renamed from: d */
        public final int f31759d;

        public c(String str, Context context, C5641d c5641d, int i10) {
            this.f31756a = str;
            this.f31757b = context;
            this.f31758c = c5641d;
            this.f31759d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C5642e.m27841c(this.f31756a, this.f31757b, this.f31758c, this.f31759d);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/e$d.class
     */
    /* renamed from: l0.e$d */
    /* loaded from: combined.jar:classes1.jar:l0/e$d.class */
    public class d implements InterfaceC6609a<e> {

        /* renamed from: a */
        public final String f31760a;

        public d(String str) {
            this.f31760a = str;
        }

        @Override // p221n0.InterfaceC6609a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (C5642e.f31749c) {
                C7936i<String, ArrayList<InterfaceC6609a<e>>> c7936i = C5642e.f31750d;
                ArrayList<InterfaceC6609a<e>> arrayList = c7936i.get(this.f31760a);
                if (arrayList == null) {
                    return;
                }
                c7936i.remove(this.f31760a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:l0/e$e.class
     */
    /* renamed from: l0.e$e */
    /* loaded from: combined.jar:classes1.jar:l0/e$e.class */
    public static final class e {

        /* renamed from: a */
        public final Typeface f31761a;

        /* renamed from: b */
        public final int f31762b;

        public e(int i10) {
            this.f31761a = null;
            this.f31762b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f31761a = typeface;
            this.f31762b = 0;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean m27848a() {
            return this.f31762b == 0;
        }
    }

    /* renamed from: a */
    public static String m27839a(C5641d c5641d, int i10) {
        return c5641d.m27835d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public static int m27840b(C5643f.a aVar) {
        if (aVar.m27852c() != 0) {
            return aVar.m27852c() != 1 ? -3 : -2;
        }
        C5643f.b[] m27851b = aVar.m27851b();
        int i10 = 1;
        if (m27851b != null) {
            if (m27851b.length != 0) {
                int length = m27851b.length;
                int i11 = 0;
                while (true) {
                    i10 = 0;
                    if (i11 >= length) {
                        break;
                    }
                    int m27854b = m27851b[i11].m27854b();
                    if (m27854b != 0) {
                        if (m27854b < 0) {
                            m27854b = -3;
                        }
                        return m27854b;
                    }
                    i11++;
                }
            } else {
                i10 = 1;
            }
        }
        return i10;
    }

    /* renamed from: c */
    public static e m27841c(String str, Context context, C5641d c5641d, int i10) {
        C7934g<String, Typeface> c7934g = f31747a;
        Typeface m34411d = c7934g.m34411d(str);
        if (m34411d != null) {
            return new e(m34411d);
        }
        try {
            C5643f.a m27828d = C5640c.m27828d(context, c5641d, null);
            int m27840b = m27840b(m27828d);
            if (m27840b != 0) {
                return new e(m27840b);
            }
            Typeface m23996b = C4741d.m23996b(context, null, m27828d.m27851b(), i10);
            if (m23996b == null) {
                return new e(-3);
            }
            c7934g.m34413f(str, m23996b);
            return new e(m23996b);
        } catch (PackageManager.NameNotFoundException e10) {
            return new e(-1);
        }
    }

    /* renamed from: d */
    public static Typeface m27842d(Context context, C5641d c5641d, int i10, Executor executor, C5638a c5638a) {
        String m27839a = m27839a(c5641d, i10);
        Typeface m34411d = f31747a.m34411d(m27839a);
        if (m34411d != null) {
            c5638a.m27822b(new e(m34411d));
            return m34411d;
        }
        b bVar = new b(c5638a);
        synchronized (f31749c) {
            C7936i<String, ArrayList<InterfaceC6609a<e>>> c7936i = f31750d;
            ArrayList<InterfaceC6609a<e>> arrayList = c7936i.get(m27839a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC6609a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c7936i.put(m27839a, arrayList2);
            c cVar = new c(m27839a, context, c5641d, i10);
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = f31748b;
            }
            C5644g.m27860b(executor2, cVar, new d(m27839a));
            return null;
        }
    }

    /* renamed from: e */
    public static Typeface m27843e(Context context, C5641d c5641d, C5638a c5638a, int i10, int i11) {
        String m27839a = m27839a(c5641d, i10);
        Typeface m34411d = f31747a.m34411d(m27839a);
        if (m34411d != null) {
            c5638a.m27822b(new e(m34411d));
            return m34411d;
        }
        if (i11 == -1) {
            e m27841c = m27841c(m27839a, context, c5641d, i10);
            c5638a.m27822b(m27841c);
            return m27841c.f31761a;
        }
        try {
            e eVar = (e) C5644g.m27861c(f31748b, new a(m27839a, context, c5641d, i10), i11);
            c5638a.m27822b(eVar);
            return eVar.f31761a;
        } catch (InterruptedException e10) {
            c5638a.m27822b(new e(-3));
            return null;
        }
    }
}
