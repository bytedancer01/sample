package p395x2;

import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/v.class
 */
/* renamed from: x2.v */
/* loaded from: combined.jar:classes1.jar:x2/v.class */
public class C9643v {

    /* renamed from: a */
    public static String f44020a = "Volley";

    /* renamed from: b */
    public static boolean f44021b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    public static final String f44022c = C9643v.class.getName();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x2/v$a.class
     */
    /* renamed from: x2.v$a */
    /* loaded from: combined.jar:classes1.jar:x2/v$a.class */
    public static class a {

        /* renamed from: c */
        public static final boolean f44023c = C9643v.f44021b;

        /* renamed from: a */
        public final List<C10334a> f44024a = new ArrayList();

        /* renamed from: b */
        public boolean f44025b = false;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:x2/v$a$a.class
         */
        /* renamed from: x2.v$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:x2/v$a$a.class */
        public static class C10334a {

            /* renamed from: a */
            public final String f44026a;

            /* renamed from: b */
            public final long f44027b;

            /* renamed from: c */
            public final long f44028c;

            public C10334a(String str, long j10, long j11) {
                this.f44026a = str;
                this.f44027b = j10;
                this.f44028c = j11;
            }
        }

        /* renamed from: a */
        public void m40582a(String str, long j10) {
            synchronized (this) {
                if (this.f44025b) {
                    throw new IllegalStateException("Marker added to finished log");
                }
                this.f44024a.add(new C10334a(str, j10, SystemClock.elapsedRealtime()));
            }
        }

        /* renamed from: b */
        public void m40583b(String str) {
            synchronized (this) {
                this.f44025b = true;
                long m40584c = m40584c();
                if (m40584c <= 0) {
                    return;
                }
                long j10 = this.f44024a.get(0).f44028c;
                C9643v.m40578b("(%-4d ms) %s", Long.valueOf(m40584c), str);
                for (C10334a c10334a : this.f44024a) {
                    long j11 = c10334a.f44028c;
                    C9643v.m40578b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c10334a.f44027b), c10334a.f44026a);
                    j10 = j11;
                }
            }
        }

        /* renamed from: c */
        public final long m40584c() {
            if (this.f44024a.size() == 0) {
                return 0L;
            }
            long j10 = this.f44024a.get(0).f44028c;
            List<C10334a> list = this.f44024a;
            return list.get(list.size() - 1).f44028c - j10;
        }

        public void finalize() {
            if (this.f44025b) {
                return;
            }
            m40583b("Request on the loose");
            C9643v.m40579c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* renamed from: a */
    public static String m40577a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f44022c)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + InstructionFileId.DOT + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: b */
    public static void m40578b(String str, Object... objArr) {
        Log.d(f44020a, m40577a(str, objArr));
    }

    /* renamed from: c */
    public static void m40579c(String str, Object... objArr) {
        Log.e(f44020a, m40577a(str, objArr));
    }

    /* renamed from: d */
    public static void m40580d(Throwable th2, String str, Object... objArr) {
        Log.e(f44020a, m40577a(str, objArr), th2);
    }

    /* renamed from: e */
    public static void m40581e(String str, Object... objArr) {
        if (f44021b) {
            Log.v(f44020a, m40577a(str, objArr));
        }
    }
}
