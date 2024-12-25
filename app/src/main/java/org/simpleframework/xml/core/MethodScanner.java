package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.Transient;
import org.simpleframework.xml.Version;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/MethodScanner.class */
class MethodScanner extends ContactList {
    private final Detail detail;
    private final MethodPartFactory factory;
    private final Support support;
    private final PartMap write = new PartMap();
    private final PartMap read = new PartMap();

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/MethodScanner$PartMap.class */
    public static class PartMap extends LinkedHashMap<String, MethodPart> implements Iterable<String> {
        private PartMap() {
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return keySet().iterator();
        }

        public MethodPart take(String str) {
            return remove(str);
        }
    }

    public MethodScanner(Detail detail, Support support) {
        this.factory = new MethodPartFactory(detail, support);
        this.support = support;
        this.detail = detail;
        scan(detail);
    }

    private void build() {
        Iterator<String> it = this.read.iterator();
        while (it.hasNext()) {
            String next = it.next();
            MethodPart methodPart = this.read.get(next);
            if (methodPart != null) {
                build(methodPart, next);
            }
        }
    }

    private void build(MethodPart methodPart) {
        add(new MethodContact(methodPart));
    }

    private void build(MethodPart methodPart, String str) {
        MethodPart take = this.write.take(str);
        if (take != null) {
            build(methodPart, take);
        } else {
            build(methodPart);
        }
    }

    private void build(MethodPart methodPart, MethodPart methodPart2) {
        Annotation annotation = methodPart.getAnnotation();
        String name = methodPart.getName();
        if (!methodPart2.getAnnotation().equals(annotation)) {
            throw new MethodException("Annotations do not match for '%s' in %s", name, this.detail);
        }
        Class type = methodPart.getType();
        if (type != methodPart2.getType()) {
            throw new MethodException("Method types do not match for %s in %s", name, type);
        }
        add(new MethodContact(methodPart, methodPart2));
    }

    private void extend(Class cls, DefaultType defaultType) {
        Iterator<Contact> it = this.support.getMethods(cls, defaultType).iterator();
        while (it.hasNext()) {
            process((MethodContact) it.next());
        }
    }

    private void extract(Detail detail) {
        for (MethodDetail methodDetail : detail.getMethods()) {
            Annotation[] annotations = methodDetail.getAnnotations();
            Method method = methodDetail.getMethod();
            for (Annotation annotation : annotations) {
                scan(method, annotation, annotations);
            }
        }
    }

    private void extract(Detail detail, DefaultType defaultType) {
        List<MethodDetail> methods = detail.getMethods();
        if (defaultType == DefaultType.PROPERTY) {
            for (MethodDetail methodDetail : methods) {
                Annotation[] annotations = methodDetail.getAnnotations();
                Method method = methodDetail.getMethod();
                if (this.factory.getType(method) != null) {
                    process(method, annotations);
                }
            }
        }
    }

    private void insert(MethodPart methodPart, PartMap partMap) {
        String name = methodPart.getName();
        MethodPart remove = partMap.remove(name);
        MethodPart methodPart2 = methodPart;
        if (remove != null) {
            methodPart2 = methodPart;
            if (isText(methodPart)) {
                methodPart2 = remove;
            }
        }
        partMap.put(name, methodPart2);
    }

    private boolean isText(MethodPart methodPart) {
        return methodPart.getAnnotation() instanceof Text;
    }

    private void process(Method method, Annotation annotation, Annotation[] annotationArr) {
        MethodPart methodPartFactory = this.factory.getInstance(method, annotation, annotationArr);
        MethodType methodType = methodPartFactory.getMethodType();
        if (methodType == MethodType.GET) {
            process(methodPartFactory, this.read);
        }
        if (methodType == MethodType.IS) {
            process(methodPartFactory, this.read);
        }
        if (methodType == MethodType.SET) {
            process(methodPartFactory, this.write);
        }
    }

    private void process(Method method, Annotation[] annotationArr) {
        MethodPart methodPartFactory = this.factory.getInstance(method, annotationArr);
        MethodType methodType = methodPartFactory.getMethodType();
        if (methodType == MethodType.GET) {
            process(methodPartFactory, this.read);
        }
        if (methodType == MethodType.IS) {
            process(methodPartFactory, this.read);
        }
        if (methodType == MethodType.SET) {
            process(methodPartFactory, this.write);
        }
    }

    private void process(MethodContact methodContact) {
        MethodPart read = methodContact.getRead();
        MethodPart write = methodContact.getWrite();
        if (write != null) {
            insert(write, this.write);
        }
        insert(read, this.read);
    }

    private void process(MethodPart methodPart, PartMap partMap) {
        String name = methodPart.getName();
        if (name != null) {
            partMap.put(name, methodPart);
        }
    }

    private void remove(Method method, Annotation annotation, Annotation[] annotationArr) {
        MethodPart methodPartFactory = this.factory.getInstance(method, annotation, annotationArr);
        MethodType methodType = methodPartFactory.getMethodType();
        if (methodType == MethodType.GET) {
            remove(methodPartFactory, this.read);
        }
        if (methodType == MethodType.IS) {
            remove(methodPartFactory, this.read);
        }
        if (methodType == MethodType.SET) {
            remove(methodPartFactory, this.write);
        }
    }

    private void remove(MethodPart methodPart, PartMap partMap) {
        String name = methodPart.getName();
        if (name != null) {
            partMap.remove(name);
        }
    }

    private void scan(Method method, Annotation annotation, Annotation[] annotationArr) {
        if (annotation instanceof Attribute) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementUnion) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementListUnion) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementMapUnion) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementList) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementArray) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof ElementMap) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof Element) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof Version) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof Text) {
            process(method, annotation, annotationArr);
        }
        if (annotation instanceof Transient) {
            remove(method, annotation, annotationArr);
        }
    }

    private void scan(Detail detail) {
        DefaultType override = detail.getOverride();
        DefaultType access = detail.getAccess();
        Class cls = detail.getSuper();
        if (cls != null) {
            extend(cls, override);
        }
        extract(detail, access);
        extract(detail);
        build();
        validate();
    }

    private void validate() {
        Iterator<String> it = this.write.iterator();
        while (it.hasNext()) {
            String next = it.next();
            MethodPart methodPart = this.write.get(next);
            if (methodPart != null) {
                validate(methodPart, next);
            }
        }
    }

    private void validate(MethodPart methodPart, String str) {
        MethodPart take = this.read.take(str);
        Method method = methodPart.getMethod();
        if (take == null) {
            throw new MethodException("No matching get method for %s in %s", method, this.detail);
        }
    }
}
