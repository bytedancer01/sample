package org.apache.commons.net.nntp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/NewGroupsOrNewsQuery.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/NewGroupsOrNewsQuery.class */
public final class NewGroupsOrNewsQuery {
    private final String __date;
    private final boolean __isGMT;
    private final String __time;
    private StringBuffer __distributions = null;
    private StringBuffer __newsgroups = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NewGroupsOrNewsQuery(java.util.Calendar r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.NewGroupsOrNewsQuery.<init>(java.util.Calendar, boolean):void");
    }

    public void addDistribution(String str) {
        StringBuffer stringBuffer = this.__distributions;
        if (stringBuffer != null) {
            stringBuffer.append(',');
        } else {
            this.__distributions = new StringBuffer();
        }
        this.__distributions.append(str);
    }

    public void addNewsgroup(String str) {
        StringBuffer stringBuffer = this.__newsgroups;
        if (stringBuffer != null) {
            stringBuffer.append(',');
        } else {
            this.__newsgroups = new StringBuffer();
        }
        this.__newsgroups.append(str);
    }

    public String getDate() {
        return this.__date;
    }

    public String getDistributions() {
        StringBuffer stringBuffer = this.__distributions;
        return stringBuffer == null ? null : stringBuffer.toString();
    }

    public String getNewsgroups() {
        StringBuffer stringBuffer = this.__newsgroups;
        return stringBuffer == null ? null : stringBuffer.toString();
    }

    public String getTime() {
        return this.__time;
    }

    public boolean isGMT() {
        return this.__isGMT;
    }

    public void omitNewsgroup(String str) {
        addNewsgroup("!" + str);
    }
}
