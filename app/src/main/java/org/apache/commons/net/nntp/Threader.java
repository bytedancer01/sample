package org.apache.commons.net.nntp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/nntp/Threader.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/nntp/Threader.class */
public class Threader {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        if (r10.findChild(r5) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void buildContainer(org.apache.commons.net.nntp.Threadable r5, java.util.HashMap<java.lang.String, org.apache.commons.net.nntp.ThreadContainer> r6) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.Threader.buildContainer(org.apache.commons.net.nntp.Threadable, java.util.HashMap):void");
    }

    private ThreadContainer findRootSet(HashMap<String, ThreadContainer> hashMap) {
        ThreadContainer threadContainer = new ThreadContainer();
        Iterator<Map.Entry<String, ThreadContainer>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ThreadContainer value = it.next().getValue();
            if (value.parent == null) {
                if (value.next != null) {
                    throw new RuntimeException("c.next is " + value.next.toString());
                }
                value.next = threadContainer.child;
                threadContainer.child = value;
            }
        }
        return threadContainer;
    }

    private void gatherSubjects(ThreadContainer threadContainer) {
        ThreadContainer threadContainer2;
        Threadable threadable;
        ThreadContainer threadContainer3;
        int i10 = 0;
        int i11 = 0;
        for (ThreadContainer threadContainer4 = threadContainer.child; threadContainer4 != null; threadContainer4 = threadContainer4.next) {
            i11++;
        }
        HashMap hashMap = new HashMap((int) (i11 * 1.2d), 0.9f);
        ThreadContainer threadContainer5 = threadContainer.child;
        while (threadContainer5 != null) {
            Threadable threadable2 = threadContainer5.threadable;
            Threadable threadable3 = threadable2;
            if (threadable2 == null) {
                threadable3 = threadContainer5.child.threadable;
            }
            String simplifiedSubject = threadable3.simplifiedSubject();
            int i12 = i10;
            if (simplifiedSubject != null) {
                if (simplifiedSubject.length() == 0) {
                    i12 = i10;
                } else {
                    ThreadContainer threadContainer6 = (ThreadContainer) hashMap.get(simplifiedSubject);
                    if (threadContainer6 != null && (threadContainer5.threadable != null || threadContainer6.threadable == null)) {
                        Threadable threadable4 = threadContainer6.threadable;
                        i12 = i10;
                        if (threadable4 != null) {
                            i12 = i10;
                            if (threadable4.subjectIsReply()) {
                                Threadable threadable5 = threadContainer5.threadable;
                                i12 = i10;
                                if (threadable5 != null) {
                                    i12 = i10;
                                    if (threadable5.subjectIsReply()) {
                                    }
                                }
                            }
                        }
                    }
                    hashMap.put(simplifiedSubject, threadContainer5);
                    i12 = i10 + 1;
                }
            }
            threadContainer5 = threadContainer5.next;
            i10 = i12;
        }
        if (i10 == 0) {
            return;
        }
        ThreadContainer threadContainer7 = threadContainer.child;
        ThreadContainer threadContainer8 = threadContainer7.next;
        ThreadContainer threadContainer9 = null;
        while (threadContainer7 != null) {
            Threadable threadable6 = threadContainer7.threadable;
            Threadable threadable7 = threadable6;
            if (threadable6 == null) {
                threadable7 = threadContainer7.child.threadable;
            }
            String simplifiedSubject2 = threadable7.simplifiedSubject();
            if (simplifiedSubject2 == null || simplifiedSubject2.length() == 0 || (threadContainer2 = (ThreadContainer) hashMap.get(simplifiedSubject2)) == threadContainer7) {
                threadContainer9 = threadContainer7;
            } else {
                ThreadContainer threadContainer10 = threadContainer7.next;
                if (threadContainer9 == null) {
                    threadContainer.child = threadContainer10;
                } else {
                    threadContainer9.next = threadContainer10;
                }
                threadContainer7.next = null;
                Threadable threadable8 = threadContainer2.threadable;
                if (threadable8 == null && threadContainer7.threadable == null) {
                    ThreadContainer threadContainer11 = threadContainer2.child;
                    while (true) {
                        threadContainer3 = threadContainer11;
                        if (threadContainer3 == null) {
                            break;
                        }
                        ThreadContainer threadContainer12 = threadContainer3.next;
                        if (threadContainer12 == null) {
                            break;
                        } else {
                            threadContainer11 = threadContainer12;
                        }
                    }
                    if (threadContainer3 != null) {
                        threadContainer3.next = threadContainer7.child;
                    }
                    ThreadContainer threadContainer13 = threadContainer7.child;
                    while (true) {
                        ThreadContainer threadContainer14 = threadContainer13;
                        if (threadContainer14 == null) {
                            break;
                        }
                        threadContainer14.parent = threadContainer2;
                        threadContainer13 = threadContainer14.next;
                    }
                    threadContainer7.child = null;
                } else if (threadable8 == null || !((threadable = threadContainer7.threadable) == null || !threadable.subjectIsReply() || threadContainer2.threadable.subjectIsReply())) {
                    threadContainer7.parent = threadContainer2;
                    threadContainer7.next = threadContainer2.child;
                    threadContainer2.child = threadContainer7;
                } else {
                    ThreadContainer threadContainer15 = new ThreadContainer();
                    threadContainer15.threadable = threadContainer2.threadable;
                    ThreadContainer threadContainer16 = threadContainer2.child;
                    threadContainer15.child = threadContainer16;
                    while (threadContainer16 != null) {
                        threadContainer16.parent = threadContainer15;
                        threadContainer16 = threadContainer16.next;
                    }
                    threadContainer2.threadable = null;
                    threadContainer7.parent = threadContainer2;
                    threadContainer15.parent = threadContainer2;
                    threadContainer2.child = threadContainer7;
                    threadContainer7.next = threadContainer15;
                }
            }
            threadContainer7 = threadContainer8;
            threadContainer8 = threadContainer8 == null ? null : threadContainer8.next;
        }
        hashMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pruneEmptyContainers(org.apache.commons.net.nntp.ThreadContainer r4) {
        /*
            r3 = this;
            r0 = r4
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.child
            r7 = r0
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            r5 = r0
            r0 = 0
            r6 = r0
        Le:
            r0 = r7
            if (r0 == 0) goto Ld5
            r0 = r7
            org.apache.commons.net.nntp.Threadable r0 = r0.threadable
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L44
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.child
            if (r0 != 0) goto L44
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L3b
            r0 = r4
            r1 = r7
            r0.child = r1
            goto Lbf
        L3b:
            r0 = r6
            r1 = r7
            r0.next = r1
            goto Lbf
        L44:
            r0 = r8
            if (r0 != 0) goto Lae
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.child
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lae
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.parent
            if (r0 != 0) goto L65
            r0 = r8
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            if (r0 != 0) goto Lae
        L65:
            r0 = r6
            if (r0 != 0) goto L72
            r0 = r4
            r1 = r8
            r0.child = r1
            goto L78
        L72:
            r0 = r6
            r1 = r8
            r0.next = r1
        L78:
            r0 = r8
            r5 = r0
        L7b:
            r0 = r5
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L95
            r0 = r5
            r1 = r7
            org.apache.commons.net.nntp.ThreadContainer r1 = r1.parent
            r0.parent = r1
            r0 = r9
            r5 = r0
            goto L7b
        L95:
            r0 = r5
            r1 = r7
            org.apache.commons.net.nntp.ThreadContainer r1 = r1.parent
            r0.parent = r1
            r0 = r5
            r1 = r7
            org.apache.commons.net.nntp.ThreadContainer r1 = r1.next
            r0.next = r1
            r0 = r8
            r7 = r0
            goto Lc2
        Lae:
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.child
            if (r0 == 0) goto Lbc
            r0 = r3
            r1 = r7
            r0.pruneEmptyContainers(r1)
        Lbc:
            r0 = r7
            r6 = r0
        Lbf:
            r0 = r5
            r7 = r0
        Lc2:
            r0 = r7
            if (r0 != 0) goto Lcc
            r0 = 0
            r5 = r0
            goto Le
        Lcc:
            r0 = r7
            org.apache.commons.net.nntp.ThreadContainer r0 = r0.next
            r5 = r0
            goto Le
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.Threader.pruneEmptyContainers(org.apache.commons.net.nntp.ThreadContainer):void");
    }

    public Threadable thread(Iterable<? extends Threadable> iterable) {
        if (iterable == null) {
            return null;
        }
        HashMap<String, ThreadContainer> hashMap = new HashMap<>();
        for (Threadable threadable : iterable) {
            if (!threadable.isDummy()) {
                buildContainer(threadable, hashMap);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ThreadContainer findRootSet = findRootSet(hashMap);
        hashMap.clear();
        pruneEmptyContainers(findRootSet);
        findRootSet.reverseChildren();
        gatherSubjects(findRootSet);
        if (findRootSet.next != null) {
            throw new RuntimeException("root node has a next:" + findRootSet);
        }
        ThreadContainer threadContainer = findRootSet.child;
        while (true) {
            ThreadContainer threadContainer2 = threadContainer;
            if (threadContainer2 == null) {
                break;
            }
            if (threadContainer2.threadable == null) {
                threadContainer2.threadable = threadContainer2.child.threadable.makeDummy();
            }
            threadContainer = threadContainer2.next;
        }
        ThreadContainer threadContainer3 = findRootSet.child;
        Threadable threadable2 = threadContainer3 == null ? null : threadContainer3.threadable;
        findRootSet.flush();
        return threadable2;
    }

    public Threadable thread(List<? extends Threadable> list) {
        return thread((Iterable<? extends Threadable>) list);
    }

    @Deprecated
    public Threadable thread(Threadable[] threadableArr) {
        if (threadableArr == null) {
            return null;
        }
        return thread(Arrays.asList(threadableArr));
    }
}
