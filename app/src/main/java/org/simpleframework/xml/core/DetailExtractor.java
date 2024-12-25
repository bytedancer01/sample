package org.simpleframework.xml.core;

import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.util.Cache;
import org.simpleframework.xml.util.ConcurrentCache;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/DetailExtractor.class */
class DetailExtractor {
    private final Cache<Detail> details;
    private final Cache<ContactList> fields;
    private final Cache<ContactList> methods;
    private final DefaultType override;
    private final Support support;

    public DetailExtractor(Support support) {
        this(support, null);
    }

    public DetailExtractor(Support support, DefaultType defaultType) {
        this.methods = new ConcurrentCache();
        this.fields = new ConcurrentCache();
        this.details = new ConcurrentCache();
        this.override = defaultType;
        this.support = support;
    }

    private ContactList getFields(Class cls, Detail detail) {
        FieldScanner fieldScanner = new FieldScanner(detail, this.support);
        if (detail != null) {
            this.fields.cache(cls, fieldScanner);
        }
        return fieldScanner;
    }

    private ContactList getMethods(Class cls, Detail detail) {
        MethodScanner methodScanner = new MethodScanner(detail, this.support);
        if (detail != null) {
            this.methods.cache(cls, methodScanner);
        }
        return methodScanner;
    }

    public Detail getDetail(Class cls) {
        Detail fetch = this.details.fetch(cls);
        Detail detail = fetch;
        if (fetch == null) {
            detail = new DetailScanner(cls, this.override);
            this.details.cache(cls, detail);
        }
        return detail;
    }

    public ContactList getFields(Class cls) {
        ContactList fetch = this.fields.fetch(cls);
        ContactList contactList = fetch;
        if (fetch == null) {
            Detail detail = getDetail(cls);
            contactList = fetch;
            if (detail != null) {
                contactList = getFields(cls, detail);
            }
        }
        return contactList;
    }

    public ContactList getMethods(Class cls) {
        ContactList fetch = this.methods.fetch(cls);
        ContactList contactList = fetch;
        if (fetch == null) {
            Detail detail = getDetail(cls);
            contactList = fetch;
            if (detail != null) {
                contactList = getMethods(cls, detail);
            }
        }
        return contactList;
    }
}
