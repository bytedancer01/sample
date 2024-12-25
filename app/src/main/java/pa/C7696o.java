package pa;

import java.io.PrintStream;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/o.class
 */
/* renamed from: pa.o */
/* loaded from: combined.jar:classes2.jar:pa/o.class */
public final class C7696o {

    /* renamed from: a */
    public static final AbstractC7690i f37436a;

    static {
        AbstractC7690i c7694m;
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
                c7694m = new C7695n();
            } else if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                num2 = num;
                c7694m = new C7694m();
            } else {
                Integer num5 = num;
                num2 = num;
                c7694m = new C7693l();
            }
        } catch (Throwable th2) {
            PrintStream printStream = System.err;
            String name = C7694m.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th2.printStackTrace(System.err);
            c7694m = new C7694m();
        }
        f37436a = c7694m;
        if (num2 == null) {
            return;
        }
        num2.intValue();
    }

    /* renamed from: a */
    public static void m33632a(Throwable th2, Throwable th3) {
        f37436a.mo33630a(th2, th3);
    }
}
