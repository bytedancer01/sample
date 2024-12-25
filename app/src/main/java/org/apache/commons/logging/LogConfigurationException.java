package org.apache.commons.logging;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/LogConfigurationException.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/LogConfigurationException.class */
public class LogConfigurationException extends RuntimeException {
    private static final long serialVersionUID = 8486587136871052495L;
    public Throwable cause;

    public LogConfigurationException() {
        this.cause = null;
    }

    public LogConfigurationException(String str) {
        super(str);
        this.cause = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LogConfigurationException(java.lang.String r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = " (Caused by "
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            r1 = r5
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = ")"
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r3
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.cause = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogConfigurationException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public LogConfigurationException(Throwable th2) {
        this(th2 == null ? null : th2.toString(), th2);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
