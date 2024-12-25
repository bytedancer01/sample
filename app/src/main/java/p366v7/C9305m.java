package p366v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p059d9.C4401z0;
import p267p6.C7565c1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v7/m.class
 */
/* renamed from: v7.m */
/* loaded from: combined.jar:classes2.jar:v7/m.class */
public final class C9305m extends AbstractC9301i {
    public static final Parcelable.Creator<C9305m> CREATOR = new a();

    /* renamed from: c */
    public final String f42438c;

    /* renamed from: d */
    public final String f42439d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v7/m$a.class
     */
    /* renamed from: v7.m$a */
    /* loaded from: combined.jar:classes2.jar:v7/m$a.class */
    public class a implements Parcelable.Creator<C9305m> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9305m createFromParcel(Parcel parcel) {
            return new C9305m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9305m[] newArray(int i10) {
            return new C9305m[i10];
        }
    }

    public C9305m(Parcel parcel) {
        super((String) C4401z0.m22391j(parcel.readString()));
        this.f42438c = parcel.readString();
        this.f42439d = (String) C4401z0.m22391j(parcel.readString());
    }

    public C9305m(String str, String str2, String str3) {
        super(str);
        this.f42438c = str2;
        this.f42439d = str3;
    }

    /* renamed from: b */
    public static List<Integer> m39232b(String str) {
        int parseInt;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                parseInt = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        parseInt = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                parseInt = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(parseInt));
            return arrayList;
        } catch (NumberFormatException e10) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C9305m.class != obj.getClass()) {
            return false;
        }
        C9305m c9305m = (C9305m) obj;
        if (!C4401z0.m22371c(this.f42427b, c9305m.f42427b) || !C4401z0.m22371c(this.f42438c, c9305m.f42438c) || !C4401z0.m22371c(this.f42439d, c9305m.f42439d)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f42427b.hashCode();
        String str = this.f42438c;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f42439d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((527 + hashCode) * 31) + hashCode2) * 31) + i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p366v7.AbstractC9301i, p283q7.C7839a.b
    public void populateMediaMetadata(C7565c1.b bVar) {
        String str = this.f42427b;
        str.hashCode();
        boolean z10 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    z10 = false;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    z10 = true;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    z10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    z10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    z10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    z10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    z10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    z10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    z10 = 8;
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    z10 = 9;
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    z10 = 10;
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    z10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    z10 = 12;
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    z10 = 13;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    z10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    z10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    z10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    z10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    z10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    z10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    z10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    z10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (z10) {
                case false:
                case true:
                    bVar.m32565K(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32567M(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32571Q(Integer.valueOf(Integer.parseInt(this.f42439d.substring(2, 4)))).m32570P(Integer.valueOf(Integer.parseInt(this.f42439d.substring(0, 2))));
                    break;
                case true:
                case true:
                    bVar.m32566L(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32564J(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32568N(this.f42439d);
                    break;
                case true:
                case true:
                    String[] m22356V0 = C4401z0.m22356V0(this.f42439d, "/");
                    bVar.m32578X(Integer.valueOf(Integer.parseInt(m22356V0[0]))).m32577W(m22356V0.length > 1 ? Integer.valueOf(Integer.parseInt(m22356V0[1])) : null);
                    break;
                case true:
                case true:
                    bVar.m32576V(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32579Y(this.f42439d);
                    break;
                case true:
                case true:
                    bVar.m32572R(Integer.valueOf(Integer.parseInt(this.f42439d)));
                    break;
                case true:
                    List<Integer> m39232b = m39232b(this.f42439d);
                    int size = m39232b.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.m32570P(m39232b.get(2));
                            }
                        }
                        bVar.m32571Q(m39232b.get(1));
                    }
                    bVar.m32572R(m39232b.get(0));
                    break;
                case true:
                    List<Integer> m39232b2 = m39232b(this.f42439d);
                    int size2 = m39232b2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.m32573S(m39232b2.get(2));
                            }
                        }
                        bVar.m32574T(m39232b2.get(1));
                    }
                    bVar.m32575U(m39232b2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException e10) {
        }
    }

    @Override // p366v7.AbstractC9301i
    public String toString() {
        return this.f42427b + ": description=" + this.f42438c + ": value=" + this.f42439d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42427b);
        parcel.writeString(this.f42438c);
        parcel.writeString(this.f42439d);
    }
}
