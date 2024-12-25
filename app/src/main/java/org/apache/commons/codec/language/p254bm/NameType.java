package org.apache.commons.codec.language.p254bm;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/NameType.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/NameType.class */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");

    private final String name;

    NameType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
