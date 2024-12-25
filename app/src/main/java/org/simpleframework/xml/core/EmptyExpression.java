package org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.Style;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/EmptyExpression.class */
class EmptyExpression implements Expression {
    private final List<String> list = new LinkedList();
    private final Style style;

    public EmptyExpression(Format format) {
        this.style = format.getStyle();
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getAttribute(String str) {
        return this.style.getAttribute(str);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getElement(String str) {
        return this.style.getElement(str);
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getFirst() {
        return null;
    }

    @Override // org.simpleframework.xml.core.Expression
    public int getIndex() {
        return 0;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getLast() {
        return null;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getPath() {
        return "";
    }

    @Override // org.simpleframework.xml.core.Expression
    public Expression getPath(int i10) {
        return null;
    }

    @Override // org.simpleframework.xml.core.Expression
    public Expression getPath(int i10, int i11) {
        return null;
    }

    @Override // org.simpleframework.xml.core.Expression
    public String getPrefix() {
        return null;
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isAttribute() {
        return false;
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isEmpty() {
        return true;
    }

    @Override // org.simpleframework.xml.core.Expression
    public boolean isPath() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.list.iterator();
    }
}
