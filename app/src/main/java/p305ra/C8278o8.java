package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/o8.class
 */
/* renamed from: ra.o8 */
/* loaded from: combined.jar:classes2.jar:ra/o8.class */
public final class C8278o8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* renamed from: a */
    public static String m35655a(AbstractC8230l5 abstractC8230l5) {
        String str;
        StringBuilder sb2 = new StringBuilder(abstractC8230l5.mo35264d());
        for (int i10 = 0; i10 < abstractC8230l5.mo35264d(); i10++) {
            byte mo35262a = abstractC8230l5.mo35262a(i10);
            if (mo35262a == 34) {
                str = "\\\"";
            } else if (mo35262a == 39) {
                str = "\\'";
            } else if (mo35262a != 92) {
                switch (mo35262a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo35262a < 32 || mo35262a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo35262a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo35262a >>> 3) & 7) + 48));
                            mo35262a = (mo35262a & 7) + 48;
                        }
                        sb2.append((char) mo35262a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
