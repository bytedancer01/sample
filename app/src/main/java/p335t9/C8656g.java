package p335t9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t9/g.class
 */
/* renamed from: t9.g */
/* loaded from: combined.jar:classes2.jar:t9/g.class */
public final class C8656g implements Parcelable.Creator<C8654e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8654e createFromParcel(Parcel parcel) {
        return new C8654e(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C8654e[] newArray(int i10) {
        return new C8654e[i10];
    }
}
