package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/activity/result/e.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.e */
/* loaded from: combined.jar:classes1.jar:androidx/activity/result/e.class */
public final class C0233e implements Parcelable {
    public static final Parcelable.Creator<C0233e> CREATOR = new a();

    /* renamed from: b */
    public final IntentSender f1354b;

    /* renamed from: c */
    public final Intent f1355c;

    /* renamed from: d */
    public final int f1356d;

    /* renamed from: e */
    public final int f1357e;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/e$a.class
     */
    /* renamed from: androidx.activity.result.e$a */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/e$a.class */
    public class a implements Parcelable.Creator<C0233e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0233e createFromParcel(Parcel parcel) {
            return new C0233e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0233e[] newArray(int i10) {
            return new C0233e[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/activity/result/e$b.class
     */
    /* renamed from: androidx.activity.result.e$b */
    /* loaded from: combined.jar:classes1.jar:androidx/activity/result/e$b.class */
    public static final class b {

        /* renamed from: a */
        public IntentSender f1358a;

        /* renamed from: b */
        public Intent f1359b;

        /* renamed from: c */
        public int f1360c;

        /* renamed from: d */
        public int f1361d;

        public b(IntentSender intentSender) {
            this.f1358a = intentSender;
        }

        /* renamed from: a */
        public C0233e m815a() {
            return new C0233e(this.f1358a, this.f1359b, this.f1360c, this.f1361d);
        }

        /* renamed from: b */
        public b m816b(Intent intent) {
            this.f1359b = intent;
            return this;
        }

        /* renamed from: c */
        public b m817c(int i10, int i11) {
            this.f1361d = i10;
            this.f1360c = i11;
            return this;
        }
    }

    public C0233e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f1354b = intentSender;
        this.f1355c = intent;
        this.f1356d = i10;
        this.f1357e = i11;
    }

    public C0233e(Parcel parcel) {
        this.f1354b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1355c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1356d = parcel.readInt();
        this.f1357e = parcel.readInt();
    }

    /* renamed from: b */
    public Intent m809b() {
        return this.f1355c;
    }

    /* renamed from: c */
    public int m810c() {
        return this.f1356d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public int m811j() {
        return this.f1357e;
    }

    /* renamed from: k */
    public IntentSender m812k() {
        return this.f1354b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f1354b, i10);
        parcel.writeParcelable(this.f1355c, i10);
        parcel.writeInt(this.f1356d);
        parcel.writeInt(this.f1357e);
    }
}
