package p187kc;

import ec.C4708k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kc/a.class
 */
/* renamed from: kc.a */
/* loaded from: combined.jar:classes2.jar:kc/a.class */
public abstract class AbstractC5545a<T> {
    /* renamed from: a */
    public final Type m27530a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C4708k.m23665g(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
