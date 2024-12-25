package p103fg;

import ci.C1128n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fg/c.class
 */
/* renamed from: fg.c */
/* loaded from: combined.jar:classes2.jar:fg/c.class */
public enum EnumC4859c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;


    @NotNull
    public static final a Companion = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fg/c$a.class
     */
    /* renamed from: fg.c$a */
    /* loaded from: combined.jar:classes2.jar:fg/c$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC4859c m24729a(@Nullable String str) {
            EnumC4859c enumC4859c;
            if (str != null) {
                EnumC4859c[] values = EnumC4859c.values();
                int length = values.length;
                do {
                    length--;
                    enumC4859c = null;
                    if (length < 0) {
                        break;
                    }
                    enumC4859c = values[length];
                } while (!C1128n.m6719l(enumC4859c.name(), str, true));
            } else {
                enumC4859c = null;
            }
            EnumC4859c enumC4859c2 = enumC4859c;
            if (enumC4859c == null) {
                enumC4859c2 = EnumC4859c.UNATTRIBUTED;
            }
            return enumC4859c2;
        }
    }

    @NotNull
    public static final EnumC4859c fromString(@Nullable String str) {
        return Companion.m24729a(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
