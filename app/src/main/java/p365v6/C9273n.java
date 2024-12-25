package p365v6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p059d9.C4349a;
import p059d9.C4401z0;
import p267p6.C7583h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v6/n.class
 */
/* renamed from: v6.n */
/* loaded from: combined.jar:classes2.jar:v6/n.class */
public final class C9273n implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C9273n> CREATOR = new a();

    /* renamed from: b */
    public final b[] f42356b;

    /* renamed from: c */
    public int f42357c;

    /* renamed from: d */
    public final String f42358d;

    /* renamed from: e */
    public final int f42359e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/n$a.class
     */
    /* renamed from: v6.n$a */
    /* loaded from: combined.jar:classes2.jar:v6/n$a.class */
    public class a implements Parcelable.Creator<C9273n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9273n createFromParcel(Parcel parcel) {
            return new C9273n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9273n[] newArray(int i10) {
            return new C9273n[i10];
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v6/n$b.class
     */
    /* renamed from: v6.n$b */
    /* loaded from: combined.jar:classes2.jar:v6/n$b.class */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b */
        public int f42360b;

        /* renamed from: c */
        public final UUID f42361c;

        /* renamed from: d */
        public final String f42362d;

        /* renamed from: e */
        public final String f42363e;

        /* renamed from: f */
        public final byte[] f42364f;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:v6/n$b$a.class
         */
        /* renamed from: v6.n$b$a */
        /* loaded from: combined.jar:classes2.jar:v6/n$b$a.class */
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

        public b(Parcel parcel) {
            this.f42361c = new UUID(parcel.readLong(), parcel.readLong());
            this.f42362d = parcel.readString();
            this.f42363e = (String) C4401z0.m22391j(parcel.readString());
            this.f42364f = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f42361c = (UUID) C4349a.m21882e(uuid);
            this.f42362d = str;
            this.f42363e = (String) C4349a.m21882e(str2);
            this.f42364f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: b */
        public boolean m39143b(b bVar) {
            return m39145j() && !bVar.m39145j() && m39146k(bVar.f42361c);
        }

        /* renamed from: c */
        public b m39144c(byte[] bArr) {
            return new b(this.f42361c, this.f42362d, this.f42363e, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            boolean z10 = false;
            if (C4401z0.m22371c(this.f42362d, bVar.f42362d)) {
                z10 = false;
                if (C4401z0.m22371c(this.f42363e, bVar.f42363e)) {
                    z10 = false;
                    if (C4401z0.m22371c(this.f42361c, bVar.f42361c)) {
                        z10 = false;
                        if (Arrays.equals(this.f42364f, bVar.f42364f)) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }

        public int hashCode() {
            if (this.f42360b == 0) {
                int hashCode = this.f42361c.hashCode();
                String str = this.f42362d;
                this.f42360b = (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f42363e.hashCode()) * 31) + Arrays.hashCode(this.f42364f);
            }
            return this.f42360b;
        }

        /* renamed from: j */
        public boolean m39145j() {
            return this.f42364f != null;
        }

        /* renamed from: k */
        public boolean m39146k(UUID uuid) {
            return C7583h.f36776a.equals(this.f42361c) || uuid.equals(this.f42361c);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f42361c.getMostSignificantBits());
            parcel.writeLong(this.f42361c.getLeastSignificantBits());
            parcel.writeString(this.f42362d);
            parcel.writeString(this.f42363e);
            parcel.writeByteArray(this.f42364f);
        }
    }

    public C9273n(Parcel parcel) {
        this.f42358d = parcel.readString();
        b[] bVarArr = (b[]) C4401z0.m22391j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f42356b = bVarArr;
        this.f42359e = bVarArr.length;
    }

    public C9273n(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C9273n(String str, boolean z10, b... bVarArr) {
        this.f42358d = str;
        b[] bVarArr2 = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f42356b = bVarArr2;
        this.f42359e = bVarArr2.length;
        Arrays.sort(bVarArr2, this);
    }

    public C9273n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C9273n(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public C9273n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    /* renamed from: c */
    public static boolean m39135c(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f42361c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static C9273n m39136k(C9273n c9273n, C9273n c9273n2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c9273n != null) {
            String str2 = c9273n.f42358d;
            b[] bVarArr = c9273n.f42356b;
            int length = bVarArr.length;
            int i10 = 0;
            while (true) {
                str = str2;
                if (i10 >= length) {
                    break;
                }
                b bVar = bVarArr[i10];
                if (bVar.m39145j()) {
                    arrayList.add(bVar);
                }
                i10++;
            }
        } else {
            str = null;
        }
        String str3 = str;
        if (c9273n2 != null) {
            String str4 = str;
            if (str == null) {
                str4 = c9273n2.f42358d;
            }
            int size = arrayList.size();
            b[] bVarArr2 = c9273n2.f42356b;
            int length2 = bVarArr2.length;
            int i11 = 0;
            while (true) {
                str3 = str4;
                if (i11 >= length2) {
                    break;
                }
                b bVar2 = bVarArr2[i11];
                if (bVar2.m39145j() && !m39135c(arrayList, size, bVar2.f42361c)) {
                    arrayList.add(bVar2);
                }
                i11++;
            }
        }
        return arrayList.isEmpty() ? null : new C9273n(str3, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C7583h.f36776a;
        return uuid.equals(bVar.f42361c) ? uuid.equals(bVar2.f42361c) ? 0 : 1 : bVar.f42361c.compareTo(bVar2.f42361c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9273n.class != obj.getClass()) {
            return false;
        }
        C9273n c9273n = (C9273n) obj;
        if (!C4401z0.m22371c(this.f42358d, c9273n.f42358d) || !Arrays.equals(this.f42356b, c9273n.f42356b)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f42357c == 0) {
            String str = this.f42358d;
            this.f42357c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f42356b);
        }
        return this.f42357c;
    }

    /* renamed from: j */
    public C9273n m39138j(String str) {
        return C4401z0.m22371c(this.f42358d, str) ? this : new C9273n(str, false, this.f42356b);
    }

    /* renamed from: l */
    public b m39139l(int i10) {
        return this.f42356b[i10];
    }

    /* renamed from: m */
    public C9273n m39140m(C9273n c9273n) {
        String str;
        String str2 = this.f42358d;
        C4349a.m21884g(str2 == null || (str = c9273n.f42358d) == null || TextUtils.equals(str2, str));
        String str3 = this.f42358d;
        if (str3 == null) {
            str3 = c9273n.f42358d;
        }
        return new C9273n(str3, (b[]) C4401z0.m22326G0(this.f42356b, c9273n.f42356b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42358d);
        parcel.writeTypedArray(this.f42356b, 0);
    }
}
