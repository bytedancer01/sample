package p312ri;

import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/b.class
 */
/* renamed from: ri.b */
/* loaded from: combined.jar:classes2.jar:ri/b.class */
public enum EnumC8476b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final a Companion = new a(null);
    private final int httpCode;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ri/b$a.class
     */
    /* renamed from: ri.b$a */
    /* loaded from: combined.jar:classes2.jar:ri/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final EnumC8476b m36398a(int i10) {
            EnumC8476b enumC8476b;
            EnumC8476b[] values = EnumC8476b.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC8476b = null;
                    break;
                }
                enumC8476b = values[i11];
                if (enumC8476b.getHttpCode() == i10) {
                    break;
                }
                i11++;
            }
            return enumC8476b;
        }
    }

    EnumC8476b(int i10) {
        this.httpCode = i10;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
