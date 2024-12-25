package org.apache.commons.net.nntp;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/ThreadContainer.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/ThreadContainer.class */
class ThreadContainer {
    public ThreadContainer child;
    public ThreadContainer next;
    public ThreadContainer parent;
    public Threadable threadable;

    public boolean findChild(ThreadContainer threadContainer) {
        ThreadContainer threadContainer2 = this.child;
        if (threadContainer2 == null) {
            return false;
        }
        if (threadContainer2 == threadContainer) {
            return true;
        }
        return threadContainer2.findChild(threadContainer);
    }

    public void flush() {
        if (this.parent != null && this.threadable == null) {
            throw new RuntimeException("no threadable in " + toString());
        }
        this.parent = null;
        Threadable threadable = this.threadable;
        if (threadable != null) {
            ThreadContainer threadContainer = this.child;
            threadable.setChild(threadContainer == null ? null : threadContainer.threadable);
        }
        ThreadContainer threadContainer2 = this.child;
        if (threadContainer2 != null) {
            threadContainer2.flush();
            this.child = null;
        }
        Threadable threadable2 = this.threadable;
        if (threadable2 != null) {
            ThreadContainer threadContainer3 = this.next;
            threadable2.setNext(threadContainer3 == null ? null : threadContainer3.threadable);
        }
        ThreadContainer threadContainer4 = this.next;
        if (threadContainer4 != null) {
            threadContainer4.flush();
            this.next = null;
        }
        this.threadable = null;
    }

    public void reverseChildren() {
        ThreadContainer threadContainer;
        ThreadContainer threadContainer2 = this.child;
        if (threadContainer2 != null) {
            ThreadContainer threadContainer3 = threadContainer2.next;
            ThreadContainer threadContainer4 = null;
            while (true) {
                threadContainer = threadContainer4;
                if (threadContainer2 == null) {
                    break;
                }
                threadContainer2.next = threadContainer;
                ThreadContainer threadContainer5 = threadContainer2;
                threadContainer2 = threadContainer3;
                threadContainer3 = threadContainer3 == null ? null : threadContainer3.next;
                threadContainer4 = threadContainer5;
            }
            this.child = threadContainer;
            while (threadContainer != null) {
                threadContainer.reverseChildren();
                threadContainer = threadContainer.next;
            }
        }
    }
}
