package p103fg;

import com.amazonaws.mobileconnectors.p044s3.transferutility.TransferService;
import com.amazonaws.regions.ServiceAbbreviations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fg/b.class
 */
/* renamed from: fg.b */
/* loaded from: combined.jar:classes2.jar:fg/b.class */
public enum EnumC4858b {
    IAM(ServiceAbbreviations.IAM),
    NOTIFICATION(TransferService.INTENT_KEY_NOTIFICATION);


    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private final String nameValue;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fg/b$a.class
     */
    /* renamed from: fg.b$a */
    /* loaded from: combined.jar:classes2.jar:fg/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC4858b m24728a(@Nullable String str) {
            EnumC4858b enumC4858b;
            if (str != null) {
                EnumC4858b[] values = EnumC4858b.values();
                int length = values.length;
                do {
                    length--;
                    enumC4858b = null;
                    if (length < 0) {
                        break;
                    }
                    enumC4858b = values[length];
                } while (!enumC4858b.equalsName(str));
            } else {
                enumC4858b = null;
            }
            EnumC4858b enumC4858b2 = enumC4858b;
            if (enumC4858b == null) {
                enumC4858b2 = EnumC4858b.NOTIFICATION;
            }
            return enumC4858b2;
        }
    }

    EnumC4858b(String str) {
        this.nameValue = str;
    }

    @NotNull
    public static final EnumC4858b fromString(@Nullable String str) {
        return Companion.m24728a(str);
    }

    public final boolean equalsName(@NotNull String str) {
        C9367f.m39526e(str, "otherName");
        return C9367f.m39522a(this.nameValue, str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.nameValue;
    }
}
