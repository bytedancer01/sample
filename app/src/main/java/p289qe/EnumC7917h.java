package p289qe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/h.class
 */
/* renamed from: qe.h */
/* loaded from: combined.jar:classes2.jar:qe/h.class */
public enum EnumC7917h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    EnumC7917h(int[] iArr, int i10) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i10;
    }

    public static EnumC7917h forBits(int i10) {
        if (i10 == 0) {
            return TERMINATOR;
        }
        if (i10 == 1) {
            return NUMERIC;
        }
        if (i10 == 2) {
            return ALPHANUMERIC;
        }
        if (i10 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i10 == 4) {
            return BYTE;
        }
        if (i10 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i10 == 7) {
            return ECI;
        }
        if (i10 == 8) {
            return KANJI;
        }
        if (i10 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i10 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getCharacterCountBits(C7919j c7919j) {
        int m34296j = c7919j.m34296j();
        return this.characterCountBitsForVersions[(m34296j <= 9 ? false : m34296j <= 26 ? true : 2) == true ? 1 : 0];
    }
}
