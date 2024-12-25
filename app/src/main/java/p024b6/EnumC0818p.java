package p024b6;

import android.util.SparseArray;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/p.class
 */
/* renamed from: b6.p */
/* loaded from: combined.jar:classes1.jar:b6/p.class */
public enum EnumC0818p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<EnumC0818p> valueMap;
    private final int value;

    static {
        EnumC0818p enumC0818p = DEFAULT;
        EnumC0818p enumC0818p2 = UNMETERED_ONLY;
        EnumC0818p enumC0818p3 = UNMETERED_OR_DAILY;
        EnumC0818p enumC0818p4 = FAST_IF_RADIO_AWAKE;
        EnumC0818p enumC0818p5 = NEVER;
        EnumC0818p enumC0818p6 = UNRECOGNIZED;
        SparseArray<EnumC0818p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, enumC0818p);
        sparseArray.put(1, enumC0818p2);
        sparseArray.put(2, enumC0818p3);
        sparseArray.put(3, enumC0818p4);
        sparseArray.put(4, enumC0818p5);
        sparseArray.put(-1, enumC0818p6);
    }

    EnumC0818p(int i10) {
        this.value = i10;
    }

    public static EnumC0818p forNumber(int i10) {
        if (i10 == 0) {
            return DEFAULT;
        }
        if (i10 == 1) {
            return UNMETERED_ONLY;
        }
        if (i10 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i10 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i10 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
