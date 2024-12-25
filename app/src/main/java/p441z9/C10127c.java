package p441z9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z9/c.class
 */
/* renamed from: z9.c */
/* loaded from: combined.jar:classes2.jar:z9/c.class */
public class C10127c {
    /* renamed from: A */
    public static <T extends Parcelable> void m42517A(Parcel parcel, T t10, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t10.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m42518a(Parcel parcel) {
        return m42541x(parcel, 20293);
    }

    /* renamed from: b */
    public static void m42519b(Parcel parcel, int i10) {
        m42542y(parcel, i10);
    }

    /* renamed from: c */
    public static void m42520c(Parcel parcel, int i10, boolean z10) {
        m42543z(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: d */
    public static void m42521d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            m42543z(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            m42543z(parcel, i10, 0);
        }
    }

    /* renamed from: e */
    public static void m42522e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeBundle(bundle);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: f */
    public static void m42523f(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeByteArray(bArr);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: g */
    public static void m42524g(Parcel parcel, int i10, double d10) {
        m42543z(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    /* renamed from: h */
    public static void m42525h(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            m42543z(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            m42543z(parcel, i10, 0);
        }
    }

    /* renamed from: i */
    public static void m42526i(Parcel parcel, int i10, float f10) {
        m42543z(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    /* renamed from: j */
    public static void m42527j(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            m42543z(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            m42543z(parcel, i10, 0);
        }
    }

    /* renamed from: k */
    public static void m42528k(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: l */
    public static void m42529l(Parcel parcel, int i10, int i11) {
        m42543z(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* renamed from: m */
    public static void m42530m(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeIntArray(iArr);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: n */
    public static void m42531n(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            m42543z(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            m42543z(parcel, i10, 0);
        }
    }

    /* renamed from: o */
    public static void m42532o(Parcel parcel, int i10, long j10) {
        m42543z(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    /* renamed from: p */
    public static void m42533p(Parcel parcel, int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeLongArray(jArr);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: q */
    public static void m42534q(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            m42543z(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            m42543z(parcel, i10, 0);
        }
    }

    /* renamed from: r */
    public static void m42535r(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: s */
    public static void m42536s(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeString(str);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: t */
    public static void m42537t(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeStringArray(strArr);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: u */
    public static void m42538u(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
            }
        } else {
            int m42541x = m42541x(parcel, i10);
            parcel.writeStringList(list);
            m42542y(parcel, m42541x);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m42539v(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
                return;
            }
            return;
        }
        int m42541x = m42541x(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m42517A(parcel, t10, i11);
            }
        }
        m42542y(parcel, m42541x);
    }

    /* renamed from: w */
    public static <T extends Parcelable> void m42540w(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m42543z(parcel, i10, 0);
                return;
            }
            return;
        }
        int m42541x = m42541x(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m42517A(parcel, t10, 0);
            }
        }
        m42542y(parcel, m42541x);
    }

    /* renamed from: x */
    public static int m42541x(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: y */
    public static void m42542y(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    public static void m42543z(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
