package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Introspector.class */
class Introspector {
    private final Contact contact;
    private final Format format;
    private final Label label;
    private final Annotation marker;

    public Introspector(Contact contact, Label label, Format format) {
        this.marker = contact.getAnnotation();
        this.contact = contact;
        this.format = format;
        this.label = label;
    }

    private String getDefault() {
        String override = this.label.getOverride();
        return !isEmpty(override) ? override : this.contact.getName();
    }

    private String getName(Class cls) {
        String root = getRoot(cls);
        return root != null ? root : Reflector.getName(cls.getSimpleName());
    }

    private String getRoot(Class cls) {
        Class cls2 = cls;
        while (true) {
            Class cls3 = cls2;
            if (cls3 == null) {
                return null;
            }
            String root = getRoot(cls, cls3);
            if (root != null) {
                return root;
            }
            cls2 = cls3.getSuperclass();
        }
    }

    private String getRoot(Class<?> cls, Class<?> cls2) {
        String simpleName = cls2.getSimpleName();
        Root root = (Root) cls2.getAnnotation(Root.class);
        if (root == null) {
            return null;
        }
        String name = root.name();
        return !isEmpty(name) ? name : Reflector.getName(simpleName);
    }

    public Contact getContact() {
        return this.contact;
    }

    public Type getDependent() {
        return this.label.getDependent();
    }

    public String getEntry() {
        Class<?> type = getDependent().getType();
        Class<?> cls = type;
        if (type.isArray()) {
            cls = type.getComponentType();
        }
        return getName(cls);
    }

    public Expression getExpression() {
        String path = getPath();
        return path != null ? new PathParser(path, this.contact, this.format) : new EmptyExpression(this.format);
    }

    public String getName() {
        String entry = this.label.getEntry();
        if (!this.label.isInline()) {
            entry = getDefault();
        }
        return entry;
    }

    public String getPath() {
        Path path = (Path) this.contact.getAnnotation(Path.class);
        if (path == null) {
            return null;
        }
        return path.value();
    }

    public boolean isEmpty(String str) {
        boolean z10 = true;
        if (str != null) {
            z10 = str.length() == 0;
        }
        return z10;
    }

    public String toString() {
        return String.format("%s on %s", this.marker, this.contact);
    }
}
