package p188kd;

import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/c.class
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.c */
/* loaded from: combined.jar:classes2.jar:kd/c.class */
public abstract class EnumC5550c implements InterfaceC5551d {
    private static final EnumC5550c[] $VALUES;
    public static final EnumC5550c IDENTITY;
    public static final EnumC5550c LOWER_CASE_WITH_DASHES;
    public static final EnumC5550c LOWER_CASE_WITH_DOTS;
    public static final EnumC5550c LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC5550c UPPER_CAMEL_CASE;
    public static final EnumC5550c UPPER_CAMEL_CASE_WITH_SPACES;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/c$a.class
     */
    /* renamed from: kd.c$a */
    /* loaded from: combined.jar:classes2.jar:kd/c$a.class */
    public enum a extends EnumC5550c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        EnumC5550c enumC5550c = new EnumC5550c("UPPER_CAMEL_CASE", 1) { // from class: kd.c.b
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
            public String translateName(Field field) {
                return EnumC5550c.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC5550c;
        EnumC5550c enumC5550c2 = new EnumC5550c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: kd.c.c
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
            public String translateName(Field field) {
                return EnumC5550c.upperCaseFirstLetter(EnumC5550c.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC5550c2;
        EnumC5550c enumC5550c3 = new EnumC5550c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: kd.c.d
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
            public String translateName(Field field) {
                return EnumC5550c.separateCamelCase(field.getName(), AWSAppSyncClient.DATABASE_NAME_DELIMITER).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC5550c3;
        EnumC5550c enumC5550c4 = new EnumC5550c("LOWER_CASE_WITH_DASHES", 4) { // from class: kd.c.e
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
            public String translateName(Field field) {
                return EnumC5550c.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC5550c4;
        EnumC5550c enumC5550c5 = new EnumC5550c("LOWER_CASE_WITH_DOTS", 5) { // from class: kd.c.f
            {
                a aVar2 = null;
            }

            @Override // p188kd.EnumC5550c, p188kd.InterfaceC5551d
            public String translateName(Field field) {
                return EnumC5550c.separateCamelCase(field.getName(), InstructionFileId.DOT).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC5550c5;
        $VALUES = new EnumC5550c[]{aVar, enumC5550c, enumC5550c2, enumC5550c3, enumC5550c4, enumC5550c5};
    }

    private EnumC5550c(String str, int i10) {
    }

    public /* synthetic */ EnumC5550c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static String separateCamelCase(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length - 1) {
            i10++;
        }
        char charAt = str.charAt(i10);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static EnumC5550c valueOf(String str) {
        return (EnumC5550c) Enum.valueOf(EnumC5550c.class, str);
    }

    public static EnumC5550c[] values() {
        return (EnumC5550c[]) $VALUES.clone();
    }

    @Override // p188kd.InterfaceC5551d
    public abstract /* synthetic */ String translateName(Field field);
}
