package p441z9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z9/b.class
 */
/* renamed from: z9.b */
/* loaded from: combined.jar:classes2.jar:z9/b.class */
public class C10126b {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z9/b$a.class
     */
    /* renamed from: z9.b$a */
    /* loaded from: combined.jar:classes2.jar:z9/b$a.class */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.String r6, android.os.Parcel r7) {
            /*
                r5 = this;
                r0 = r7
                int r0 = r0.dataPosition()
                r8 = r0
                r0 = r7
                int r0 = r0.dataSize()
                r9 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r6
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r2 = r2.length()
                r3 = 41
                int r2 = r2 + r3
                r1.<init>(r2)
                r7 = r0
                r0 = r7
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                java.lang.String r1 = " Parcel: pos="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                r1 = r8
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                java.lang.String r1 = " size="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r7
                r1 = r9
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r7
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p441z9.C10126b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: A */
    public static int m42488A(Parcel parcel) {
        int m42509s = m42509s(parcel);
        int m42515y = m42515y(parcel, m42509s);
        int dataPosition = parcel.dataPosition();
        if (m42502l(m42509s) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m42509s));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i10 = m42515y + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    /* renamed from: B */
    public static void m42489B(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    /* renamed from: C */
    public static void m42490C(Parcel parcel, int i10, int i11) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == i11) {
            return;
        }
        String hexString = Integer.toHexString(m42515y);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(m42515y);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    /* renamed from: a */
    public static Bundle m42491a(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m42515y);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m42492b(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m42515y);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m42493c(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m42515y);
        return createIntArray;
    }

    /* renamed from: d */
    public static long[] m42494d(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m42515y);
        return createLongArray;
    }

    /* renamed from: e */
    public static <T extends Parcelable> T m42495e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m42515y);
        return createFromParcel;
    }

    /* renamed from: f */
    public static String m42496f(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m42515y);
        return readString;
    }

    /* renamed from: g */
    public static String[] m42497g(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m42515y);
        return createStringArray;
    }

    /* renamed from: h */
    public static ArrayList<String> m42498h(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m42515y);
        return createStringArrayList;
    }

    /* renamed from: i */
    public static <T> T[] m42499i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m42515y);
        return tArr;
    }

    /* renamed from: j */
    public static <T> ArrayList<T> m42500j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m42515y);
        return createTypedArrayList;
    }

    /* renamed from: k */
    public static void m42501k(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    /* renamed from: l */
    public static int m42502l(int i10) {
        return (char) i10;
    }

    /* renamed from: m */
    public static boolean m42503m(Parcel parcel, int i10) {
        m42490C(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: n */
    public static Boolean m42504n(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == 0) {
            return null;
        }
        m42489B(parcel, i10, m42515y, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: o */
    public static double m42505o(Parcel parcel, int i10) {
        m42490C(parcel, i10, 8);
        return parcel.readDouble();
    }

    /* renamed from: p */
    public static Double m42506p(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == 0) {
            return null;
        }
        m42489B(parcel, i10, m42515y, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: q */
    public static float m42507q(Parcel parcel, int i10) {
        m42490C(parcel, i10, 4);
        return parcel.readFloat();
    }

    /* renamed from: r */
    public static Float m42508r(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == 0) {
            return null;
        }
        m42489B(parcel, i10, m42515y, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: s */
    public static int m42509s(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: t */
    public static IBinder m42510t(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m42515y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m42515y);
        return readStrongBinder;
    }

    /* renamed from: u */
    public static int m42511u(Parcel parcel, int i10) {
        m42490C(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: v */
    public static Integer m42512v(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == 0) {
            return null;
        }
        m42489B(parcel, i10, m42515y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: w */
    public static long m42513w(Parcel parcel, int i10) {
        m42490C(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: x */
    public static Long m42514x(Parcel parcel, int i10) {
        int m42515y = m42515y(parcel, i10);
        if (m42515y == 0) {
            return null;
        }
        m42489B(parcel, i10, m42515y, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: y */
    public static int m42515y(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* renamed from: z */
    public static void m42516z(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m42515y(parcel, i10));
    }
}
