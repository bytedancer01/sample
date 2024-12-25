package p422y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/d1.class
 */
/* renamed from: y9.d1 */
/* loaded from: combined.jar:classes2.jar:y9/d1.class */
public final class C9904d1 implements Parcelable.Creator<BinderWrapper> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BinderWrapper createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BinderWrapper[] newArray(int i10) {
        return new BinderWrapper[i10];
    }
}
