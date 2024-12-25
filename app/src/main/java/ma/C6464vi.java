package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/vi.class
 */
/* renamed from: ma.vi */
/* loaded from: combined.jar:classes2.jar:ma/vi.class */
public final class C6464vi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* renamed from: a */
    public static String m30082a(AbstractC6399sf abstractC6399sf) {
        String str;
        StringBuilder sb2 = new StringBuilder(abstractC6399sf.mo29850d());
        for (int i10 = 0; i10 < abstractC6399sf.mo29850d(); i10++) {
            byte mo29848a = abstractC6399sf.mo29848a(i10);
            if (mo29848a == 34) {
                str = "\\\"";
            } else if (mo29848a == 39) {
                str = "\\'";
            } else if (mo29848a != 92) {
                switch (mo29848a) {
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
                        if (mo29848a < 32 || mo29848a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo29848a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo29848a >>> 3) & 7) + 48));
                            mo29848a = (mo29848a & 7) + 48;
                        }
                        sb2.append((char) mo29848a);
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
