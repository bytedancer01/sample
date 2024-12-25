package p305ra;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p305ra.AbstractC8231l6;
import p305ra.C8186i6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l6.class
 */
/* renamed from: ra.l6 */
/* loaded from: combined.jar:classes2.jar:ra/l6.class */
public abstract class AbstractC8231l6<MessageType extends AbstractC8231l6<MessageType, BuilderType>, BuilderType extends C8186i6<MessageType, BuilderType>> extends AbstractC8349t4<MessageType, BuilderType> {
    private static final Map<Object, AbstractC8231l6<?, ?>> zza = new ConcurrentHashMap();
    public C8323r8 zzc = C8323r8.m35762a();
    public int zzd = -1;

    /* renamed from: k */
    public static Object m35574k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: l */
    public static InterfaceC8306q6 m35575l() {
        return C8246m6.m35605f();
    }

    /* renamed from: m */
    public static InterfaceC8321r6 m35576m() {
        return C8142f7.m35363f();
    }

    /* renamed from: n */
    public static InterfaceC8321r6 m35577n(InterfaceC8321r6 interfaceC8321r6) {
        int size = interfaceC8321r6.size();
        return interfaceC8321r6.mo35006n(size == 0 ? 10 : size + size);
    }

    /* renamed from: o */
    public static <E> InterfaceC8351t6<E> m35578o() {
        return C8068a8.m35003f();
    }

    /* renamed from: p */
    public static <E> InterfaceC8351t6<E> m35579p(InterfaceC8351t6<E> interfaceC8351t6) {
        int size = interfaceC8351t6.size();
        return interfaceC8351t6.mo35006n(size == 0 ? 10 : size + size);
    }

    /* renamed from: s */
    public static <T extends AbstractC8231l6> T m35580s(Class<T> cls) {
        Map<Object, AbstractC8231l6<?, ?>> map = zza;
        AbstractC8231l6<?, ?> abstractC8231l6 = map.get(cls);
        AbstractC8231l6<?, ?> abstractC8231l62 = abstractC8231l6;
        if (abstractC8231l6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC8231l62 = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        AbstractC8231l6<?, ?> abstractC8231l63 = abstractC8231l62;
        if (abstractC8231l62 == null) {
            abstractC8231l63 = (AbstractC8231l6) ((AbstractC8231l6) C8099c9.m35128n(cls)).mo35030x(6, null, null);
            if (abstractC8231l63 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC8231l63);
        }
        return abstractC8231l63;
    }

    /* renamed from: u */
    public static <T extends AbstractC8231l6> void m35581u(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    /* renamed from: w */
    public static Object m35582w(InterfaceC8307q7 interfaceC8307q7, String str, Object[] objArr) {
        return new C8083b8(interfaceC8307q7, str, objArr);
    }

    @Override // p305ra.InterfaceC8307q7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC8292p7 mo35583a() {
        return (C8186i6) mo35030x(5, null, null);
    }

    @Override // p305ra.InterfaceC8307q7
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC8292p7 mo35584b() {
        C8186i6 c8186i6 = (C8186i6) mo35030x(5, null, null);
        c8186i6.m35446m(this);
        return c8186i6;
    }

    @Override // p305ra.InterfaceC8322r7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC8307q7 mo35441d() {
        return (AbstractC8231l6) mo35030x(6, null, null);
    }

    @Override // p305ra.InterfaceC8307q7
    /* renamed from: e */
    public final void mo35585e(AbstractC8350t5 abstractC8350t5) {
        C8442z7.m36242a().m36243b(getClass()).mo35097b(this, C8365u5.m35865l(abstractC8350t5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C8442z7.m36242a().m36243b(getClass()).mo35103h(this, (AbstractC8231l6) obj);
        }
        return false;
    }

    @Override // p305ra.InterfaceC8307q7
    /* renamed from: g */
    public final int mo35586g() {
        int i10 = this.zzd;
        int i11 = i10;
        if (i10 == -1) {
            i11 = C8442z7.m36242a().m36243b(getClass()).mo35096a(this);
            this.zzd = i11;
        }
        return i11;
    }

    @Override // p305ra.AbstractC8349t4
    /* renamed from: h */
    public final int mo35587h() {
        return this.zzd;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int mo35099d = C8442z7.m36242a().m36243b(getClass()).mo35099d(this);
        this.zzb = mo35099d;
        return mo35099d;
    }

    @Override // p305ra.AbstractC8349t4
    /* renamed from: i */
    public final void mo35588i(int i10) {
        this.zzd = i10;
    }

    /* renamed from: q */
    public final <MessageType extends AbstractC8231l6<MessageType, BuilderType>, BuilderType extends C8186i6<MessageType, BuilderType>> BuilderType m35589q() {
        return (BuilderType) mo35030x(5, null, null);
    }

    /* renamed from: r */
    public final BuilderType m35590r() {
        BuilderType buildertype = (BuilderType) mo35030x(5, null, null);
        buildertype.m35446m(this);
        return buildertype;
    }

    public final String toString() {
        return C8352t7.m35828a(this, super.toString());
    }

    /* renamed from: x */
    public abstract Object mo35030x(int i10, Object obj, Object obj2);
}
