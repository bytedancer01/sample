package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/Elements.class */
public class Elements extends ArrayList<Element> {
    public Elements() {
    }

    public Elements(int i10) {
        super(i10);
    }

    public Elements(Collection<Element> collection) {
        super(collection);
    }

    public Elements(List<Element> list) {
        super(list);
    }

    public Elements(Element... elementArr) {
        super(Arrays.asList(elementArr));
    }

    public Elements addClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().addClass(str);
        }
        return this;
    }

    public Elements after(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().after(str);
        }
        return this;
    }

    public Elements append(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().append(str);
        }
        return this;
    }

    public String attr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next.hasAttr(str)) {
                return next.attr(str);
            }
        }
        return "";
    }

    public Elements attr(String str, String str2) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().attr(str, str2);
        }
        return this;
    }

    public Elements before(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().before(str);
        }
        return this;
    }

    @Override // java.util.ArrayList
    public Elements clone() {
        Elements elements = new Elements(size());
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            elements.add(it.next().mo45454clone());
        }
        return elements;
    }

    public Elements empty() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().empty();
        }
        return this;
    }

    /* renamed from: eq */
    public Elements m32154eq(int i10) {
        return size() > i10 ? new Elements(get(i10)) : new Elements();
    }

    public Element first() {
        return isEmpty() ? null : get(0);
    }

    public List<FormElement> forms() {
        ArrayList arrayList = new ArrayList();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (next instanceof FormElement) {
                arrayList.add((FormElement) next);
            }
        }
        return arrayList;
    }

    public boolean hasAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasAttr(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasClass(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            if (it.next().hasText()) {
                return true;
            }
        }
        return false;
    }

    public String html() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(next.html());
        }
        return sb2.toString();
    }

    public Elements html(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().html(str);
        }
        return this;
    }

    /* renamed from: is */
    public boolean m32155is(String str) {
        return !select(str).isEmpty();
    }

    public Element last() {
        return isEmpty() ? null : get(size() - 1);
    }

    public Elements not(String str) {
        return Selector.filterOut(this, Selector.select(str, this));
    }

    public String outerHtml() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(next.outerHtml());
        }
        return sb2.toString();
    }

    public Elements parents() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().parents());
        }
        return new Elements(linkedHashSet);
    }

    public Elements prepend(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().prepend(str);
        }
        return this;
    }

    public Elements remove() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        return this;
    }

    public Elements removeAttr(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeAttr(str);
        }
        return this;
    }

    public Elements removeClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().removeClass(str);
        }
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements tagName(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().tagName(str);
        }
        return this;
    }

    public String text() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            Element next = it.next();
            if (sb2.length() != 0) {
                sb2.append(" ");
            }
            sb2.append(next.text());
        }
        return sb2.toString();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return outerHtml();
    }

    public Elements toggleClass(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().toggleClass(str);
        }
        return this;
    }

    public Elements traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        NodeTraversor nodeTraversor = new NodeTraversor(nodeVisitor);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            nodeTraversor.traverse(it.next());
        }
        return this;
    }

    public Elements unwrap() {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().unwrap();
        }
        return this;
    }

    public String val() {
        return size() > 0 ? first().val() : "";
    }

    public Elements val(String str) {
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().val(str);
        }
        return this;
    }

    public Elements wrap(String str) {
        Validate.notEmpty(str);
        Iterator<Element> it = iterator();
        while (it.hasNext()) {
            it.next().wrap(str);
        }
        return this;
    }
}
