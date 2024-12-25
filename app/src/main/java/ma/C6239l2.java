package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/l2.class
 */
/* renamed from: ma.l2 */
/* loaded from: combined.jar:classes2.jar:ma/l2.class */
public class C6239l2 {
    /* renamed from: a */
    public static int m29828a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        int i13 = i12;
        if (i12 < i11) {
            int highestOneBit = Integer.highestOneBit(i11 - 1);
            i13 = highestOneBit + highestOneBit;
        }
        int i14 = i13;
        if (i13 < 0) {
            i14 = Integer.MAX_VALUE;
        }
        return i14;
    }
}
