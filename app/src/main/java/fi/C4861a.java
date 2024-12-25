package fi;

import kh.C5612f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/a.class
 */
/* renamed from: fi.a */
/* loaded from: combined.jar:classes2.jar:fi/a.class */
public class C4861a<T> {

    /* renamed from: a */
    @NotNull
    public Object[] f28540a = new Object[16];

    /* renamed from: b */
    public int f28541b;

    /* renamed from: c */
    public int f28542c;

    /* renamed from: a */
    public final void m24732a(@NotNull T t10) {
        Object[] objArr = this.f28540a;
        int i10 = this.f28542c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f28542c = length;
        if (length == this.f28541b) {
            m24733b();
        }
    }

    /* renamed from: b */
    public final void m24733b() {
        Object[] objArr = this.f28540a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C5612f.m27680f(objArr, objArr2, 0, this.f28541b, 0, 10, null);
        Object[] objArr3 = this.f28540a;
        int length2 = objArr3.length;
        int i10 = this.f28541b;
        C5612f.m27680f(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f28540a = objArr2;
        this.f28541b = 0;
        this.f28542c = length;
    }

    /* renamed from: c */
    public final boolean m24734c() {
        return this.f28541b == this.f28542c;
    }

    @Nullable
    /* renamed from: d */
    public final T m24735d() {
        int i10 = this.f28541b;
        if (i10 == this.f28542c) {
            return null;
        }
        Object[] objArr = this.f28540a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f28541b = (i10 + 1) & (objArr.length - 1);
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
