package fi;

import fi.InterfaceC4887z;
import java.lang.Comparable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/y.class
 */
/* renamed from: fi.y */
/* loaded from: combined.jar:classes2.jar:fi/y.class */
public class C4886y<T extends InterfaceC4887z & Comparable<? super T>> {

    @NotNull
    private volatile int _size = 0;

    /* renamed from: a */
    @Nullable
    public T[] f28594a;

    /* renamed from: a */
    public final void m24822a(@NotNull T t10) {
        t10.mo22816a(this);
        T[] m24827f = m24827f();
        int m24824c = m24824c();
        m24831j(m24824c + 1);
        m24827f[m24824c] = t10;
        t10.setIndex(m24824c);
        m24833l(m24824c);
    }

    @Nullable
    /* renamed from: b */
    public final T m24823b() {
        T[] tArr = this.f28594a;
        return tArr == null ? null : tArr[0];
    }

    /* renamed from: c */
    public final int m24824c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m24825d() {
        return m24824c() == 0;
    }

    @Nullable
    /* renamed from: e */
    public final T m24826e() {
        T m24823b;
        synchronized (this) {
            m24823b = m24823b();
        }
        return m24823b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fi.z[]] */
    /* JADX WARN: Type inference failed for: r0v14, types: [fi.z[]] */
    /* renamed from: f */
    public final T[] m24827f() {
        T[] tArr;
        T[] tArr2 = this.f28594a;
        if (tArr2 == null) {
            tArr = new InterfaceC4887z[4];
            this.f28594a = tArr;
        } else {
            tArr = tArr2;
            if (m24824c() >= tArr2.length) {
                Object[] copyOf = Arrays.copyOf(tArr2, m24824c() * 2);
                C9367f.m39525d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                tArr = (InterfaceC4887z[]) copyOf;
                this.f28594a = tArr;
            }
        }
        return tArr;
    }

    /* renamed from: g */
    public final boolean m24828g(@NotNull T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.mo22818d() == null) {
                z10 = false;
            } else {
                m24829h(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    @NotNull
    /* renamed from: h */
    public final T m24829h(int i10) {
        T[] tArr = this.f28594a;
        C9367f.m39524c(tArr);
        m24831j(m24824c() - 1);
        if (i10 < m24824c()) {
            m24834m(i10, m24824c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                C9367f.m39524c(t10);
                Comparable comparable = (Comparable) t10;
                T t11 = tArr[i11];
                C9367f.m39524c(t11);
                if (comparable.compareTo(t11) < 0) {
                    m24834m(i10, i11);
                    m24833l(i11);
                }
            }
            m24832k(i10);
        }
        T t12 = tArr[m24824c()];
        C9367f.m39524c(t12);
        t12.mo22816a(null);
        t12.setIndex(-1);
        tArr[m24824c()] = null;
        return t12;
    }

    @Nullable
    /* renamed from: i */
    public final T m24830i() {
        T m24829h;
        synchronized (this) {
            m24829h = m24824c() > 0 ? m24829h(0) : null;
        }
        return m24829h;
    }

    /* renamed from: j */
    public final void m24831j(int i10) {
        this._size = i10;
    }

    /* renamed from: k */
    public final void m24832k(int i10) {
        while (true) {
            int i11 = i10;
            int i12 = (i11 * 2) + 1;
            if (i12 >= m24824c()) {
                return;
            }
            T[] tArr = this.f28594a;
            C9367f.m39524c(tArr);
            int i13 = i12 + 1;
            i10 = i12;
            if (i13 < m24824c()) {
                T t10 = tArr[i13];
                C9367f.m39524c(t10);
                Comparable comparable = (Comparable) t10;
                T t11 = tArr[i12];
                C9367f.m39524c(t11);
                i10 = i12;
                if (comparable.compareTo(t11) < 0) {
                    i10 = i13;
                }
            }
            T t12 = tArr[i11];
            C9367f.m39524c(t12);
            Comparable comparable2 = (Comparable) t12;
            T t13 = tArr[i10];
            C9367f.m39524c(t13);
            if (comparable2.compareTo(t13) <= 0) {
                return;
            } else {
                m24834m(i11, i10);
            }
        }
    }

    /* renamed from: l */
    public final void m24833l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f28594a;
            C9367f.m39524c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C9367f.m39524c(t10);
            Comparable comparable = (Comparable) t10;
            T t11 = tArr[i10];
            C9367f.m39524c(t11);
            if (comparable.compareTo(t11) <= 0) {
                return;
            }
            m24834m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: m */
    public final void m24834m(int i10, int i11) {
        T[] tArr = this.f28594a;
        C9367f.m39524c(tArr);
        T t10 = tArr[i11];
        C9367f.m39524c(t10);
        T t11 = tArr[i10];
        C9367f.m39524c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
