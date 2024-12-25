package p341u0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:u0/a.class
 */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: u0.a */
/* loaded from: combined.jar:classes1.jar:u0/a.class */
public abstract class AbstractC8783a implements Parcelable {

    /* renamed from: b */
    public final Parcelable f40742b;

    /* renamed from: c */
    public static final AbstractC8783a f40741c = new a();
    public static final Parcelable.Creator<AbstractC8783a> CREATOR = new b();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u0/a$a.class
     */
    /* renamed from: u0.a$a */
    /* loaded from: combined.jar:classes1.jar:u0/a$a.class */
    public class a extends AbstractC8783a {
        public a() {
            super((a) null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:u0/a$b.class
     */
    /* renamed from: u0.a$b */
    /* loaded from: combined.jar:classes1.jar:u0/a$b.class */
    public class b implements Parcelable.ClassLoaderCreator<AbstractC8783a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC8783a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC8783a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC8783a.f40741c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC8783a[] newArray(int i10) {
            return new AbstractC8783a[i10];
        }
    }

    public AbstractC8783a() {
        this.f40742b = null;
    }

    public AbstractC8783a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f40742b = readParcelable == null ? f40741c : readParcelable;
    }

    public AbstractC8783a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f40742b = parcelable == f40741c ? null : parcelable;
    }

    public /* synthetic */ AbstractC8783a(a aVar) {
        this();
    }

    /* renamed from: b */
    public final Parcelable m37586b() {
        return this.f40742b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f40742b, i10);
    }
}
