package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/u.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.u */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/u.class */
public final class C0435u implements Parcelable {
    public static final Parcelable.Creator<C0435u> CREATOR = new a();

    /* renamed from: b */
    public final String f3003b;

    /* renamed from: c */
    public final String f3004c;

    /* renamed from: d */
    public final boolean f3005d;

    /* renamed from: e */
    public final int f3006e;

    /* renamed from: f */
    public final int f3007f;

    /* renamed from: g */
    public final String f3008g;

    /* renamed from: h */
    public final boolean f3009h;

    /* renamed from: i */
    public final boolean f3010i;

    /* renamed from: j */
    public final boolean f3011j;

    /* renamed from: k */
    public final Bundle f3012k;

    /* renamed from: l */
    public final boolean f3013l;

    /* renamed from: m */
    public final int f3014m;

    /* renamed from: n */
    public Bundle f3015n;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/u$a.class
     */
    /* renamed from: androidx.fragment.app.u$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/u$a.class */
    public class a implements Parcelable.Creator<C0435u> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0435u createFromParcel(Parcel parcel) {
            return new C0435u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0435u[] newArray(int i10) {
            return new C0435u[i10];
        }
    }

    public C0435u(Parcel parcel) {
        this.f3003b = parcel.readString();
        this.f3004c = parcel.readString();
        this.f3005d = parcel.readInt() != 0;
        this.f3006e = parcel.readInt();
        this.f3007f = parcel.readInt();
        this.f3008g = parcel.readString();
        this.f3009h = parcel.readInt() != 0;
        this.f3010i = parcel.readInt() != 0;
        this.f3011j = parcel.readInt() != 0;
        this.f3012k = parcel.readBundle();
        this.f3013l = parcel.readInt() != 0;
        this.f3015n = parcel.readBundle();
        this.f3014m = parcel.readInt();
    }

    public C0435u(Fragment fragment) {
        this.f3003b = fragment.getClass().getName();
        this.f3004c = fragment.mWho;
        this.f3005d = fragment.mFromLayout;
        this.f3006e = fragment.mFragmentId;
        this.f3007f = fragment.mContainerId;
        this.f3008g = fragment.mTag;
        this.f3009h = fragment.mRetainInstance;
        this.f3010i = fragment.mRemoving;
        this.f3011j = fragment.mDetached;
        this.f3012k = fragment.mArguments;
        this.f3013l = fragment.mHidden;
        this.f3014m = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3003b);
        sb2.append(" (");
        sb2.append(this.f3004c);
        sb2.append(")}:");
        if (this.f3005d) {
            sb2.append(" fromLayout");
        }
        if (this.f3007f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3007f));
        }
        String str = this.f3008g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3008g);
        }
        if (this.f3009h) {
            sb2.append(" retainInstance");
        }
        if (this.f3010i) {
            sb2.append(" removing");
        }
        if (this.f3011j) {
            sb2.append(" detached");
        }
        if (this.f3013l) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3003b);
        parcel.writeString(this.f3004c);
        parcel.writeInt(this.f3005d ? 1 : 0);
        parcel.writeInt(this.f3006e);
        parcel.writeInt(this.f3007f);
        parcel.writeString(this.f3008g);
        parcel.writeInt(this.f3009h ? 1 : 0);
        parcel.writeInt(this.f3010i ? 1 : 0);
        parcel.writeInt(this.f3011j ? 1 : 0);
        parcel.writeBundle(this.f3012k);
        parcel.writeInt(this.f3013l ? 1 : 0);
        parcel.writeBundle(this.f3015n);
        parcel.writeInt(this.f3014m);
    }
}
