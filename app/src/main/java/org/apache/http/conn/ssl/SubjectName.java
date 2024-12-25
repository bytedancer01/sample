package org.apache.http.conn.ssl;

import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/ssl/SubjectName.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/ssl/SubjectName.class */
final class SubjectName {
    public static final int DNS = 2;

    /* renamed from: IP */
    public static final int f36153IP = 7;
    private final int type;
    private final String value;

    public SubjectName(String str, int i10) {
        this.value = (String) Args.notNull(str, "Value");
        this.type = Args.positive(i10, "Type");
    }

    public static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    /* renamed from: IP */
    public static SubjectName m32144IP(String str) {
        return new SubjectName(str, 7);
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
