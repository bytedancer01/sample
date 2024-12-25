package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC0428n;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/fragment/app/p.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.p */
/* loaded from: combined.jar:classes1.jar:androidx/fragment/app/p.class */
public final class C0430p implements Parcelable {
    public static final Parcelable.Creator<C0430p> CREATOR = new a();

    /* renamed from: b */
    public ArrayList<C0435u> f2982b;

    /* renamed from: c */
    public ArrayList<String> f2983c;

    /* renamed from: d */
    public C0410b[] f2984d;

    /* renamed from: e */
    public int f2985e;

    /* renamed from: f */
    public String f2986f;

    /* renamed from: g */
    public ArrayList<String> f2987g;

    /* renamed from: h */
    public ArrayList<Bundle> f2988h;

    /* renamed from: i */
    public ArrayList<AbstractC0428n.m> f2989i;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/fragment/app/p$a.class
     */
    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: combined.jar:classes1.jar:androidx/fragment/app/p$a.class */
    public class a implements Parcelable.Creator<C0430p> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0430p createFromParcel(Parcel parcel) {
            return new C0430p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0430p[] newArray(int i10) {
            return new C0430p[i10];
        }
    }

    public C0430p() {
        this.f2986f = null;
        this.f2987g = new ArrayList<>();
        this.f2988h = new ArrayList<>();
    }

    public C0430p(Parcel parcel) {
        this.f2986f = null;
        this.f2987g = new ArrayList<>();
        this.f2988h = new ArrayList<>();
        this.f2982b = parcel.createTypedArrayList(C0435u.CREATOR);
        this.f2983c = parcel.createStringArrayList();
        this.f2984d = (C0410b[]) parcel.createTypedArray(C0410b.CREATOR);
        this.f2985e = parcel.readInt();
        this.f2986f = parcel.readString();
        this.f2987g = parcel.createStringArrayList();
        this.f2988h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2989i = parcel.createTypedArrayList(AbstractC0428n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2982b);
        parcel.writeStringList(this.f2983c);
        parcel.writeTypedArray(this.f2984d, i10);
        parcel.writeInt(this.f2985e);
        parcel.writeString(this.f2986f);
        parcel.writeStringList(this.f2987g);
        parcel.writeTypedList(this.f2988h);
        parcel.writeTypedList(this.f2989i);
    }
}
