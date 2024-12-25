package p372vh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vh/c.class
 */
/* renamed from: vh.c */
/* loaded from: combined.jar:classes2.jar:vh/c.class */
public final class C9364c {

    /* renamed from: a */
    @NotNull
    public static final Object[] f42900a = new Object[0];

    @NotNull
    /* renamed from: a */
    public static final Object[] m39520a(@NotNull Collection<?> collection) {
        Object[] objArr;
        Object[] objArr2;
        C9367f.m39526e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 < objArr.length) {
                        objArr2 = objArr;
                        if (!it.hasNext()) {
                            objArr = Arrays.copyOf(objArr, i11);
                            C9367f.m39525d(objArr, "copyOf(result, size)");
                            break;
                        }
                        i10 = i11;
                        objArr = objArr2;
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        int i13 = i12;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i13 = 2147483645;
                        }
                        objArr2 = Arrays.copyOf(objArr, i13);
                        C9367f.m39525d(objArr2, "copyOf(result, newSize)");
                        i10 = i11;
                        objArr = objArr2;
                    }
                }
                return objArr;
            }
        }
        objArr = f42900a;
        return objArr;
    }

    @NotNull
    /* renamed from: b */
    public static final Object[] m39521b(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        C9367f.m39526e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            objArr3 = objArr;
            if (objArr.length > 0) {
                objArr[0] = null;
                objArr3 = objArr;
            }
        } else {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    if (newInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    objArr3 = objArr2;
                    int i11 = i10 + 1;
                    objArr3[i10] = it.next();
                    if (i11 < objArr3.length) {
                        objArr4 = objArr3;
                        if (it.hasNext()) {
                            i10 = i11;
                            objArr2 = objArr4;
                        } else if (objArr3 == objArr) {
                            objArr[i11] = null;
                            objArr3 = objArr;
                        } else {
                            objArr3 = Arrays.copyOf(objArr3, i11);
                            C9367f.m39525d(objArr3, "copyOf(result, size)");
                        }
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        int i13 = i12;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i13 = 2147483645;
                        }
                        objArr4 = Arrays.copyOf(objArr3, i13);
                        C9367f.m39525d(objArr4, "copyOf(result, newSize)");
                        i10 = i11;
                        objArr2 = objArr4;
                    }
                }
            } else {
                objArr3 = objArr;
                if (objArr.length > 0) {
                    objArr[0] = null;
                    objArr3 = objArr;
                }
            }
        }
        return objArr3;
    }
}
