package org.simpleframework.xml.convert;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/convert/ConverterFactory.class */
class ConverterFactory {
    private final Cache<Converter> cache = new ConcurrentCache();

    private Constructor getConstructor(Class cls) {
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    private Converter getConverter(Class cls) {
        Constructor constructor = getConstructor(cls);
        if (constructor != null) {
            return getConverter(cls, constructor);
        }
        throw new ConvertException("No default constructor for %s", cls);
    }

    private Converter getConverter(Class cls, Constructor constructor) {
        Converter converter = (Converter) constructor.newInstance(new Object[0]);
        if (converter != null) {
            this.cache.cache(cls, converter);
        }
        return converter;
    }

    public Converter getInstance(Class cls) {
        Converter fetch = this.cache.fetch(cls);
        return fetch == null ? getConverter(cls) : fetch;
    }

    public Converter getInstance(Convert convert) {
        Class<? extends Converter> value = convert.value();
        if (value.isInterface()) {
            throw new ConvertException("Can not instantiate %s", value);
        }
        return getInstance(value);
    }
}
