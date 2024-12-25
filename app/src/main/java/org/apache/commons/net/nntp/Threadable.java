package org.apache.commons.net.nntp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/Threadable.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/Threadable.class */
public interface Threadable {
    boolean isDummy();

    Threadable makeDummy();

    String messageThreadId();

    String[] messageThreadReferences();

    void setChild(Threadable threadable);

    void setNext(Threadable threadable);

    String simplifiedSubject();

    boolean subjectIsReply();
}
