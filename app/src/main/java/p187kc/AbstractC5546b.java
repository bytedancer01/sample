package p187kc;

import ec.C4708k;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kc/b.class
 */
/* renamed from: kc.b */
/* loaded from: combined.jar:classes2.jar:kc/b.class */
public abstract class AbstractC5546b<T> extends AbstractC5545a<T> implements Serializable {

    /* renamed from: b */
    public final Type f31613b;

    public AbstractC5546b() {
        Type m27530a = m27530a();
        this.f31613b = m27530a;
        C4708k.m23675q(!(m27530a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", m27530a);
    }

    /* renamed from: b */
    public final Type m27531b() {
        return this.f31613b;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof AbstractC5546b) {
            return this.f31613b.equals(((AbstractC5546b) obj).f31613b);
        }
        return false;
    }

    public int hashCode() {
        return this.f31613b.hashCode();
    }

    public String toString() {
        return C5547c.m27533b(this.f31613b);
    }
}
