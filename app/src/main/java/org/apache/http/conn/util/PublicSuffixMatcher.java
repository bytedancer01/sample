package org.apache.http.conn.util;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.net.IDN;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/conn/util/PublicSuffixMatcher.class
 */
@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes1.jar:org/apache/http/conn/util/PublicSuffixMatcher.class */
public final class PublicSuffixMatcher {
    private final Map<String, DomainType> exceptions;
    private final Map<String, DomainType> rules;

    public PublicSuffixMatcher(Collection<PublicSuffixList> collection) {
        Args.notNull(collection, "Domain suffix lists");
        this.rules = new ConcurrentHashMap();
        this.exceptions = new ConcurrentHashMap();
        for (PublicSuffixList publicSuffixList : collection) {
            DomainType type = publicSuffixList.getType();
            Iterator<String> it = publicSuffixList.getRules().iterator();
            while (it.hasNext()) {
                this.rules.put(it.next(), type);
            }
            List<String> exceptions = publicSuffixList.getExceptions();
            if (exceptions != null) {
                Iterator<String> it2 = exceptions.iterator();
                while (it2.hasNext()) {
                    this.exceptions.put(it2.next(), type);
                }
            }
        }
    }

    public PublicSuffixMatcher(Collection<String> collection, Collection<String> collection2) {
        this(DomainType.UNKNOWN, collection, collection2);
    }

    public PublicSuffixMatcher(DomainType domainType, Collection<String> collection, Collection<String> collection2) {
        Args.notNull(domainType, "Domain type");
        Args.notNull(collection, "Domain suffix rules");
        this.rules = new ConcurrentHashMap(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            this.rules.put(it.next(), domainType);
        }
        this.exceptions = new ConcurrentHashMap();
        if (collection2 != null) {
            Iterator<String> it2 = collection2.iterator();
            while (it2.hasNext()) {
                this.exceptions.put(it2.next(), domainType);
            }
        }
    }

    private static boolean hasEntry(Map<String, DomainType> map, String str, DomainType domainType) {
        DomainType domainType2;
        boolean z10 = false;
        if (map == null || (domainType2 = map.get(str)) == null) {
            return false;
        }
        if (domainType == null || domainType2.equals(domainType)) {
            z10 = true;
        }
        return z10;
    }

    private boolean hasException(String str, DomainType domainType) {
        return hasEntry(this.exceptions, str, domainType);
    }

    private boolean hasRule(String str, DomainType domainType) {
        return hasEntry(this.rules, str, domainType);
    }

    public String getDomainRoot(String str) {
        return getDomainRoot(str, null);
    }

    public String getDomainRoot(String str, DomainType domainType) {
        if (str == null || str.startsWith(InstructionFileId.DOT)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str2 = null;
        while (lowerCase != null) {
            if (!hasException(IDN.toUnicode(lowerCase), domainType)) {
                if (hasRule(IDN.toUnicode(lowerCase), domainType)) {
                    break;
                }
                int indexOf = lowerCase.indexOf(46);
                String substring = indexOf != -1 ? lowerCase.substring(indexOf + 1) : null;
                if (substring != null) {
                    if (hasRule("*." + IDN.toUnicode(substring), domainType)) {
                        break;
                    }
                }
                if (indexOf != -1) {
                    str2 = lowerCase;
                }
                lowerCase = substring;
            } else {
                return lowerCase;
            }
        }
        return str2;
    }

    public boolean matches(String str) {
        return matches(str, null);
    }

    public boolean matches(String str, DomainType domainType) {
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        String str2 = str;
        if (str.startsWith(InstructionFileId.DOT)) {
            str2 = str.substring(1);
        }
        if (getDomainRoot(str2, domainType) == null) {
            z10 = true;
        }
        return z10;
    }
}
