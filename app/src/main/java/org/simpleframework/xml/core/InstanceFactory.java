package org.simpleframework.xml.core;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Value;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/InstanceFactory.class */
class InstanceFactory {
    private final Cache<Constructor> cache = new ConcurrentCache();

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/InstanceFactory$ClassInstance.class */
    public class ClassInstance implements Instance {
        public final InstanceFactory this$0;
        private Class type;
        private Object value;

        public ClassInstance(InstanceFactory instanceFactory, Class cls) {
            this.this$0 = instanceFactory;
            this.type = cls;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() {
            if (this.value == null) {
                this.value = this.this$0.getObject(this.type);
            }
            return this.value;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
        }

        @Override // org.simpleframework.xml.core.Instance
        public boolean isReference() {
            return false;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object setInstance(Object obj) {
            this.value = obj;
            return obj;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/InstanceFactory$ValueInstance.class */
    public class ValueInstance implements Instance {
        public final InstanceFactory this$0;
        private final Class type;
        private final Value value;

        public ValueInstance(InstanceFactory instanceFactory, Value value) {
            this.this$0 = instanceFactory;
            this.type = value.getType();
            this.value = value;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Object getInstance() {
            if (this.value.isReference()) {
                return this.value.getValue();
            }
            Object object = this.this$0.getObject(this.type);
            Value value = this.value;
            if (value != null) {
                value.setValue(object);
            }
            return object;
        }

        @Override // org.simpleframework.xml.core.Instance
        public Class getType() {
            return this.type;
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

    public Instance getInstance(Class cls) {
        return new ClassInstance(this, cls);
    }

    public Instance getInstance(Value value) {
        return new ValueInstance(this, value);
    }

    public Object getObject(Class cls) {
        Constructor fetch = this.cache.fetch(cls);
        Constructor constructor = fetch;
        if (fetch == null) {
            constructor = cls.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            this.cache.cache(cls, constructor);
        }
        return constructor.newInstance(new Object[0]);
    }
}
