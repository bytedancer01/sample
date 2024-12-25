package org.apache.commons.codec.language.p254bm;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/bm/RuleType.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/bm/RuleType.class */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES("rules");

    private final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
