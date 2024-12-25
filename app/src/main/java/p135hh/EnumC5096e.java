package p135hh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/e.class
 */
/* renamed from: hh.e */
/* loaded from: combined.jar:classes2.jar:hh/e.class */
public enum EnumC5096e implements Parcelable {
    LEVEL_CONNECTED,
    LEVEL_VPNPAUSED,
    LEVEL_CONNECTING_SERVER_REPLIED,
    LEVEL_CONNECTING_NO_SERVER_REPLY_YET,
    LEVEL_NONETWORK,
    LEVEL_NOTCONNECTED,
    LEVEL_START,
    LEVEL_AUTH_FAILED,
    LEVEL_WAITING_FOR_USER_INPUT,
    UNKNOWN_LEVEL;

    public static final Parcelable.Creator<EnumC5096e> CREATOR = new Parcelable.Creator<EnumC5096e>() { // from class: hh.e.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC5096e createFromParcel(Parcel parcel) {
            return EnumC5096e.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC5096e[] newArray(int i10) {
            return new EnumC5096e[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}
