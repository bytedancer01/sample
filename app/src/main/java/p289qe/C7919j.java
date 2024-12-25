package p289qe;

import org.apache.commons.net.ftp.FTPReply;
import p444zd.C10194b;
import td.C8691f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qe/j.class
 */
/* renamed from: qe.j */
/* loaded from: combined.jar:classes2.jar:qe/j.class */
public final class C7919j {

    /* renamed from: e */
    public static final int[] f38059e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C7919j[] f38060f = m34287b();

    /* renamed from: a */
    public final int f38061a;

    /* renamed from: b */
    public final int[] f38062b;

    /* renamed from: c */
    public final b[] f38063c;

    /* renamed from: d */
    public final int f38064d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qe/j$a.class
     */
    /* renamed from: qe.j$a */
    /* loaded from: combined.jar:classes2.jar:qe/j$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f38065a;

        /* renamed from: b */
        public final int f38066b;

        public a(int i10, int i11) {
            this.f38065a = i10;
            this.f38066b = i11;
        }

        /* renamed from: a */
        public int m34297a() {
            return this.f38065a;
        }

        /* renamed from: b */
        public int m34298b() {
            return this.f38066b;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:qe/j$b.class
     */
    /* renamed from: qe.j$b */
    /* loaded from: combined.jar:classes2.jar:qe/j$b.class */
    public static final class b {

        /* renamed from: a */
        public final int f38067a;

        /* renamed from: b */
        public final a[] f38068b;

        public b(int i10, a... aVarArr) {
            this.f38067a = i10;
            this.f38068b = aVarArr;
        }

        /* renamed from: a */
        public a[] m34299a() {
            return this.f38068b;
        }

        /* renamed from: b */
        public int m34300b() {
            return this.f38067a;
        }
    }

    public C7919j(int i10, int[] iArr, b... bVarArr) {
        this.f38061a = i10;
        this.f38062b = iArr;
        this.f38063c = bVarArr;
        int m34300b = bVarArr[0].m34300b();
        int i11 = 0;
        for (a aVar : bVarArr[0].m34299a()) {
            i11 += aVar.m34297a() * (aVar.m34298b() + m34300b);
        }
        this.f38064d = i11;
    }

    /* renamed from: b */
    public static C7919j[] m34287b() {
        return new C7919j[]{new C7919j(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new C7919j(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new C7919j(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new C7919j(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new C7919j(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new C7919j(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new C7919j(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new C7919j(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new C7919j(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new C7919j(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new C7919j(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new C7919j(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new C7919j(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new C7919j(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new C7919j(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new C7919j(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new C7919j(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new C7919j(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new C7919j(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new C7919j(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new C7919j(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, 117)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new C7919j(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new C7919j(23, new int[]{6, 30, 54, 78, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new C7919j(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, 117), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new C7919j(25, new int[]{6, 32, 58, 84, 110}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new C7919j(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new C7919j(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new C7919j(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, 117), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new C7919j(29, new int[]{6, 30, 54, 78, 102, 126}, new b(30, new a(7, 116), new a(7, 117)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new C7919j(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new C7919j(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new C7919j(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new C7919j(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new C7919j(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new C7919j(35, new int[]{6, 30, 54, 78, 102, 126, FTPReply.FILE_STATUS_OK}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new C7919j(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new C7919j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new C7919j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new C7919j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b(30, new a(20, 117), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new C7919j(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    /* renamed from: c */
    public static C7919j m34288c(int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        while (true) {
            int i14 = i13;
            int[] iArr = f38059e;
            if (i11 >= iArr.length) {
                if (i14 <= 3) {
                    return m34290i(i12);
                }
                return null;
            }
            int i15 = iArr[i11];
            if (i15 == i10) {
                return m34290i(i11 + 7);
            }
            int m34283e = C7916g.m34283e(i10, i15);
            int i16 = i14;
            if (m34283e < i14) {
                i12 = i11 + 7;
                i16 = m34283e;
            }
            i11++;
            i13 = i16;
        }
    }

    /* renamed from: g */
    public static C7919j m34289g(int i10) {
        if (i10 % 4 != 1) {
            throw C8691f.m37197a();
        }
        try {
            return m34290i((i10 - 17) / 4);
        } catch (IllegalArgumentException e10) {
            throw C8691f.m37197a();
        }
    }

    /* renamed from: i */
    public static C7919j m34290i(int i10) {
        if (i10 <= 0 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f38060f[i10 - 1];
    }

    /* renamed from: a */
    public C10194b m34291a() {
        int m34293e = m34293e();
        C10194b c10194b = new C10194b(m34293e);
        c10194b.m42681n(0, 0, 9, 9);
        int i10 = m34293e - 8;
        c10194b.m42681n(i10, 0, 8, 9);
        c10194b.m42681n(0, i10, 9, 8);
        int length = this.f38062b.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.f38062b[i11];
            for (int i13 = 0; i13 < length; i13++) {
                if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                    c10194b.m42681n(this.f38062b[i13] - 2, i12 - 2, 5, 5);
                }
            }
        }
        int i14 = m34293e - 17;
        c10194b.m42681n(6, 9, 1, i14);
        c10194b.m42681n(9, 6, i14, 1);
        if (this.f38061a > 6) {
            int i15 = m34293e - 11;
            c10194b.m42681n(i15, 0, 3, 6);
            c10194b.m42681n(0, i15, 6, 3);
        }
        return c10194b;
    }

    /* renamed from: d */
    public int[] m34292d() {
        return this.f38062b;
    }

    /* renamed from: e */
    public int m34293e() {
        return (this.f38061a * 4) + 17;
    }

    /* renamed from: f */
    public b m34294f(EnumC7915f enumC7915f) {
        return this.f38063c[enumC7915f.ordinal()];
    }

    /* renamed from: h */
    public int m34295h() {
        return this.f38064d;
    }

    /* renamed from: j */
    public int m34296j() {
        return this.f38061a;
    }

    public String toString() {
        return String.valueOf(this.f38061a);
    }
}
