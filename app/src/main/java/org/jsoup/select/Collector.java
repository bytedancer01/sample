package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/Collector.class */
public class Collector {

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Collector$Accumulator.class */
    public static class Accumulator implements NodeVisitor {
        private final Elements elements;
        private final Evaluator eval;
        private final Element root;

        public Accumulator(Element element, Elements elements, Evaluator evaluator) {
            this.root = element;
            this.elements = elements;
            this.eval = evaluator;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i10) {
            if (node instanceof Element) {
                Element element = (Element) node;
                if (this.eval.matches(this.root, element)) {
                    this.elements.add(element);
                }
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i10) {
        }
    }

    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
        Elements elements = new Elements();
        new NodeTraversor(new Accumulator(element, elements, evaluator)).traverse(element);
        return elements;
    }
}
