package org.jsoup.select;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/Selector.class */
public class Selector {
    private final Evaluator evaluator;
    private final Element root;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Selector$SelectorParseException.class */
    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    private Selector(String str, Element element) {
        Validate.notNull(str);
        String trim = str.trim();
        Validate.notEmpty(trim);
        Validate.notNull(element);
        this.evaluator = QueryParser.parse(trim);
        this.root = element;
    }

    private Selector(Evaluator evaluator, Element element) {
        Validate.notNull(evaluator);
        Validate.notNull(element);
        this.evaluator = evaluator;
        this.root = element;
    }

    public static Elements filterOut(Collection<Element> collection, Collection<Element> collection2) {
        boolean z10;
        Elements elements = new Elements();
        for (Element element : collection) {
            Iterator<Element> it = collection2.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                if (element.equals(it.next())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                elements.add(element);
            }
        }
        return elements;
    }

    private Elements select() {
        return Collector.collect(this.evaluator, this.root);
    }

    public static Elements select(String str, Iterable<Element> iterable) {
        Validate.notEmpty(str);
        Validate.notNull(iterable);
        Evaluator parse = QueryParser.parse(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Element> it = iterable.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(select(parse, it.next()));
        }
        return new Elements(linkedHashSet);
    }

    public static Elements select(String str, Element element) {
        return new Selector(str, element).select();
    }

    public static Elements select(Evaluator evaluator, Element element) {
        return new Selector(evaluator, element).select();
    }
}
