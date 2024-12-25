package kh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.helpers.MessageFormatter;
import p372vh.C9367f;
import p390wh.InterfaceC9591a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kh/u.class
 */
/* renamed from: kh.u */
/* loaded from: combined.jar:classes2.jar:kh/u.class */
public final class C5627u implements Map, Serializable, InterfaceC9591a {

    /* renamed from: b */
    @NotNull
    public static final C5627u f31702b = new C5627u();

    /* renamed from: b */
    public boolean m27738b(@NotNull Void r42) {
        C9367f.m39526e(r42, "value");
        return false;
    }

    @Override // java.util.Map
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(@Nullable Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m27738b((Void) obj);
        }
        return false;
    }

    @NotNull
    /* renamed from: d */
    public Set<Map.Entry> m27740d() {
        return C5628v.f31703b;
    }

    @NotNull
    /* renamed from: e */
    public Set<Object> m27741e() {
        return C5628v.f31703b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m27740d();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public int m27742f() {
        return 0;
    }

    @NotNull
    /* renamed from: g */
    public Collection m27743g() {
        return C5626t.f31701b;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m27741e();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m27742f();
    }

    @NotNull
    public String toString() {
        return MessageFormatter.DELIM_STR;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m27743g();
    }
}
