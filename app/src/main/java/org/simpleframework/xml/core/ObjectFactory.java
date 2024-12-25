package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.stream.InputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ObjectFactory.class */
class ObjectFactory extends PrimitiveFactory {
    public ObjectFactory(Context context, Type type, Class cls) {
        super(context, type, cls);
    }

    @Override // org.simpleframework.xml.core.PrimitiveFactory
    public Instance getInstance(InputNode inputNode) {
        Value override = getOverride(inputNode);
        Class type = getType();
        if (override != null) {
            return new ObjectInstance(this.context, override);
        }
        if (Factory.isInstantiable(type)) {
            return this.context.getInstance(type);
        }
        throw new InstantiationException("Cannot instantiate %s for %s", type, this.type);
    }
}
