package md;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p188kd.AbstractC5569v;
import p188kd.C5549b;
import p188kd.C5552e;
import p188kd.InterfaceC5548a;
import p188kd.InterfaceC5570w;
import p201ld.InterfaceC5839a;
import p201ld.InterfaceC5842d;
import p201ld.InterfaceC5843e;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/d.class
 */
/* renamed from: md.d */
/* loaded from: combined.jar:classes2.jar:md/d.class */
public final class C6563d implements InterfaceC5570w, Cloneable {

    /* renamed from: h */
    public static final C6563d f34352h = new C6563d();

    /* renamed from: e */
    public boolean f34356e;

    /* renamed from: b */
    public double f34353b = -1.0d;

    /* renamed from: c */
    public int f34354c = 136;

    /* renamed from: d */
    public boolean f34355d = true;

    /* renamed from: f */
    public List<InterfaceC5548a> f34357f = Collections.emptyList();

    /* renamed from: g */
    public List<InterfaceC5548a> f34358g = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/d$a.class
     */
    /* renamed from: md.d$a */
    /* loaded from: combined.jar:classes2.jar:md/d$a.class */
    public class a<T> extends AbstractC5569v<T> {

        /* renamed from: a */
        public AbstractC5569v<T> f34359a;

        /* renamed from: b */
        public final boolean f34360b;

        /* renamed from: c */
        public final boolean f34361c;

        /* renamed from: d */
        public final C5552e f34362d;

        /* renamed from: e */
        public final C8462a f34363e;

        /* renamed from: f */
        public final C6563d f34364f;

        public a(C6563d c6563d, boolean z10, boolean z11, C5552e c5552e, C8462a c8462a) {
            this.f34364f = c6563d;
            this.f34360b = z10;
            this.f34361c = z11;
            this.f34362d = c5552e;
            this.f34363e = c8462a;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: b */
        public T mo27561b(C8555a c8555a) {
            if (!this.f34360b) {
                return m30306e().mo27561b(c8555a);
            }
            c8555a.mo31106T0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: d */
        public void mo27562d(C8557c c8557c, T t10) {
            if (this.f34361c) {
                c8557c.mo31133v0();
            } else {
                m30306e().mo27562d(c8557c, t10);
            }
        }

        /* renamed from: e */
        public final AbstractC5569v<T> m30306e() {
            AbstractC5569v<T> abstractC5569v = this.f34359a;
            if (abstractC5569v == null) {
                abstractC5569v = this.f34362d.m27551n(this.f34364f, this.f34363e);
                this.f34359a = abstractC5569v;
            }
            return abstractC5569v;
        }
    }

    @Override // p188kd.InterfaceC5570w
    /* renamed from: a */
    public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
        Class<? super T> m36351c = c8462a.m36351c();
        boolean m30297d = m30297d(m36351c);
        boolean z10 = m30297d || m30298e(m36351c, true);
        boolean z11 = m30297d || m30298e(m36351c, false);
        if (z10 || z11) {
            return new a(this, z11, z10, c5552e, c8462a);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6563d clone() {
        try {
            return (C6563d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: c */
    public boolean m30296c(Class<?> cls, boolean z10) {
        return m30297d(cls) || m30298e(cls, z10);
    }

    /* renamed from: d */
    public final boolean m30297d(Class<?> cls) {
        if (this.f34353b == -1.0d || m30305m((InterfaceC5842d) cls.getAnnotation(InterfaceC5842d.class), (InterfaceC5843e) cls.getAnnotation(InterfaceC5843e.class))) {
            return (!this.f34355d && m30301i(cls)) || m30300h(cls);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m30298e(Class<?> cls, boolean z10) {
        Iterator<InterfaceC5548a> it = (z10 ? this.f34357f : this.f34358g).iterator();
        while (it.hasNext()) {
            if (it.next().m27536b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m30299g(Field field, boolean z10) {
        if ((this.f34354c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f34353b != -1.0d && !m30305m((InterfaceC5842d) field.getAnnotation(InterfaceC5842d.class), (InterfaceC5843e) field.getAnnotation(InterfaceC5843e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f34356e) {
            InterfaceC5839a interfaceC5839a = (InterfaceC5839a) field.getAnnotation(InterfaceC5839a.class);
            if (interfaceC5839a == null) {
                return true;
            }
            if (z10) {
                if (!interfaceC5839a.serialize()) {
                    return true;
                }
            } else if (!interfaceC5839a.deserialize()) {
                return true;
            }
        }
        if ((!this.f34355d && m30301i(field.getType())) || m30300h(field.getType())) {
            return true;
        }
        List<InterfaceC5548a> list = z10 ? this.f34357f : this.f34358g;
        if (list.isEmpty()) {
            return false;
        }
        C5549b c5549b = new C5549b(field);
        Iterator<InterfaceC5548a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m27535a(c5549b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m30300h(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || m30302j(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    /* renamed from: i */
    public final boolean m30301i(Class<?> cls) {
        return cls.isMemberClass() && !m30302j(cls);
    }

    /* renamed from: j */
    public final boolean m30302j(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: k */
    public final boolean m30303k(InterfaceC5842d interfaceC5842d) {
        return interfaceC5842d == null || interfaceC5842d.value() <= this.f34353b;
    }

    /* renamed from: l */
    public final boolean m30304l(InterfaceC5843e interfaceC5843e) {
        return interfaceC5843e == null || interfaceC5843e.value() > this.f34353b;
    }

    /* renamed from: m */
    public final boolean m30305m(InterfaceC5842d interfaceC5842d, InterfaceC5843e interfaceC5843e) {
        return m30303k(interfaceC5842d) && m30304l(interfaceC5843e);
    }
}
