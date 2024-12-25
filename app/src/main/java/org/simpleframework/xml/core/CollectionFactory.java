package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/CollectionFactory.class */
class CollectionFactory extends Factory {
    public CollectionFactory(Context context, Type type) {
        super(context, type);
    }

    private boolean isCollection(Class cls) {
        return Collection.class.isAssignableFrom(cls);
    }

    public Class getConversion(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return ArrayList.class;
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return HashSet.class;
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return TreeSet.class;
        }
        throw new InstantiationException("Cannot instantiate %s for %s", cls, this.type);
    }

    @Override // org.simpleframework.xml.core.Factory
    public Object getInstance() {
        Class type = getType();
        Class conversion = !Factory.isInstantiable(type) ? getConversion(type) : type;
        if (isCollection(conversion)) {
            return conversion.newInstance();
        }
        throw new InstantiationException("Invalid collection %s for %s", type, this.type);
    }

    public Instance getInstance(Value value) {
        Class type = value.getType();
        Class cls = type;
        if (!Factory.isInstantiable(type)) {
            cls = getConversion(type);
        }
        if (isCollection(cls)) {
            return new ConversionInstance(this.context, value, cls);
        }
        throw new InstantiationException("Invalid collection %s for %s", cls, this.type);
    }

    public Instance getInstance(InputNode inputNode) {
        Value override = getOverride(inputNode);
        Class type = getType();
        if (override != null) {
            return getInstance(override);
        }
        Class cls = type;
        if (!Factory.isInstantiable(type)) {
            cls = getConversion(type);
        }
        if (isCollection(cls)) {
            return this.context.getInstance(cls);
        }
        throw new InstantiationException("Invalid collection %s for %s", cls, this.type);
    }
}
