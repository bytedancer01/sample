package org.minidns.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import org.minidns.dnsname.DnsName;
import org.minidns.record.SRV;

/* loaded from: combined.jar:classes3.jar:org/minidns/util/SrvUtil.class */
public class SrvUtil {
    private static int bisect(int[] iArr, double d10) {
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length && d10 >= iArr[i11]; i11++) {
            i10++;
        }
        return i10;
    }

    public static List<SRV> sortSrvRecords(Collection<SRV> collection) {
        int i10;
        int i11;
        if (collection.size() == 1 && collection.iterator().next().target.equals(DnsName.ROOT)) {
            return Collections.emptyList();
        }
        TreeMap treeMap = new TreeMap();
        for (SRV srv : collection) {
            Integer valueOf = Integer.valueOf(srv.priority);
            List list = (List) treeMap.get(valueOf);
            List list2 = list;
            if (list == null) {
                list2 = new LinkedList();
                treeMap.put(valueOf, list2);
            }
            list2.add(srv);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list3 : treeMap.values()) {
            while (true) {
                int size = list3.size();
                if (size > 0) {
                    int[] iArr = new int[size];
                    Iterator it = list3.iterator();
                    while (true) {
                        i10 = 0;
                        if (!it.hasNext()) {
                            i11 = 1;
                            break;
                        }
                        if (((SRV) it.next()).weight > 0) {
                            i11 = 0;
                            break;
                        }
                    }
                    Iterator it2 = list3.iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        i10 += ((SRV) it2.next()).weight + i11;
                        iArr[i12] = i10;
                        i12++;
                    }
                    arrayList.add((SRV) list3.remove(i10 == 0 ? (int) (Math.random() * size) : bisect(iArr, Math.random() * i10)));
                }
            }
        }
        return arrayList;
    }
}
