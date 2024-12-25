package cg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/p.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cg.p */
/* loaded from: combined.jar:classes2.jar:cg/p.class */
public abstract class EnumC1103p {
    private static final EnumC1103p[] $VALUES;
    public static final EnumC1103p COLLECTED;
    public static final EnumC1103p EXPIRED;
    public static final EnumC1103p EXPLICIT;
    public static final EnumC1103p REPLACED;
    public static final EnumC1103p SIZE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cg/p$a.class
     */
    /* renamed from: cg.p$a */
    /* loaded from: combined.jar:classes2.jar:cg/p$a.class */
    public enum a extends EnumC1103p {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // cg.EnumC1103p
        public boolean wasEvicted() {
            return false;
        }
    }

    static {
        a aVar = new a("EXPLICIT", 0);
        EXPLICIT = aVar;
        EnumC1103p enumC1103p = new EnumC1103p("REPLACED", 1) { // from class: cg.p.b
            {
                a aVar2 = null;
            }

            @Override // cg.EnumC1103p
            public boolean wasEvicted() {
                return false;
            }
        };
        REPLACED = enumC1103p;
        EnumC1103p enumC1103p2 = new EnumC1103p("COLLECTED", 2) { // from class: cg.p.c
            {
                a aVar2 = null;
            }

            @Override // cg.EnumC1103p
            public boolean wasEvicted() {
                return true;
            }
        };
        COLLECTED = enumC1103p2;
        EnumC1103p enumC1103p3 = new EnumC1103p("EXPIRED", 3) { // from class: cg.p.d
            {
                a aVar2 = null;
            }

            @Override // cg.EnumC1103p
            public boolean wasEvicted() {
                return true;
            }
        };
        EXPIRED = enumC1103p3;
        EnumC1103p enumC1103p4 = new EnumC1103p("SIZE", 4) { // from class: cg.p.e
            {
                a aVar2 = null;
            }

            @Override // cg.EnumC1103p
            public boolean wasEvicted() {
                return true;
            }
        };
        SIZE = enumC1103p4;
        $VALUES = new EnumC1103p[]{aVar, enumC1103p, enumC1103p2, enumC1103p3, enumC1103p4};
    }

    private EnumC1103p(String str, int i10) {
    }

    public /* synthetic */ EnumC1103p(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC1103p valueOf(String str) {
        return (EnumC1103p) Enum.valueOf(EnumC1103p.class, str);
    }

    public static EnumC1103p[] values() {
        return (EnumC1103p[]) $VALUES.clone();
    }

    public abstract boolean wasEvicted();
}
