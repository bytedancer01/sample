package org.simpleframework.xml.core;

import java.util.List;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/SignatureCreator.class */
class SignatureCreator implements Creator {
    private final List<Parameter> list;
    private final Signature signature;
    private final Class type;

    public SignatureCreator(Signature signature) {
        this.type = signature.getType();
        this.list = signature.getAll();
        this.signature = signature;
    }

    private double getAdjustment(double d10) {
        return d10 > 0.0d ? (this.list.size() / 1000.0d) + (d10 / this.list.size()) : d10 / this.list.size();
    }

    private double getPercentage(Criteria criteria) {
        double d10 = 0.0d;
        for (Parameter parameter : this.list) {
            if (criteria.get(parameter.getKey()) != null) {
                d10 += 1.0d;
            } else if (parameter.isRequired() || parameter.isPrimitive()) {
                return -1.0d;
            }
        }
        return getAdjustment(d10);
    }

    private Object getVariable(Criteria criteria, int i10) {
        Variable remove = criteria.remove(this.list.get(i10).getKey());
        if (remove != null) {
            return remove.getValue();
        }
        return null;
    }

    @Override // org.simpleframework.xml.core.Creator
    public Object getInstance() {
        return this.signature.create();
    }

    @Override // org.simpleframework.xml.core.Creator
    public Object getInstance(Criteria criteria) {
        Object[] array = this.list.toArray();
        for (int i10 = 0; i10 < this.list.size(); i10++) {
            array[i10] = getVariable(criteria, i10);
        }
        return this.signature.create(array);
    }

    @Override // org.simpleframework.xml.core.Creator
    public double getScore(Criteria criteria) {
        Signature copy = this.signature.copy();
        for (Object obj : criteria) {
            Parameter parameter = copy.get(obj);
            Variable variable = criteria.get(obj);
            Contact contact = variable.getContact();
            if (parameter != null && !Support.isAssignable(variable.getValue().getClass(), parameter.getType())) {
                return -1.0d;
            }
            if (contact.isReadOnly() && parameter == null) {
                return -1.0d;
            }
        }
        return getPercentage(criteria);
    }

    @Override // org.simpleframework.xml.core.Creator
    public Signature getSignature() {
        return this.signature;
    }

    @Override // org.simpleframework.xml.core.Creator
    public Class getType() {
        return this.type;
    }

    public String toString() {
        return this.signature.toString();
    }
}
