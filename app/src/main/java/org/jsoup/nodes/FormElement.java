package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/FormElement.class */
public class FormElement extends Element {
    private final Elements elements;

    public FormElement(Tag tag, String str, Attributes attributes) {
        super(tag, str, attributes);
        this.elements = new Elements();
    }

    public FormElement addElement(Element element) {
        this.elements.add(element);
        return this;
    }

    public Elements elements() {
        return this.elements;
    }

    public List<Connection.KeyVal> formData() {
        Element first;
        String val;
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = this.elements.iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.tag().isFormSubmittable() && !next.hasAttr("disabled")) {
                String attr = next.attr("name");
                if (attr.length() != 0) {
                    String attr2 = next.attr("type");
                    if ("select".equals(next.tagName())) {
                        boolean z10 = false;
                        Iterator<Element> it2 = next.select("option[selected]").iterator();
                        while (it2.hasNext()) {
                            arrayList.add(HttpConnection.KeyVal.create(attr, it2.next().val()));
                            z10 = true;
                        }
                        if (!z10) {
                            first = next.select("option").first();
                            if (first != null) {
                            }
                        }
                    } else {
                        if (!"checkbox".equalsIgnoreCase(attr2)) {
                            first = next;
                            val = "radio".equalsIgnoreCase(attr2) ? "on" : first.val();
                        }
                        if (next.hasAttr("checked")) {
                            if (next.val().length() > 0) {
                                first = next;
                            }
                        }
                    }
                    arrayList.add(HttpConnection.KeyVal.create(attr, val));
                }
            }
        }
        return arrayList;
    }

    public Connection submit() {
        String absUrl = hasAttr("action") ? absUrl("action") : baseUri();
        Validate.notEmpty(absUrl, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        return Jsoup.connect(absUrl).data(formData()).method(attr("method").toUpperCase().equals("POST") ? Connection.Method.POST : Connection.Method.GET);
    }
}
