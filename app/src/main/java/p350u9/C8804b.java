package p350u9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p422y9.C9932n;
import p441z9.AbstractC10125a;
import p441z9.C10127c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u9/b.class
 */
/* renamed from: u9.b */
/* loaded from: combined.jar:classes2.jar:u9/b.class */
public final class C8804b extends AbstractC10125a {

    /* renamed from: d */
    public final int f40819d;

    /* renamed from: e */
    public final int f40820e;

    /* renamed from: f */
    public final PendingIntent f40821f;

    /* renamed from: g */
    public final String f40822g;

    /* renamed from: h */
    public static final C8804b f40818h = new C8804b(0);
    public static final Parcelable.Creator<C8804b> CREATOR = new C8830q();

    public C8804b(int i10) {
        this(i10, null, null);
    }

    public C8804b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f40819d = i10;
        this.f40820e = i11;
        this.f40821f = pendingIntent;
        this.f40822g = str;
    }

    public C8804b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C8804b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* renamed from: U */
    public static String m37658U(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    /* renamed from: P */
    public int m37659P() {
        return this.f40820e;
    }

    /* renamed from: Q */
    public String m37660Q() {
        return this.f40822g;
    }

    /* renamed from: R */
    public PendingIntent m37661R() {
        return this.f40821f;
    }

    /* renamed from: S */
    public boolean m37662S() {
        return (this.f40820e == 0 || this.f40821f == null) ? false : true;
    }

    /* renamed from: T */
    public boolean m37663T() {
        return this.f40820e == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8804b)) {
            return false;
        }
        C8804b c8804b = (C8804b) obj;
        return this.f40820e == c8804b.f40820e && C9932n.m41832b(this.f40821f, c8804b.f40821f) && C9932n.m41832b(this.f40822g, c8804b.f40822g);
    }

    public int hashCode() {
        return C9932n.m41833c(Integer.valueOf(this.f40820e), this.f40821f, this.f40822g);
    }

    public String toString() {
        C9932n.a m41834d = C9932n.m41834d(this);
        m41834d.m41835a("statusCode", m37658U(this.f40820e));
        m41834d.m41835a("resolution", this.f40821f);
        m41834d.m41835a("message", this.f40822g);
        return m41834d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m42518a = C10127c.m42518a(parcel);
        C10127c.m42529l(parcel, 1, this.f40819d);
        C10127c.m42529l(parcel, 2, m37659P());
        C10127c.m42535r(parcel, 3, m37661R(), i10, false);
        C10127c.m42536s(parcel, 4, m37660Q(), false);
        C10127c.m42519b(parcel, m42518a);
    }
}
