package p009a8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p059d9.C4349a;
import p059d9.C4392v;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/z0.class
 */
/* renamed from: a8.z0 */
/* loaded from: combined.jar:classes2.jar:a8/z0.class */
public final class C0134z0 implements Parcelable {
    public static final Parcelable.Creator<C0134z0> CREATOR = new a();

    /* renamed from: b */
    public final int f618b;

    /* renamed from: c */
    public final C7629w0[] f619c;

    /* renamed from: d */
    public int f620d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/z0$a.class
     */
    /* renamed from: a8.z0$a */
    /* loaded from: combined.jar:classes2.jar:a8/z0$a.class */
    public class a implements Parcelable.Creator<C0134z0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0134z0 createFromParcel(Parcel parcel) {
            return new C0134z0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0134z0[] newArray(int i10) {
            return new C0134z0[i10];
        }
    }

    public C0134z0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f618b = readInt;
        this.f619c = new C7629w0[readInt];
        for (int i10 = 0; i10 < this.f618b; i10++) {
            this.f619c[i10] = (C7629w0) parcel.readParcelable(C7629w0.class.getClassLoader());
        }
    }

    public C0134z0(C7629w0... c7629w0Arr) {
        C4349a.m21884g(c7629w0Arr.length > 0);
        this.f619c = c7629w0Arr;
        this.f618b = c7629w0Arr.length;
        m665m();
    }

    /* renamed from: j */
    public static void m660j(String str, String str2, String str3, int i10) {
        C4392v.m22271e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r3.equals("und") != false) goto L6;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m661k(java.lang.String r3) {
        /*
            r0 = r3
            if (r0 == 0) goto Lf
            r0 = r3
            r4 = r0
            r0 = r3
            java.lang.String r1 = "und"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12
        Lf:
            java.lang.String r0 = ""
            r4 = r0
        L12:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0134z0.m661k(java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public static int m662l(int i10) {
        return i10 | 16384;
    }

    /* renamed from: b */
    public C7629w0 m663b(int i10) {
        return this.f619c[i10];
    }

    /* renamed from: c */
    public int m664c(C7629w0 c7629w0) {
        int i10 = 0;
        while (true) {
            C7629w0[] c7629w0Arr = this.f619c;
            if (i10 >= c7629w0Arr.length) {
                return -1;
            }
            if (c7629w0 == c7629w0Arr[i10]) {
                return i10;
            }
            i10++;
        }
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
        if (obj == null || C0134z0.class != obj.getClass()) {
            return false;
        }
        C0134z0 c0134z0 = (C0134z0) obj;
        if (this.f618b != c0134z0.f618b || !Arrays.equals(this.f619c, c0134z0.f619c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        if (this.f620d == 0) {
            this.f620d = 527 + Arrays.hashCode(this.f619c);
        }
        return this.f620d;
    }

    /* renamed from: m */
    public final void m665m() {
        String m661k = m661k(this.f619c[0].f37077d);
        int m662l = m662l(this.f619c[0].f37079f);
        int i10 = 1;
        while (true) {
            C7629w0[] c7629w0Arr = this.f619c;
            if (i10 >= c7629w0Arr.length) {
                return;
            }
            if (!m661k.equals(m661k(c7629w0Arr[i10].f37077d))) {
                C7629w0[] c7629w0Arr2 = this.f619c;
                m660j("languages", c7629w0Arr2[0].f37077d, c7629w0Arr2[i10].f37077d, i10);
                return;
            } else {
                if (m662l != m662l(this.f619c[i10].f37079f)) {
                    m660j("role flags", Integer.toBinaryString(this.f619c[0].f37079f), Integer.toBinaryString(this.f619c[i10].f37079f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f618b);
        for (int i11 = 0; i11 < this.f618b; i11++) {
            parcel.writeParcelable(this.f619c[i11], 0);
        }
    }
}
