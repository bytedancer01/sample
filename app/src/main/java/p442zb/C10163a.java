package p442zb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p294r.C7936i;
import p341u0.AbstractC8783a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zb/a.class
 */
/* renamed from: zb.a */
/* loaded from: combined.jar:classes2.jar:zb/a.class */
public class C10163a extends AbstractC8783a {
    public static final Parcelable.Creator<C10163a> CREATOR = new a();

    /* renamed from: d */
    public final C7936i<String, Bundle> f46601d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zb/a$a.class
     */
    /* renamed from: zb.a$a */
    /* loaded from: combined.jar:classes2.jar:zb/a$a.class */
    public static final class a implements Parcelable.ClassLoaderCreator<C10163a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C10163a createFromParcel(Parcel parcel) {
            return new C10163a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10163a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C10163a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C10163a[] newArray(int i10) {
            return new C10163a[i10];
        }
    }

    public C10163a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f46601d = new C7936i<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f46601d.put(strArr[i10], bundleArr[i10]);
        }
    }

    public /* synthetic */ C10163a(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public C10163a(Parcelable parcelable) {
        super(parcelable);
        this.f46601d = new C7936i<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f46601d + "}";
    }

    @Override // p341u0.AbstractC8783a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f46601d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f46601d.m34439j(i11);
            bundleArr[i11] = this.f46601d.m34443n(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
