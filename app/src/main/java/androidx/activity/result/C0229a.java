package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/result/a.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: combined.jar:classes1.jar:androidx/activity/result/a.class */
public final class C0229a implements Parcelable {
    public static final Parcelable.Creator<C0229a> CREATOR = new a();

    /* renamed from: b */
    public final int f1352b;

    /* renamed from: c */
    public final Intent f1353c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/a$a.class
     */
    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/a$a.class */
    public class a implements Parcelable.Creator<C0229a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0229a createFromParcel(Parcel parcel) {
            return new C0229a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0229a[] newArray(int i10) {
            return new C0229a[i10];
        }
    }

    public C0229a(int i10, Intent intent) {
        this.f1352b = i10;
        this.f1353c = intent;
    }

    public C0229a(Parcel parcel) {
        this.f1352b = parcel.readInt();
        this.f1353c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: j */
    public static String m802j(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: b */
    public Intent m803b() {
        return this.f1353c;
    }

    /* renamed from: c */
    public int m804c() {
        return this.f1352b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m802j(this.f1352b) + ", data=" + this.f1353c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1352b);
        parcel.writeInt(this.f1353c == null ? 0 : 1);
        Intent intent = this.f1353c;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
