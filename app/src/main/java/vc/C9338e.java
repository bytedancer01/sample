package vc;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tc.C8680c;
import tc.C8681d;
import tc.InterfaceC8682e;
import tc.InterfaceC8683f;
import tc.InterfaceC8684g;
import tc.InterfaceC8685h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vc/e.class
 */
/* renamed from: vc.e */
/* loaded from: combined.jar:classes2.jar:vc/e.class */
public final class C9338e implements InterfaceC8683f, InterfaceC8685h {

    /* renamed from: a */
    public C9338e f42547a = null;

    /* renamed from: b */
    public boolean f42548b = true;

    /* renamed from: c */
    public final JsonWriter f42549c;

    /* renamed from: d */
    public final Map<Class<?>, InterfaceC8682e<?>> f42550d;

    /* renamed from: e */
    public final Map<Class<?>, InterfaceC8684g<?>> f42551e;

    /* renamed from: f */
    public final InterfaceC8682e<Object> f42552f;

    /* renamed from: g */
    public final boolean f42553g;

    public C9338e(Writer writer, Map<Class<?>, InterfaceC8682e<?>> map, Map<Class<?>, InterfaceC8684g<?>> map2, InterfaceC8682e<Object> interfaceC8682e, boolean z10) {
        this.f42549c = new JsonWriter(writer);
        this.f42550d = map;
        this.f42551e = map2;
        this.f42552f = interfaceC8682e;
        this.f42553g = z10;
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: c */
    public InterfaceC8683f mo37179c(C8681d c8681d, Object obj) {
        return mo37181f(c8681d.m37174b(), obj);
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: d */
    public InterfaceC8683f mo37180d(C8681d c8681d, long j10) {
        return m39353l(c8681d.m37174b(), j10);
    }

    /* renamed from: g */
    public C9338e m39348g(int i10) {
        m39362u();
        this.f42549c.value(i10);
        return this;
    }

    /* renamed from: h */
    public C9338e m39349h(long j10) {
        m39362u();
        this.f42549c.value(j10);
        return this;
    }

    /* renamed from: i */
    public C9338e m39350i(Object obj, boolean z10) {
        if (z10 && m39357p(obj)) {
            throw new C8680c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f42549c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f42549c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f42549c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m39350i(it.next(), false);
                }
                this.f42549c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f42549c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo37181f((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C8680c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f42549c.endObject();
                return this;
            }
            InterfaceC8682e<?> interfaceC8682e = this.f42550d.get(obj.getClass());
            if (interfaceC8682e != null) {
                return m39359r(interfaceC8682e, obj, z10);
            }
            InterfaceC8684g<?> interfaceC8684g = this.f42551e.get(obj.getClass());
            if (interfaceC8684g != null) {
                interfaceC8684g.mo5160a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m39359r(this.f42552f, obj, z10);
            }
            mo37182b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m39356o((byte[]) obj);
        }
        this.f42549c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f42549c.value(r0[i10]);
            }
        } else if (obj instanceof long[]) {
            for (long j10 : (long[]) obj) {
                m39349h(j10);
            }
        } else if (obj instanceof double[]) {
            for (double d10 : (double[]) obj) {
                this.f42549c.value(d10);
            }
        } else if (obj instanceof boolean[]) {
            for (boolean z11 : (boolean[]) obj) {
                this.f42549c.value(z11);
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m39350i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m39350i(obj2, false);
            }
        }
        this.f42549c.endArray();
        return this;
    }

    @Override // tc.InterfaceC8685h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C9338e mo37182b(String str) {
        m39362u();
        this.f42549c.value(str);
        return this;
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C9338e mo37178a(String str, int i10) {
        m39362u();
        this.f42549c.name(str);
        return m39348g(i10);
    }

    /* renamed from: l */
    public C9338e m39353l(String str, long j10) {
        m39362u();
        this.f42549c.name(str);
        return m39349h(j10);
    }

    @Override // tc.InterfaceC8683f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C9338e mo37181f(String str, Object obj) {
        return this.f42553g ? m39361t(str, obj) : m39360s(str, obj);
    }

    @Override // tc.InterfaceC8685h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C9338e mo37183e(boolean z10) {
        m39362u();
        this.f42549c.value(z10);
        return this;
    }

    /* renamed from: o */
    public C9338e m39356o(byte[] bArr) {
        m39362u();
        if (bArr == null) {
            this.f42549c.nullValue();
        } else {
            this.f42549c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: p */
    public final boolean m39357p(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: q */
    public void m39358q() {
        m39362u();
        this.f42549c.flush();
    }

    /* renamed from: r */
    public C9338e m39359r(InterfaceC8682e<Object> interfaceC8682e, Object obj, boolean z10) {
        if (!z10) {
            this.f42549c.beginObject();
        }
        interfaceC8682e.mo5160a(obj, this);
        if (!z10) {
            this.f42549c.endObject();
        }
        return this;
    }

    /* renamed from: s */
    public final C9338e m39360s(String str, Object obj) {
        m39362u();
        this.f42549c.name(str);
        if (obj != null) {
            return m39350i(obj, false);
        }
        this.f42549c.nullValue();
        return this;
    }

    /* renamed from: t */
    public final C9338e m39361t(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m39362u();
        this.f42549c.name(str);
        return m39350i(obj, false);
    }

    /* renamed from: u */
    public final void m39362u() {
        if (!this.f42548b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C9338e c9338e = this.f42547a;
        if (c9338e != null) {
            c9338e.m39362u();
            this.f42547a.f42548b = false;
            this.f42547a = null;
            this.f42549c.endObject();
        }
    }
}
