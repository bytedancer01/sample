package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.Element;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator.class */
abstract class StructuralEvaluator extends Evaluator {
    public Evaluator evaluator;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$Has.class */
    public static class Has extends StructuralEvaluator {
        public Has(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Iterator<Element> it = element2.getAllElements().iterator();
            while (it.hasNext()) {
                Element next = it.next();
                if (next != element2 && this.evaluator.matches(element, next)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$ImmediateParent.class */
    public static class ImmediateParent extends StructuralEvaluator {
        public ImmediateParent(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            Element parent = element2.parent();
            boolean z10 = false;
            if (parent != null) {
                z10 = false;
                if (this.evaluator.matches(element, parent)) {
                    z10 = true;
                }
            }
            return z10;
        }

        public String toString() {
            return String.format(":ImmediateParent%s", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$ImmediatePreviousSibling.class */
    public static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            if (element == element2) {
                return false;
            }
            Element previousElementSibling = element2.previousElementSibling();
            boolean z10 = false;
            if (previousElementSibling != null) {
                z10 = false;
                if (this.evaluator.matches(element, previousElementSibling)) {
                    z10 = true;
                }
            }
            return z10;
        }

        public String toString() {
            return String.format(":prev%s", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$Not.class */
    public static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return !this.evaluator.matches(element, element2);
        }

        public String toString() {
            return String.format(":not%s", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$Parent.class */
    public static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent;
            Element element3 = element2;
            if (element == element2) {
                return false;
            }
            do {
                parent = element3.parent();
                if (parent == element) {
                    return false;
                }
                element3 = parent;
            } while (!this.evaluator.matches(element, parent));
            return true;
        }

        public String toString() {
            return String.format(":parent%s", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$PreviousSibling.class */
    public static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {
            this.evaluator = evaluator;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element previousElementSibling;
            Element element3 = element2;
            if (element == element2) {
                return false;
            }
            do {
                previousElementSibling = element3.previousElementSibling();
                if (previousElementSibling == null) {
                    return false;
                }
                element3 = previousElementSibling;
            } while (!this.evaluator.matches(element, previousElementSibling));
            return true;
        }

        public String toString() {
            return String.format(":prev*%s", this.evaluator);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/StructuralEvaluator$Root.class */
    public static class Root extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element == element2;
        }
    }
}
