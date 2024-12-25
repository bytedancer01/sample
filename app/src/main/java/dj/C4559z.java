package dj;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import p173ji.AbstractC5412g0;
import p411xi.C9761e;

/* renamed from: dj.z */
/* loaded from: combined.jar:classes3.jar:dj/z.class */
public final class C4559z {

    /* renamed from: a */
    public static final Type[] f27151a = new Type[0];

    /* renamed from: dj.z$a */
    /* loaded from: combined.jar:classes3.jar:dj/z$a.class */
    public static final class a implements GenericArrayType {

        /* renamed from: b */
        public final Type f27152b;

        public a(Type type) {
            this.f27152b = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4559z.m22978d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f27152b;
        }

        public int hashCode() {
            return this.f27152b.hashCode();
        }

        public String toString() {
            return C4559z.m22994t(this.f27152b) + "[]";
        }
    }

    /* renamed from: dj.z$b */
    /* loaded from: combined.jar:classes3.jar:dj/z$b.class */
    public static final class b implements ParameterizedType {

        /* renamed from: b */
        public final Type f27153b;

        /* renamed from: c */
        public final Type f27154c;

        /* renamed from: d */
        public final Type[] f27155d;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C4559z.m22976b(type3);
            }
            this.f27153b = type;
            this.f27154c = type2;
            this.f27155d = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4559z.m22978d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f27155d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f27153b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f27154c;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f27155d);
            int hashCode2 = this.f27154c.hashCode();
            Type type = this.f27153b;
            return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f27155d;
            if (typeArr.length == 0) {
                return C4559z.m22994t(this.f27154c);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(C4559z.m22994t(this.f27154c));
            sb2.append("<");
            sb2.append(C4559z.m22994t(this.f27155d[0]));
            for (int i10 = 1; i10 < this.f27155d.length; i10++) {
                sb2.append(", ");
                sb2.append(C4559z.m22994t(this.f27155d[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: dj.z$c */
    /* loaded from: combined.jar:classes3.jar:dj/z$c.class */
    public static final class c implements WildcardType {

        /* renamed from: b */
        public final Type f27156b;

        /* renamed from: c */
        public final Type f27157c;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                C4559z.m22976b(type);
                this.f27157c = null;
                this.f27156b = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            C4559z.m22976b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f27157c = typeArr2[0];
            this.f27156b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4559z.m22978d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f27157c;
            return type != null ? new Type[]{type} : C4559z.f27151a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f27156b};
        }

        public int hashCode() {
            Type type = this.f27157c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f27156b.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb2;
            Type type;
            if (this.f27157c != null) {
                sb2 = new StringBuilder();
                sb2.append("? super ");
                type = this.f27157c;
            } else {
                if (this.f27156b == Object.class) {
                    return "?";
                }
                sb2 = new StringBuilder();
                sb2.append("? extends ");
                type = this.f27156b;
            }
            sb2.append(C4559z.m22994t(type));
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static AbstractC5412g0 m22975a(AbstractC5412g0 abstractC5412g0) {
        C9761e c9761e = new C9761e();
        abstractC5412g0.mo22899v().mo41171r(c9761e);
        return AbstractC5412g0.m26965t(abstractC5412g0.mo22898p(), abstractC5412g0.mo22897o(), c9761e);
    }

    /* renamed from: b */
    public static void m22976b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class<?> m22977c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        return genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
    }

    /* renamed from: d */
    public static boolean m22978d(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m22978d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (!(type instanceof WildcardType)) {
            if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            }
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
        if (!(type2 instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) type;
        WildcardType wildcardType2 = (WildcardType) type2;
        if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: e */
    public static Type m22979e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m22979e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m22979e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m22980f(int i10, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i10];
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = ((WildcardType) type).getLowerBounds()[0];
        }
        return type2;
    }

    /* renamed from: g */
    public static Type m22981g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            Type type2 = type;
            if (type instanceof WildcardType) {
                type2 = ((WildcardType) type).getUpperBounds()[0];
            }
            return type2;
        }
        throw new IllegalArgumentException("Index " + i10 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class<?> m22982h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m22982h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m22982h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m22983i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m22991q(type, cls, m22979e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m22984j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m22984j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m22984j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static int m22985k(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m22986l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m22987m(Method method, String str, Object... objArr) {
        return m22988n(method, null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m22988n(Method method, Throwable th2, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + InstructionFileId.DOT + method.getName(), th2);
    }

    /* renamed from: o */
    public static RuntimeException m22989o(Method method, int i10, String str, Object... objArr) {
        return m22987m(method, str + " (parameter #" + (i10 + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m22990p(Method method, Throwable th2, int i10, String str, Object... objArr) {
        return m22988n(method, th2, str + " (parameter #" + (i10 + 1) + ")", objArr);
    }

    /* renamed from: q */
    public static Type m22991q(Type type, Class<?> cls, Type type2) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            type2 = m22992r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type m22991q = m22991q(type, cls, componentType);
                return componentType == m22991q ? cls2 : new a(m22991q);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type m22991q2 = m22991q(type, cls, genericComponentType);
            return genericComponentType == m22991q2 ? genericArrayType : new a(m22991q2);
        }
        int i10 = 0;
        if (!(type2 instanceof ParameterizedType)) {
            Type type3 = type2;
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (lowerBounds.length == 1) {
                    Type m22991q3 = m22991q(type, cls, lowerBounds[0]);
                    type3 = wildcardType;
                    if (m22991q3 != lowerBounds[0]) {
                        return new c(new Type[]{Object.class}, new Type[]{m22991q3});
                    }
                } else {
                    type3 = wildcardType;
                    if (upperBounds.length == 1) {
                        Type m22991q4 = m22991q(type, cls, upperBounds[0]);
                        type3 = wildcardType;
                        if (m22991q4 != upperBounds[0]) {
                            return new c(new Type[]{m22991q4}, f27151a);
                        }
                    }
                }
            }
            return type3;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type2;
        Type ownerType = parameterizedType.getOwnerType();
        Type m22991q5 = m22991q(type, cls, ownerType);
        boolean z10 = m22991q5 != ownerType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments.length;
        while (i10 < length) {
            Type m22991q6 = m22991q(type, cls, actualTypeArguments[i10]);
            boolean z11 = z10;
            Type[] typeArr = actualTypeArguments;
            if (m22991q6 != actualTypeArguments[i10]) {
                z11 = z10;
                typeArr = actualTypeArguments;
                if (!z10) {
                    typeArr = (Type[]) actualTypeArguments.clone();
                    z11 = true;
                }
                typeArr[i10] = m22991q6;
            }
            i10++;
            z10 = z11;
            actualTypeArguments = typeArr;
        }
        ParameterizedType parameterizedType2 = parameterizedType;
        if (z10) {
            parameterizedType2 = new b(m22991q5, parameterizedType.getRawType(), actualTypeArguments);
        }
        return parameterizedType2;
    }

    /* renamed from: r */
    public static Type m22992r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m22977c = m22977c(typeVariable);
        if (m22977c == null) {
            return typeVariable;
        }
        Type m22979e = m22979e(type, cls, m22977c);
        if (!(m22979e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m22979e).getActualTypeArguments()[m22985k(m22977c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static void m22993s(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    /* renamed from: t */
    public static String m22994t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
