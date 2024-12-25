package p323s9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s9/a.class
 */
/* renamed from: s9.a */
/* loaded from: combined.jar:classes2.jar:s9/a.class */
public class C8550a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Integer m36775a(String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        if (!z10) {
            return 0;
        }
        if (z10) {
            return 1;
        }
        if (z10 != 2) {
            return z10 != 3 ? null : 3;
        }
        return 2;
    }

    /* renamed from: b */
    public static String m36776b(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "REPEAT_OFF";
        }
        if (intValue == 1) {
            return "REPEAT_ALL";
        }
        if (intValue == 2) {
            return "REPEAT_SINGLE";
        }
        if (intValue != 3) {
            return null;
        }
        return "REPEAT_ALL_AND_SHUFFLE";
    }
}
