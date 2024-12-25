package p032c2;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p294r.C7928a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:c2/b.class
 */
/* renamed from: c2.b */
/* loaded from: combined.jar:classes1.jar:c2/b.class */
public abstract class AbstractC0978b {

    /* renamed from: a */
    public final C7928a<String, Method> f6727a;

    /* renamed from: b */
    public final C7928a<String, Method> f6728b;

    /* renamed from: c */
    public final C7928a<String, Class> f6729c;

    public AbstractC0978b(C7928a<String, Method> c7928a, C7928a<String, Method> c7928a2, C7928a<String, Class> c7928a3) {
        this.f6727a = c7928a;
        this.f6728b = c7928a2;
        this.f6729c = c7928a3;
    }

    /* renamed from: A */
    public abstract void mo5838A(byte[] bArr);

    /* renamed from: B */
    public void m5839B(byte[] bArr, int i10) {
        mo5874w(i10);
        mo5838A(bArr);
    }

    /* renamed from: C */
    public abstract void mo5840C(CharSequence charSequence);

    /* renamed from: D */
    public void m5841D(CharSequence charSequence, int i10) {
        mo5874w(i10);
        mo5840C(charSequence);
    }

    /* renamed from: E */
    public abstract void mo5842E(int i10);

    /* renamed from: F */
    public void m5843F(int i10, int i11) {
        mo5874w(i11);
        mo5842E(i10);
    }

    /* renamed from: G */
    public abstract void mo5844G(Parcelable parcelable);

    /* renamed from: H */
    public void m5845H(Parcelable parcelable, int i10) {
        mo5874w(i10);
        mo5844G(parcelable);
    }

    /* renamed from: I */
    public abstract void mo5846I(String str);

    /* renamed from: J */
    public void m5847J(String str, int i10) {
        mo5874w(i10);
        mo5846I(str);
    }

    /* renamed from: K */
    public <T extends InterfaceC0980d> void m5848K(T t10, AbstractC0978b abstractC0978b) {
        try {
            m5856e(t10.getClass()).invoke(null, t10, abstractC0978b);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    /* renamed from: L */
    public void m5849L(InterfaceC0980d interfaceC0980d) {
        if (interfaceC0980d == null) {
            mo5846I(null);
            return;
        }
        m5851N(interfaceC0980d);
        AbstractC0978b mo5853b = mo5853b();
        m5848K(interfaceC0980d, mo5853b);
        mo5853b.mo5852a();
    }

    /* renamed from: M */
    public void m5850M(InterfaceC0980d interfaceC0980d, int i10) {
        mo5874w(i10);
        m5849L(interfaceC0980d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final void m5851N(InterfaceC0980d interfaceC0980d) {
        try {
            mo5846I(m5854c(interfaceC0980d.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC0980d.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* renamed from: a */
    public abstract void mo5852a();

    /* renamed from: b */
    public abstract AbstractC0978b mo5853b();

    /* renamed from: c */
    public final Class m5854c(Class<? extends InterfaceC0980d> cls) {
        Class<?> cls2 = this.f6729c.get(cls.getName());
        Class<?> cls3 = cls2;
        if (cls2 == null) {
            cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f6729c.put(cls.getName(), cls3);
        }
        return cls3;
    }

    /* renamed from: d */
    public final Method m5855d(String str) {
        Method method = this.f6727a.get(str);
        Method method2 = method;
        if (method == null) {
            System.currentTimeMillis();
            method2 = Class.forName(str, true, AbstractC0978b.class.getClassLoader()).getDeclaredMethod("read", AbstractC0978b.class);
            this.f6727a.put(str, method2);
        }
        return method2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m5856e(Class cls) {
        Method method = this.f6728b.get(cls.getName());
        Method method2 = method;
        if (method == null) {
            Class m5854c = m5854c(cls);
            System.currentTimeMillis();
            method2 = m5854c.getDeclaredMethod("write", cls, AbstractC0978b.class);
            this.f6728b.put(cls.getName(), method2);
        }
        return method2;
    }

    /* renamed from: f */
    public boolean m5857f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo5858g();

    /* renamed from: h */
    public boolean m5859h(boolean z10, int i10) {
        return !mo5864m(i10) ? z10 : mo5858g();
    }

    /* renamed from: i */
    public abstract byte[] mo5860i();

    /* renamed from: j */
    public byte[] m5861j(byte[] bArr, int i10) {
        return !mo5864m(i10) ? bArr : mo5860i();
    }

    /* renamed from: k */
    public abstract CharSequence mo5862k();

    /* renamed from: l */
    public CharSequence m5863l(CharSequence charSequence, int i10) {
        return !mo5864m(i10) ? charSequence : mo5862k();
    }

    /* renamed from: m */
    public abstract boolean mo5864m(int i10);

    /* renamed from: n */
    public <T extends InterfaceC0980d> T m5865n(String str, AbstractC0978b abstractC0978b) {
        try {
            return (T) m5855d(str).invoke(null, abstractC0978b);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* renamed from: o */
    public abstract int mo5866o();

    /* renamed from: p */
    public int m5867p(int i10, int i11) {
        return !mo5864m(i11) ? i10 : mo5866o();
    }

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo5868q();

    /* renamed from: r */
    public <T extends Parcelable> T m5869r(T t10, int i10) {
        return !mo5864m(i10) ? t10 : (T) mo5868q();
    }

    /* renamed from: s */
    public abstract String mo5870s();

    /* renamed from: t */
    public String m5871t(String str, int i10) {
        return !mo5864m(i10) ? str : mo5870s();
    }

    /* renamed from: u */
    public <T extends InterfaceC0980d> T m5872u() {
        String mo5870s = mo5870s();
        if (mo5870s == null) {
            return null;
        }
        return (T) m5865n(mo5870s, mo5853b());
    }

    /* renamed from: v */
    public <T extends InterfaceC0980d> T m5873v(T t10, int i10) {
        return !mo5864m(i10) ? t10 : (T) m5872u();
    }

    /* renamed from: w */
    public abstract void mo5874w(int i10);

    /* renamed from: x */
    public void m5875x(boolean z10, boolean z11) {
    }

    /* renamed from: y */
    public abstract void mo5876y(boolean z10);

    /* renamed from: z */
    public void m5877z(boolean z10, int i10) {
        mo5874w(i10);
        mo5876y(z10);
    }
}
