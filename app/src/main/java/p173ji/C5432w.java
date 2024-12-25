package p173ji;

import ci.C1128n;
import ci.C1129o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kh.C5613g;
import kh.C5616j;
import kh.C5621o;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5391j;
import p172jh.C5395n;
import p372vh.C9363b;
import p372vh.C9365d;
import p372vh.C9367f;
import p372vh.C9374m;
import p390wh.InterfaceC9591a;
import p448zh.C10236a;
import p448zh.C10240e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/w.class
 */
/* renamed from: ji.w */
/* loaded from: combined.jar:classes2.jar:ji/w.class */
public final class C5432w implements Iterable<C5391j<? extends String, ? extends String>>, InterfaceC9591a {

    /* renamed from: c */
    public static final b f31143c = new b(null);

    /* renamed from: b */
    public final String[] f31144b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/w$a.class
     */
    /* renamed from: ji.w$a */
    /* loaded from: combined.jar:classes2.jar:ji/w$a.class */
    public static final class a {

        /* renamed from: a */
        @NotNull
        public final List<String> f31145a = new ArrayList(20);

        @NotNull
        /* renamed from: a */
        public final a m27087a(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            b bVar = C5432w.f31143c;
            bVar.m27099d(str);
            bVar.m27100e(str2, str);
            m27090d(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final a m27088b(@NotNull C5432w c5432w) {
            C9367f.m39526e(c5432w, "headers");
            int size = c5432w.size();
            for (int i10 = 0; i10 < size; i10++) {
                m27090d(c5432w.m27082b(i10), c5432w.m27085h(i10));
            }
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final a m27089c(@NotNull String str) {
            C9367f.m39526e(str, "line");
            int m6746N = C1129o.m6746N(str, ':', 1, false, 4, null);
            if (m6746N != -1) {
                String substring = str.substring(0, m6746N);
                C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(m6746N + 1);
                C9367f.m39525d(substring2, "(this as java.lang.String).substring(startIndex)");
                m27090d(substring, substring2);
            } else {
                String str2 = str;
                if (str.charAt(0) == ':') {
                    str2 = str.substring(1);
                    C9367f.m39525d(str2, "(this as java.lang.String).substring(startIndex)");
                }
                m27090d("", str2);
            }
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final a m27090d(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            this.f31145a.add(str);
            this.f31145a.add(C1129o.m6780v0(str2).toString());
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final a m27091e(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            C5432w.f31143c.m27099d(str);
            m27090d(str, str2);
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final C5432w m27092f() {
            Object[] array = this.f31145a.toArray(new String[0]);
            if (array != null) {
                return new C5432w((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @NotNull
        /* renamed from: g */
        public final List<String> m27093g() {
            return this.f31145a;
        }

        @NotNull
        /* renamed from: h */
        public final a m27094h(@NotNull String str) {
            C9367f.m39526e(str, "name");
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= this.f31145a.size()) {
                    return this;
                }
                int i12 = i11;
                if (C1128n.m6719l(str, this.f31145a.get(i11), true)) {
                    this.f31145a.remove(i11);
                    this.f31145a.remove(i11);
                    i12 = i11 - 2;
                }
                i10 = i12 + 2;
            }
        }

        @NotNull
        /* renamed from: i */
        public final a m27095i(@NotNull String str, @NotNull String str2) {
            C9367f.m39526e(str, "name");
            C9367f.m39526e(str2, "value");
            b bVar = C5432w.f31143c;
            bVar.m27099d(str);
            bVar.m27100e(str2, str);
            m27094h(str);
            m27090d(str, str2);
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/w$b.class
     */
    /* renamed from: ji.w$b */
    /* loaded from: combined.jar:classes2.jar:ji/w$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        /* renamed from: d */
        public final void m27099d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(C5634b.m27797q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* renamed from: e */
        public final void m27100e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C5634b.m27797q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                    sb2.append(C5634b.m27760D(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* renamed from: f */
        public final String m27101f(String[] strArr, String str) {
            C10236a m42840h = C10240e.m42840h(C10240e.m42839g(strArr.length - 2, 0), 2);
            int m42824d = m42840h.m42824d();
            int m42825f = m42840h.m42825f();
            int m42826g = m42840h.m42826g();
            if (m42826g >= 0) {
                if (m42824d > m42825f) {
                    return null;
                }
            } else if (m42824d < m42825f) {
                return null;
            }
            while (!C1128n.m6719l(str, strArr[m42824d], true)) {
                if (m42824d == m42825f) {
                    return null;
                }
                m42824d += m42826g;
            }
            return strArr[m42824d + 1];
        }

        @NotNull
        /* renamed from: g */
        public final C5432w m27102g(@NotNull String... strArr) {
            C9367f.m39526e(strArr, "namesAndValues");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) clone;
            int length = strArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr2[i10];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr2[i10] = C1129o.m6780v0(str).toString();
            }
            C10236a m42840h = C10240e.m42840h(C5613g.m27687m(strArr2), 2);
            int m42824d = m42840h.m42824d();
            int m42825f = m42840h.m42825f();
            int m42826g = m42840h.m42826g();
            if (m42826g < 0 ? m42824d >= m42825f : m42824d <= m42825f) {
                while (true) {
                    String str2 = strArr2[m42824d];
                    String str3 = strArr2[m42824d + 1];
                    m27099d(str2);
                    m27100e(str3, str2);
                    if (m42824d == m42825f) {
                        break;
                    }
                    m42824d += m42826g;
                }
            }
            return new C5432w(strArr2, null);
        }
    }

    public C5432w(String[] strArr) {
        this.f31144b = strArr;
    }

    public /* synthetic */ C5432w(String[] strArr, C9365d c9365d) {
        this(strArr);
    }

    @NotNull
    /* renamed from: g */
    public static final C5432w m27080g(@NotNull String... strArr) {
        return f31143c.m27102g(strArr);
    }

    @Nullable
    /* renamed from: a */
    public final String m27081a(@NotNull String str) {
        C9367f.m39526e(str, "name");
        return f31143c.m27101f(this.f31144b, str);
    }

    @NotNull
    /* renamed from: b */
    public final String m27082b(int i10) {
        return this.f31144b[i10 * 2];
    }

    @NotNull
    /* renamed from: d */
    public final Set<String> m27083d() {
        TreeSet treeSet = new TreeSet(C1128n.m6720m(C9374m.f42907a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(m27082b(i10));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C9367f.m39525d(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C5432w) && Arrays.equals(this.f31144b, ((C5432w) obj).f31144b);
    }

    @NotNull
    /* renamed from: f */
    public final a m27084f() {
        a aVar = new a();
        C5621o.m27711q(aVar.m27093g(), this.f31144b);
        return aVar;
    }

    @NotNull
    /* renamed from: h */
    public final String m27085h(int i10) {
        return this.f31144b[(i10 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f31144b);
    }

    @NotNull
    /* renamed from: i */
    public final List<String> m27086i(@NotNull String str) {
        List<String> m27700f;
        C9367f.m39526e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = arrayList;
            if (C1128n.m6719l(str, m27082b(i10), true)) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(m27085h(i10));
            }
            i10++;
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m27700f = Collections.unmodifiableList(arrayList);
            C9367f.m39525d(m27700f, "Collections.unmodifiableList(result)");
        } else {
            m27700f = C5616j.m27700f();
        }
        return m27700f;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C5391j<? extends String, ? extends String>> iterator() {
        int size = size();
        C5391j[] c5391jArr = new C5391j[size];
        for (int i10 = 0; i10 < size; i10++) {
            c5391jArr[i10] = C5395n.m26748a(m27082b(i10), m27085h(i10));
        }
        return C9363b.m39519a(c5391jArr);
    }

    public final int size() {
        return this.f31144b.length / 2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String m27082b = m27082b(i10);
            String m27085h = m27085h(i10);
            sb2.append(m27082b);
            sb2.append(": ");
            if (C5634b.m27760D(m27082b)) {
                m27085h = "██";
            }
            sb2.append(m27085h);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
