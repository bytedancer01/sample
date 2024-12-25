package p289qe;

import p444zd.C10194b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/c.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qe.c */
/* loaded from: combined.jar:classes2.jar:qe/c.class */
public abstract class EnumC7912c {
    private static final EnumC7912c[] $VALUES;
    public static final EnumC7912c DATA_MASK_000;
    public static final EnumC7912c DATA_MASK_001;
    public static final EnumC7912c DATA_MASK_010;
    public static final EnumC7912c DATA_MASK_011;
    public static final EnumC7912c DATA_MASK_100;
    public static final EnumC7912c DATA_MASK_101;
    public static final EnumC7912c DATA_MASK_110;
    public static final EnumC7912c DATA_MASK_111;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qe/c$a.class
     */
    /* renamed from: qe.c$a */
    /* loaded from: combined.jar:classes2.jar:qe/c$a.class */
    public enum a extends EnumC7912c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p289qe.EnumC7912c
        public boolean isMasked(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        EnumC7912c enumC7912c = new EnumC7912c("DATA_MASK_001", 1) { // from class: qe.c.b
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        DATA_MASK_001 = enumC7912c;
        EnumC7912c enumC7912c2 = new EnumC7912c("DATA_MASK_010", 2) { // from class: qe.c.c
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        DATA_MASK_010 = enumC7912c2;
        EnumC7912c enumC7912c3 = new EnumC7912c("DATA_MASK_011", 3) { // from class: qe.c.d
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        DATA_MASK_011 = enumC7912c3;
        EnumC7912c enumC7912c4 = new EnumC7912c("DATA_MASK_100", 4) { // from class: qe.c.e
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = enumC7912c4;
        EnumC7912c enumC7912c5 = new EnumC7912c("DATA_MASK_101", 5) { // from class: qe.c.f
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        DATA_MASK_101 = enumC7912c5;
        EnumC7912c enumC7912c6 = new EnumC7912c("DATA_MASK_110", 6) { // from class: qe.c.g
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        DATA_MASK_110 = enumC7912c6;
        EnumC7912c enumC7912c7 = new EnumC7912c("DATA_MASK_111", 7) { // from class: qe.c.h
            {
                a aVar2 = null;
            }

            @Override // p289qe.EnumC7912c
            public boolean isMasked(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = enumC7912c7;
        $VALUES = new EnumC7912c[]{aVar, enumC7912c, enumC7912c2, enumC7912c3, enumC7912c4, enumC7912c5, enumC7912c6, enumC7912c7};
    }

    private EnumC7912c(String str, int i10) {
    }

    public /* synthetic */ EnumC7912c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC7912c valueOf(String str) {
        return (EnumC7912c) Enum.valueOf(EnumC7912c.class, str);
    }

    public static EnumC7912c[] values() {
        return (EnumC7912c[]) $VALUES.clone();
    }

    public abstract boolean isMasked(int i10, int i11);

    public final void unmaskBitMatrix(C10194b c10194b, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (isMasked(i11, i12)) {
                    c10194b.m42671c(i12, i11);
                }
            }
        }
    }
}
