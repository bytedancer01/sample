package id;

import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/s.class
 */
/* renamed from: id.s */
/* loaded from: combined.jar:classes2.jar:id/s.class */
public final class C5237s extends Exception {

    /* renamed from: b */
    public final int f29940b;

    public C5237s(String str) {
        super(str);
        this.f29940b = m26115a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final int m26115a(String str) {
        boolean z10;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    z10 = 4;
                    break;
                }
                z10 = -1;
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        if (!z10 || z10) {
            return 1;
        }
        if (z10 == 2) {
            return 2;
        }
        if (z10 != 3) {
            return z10 != 4 ? 0 : 4;
        }
        return 3;
    }
}
