package p359v0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v0/b.class
 */
/* renamed from: v0.b */
/* loaded from: combined.jar:classes1.jar:v0/b.class */
public class C9220b {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/b$a.class
     */
    /* renamed from: v0.b$a */
    /* loaded from: combined.jar:classes1.jar:v0/b$a.class */
    public interface a<T> {
        /* renamed from: a */
        void mo38826a(T t10, Rect rect);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/b$b.class
     */
    /* renamed from: v0.b$b */
    /* loaded from: combined.jar:classes1.jar:v0/b$b.class */
    public interface b<T, V> {
        /* renamed from: a */
        V mo38828a(T t10, int i10);

        /* renamed from: b */
        int mo38829b(T t10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/b$c.class
     */
    /* renamed from: v0.b$c */
    /* loaded from: combined.jar:classes1.jar:v0/b$c.class */
    public static class c<T> implements Comparator<T> {

        /* renamed from: b */
        public final Rect f42117b = new Rect();

        /* renamed from: c */
        public final Rect f42118c = new Rect();

        /* renamed from: d */
        public final boolean f42119d;

        /* renamed from: e */
        public final a<T> f42120e;

        public c(boolean z10, a<T> aVar) {
            this.f42119d = z10;
            this.f42120e = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            Rect rect = this.f42117b;
            Rect rect2 = this.f42118c;
            this.f42120e.mo38826a(t10, rect);
            this.f42120e.mo38826a(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            int i12 = -1;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i13 = rect.left;
            int i14 = rect2.left;
            if (i13 < i14) {
                if (this.f42119d) {
                    i12 = 1;
                }
                return i12;
            }
            if (i13 > i14) {
                if (!this.f42119d) {
                    i12 = 1;
                }
                return i12;
            }
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if (i15 < i16) {
                return -1;
            }
            if (i15 > i16) {
                return 1;
            }
            int i17 = rect.right;
            int i18 = rect2.right;
            if (i17 < i18) {
                if (this.f42119d) {
                    i12 = 1;
                }
                return i12;
            }
            if (i17 <= i18) {
                return 0;
            }
            if (!this.f42119d) {
                i12 = 1;
            }
            return i12;
        }
    }

    /* renamed from: a */
    public static boolean m38832a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean m38833b = m38833b(i10, rect, rect2);
        boolean z10 = false;
        if (m38833b(i10, rect, rect3) || !m38833b) {
            return false;
        }
        if (!m38841j(i10, rect, rect3) || i10 == 17 || i10 == 66) {
            return true;
        }
        if (m38842k(i10, rect, rect2) < m38844m(i10, rect, rect3)) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: b */
    public static boolean m38833b(int i10, Rect rect, Rect rect2) {
        boolean z10 = true;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z10 = false;
            }
            return z10;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <L, T> T m38834c(L r5, p359v0.C9220b.b<L, T> r6, p359v0.C9220b.a<T> r7, T r8, android.graphics.Rect r9, int r10) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r16 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            r1 = 17
            if (r0 == r1) goto L63
            r0 = r10
            r1 = 33
            if (r0 == r1) goto L4f
            r0 = r10
            r1 = 66
            if (r0 == r1) goto L42
            r0 = r10
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L38
            r0 = r9
            int r0 = r0.height()
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            r11 = r0
            goto L58
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r0
        L42:
            r0 = r9
            int r0 = r0.width()
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            r11 = r0
            goto L6c
        L4f:
            r0 = r9
            int r0 = r0.height()
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
        L58:
            r0 = r16
            r1 = 0
            r2 = r11
            r0.offset(r1, r2)
            goto L74
        L63:
            r0 = r9
            int r0 = r0.width()
            r1 = 1
            int r0 = r0 + r1
            r11 = r0
        L6c:
            r0 = r16
            r1 = r11
            r2 = 0
            r0.offset(r1, r2)
        L74:
            r0 = 0
            r14 = r0
            r0 = r6
            r1 = r5
            int r0 = r0.mo38829b(r1)
            r13 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r12
            r11 = r0
        L8d:
            r0 = r11
            r1 = r13
            if (r0 >= r1) goto Ld1
            r0 = r6
            r1 = r5
            r2 = r11
            java.lang.Object r0 = r0.mo38828a(r1, r2)
            r15 = r0
            r0 = r15
            r1 = r8
            if (r0 != r1) goto La8
            goto Lcb
        La8:
            r0 = r7
            r1 = r15
            r2 = r17
            r0.mo38826a(r1, r2)
            r0 = r10
            r1 = r9
            r2 = r17
            r3 = r16
            boolean r0 = m38839h(r0, r1, r2, r3)
            if (r0 == 0) goto Lcb
            r0 = r16
            r1 = r17
            r0.set(r1)
            r0 = r15
            r14 = r0
        Lcb:
            int r11 = r11 + 1
            goto L8d
        Ld1:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p359v0.C9220b.m38834c(java.lang.Object, v0.b$b, v0.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: d */
    public static <L, T> T m38835d(L l10, b<L, T> bVar, a<T> aVar, T t10, int i10, boolean z10, boolean z11) {
        int mo38829b = bVar.mo38829b(l10);
        ArrayList arrayList = new ArrayList(mo38829b);
        for (int i11 = 0; i11 < mo38829b; i11++) {
            arrayList.add(bVar.mo38828a(l10, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return (T) m38837f(t10, arrayList, z11);
        }
        if (i10 == 2) {
            return (T) m38836e(t10, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static <T> T m38836e(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int lastIndexOf = (t10 == null ? -1 : arrayList.lastIndexOf(t10)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    public static <T> T m38837f(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int indexOf = (t10 == null ? size : arrayList.indexOf(t10)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    public static int m38838g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    /* renamed from: h */
    public static boolean m38839h(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean z10 = false;
        if (!m38840i(rect, rect2, i10)) {
            return false;
        }
        if (!m38840i(rect, rect3, i10) || m38832a(i10, rect, rect2, rect3)) {
            return true;
        }
        if (m38832a(i10, rect, rect3, rect2)) {
            return false;
        }
        if (m38838g(m38842k(i10, rect, rect2), m38846o(i10, rect, rect2)) < m38838g(m38842k(i10, rect, rect3), m38846o(i10, rect, rect3))) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: i */
    public static boolean m38840i(Rect rect, Rect rect2, int i10) {
        boolean z10 = true;
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 != 66) {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int i15 = rect.top;
            int i16 = rect2.top;
            return (i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom;
        }
        int i17 = rect.left;
        int i18 = rect2.left;
        if ((i17 >= i18 && rect.right > i18) || rect.right >= rect2.right) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: j */
    public static boolean m38841j(int i10, Rect rect, Rect rect2) {
        boolean z10 = true;
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            if (rect.top < rect2.bottom) {
                z10 = false;
            }
            return z10;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    public static int m38842k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, m38843l(i10, rect, rect2));
    }

    /* renamed from: l */
    public static int m38843l(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    /* renamed from: m */
    public static int m38844m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, m38845n(i10, rect, rect2));
    }

    /* renamed from: n */
    public static int m38845n(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    /* renamed from: o */
    public static int m38846o(int i10, Rect rect, Rect rect2) {
        int height;
        int i11;
        int height2;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i11 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i11 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i11 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i11 + (height2 / 2)));
    }
}
