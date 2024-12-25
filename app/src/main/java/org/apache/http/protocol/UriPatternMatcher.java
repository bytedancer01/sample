package org.apache.http.protocol;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.slf4j.Marker;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/UriPatternMatcher.class */
public class UriPatternMatcher<T> {
    private final Map<String, T> map = new HashMap();

    public Set<Map.Entry<String, T>> entrySet() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.map.entrySet());
        }
        return hashSet;
    }

    @Deprecated
    public Map<String, T> getObjects() {
        Map<String, T> map;
        synchronized (this) {
            map = this.map;
        }
        return map;
    }

    public T lookup(String str) {
        T t10;
        synchronized (this) {
            Args.notNull(str, "Request path");
            T t11 = this.map.get(str);
            t10 = t11;
            if (t11 == null) {
                String str2 = null;
                Iterator<String> it = this.map.keySet().iterator();
                while (true) {
                    t10 = t11;
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (matchUriRequestPattern(next, str) && (str2 == null || str2.length() < next.length() || (str2.length() == next.length() && next.endsWith(Marker.ANY_MARKER)))) {
                        t11 = this.map.get(next);
                        str2 = next;
                    }
                }
            }
        }
        return t10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r8.startsWith(r7.substring(0, r7.length() - 1)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean matchUriRequestPattern(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = r7
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r7
            java.lang.String r1 = "*"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2e
            r0 = r10
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 0
            r3 = r7
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L4f
        L2e:
            r0 = r7
            java.lang.String r1 = "*"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4d
            r0 = r8
            r1 = r7
            r2 = 1
            r3 = r7
            int r3 = r3.length()
            java.lang.String r1 = r1.substring(r2, r3)
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L4d
            r0 = r10
            r9 = r0
            goto L4f
        L4d:
            r0 = 0
            r9 = r0
        L4f:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.UriPatternMatcher.matchUriRequestPattern(java.lang.String, java.lang.String):boolean");
    }

    public void register(String str, T t10) {
        synchronized (this) {
            Args.notNull(str, "URI request pattern");
            this.map.put(str, t10);
        }
    }

    @Deprecated
    public void setHandlers(Map<String, T> map) {
        synchronized (this) {
            Args.notNull(map, "Map of handlers");
            this.map.clear();
            this.map.putAll(map);
        }
    }

    @Deprecated
    public void setObjects(Map<String, T> map) {
        synchronized (this) {
            Args.notNull(map, "Map of handlers");
            this.map.clear();
            this.map.putAll(map);
        }
    }

    public String toString() {
        return this.map.toString();
    }

    public void unregister(String str) {
        synchronized (this) {
            if (str == null) {
                return;
            }
            this.map.remove(str);
        }
    }
}
