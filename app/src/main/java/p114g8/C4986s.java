package p114g8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p267p6.C7565c1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p283q7.C7840b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/s.class
 */
/* renamed from: g8.s */
/* loaded from: combined.jar:classes2.jar:g8/s.class */
public final class C4986s implements C7839a.b {
    public static final Parcelable.Creator<C4986s> CREATOR = new a();

    /* renamed from: b */
    public final String f28970b;

    /* renamed from: c */
    public final String f28971c;

    /* renamed from: d */
    public final List<b> f28972d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/s$a.class
     */
    /* renamed from: g8.s$a */
    /* loaded from: combined.jar:classes2.jar:g8/s$a.class */
    public class a implements Parcelable.Creator<C4986s> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4986s createFromParcel(Parcel parcel) {
            return new C4986s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4986s[] newArray(int i10) {
            return new C4986s[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:g8/s$b.class
     */
    /* renamed from: g8.s$b */
    /* loaded from: combined.jar:classes2.jar:g8/s$b.class */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        public final int f28973b;

        /* renamed from: c */
        public final int f28974c;

        /* renamed from: d */
        public final String f28975d;

        /* renamed from: e */
        public final String f28976e;

        /* renamed from: f */
        public final String f28977f;

        /* renamed from: g */
        public final String f28978g;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:g8/s$b$a.class
         */
        /* renamed from: g8.s$b$a */
        /* loaded from: combined.jar:classes2.jar:g8/s$b$a.class */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f28973b = i10;
            this.f28974c = i11;
            this.f28975d = str;
            this.f28976e = str2;
            this.f28977f = str3;
            this.f28978g = str4;
        }

        public b(Parcel parcel) {
            this.f28973b = parcel.readInt();
            this.f28974c = parcel.readInt();
            this.f28975d = parcel.readString();
            this.f28976e = parcel.readString();
            this.f28977f = parcel.readString();
            this.f28978g = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f28973b != bVar.f28973b || this.f28974c != bVar.f28974c || !TextUtils.equals(this.f28975d, bVar.f28975d) || !TextUtils.equals(this.f28976e, bVar.f28976e) || !TextUtils.equals(this.f28977f, bVar.f28977f) || !TextUtils.equals(this.f28978g, bVar.f28978g)) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            int i10 = this.f28973b;
            int i11 = this.f28974c;
            String str = this.f28975d;
            int i12 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.f28976e;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.f28977f;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.f28978g;
            if (str4 != null) {
                i12 = str4.hashCode();
            }
            return (((((((((i10 * 31) + i11) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i12;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f28973b);
            parcel.writeInt(this.f28974c);
            parcel.writeString(this.f28975d);
            parcel.writeString(this.f28976e);
            parcel.writeString(this.f28977f);
            parcel.writeString(this.f28978g);
        }
    }

    public C4986s(Parcel parcel) {
        this.f28970b = parcel.readString();
        this.f28971c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f28972d = Collections.unmodifiableList(arrayList);
    }

    public C4986s(String str, String str2, List<b> list) {
        this.f28970b = str;
        this.f28971c = str2;
        this.f28972d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4986s.class != obj.getClass()) {
            return false;
        }
        C4986s c4986s = (C4986s) obj;
        if (!TextUtils.equals(this.f28970b, c4986s.f28970b) || !TextUtils.equals(this.f28971c, c4986s.f28971c) || !this.f28972d.equals(c4986s.f28972d)) {
            z10 = false;
        }
        return z10;
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C7840b.m34090a(this);
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ C7629w0 getWrappedMetadataFormat() {
        return C7840b.m34091b(this);
    }

    public int hashCode() {
        String str = this.f28970b;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f28971c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (((hashCode * 31) + i10) * 31) + this.f28972d.hashCode();
    }

    @Override // p283q7.C7839a.b
    public /* synthetic */ void populateMediaMetadata(C7565c1.b bVar) {
        C7840b.m34092c(this, bVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f28970b != null) {
            str = " [" + this.f28970b + ", " + this.f28971c + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f28970b);
        parcel.writeString(this.f28971c);
        int size = this.f28972d.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f28972d.get(i11), 0);
        }
    }
}
