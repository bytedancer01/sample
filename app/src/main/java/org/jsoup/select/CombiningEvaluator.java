package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/CombiningEvaluator.class */
abstract class CombiningEvaluator extends Evaluator {
    public final ArrayList<Evaluator> evaluators;
    public int num;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/CombiningEvaluator$And.class */
    public static final class And extends CombiningEvaluator {
        public And(Collection<Evaluator> collection) {
            super(collection);
        }

        public And(Evaluator... evaluatorArr) {
            this(Arrays.asList(evaluatorArr));
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            for (int i10 = 0; i10 < this.num; i10++) {
                if (!this.evaluators.get(i10).matches(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return StringUtil.join(this.evaluators, " ");
        }
    }

    /* renamed from: org.jsoup.select.CombiningEvaluator$Or */
    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/CombiningEvaluator$Or.class */
    public static final class C7177Or extends CombiningEvaluator {
        public C7177Or() {
        }

        public C7177Or(Collection<Evaluator> collection) {
            if (this.num > 1) {
                this.evaluators.add(new And(collection));
            } else {
                this.evaluators.addAll(collection);
            }
            updateNumEvaluators();
        }

        public void add(Evaluator evaluator) {
            this.evaluators.add(evaluator);
            updateNumEvaluators();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            for (int i10 = 0; i10 < this.num; i10++) {
                if (this.evaluators.get(i10).matches(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":or%s", this.evaluators);
        }
    }

    public CombiningEvaluator() {
        this.num = 0;
        this.evaluators = new ArrayList<>();
    }

    public CombiningEvaluator(Collection<Evaluator> collection) {
        this();
        this.evaluators.addAll(collection);
        updateNumEvaluators();
    }

    public void replaceRightMostEvaluator(Evaluator evaluator) {
        this.evaluators.set(this.num - 1, evaluator);
    }

    public Evaluator rightMostEvaluator() {
        int i10 = this.num;
        return i10 > 0 ? this.evaluators.get(i10 - 1) : null;
    }

    public void updateNumEvaluators() {
        this.num = this.evaluators.size();
    }
}
