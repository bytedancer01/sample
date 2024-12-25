package androidx.work;

import androidx.work.C0757b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p071e2.AbstractC4579h;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/work/ArrayCreatingInputMerger.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/work/ArrayCreatingInputMerger.class */
public final class ArrayCreatingInputMerger extends AbstractC4579h {
    @Override // p071e2.AbstractC4579h
    /* renamed from: b */
    public C0757b mo4802b(List<C0757b> list) {
        C0757b.a aVar = new C0757b.a();
        HashMap hashMap = new HashMap();
        Iterator<C0757b> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().m4874j().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = hashMap.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? m4804d(obj, value) : m4805e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m4803c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = m4803c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = m4806f(value);
                }
                hashMap.put(key, value);
            }
        }
        aVar.m4881d(hashMap);
        return aVar.m4878a();
    }

    /* renamed from: c */
    public final Object m4803c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: d */
    public final Object m4804d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: e */
    public final Object m4805e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: f */
    public final Object m4806f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
