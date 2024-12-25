package ma;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ma.AbstractC6295ng;
import ma.C6253lg;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ng.class
 */
/* renamed from: ma.ng */
/* loaded from: combined.jar:classes2.jar:ma/ng.class */
public abstract class AbstractC6295ng<MessageType extends AbstractC6295ng<MessageType, BuilderType>, BuilderType extends C6253lg<MessageType, BuilderType>> extends AbstractC6105ef<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    public C6524yi zzc = C6524yi.m30175c();

    /* renamed from: b */
    public static InterfaceC6462vg m29899b(InterfaceC6462vg interfaceC6462vg) {
        int size = interfaceC6462vg.size();
        return interfaceC6462vg.mo29429m(size == 0 ? 10 : size + size);
    }

    /* renamed from: c */
    public static Object m29900c(Method method, Object obj, Object... objArr) {
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

    /* renamed from: d */
    public static Object m29901d(InterfaceC6443uh interfaceC6443uh, String str, Object[] objArr) {
        return new C6108ei(interfaceC6443uh, str, objArr);
    }

    /* renamed from: j */
    public static void m29902j(Class cls, AbstractC6295ng abstractC6295ng) {
        abstractC6295ng.m29910h();
        zzb.put(cls, abstractC6295ng);
    }

    /* renamed from: t */
    public static AbstractC6295ng m29903t(Class cls) {
        Map map = zzb;
        AbstractC6295ng abstractC6295ng = (AbstractC6295ng) map.get(cls);
        AbstractC6295ng abstractC6295ng2 = abstractC6295ng;
        if (abstractC6295ng == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6295ng2 = (AbstractC6295ng) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        AbstractC6295ng abstractC6295ng3 = abstractC6295ng2;
        if (abstractC6295ng2 == null) {
            abstractC6295ng3 = (AbstractC6295ng) ((AbstractC6295ng) C6193ij.m29748j(cls)).mo29386o(6, null, null);
            if (abstractC6295ng3 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC6295ng3);
        }
        return abstractC6295ng3;
    }

    /* renamed from: v */
    public static InterfaceC6400sg m29904v() {
        return C6316og.m29931f();
    }

    /* renamed from: w */
    public static InterfaceC6442ug m29905w() {
        return C6212jh.m29784f();
    }

    /* renamed from: x */
    public static InterfaceC6462vg m29906x() {
        return C6087di.m29555f();
    }

    @Override // ma.AbstractC6105ef
    /* renamed from: a */
    public final int mo29568a(InterfaceC6150gi interfaceC6150gi) {
        if (m29912l()) {
            int m29914n = m29914n(interfaceC6150gi);
            if (m29914n >= 0) {
                return m29914n;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m29914n);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int m29914n2 = m29914n(interfaceC6150gi);
        if (m29914n2 >= 0) {
            this.zzd = (this.zzd & NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) | m29914n2;
            return m29914n2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m29914n2);
    }

    @Override // ma.InterfaceC6443uh
    /* renamed from: e */
    public final /* synthetic */ InterfaceC6422th mo29907e() {
        return (C6253lg) mo29386o(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C6066ci.m29511a().m29512b(getClass()).mo29646e(this, (AbstractC6295ng) obj);
    }

    /* renamed from: f */
    public final void m29908f() {
        C6066ci.m29511a().m29512b(getClass()).mo29642a(this);
        m29910h();
    }

    @Override // ma.InterfaceC6443uh
    /* renamed from: g */
    public final void mo29909g(AbstractC6022ag abstractC6022ag) {
        C6066ci.m29511a().m29512b(getClass()).mo29645d(this, C6043bg.m29443I(abstractC6022ag));
    }

    /* renamed from: h */
    public final void m29910h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m29912l()) {
            return m29915p();
        }
        int i10 = this.zza;
        int i11 = i10;
        if (i10 == 0) {
            i11 = m29915p();
            this.zza = i11;
        }
        return i11;
    }

    /* renamed from: k */
    public final void m29911k(int i10) {
        this.zzd = (this.zzd & NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) | Integer.MAX_VALUE;
    }

    /* renamed from: l */
    public final boolean m29912l() {
        return (this.zzd & NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) != 0;
    }

    @Override // ma.InterfaceC6463vh
    /* renamed from: m */
    public final /* synthetic */ InterfaceC6443uh mo29913m() {
        return (AbstractC6295ng) mo29386o(6, null, null);
    }

    /* renamed from: n */
    public final int m29914n(InterfaceC6150gi interfaceC6150gi) {
        if (interfaceC6150gi != null) {
            return interfaceC6150gi.mo29644c(this);
        }
        return C6066ci.m29511a().m29512b(getClass()).mo29644c(this);
    }

    /* renamed from: o */
    public abstract Object mo29386o(int i10, Object obj, Object obj2);

    /* renamed from: p */
    public final int m29915p() {
        return C6066ci.m29511a().m29512b(getClass()).mo29643b(this);
    }

    @Override // ma.InterfaceC6443uh
    /* renamed from: r */
    public final int mo29916r() {
        int i10;
        if (m29912l()) {
            i10 = m29914n(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = m29914n(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION) | i10;
            }
        }
        return i10;
    }

    /* renamed from: s */
    public final C6253lg m29917s() {
        return (C6253lg) mo29386o(5, null, null);
    }

    public final String toString() {
        return C6483wh.m30098a(this, super.toString());
    }

    /* renamed from: u */
    public final AbstractC6295ng m29918u() {
        return (AbstractC6295ng) mo29386o(4, null, null);
    }
}
