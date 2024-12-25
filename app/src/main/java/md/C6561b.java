package md;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:md/b.class
 */
/* renamed from: md.b */
/* loaded from: combined.jar:classes2.jar:md/b.class */
public final class C6561b {

    /* renamed from: a */
    public static final Type[] f34320a = new Type[0];

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/b$a.class
     */
    /* renamed from: md.b$a */
    /* loaded from: combined.jar:classes2.jar:md/b$a.class */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: b */
        public final Type f34321b;

        public a(Type type) {
            this.f34321b = C6561b.m30270b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6561b.m30274f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f34321b;
        }

        public int hashCode() {
            return this.f34321b.hashCode();
        }

        public String toString() {
            return C6561b.m30289u(this.f34321b) + "[]";
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/b$b.class
     */
    /* renamed from: md.b$b */
    /* loaded from: combined.jar:classes2.jar:md/b$b.class */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: b */
        public final Type f34322b;

        /* renamed from: c */
        public final Type f34323c;

        /* renamed from: d */
        public final Type[] f34324d;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                C6560a.m30267a(type == null ? Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null : true);
            }
            this.f34322b = type == null ? null : C6561b.m30270b(type);
            this.f34323c = C6561b.m30270b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f34324d = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                C6560a.m30268b(this.f34324d[i10]);
                C6561b.m30271c(this.f34324d[i10]);
                Type[] typeArr3 = this.f34324d;
                typeArr3[i10] = C6561b.m30270b(typeArr3[i10]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6561b.m30274f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f34324d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f34322b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f34323c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f34324d) ^ this.f34323c.hashCode()) ^ C6561b.m30281m(this.f34322b);
        }

        public String toString() {
            int length = this.f34324d.length;
            if (length == 0) {
                return C6561b.m30289u(this.f34323c);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C6561b.m30289u(this.f34323c));
            sb2.append("<");
            sb2.append(C6561b.m30289u(this.f34324d[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(C6561b.m30289u(this.f34324d[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:md/b$c.class
     */
    /* renamed from: md.b$c */
    /* loaded from: combined.jar:classes2.jar:md/b$c.class */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: b */
        public final Type f34325b;

        /* renamed from: c */
        public final Type f34326c;

        public c(Type[] typeArr, Type[] typeArr2) {
            C6560a.m30267a(typeArr2.length <= 1);
            C6560a.m30267a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C6560a.m30268b(typeArr[0]);
                C6561b.m30271c(typeArr[0]);
                this.f34326c = null;
                this.f34325b = C6561b.m30270b(typeArr[0]);
                return;
            }
            C6560a.m30268b(typeArr2[0]);
            C6561b.m30271c(typeArr2[0]);
            C6560a.m30267a(typeArr[0] == Object.class);
            this.f34326c = C6561b.m30270b(typeArr2[0]);
            this.f34325b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6561b.m30274f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f34326c;
            return type != null ? new Type[]{type} : C6561b.f34320a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f34325b};
        }

        public int hashCode() {
            Type type = this.f34326c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f34325b.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb2;
            Type type;
            if (this.f34326c != null) {
                sb2 = new StringBuilder();
                sb2.append("? super ");
                type = this.f34326c;
            } else {
                if (this.f34325b == Object.class) {
                    return "?";
                }
                sb2 = new StringBuilder();
                sb2.append("? extends ");
                type = this.f34325b;
            }
            sb2.append(C6561b.m30289u(type));
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static GenericArrayType m30269a(Type type) {
        return new a(type);
    }

    /* renamed from: b */
    public static Type m30270b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            Type type2 = cls;
            if (cls.isArray()) {
                type2 = new a(m30270b(cls.getComponentType()));
            }
            return type2;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: c */
    public static void m30271c(Type type) {
        C6560a.m30267a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    public static Class<?> m30272d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
    }

    /* renamed from: e */
    public static boolean m30273e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m30274f(Type type, Type type2) {
        boolean z10 = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m30273e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z10 = false;
            }
            return z10;
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m30274f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.reflect.Type] */
    /* renamed from: g */
    public static Type m30275g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m30276h(Type type, Class<?> cls) {
        Type m30280l = m30280l(type, cls, Collection.class);
        Type type2 = m30280l;
        if (m30280l instanceof WildcardType) {
            type2 = ((WildcardType) m30280l).getUpperBounds()[0];
        }
        return type2 instanceof ParameterizedType ? ((ParameterizedType) type2).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    public static Type m30277i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m30277i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m30277i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m30278j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m30280l = m30280l(type, cls, Map.class);
        return m30280l instanceof ParameterizedType ? ((ParameterizedType) m30280l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m30279k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6560a.m30267a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m30279k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m30279k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: l */
    public static Type m30280l(Type type, Class<?> cls, Class<?> cls2) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = ((WildcardType) type).getUpperBounds()[0];
        }
        C6560a.m30267a(cls2.isAssignableFrom(cls));
        return m30284p(type2, cls, m30277i(type2, cls, cls2));
    }

    /* renamed from: m */
    public static int m30281m(Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    /* renamed from: n */
    public static int m30282n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m30283o(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m30284p(Type type, Class<?> cls, Type type2) {
        return m30285q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x021c, code lost:
    
        if (r16 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x021f, code lost:
    
        r8.put(r16, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x022a, code lost:
    
        return r7;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m30285q(java.lang.reflect.Type r5, java.lang.Class<?> r6, java.lang.reflect.Type r7, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r8) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: md.C6561b.m30285q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m30286r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m30272d = m30272d(typeVariable);
        if (m30272d == null) {
            return typeVariable;
        }
        Type m30277i = m30277i(type, cls, m30272d);
        if (!(m30277i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m30277i).getActualTypeArguments()[m30282n(m30272d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m30287s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f34320a);
    }

    /* renamed from: t */
    public static WildcardType m30288t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m30289u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
