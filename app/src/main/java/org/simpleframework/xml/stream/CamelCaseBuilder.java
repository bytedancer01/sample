package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/CamelCaseBuilder.class */
class CamelCaseBuilder implements Style {
    public final boolean attribute;
    public final boolean element;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/CamelCaseBuilder$Attribute.class */
    public class Attribute extends Splitter {
        private boolean capital;
        public final CamelCaseBuilder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Attribute(CamelCaseBuilder camelCaseBuilder, String str) {
            super(str);
            this.this$0 = camelCaseBuilder;
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void commit(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
        }

        @Override // org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i10, int i11) {
            if (this.this$0.attribute || this.capital) {
                cArr[i10] = toUpper(cArr[i10]);
            }
            this.capital = true;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/CamelCaseBuilder$Element.class */
    public class Element extends Attribute {
        private boolean capital;
        public final CamelCaseBuilder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Element(CamelCaseBuilder camelCaseBuilder, String str) {
            super(str);
            this.this$0 = camelCaseBuilder;
        }

        @Override // org.simpleframework.xml.stream.CamelCaseBuilder.Attribute, org.simpleframework.xml.stream.Splitter
        public void parse(char[] cArr, int i10, int i11) {
            if (this.this$0.element || this.capital) {
                cArr[i10] = toUpper(cArr[i10]);
            }
            this.capital = true;
        }
    }

    public CamelCaseBuilder(boolean z10, boolean z11) {
        this.attribute = z11;
        this.element = z10;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Attribute(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Element(str).process();
        }
        return null;
    }
}
