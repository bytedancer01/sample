package p420y7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/x.class
 */
/* renamed from: y7.x */
/* loaded from: combined.jar:classes2.jar:y7/x.class */
public final class C9874x implements Parcelable {
    public static final Parcelable.Creator<C9874x> CREATOR = new a();

    /* renamed from: b */
    public final String f45309b;

    /* renamed from: c */
    public final Uri f45310c;

    /* renamed from: d */
    public final String f45311d;

    /* renamed from: e */
    public final List<C9858i0> f45312e;

    /* renamed from: f */
    public final byte[] f45313f;

    /* renamed from: g */
    public final String f45314g;

    /* renamed from: h */
    public final byte[] f45315h;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/x$a.class
     */
    /* renamed from: y7.x$a */
    /* loaded from: combined.jar:classes2.jar:y7/x$a.class */
    public class a implements Parcelable.Creator<C9874x> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9874x createFromParcel(Parcel parcel) {
            return new C9874x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9874x[] newArray(int i10) {
            return new C9874x[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/x$b.class
     */
    /* renamed from: y7.x$b */
    /* loaded from: combined.jar:classes2.jar:y7/x$b.class */
    public static class b {

        /* renamed from: a */
        public final String f45316a;

        /* renamed from: b */
        public final Uri f45317b;

        /* renamed from: c */
        public String f45318c;

        /* renamed from: d */
        public List<C9858i0> f45319d;

        /* renamed from: e */
        public byte[] f45320e;

        /* renamed from: f */
        public String f45321f;

        /* renamed from: g */
        public byte[] f45322g;

        public b(String str, Uri uri) {
            this.f45316a = str;
            this.f45317b = uri;
        }

        /* renamed from: a */
        public C9874x m41539a() {
            String str = this.f45316a;
            Uri uri = this.f45317b;
            String str2 = this.f45318c;
            List<C9858i0> list = this.f45319d;
            if (list == null) {
                list = AbstractC4834t.m24539E();
            }
            return new C9874x(str, uri, str2, list, this.f45320e, this.f45321f, this.f45322g, null);
        }

        /* renamed from: b */
        public b m41540b(String str) {
            this.f45321f = str;
            return this;
        }

        /* renamed from: c */
        public b m41541c(byte[] bArr) {
            this.f45322g = bArr;
            return this;
        }

        /* renamed from: d */
        public b m41542d(byte[] bArr) {
            this.f45320e = bArr;
            return this;
        }

        /* renamed from: e */
        public b m41543e(String str) {
            this.f45318c = str;
            return this;
        }

        /* renamed from: f */
        public b m41544f(List<C9858i0> list) {
            this.f45319d = list;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/x$c.class
     */
    /* renamed from: y7.x$c */
    /* loaded from: combined.jar:classes2.jar:y7/x$c.class */
    public static class c extends IOException {
    }

    public C9874x(Parcel parcel) {
        this.f45309b = (String) C4401z0.m22391j(parcel.readString());
        this.f45310c = Uri.parse((String) C4401z0.m22391j(parcel.readString()));
        this.f45311d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((C9858i0) parcel.readParcelable(C9858i0.class.getClassLoader()));
        }
        this.f45312e = Collections.unmodifiableList(arrayList);
        this.f45313f = parcel.createByteArray();
        this.f45314g = parcel.readString();
        this.f45315h = (byte[]) C4401z0.m22391j(parcel.createByteArray());
    }

    public C9874x(String str, Uri uri, String str2, List<C9858i0> list, byte[] bArr, String str3, byte[] bArr2) {
        int m22404p0 = C4401z0.m22404p0(uri, str2);
        boolean z10 = true;
        if (m22404p0 == 0 || m22404p0 == 2 || m22404p0 == 1) {
            C4349a.m21879b(str3 != null ? false : z10, "customCacheKey must be null for type: " + m22404p0);
        }
        this.f45309b = str;
        this.f45310c = uri;
        this.f45311d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f45312e = Collections.unmodifiableList(arrayList);
        this.f45313f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f45314g = str3;
        this.f45315h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : C4401z0.f26684f;
    }

    public /* synthetic */ C9874x(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* renamed from: b */
    public C9874x m41534b(String str) {
        return new C9874x(str, this.f45310c, this.f45311d, this.f45312e, this.f45313f, this.f45314g, this.f45315h);
    }

    /* renamed from: c */
    public C9874x m41535c(byte[] bArr) {
        return new C9874x(this.f45309b, this.f45310c, this.f45311d, this.f45312e, bArr, this.f45314g, this.f45315h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9874x)) {
            return false;
        }
        C9874x c9874x = (C9874x) obj;
        boolean z10 = false;
        if (this.f45309b.equals(c9874x.f45309b)) {
            z10 = false;
            if (this.f45310c.equals(c9874x.f45310c)) {
                z10 = false;
                if (C4401z0.m22371c(this.f45311d, c9874x.f45311d)) {
                    z10 = false;
                    if (this.f45312e.equals(c9874x.f45312e)) {
                        z10 = false;
                        if (Arrays.equals(this.f45313f, c9874x.f45313f)) {
                            z10 = false;
                            if (C4401z0.m22371c(this.f45314g, c9874x.f45314g)) {
                                z10 = false;
                                if (Arrays.equals(this.f45315h, c9874x.f45315h)) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        int hashCode = this.f45309b.hashCode();
        int hashCode2 = this.f45310c.hashCode();
        String str = this.f45311d;
        int i10 = 0;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.f45312e.hashCode();
        int hashCode5 = Arrays.hashCode(this.f45313f);
        String str2 = this.f45314g;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (((((((((((hashCode * 31 * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i10) * 31) + Arrays.hashCode(this.f45315h);
    }

    /* renamed from: j */
    public C9874x m41536j(C9874x c9874x) {
        List emptyList;
        C4349a.m21878a(this.f45309b.equals(c9874x.f45309b));
        if (!this.f45312e.isEmpty() && !c9874x.f45312e.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f45312e);
            int i10 = 0;
            while (true) {
                emptyList = arrayList;
                if (i10 >= c9874x.f45312e.size()) {
                    break;
                }
                C9858i0 c9858i0 = c9874x.f45312e.get(i10);
                if (!arrayList.contains(c9858i0)) {
                    arrayList.add(c9858i0);
                }
                i10++;
            }
        } else {
            emptyList = Collections.emptyList();
        }
        return new C9874x(this.f45309b, c9874x.f45310c, c9874x.f45311d, emptyList, c9874x.f45313f, c9874x.f45314g, c9874x.f45315h);
    }

    public String toString() {
        return this.f45311d + ":" + this.f45309b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45309b);
        parcel.writeString(this.f45310c.toString());
        parcel.writeString(this.f45311d);
        parcel.writeInt(this.f45312e.size());
        for (int i11 = 0; i11 < this.f45312e.size(); i11++) {
            parcel.writeParcelable(this.f45312e.get(i11), 0);
        }
        parcel.writeByteArray(this.f45313f);
        parcel.writeString(this.f45314g);
        parcel.writeByteArray(this.f45315h);
    }
}
