package org.minidns.util;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/CollectionsUtil.class */
public class CollectionsUtil {
    public static <T> T getRandomFrom(Set<T> set, Random random) {
        int nextInt = random.nextInt(set.size());
        Iterator<T> it = set.iterator();
        for (int i10 = 0; i10 < nextInt && it.hasNext(); i10++) {
            it.next();
        }
        return it.next();
    }
}
