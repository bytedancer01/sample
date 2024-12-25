package p187kc;

import ec.C4704g;
import ec.C4705h;
import ec.C4708k;
import ec.InterfaceC4703f;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import p099fc.AbstractC4834t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kc/c.class
 */
/* renamed from: kc.c */
/* loaded from: combined.jar:classes2.jar:kc/c.class */
public final class C5547c {

    /* renamed from: a */
    public static final InterfaceC4703f<Type, String> f31614a = new a();

    /* renamed from: b */
    public static final C4704g f31615b = C4704g.m23648f(", ").mo23654h("null");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kc/c$a.class
     */
    /* renamed from: kc.c$a */
    /* loaded from: combined.jar:classes2.jar:kc/c$a.class */
    public static final class a implements InterfaceC4703f<Type, String> {
        @Override // ec.InterfaceC4703f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(Type type) {
            return c.CURRENT.typeName(type);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kc/c$b.class
     */
    /* renamed from: kc.c$b */
    /* loaded from: combined.jar:classes2.jar:kc/c$b.class */
    public static final class b implements GenericArrayType, Serializable {

        /* renamed from: b */
        public final Type f31616b;

        public b(Type type) {
            this.f31616b = c.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C4705h.m23655a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f31616b;
        }

        public int hashCode() {
            return this.f31616b.hashCode();
        }

        public String toString() {
            return C5547c.m27533b(this.f31616b) + "[]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kc/c$c.class
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: kc.c$c */
    /* loaded from: combined.jar:classes2.jar:kc/c$c.class */
    public static abstract class c {
        private static final c[] $VALUES;
        public static final c CURRENT;
        public static final c JAVA6;
        public static final c JAVA7;
        public static final c JAVA8;
        public static final c JAVA9;

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$a.class
         */
        /* renamed from: kc.c$c$a */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$a.class */
        public enum a extends c {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p187kc.C5547c.c
            public GenericArrayType newArrayType(Type type) {
                return new b(type);
            }

            @Override // p187kc.C5547c.c
            public Type usedInGenericType(Type type) {
                C4708k.m23668j(type);
                Type type2 = type;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    type2 = type;
                    if (cls.isArray()) {
                        type2 = new b(cls.getComponentType());
                    }
                }
                return type2;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$b.class
         */
        /* renamed from: kc.c$c$b */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$b.class */
        public enum b extends c {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p187kc.C5547c.c
            public Type newArrayType(Type type) {
                return type instanceof Class ? C5547c.m27532a((Class) type) : new b(type);
            }

            @Override // p187kc.C5547c.c
            public Type usedInGenericType(Type type) {
                return (Type) C4708k.m23668j(type);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$c.class
         */
        /* renamed from: kc.c$c$c, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$c.class */
        public enum C10311c extends c {
            public C10311c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p187kc.C5547c.c
            public Type newArrayType(Type type) {
                return c.JAVA7.newArrayType(type);
            }

            @Override // p187kc.C5547c.c
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e11) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e12) {
                    e = e12;
                    throw new RuntimeException(e);
                }
            }

            @Override // p187kc.C5547c.c
            public Type usedInGenericType(Type type) {
                return c.JAVA7.usedInGenericType(type);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$d.class
         */
        /* renamed from: kc.c$c$d */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$d.class */
        public enum d extends c {
            public d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p187kc.C5547c.c
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // p187kc.C5547c.c
            public Type newArrayType(Type type) {
                return c.JAVA8.newArrayType(type);
            }

            @Override // p187kc.C5547c.c
            public String typeName(Type type) {
                return c.JAVA8.typeName(type);
            }

            @Override // p187kc.C5547c.c
            public Type usedInGenericType(Type type) {
                return c.JAVA8.usedInGenericType(type);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$e.class
         */
        /* renamed from: kc.c$c$e */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$e.class */
        public static final class e extends AbstractC5545a<Map.Entry<String, int[][]>> {
        }

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:kc/c$c$f.class
         */
        /* renamed from: kc.c$c$f */
        /* loaded from: combined.jar:classes2.jar:kc/c$c$f.class */
        public static final class f extends AbstractC5545a<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            JAVA6 = aVar;
            b bVar = new b("JAVA7", 1);
            JAVA7 = bVar;
            C10311c c10311c = new C10311c("JAVA8", 2);
            JAVA8 = c10311c;
            d dVar = new d("JAVA9", 3);
            JAVA9 = dVar;
            $VALUES = new c[]{aVar, bVar, c10311c, dVar};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().m27530a().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = c10311c;
                    return;
                } else {
                    CURRENT = dVar;
                    return;
                }
            }
            if (new f().m27530a() instanceof Class) {
                CURRENT = bVar;
            } else {
                CURRENT = aVar;
            }
        }

        private c(String str, int i10) {
        }

        public /* synthetic */ c(String str, int i10, a aVar) {
            this(str, i10);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            return C5547c.m27533b(type);
        }

        public final AbstractC4834t<Type> usedInGenericType(Type[] typeArr) {
            AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
            for (Type type : typeArr) {
                m24548x.m24554d(usedInGenericType(type));
            }
            return m24548x.m24555e();
        }

        public abstract Type usedInGenericType(Type type);
    }

    /* renamed from: a */
    public static Class<?> m27532a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    public static String m27533b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
