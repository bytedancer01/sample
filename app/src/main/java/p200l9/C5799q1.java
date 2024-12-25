package p200l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import p441z9.C10126b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l9/q1.class
 */
/* renamed from: l9.q1 */
/* loaded from: combined.jar:classes2.jar:l9/q1.class */
public final class C5799q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m42488A = C10126b.m42488A(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        C5750c c5750c = null;
        C5809u c5809u = null;
        C5773i c5773i = null;
        C5788n c5788n = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m42488A) {
            int m42509s = C10126b.m42509s(parcel);
            switch (C10126b.m42502l(m42509s)) {
                case 2:
                    mediaInfo = (MediaInfo) C10126b.m42495e(parcel, m42509s, MediaInfo.CREATOR);
                    break;
                case 3:
                    j10 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 4:
                    i10 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 5:
                    d10 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 6:
                    i11 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 7:
                    i12 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 8:
                    j11 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 9:
                    j12 = C10126b.m42513w(parcel, m42509s);
                    break;
                case 10:
                    d11 = C10126b.m42505o(parcel, m42509s);
                    break;
                case 11:
                    z10 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 12:
                    jArr = C10126b.m42494d(parcel, m42509s);
                    break;
                case 13:
                    i13 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 14:
                    i14 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 15:
                    str = C10126b.m42496f(parcel, m42509s);
                    break;
                case 16:
                    i15 = C10126b.m42511u(parcel, m42509s);
                    break;
                case 17:
                    arrayList = C10126b.m42500j(parcel, m42509s, C5791o.CREATOR);
                    break;
                case 18:
                    z11 = C10126b.m42503m(parcel, m42509s);
                    break;
                case 19:
                    c5750c = (C5750c) C10126b.m42495e(parcel, m42509s, C5750c.CREATOR);
                    break;
                case 20:
                    c5809u = (C5809u) C10126b.m42495e(parcel, m42509s, C5809u.CREATOR);
                    break;
                case 21:
                    c5773i = (C5773i) C10126b.m42495e(parcel, m42509s, C5773i.CREATOR);
                    break;
                case 22:
                    c5788n = (C5788n) C10126b.m42495e(parcel, m42509s, C5788n.CREATOR);
                    break;
                default:
                    C10126b.m42516z(parcel, m42509s);
                    break;
            }
        }
        C10126b.m42501k(parcel, m42488A);
        return new C5797q(mediaInfo, j10, i10, d10, i11, i12, j11, j12, d11, z10, jArr, i13, i14, str, i15, arrayList, z11, c5750c, c5809u, c5773i, c5788n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5797q[i10];
    }
}
