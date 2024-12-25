package p447zg;

import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/z.class
 */
/* renamed from: zg.z */
/* loaded from: combined.jar:classes2.jar:zg/z.class */
public abstract class AbstractC10235z {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/z$b.class
     */
    /* renamed from: zg.z$b */
    /* loaded from: combined.jar:classes2.jar:zg/z$b.class */
    public static final class b extends AbstractC10235z {
        public b() {
            super();
        }

        @Override // p447zg.AbstractC10235z
        /* renamed from: b */
        public int mo42822b(Method method) {
            return 0;
        }

        @Override // p447zg.AbstractC10235z
        /* renamed from: c */
        public boolean mo42823c(Method method) {
            return false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:zg/z$c.class
     */
    /* renamed from: zg.z$c */
    /* loaded from: combined.jar:classes2.jar:zg/z$c.class */
    public static final class c extends AbstractC10235z {
        public c() {
            super();
        }

        @Override // p447zg.AbstractC10235z
        /* renamed from: b */
        public int mo42822b(Method method) {
            return method.isVarArgs() ? method.getParameterTypes().length - 1 : 0;
        }

        @Override // p447zg.AbstractC10235z
        /* renamed from: c */
        public boolean mo42823c(Method method) {
            return method.isVarArgs();
        }
    }

    public AbstractC10235z() {
    }

    /* renamed from: a */
    public static AbstractC10235z m42821a() {
        try {
            return Method.class.getMethod("isVarArgs", new Class[0]) != null ? new c() : new b();
        } catch (NoSuchMethodException e10) {
            return new b();
        } catch (SecurityException e11) {
            return new b();
        }
    }

    /* renamed from: b */
    public abstract int mo42822b(Method method);

    /* renamed from: c */
    public abstract boolean mo42823c(Method method);
}
