package org.jsoup.nodes;

import java.util.Arrays;
import java.util.Map;
import org.apache.http.client.config.CookieSpecs;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Attribute.class */
public class Attribute implements Map.Entry<String, String>, Cloneable {
    private static final String[] booleanAttributes = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", CookieSpecs.DEFAULT, "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String key;
    private String value;

    public Attribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notNull(str2);
        this.key = str.trim().toLowerCase();
        this.value = str2;
    }

    public static Attribute createFromEncoded(String str, String str2) {
        return new Attribute(str, Entities.unescape(str2, true));
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.key;
        if (str != null) {
            if (!str.equals(attribute.key)) {
                return false;
            }
        } else if (attribute.key != null) {
            return false;
        }
        String str2 = this.value;
        String str3 = attribute.value;
        if (str2 == null ? str3 != null : !str2.equals(str3)) {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public String getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.key;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.value;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return (hashCode * 31) + i10;
    }

    public String html() {
        StringBuilder sb2 = new StringBuilder();
        html(sb2, new Document("").outputSettings());
        return sb2.toString();
    }

    public void html(StringBuilder sb2, Document.OutputSettings outputSettings) {
        sb2.append(this.key);
        if (shouldCollapseAttribute(outputSettings)) {
            return;
        }
        sb2.append("=\"");
        Entities.escape(sb2, this.value, outputSettings, true, false, false);
        sb2.append('\"');
    }

    public boolean isBooleanAttribute() {
        return Arrays.binarySearch(booleanAttributes, this.key) >= 0;
    }

    public boolean isDataAttribute() {
        return this.key.startsWith(Attributes.dataPrefix) && this.key.length() > 5;
    }

    public void setKey(String str) {
        Validate.notEmpty(str);
        this.key = str.trim().toLowerCase();
    }

    @Override // java.util.Map.Entry
    public String setValue(String str) {
        Validate.notNull(str);
        String str2 = this.value;
        this.value = str;
        return str2;
    }

    public final boolean shouldCollapseAttribute(Document.OutputSettings outputSettings) {
        return ("".equals(this.value) || this.value.equalsIgnoreCase(this.key)) && outputSettings.syntax() == Document.OutputSettings.Syntax.html && isBooleanAttribute();
    }

    public String toString() {
        return html();
    }
}
