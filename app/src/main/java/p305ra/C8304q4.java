package p305ra;

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/q4.class
 */
/* renamed from: ra.q4 */
/* loaded from: combined.jar:classes2.jar:ra/q4.class */
public final class C8304q4 {

    /* renamed from: a */
    public static final AbstractC8214k4 f39242a;

    static {
        AbstractC8214k4 c8274o4;
        Integer num = null;
        Integer num2 = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e10) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e10.printStackTrace(System.err);
            }
            if (num != null && num.intValue() >= 19) {
                Integer num3 = num;
                Integer num4 = num;
                num2 = num;
                c8274o4 = new C8289p4();
            } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                num2 = num;
                c8274o4 = new C8274o4();
            } else {
                Integer num5 = num;
                num2 = num;
                c8274o4 = new C8259n4();
            }
        } catch (Throwable th2) {
            PrintStream printStream = System.err;
            String name = C8274o4.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th2.printStackTrace(System.err);
            c8274o4 = new C8274o4();
        }
        f39242a = c8274o4;
        if (num2 == null) {
            return;
        }
        num2.intValue();
    }

    /* renamed from: a */
    public static void m35712a(Throwable th2, Throwable th3) {
        f39242a.mo35529a(th2, th3);
    }
}
