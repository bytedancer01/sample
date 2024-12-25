package p305ra;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/w6.class
 */
/* renamed from: ra.w6 */
/* loaded from: combined.jar:classes2.jar:ra/w6.class */
public class C8396w6 extends IOException {
    public C8396w6(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C8396w6 m35986a() {
        return new C8396w6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    public static C8396w6 m35987b() {
        return new C8396w6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    public static C8396w6 m35988c() {
        return new C8396w6("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static C8381v6 m35989d() {
        return new C8381v6("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C8396w6 m35990e() {
        return new C8396w6("Failed to parse the message.");
    }

    /* renamed from: f */
    public static C8396w6 m35991f() {
        return new C8396w6("Protocol message had invalid UTF-8.");
    }
}
