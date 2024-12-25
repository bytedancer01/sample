package p400x7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x7/e.class
 */
/* renamed from: x7.e */
/* loaded from: combined.jar:classes2.jar:x7/e.class */
public final class C9677e extends AbstractC9674b {
    public static final Parcelable.Creator<C9677e> CREATOR = new a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:x7/e$a.class
     */
    /* renamed from: x7.e$a */
    /* loaded from: combined.jar:classes2.jar:x7/e$a.class */
    public class a implements Parcelable.Creator<C9677e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9677e createFromParcel(Parcel parcel) {
            return new C9677e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9677e[] newArray(int i10) {
            return new C9677e[i10];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
