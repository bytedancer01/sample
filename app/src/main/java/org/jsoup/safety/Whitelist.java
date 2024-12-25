package org.jsoup.safety;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amplifyframework.core.model.ModelIdentifier;
import com.journeyapps.barcodescanner.C2582b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.achartengine.ChartFactory;
import org.apache.http.HttpHost;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import p354ue.AbstractC9172q;

/* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist.class */
public class Whitelist {
    private Set<TagName> tagNames = new HashSet();
    private Map<TagName, Set<AttributeKey>> attributes = new HashMap();
    private Map<TagName, Map<AttributeKey, AttributeValue>> enforcedAttributes = new HashMap();
    private Map<TagName, Map<AttributeKey, Set<Protocol>>> protocols = new HashMap();
    private boolean preserveRelativeLinks = false;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist$AttributeKey.class */
    public static class AttributeKey extends TypedValue {
        public AttributeKey(String str) {
            super(str);
        }

        public static AttributeKey valueOf(String str) {
            return new AttributeKey(str);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist$AttributeValue.class */
    public static class AttributeValue extends TypedValue {
        public AttributeValue(String str) {
            super(str);
        }

        public static AttributeValue valueOf(String str) {
            return new AttributeValue(str);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist$Protocol.class */
    public static class Protocol extends TypedValue {
        public Protocol(String str) {
            super(str);
        }

        public static Protocol valueOf(String str) {
            return new Protocol(str);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist$TagName.class */
    public static class TagName extends TypedValue {
        public TagName(String str) {
            super(str);
        }

        public static TagName valueOf(String str) {
            return new TagName(str);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Whitelist$TypedValue.class */
    public static abstract class TypedValue {
        private String value;

        public TypedValue(String str) {
            Validate.notNull(str);
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            String str = this.value;
            String str2 = ((TypedValue) obj).value;
            return str == null ? str2 == null : str.equals(str2);
        }

        public int hashCode() {
            String str = this.value;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.value;
        }
    }

    public static Whitelist basic() {
        return new Whitelist().addTags("a", C2582b.f15902o, "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em", "i", "li", "ol", "p", "pre", AbstractC9172q.f41940a, "small", "span", "strike", "strong", "sub", "sup", "u", "ul").addAttributes("a", "href").addAttributes("blockquote", "cite").addAttributes(AbstractC9172q.f41940a, "cite").addProtocols("a", "href", "ftp", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME, "mailto").addProtocols("blockquote", "cite", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME).addProtocols("cite", "cite", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME).addEnforcedAttribute("a", "rel", "nofollow");
    }

    public static Whitelist basicWithImages() {
        return basic().addTags("img").addAttributes("img", "align", "alt", "height", "src", ChartFactory.TITLE, "width").addProtocols("img", "src", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME);
    }

    private boolean isValidAnchor(String str) {
        return str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER) && !str.matches(".*\\s.*");
    }

    public static Whitelist none() {
        return new Whitelist();
    }

    public static Whitelist relaxed() {
        return new Whitelist().addTags("a", C2582b.f15902o, "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", AbstractC9172q.f41940a, "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul").addAttributes("a", "href", ChartFactory.TITLE).addAttributes("blockquote", "cite").addAttributes("col", "span", "width").addAttributes("colgroup", "span", "width").addAttributes("img", "align", "alt", "height", "src", ChartFactory.TITLE, "width").addAttributes("ol", "start", "type").addAttributes(AbstractC9172q.f41940a, "cite").addAttributes("table", "summary", "width").addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width").addAttributes("th", "abbr", "axis", "colspan", "rowspan", ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, "width").addAttributes("ul", "type").addProtocols("a", "href", "ftp", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME, "mailto").addProtocols("blockquote", "cite", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME).addProtocols("cite", "cite", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME).addProtocols("img", "src", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME).addProtocols(AbstractC9172q.f41940a, "cite", HttpHost.DEFAULT_SCHEME_NAME, ClientConstants.DOMAIN_SCHEME);
    }

    public static Whitelist simpleText() {
        return new Whitelist().addTags(C2582b.f15902o, "em", "i", "strong", "u");
    }

    private boolean testValidProtocol(Element element, Attribute attribute, Set<Protocol> set) {
        String absUrl = element.absUrl(attribute.getKey());
        String str = absUrl;
        if (absUrl.length() == 0) {
            str = attribute.getValue();
        }
        if (!this.preserveRelativeLinks) {
            attribute.setValue(str);
        }
        Iterator<Protocol> it = set.iterator();
        while (it.hasNext()) {
            String typedValue = it.next().toString();
            if (!typedValue.equals(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
                if (str.toLowerCase().startsWith(typedValue + ":")) {
                    return true;
                }
            } else if (isValidAnchor(str)) {
                return true;
            }
        }
        return false;
    }

    public Whitelist addAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attributes supplied.");
        TagName valueOf = TagName.valueOf(str);
        if (!this.tagNames.contains(valueOf)) {
            this.tagNames.add(valueOf);
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(AttributeKey.valueOf(str2));
        }
        if (this.attributes.containsKey(valueOf)) {
            this.attributes.get(valueOf).addAll(hashSet);
        } else {
            this.attributes.put(valueOf, hashSet);
        }
        return this;
    }

    public Whitelist addEnforcedAttribute(String str, String str2, String str3) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notEmpty(str3);
        TagName valueOf = TagName.valueOf(str);
        if (!this.tagNames.contains(valueOf)) {
            this.tagNames.add(valueOf);
        }
        AttributeKey valueOf2 = AttributeKey.valueOf(str2);
        AttributeValue valueOf3 = AttributeValue.valueOf(str3);
        if (this.enforcedAttributes.containsKey(valueOf)) {
            this.enforcedAttributes.get(valueOf).put(valueOf2, valueOf3);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(valueOf2, valueOf3);
            this.enforcedAttributes.put(valueOf, hashMap);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    public Whitelist addProtocols(String str, String str2, String... strArr) {
        HashMap hashMap;
        HashSet hashSet;
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        TagName valueOf = TagName.valueOf(str);
        AttributeKey valueOf2 = AttributeKey.valueOf(str2);
        if (this.protocols.containsKey(valueOf)) {
            hashMap = (Map) this.protocols.get(valueOf);
        } else {
            hashMap = new HashMap();
            this.protocols.put(valueOf, hashMap);
        }
        if (hashMap.containsKey(valueOf2)) {
            hashSet = (Set) hashMap.get(valueOf2);
        } else {
            HashSet hashSet2 = new HashSet();
            hashMap.put(valueOf2, hashSet2);
            hashSet = hashSet2;
        }
        for (String str3 : strArr) {
            Validate.notEmpty(str3);
            hashSet.add(Protocol.valueOf(str3));
        }
        return this;
    }

    public Whitelist addTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            this.tagNames.add(TagName.valueOf(str));
        }
        return this;
    }

    public Attributes getEnforcedAttributes(String str) {
        Attributes attributes = new Attributes();
        TagName valueOf = TagName.valueOf(str);
        if (this.enforcedAttributes.containsKey(valueOf)) {
            for (Map.Entry<AttributeKey, AttributeValue> entry : this.enforcedAttributes.get(valueOf).entrySet()) {
                attributes.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        return attributes;
    }

    public boolean isSafeAttribute(String str, Element element, Attribute attribute) {
        TagName valueOf = TagName.valueOf(str);
        AttributeKey valueOf2 = AttributeKey.valueOf(attribute.getKey());
        boolean z10 = false;
        if (!this.attributes.containsKey(valueOf) || !this.attributes.get(valueOf).contains(valueOf2)) {
            boolean z11 = false;
            if (!str.equals(":all")) {
                z11 = false;
                if (isSafeAttribute(":all", element, attribute)) {
                    z11 = true;
                }
            }
            return z11;
        }
        if (!this.protocols.containsKey(valueOf)) {
            return true;
        }
        Map<AttributeKey, Set<Protocol>> map = this.protocols.get(valueOf);
        if (!map.containsKey(valueOf2) || testValidProtocol(element, attribute, map.get(valueOf2))) {
            z10 = true;
        }
        return z10;
    }

    public boolean isSafeTag(String str) {
        return this.tagNames.contains(TagName.valueOf(str));
    }

    public Whitelist preserveRelativeLinks(boolean z10) {
        this.preserveRelativeLinks = z10;
        return this;
    }

    public Whitelist removeAttributes(String str, String... strArr) {
        Validate.notEmpty(str);
        Validate.notNull(strArr);
        Validate.isTrue(strArr.length > 0, "No attributes supplied.");
        TagName valueOf = TagName.valueOf(str);
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            Validate.notEmpty(str2);
            hashSet.add(AttributeKey.valueOf(str2));
        }
        if (this.tagNames.contains(valueOf) && this.attributes.containsKey(valueOf)) {
            Set<AttributeKey> set = this.attributes.get(valueOf);
            set.removeAll(hashSet);
            if (set.isEmpty()) {
                this.attributes.remove(valueOf);
            }
        }
        if (str.equals(":all")) {
            for (TagName tagName : this.attributes.keySet()) {
                Set<AttributeKey> set2 = this.attributes.get(tagName);
                set2.removeAll(hashSet);
                if (set2.isEmpty()) {
                    this.attributes.remove(tagName);
                }
            }
        }
        return this;
    }

    public Whitelist removeEnforcedAttribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        TagName valueOf = TagName.valueOf(str);
        if (this.tagNames.contains(valueOf) && this.enforcedAttributes.containsKey(valueOf)) {
            AttributeKey valueOf2 = AttributeKey.valueOf(str2);
            Map<AttributeKey, AttributeValue> map = this.enforcedAttributes.get(valueOf);
            map.remove(valueOf2);
            if (map.isEmpty()) {
                this.enforcedAttributes.remove(valueOf);
            }
        }
        return this;
    }

    public Whitelist removeProtocols(String str, String str2, String... strArr) {
        Validate.notEmpty(str);
        Validate.notEmpty(str2);
        Validate.notNull(strArr);
        TagName valueOf = TagName.valueOf(str);
        AttributeKey valueOf2 = AttributeKey.valueOf(str2);
        if (this.protocols.containsKey(valueOf)) {
            Map<AttributeKey, Set<Protocol>> map = this.protocols.get(valueOf);
            if (map.containsKey(valueOf2)) {
                Set<Protocol> set = map.get(valueOf2);
                for (String str3 : strArr) {
                    Validate.notEmpty(str3);
                    set.remove(Protocol.valueOf(str3));
                }
                if (set.isEmpty()) {
                    map.remove(valueOf2);
                    if (map.isEmpty()) {
                        this.protocols.remove(valueOf);
                    }
                }
            }
        }
        return this;
    }

    public Whitelist removeTags(String... strArr) {
        Validate.notNull(strArr);
        for (String str : strArr) {
            Validate.notEmpty(str);
            TagName valueOf = TagName.valueOf(str);
            if (this.tagNames.remove(valueOf)) {
                this.attributes.remove(valueOf);
                this.enforcedAttributes.remove(valueOf);
                this.protocols.remove(valueOf);
            }
        }
        return this;
    }
}
