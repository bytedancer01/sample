package dj;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: dj.l */
/* loaded from: combined.jar:classes3.jar:dj/l.class */
public final class C4545l {

    /* renamed from: a */
    public final Method f26998a;

    /* renamed from: b */
    public final List<?> f26999b;

    public C4545l(Method method, List<?> list) {
        this.f26998a = method;
        this.f26999b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m22884a() {
        return this.f26998a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f26998a.getDeclaringClass().getName(), this.f26998a.getName(), this.f26999b);
    }
}
