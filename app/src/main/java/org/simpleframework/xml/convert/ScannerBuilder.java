package org.simpleframework.xml.convert;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/convert/ScannerBuilder.class */
class ScannerBuilder extends ConcurrentCache<Scanner> {

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/convert/ScannerBuilder$Entry.class */
    public static class Entry extends ConcurrentCache<Annotation> implements Scanner {
        private final Class root;

        public Entry(Class cls) {
            this.root = cls;
        }

        private <T extends Annotation> T find(Class<T> cls) {
            Class cls2 = this.root;
            while (true) {
                Class cls3 = cls2;
                if (cls3 == null) {
                    return null;
                }
                T t10 = (T) cls3.getAnnotation(cls);
                if (t10 != null) {
                    return t10;
                }
                cls2 = cls3.getSuperclass();
            }
        }

        @Override // org.simpleframework.xml.convert.Scanner
        public <T extends Annotation> T scan(Class<T> cls) {
            if (!contains(cls)) {
                Annotation find = find(cls);
                if (cls != null && find != null) {
                    put(cls, find);
                }
            }
            return (T) get(cls);
        }
    }

    public Scanner build(Class<?> cls) {
        Scanner scanner = get(cls);
        Scanner scanner2 = scanner;
        if (scanner == null) {
            scanner2 = new Entry(cls);
            put(cls, scanner2);
        }
        return scanner2;
    }
}
