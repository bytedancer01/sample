package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Value;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ConversionInstance.class */
class ConversionInstance implements Instance {
    private final Context context;
    private final Class convert;
    private final Value value;

    public ConversionInstance(Context context, Value value, Class cls) {
        this.context = context;
        this.convert = cls;
        this.value = value;
    }

    @Override // org.simpleframework.xml.core.Instance
    public Object getInstance() {
        if (this.value.isReference()) {
            return this.value.getValue();
        }
        Object conversionInstance = getInstance(this.convert);
        if (conversionInstance != null) {
            setInstance(conversionInstance);
        }
        return conversionInstance;
    }

    public Object getInstance(Class cls) {
        return this.context.getInstance(cls).getInstance();
    }

    @Override // org.simpleframework.xml.core.Instance
    public Class getType() {
        return this.convert;
    }

    @Override // org.simpleframework.xml.core.Instance
    public boolean isReference() {
        return this.value.isReference();
    }

    @Override // org.simpleframework.xml.core.Instance
    public Object setInstance(Object obj) {
        Value value = this.value;
        if (value != null) {
            value.setValue(obj);
        }
        return obj;
    }
}
