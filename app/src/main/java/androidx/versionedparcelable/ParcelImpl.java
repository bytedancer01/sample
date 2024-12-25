package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p032c2.C0979c;
import p032c2.InterfaceC0980d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/versionedparcelable/ParcelImpl.class
 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: combined.jar:classes1.jar:androidx/versionedparcelable/ParcelImpl.class */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0735a();

    /* renamed from: b */
    public final InterfaceC0980d f5044b;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/versionedparcelable/ParcelImpl$a.class
     */
    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: combined.jar:classes1.jar:androidx/versionedparcelable/ParcelImpl$a.class */
    public static final class C0735a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f5044b = new C0979c(parcel).m5872u();
    }

    public ParcelImpl(InterfaceC0980d interfaceC0980d) {
        this.f5044b = interfaceC0980d;
    }

    /* renamed from: b */
    public <T extends InterfaceC0980d> T m4744b() {
        return (T) this.f5044b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        new C0979c(parcel).m5849L(this.f5044b);
    }
}
