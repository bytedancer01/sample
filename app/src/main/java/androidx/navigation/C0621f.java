package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/f.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.navigation.f */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/f.class */
public final class C0621f implements Parcelable {
    public static final Parcelable.Creator<C0621f> CREATOR = new a();

    /* renamed from: b */
    public final UUID f4188b;

    /* renamed from: c */
    public final int f4189c;

    /* renamed from: d */
    public final Bundle f4190d;

    /* renamed from: e */
    public final Bundle f4191e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/f$a.class
     */
    /* renamed from: androidx.navigation.f$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/f$a.class */
    public class a implements Parcelable.Creator<C0621f> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0621f createFromParcel(Parcel parcel) {
            return new C0621f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0621f[] newArray(int i10) {
            return new C0621f[i10];
        }
    }

    public C0621f(Parcel parcel) {
        this.f4188b = UUID.fromString(parcel.readString());
        this.f4189c = parcel.readInt();
        this.f4190d = parcel.readBundle(C0621f.class.getClassLoader());
        this.f4191e = parcel.readBundle(C0621f.class.getClassLoader());
    }

    public C0621f(C0620e c0620e) {
        this.f4188b = c0620e.f4183g;
        this.f4189c = c0620e.m3498b().m3569v();
        this.f4190d = c0620e.m3497a();
        Bundle bundle = new Bundle();
        this.f4191e = bundle;
        c0620e.m3502g(bundle);
    }

    /* renamed from: b */
    public Bundle m3505b() {
        return this.f4190d;
    }

    /* renamed from: c */
    public int m3506c() {
        return this.f4189c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public Bundle m3507j() {
        return this.f4191e;
    }

    /* renamed from: k */
    public UUID m3508k() {
        return this.f4188b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4188b.toString());
        parcel.writeInt(this.f4189c);
        parcel.writeBundle(this.f4190d);
        parcel.writeBundle(this.f4191e);
    }
}
