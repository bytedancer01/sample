package p188kd;

import java.math.BigDecimal;
import md.C6566g;
import sd.C8555a;
import sd.C8558d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/t.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.t */
/* loaded from: combined.jar:classes2.jar:kd/t.class */
public abstract class EnumC5567t implements InterfaceC5568u {
    private static final EnumC5567t[] $VALUES;
    public static final EnumC5567t BIG_DECIMAL;
    public static final EnumC5567t DOUBLE;
    public static final EnumC5567t LAZILY_PARSED_NUMBER;
    public static final EnumC5567t LONG_OR_DOUBLE;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/t$a.class
     */
    /* renamed from: kd.t$a */
    /* loaded from: combined.jar:classes2.jar:kd/t$a.class */
    public enum a extends EnumC5567t {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p188kd.EnumC5567t, p188kd.InterfaceC5568u
        public Double readNumber(C8555a c8555a) {
            return Double.valueOf(c8555a.mo31099A0());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        EnumC5567t enumC5567t = new EnumC5567t("LAZILY_PARSED_NUMBER", 1) { // from class: kd.t.b
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5567t, p188kd.InterfaceC5568u
            public Number readNumber(C8555a c8555a) {
                return new C6566g(c8555a.mo31104H0());
            }
        };
        LAZILY_PARSED_NUMBER = enumC5567t;
        EnumC5567t enumC5567t2 = new EnumC5567t("LONG_OR_DOUBLE", 2) { // from class: kd.t.c
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5567t, p188kd.InterfaceC5568u
            public Number readNumber(C8555a c8555a) {
                String mo31104H0 = c8555a.mo31104H0();
                try {
                    return Long.valueOf(Long.parseLong(mo31104H0));
                } catch (NumberFormatException e10) {
                    try {
                        Double valueOf = Double.valueOf(mo31104H0);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || c8555a.m36786B()) {
                            return valueOf;
                        }
                        throw new C8558d("JSON forbids NaN and infinities: " + valueOf + "; at path " + c8555a.getPath());
                    } catch (NumberFormatException e11) {
                        throw new C5561n("Cannot parse " + mo31104H0 + "; at path " + c8555a.getPath(), e11);
                    }
                }
            }
        };
        LONG_OR_DOUBLE = enumC5567t2;
        EnumC5567t enumC5567t3 = new EnumC5567t("BIG_DECIMAL", 3) { // from class: kd.t.d
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5567t, p188kd.InterfaceC5568u
            public BigDecimal readNumber(C8555a c8555a) {
                String mo31104H0 = c8555a.mo31104H0();
                try {
                    return new BigDecimal(mo31104H0);
                } catch (NumberFormatException e10) {
                    throw new C5561n("Cannot parse " + mo31104H0 + "; at path " + c8555a.getPath(), e10);
                }
            }
        };
        BIG_DECIMAL = enumC5567t3;
        $VALUES = new EnumC5567t[]{aVar, enumC5567t, enumC5567t2, enumC5567t3};
    }

    private EnumC5567t(String str, int i10) {
    }

    public /* synthetic */ EnumC5567t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC5567t valueOf(String str) {
        return (EnumC5567t) Enum.valueOf(EnumC5567t.class, str);
    }

    public static EnumC5567t[] values() {
        return (EnumC5567t[]) $VALUES.clone();
    }

    @Override // p188kd.InterfaceC5568u
    public abstract /* synthetic */ Number readNumber(C8555a c8555a);
}
